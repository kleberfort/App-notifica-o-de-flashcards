package com.seuapp.mensageria.model;

public class Conteudo {

    private String id;
    private String nome;

    public Conteudo(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}
