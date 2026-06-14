package com.seuapp.mensageria.model;

public class QuestaoMultiplaEscolha {

    private String informacao;
    private String textoApoio;  // NOVO: campo para o texto/base da questão
    private String enunciado;

    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaE;

    private String respostaCorreta;
    private String explicacao;

    // =========================
    // CONSTRUTOR COMPLETO (COM TEXTO DE APOIO)
    // =========================

    public QuestaoMultiplaEscolha(String informacao,
                                  String textoApoio,
                                  String enunciado,
                                  String alternativaA,
                                  String alternativaB,
                                  String alternativaC,
                                  String alternativaD,
                                  String alternativaE,
                                  String respostaCorreta,
                                  String explicacao) {

        this.informacao = informacao;
        this.textoApoio = textoApoio;
        this.enunciado = enunciado;

        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;

        this.respostaCorreta = respostaCorreta;
        this.explicacao = explicacao;
    }

    // =========================
    // CONSTRUTOR SEM TEXTO DE APOIO (PARA COMPATIBILIDADE)
    // =========================

    public QuestaoMultiplaEscolha(String informacao,
                                  String enunciado,
                                  String alternativaA,
                                  String alternativaB,
                                  String alternativaC,
                                  String alternativaD,
                                  String alternativaE,
                                  String respostaCorreta,
                                  String explicacao) {

        this(informacao, null, enunciado, alternativaA, alternativaB,
                alternativaC, alternativaD, alternativaE, respostaCorreta, explicacao);
    }

    // =========================
    // GETTERS
    // =========================

    public String getInformacao() {
        return informacao;
    }

    public String getTextoApoio() {
        return textoApoio;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public String getAlternativaE() {
        return alternativaE;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getExplicacao() {
        return explicacao;
    }

    // =========================
    // MÉTODO UTILITÁRIO
    // =========================

    public boolean temTextoApoio() {
        return textoApoio != null && !textoApoio.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "QuestaoMultiplaEscolha{" +
                "informacao='" + informacao + '\'' +
                ", enunciado='" + enunciado + '\'' +
                ", respostaCorreta='" + respostaCorreta + '\'' +
                '}';
    }
}