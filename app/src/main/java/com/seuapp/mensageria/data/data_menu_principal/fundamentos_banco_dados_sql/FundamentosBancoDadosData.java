package com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class FundamentosBancoDadosData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - INTRODUÇÃO E PROCESSAMENTO DE DADOS
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo(
                "DADO_INFORMACAO",
                "DADO_INFORMACAO"
        ));

        video01.add(new Conteudo(
                "PIRAMIDE_ABSTRACAO",
                "PIRAMIDE_ABSTRACAO"
        ));

        video01.add(new Conteudo(
                "TIPOS_CONHECIMENTO",
                "TIPOS_CONHECIMENTO"
        ));

        video01.add(new Conteudo(
                "TRANSMISSAO_CONHECIMENTO",
                "TRANSMISSAO_CONHECIMENTO"
        ));

        video01.add(new Conteudo(
                "TIPOS_DADOS",
                "TIPOS_DADOS"
        ));

        secoes.add(new Secao(
                "Fundamentos de Ciência de Dados - Conceitos Básicos",
                video01
        ));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - DADOS ABERTOS E CICLO DE VIDA DO DADO
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(new Conteudo(
                "DADOS_ABERTOS",
                "DADOS_ABERTOS"
        ));

        video02.add(new Conteudo(
                "LEIS_DADOS_ABERTOS",
                "LEIS_DADOS_ABERTOS"
        ));

        video02.add(new Conteudo(
                "PRINCIPIOS_DADOS_ABERTOS",
                "PRINCIPIOS_DADOS_ABERTOS"
        ));


        video02.add(new Conteudo(
                "LAI_TRANSPARENCIA",
                "LAI_TRANSPARENCIA"
        ));

        video02.add(new Conteudo(
                "CICLO_VIDA_DADO",
                "CICLO_VIDA_DADO"
        ));

        secoes.add(new Secao(
                "Dados Abertos e Ciclo de Vida do Dado",
                video02
        ));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - INTRODUÇÃO A BANCO DE DADOS E SGBD
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo(
                "CONCEITO_BD",
                "CONCEITO_BD"
        ));

        video03.add(new Conteudo(
                "CONCEITO_SGBD",
                "CONCEITO_SGBD"
        ));

        video03.add(new Conteudo(
                "FUNCIONALIDADES_SGBD",
                "FUNCIONALIDADES_SGBD"
        ));

        video03.add(new Conteudo(
                "SBD_APLICACOES",
                "SBD_APLICACOES"
        ));

        secoes.add(new Secao(
                "Introdução a Banco de Dados e SGBD",
                video03
        ));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - CONCEITOS BÁSICOS DE BD E SGBD (DETALHAMENTO)
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo(
                "CONCEITO_BD",
                "CONCEITO_BD"
        ));

        video04.add(new Conteudo(
                "SGBD_DETALHADO",
                "SGBD_DETALHADO"
        ));

        secoes.add(new Secao(
                "Conceitos Básicos de BD e SGBD - Detalhamento",
                video04
        ));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - CARACTERÍSTICAS DOS BDs RELACIONAIS
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo(
                "CARACTERISTICAS_RELACIONAL",
                "CARACTERISTICAS_RELACIONAL"
        ));

        video05.add(new Conteudo(
                "METADADOS",
                "METADADOS"
        ));

        video05.add(new Conteudo(
                "TIPOS_BD",
                "TIPOS_BD"
        ));

        secoes.add(new Secao(
                "Características dos Bancos de Dados Relacionais",
                video05
        ));

        // =========================================================
        // SEÇÃO 06: VÍDEO 06 - QUESTÕES COMENTADAS - CARACTERÍSTICAS
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(new Conteudo(
                "QUESTOES_RELACIONAIS",
                "QUESTOES_RELACIONAIS"
        ));

        video06.add(new Conteudo(
                "QUESTOES_SGBD",
                "QUESTOES_SGBD"
        ));

        secoes.add(new Secao(
                "Questões Comentadas - Características Relacionais e SGBD",
                video06
        ));

        // =========================================================
        // SEÇÃO 07: VÍDEO 07 - TRANSAÇÕES - PROPRIEDADES ACID
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(new Conteudo(
                "ACID",
                "ACID"
        ));

        video07.add(new Conteudo(
                "COMMIT_ROLLBACK",
                "COMMIT_ROLLBACK"
        ));

        secoes.add(new Secao(
                "Transações em Banco de Dados Relacionais - Propriedades ACID",
                video07
        ));

        // =========================================================
        // SEÇÃO 08: VÍDEO 08 - DBA vs DA
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(new Conteudo(
                "DBA_DA_COMPARATIVO",
                "DBA_DA_COMPARATIVO"
        ));

        video08.add(new Conteudo(
                "DBA_RESPONSABILIDADES",
                "DBA_RESPONSABILIDADES"
        ));

        video08.add(new Conteudo(
                "DA_RESPONSABILIDADES",
                "DA_RESPONSABILIDADES"
        ));

        secoes.add(new Secao(
                "Administrador de Banco de Dados vs Administrador de Dados",
                video08
        ));

        // =========================================================
        // SEÇÃO 09: VÍDEO 09 - ARQUITETURA ANSI/SPARC
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(new Conteudo(
                "ANSI_SPARC_NIVEIS",
                "ANSI_SPARC_NIVEIS"
        ));

        video09.add(new Conteudo(
                "ESQUEMA_INSTANCIA",
                "ESQUEMA_INSTANCIA"
        ));

        secoes.add(new Secao(
                "Arquitetura ANSI/SPARC e Níveis de Abstração",
                video09
        ));

        // =========================================================
        // SEÇÃO 10: VÍDEO 10 - INDEPENDÊNCIA DE DADOS
        // =========================================================

        List<Conteudo> video10 = new ArrayList<>();

        video10.add(new Conteudo(
                "INDEPENDENCIA_DADOS",
                "INDEPENDENCIA_DADOS"
        ));

        secoes.add(new Secao(
                "Arquitetura ANSI/SPARC - Independência de Dados",
                video10
        ));

        // =========================================================
        // SEÇÃO 11: VÍDEO 11 - QUESTÕES COMENTADAS - ANSI/SPARC
        // =========================================================

        List<Conteudo> video11 = new ArrayList<>();

        video11.add(new Conteudo(
                "ANSI_SPARC_NIVEIS",
                "ANSI_SPARC_NIVEIS"
        ));

        video11.add(new Conteudo(
                "INDEPENDENCIA_DADOS",
                "INDEPENDENCIA_DADOS"
        ));

        secoes.add(new Secao(
                "Arquitetura ANSI/SPARC - Questões Comentadas",
                video11
        ));

        // =========================================================
        // SEÇÃO 12: VÍDEO 12 - PROJETOS DE BD - MODELOS
        // =========================================================

        List<Conteudo> video12 = new ArrayList<>();

        video12.add(new Conteudo(
                "MODELO_CONCEITUAL",
                "MODELO_CONCEITUAL"
        ));

        video12.add(new Conteudo(
                "MODELO_LOGICO",
                "MODELO_LOGICO"
        ));

        video12.add(new Conteudo(
                "MODELO_FISICO",
                "MODELO_FISICO"
        ));

        secoes.add(new Secao(
                "Projetos de Banco de Dados - Modelos Conceitual, Lógico e Físico",
                video12
        ));

        // =========================================================
        // SEÇÃO 13: VÍDEO 13 - QUESTÕES COMENTADAS - PROJETOS
        // =========================================================

        List<Conteudo> video13 = new ArrayList<>();

        video13.add(new Conteudo(
                "MODELO_CONCEITUAL",
                "MODELO_CONCEITUAL"
        ));

        video13.add(new Conteudo(
                "MODELO_LOGICO",
                "MODELO_LOGICO"
        ));

        video13.add(new Conteudo(
                "MODELO_FISICO",
                "MODELO_FISICO"
        ));

        secoes.add(new Secao(
                "Projetos de Banco de Dados - Questões Comentadas",
                video13
        ));

        // =========================================================
        // SEÇÃO 14: RESUMÃO FINAL
        // =========================================================

        List<Conteudo> resumoFinal = new ArrayList<>();

        resumoFinal.add(new Conteudo(
                "RESUMO_BD",
                "RESUMO_BD"
        ));

        secoes.add(new Secao(
                "Mapa Mental - Revisão Rápida",
                resumoFinal
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Fundamentos de Banco de Dados - Conceitos para Concursos",
                secoes
        );
    }
}
