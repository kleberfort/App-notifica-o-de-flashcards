package com.seuapp.mensageria.data.data_menu_questoes_multipla;

import com.seuapp.mensageria.model.Area;
import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class AppDataQuestoes {

    public static List<Area> getTemasQuestoes() {

        return List.of(

                criarAreaPortugues(),
                criarAreaAdministrativo(),
                criarConstitucional(),
                criarAreaEngenhariaSoftware()


        );
    }

    // =====================================================
    // PORTUGUÊS
    // =====================================================

    private static Area criarAreaPortugues() {

        // -------------------------
        // Classe de Palavras: Verbo
        // -------------------------

        List<Conteudo> conteudoVerboQuestoes = List.of(new Conteudo("VERBOS_TEMPOS_MODO", "Questões comentadas (FCC)"));
        List<Secao> secaoVerbo = List.of(new Secao("Identificação de Tempos e Modos", conteudoVerboQuestoes));
        Disciplina disciplinaVerbo = new Disciplina("Classe de Palavras: Verbo", secaoVerbo);

        // -------------------------
        // Termos da Oração
        // -------------------------
        List<Conteudo> conteudoSujeitoQuestoes = List.of(new Conteudo("TIPOS_SUJEITO", "Questões comentadas (FCC)"));
        List<Secao> secaoSujeito = List.of(new Secao("Tipos de Sujeitos", conteudoSujeitoQuestoes));
        Disciplina disciplinaTermosOracao = new Disciplina("Termos da Oração", secaoSujeito);

        return new Area("Português", List.of(disciplinaVerbo, disciplinaTermosOracao));
    }

    private static Area criarAreaAdministrativo() {

        // =====================================================
        // DIREITO ADMINISTRATIVO
        // =====================================================
        List<Conteudo> conteudoPrincipiosQuestoes = List.of(new Conteudo("PRNCIPIOS_EXPRESSOS_IMPLICITO", "Questões comentadas (FCC)"));
        List<Secao> secaoPrincipios = List.of(new Secao("Princípios Expressos e Implícitos", conteudoPrincipiosQuestoes));
        Disciplina DisciplinaprincipiosExpressoImplicito = new Disciplina("Princípios Expressos e Implícitos", secaoPrincipios);

        return new Area("Direito Administrativo", List.of(DisciplinaprincipiosExpressoImplicito));
    }

    private static Area criarConstitucional() {

        // =====================================================
        // DIREITO Constitucional
        // =====================================================
        List<Conteudo> conteudoAplicabilidaHierarquiaNormaQuestoes = List.of(new Conteudo("APLICABILIDADE_HIERARQUIA_NORMA", "Questões comentadas (FCC)"));
        List<Secao> secaoAplicabilidadedaHierarquiaNorma = List.of(new Secao("Aplicabilidade e Hierárquia da Norma", conteudoAplicabilidaHierarquiaNormaQuestoes));
        Disciplina DisciplinaAplicabilidadeHierarquiaNorma = new Disciplina("conceito, classificações, princípios fundamentais ", secaoAplicabilidadedaHierarquiaNorma);

        return new Area("Direito Constitucional", List.of(DisciplinaAplicabilidadeHierarquiaNorma));
    }


    private static Area criarAreaEngenhariaSoftware() {

        // =====================================================
        // ENGENHARIA DE SOFTWARE - XP
        // =====================================================
        List<Conteudo> conteudoPrincipiosQuestoes = List.of(new Conteudo("XP_PRATICAS", "Questões comentadas (FCC)"));
        List<Secao> secaoPraticasXP = List.of(new Secao("Práticas do XP", conteudoPrincipiosQuestoes));
        Disciplina DisciplinaXP = new Disciplina("XP(Extremming Programmig", secaoPraticasXP);

        return new Area("Engenharia de Software", List.of(DisciplinaXP));
    }


    }