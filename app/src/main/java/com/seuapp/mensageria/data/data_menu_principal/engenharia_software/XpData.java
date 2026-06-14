package com.seuapp.mensageria.data.data_menu_principal.engenharia_software;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class XpData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();


        // =====================================
        // SEÇÃO: Conceitos Fundamentais
        // =====================================

        List<Conteudo> conceitosFundamentais = new ArrayList<>();

        conceitosFundamentais.add(
                new Conteudo("XP_CONCEITO", "O que é Extreme Programming?")
        );

        conceitosFundamentais.add(
                new Conteudo("XP_CRIADOR", "Quem criou o XP?")
        );

        conceitosFundamentais.add(
                new Conteudo("XP_SIGNIFICADO_NOME", "Significado do nome Extreme Programming")
        );

        conceitosFundamentais.add(
                new Conteudo("XP_PROJETO_C3", "Primeiro projeto XP (C3)")
        );

        secoes.add(
                new Secao("Conceitos Fundamentais", conceitosFundamentais)
        );


        // =====================================
        // SEÇÃO: Atividades Básicas
        // =====================================

        List<Conteudo> atividadesBasicas = new ArrayList<>();

        atividadesBasicas.add(
                new Conteudo("XP_ATIVIDADES_BASICAS",
                        "Quais as 4 atividades básicas do XP?")
        );

        secoes.add(
                new Secao("Atividades Básicas", atividadesBasicas)
        );


        // =====================================
        // SEÇÃO: Valores do XP
        // =====================================

        List<Conteudo> valores = new ArrayList<>();

        valores.add(
                new Conteudo("XP_VALORES",
                        "Quais são os 5 valores do XP?")
        );

        valores.add(
                new Conteudo("XP_VALOR_CORAGEM",
                        "Valor associado a dizer a verdade ao cliente")
        );

        valores.add(
                new Conteudo("XP_VALORES_COMPARACAO",
                        "Valores exclusivos do XP vs Scrum")
        );

        secoes.add(
                new Secao("Valores do XP", valores)
        );


        // =====================================
        // SEÇÃO: Práticas do XP
        // =====================================

        List<Conteudo> praticas = new ArrayList<>();

        praticas.add(new Conteudo("XP_TDD", "TDD"));
        praticas.add(new Conteudo("XP_PAIR_PROGRAMMING", "Pair Programming"));
        praticas.add(new Conteudo("XP_REFACTORING", "Refatoração"));
        praticas.add(new Conteudo("XP_SIMPLE_DESIGN", "Simple Design"));
        praticas.add(new Conteudo("XP_INTEGRACAO_CONTINUA", "Integração Contínua"));

        secoes.add(
                new Secao("Práticas do XP", praticas)
        );


        // =====================================
        // SEÇÃO: XP vs Scrum
        // =====================================

        List<Conteudo> xpVsScrum = new ArrayList<>();

        xpVsScrum.add(
                new Conteudo("XP_VS_SCRUM",
                        "Diferença principal entre XP e Scrum")
        );

        xpVsScrum.add(
                new Conteudo("XP_APLICABILIDADE",
                        "Onde o XP pode ser usado?")
        );

        secoes.add(
                new Secao("XP vs Scrum", xpVsScrum)
        );


        // =====================================
        // SEÇÃO: Manifesto Ágil
        // =====================================

        List<Conteudo> manifestoAgil = new ArrayList<>();

        manifestoAgil.add(
                new Conteudo("MANIFESTO_AGIL_VALORES",
                        "Quais os 4 valores do Manifesto Ágil?")
        );

        secoes.add(
                new Secao("Manifesto Ágil", manifestoAgil)
        );


        // =====================================
        // RETORNO FINAL
        // =====================================

        return new Disciplina(
                "XP (Extreme Programming)",
                secoes
        );
    }
}