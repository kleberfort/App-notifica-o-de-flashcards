package com.seuapp.mensageria.model;

import java.util.List;

public class Secao {

    private String nome;
    private List<Conteudo> conteudos;

    public Secao(String nome, List<Conteudo> conteudos) {
        this.nome = nome;
        this.conteudos = conteudos;
    }
    public String getNome() {
        return nome;
    }
    public List<Conteudo> getAssuntos() {
        return conteudos;
    }
}
