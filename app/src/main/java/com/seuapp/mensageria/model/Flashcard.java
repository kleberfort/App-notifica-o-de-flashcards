package com.seuapp.mensageria.model;

public class Flashcard {

    // MATÉRIA
    private String materia;

    // ASSUNTO
    private String assunto;

    // TÍTULO DO FLASHCARD
    private String titulo;

    // CONTEÚDO
    private String conteudo;

    public Flashcard(String materia, String assunto, String titulo, String conteudo) {
        this.materia = materia;
        this.assunto = assunto;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getMateria() {
        return materia;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}

