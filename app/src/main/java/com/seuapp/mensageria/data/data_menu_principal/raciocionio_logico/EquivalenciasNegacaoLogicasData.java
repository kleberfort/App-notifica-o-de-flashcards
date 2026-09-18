package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class EquivalenciasNegacaoLogicasData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Equivalências e Negações Lógicas
        // =========================================================

        List<Conteudo> equivalencias = new ArrayList<>();

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_EQUIVALENCIA_LOGICA",
                        "EQUIVALENCIA_NEGACAO_EQUIVALENCIA_LOGICA")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_CONTRAPOSITIVA",
                        "EQUIVALENCIA_NEGACAO_CONTRAPOSITIVA")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_COND_DISJUNCAO",
                        "EQUIVALENCIA_NEGACAO_COND_DISJUNCAO")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_DISJUNCAO_COND",
                        "EQUIVALENCIA_NEGACAO_DISJUNCAO_COND")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_DUPLA_NEGACAO",
                        "EQUIVALENCIA_NEGACAO_DUPLA_NEGACAO")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_DE_MORGAN_CONJUNCAO",
                        "EQUIVALENCIA_NEGACAO_DE_MORGAN_CONJUNCAO")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_DE_MORGAN_DISJUNCAO",
                        "EQUIVALENCIA_NEGACAO_DE_MORGAN_DISJUNCAO")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_NEGACAO_CONDICIONAL",
                        "EQUIVALENCIA_NEGACAO_NEGACAO_CONDICIONAL")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_NEGACAO_CONJ_COND",
                        "EQUIVALENCIA_NEGACAO_NEGACAO_CONJ_COND")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_CONJUNCAO_CONDICIONAIS",
                        "EQUIVALENCIA_NEGACAO_CONJUNCAO_CONDICIONAIS")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_EQUIV_DISJ_EXCLUSIVA",
                        "EQUIVALENCIA_NEGACAO_EQUIV_DISJ_EXCLUSIVA")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_NEGACAO_DISJ_EXCLUSIVA",
                        "EQUIVALENCIA_NEGACAO_NEGACAO_DISJ_EXCLUSIVA")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_EQUIV_BICONDICIONAL",
                        "EQUIVALENCIA_NEGACAO_EQUIV_BICONDICIONAL")
        );

        equivalencias.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_NEGACAO_BICONDICIONAL",
                        "EQUIVALENCIA_NEGACAO_NEGACAO_BICONDICIONAL")
        );

        secoes.add(new Secao("Equivalências e Negações Lógicas", equivalencias));

        // =========================================================
        // SEÇÃO 02: Álgebra de Proposições
        // =========================================================

        List<Conteudo> algebra = new ArrayList<>();

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_COMUTATIVA",
                        "EQUIVALENCIA_NEGACAO_PROP_COMUTATIVA")
        );

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_ASSOCIATIVA",
                        "EQUIVALENCIA_NEGACAO_PROP_ASSOCIATIVA")
        );

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_DISTRIBUTIVA",
                        "EQUIVALENCIA_NEGACAO_PROP_DISTRIBUTIVA")
        );

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_IDENTIDADE",
                        "EQUIVALENCIA_NEGACAO_PROP_IDENTIDADE")
        );

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_ABSORCAO",
                        "EQUIVALENCIA_NEGACAO_PROP_ABSORCAO")
        );

        algebra.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_PROP_IDEMPOTENCIA",
                        "EQUIVALENCIA_NEGACAO_PROP_IDEMPOTENCIA")
        );

        secoes.add(new Secao("Álgebra de Proposições", algebra));

        // =========================================================
        // SEÇÃO 03: Álgebra x Tautologia, Contradição e Contingência
        // =========================================================

        List<Conteudo> algebraTaut = new ArrayList<>();

        algebraTaut.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_ALGEBRA_TAUTOLOGIA",
                        "EQUIVALENCIA_NEGACAO_ALGEBRA_TAUTOLOGIA")
        );

        algebraTaut.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_ALGEBRA_CONTRADICAO",
                        "EQUIVALENCIA_NEGACAO_ALGEBRA_CONTRADICAO")
        );

        algebraTaut.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_BICOND_TAUT_CONTRAD",
                        "EQUIVALENCIA_NEGACAO_BICOND_TAUT_CONTRAD")
        );

        secoes.add(new Secao("Álgebra x Tautologia, Contradição e Contingência", algebraTaut));

        // =========================================================
        // SEÇÃO 04: Questões Comentadas - FGV
        // =========================================================

        List<Conteudo> fgv = new ArrayList<>();

        fgv.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_FGV_EQUIVALENCIA",
                        "EQUIVALENCIA_NEGACAO_FGV_EQUIVALENCIA")
        );

        fgv.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_FGV_NEGACAO",
                        "EQUIVALENCIA_NEGACAO_FGV_NEGACAO")
        );

        fgv.add(
                new Conteudo("EQUIVALENCIA_NEGACAO_FGV_ALGEBRA",
                        "EQUIVALENCIA_NEGACAO_FGV_ALGEBRA")
        );

        secoes.add(new Secao("Questões Comentadas - FGV", fgv));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Equivalências e Negações Lógicas",
                secoes
        );
    }
}
