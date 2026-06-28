package com.seuapp.mensageria.data.data_menu_principal.analise_dados;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class CicloVidaDadoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - BI Conceitos Fundamentais
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(
                new Conteudo("BI_CONCEITOS",
                        "BI_CONCEITOS")
        );

        video01.add(
                new Conteudo("BI_SAD_ANALISES",
                        "BI_SAD_ANALISES")
        );

        secoes.add(new Secao("VÍDEO 01 - BI Conceitos Fundamentais", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - BI Arquitetura
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(
                new Conteudo("BI_ARQUITETURA",
                        "BI_ARQUITETURA")
        );

        secoes.add(new Secao("VÍDEO 02 - BI Arquitetura", video02));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - DW Conceitos e Origem
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo("DW_CONCEITOS_ORIGEM", "DW_CONCEITOS_ORIGEM"));
        video03.add(new Conteudo("COMPARACAO_OPERACIONAL_DW", "COMPARACAO_OPERACIONAL_DW"));

        secoes.add(new Secao("VÍDEO 03 - DW Conceitos e Origem", video03));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - DW Tipos e Características
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(
                new Conteudo("DW_TIPOS_CARACTERISTICAS",
                        "DW_TIPOS_CARACTERISTICAS")
        );

        secoes.add(new Secao("VÍDEO 04 - DW Tipos e Características", video04));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - DW Processos e Abordagens
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(
                new Conteudo("DW_PROCESSOS_ABORDAGENS",
                        "DW_PROCESSOS_ABORDAGENS")
        );

        secoes.add(new Secao("VÍDEO 05 - DW Processos e Abordagens", video05));

        // =========================================================
        // SEÇÃO 06: VÍDEO 06 - DW Modelagem Dimensional
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(
                new Conteudo("DW_MODELAGEM_DIMENSIONAL",
                        "DW_MODELAGEM_DIMENSIONAL")
        );

        video06.add(
                new Conteudo("DW_INMON_KIMBALL",
                        "DW_INMON_KIMBALL")
        );

        secoes.add(new Secao("VÍDEO 06 - DW Modelagem Dimensional", video06));

        // =========================================================
        // SEÇÃO 07: VÍDEO 07 - ETL Processo e Etapas
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(
                new Conteudo("ETL_PROCESSO",
                        "ETL_PROCESSO")
        );

        video07.add(
                new Conteudo("ETL_VS_ELT",
                        "ETL_VS_ELT")
        );

        secoes.add(new Secao("VÍDEO 07 - ETL Processo e Etapas", video07));

        // =========================================================
        // SEÇÃO 08: VÍDEO 08 - Pipeline de Dados
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(
                new Conteudo("PIPELINE_CONCEITOS",
                        "PIPELINE_CONCEITOS")
        );

        video08.add(
                new Conteudo("PIPELINE_BENEFICIOS",
                        "PIPELINE_BENEFICIOS")
        );

        secoes.add(new Secao("VÍDEO 08 - Pipeline de Dados", video08));

        // =========================================================
        // SEÇÃO 09: VÍDEO 09 - Pipeline Lote vs Fluxo
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(
                new Conteudo("PIPELINE_BATCH_STREAM",
                        "PIPELINE_BATCH_STREAM")
        );

        video09.add(
                new Conteudo("PIPELINE_VS_ETL",
                        "PIPELINE_VS_ETL")
        );

        secoes.add(new Secao("VÍDEO 09 - Pipeline Lote vs Fluxo", video09));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Ciclo de Vida do Dado - Coleta, Armazenamento e Processamento",
                secoes
        );
    }
}
