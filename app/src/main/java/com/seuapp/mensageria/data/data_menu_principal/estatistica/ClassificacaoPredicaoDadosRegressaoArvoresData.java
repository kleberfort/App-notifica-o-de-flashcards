package com.seuapp.mensageria.data.data_menu_principal.estatistica;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ClassificacaoPredicaoDadosRegressaoArvoresData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - CONCEITOS GERAIS E PREMISSAS
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_SUPERVISIONADO_DEFINICAO", "SUPERVISIONADO_DEFINICAO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_PREMISSAS_MATEMATICAS", "PREMISSAS_MATEMATICAS"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_VS_ALGORITMO", "FUNCAO_VS_ALGORITMO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAO_EXISTE_UNIVERSAL", "NAO_EXISTE_UNIVERSAL"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_IDENTIFICAR_TIPO_DADO", "IDENTIFICAR_TIPO_DADO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_CLASSIFICACAO_PREDICAO_DADOS_SUPERVISIONADO_VS_NAO", "SUPERVISIONADO_VS_NAO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_VS_ALGORITMO_CILADA", "FUNCAO_VS_ALGORITMO_CILADA"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_O_QUE_E_SUPERVISIONADO", "O_QUE_E_SUPERVISIONADO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_DO_ALGORITMO", "FUNCAO_DO_ALGORITMO"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_EXISTE_ALGORITMO_UNIVERSAL", "EXISTE_ALGORITMO_UNIVERSAL"));
        video01.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_MACETES_MESTRE", "MACETES_MESTRE"));

        secoes.add(new Secao("VÍDEO 01 - CONCEITOS GERAIS E PREMISSAS", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 04 - KNN (K-VIZINHOS MAIS PRÓXIMOS)
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_DEFINICAO", "KNN_DEFINICAO"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_PREDICAO", "KNN_PREDICAO"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_DISTANCIAS", "KNN_DISTANCIAS"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_CLASSIFICACAO_PREDICAO_DADOS_KNN_EQUILIBRIO", "KNN_EQUILIBRIO"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_NAO_PARAMETRICO", "KNN_NAO_PARAMETRICO"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_CILADAS", "KNN_CILADAS"));
        video04.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_KNN_REVISAO", "KNN_REVISAO"));

        secoes.add(new Secao("VÍDEO 04 - KNN (K-VIZINHOS MAIS PRÓXIMOS)", video04));

        // =========================================================
        // SEÇÃO 03: VÍDEO 05 - ÁRVORES DE DECISÃO
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ARVORE_CONCEITO", "ARVORE_CONCEITO"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ARVORE_INDUCAO", "ARVORE_INDUCAO"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ID3_C4.5_CART", "ID3_C4.5_CART"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ID3_NUMERICO", "ID3_NUMERICO"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ARVORE_PODA", "ARVORE_PODA"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ARVORE_CILADAS", "ARVORE_CILADAS"));
        video05.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_ARVORE_REVISAO", "ARVORE_REVISAO"));

        secoes.add(new Secao("VÍDEO 05 - ÁRVORES DE DECISÃO", video05));

        // =========================================================
        // SEÇÃO 04: VÍDEO 06 - NAIVE BAYES
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_BAYES_CONCEITO", "NAIVE_BAYES_CONCEITO"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_SPAM", "NAIVE_SPAM"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_CALCULO", "NAIVE_CALCULO"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_DENOMINADOR", "NAIVE_DENOMINADOR"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_VANTAGENS", "NAIVE_VANTAGENS"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_CILADAS", "NAIVE_CILADAS"));
        video06.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_REVISAO", "NAIVE_REVISAO"));

        secoes.add(new Secao("VÍDEO 06 - NAIVE BAYES", video06));

        // =========================================================
        // SEÇÃO 05: VÍDEO 07 - NAIVE BAYES - QUESTÕES
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_CARACT", "NAIVE_QUEST_CARACT"));
        video07.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_PALAVRAS", "NAIVE_QUEST_PALAVRAS"));
        video07.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_CALCULO", "NAIVE_QUEST_CALCULO"));

        secoes.add(new Secao("VÍDEO 07 - NAIVE BAYES - QUESTÕES", video07));

        // =========================================================
        // SEÇÃO 06: VÍDEO 08 - REGRESSÃO LINEAR
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_CONCEITO", "RL_CONCEITO"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_EQUACAO", "RL_EQUACAO"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_MINIMOS_QUADRADOS", "RL_MINIMOS_QUADRADOS"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_INTERPRETACAO", "RL_INTERPRETACAO"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_MULTICOLINEARIDADE", "RL_MULTICOLINEARIDADE"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_CORRELACAO", "RL_CORRELACAO"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_CILADAS", "RL_CILADAS"));
        video08.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_REVISAO", "RL_REVISAO"));

        secoes.add(new Secao("VÍDEO 08 - REGRESSÃO LINEAR", video08));

        // =========================================================
        // SEÇÃO 07: VÍDEO 09 - REGRESSÃO LINEAR - QUESTÕES
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_CARACT", "RL_QUEST_CARACT"));
        video09.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_PALAVRAS", "RL_QUEST_PALAVRAS"));
        video09.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_ALGORITMOS", "RL_QUEST_ALGORITMOS"));

        secoes.add(new Secao("VÍDEO 09 - REGRESSÃO LINEAR - QUESTÕES", video09));

        // =========================================================
        // SEÇÃO 08: VÍDEO 10 - REGRESSÃO LOGÍSTICA
        // =========================================================

        List<Conteudo> video10 = new ArrayList<>();

        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_CONCEITO", "RLOG_CONCEITO"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_SIGMOIDE", "RLOG_SIGMOIDE"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_VEROSSIMILHANCA", "RLOG_VEROSSIMILHANCA"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_CLASSIFICACAO_PREDICAO_DADOS_RLOG_TIPOS", "RLOG_TIPOS"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_PROPRIEDADES", "RLOG_PROPRIEDADES"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_CILADAS", "RLOG_CILADAS"));
        video10.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_REVISAO", "RLOG_REVISAO"));

        secoes.add(new Secao("VÍDEO 10 - REGRESSÃO LOGÍSTICA", video10));

        // =========================================================
        // SEÇÃO 09: VÍDEO 11 - REGRESSÃO LOGÍSTICA - QUESTÕES
        // =========================================================

        List<Conteudo> video11 = new ArrayList<>();

        video11.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_CARACT", "RLOG_QUEST_CARACT"));
        video11.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_PALAVRAS", "RLOG_QUEST_PALAVRAS"));
        video11.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_COMPARATIVO", "RLOG_QUEST_COMPARATIVO"));
        video11.add(new Conteudo("CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_CILADAS", "RLOG_QUEST_CILADAS"));

        secoes.add(new Secao("VÍDEO 11 - REGRESSÃO LOGÍSTICA - QUESTÕES", video11));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Classificação e Predição de Dados - Regressão e Árvores",
                secoes
        );
    }
}