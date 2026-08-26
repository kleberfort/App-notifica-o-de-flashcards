package com.seuapp.mensageria.data.data_menu_principal.estatistica;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class MedidasVariabilidadeDispersaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Conceitos Gerais de Medidas de Dispersão
        // =========================================================

        List<Conteudo> conceitosGerais = new ArrayList<>();

        conceitosGerais.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_CONCEITOS_GERAIS",
                        "CONCEITOS_GERAIS")
        );

        conceitosGerais.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_LISTA_COMPLETA",
                        "LISTA_COMPLETA")
        );

        conceitosGerais.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_FALSIAS_COMUNS",
                        "FALSIAS_COMUNS")
        );

        secoes.add(new Secao(
                "Conceitos Gerais de Medidas de Dispersão",
                conceitosGerais
        ));

        // =========================================================
        // SEÇÃO 02: Amplitude Total
        // =========================================================

        List<Conteudo> amplitudeTotal = new ArrayList<>();

        amplitudeTotal.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_AMPLITUDE_TOTAL",
                        "AMPLITUDE_TOTAL")
        );

        amplitudeTotal.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_VANTAGENS_DESVANTAGENS",
                        "VANTAGENS_DESVANTAGENS")
        );

        secoes.add(new Secao(
                "Amplitude Total",
                amplitudeTotal
        ));

        // =========================================================
        // SEÇÃO 03: Medidas com Quartis
        // =========================================================

        List<Conteudo> medidasQuartis = new ArrayList<>();

        medidasQuartis.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_QUARTIS_REVISAO",
                        "QUARTIS_REVISAO")
        );

        medidasQuartis.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_MEDIDAS_QUARTIS",
                        "MEDIDAS_QUARTIS")
        );

        medidasQuartis.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_CILADAS_QUARTIS",
                        "CILADAS_QUARTIS")
        );

        secoes.add(new Secao(
                "Medidas com Quartis (Diferença Interquartílica, Desvio Quartílico, CVq)",
                medidasQuartis
        ));

        // =========================================================
        // SEÇÃO 04: Desvios em Relação à Média
        // =========================================================

        List<Conteudo> desviosMedia = new ArrayList<>();

        desviosMedia.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_DESVIO_MEDIA",
                        "DESVIO_MEDIA")
        );

        desviosMedia.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_PROPRIEDADE_SOMA",
                        "PROPRIEDADE_SOMA")
        );

        secoes.add(new Secao(
                "Desvios em Relação à Média (Propriedade da Soma = Zero)",
                desviosMedia
        ));

        // =========================================================
        // SEÇÃO 05: Desvio Absoluto Médio
        // =========================================================

        List<Conteudo> desvioAbsolutoMedio = new ArrayList<>();

        desvioAbsolutoMedio.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_DESVIO_ABSOLUTO_MEDIO",
                        "DESVIO_ABSOLUTO_MEDIO")
        );

        desvioAbsolutoMedio.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_DADOS_SIMPLES_TABELA",
                        "DADOS_SIMPLES_TABELA")
        );

        secoes.add(new Secao(
                "Desvio Absoluto Médio (Desvio Médio)",
                desvioAbsolutoMedio
        ));

        // =========================================================
        // SEÇÃO 06: Variância
        // =========================================================

        List<Conteudo> variancia = new ArrayList<>();

        variancia.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_VARIANCIA_CONCEITO",
                        "VARIANCIA_CONCEITO")
        );

        variancia.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_POPULACIONAL_AMOSTRAL",
                        "POPULACIONAL_AMOSTRAL")
        );

        variancia.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_CILADAS_VARIANCIA",
                        "CILADAS_VARIANCIA")
        );

        secoes.add(new Secao(
                "Variância (Populacional e Amostral)",
                variancia
        ));

        // =========================================================
        // SEÇÃO 07: Variância em Tabelas de Frequência
        // =========================================================

        List<Conteudo> varianciaTabelas = new ArrayList<>();

        varianciaTabelas.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_TABELA_ABSOLUTA",
                        "TABELA_ABSOLUTA")
        );

        varianciaTabelas.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_TABELA_RELATIVA",
                        "TABELA_RELATIVA")
        );

        secoes.add(new Secao(
                "Variância em Tabelas de Frequência (Absoluta e Relativa)",
                varianciaTabelas
        ));

        // =========================================================
        // SEÇÃO 08: Desvio Padrão
        // =========================================================

        List<Conteudo> desvioPadrao = new ArrayList<>();

        desvioPadrao.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_DESVIO_PADRAO_CONCEITO",
                        "DESVIO_PADRAO_CONCEITO")
        );

        desvioPadrao.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_COMPARACAO_GRUPOS",
                        "COMPARACAO_GRUPOS")
        );

        secoes.add(new Secao(
                "Desvio Padrão (Populacional e Amostral)",
                desvioPadrao
        ));

        // =========================================================
        // SEÇÃO 09: Coeficiente de Variação (CV)
        // =========================================================

        List<Conteudo> coeficienteVariacao = new ArrayList<>();

        coeficienteVariacao.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_CV_CONCEITO",
                        "CV_CONCEITO")
        );

        coeficienteVariacao.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_CV_PROPRIEDADES",
                        "CV_PROPRIEDADES")
        );

        secoes.add(new Secao(
                "Coeficiente de Variação (CV)",
                coeficienteVariacao
        ));

        // =========================================================
        // SEÇÃO 10: Variância Relativa
        // =========================================================

        List<Conteudo> varianciaRelativa = new ArrayList<>();

        varianciaRelativa.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_VR_CONCEITO",
                        "VR_CONCEITO")
        );

        varianciaRelativa.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_VR_PROPRIEDADES",
                        "VR_PROPRIEDADES")
        );

        secoes.add(new Secao(
                "Variância Relativa (VR)",
                varianciaRelativa
        ));

        // =========================================================
        // SEÇÃO 11: Resumos de Bolso
        // =========================================================

        List<Conteudo> resumosBolso = new ArrayList<>();

        resumosBolso.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_RESUMO_BOLSO_1",
                        "RESUMO_BOLSO_1")
        );

        resumosBolso.add(
                new Conteudo("MEDIDAS_VARIABILIDADE_ESTATISTICA_RESUMO_BOLSO_2",
                        "RESUMO_BOLSO_2")
        );

        secoes.add(new Secao(
                "Resumos de Bolso para Revisão Rápida",
                resumosBolso
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Medidas de Variabilidade ou Dispersão - Estatística para Concursos",
                secoes
        );
    }
}
