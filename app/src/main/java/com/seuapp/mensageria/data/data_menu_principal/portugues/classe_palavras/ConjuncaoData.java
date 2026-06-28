package com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ConjuncaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Conjunções Coordenativas
        // =========================================================

        List<Conteudo> coordenativas = new ArrayList<>();

        coordenativas.add(
                new Conteudo("CONJ_COORDENATIVAS_VALORES",
                        "CONJ_COORDENATIVAS_VALORES")
        );

        coordenativas.add(
                new Conteudo("CONJ_COORDENATIVAS_POLISSEMICAS",
                        "CONJ_COORDENATIVAS_POLISSEMICAS")
        );

        coordenativas.add(
                new Conteudo("CONJ_COORDENATIVAS_CILADAS",
                        "CONJ_COORDENATIVAS_CILADAS")
        );

        coordenativas.add(
                new Conteudo("CONJ_COORDENATIVAS_REESCRITA",
                        "CONJ_COORDENATIVAS_REESCRITA")
        );

        Secao secaoCoordenativas = new Secao(
                "Conjunções Coordenativas",
                coordenativas
        );
        secoes.add(secaoCoordenativas);

        // =========================================================
        // SEÇÃO 02: Conjunções Subordinativas Adverbiais
        // =========================================================

        List<Conteudo> subordinativas = new ArrayList<>();

        subordinativas.add(
                new Conteudo("CONJ_SUBORDINATIVAS_MNEMONICO",
                        "CONJ_SUBORDINATIVAS_MNEMONICO")
        );

        subordinativas.add(
                new Conteudo("CONJ_SUBORDINATIVAS_TIPOS",
                        "CONJ_SUBORDINATIVAS_TIPOS")
        );

        subordinativas.add(
                new Conteudo("CONJ_SUBORDINATIVAS_CILADAS",
                        "CONJ_SUBORDINATIVAS_CILADAS")
        );

        subordinativas.add(
                new Conteudo("CONJ_SUBORDINATIVAS_CAUSAIS_CONSEC",
                        "CONJ_SUBORDINATIVAS_CAUSAIS_CONSEC")
        );

        Secao secaoSubordinativas = new Secao(
                "Conjunções Subordinativas Adverbiais",
                subordinativas
        );
        secoes.add(secaoSubordinativas);

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Conjunções - Coordenativas e Subordinativas Adverbiais",
                secoes
        );
    }
}
