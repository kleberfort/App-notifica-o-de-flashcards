package com.seuapp.mensageria.data.data_menu_principal;

import com.seuapp.mensageria.data.data_menu_principal.desenvolvimento_software.GitData;
import com.seuapp.mensageria.data.data_menu_principal.direito.administrativo.PrincipiosAdmExpressoImplicitoData;
import com.seuapp.mensageria.data.data_menu_principal.direito.constitucional.AplicabilidadeHierarquiaNormaData;
import com.seuapp.mensageria.data.data_menu_principal.engenharia_software.ScrumData;
import com.seuapp.mensageria.data.data_menu_principal.engenharia_software.XpData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras.VerbosData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.termos_oracao.TiposSujeitoData;
import com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.constitucional_flashcard.AplicalidadeHierarquiaNormaFlashcard;
import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Secao;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Area;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MenuPrincipalAppData {

    public static List<Area> getAreas() {

        List<Area> areas = new ArrayList<>();


        // =====================================
        // ENGENHARIA DE SOFTWARE
        // =====================================

        List<Disciplina> disciplinasEngenhariaSoftware = new ArrayList<>();

        disciplinasEngenhariaSoftware.add(XpData.getDisciplina());
        disciplinasEngenhariaSoftware.add(ScrumData.getDisciplina());
        areas.add(new Area("Engenharia de Software", disciplinasEngenhariaSoftware));


        // =====================================
        // DESENVOLVIMENTO DE SOFTWARE
        // =====================================

        List<Disciplina> disciplinasDesenvSoftware = new ArrayList<>();
        disciplinasDesenvSoftware.add(GitData.getDisciplina());
        areas.add(new Area("Desenvolvimento de Software", disciplinasDesenvSoftware));


        // =====================================
        // DIREITO ADMINISTRATIVO
        // =====================================

        List<Disciplina> disciplinasDireitoAdministrativo = new ArrayList<>();
        disciplinasDireitoAdministrativo.add(PrincipiosAdmExpressoImplicitoData.getDisciplina());
        areas.add(new Area("Direito Administrativo", disciplinasDireitoAdministrativo));


        // =====================================
        // DIREITO CONSTITUCIONAL
        // =====================================

        List<Disciplina> disciplinasConstitucional = new ArrayList<>();
        disciplinasConstitucional.add(AplicabilidadeHierarquiaNormaData.getDisciplina());
        areas.add(new Area("Direito Constitucional", disciplinasConstitucional));


        // =====================================
        // PORTUGUÊS
        // =====================================

        //Aqui insiro as disciplinas correspondente a cada AREA.

        List<Disciplina> disciplinasPortugues = new ArrayList<>();

        disciplinasPortugues.add(VerbosData.getDisciplina());
        disciplinasPortugues.add(TiposSujeitoData.getDisciplina());

        areas.add(new Area("Português", disciplinasPortugues));



        return areas;
    }


    public static Set<String> getIdsValidos() {

        Set<String> ids = new HashSet<>();


        for (Area area : getAreas()) {

            for (Disciplina disciplina : area.getDisciplinas()) {

                for (Secao secao : disciplina.getCategorias()) {

                    for (Conteudo conteudo : secao.getAssuntos()) {

                        ids.add(
                                conteudo.getId()
                        );
                    }
                }
            }
        }

        return ids;
    }
}