package com.seuapp.mensageria.data.data_menu_principal.analise_dados;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class DashboardsInterativosPowerBIData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - Power BI Conceitos Fundamentais
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();
        video01.add(new Conteudo("POWERBI_DEFINICAO", "POWERBI_DEFINICAO"));
        video01.add(new Conteudo("POWERBI_VERSAO_FUNCAO", "POWERBI_VERSAO_FUNCAO"));
        video01.add(new Conteudo("POWERBI_CILADAS", "POWERBI_CILADAS"));
        secoes.add(new Secao("VÍDEO 01 - Power BI Conceitos Fundamentais", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - Power BI Recursos e Ferramentas
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();
        video02.add(new Conteudo("POWERBI_DATASET_ETL", "POWERBI_DATASET_ETL"));
        video02.add(new Conteudo("POWERBI_QUERY_DIRECT", "POWERBI_QUERY_DIRECT"));
        video02.add(new Conteudo("POWERBI_CILADAS_ETL", "POWERBI_CILADAS_ETL"));
        secoes.add(new Secao("VÍDEO 02 - Power BI Recursos e Ferramentas", video02));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - Power BI Modelagem e Visualização
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();
        video03.add(new Conteudo("POWERBI_MODELAGEM_PIVOT", "POWERBI_MODELAGEM_PIVOT"));
        video03.add(new Conteudo("POWERBI_VISUALIZACOES_1", "POWERBI_VISUALIZACOES_1"));
        video03.add(new Conteudo("POWERBI_VISUALIZACOES_2", "POWERBI_VISUALIZACOES_2"));
        video03.add(new Conteudo("POWERBI_KPI_DATAFLOW", "POWERBI_KPI_DATAFLOW"));
        secoes.add(new Secao("VÍDEO 03 - Power BI Modelagem e Visualização", video03));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - Power BI Visualização Avançada
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();
        video04.add(new Conteudo("POWERBI_DISP_BOLHA_PONTO", "POWERBI_DISP_BOLHA_PONTO"));
        video04.add(new Conteudo("POWERBI_TREEMAP_SLICER", "POWERBI_TREEMAP_SLICER"));
        video04.add(new Conteudo("POWERBI_MAPAS", "POWERBI_MAPAS"));
        video04.add(new Conteudo("POWERBI_MATRIZ_REL_PAINEL", "POWERBI_MATRIZ_REL_PAINEL"));
        secoes.add(new Secao("VÍDEO 04 - Power BI Visualização Avançada", video04));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - Power BI Análise, Colaboração e Segurança
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();
        video05.add(new Conteudo("POWERBI_BLOCOS_ANALISE", "POWERBI_BLOCOS_ANALISE"));
        video05.add(new Conteudo("POWERBI_COLABORACAO", "POWERBI_COLABORACAO"));
        video05.add(new Conteudo("POWERBI_SEGURANCA_AD", "POWERBI_SEGURANCA_AD"));
        secoes.add(new Secao("VÍDEO 05 - Power BI Análise, Colaboração e Segurança", video05));

        // =========================================================
        // SEÇÃO 06: VÍDEO 06 - Power BI Resolução de Questões FGV
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();
        video06.add(new Conteudo("POWERBI_FGV_DRILLDOWN", "POWERBI_FGV_DRILLDOWN"));
        video06.add(new Conteudo("POWERBI_FGV_MAPAS_MATRIZ", "POWERBI_FGV_MAPAS_MATRIZ"));
        secoes.add(new Secao("VÍDEO 06 - Power BI Resolução de Questões FGV", video06));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina("Dashboards Interativos e Power BI", secoes);
    }
}