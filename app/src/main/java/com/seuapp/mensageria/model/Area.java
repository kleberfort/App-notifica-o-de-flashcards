package com.seuapp.mensageria.model;

import java.util.List;

public class Area {

    private String nome;
    private List<Disciplina> disciplinas;

    public Area(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }
    public String getNome() {
        return nome;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
