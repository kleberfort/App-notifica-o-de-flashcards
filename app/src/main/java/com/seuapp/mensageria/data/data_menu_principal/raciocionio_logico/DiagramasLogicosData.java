package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class DiagramasLogicosData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Proposições Quantificadas
        // =========================================================

        List<Conteudo> quantificadas = new ArrayList<>();

        quantificadas.add(
                new Conteudo("DIAGRAMAS_LOGICO_SENTENCA_ABERTA",
                        "DIAGRAMAS_LOGICO_SENTENCA_ABERTA")
        );

        quantificadas.add(
                new Conteudo("DIAGRAMAS_LOGICO_QUANTIFICADOR_UNIVERSAL",
                        "DIAGRAMAS_LOGICO_QUANTIFICADOR_UNIVERSAL")
        );

        quantificadas.add(
                new Conteudo("DIAGRAMAS_LOGICO_QUANTIFICADOR_EXISTENCIAL",
                        "DIAGRAMAS_LOGICO_QUANTIFICADOR_EXISTENCIAL")
        );

        quantificadas.add(
                new Conteudo("DIAGRAMAS_LOGICO_PROPS_CATEGORICAS",
                        "DIAGRAMAS_LOGICO_PROPS_CATEGORICAS")
        );

        secoes.add(new Secao("Proposições Quantificadas", quantificadas));

        // =========================================================
        // SEÇÃO 02: Negação de Proposições Quantificadas
        // =========================================================

        List<Conteudo> negacao = new ArrayList<>();

        negacao.add(
                new Conteudo("DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_AFIRMATIVA",
                        "DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_AFIRMATIVA")
        );

        negacao.add(
                new Conteudo("DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_NEGATIVA",
                        "DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_NEGATIVA")
        );

        negacao.add(
                new Conteudo("DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_AFIRMATIVA",
                        "DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_AFIRMATIVA")
        );

        negacao.add(
                new Conteudo("DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_NEGATIVA",
                        "DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_NEGATIVA")
        );

        negacao.add(
                new Conteudo("DIAGRAMAS_LOGICO_TERMOS_ADICIONAIS",
                        "DIAGRAMAS_LOGICO_TERMOS_ADICIONAIS")
        );

        secoes.add(new Secao("Negação de Proposições Quantificadas", negacao));

        // =========================================================
        // SEÇÃO 03: Diagramas Lógicos
        // =========================================================

        List<Conteudo> diagramas = new ArrayList<>();

        diagramas.add(
                new Conteudo("DIAGRAMAS_LOGICO_DIAGRAMA_TODO",
                        "DIAGRAMAS_LOGICO_DIAGRAMA_TODO")
        );

        diagramas.add(
                new Conteudo("DIAGRAMAS_LOGICO_DIAGRAMA_NENHUM",
                        "DIAGRAMAS_LOGICO_DIAGRAMA_NENHUM")
        );

        diagramas.add(
                new Conteudo("DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM",
                        "DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM")
        );

        diagramas.add(
                new Conteudo("DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM_NAO",
                        "DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM_NAO")
        );

        secoes.add(new Secao("Diagramas Lógicos", diagramas));

        // =========================================================
        // SEÇÃO 04: Validade de Argumentos
        // =========================================================

        List<Conteudo> validade = new ArrayList<>();

        validade.add(
                new Conteudo("DIAGRAMAS_LOGICO_VALIDADE_ARGUMENTOS",
                        "DIAGRAMAS_LOGICO_VALIDADE_ARGUMENTOS")
        );

        secoes.add(new Secao("Validade de Argumentos", validade));

        // =========================================================
        // SEÇÃO 05: Questões Comentadas - FGV
        // =========================================================

        List<Conteudo> fgv = new ArrayList<>();

        fgv.add(
                new Conteudo("DIAGRAMAS_LOGICO_FGV_PROPS_QUANTIFICADAS",
                        "DIAGRAMAS_LOGICO_FGV_PROPS_QUANTIFICADAS")
        );

        fgv.add(
                new Conteudo("DIAGRAMAS_LOGICO_FGV_DIAGRAMAS",
                        "DIAGRAMAS_LOGICO_FGV_DIAGRAMAS")
        );

        secoes.add(new Secao("Questões Comentadas - FGV", fgv));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Diagramas Lógicos e Proposições Quantificadas",
                secoes
        );
    }
}
