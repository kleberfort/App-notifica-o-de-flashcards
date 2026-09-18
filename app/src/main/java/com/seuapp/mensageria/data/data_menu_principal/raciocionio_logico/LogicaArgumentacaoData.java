package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class LogicaArgumentacaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Conectivos Lógicos - Questões Clássicas
        // =========================================================

        List<Conteudo> conectivos = new ArrayList<>();

        conectivos.add(
                new Conteudo("LOGICA_ARG_CONECTIVOS_QUESTOES_CLASSICAS",
                        "LOGICA_ARG_CONECTIVOS_QUESTOES_CLASSICAS")
        );

        conectivos.add(
                new Conteudo("LOGICA_ARG_FORMATOS_FACEIS",
                        "LOGICA_ARG_FORMATOS_FACEIS")
        );

        secoes.add(new Secao("Conectivos Lógicos - Questões Clássicas", conectivos));

        // =========================================================
        // SEÇÃO 02: Lógica de Argumentação - Argumentos Dedutivos
        // =========================================================

        List<Conteudo> argumentosDedutivos = new ArrayList<>();

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_DEFINICAO_ARGUMENTO",
                        "LOGICA_ARG_DEFINICAO_ARGUMENTO")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_ARGUMENTOS_DEDUTIVOS",
                        "LOGICA_ARG_ARGUMENTOS_DEDUTIVOS")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_CATEGORICOS_HIPOTETICOS",
                        "LOGICA_ARG_CATEGORICOS_HIPOTETICOS")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_VALIDADE_VERACIDADE",
                        "LOGICA_ARG_VALIDADE_VERACIDADE")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_ARGUMENTO_VALIDO",
                        "LOGICA_ARG_ARGUMENTO_VALIDO")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_ARGUMENTO_INVALIDO",
                        "LOGICA_ARG_ARGUMENTO_INVALIDO")
        );

        argumentosDedutivos.add(
                new Conteudo("LOGICA_ARG_REPRESENTACAO_ARGUMENTO",
                        "LOGICA_ARG_REPRESENTACAO_ARGUMENTO")
        );

        secoes.add(new Secao("Lógica de Argumentação - Argumentos Dedutivos", argumentosDedutivos));

        // =========================================================
        // SEÇÃO 03: Silogismo Categórico
        // =========================================================

        List<Conteudo> silogismo = new ArrayList<>();

        silogismo.add(
                new Conteudo("LOGICA_ARG_SILOGISMO_CATEGORICO",
                        "LOGICA_ARG_SILOGISMO_CATEGORICO")
        );

        silogismo.add(
                new Conteudo("LOGICA_ARG_MODOS_SILOGISMO",
                        "LOGICA_ARG_MODOS_SILOGISMO")
        );

        silogismo.add(
                new Conteudo("LOGICA_ARG_FIGURAS_SILOGISMO",
                        "LOGICA_ARG_FIGURAS_SILOGISMO")
        );

        silogismo.add(
                new Conteudo("LOGICA_ARG_REGRAS_SILOGISMO",
                        "LOGICA_ARG_REGRAS_SILOGISMO")
        );

        secoes.add(new Secao("Silogismo Categórico", silogismo));

        // =========================================================
        // SEÇÃO 04: Métodos de Verificação da Validade
        // =========================================================

        List<Conteudo> metodos = new ArrayList<>();

        metodos.add(
                new Conteudo("LOGICA_ARG_METODO_DIAGRAMAS",
                        "LOGICA_ARG_METODO_DIAGRAMAS")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_METODO_PREMISSAS_VERDADEIRAS",
                        "LOGICA_ARG_METODO_PREMISSAS_VERDADEIRAS")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_METODO_TABELA_VERDADE",
                        "LOGICA_ARG_METODO_TABELA_VERDADE")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_METODO_CONCLUSAO_FALSA",
                        "LOGICA_ARG_METODO_CONCLUSAO_FALSA")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_METODO_TRANSITIVIDADE",
                        "LOGICA_ARG_METODO_TRANSITIVIDADE")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_TRANSITIVIDADE_DISJUNCAO",
                        "LOGICA_ARG_TRANSITIVIDADE_DISJUNCAO")
        );

        metodos.add(
                new Conteudo("LOGICA_ARG_CONCLUSAO_SIMPLES",
                        "LOGICA_ARG_CONCLUSAO_SIMPLES")
        );

        secoes.add(new Secao("Métodos de Verificação da Validade", metodos));

        // =========================================================
        // SEÇÃO 05: Método das Regras de Inferência
        // =========================================================

        List<Conteudo> inferencia = new ArrayList<>();

        inferencia.add(
                new Conteudo("LOGICA_ARG_REGRAS_INFERENCIA",
                        "LOGICA_ARG_REGRAS_INFERENCIA")
        );

        inferencia.add(
                new Conteudo("LOGICA_ARG_MODUS_PONENS",
                        "LOGICA_ARG_MODUS_PONENS")
        );

        inferencia.add(
                new Conteudo("LOGICA_ARG_MODUS_TOLLENS",
                        "LOGICA_ARG_MODUS_TOLLENS")
        );

        inferencia.add(
                new Conteudo("LOGICA_ARG_SILOGISMO_HIPOTETICO",
                        "LOGICA_ARG_SILOGISMO_HIPOTETICO")
        );

        inferencia.add(
                new Conteudo("LOGICA_ARG_DILEMA_CONSTRUTIVO",
                        "LOGICA_ARG_DILEMA_CONSTRUTIVO")
        );

        inferencia.add(
                new Conteudo("LOGICA_ARG_DILEMA_DESTRUTIVO",
                        "LOGICA_ARG_DILEMA_DESTRUTIVO")
        );

        secoes.add(new Secao("Método das Regras de Inferência", inferencia));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Lógica de Argumentação",
                secoes
        );
    }
}
