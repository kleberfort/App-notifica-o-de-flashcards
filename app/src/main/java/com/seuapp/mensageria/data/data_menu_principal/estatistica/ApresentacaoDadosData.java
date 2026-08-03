package com.seuapp.mensageria.data.data_menu_principal.estatistica;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ApresentacaoDadosData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Nomenclatura Básica da Estatística
        // =========================================================

        List<Conteudo> nomenclatura = new ArrayList<>();

        nomenclatura.add(new Conteudo("POPULACAO_AMOSTRA", "POPULACAO_AMOSTRA"));
        nomenclatura.add(new Conteudo("CENSO_AMOSTRAGEM", "CENSO_AMOSTRAGEM"));
        nomenclatura.add(new Conteudo("PARAMETRO_ESTATISTICA", "PARAMETRO_ESTATISTICA"));
        nomenclatura.add(new Conteudo("MOTIVOS_AMOSTRAGEM", "MOTIVOS_AMOSTRAGEM"));
        nomenclatura.add(new Conteudo("CILADA_POPULACAO", "CILADA_POPULACAO"));
        nomenclatura.add(new Conteudo("CILADA_AMOSTRA", "CILADA_AMOSTRA"));

        secoes.add(new Secao("Nomenclatura Básica da Estatística", nomenclatura));

        // =========================================================
        // SEÇÃO 02: Apresentação de Dados (Tabelas e Gráficos)
        // =========================================================

        List<Conteudo> apresentacao = new ArrayList<>();

        apresentacao.add(new Conteudo("FORMAS_APRESENTACAO", "FORMAS_APRESENTACAO"));
        apresentacao.add(new Conteudo("ELEMENTOS_TABELA", "ELEMENTOS_TABELA"));
        apresentacao.add(new Conteudo("TITULO_TABELA", "TITULO_TABELA"));
        apresentacao.add(new Conteudo("ELEMENTOS_OPCIONAIS", "ELEMENTOS_OPCIONAIS"));
        apresentacao.add(new Conteudo("CILADA_TABELA", "CILADA_TABELA"));

        secoes.add(new Secao("Apresentação de Dados (Tabelas e Gráficos)", apresentacao));

        // =========================================================
        // SEÇÃO 03: Método Experimental e Método Estatístico
        // =========================================================

        List<Conteudo> metodos = new ArrayList<>();

        metodos.add(new Conteudo("METODO_EXPERIMENTAL", "METODO_EXPERIMENTAL"));
        metodos.add(new Conteudo("METODO_ESTATISTICO", "METODO_ESTATISTICO"));
        metodos.add(new Conteudo("VARS_DEPENDENTE_INDEPENDENTE", "VARS_DEPENDENTE_INDEPENDENTE"));
        metodos.add(new Conteudo("ETAPAS_EXPERIMENTAL", "ETAPAS_EXPERIMENTAL"));
        metodos.add(new Conteudo("ETAPAS_ESTATISTICO", "ETAPAS_ESTATISTICO"));
        metodos.add(new Conteudo("NIVEIS_MANIPULACAO", "NIVEIS_MANIPULACAO"));
        metodos.add(new Conteudo("EXEMPLO_UNICO_MEDICAMENTO", "EXEMPLO_UNICO_MEDICAMENTO"));

        secoes.add(new Secao("Método Experimental e Método Estatístico", metodos));

        // =========================================================
        // SEÇÃO 04: Dados Estatísticos
        // =========================================================

        List<Conteudo> dados = new ArrayList<>();

        dados.add(new Conteudo("DADO_ESTATISTICO", "DADO_ESTATISTICO"));
        dados.add(new Conteudo("FORMAS_OBTENCAO", "FORMAS_OBTENCAO"));
        dados.add(new Conteudo("CLASSIFICACAO_TEMPO", "CLASSIFICACAO_TEMPO"));
        dados.add(new Conteudo("DADO_BRUTO_ROL", "DADO_BRUTO_ROL"));

        secoes.add(new Secao("Dados Estatísticos", dados));

        // =========================================================
        // SEÇÃO 05: Variáveis Estatísticas
        // =========================================================

        List<Conteudo> variaveis = new ArrayList<>();

        variaveis.add(new Conteudo("VARS_QUANTITATIVAS", "VARS_QUANTITATIVAS"));
        variaveis.add(new Conteudo("VARS_QUALITATIVAS", "VARS_QUALITATIVAS"));
        variaveis.add(new Conteudo("PEGADINHA_NUMEROS", "PEGADINHA_NUMEROS"));
        variaveis.add(new Conteudo("ARVORE_DECISORIA", "ARVORE_DECISORIA"));

        secoes.add(new Secao("Variáveis Estatísticas", variaveis));

        // =========================================================
        // SEÇÃO 06: Séries Estatísticas
        // =========================================================

        List<Conteudo> series = new ArrayList<>();

        series.add(new Conteudo("SERIE_ESTATISTICA", "SERIE_ESTATISTICA"));
        series.add(new Conteudo("TIPOS_SERIE", "TIPOS_SERIE"));
        series.add(new Conteudo("FATORES_FIXOS", "FATORES_FIXOS"));

        secoes.add(new Secao("Séries Estatísticas", series));

        // =========================================================
        // SEÇÃO 07: Distribuições de Frequência
        // =========================================================

        List<Conteudo> distribuicoes = new ArrayList<>();

        distribuicoes.add(new Conteudo("DISTRIBUICAO_FREQUENCIA", "DISTRIBUICAO_FREQUENCIA"));
        distribuicoes.add(new Conteudo("FREQUENCIA_ABSOLUTA_RELATIVA", "FREQUENCIA_ABSOLUTA_RELATIVA"));
        distribuicoes.add(new Conteudo("FREQUENCIA_ACUMULADA", "FREQUENCIA_ACUMULADA"));
        distribuicoes.add(new Conteudo("DENSIDADE_FREQUENCIA", "DENSIDADE_FREQUENCIA"));
        distribuicoes.add(new Conteudo("AMPLITUDE_TOTAL", "AMPLITUDE_TOTAL"));

        secoes.add(new Secao("Distribuições de Frequência", distribuicoes));

        // =========================================================
        // SEÇÃO 08: Representações Gráficas (Parte 1)
        // =========================================================

        List<Conteudo> graficos1 = new ArrayList<>();

        graficos1.add(new Conteudo("BASTOES_HISTOGRAMA", "BASTOES_HISTOGRAMA"));
        graficos1.add(new Conteudo("POLIGONO_OGIVA", "POLIGONO_OGIVA"));
        graficos1.add(new Conteudo("HISTOGRAMA_AREA", "HISTOGRAMA_AREA"));

        secoes.add(new Secao("Representações Gráficas (Parte 1)", graficos1));

        // =========================================================
        // SEÇÃO 09: Representações Gráficas (Parte 2)
        // =========================================================

        List<Conteudo> graficos2 = new ArrayList<>();

        graficos2.add(new Conteudo("GRAFICOS_QUALITATIVOS", "GRAFICOS_QUALITATIVOS"));
        graficos2.add(new Conteudo("GRAFICO_LINHA_DISPERSAO", "GRAFICO_LINHA_DISPERSAO"));
        graficos2.add(new Conteudo("CARTOGRAMA_PICTOGRAMA", "CARTOGRAMA_PICTOGRAMA"));
        graficos2.add(new Conteudo("GRAFICO_POLAR_RAMO", "GRAFICO_POLAR_RAMO"));
        graficos2.add(new Conteudo("CALCULO_SETORES", "CALCULO_SETORES"));
        graficos2.add(new Conteudo("CILADAS_GRAFICOS", "CILADAS_GRAFICOS"));

        secoes.add(new Secao("Representações Gráficas (Parte 2)", graficos2));

        // =========================================================
        // SEÇÃO 10: Revisão Rápida (Bônus)
        // =========================================================

        List<Conteudo> revisao = new ArrayList<>();

        revisao.add(new Conteudo("CONCEITOS_BASE", "CONCEITOS_BASE"));
        revisao.add(new Conteudo("VARIAVEIS_RESUMO", "VARIAVEIS_RESUMO"));

        secoes.add(new Secao("Revisão Rápida (Bônus)", revisao));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Apresentação de Dados - Estatística para Concursos",
                secoes
        );
    }
}
