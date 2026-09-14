package com.seuapp.mensageria.data.data_menu_principal.Ingles;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class IntroducaoScammingSkimmingData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Técnicas de Leitura
        // =========================================================

        List<Conteudo> tecnicasLeitura = new ArrayList<>();

        tecnicasLeitura.add(
                new Conteudo("ING_INTRODUCAO_SKIMMING_DEFINICAO",
                        "ING_INTRODUCAO_SKIMMING_DEFINICAO")
        );

        tecnicasLeitura.add(
                new Conteudo("ING_INTRODUCAO_SCANNING_DEFINICAO",
                        "ING_INTRODUCAO_SCANNING_DEFINICAO")
        );

        tecnicasLeitura.add(
                new Conteudo("ING_INTRODUCAO_INFERENCIA_CONTEXTUAL",
                        "ING_INTRODUCAO_INFERENCIA_CONTEXTUAL")
        );

        secoes.add(new Secao("Técnicas de Leitura", tecnicasLeitura));

        // =========================================================
        // SEÇÃO 02: Cognatos e Falsos Cognatos
        // =========================================================

        List<Conteudo> cognatosFalsos = new ArrayList<>();

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_COGNATOS_AJUDANTES",
                        "ING_INTRODUCAO_COGNATOS_AJUDANTES")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_REALIZE",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_REALIZE")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_PREJUDICE",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_PREJUDICE")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_COLLEGE",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_COLLEGE")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_FABRIC",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_FABRIC")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_PASTA",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_PASTA")
        );

        cognatosFalsos.add(
                new Conteudo("ING_INTRODUCAO_FALSOS_COGNATOS_VISITANT",
                        "ING_INTRODUCAO_FALSOS_COGNATOS_VISITANT")
        );

        secoes.add(new Secao("Cognatos e Falsos Cognatos", cognatosFalsos));

        // =========================================================
        // SEÇÃO 03: Gramática - Ordem e Sujeito
        // =========================================================

        List<Conteudo> ordemSujeito = new ArrayList<>();

        ordemSujeito.add(
                new Conteudo("ING_INTRODUCAO_ORDEM_ADJETIVO",
                        "ING_INTRODUCAO_ORDEM_ADJETIVO")
        );

        ordemSujeito.add(
                new Conteudo("ING_INTRODUCAO_SUJEITO_OBRIGATORIO",
                        "ING_INTRODUCAO_SUJEITO_OBRIGATORIO")
        );

        secoes.add(new Secao("Gramática - Ordem e Sujeito", ordemSujeito));

        // =========================================================
        // SEÇÃO 04: Verbos
        // =========================================================

        List<Conteudo> verbos = new ArrayList<>();

        verbos.add(
                new Conteudo("ING_INTRODUCAO_VERBO_PRESENTE",
                        "ING_INTRODUCAO_VERBO_PRESENTE")
        );

        verbos.add(
                new Conteudo("ING_INTRODUCAO_VERBO_PASSADO",
                        "ING_INTRODUCAO_VERBO_PASSADO")
        );

        verbos.add(
                new Conteudo("ING_INTRODUCAO_VERBO_FUTURO",
                        "ING_INTRODUCAO_VERBO_FUTURO")
        );

        verbos.add(
                new Conteudo("ING_INTRODUCAO_MACETE_PASSADO_REGULAR",
                        "ING_INTRODUCAO_MACETE_PASSADO_REGULAR")
        );

        secoes.add(new Secao("Verbos", verbos));

        // =========================================================
        // SEÇÃO 05: Ciladas e Antídotos
        // =========================================================

        List<Conteudo> ciladas = new ArrayList<>();

        ciladas.add(
                new Conteudo("ING_INTRODUCAO_CILADA_TRADUCAO",
                        "ING_INTRODUCAO_CILADA_TRADUCAO")
        );

        ciladas.add(
                new Conteudo("ING_INTRODUCAO_CILADA_PASSADO_ED",
                        "ING_INTRODUCAO_CILADA_PASSADO_ED")
        );

        ciladas.add(
                new Conteudo("ING_INTRODUCAO_CILADA_FALSOS_COGNATOS",
                        "ING_INTRODUCAO_CILADA_FALSOS_COGNATOS")
        );

        secoes.add(new Secao("Ciladas e Antídotos", ciladas));

        // =========================================================
        // SEÇÃO 06: Fontes para Estudo
        // =========================================================

        List<Conteudo> fontes = new ArrayList<>();

        fontes.add(
                new Conteudo("ING_INTRODUCAO_FONTES_TEXTO_CONCURSOS",
                        "ING_INTRODUCAO_FONTES_TEXTO_CONCURSOS")
        );

        secoes.add(new Secao("Fontes para Estudo", fontes));

        // =========================================================
        // SEÇÃO 07: Interpretação de Imagens
        // =========================================================

        List<Conteudo> interpretacaoImagens = new ArrayList<>();

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_IMAGENS_REGRA_OURO",
                        "ING_INTRODUCAO_IMAGENS_REGRA_OURO")
        );

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_PERSONAGENS_GARFIELD",
                        "ING_INTRODUCAO_PERSONAGENS_GARFIELD")
        );

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_PERSONAGENS_MAFALDA",
                        "ING_INTRODUCAO_PERSONAGENS_MAFALDA")
        );

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_PERSONAGENS_PEANUTS",
                        "ING_INTRODUCAO_PERSONAGENS_PEANUTS")
        );

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_PERSONAGENS_HAGAR",
                        "ING_INTRODUCAO_PERSONAGENS_HAGAR")
        );

        interpretacaoImagens.add(
                new Conteudo("ING_INTRODUCAO_ANALISE_IMAGENS",
                        "ING_INTRODUCAO_ANALISE_IMAGENS")
        );

        secoes.add(new Secao("Interpretação de Imagens", interpretacaoImagens));

        // =========================================================
        // SEÇÃO 08: Expressões Idiomáticas
        // =========================================================

        List<Conteudo> idioms = new ArrayList<>();

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_BETTER_LATE",
                        "ING_INTRODUCAO_IDIOM_BETTER_LATE")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_WORD_TO_WISE",
                        "ING_INTRODUCAO_IDIOM_WORD_TO_WISE")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_SOME_OTHER_TIME",
                        "ING_INTRODUCAO_IDIOM_SOME_OTHER_TIME")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_ONCE_BLUE_MOON",
                        "ING_INTRODUCAO_IDIOM_ONCE_BLUE_MOON")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_ONCE_AND_ALL",
                        "ING_INTRODUCAO_IDIOM_ONCE_AND_ALL")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_WE_ARE_EVEN",
                        "ING_INTRODUCAO_IDIOM_WE_ARE_EVEN")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_ROCK_HARD_PLACE",
                        "ING_INTRODUCAO_IDIOM_ROCK_HARD_PLACE")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_JACK_TO_TRADE",
                        "ING_INTRODUCAO_IDIOM_JACK_TO_TRADE")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_GRAPEVINE",
                        "ING_INTRODUCAO_IDIOM_GRAPEVINE")
        );

        idioms.add(
                new Conteudo("ING_INTRODUCAO_IDIOM_ACTIONS_SPEAK",
                        "ING_INTRODUCAO_IDIOM_ACTIONS_SPEAK")
        );

        secoes.add(new Secao("Expressões Idiomáticas", idioms));

        // =========================================================
        // SEÇÃO 09: Mecanismos Práticos - Gramática
        // =========================================================

        List<Conteudo> mecanismosPraticos = new ArrayList<>();

        mecanismosPraticos.add(
                new Conteudo("ING_INTRODUCAO_PRONOME_THEM_FUNCAO",
                        "ING_INTRODUCAO_PRONOME_THEM_FUNCAO")
        );

        mecanismosPraticos.add(
                new Conteudo("ING_INTRODUCAO_ADVERBIO_SUFIXO_LY",
                        "ING_INTRODUCAO_ADVERBIO_SUFIXO_LY")
        );

        mecanismosPraticos.add(
                new Conteudo("ING_INTRODUCAO_VERBO_MODAL_CAN",
                        "ING_INTRODUCAO_VERBO_MODAL_CAN")
        );

        mecanismosPraticos.add(
                new Conteudo("ING_INTRODUCAO_VERBO_MODAL_MUST",
                        "ING_INTRODUCAO_VERBO_MODAL_MUST")
        );

        mecanismosPraticos.add(
                new Conteudo("ING_INTRODUCAO_ARTIGOS_A_AN_THE",
                        "ING_INTRODUCAO_ARTIGOS_A_AN_THE")
        );

        secoes.add(new Secao("Mecanismos Práticos", mecanismosPraticos));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Introdução ao Inglês para Concursos - Skimming e Scanning",
                secoes
        );
    }
}
