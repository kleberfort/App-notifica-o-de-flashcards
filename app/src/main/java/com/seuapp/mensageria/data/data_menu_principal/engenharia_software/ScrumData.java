package com.seuapp.mensageria.data.data_menu_principal.engenharia_software;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ScrumData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();


        // =====================================
        // SEÇÃO: Conceitos
        // =====================================

        List<Conteudo> conceitos = new ArrayList<>();

        conceitos.add(
                new Conteudo("SCRUM_CONCEITO", "O que é SCRUM?")
        );

        conceitos.add(
                new Conteudo("SCRUM_CYNEFIN",
                        "Teoria da Complexidade (Cynefin)")
        );

        conceitos.add(
                new Conteudo("SCRUM_CILADAS_CONCEITO",
                        "Principais Ciladas")
        );

        secoes.add(
                new Secao("Conceitos", conceitos)
        );


        // =====================================
        // SEÇÃO: Papéis
        // =====================================

        List<Conteudo> papeis = new ArrayList<>();

        papeis.add(new Conteudo("PAPEL_PO", "Product Owner (PO)"));
        papeis.add(new Conteudo("PAPEL_PO_REGRA_OURO", "PO - Regra de Ouro"));
        papeis.add(new Conteudo("PAPEL_TIME", "Time de Desenvolvimento"));
        papeis.add(new Conteudo("PAPEL_TIME_RESP", "Responsabilidades do Time"));
        papeis.add(new Conteudo("PAPEL_SM", "Scrum Master"));
        papeis.add(new Conteudo("PAPEL_SM_PROIBICOES", "Proibições do SM"));

        secoes.add(
                new Secao("Papéis", papeis)
        );


        // =====================================
        // SEÇÃO: Artefatos
        // =====================================

        List<Conteudo> artefatos = new ArrayList<>();

        artefatos.add(new Conteudo("ARTEFATO_PB", "Product Backlog"));
        artefatos.add(new Conteudo("ARTEFATO_PB_CARACTERISTICAS", "Características do PB"));
        artefatos.add(new Conteudo("ARTEFATO_SB", "Sprint Backlog"));
        artefatos.add(new Conteudo("ARTEFATO_DOD", "Definition of Done"));
        artefatos.add(new Conteudo("ARTEFATO_INCREMENTO_META", "Incremento e Meta"));
        artefatos.add(new Conteudo("ARTEFATO_BURNDOWN", "Burndown Chart"));

        secoes.add(
                new Secao("Artefatos", artefatos)
        );


        // =====================================
        // SEÇÃO: Estimativas
        // =====================================

        List<Conteudo> estimativas = new ArrayList<>();

        estimativas.add(new Conteudo("ESTIMATIVA_CONCEITO", "Estimativas Ágeis"));
        estimativas.add(new Conteudo("ESTIMATIVA_PLANNING_POKER", "Planning Poker"));
        estimativas.add(new Conteudo("ESTIMATIVA_VELOCIDADE", "Velocity"));
        estimativas.add(new Conteudo("ESTIMATIVA_USER_STORIES", "User Stories"));

        secoes.add(
                new Secao("Estimativas", estimativas)
        );


        // =====================================
        // SEÇÃO: Eventos
        // =====================================

        List<Conteudo> eventos = new ArrayList<>();

        eventos.add(new Conteudo("EVENTO_SPRINT", "Sprint"));
        eventos.add(new Conteudo("EVENTO_PLANNING", "Sprint Planning"));
        eventos.add(new Conteudo("EVENTO_DAILY", "Daily Scrum"));
        eventos.add(new Conteudo("EVENTO_REVIEW", "Sprint Review"));
        eventos.add(new Conteudo("EVENTO_RETROSPECTIVE", "Sprint Retrospective"));
        eventos.add(new Conteudo("EVENTO_ORDEM", "Ordem dos Eventos"));

        secoes.add(
                new Secao("Eventos", eventos)
        );


        // =====================================
        // SEÇÃO: Comparações
        // =====================================

        List<Conteudo> comparacoes = new ArrayList<>();

        comparacoes.add(new Conteudo("COMPARA_SCRUM_XP", "Scrum vs XP"));
        comparacoes.add(new Conteudo("COMPARA_SCRUM_KANBAN", "Scrum vs Kanban"));
        comparacoes.add(new Conteudo("COMPARA_KANBAN", "Fundamentos do Kanban"));

        secoes.add(
                new Secao("Comparações", comparacoes)
        );


        // =====================================
        // SEÇÃO: Resumo
        // =====================================

        List<Conteudo> resumo = new ArrayList<>();

        resumo.add(new Conteudo("RESUMO_QUEM_FAZ", "Quem faz o quê"));
        resumo.add(new Conteudo("RESUMO_CILADAS_MORAIS", "Ciladas Morais"));
        resumo.add(new Conteudo("RESUMO_REGRAS_OURO", "Regras de Ouro"));

        secoes.add(
                new Secao("Resumo", resumo)
        );


        // =====================================
        // RETORNO FINAL
        // =====================================

        return new Disciplina(
                "Scrum",
                secoes
        );
    }
}