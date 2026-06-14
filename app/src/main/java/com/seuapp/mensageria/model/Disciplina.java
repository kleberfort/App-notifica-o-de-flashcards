package com.seuapp.mensageria.model;

import java.util.List;

public class Disciplina {

    private String nome;

    private List<Secao> secaos;

    public Disciplina(String nome, List<Secao> secaos) {
        this.nome = nome;
        this.secaos = secaos;
    }

    public String getNome() {
        return nome;
    }

    public List<Secao> getCategorias() {
        return secaos;
    }
}
