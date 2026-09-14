package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class EstruturaLogica_1_Data {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Introdução às Proposições
        // =========================================================

        List<Conteudo> introducao = new ArrayList<>();

        introducao.add(
                new Conteudo("EST_LOG_1_DEFINICAO_PROPOSICAO",
                        "EST_LOG_1_DEFINICAO_PROPOSICAO")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_ORACAO_DECLARATIVA",
                        "EST_LOG_1_ORACAO_DECLARATIVA")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_NAO_PROPOSICOES",
                        "EST_LOG_1_NAO_PROPOSICOES")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_SENTENCA_VS_EXPRESSAO",
                        "EST_LOG_1_SENTENCA_VS_EXPRESSAO")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_SENTENCAS_ABERTAS",
                        "EST_LOG_1_SENTENCAS_ABERTAS")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_QUANTIFICADORES",
                        "EST_LOG_1_QUANTIFICADORES")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_PARADOXOS_SUBJETIVIDADE",
                        "EST_LOG_1_PARADOXOS_SUBJETIVIDADE")
        );

        introducao.add(
                new Conteudo("EST_LOG_1_LOGICABIVALENTE",
                        "EST_LOG_1_LOGICABIVALENTE")
        );

        secoes.add(new Secao("Introdução às Proposições", introducao));

        // =========================================================
        // SEÇÃO 02: Proposições Simples
        // =========================================================

        List<Conteudo> simples = new ArrayList<>();

        simples.add(
                new Conteudo("EST_LOG_1_PROP_SIMPLES",
                        "EST_LOG_1_PROP_SIMPLES")
        );

        simples.add(
                new Conteudo("EST_LOG_1_NEGACAO_SIMPLES",
                        "EST_LOG_1_NEGACAO_SIMPLES")
        );

        simples.add(
                new Conteudo("EST_LOG_1_NEGACAO_DECLARATIVA_NEGATIVA",
                        "EST_LOG_1_NEGACAO_DECLARATIVA_NEGATIVA")
        );

        simples.add(
                new Conteudo("EST_LOG_1_NEGACAO_ORACAO_PRINCIPAL",
                        "EST_LOG_1_NEGACAO_ORACAO_PRINCIPAL")
        );

        simples.add(
                new Conteudo("EST_LOG_1_DUPLA_NEGACAO",
                        "EST_LOG_1_DUPLA_NEGACAO")
        );

        secoes.add(new Secao("Proposições Simples", simples));

        // =========================================================
        // SEÇÃO 03: Proposições Compostas
        // =========================================================

        List<Conteudo> compostas = new ArrayList<>();

        compostas.add(
                new Conteudo("EST_LOG_1_PROP_COMPOSTAS",
                        "EST_LOG_1_PROP_COMPOSTAS")
        );

        compostas.add(
                new Conteudo("EST_LOG_1_CONJUNCAO",
                        "EST_LOG_1_CONJUNCAO")
        );

        compostas.add(
                new Conteudo("EST_LOG_1_DISJUNCAO_INCLUSIVA",
                        "EST_LOG_1_DISJUNCAO_INCLUSIVA")
        );

        compostas.add(
                new Conteudo("EST_LOG_1_DISJUNCAO_EXCLUSIVA",
                        "EST_LOG_1_DISJUNCAO_EXCLUSIVA")
        );

        compostas.add(
                new Conteudo("EST_LOG_1_CONDICIONAL",
                        "EST_LOG_1_CONDICIONAL")
        );

        compostas.add(
                new Conteudo("EST_LOG_1_BICONDICIONAL",
                        "EST_LOG_1_BICONDICIONAL")
        );

        secoes.add(new Secao("Proposições Compostas", compostas));

        // =========================================================
        // SEÇÃO 04: Formas Alternativas de Conectivos
        // =========================================================

        List<Conteudo> formas = new ArrayList<>();

        formas.add(
                new Conteudo("EST_LOG_1_FORMAS_CONDICIONAL",
                        "EST_LOG_1_FORMAS_CONDICIONAL")
        );

        formas.add(
                new Conteudo("EST_LOG_1_FORMAS_BICONDICIONAL",
                        "EST_LOG_1_FORMAS_BICONDICIONAL")
        );

        formas.add(
                new Conteudo("EST_LOG_1_FORMAS_DISJUNCAO_EXCLUSIVA",
                        "EST_LOG_1_FORMAS_DISJUNCAO_EXCLUSIVA")
        );

        secoes.add(new Secao("Formas Alternativas de Conectivos", formas));

        // =========================================================
        // SEÇÃO 05: Condição Suficiente e Necessária
        // =========================================================

        List<Conteudo> condicoes = new ArrayList<>();

        condicoes.add(
                new Conteudo("EST_LOG_1_COND_SUFICIENTE_NECESSARIA",
                        "EST_LOG_1_COND_SUFICIENTE_NECESSARIA")
        );

        condicoes.add(
                new Conteudo("EST_LOG_1_BICOND_NECESSARIA_SUFICIENTE",
                        "EST_LOG_1_BICOND_NECESSARIA_SUFICIENTE")
        );

        condicoes.add(
                new Conteudo("EST_LOG_1_NOMENCLATURA_CONDICIONAL",
                        "EST_LOG_1_NOMENCLATURA_CONDICIONAL")
        );

        secoes.add(new Secao("Condição Suficiente e Necessária", condicoes));

        // =========================================================
        // SEÇÃO 06: Macetes das Tabelas-Verdade
        // =========================================================

        List<Conteudo> macetes = new ArrayList<>();

        macetes.add(
                new Conteudo("EST_LOG_1_MACETES_TABELAS",
                        "EST_LOG_1_MACETES_TABELAS")
        );

        secoes.add(new Secao("Macetes das Tabelas-Verdade", macetes));

        // =========================================================
        // SEÇÃO 07: Questões Comentadas - FGV
        // =========================================================

        List<Conteudo> fgv = new ArrayList<>();

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CONDICIONAL_FALSA",
                        "EST_LOG_1_FGV_CONDICIONAL_FALSA")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_DISJUNCAO_FALSA",
                        "EST_LOG_1_FGV_DISJUNCAO_FALSA")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CONJUNCAO_VERDADEIRA",
                        "EST_LOG_1_FGV_CONJUNCAO_VERDADEIRA")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CONDICIONAL_VERDADEIRA",
                        "EST_LOG_1_FGV_CONDICIONAL_VERDADEIRA")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CASOS_PRATICOS",
                        "EST_LOG_1_FGV_CASOS_PRATICOS")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CARTAS_PRIMO",
                        "EST_LOG_1_FGV_CARTAS_PRIMO")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_CONTRA_EXEMPLO",
                        "EST_LOG_1_FGV_CONTRA_EXEMPLO")
        );

        fgv.add(
                new Conteudo("EST_LOG_1_FGV_SOMENTE_SE",
                        "EST_LOG_1_FGV_SOMENTE_SE")
        );

        secoes.add(new Secao("Questões Comentadas - FGV", fgv));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Estrutura Lógica 1 - Proposições",
                secoes
        );
    }
}
