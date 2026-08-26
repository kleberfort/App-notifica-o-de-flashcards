package com.seuapp.mensageria.data.data_menu_principal.estatistica;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class AnaliseSeriesTemporaisData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - ANÁLISE DE SÉRIES TEMPORAIS - CONCURSOS
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(
                new Conteudo("AST_REG_LINEAR_VS_SERIE_TEMPORAL",
                        "AST_REG_LINEAR_VS_SERIE_TEMPORAL")
        );

        video01.add(
                new Conteudo("AST_PREVISAO_INTERPOLACAO_EXTRAPOLACAO",
                        "AST_PREVISAO_INTERPOLACAO_EXTRAPOLACAO")
        );

        video01.add(
                new Conteudo("AST_PREMISSA_BASICA_ST",
                        "AST_PREMISSA_BASICA_ST")
        );

        secoes.add(new Secao("Vídeo 01 - Análise de Séries Temporais - Concursos", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - CONCEITOS FUNDAMENTAIS EM SÉRIES TEMPORAIS
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(
                new Conteudo("AST_SERIE_ESTATISTICA_DEFINICAO",
                        "AST_SERIE_ESTATISTICA_DEFINICAO")
        );

        video02.add(
                new Conteudo("AST_TEMPO_DISCRETO_VS_CONTINUO",
                        "AST_TEMPO_DISCRETO_VS_CONTINUO")
        );

        video02.add(
                new Conteudo("AST_LAG_DEFASAGEM",
                        "AST_LAG_DEFASAGEM")
        );

        video02.add(
                new Conteudo("AST_INTERVENCAO_CLASSIFICACAO",
                        "AST_INTERVENCAO_CLASSIFICACAO")
        );

        secoes.add(new Secao("Vídeo 02 - Conceitos Fundamentais em Séries Temporais", video02));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - CARACTERÍSTICAS E PROPRIEDADES
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(
                new Conteudo("AST_DETERMINISTICA_VS_ESTOCASTICA",
                        "AST_DETERMINISTICA_VS_ESTOCASTICA")
        );

        video03.add(
                new Conteudo("AST_RUIDO_BRANCO_WHITE_NOISE",
                        "AST_RUIDO_BRANCO_WHITE_NOISE")
        );

        video03.add(
                new Conteudo("AST_ESTACIONARIEDADE_CONCEITO",
                        "AST_ESTACIONARIEDADE_CONCEITO")
        );

        video03.add(
                new Conteudo("AST_ESTACIONARIO_VS_NAO_ESTACIONARIO",
                        "AST_ESTACIONARIO_VS_NAO_ESTACIONARIO")
        );

        video03.add(
                new Conteudo("AST_ERGODICIDADE",
                        "AST_ERGODICIDADE")
        );

        secoes.add(new Secao("Vídeo 03 - Características e Propriedades de Séries Temporais", video03));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - COMPONENTES DE UMA SÉRIE TEMPORAL
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(
                new Conteudo("AST_COMPONENTES_SAZONALIDADE",
                        "AST_COMPONENTES_SAZONALIDADE")
        );

        video04.add(
                new Conteudo("AST_COMPONENTES_TENDENCIA",
                        "AST_COMPONENTES_TENDENCIA")
        );

        video04.add(
                new Conteudo("AST_COMPONENTES_CICLO",
                        "AST_COMPONENTES_CICLO")
        );

        video04.add(
                new Conteudo("AST_COMPONENTES_IRREGULARIDADE",
                        "AST_COMPONENTES_IRREGULARIDADE")
        );

        video04.add(
                new Conteudo("AST_DEPENDENCIA_SERIAL",
                        "AST_DEPENDENCIA_SERIAL")
        );

        secoes.add(new Secao("Vídeo 04 - Componentes de uma Série Temporal", video04));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - DECOMPOSIÇÃO DE SÉRIES TEMPORAIS
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(
                new Conteudo("AST_DECOMPOSICAO_ADITIVA",
                        "AST_DECOMPOSICAO_ADITIVA")
        );

        video05.add(
                new Conteudo("AST_DECOMPOSICAO_MULTIPLICATIVA",
                        "AST_DECOMPOSICAO_MULTIPLICATIVA")
        );

        video05.add(
                new Conteudo("AST_MEDIA_MOVEL_CALCULO",
                        "AST_MEDIA_MOVEL_CALCULO")
        );

        video05.add(
                new Conteudo("AST_SUAVIZACAO_EXPONENCIAL_FORMULA",
                        "AST_SUAVIZACAO_EXPONENCIAL_FORMULA")
        );

        video05.add(
                new Conteudo("AST_SUAVIZACAO_EXPONENCIAL_ALFA",
                        "AST_SUAVIZACAO_EXPONENCIAL_ALFA")
        );

        secoes.add(new Secao("Vídeo 05 - Decomposição de Séries Temporais", video05));

        // =========================================================
        // SEÇÃO 06: VÍDEO 06 - GRÁFICOS PARA SÉRIES TEMPORAIS
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(
                new Conteudo("AST_GRAFICO_DIAGRAMA_LINHAS",
                        "AST_GRAFICO_DIAGRAMA_LINHAS")
        );

        video06.add(
                new Conteudo("AST_GRAFICO_PERIODOGRAMA",
                        "AST_GRAFICO_PERIODOGRAMA")
        );

        video06.add(
                new Conteudo("AST_GRAFICO_POLAR",
                        "AST_GRAFICO_POLAR")
        );

        secoes.add(new Secao("Vídeo 06 - Gráficos para Séries Temporais", video06));

        // =========================================================
        // SEÇÃO 07: VÍDEO 07 - MODELOS DE PREVISÃO - MÉDIAS MÓVEIS
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(
                new Conteudo("AST_MEDIA_MOVEL_SIMPLES",
                        "AST_MEDIA_MOVEL_SIMPLES")
        );

        video07.add(
                new Conteudo("AST_MEDIA_MOVEL_PONDERADA",
                        "AST_MEDIA_MOVEL_PONDERADA")
        );

        video07.add(
                new Conteudo("AST_SUAVIZACAO_EXPONENCIAL_PREVISAO",
                        "AST_SUAVIZACAO_EXPONENCIAL_PREVISAO")
        );

        secoes.add(new Secao("Vídeo 07 - Modelos de Previsão - Médias Móveis e Suavização Exponencial", video07));

        // =========================================================
        // SEÇÃO 08: VÍDEO 08 - MODELOS AUTORREGRESSIVOS (AR) - PARTE 1
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(
                new Conteudo("AST_MODELO_AR_P_ESTRUTURA",
                        "AST_MODELO_AR_P_ESTRUTURA")
        );

        video08.add(
                new Conteudo("AST_ESTACIONARIEDADE_AR_RAIZES",
                        "AST_ESTACIONARIEDADE_AR_RAIZES")
        );

        video08.add(
                new Conteudo("AST_ESTACIONARIEDADE_AR_RESTRICOES",
                        "AST_ESTACIONARIEDADE_AR_RESTRICOES")
        );

        video08.add(
                new Conteudo("AST_AR_MEDIA_VARIANCIA",
                        "AST_AR_MEDIA_VARIANCIA")
        );

        secoes.add(new Secao("Vídeo 08 - Modelos Autorregressivos (AR) - Parte 1", video08));

        // =========================================================
        // SEÇÃO 09: VÍDEO 09 - MODELOS AUTORREGRESSIVOS (AR) - PARTE 2
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(
                new Conteudo("AST_AR_AUTOCORRELACAO_FAC",
                        "AST_AR_AUTOCORRELACAO_FAC")
        );

        video09.add(
                new Conteudo("AST_AR_COMPORTAMENTO_GRAFICO",
                        "AST_AR_COMPORTAMENTO_GRAFICO")
        );

        secoes.add(new Secao("Vídeo 09 - Modelos Autorregressivos (AR) - Parte 2", video09));

        // =========================================================
        // SEÇÃO 10: VÍDEO 10 - MODELOS DE MÉDIAS MÓVEIS (MA)
        // =========================================================

        List<Conteudo> video10 = new ArrayList<>();

        video10.add(
                new Conteudo("AST_MODELO_MA_Q_ESTRUTURA",
                        "AST_MODELO_MA_Q_ESTRUTURA")
        );

        video10.add(
                new Conteudo("AST_INVERTIBILIDADE_MA",
                        "AST_INVERTIBILIDADE_MA")
        );

        video10.add(
                new Conteudo("AST_MA_COMPORTAMENTO_GRAFICO",
                        "AST_MA_COMPORTAMENTO_GRAFICO")
        );

        secoes.add(new Secao("Vídeo 10 - Modelos de Médias Móveis (MA)", video10));

        // =========================================================
        // SEÇÃO 11: VÍDEO 11 - MODELOS ARMA
        // =========================================================

        List<Conteudo> video11 = new ArrayList<>();

        video11.add(
                new Conteudo("AST_MODELO_ARMA_P_Q",
                        "AST_MODELO_ARMA_P_Q")
        );

        video11.add(
                new Conteudo("AST_ARMA_COMPORTAMENTO_GRAFICO",
                        "AST_ARMA_COMPORTAMENTO_GRAFICO")
        );

        video11.add(
                new Conteudo("AST_RESUMO_AR_MA_ARMA_COMPORTAMENTO",
                        "AST_RESUMO_AR_MA_ARMA_COMPORTAMENTO")
        );

        secoes.add(new Secao("Vídeo 11 - Modelos ARMA (Autorregressivos com Médias Móveis)", video11));

        // =========================================================
        // SEÇÃO 12: VÍDEO 12 - MODELO ARIMA
        // =========================================================

        List<Conteudo> video12 = new ArrayList<>();

        video12.add(
                new Conteudo("AST_MODELO_ARIMA_P_D_Q",
                        "AST_MODELO_ARIMA_P_D_Q")
        );

        video12.add(
                new Conteudo("AST_ARIMA_D_0_ARMA",
                        "AST_ARIMA_D_0_ARMA")
        );

        video12.add(
                new Conteudo("AST_DIFERENCIACAO_ARIMA",
                        "AST_DIFERENCIACAO_ARIMA")
        );

        secoes.add(new Secao("Vídeo 12 - Modelo ARIMA (Autorregressivo Integrado de Médias Móveis)", video12));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Análise de Séries Temporais",
                secoes
        );
    }
}