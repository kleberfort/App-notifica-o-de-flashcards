package com.seuapp.mensageria.data.data_menu_principal;

import com.seuapp.mensageria.data.data_menu_principal.analise_dados.CicloVidaDadoData;
import com.seuapp.mensageria.data.data_menu_principal.desenvolvimento_software.GitData;
import com.seuapp.mensageria.data.data_menu_principal.direito.administrativo.PrincipiosAdmExpressoImplicitoData;
import com.seuapp.mensageria.data.data_menu_principal.direito.constitucional.AplicabilidadeHierarquiaNormaData;
import com.seuapp.mensageria.data.data_menu_principal.engenharia_software.ScrumData;
import com.seuapp.mensageria.data.data_menu_principal.engenharia_software.XpData;
import com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql.FundamentosBancoDadosData;
import com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql.FundamentosSqlParte1Data;
import com.seuapp.mensageria.data.data_menu_principal.linguagem_programacao.LinguagemPythonData;
import com.seuapp.mensageria.data.data_menu_principal.linguagem_programacao.LinguagemRData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras.ConjuncaoData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras.PreposicaoData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras.VerbosData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.termos_oracao.TiposPredicadoIntegrantesOracaoData;
import com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.termos_oracao.TiposSujeitoData;
import com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql.FundamentosSqlParte1Flashcards;
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
        // BANCO DE DADOS
        // =====================================

        List<Disciplina> disciplinasBancoDados = new ArrayList<>();

        disciplinasBancoDados.add(FundamentosBancoDadosData.getDisciplina());
        disciplinasBancoDados.add(FundamentosSqlParte1Data.getDisciplina());
        areas.add(new Area("Banco de Dados", disciplinasBancoDados));


        // =====================================
        // ANALISE DE DADOS
        // =====================================
        List<Disciplina> disciplinasAnaliseDados = new ArrayList<>();
        disciplinasAnaliseDados.add(CicloVidaDadoData.getDisciplina());
        areas.add(new Area("Análise de Dados", disciplinasAnaliseDados));

        // =====================================
        // ENGENHARIA DE SOFTWARE
        // =====================================

        List<Disciplina> disciplinasDesenvSoftware = new ArrayList<>();
        disciplinasDesenvSoftware.add(GitData.getDisciplina());
        areas.add(new Area("Engenharia de Software", disciplinasDesenvSoftware));


        // =====================================
        // LINGUAGEM DE PROGRAMAÇAO
        // =====================================

        List<Disciplina> disciplinasLinguagemProgramacao = new ArrayList<>();
        disciplinasLinguagemProgramacao.add(LinguagemPythonData.getDisciplina());
        disciplinasLinguagemProgramacao.add(LinguagemRData.getDisciplina());
        areas.add(new Area("Linguagem de Programação", disciplinasLinguagemProgramacao));


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

        disciplinasPortugues.add(PreposicaoData.getDisciplina());
        disciplinasPortugues.add(ConjuncaoData.getDisciplina());

        disciplinasPortugues.add(VerbosData.getDisciplina());

        disciplinasPortugues.add(TiposSujeitoData.getDisciplina());
        disciplinasPortugues.add(TiposPredicadoIntegrantesOracaoData.getDisciplina());

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