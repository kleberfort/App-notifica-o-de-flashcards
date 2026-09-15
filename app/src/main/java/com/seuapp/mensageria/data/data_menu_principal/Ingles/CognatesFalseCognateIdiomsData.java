package com.seuapp.mensageria.data.data_menu_principal.Ingles;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class CognatesFalseCognateIdiomsData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Introdução e Técnicas de Leitura
        // =========================================================

        List<Conteudo> introducao = new ArrayList<>();

        introducao.add(
                new Conteudo("ENG_READING_INTRODUCAO",
                        "ENG_READING_INTRODUCAO")
        );

        introducao.add(
                new Conteudo("ENG_SKIMMING",
                        "ENG_SKIMMING")
        );

        introducao.add(
                new Conteudo("ENG_SCANNING",
                        "ENG_SCANNING")
        );

        introducao.add(
                new Conteudo("ENG_SCANNING_SKIMMING_PEQUENOS_TEXTOS",
                        "ENG_SCANNING_SKIMMING_PEQUENOS_TEXTOS")
        );

        introducao.add(
                new Conteudo("ENG_INTERPRETACAO_TEXTOS",
                        "ENG_INTERPRETACAO_TEXTOS")
        );

        secoes.add(new Secao("Introdução e Técnicas de Leitura", introducao));

        // =========================================================
        // SEÇÃO 02: Cognatos e Falsos Cognatos
        // =========================================================

        List<Conteudo> cognatos = new ArrayList<>();

        cognatos.add(
                new Conteudo("ENG_COGNATOS",
                        "ENG_COGNATOS")
        );

        cognatos.add(
                new Conteudo("ENG_FALSOS_COGNATOS",
                        "ENG_FALSOS_COGNATOS")
        );

        cognatos.add(
                new Conteudo("ENG_FALSOS_COGNATOS_LISTA",
                        "ENG_FALSOS_COGNATOS_LISTA")
        );

        secoes.add(new Secao("Cognatos e Falsos Cognatos", cognatos));

        // =========================================================
        // SEÇÃO 03: Expressões Idiomáticas (Idioms)
        // =========================================================

        List<Conteudo> idioms = new ArrayList<>();

        idioms.add(
                new Conteudo("ENG_IDIOMS_INTRODUCAO",
                        "ENG_IDIOMS_INTRODUCAO")
        );

        idioms.add(
                new Conteudo("ENG_IDIOMS_SEMELHANTES",
                        "ENG_IDIOMS_SEMELHANTES")
        );

        idioms.add(
                new Conteudo("ENG_IDIOMS_DIFERENTES",
                        "ENG_IDIOMS_DIFERENTES")
        );

        idioms.add(
                new Conteudo("ENG_IDIOMS_PROVAS",
                        "ENG_IDIOMS_PROVAS")
        );

        secoes.add(new Secao("Expressões Idiomáticas (Idioms)", idioms));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Reading Techniques, Cognates and Idioms",
                secoes
        );
    }
}
