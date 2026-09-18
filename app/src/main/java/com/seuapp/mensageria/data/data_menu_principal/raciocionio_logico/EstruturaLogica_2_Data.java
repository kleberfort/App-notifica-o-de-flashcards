package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class EstruturaLogica_2_Data {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Conversão de Linguagem
        // =========================================================

        List<Conteudo> conversao = new ArrayList<>();

        conversao.add(
                new Conteudo("EST_LOG_2_CONVERSAO_LINGUAGEM",
                        "EST_LOG_2_CONVERSAO_LINGUAGEM")
        );

        conversao.add(
                new Conteudo("EST_LOG_2_ORDEM_PRECEDENCIA",
                        "EST_LOG_2_ORDEM_PRECEDENCIA")
        );

        conversao.add(
                new Conteudo("EST_LOG_2_VIRGULAS_PARENTESES",
                        "EST_LOG_2_VIRGULAS_PARENTESES")
        );

        conversao.add(
                new Conteudo("EST_LOG_2_NAO_E_VERDADE",
                        "EST_LOG_2_NAO_E_VERDADE")
        );

        conversao.add(
                new Conteudo("EST_LOG_2_ANALISE_SIGNIFICADO",
                        "EST_LOG_2_ANALISE_SIGNIFICADO")
        );

        secoes.add(new Secao("Conversão de Linguagem", conversao));

        // =========================================================
        // SEÇÃO 02: Tabela-Verdade
        // =========================================================

        List<Conteudo> tabelaVerdade = new ArrayList<>();

        tabelaVerdade.add(
                new Conteudo("EST_LOG_2_TABELA_VERDADE",
                        "EST_LOG_2_TABELA_VERDADE")
        );

        tabelaVerdade.add(
                new Conteudo("EST_LOG_2_CONSTRUCAO_TABELA",
                        "EST_LOG_2_CONSTRUCAO_TABELA")
        );

        tabelaVerdade.add(
                new Conteudo("EST_LOG_2_NUMERO_LINHAS",
                        "EST_LOG_2_NUMERO_LINHAS")
        );

        secoes.add(new Secao("Tabela-Verdade", tabelaVerdade));

        // =========================================================
        // SEÇÃO 03: Tautologia, Contradição e Contingência
        // =========================================================

        List<Conteudo> tautologia = new ArrayList<>();

        tautologia.add(
                new Conteudo("EST_LOG_2_TAUTOLOGIA",
                        "EST_LOG_2_TAUTOLOGIA")
        );

        tautologia.add(
                new Conteudo("EST_LOG_2_CONTRADICAO",
                        "EST_LOG_2_CONTRADICAO")
        );

        tautologia.add(
                new Conteudo("EST_LOG_2_CONTINGENCIA",
                        "EST_LOG_2_CONTINGENCIA")
        );

        tautologia.add(
                new Conteudo("EST_LOG_2_METODO_ABSURDO",
                        "EST_LOG_2_METODO_ABSURDO")
        );

        tautologia.add(
                new Conteudo("EST_LOG_2_IMPLICACAO",
                        "EST_LOG_2_IMPLICACAO")
        );

        secoes.add(new Secao("Tautologia, Contradição e Contingência", tautologia));

        // =========================================================
        // SEÇÃO 04: Questões Comentadas - FGV
        // =========================================================

        List<Conteudo> fgv = new ArrayList<>();

        fgv.add(
                new Conteudo("EST_LOG_2_FGV_TABELA_VERDADE",
                        "EST_LOG_2_FGV_TABELA_VERDADE")
        );

        fgv.add(
                new Conteudo("EST_LOG_2_FGV_DISJUNCOES",
                        "EST_LOG_2_FGV_DISJUNCOES")
        );

        secoes.add(new Secao("Questões Comentadas - FGV", fgv));

        // =========================================================
        // SEÇÃO 05: Questões Comentadas - Multibancas
        // =========================================================

        List<Conteudo> multibancas = new ArrayList<>();

        multibancas.add(
                new Conteudo("EST_LOG_2_MULTI_CONVERSAO",
                        "EST_LOG_2_MULTI_CONVERSAO")
        );

        multibancas.add(
                new Conteudo("EST_LOG_2_MULTI_TAUTOLOGIA",
                        "EST_LOG_2_MULTI_TAUTOLOGIA")
        );

        multibancas.add(
                new Conteudo("EST_LOG_2_MULTI_CONTRADICAO",
                        "EST_LOG_2_MULTI_CONTRADICAO")
        );

        secoes.add(new Secao("Questões Comentadas - Multibancas", multibancas));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Estrutura Lógica 2 - Tabela-Verdade e Tautologia",
                secoes
        );
    }
}
