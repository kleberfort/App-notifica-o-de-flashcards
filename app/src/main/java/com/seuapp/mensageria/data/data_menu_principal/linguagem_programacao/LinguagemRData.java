package com.seuapp.mensageria.data.data_menu_principal.linguagem_programacao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class LinguagemRData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: CONCEITOS FUNDAMENTAIS DA LINGUAGEM R
        // =========================================================

        List<Conteudo> fundamentos = new ArrayList<>();

        fundamentos.add(
                new Conteudo("R_CONCEITOS_BASE",
                        "R_CONCEITOS_BASE")
        );

        fundamentos.add(
                new Conteudo("R_OPERADORES",
                        "R_OPERADORES")
        );

        fundamentos.add(
                new Conteudo("R_VARIAVEIS",
                        "R_VARIAVEIS")
        );

        secoes.add(new Secao("Fundamentos da Linguagem R", fundamentos));

        // =========================================================
        // SEÇÃO 02: VETORES, TIPOS DE DADOS E OPERAÇÕES
        // =========================================================

        List<Conteudo> vetores = new ArrayList<>();

        vetores.add(
                new Conteudo("R_TIPOS_DADOS",
                        "R_TIPOS_DADOS")
        );

        vetores.add(
                new Conteudo("R_VETORES",
                        "R_VETORES")
        );

        vetores.add(
                new Conteudo("R_OP_VETORES",
                        "R_OP_VETORES")
        );

        secoes.add(new Secao("Vetores, Tipos de Dados e Operações", vetores));

        // =========================================================
        // SEÇÃO 03: FUNÇÕES rep(), seq() E sample()
        // =========================================================

        List<Conteudo> repSeqSample = new ArrayList<>();

        repSeqSample.add(
                new Conteudo("R_REP_SEQ",
                        "R_REP_SEQ")
        );

        repSeqSample.add(
                new Conteudo("R_SAMPLE",
                        "R_SAMPLE")
        );

        secoes.add(new Secao("Funções rep(), seq() e sample()", repSeqSample));

        // =========================================================
        // SEÇÃO 04: MATRIZES - CRIAÇÃO E OPERAÇÕES
        // =========================================================

        List<Conteudo> matrizes = new ArrayList<>();

        matrizes.add(
                new Conteudo("R_MATRIZES_CRIACAO",
                        "R_MATRIZES_CRIACAO")
        );

        matrizes.add(
                new Conteudo("R_MAT_OPERACOES",
                        "R_MAT_OPERACOES")
        );

        secoes.add(new Secao("Matrizes: Criação e Operações", matrizes));

        // =========================================================
        // SEÇÃO 05: MATRIZES AVANÇADAS E DATAFRAMES
        // =========================================================

        List<Conteudo> matrizesAvancadasDataframes = new ArrayList<>();

        matrizesAvancadasDataframes.add(
                new Conteudo("R_DIAG_DET",
                        "R_DIAG_DET")
        );

        matrizesAvancadasDataframes.add(
                new Conteudo("R_DATAFRAMES",
                        "R_DATAFRAMES")
        );

        secoes.add(new Secao("Matrizes Avançadas e Dataframes", matrizesAvancadasDataframes));

        // =========================================================
        // SEÇÃO 06: FUNÇÕES ESTATÍSTICAS BÁSICAS
        // =========================================================

        List<Conteudo> estatisticas = new ArrayList<>();

        estatisticas.add(
                new Conteudo("R_ESTATISTICAS",
                        "R_ESTATISTICAS")
        );

        estatisticas.add(
                new Conteudo("R_CALC_ESTAT",
                        "R_CALC_ESTAT")
        );

        secoes.add(new Secao("Funções Estatísticas Básicas", estatisticas));

        // =========================================================
        // SEÇÃO 07: GRÁFICOS BÁSICOS
        // =========================================================

        List<Conteudo> graficosBase = new ArrayList<>();

        graficosBase.add(
                new Conteudo("R_GRAFICOS_BASE",
                        "R_GRAFICOS_BASE")
        );

        graficosBase.add(
                new Conteudo("R_BOXPLOT",
                        "R_BOXPLOT")
        );

        secoes.add(new Secao("Gráficos Básicos", graficosBase));

        // =========================================================
        // SEÇÃO 08: HISTOGRAMAS
        // =========================================================

        List<Conteudo> histogramas = new ArrayList<>();

        histogramas.add(
                new Conteudo("R_HISTOGRAMA",
                        "R_HISTOGRAMA")
        );

        secoes.add(new Secao("Histogramas", histogramas));

        // =========================================================
        // SEÇÃO 09: IMPORTAÇÃO E EXPORTAÇÃO DE DADOS (CSV)
        // =========================================================

        List<Conteudo> csv = new ArrayList<>();

        csv.add(
                new Conteudo("R_CSV",
                        "R_CSV")
        );

        secoes.add(new Secao("Importação e Exportação de Dados (CSV)", csv));

        // =========================================================
        // SEÇÃO 10: PRÁTICA COM DADOS REAIS
        // =========================================================

        List<Conteudo> dadosReais = new ArrayList<>();

        dadosReais.add(
                new Conteudo("R_DADOS_REAIS",
                        "R_DADOS_REAIS")
        );

        secoes.add(new Secao("Prática com Dados Reais", dadosReais));

        // =========================================================
        // SEÇÃO 11: CORRELAÇÃO E REGRESSÃO LINEAR
        // =========================================================

        List<Conteudo> correlacaoRegressao = new ArrayList<>();

        correlacaoRegressao.add(
                new Conteudo("R_CORRELACAO",
                        "R_CORRELACAO")
        );

        correlacaoRegressao.add(
                new Conteudo("R_REGRESSAO",
                        "R_REGRESSAO")
        );

        secoes.add(new Secao("Correlação e Regressão Linear", correlacaoRegressao));

        // =========================================================
        // SEÇÃO 12: ESTRUTURAS DE CONTROLE E FUNÇÕES
        // =========================================================

        List<Conteudo> estruturasControle = new ArrayList<>();

        estruturasControle.add(
                new Conteudo("R_CONDICIONAIS",
                        "R_CONDICIONAIS")
        );

        estruturasControle.add(
                new Conteudo("R_LACOS",
                        "R_LACOS")
        );

        estruturasControle.add(
                new Conteudo("R_FUNCOES",
                        "R_FUNCOES")
        );

        secoes.add(new Secao("Estruturas de Controle e Funções", estruturasControle));

        // =========================================================
        // SEÇÃO 13: PACOTES
        // =========================================================

        List<Conteudo> pacotes = new ArrayList<>();

        pacotes.add(
                new Conteudo("R_PACOTES",
                        "R_PACOTES")
        );

        secoes.add(new Secao("Pacotes (Packages) e Bibliotecas", pacotes));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Linguagem R - Conceitos Fundamentais para Concursos",
                secoes
        );
    }
}
