package com.seuapp.mensageria.model;

import java.util.List;

public class Categoria {

    private String nome;
    private List<Assunto> assuntos;

    public Categoria(String nome, List<Assunto> assuntos) {
        this.nome = nome;
        this.assuntos = assuntos;
    }
    public String getNome() {
        return nome;
    }
    public List<Assunto> getAssuntos() {
        return assuntos;
    }
}
