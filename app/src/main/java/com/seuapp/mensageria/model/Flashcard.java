package com.seuapp.mensageria.model;


public class Flashcard {

    // =====================================================
    // MATÉRIA
    // =====================================================

    private String materia;


    // =====================================================
    // ID DO CONTEÚDO
    //
    // Este ID deve ser o mesmo ID utilizado pela classe
    // Conteudo e pelo PreferenceHelper.
    //
    // Exemplo:
    //
    // "overfitting_underfitting_validacao_cruzada"
    //
    // =====================================================

    private String assunto;


    // =====================================================
    // TÍTULO DO FLASHCARD
    // =====================================================

    private String titulo;


    // =====================================================
    // CONTEÚDO
    // =====================================================

    private String conteudo;


    // =====================================================
    // CONSTRUTOR
    // =====================================================

    public Flashcard(
            String materia,
            String assunto,
            String titulo,
            String conteudo) {

        this.materia = materia;

        this.assunto = assunto;

        this.titulo = titulo;

        this.conteudo = conteudo;
    }


    // =====================================================
    // GETTER - MATÉRIA
    // =====================================================

    public String getMateria() {

        return materia;
    }


    // =====================================================
    // GETTER - ID DO CONTEÚDO
    // =====================================================

    public String getAssunto() {

        return assunto;
    }


    // =====================================================
    // GETTER - TÍTULO
    // =====================================================

    public String getTitulo() {

        return titulo;
    }


    // =====================================================
    // GETTER - CONTEÚDO
    // =====================================================

    public String getConteudo() {

        return conteudo;
    }
}
