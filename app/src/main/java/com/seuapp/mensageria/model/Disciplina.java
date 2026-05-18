package com.seuapp.mensageria.model;

import java.util.List;

public class Disciplina {

    private String nome;

    private List<Categoria> categorias;

    public Disciplina(String nome, List<Categoria> categorias) {
        this.nome = nome;
        this.categorias = categorias;
    }

    public String getNome() {
        return nome;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
