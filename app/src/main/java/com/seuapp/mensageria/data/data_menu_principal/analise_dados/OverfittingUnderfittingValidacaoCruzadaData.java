package com.seuapp.mensageria.data.data_menu_principal.analise_dados;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class OverfittingUnderfittingValidacaoCruzadaData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - APRENDIZADO SUPERVISIONADO
        // =========================================================

        List<Conteudo> supervisionado = new ArrayList<>();

        supervisionado.add(
                new Conteudo("IA_VS_ML",
                        "IA_VS_ML")
        );

        supervisionado.add(
                new Conteudo("SUPERVISIONADO_DEF",
                        "SUPERVISIONADO_DEF")
        );

        supervisionado.add(
                new Conteudo("REGRESSAO_CLASSIFICACAO",
                        "REGRESSAO_CLASSIFICACAO")
        );

        supervisionado.add(
                new Conteudo("VARIAVEIS_TIPOS",
                        "VARIAVEIS_TIPOS")
        );

        secoes.add(new Secao(
                "VÍDEO 01: Aprendizado Supervisionado - Conceitos Fundamentais",
                supervisionado
        ));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - APRENDIZADO NÃO SUPERVISIONADO
        // =========================================================

        List<Conteudo> naoSupervisionado = new ArrayList<>();

        naoSupervisionado.add(
                new Conteudo("NAO_SUPERVISIONADO",
                        "NAO_SUPERVISIONADO")
        );

        naoSupervisionado.add(
                new Conteudo("ATIVIDADES_NAO_SUPERV",
                        "ATIVIDADES_NAO_SUPERV")
        );

        naoSupervisionado.add(
                new Conteudo("CLUSTERIZACAO_ASSOCIACAO",
                        "CLUSTERIZACAO_ASSOCIACAO")
        );

        secoes.add(new Secao(
                "VÍDEO 02: Aprendizado Não Supervisionado - 5 Atividades",
                naoSupervisionado
        ));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - QUESTÕES COMENTADAS
        // =========================================================

        List<Conteudo> questoes = new ArrayList<>();

        questoes.add(
                new Conteudo("HIERARQUIA_IA",
                        "HIERARQUIA_IA")
        );

        questoes.add(
                new Conteudo("ML_SISTEMAS_ESPECIALISTAS",
                        "ML_SISTEMAS_ESPECIALISTAS")
        );

        questoes.add(
                new Conteudo("SIMBOLICA_CONEXIONISTA",
                        "SIMBOLICA_CONEXIONISTA")
        );

        secoes.add(new Secao(
                "VÍDEO 03: Questões Comentadas - IA e ML",
                questoes
        ));

        // =========================================================
        // SEÇÃO 04: OVERFITTING E UNDERFITTING
        // =========================================================

        List<Conteudo> overUnder = new ArrayList<>();

        overUnder.add(
                new Conteudo("OVERFITTING",
                        "OVERFITTING")
        );

        overUnder.add(
                new Conteudo("UNDERFITTING",
                        "UNDERFITTING")
        );

        overUnder.add(
                new Conteudo("GENERALIZACAO",
                        "GENERALIZACAO")
        );

        overUnder.add(
                new Conteudo("VALIDACAO_CRUZADA",
                        "VALIDACAO_CRUZADA")
        );

        overUnder.add(
                new Conteudo("VALIDACAO_CRUZADA_OVER",
                        "VALIDACAO_CRUZADA_OVER")
        );

        overUnder.add(
                new Conteudo("UNDERFITTING_SOLUCOES",
                        "UNDERFITTING_SOLUCOES")
        );

        secoes.add(new Secao(
                "Overfitting, Underfitting e Validação Cruzada",
                overUnder
        ));

        // =========================================================
        // SEÇÃO 05: MACETES E CILADAS PARA PROVA
        // =========================================================

        List<Conteudo> macetes = new ArrayList<>();

        macetes.add(
                new Conteudo("MACETES_PROVA",
                        "MACETES_PROVA")
        );

        macetes.add(
                new Conteudo("CILADAS_CONCURSOS",
                        "CILADAS_CONCURSOS")
        );

        secoes.add(new Secao(
                "Macetes e Ciladas - Revisão Rápida para Concursos",
                macetes
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Overfitting, Underfitting e Validação Cruzada - Machine Learning",
                secoes
        );
    }
}
