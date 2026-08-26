package com.seuapp.mensageria.data.data_menu_principal.analise_dados;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ProcessamentoLinguagemNaturalData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Vídeo 01 - Conceitos Fundamentais
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(
                new Conteudo("PLN_DEFINICAO",
                        "PLN_DEFINICAO")
        );

        video01.add(
                new Conteudo("PLN_CILADAS",
                        "PLN_CILADAS")
        );

        video01.add(
                new Conteudo("PLN_ELISA",
                        "PLN_ELISA")
        );

        secoes.add(new Secao("Vídeo 01 - Conceitos Fundamentais", video01));

        // =========================================================
        // SEÇÃO 02: Vídeo 02 - Aspectos da Linguagem e Pré-processamento
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(
                new Conteudo("PLN_PILARES",
                        "PLN_PILARES")
        );

        video02.add(
                new Conteudo("PLN_PREPROCESSAMENTO",
                        "PLN_PREPROCESSAMENTO")
        );

        video02.add(
                new Conteudo("PLN_TOKENIZACAO",
                        "PLN_TOKENIZACAO")
        );

        video02.add(
                new Conteudo("PLN_STEMIZACAO",
                        "PLN_STEMIZACAO")
        );

        video02.add(
                new Conteudo("PLN_LEMATIZACAO",
                        "PLN_LEMATIZACAO")
        );

        video02.add(
                new Conteudo("PLN_STEM_LEMA",
                        "PLN_STEM_LEMA")
        );

        secoes.add(new Secao("Vídeo 02 - Aspectos da Linguagem e Pré-processamento", video02));

        // =========================================================
        // SEÇÃO 03: Vídeo 03 - Tarefas Adicionais e Semântica Vetorial
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(
                new Conteudo("PLN_POSTAGGING",
                        "PLN_POSTAGGING")
        );

        video03.add(
                new Conteudo("PLN_NER",
                        "PLN_NER")
        );

        video03.add(
                new Conteudo("PLN_STOPWORDS",
                        "PLN_STOPWORDS")
        );

        video03.add(
                new Conteudo("PLN_HIPOTESE_DISTRIBUTIVA",
                        "PLN_HIPOTESE_DISTRIBUTIVA")
        );

        video03.add(
                new Conteudo("PLN_WORD_EMBEDDING",
                        "PLN_WORD_EMBEDDING")
        );

        video03.add(
                new Conteudo("PLN_MATRIZ_TD",
                        "PLN_MATRIZ_TD")
        );

        video03.add(
                new Conteudo("PLN_MATRIZ_TT",
                        "PLN_MATRIZ_TT")
        );

        secoes.add(new Secao("Vídeo 03 - Tarefas Adicionais e Semântica Vetorial", video03));

        // =========================================================
        // SEÇÃO 04: Vídeo 04 - Redução, N-gramas e Classificação
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(
                new Conteudo("PLN_MALDICAO",
                        "PLN_MALDICAO")
        );

        video04.add(
                new Conteudo("PLN_REDUCAO",
                        "PLN_REDUCAO")
        );

        video04.add(
                new Conteudo("PLN_NGRAMAS",
                        "PLN_NGRAMAS")
        );

        video04.add(
                new Conteudo("PLN_CLASSIFICACAO",
                        "PLN_CLASSIFICACAO")
        );

        video04.add(
                new Conteudo("PLN_BOW",
                        "PLN_BOW")
        );

        video04.add(
                new Conteudo("PLN_TFIDF",
                        "PLN_TFIDF")
        );

        video04.add(
                new Conteudo("PLN_SENTIMENTO",
                        "PLN_SENTIMENTO")
        );

        secoes.add(new Secao("Vídeo 04 - Redução, N-gramas e Classificação", video04));

        // =========================================================
        // SEÇÃO 05: Vídeo 05 - Resolução de Questões
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(
                new Conteudo("PLN_STOP_QUESTAO",
                        "PLN_STOP_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_TFIDF_QUESTAO",
                        "PLN_TFIDF_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_POLISSEMIA",
                        "PLN_POLISSEMIA")
        );

        video05.add(
                new Conteudo("PLN_VOZ_QUESTAO",
                        "PLN_VOZ_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_STEM_LEMA_QUESTAO",
                        "PLN_STEM_LEMA_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_SENTIMENTO_SOCIAL",
                        "PLN_SENTIMENTO_SOCIAL")
        );

        video05.add(
                new Conteudo("PLN_PILARES_QUESTAO",
                        "PLN_PILARES_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_BOW_QUESTAO",
                        "PLN_BOW_QUESTAO")
        );

        video05.add(
                new Conteudo("PLN_RESUMO_GERAL",
                        "PLN_RESUMO_GERAL")
        );

        secoes.add(new Secao("Vídeo 05 - Resolução de Questões", video05));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Processamento de Linguagem Natural (PLN) - Concursos",
                secoes
        );
    }
}
