package com.seuapp.mensageria.data.data_menu_principal.linguagem_programacao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class LinguagemPythonData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Vídeo 01 - Introdução e Conceitos Fundamentais
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo("CONTEXTO_MERCADO", "CONTEXTO_MERCADO"));
        video01.add(new Conteudo("CONCEITOS_FUNDAMENTAIS", "CONCEITOS_FUNDAMENTAIS"));
        video01.add(new Conteudo("LINGUAGENS_ALTO_BAIXO_NIVEL", "LINGUAGENS_ALTO_BAIXO_NIVEL"));

        secoes.add(new Secao("Vídeo 01 - Introdução e Conceitos Fundamentais", video01));

        // =========================================================
        // SEÇÃO 02: Vídeo 02 - Sintaxe, Tipagem e Palavras Reservadas
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(new Conteudo("FUNCIONAMENTO_PYTHON", "FUNCIONAMENTO_PYTHON"));
        video02.add(new Conteudo("TIPAGEM_PYTHON", "TIPAGEM_PYTHON"));
        video02.add(new Conteudo("TIPOS_DADOS_BASICOS", "TIPOS_DADOS_BASICOS"));
        video02.add(new Conteudo("PALAVRAS_RESERVADAS", "PALAVRAS_RESERVADAS"));
        video02.add(new Conteudo("NOMENCLATURA_VARIAVEIS", "NOMENCLATURA_VARIAVEIS"));
        video02.add(new Conteudo("INDENTACAO", "INDENTACAO"));

        secoes.add(new Secao("Vídeo 02 - Sintaxe, Tipagem e Palavras Reservadas", video02));

        // =========================================================
        // SEÇÃO 03: Vídeo 03 - Operadores e Expressões
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo("OPERADORES_MATEMATICOS", "OPERADORES_MATEMATICOS"));
        video03.add(new Conteudo("OPERADORES_COMPARACAO", "OPERADORES_COMPARACAO"));
        video03.add(new Conteudo("PRECEDENCIA_OPERADORES", "PRECEDENCIA_OPERADORES"));
        video03.add(new Conteudo("INCREMENTO_PYTHON", "INCREMENTO_PYTHON"));
        video03.add(new Conteudo("CONCATENACAO_STR_NUM", "CONCATENACAO_STR_NUM"));

        secoes.add(new Secao("Vídeo 03 - Operadores e Expressões", video03));

        // =========================================================
        // SEÇÃO 04: Vídeo 04 - Strings
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo("STRINGS_IMUTABILIDADE", "STRINGS_IMUTABILIDADE"));
        video04.add(new Conteudo("METODOS_STRINGS", "METODOS_STRINGS"));
        video04.add(new Conteudo("CONCATENACAO_STRINGS", "CONCATENACAO_STRINGS"));
        video04.add(new Conteudo("STRINGS_IS_VS_EQ", "STRINGS_IS_VS_EQ"));

        secoes.add(new Secao("Vídeo 04 - Strings", video04));

        // =========================================================
        // SEÇÃO 05: Vídeo 05 - Estruturas Condicionais
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo("CONDICIONAIS_SINTAXE", "CONDICIONAIS_SINTAXE"));
        video05.add(new Conteudo("INPUT_CONDICIONAIS", "INPUT_CONDICIONAIS"));

        secoes.add(new Secao("Vídeo 05 - Estruturas Condicionais", video05));

        // =========================================================
        // SEÇÃO 06: Vídeo 06 - Estruturas de Repetição (Loops)
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(new Conteudo("WHILE_LOOP", "WHILE_LOOP"));
        video06.add(new Conteudo("FOR_RANGE", "FOR_RANGE"));
        video06.add(new Conteudo("BREAK_CONTINUE", "BREAK_CONTINUE"));
        video06.add(new Conteudo("LISTAS_APPEND", "LISTAS_APPEND"));

        secoes.add(new Secao("Vídeo 06 - Estruturas de Repetição (Loops)", video06));

        // =========================================================
        // SEÇÃO 07: Vídeo 07 - Resumão Geral (Parte 1)
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(new Conteudo("CONCEITOS_CHAVE", "CONCEITOS_CHAVE"));

        secoes.add(new Secao("Vídeo 07 - Resumão Geral (Parte 1)", video07));

        // =========================================================
        // SEÇÃO 08: Vídeo 08 - Listas (Fatiamento)
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(new Conteudo("LISTAS_SLICING", "LISTAS_SLICING"));

        secoes.add(new Secao("Vídeo 08 - Listas (Fatiamento)", video08));

        // =========================================================
        // SEÇÃO 09: Vídeo 09 - Métodos de Listas e Tuplas
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(new Conteudo("LISTAS_METODOS", "LISTAS_METODOS"));
        video09.add(new Conteudo("LISTAS_SORT_VS_REVERSE", "LISTAS_SORT_VS_REVERSE"));
        video09.add(new Conteudo("TUPLAS", "TUPLAS"));
        video09.add(new Conteudo("LISTA_VS_TUPLA", "LISTA_VS_TUPLA"));

        secoes.add(new Secao("Vídeo 09 - Métodos de Listas e Tuplas", video09));

        // =========================================================
        // SEÇÃO 10: Vídeo 10 - Sets (Conjuntos)
        // =========================================================

        List<Conteudo> video10 = new ArrayList<>();

        video10.add(new Conteudo("SETS", "SETS"));
        video10.add(new Conteudo("SETS_METODOS", "SETS_METODOS"));
        video10.add(new Conteudo("SETS_VS_LISTAS", "SETS_VS_LISTAS"));

        secoes.add(new Secao("Vídeo 10 - Sets (Conjuntos)", video10));

        // =========================================================
        // SEÇÃO 11: Vídeo 11 - Dicionários
        // =========================================================

        List<Conteudo> video11 = new ArrayList<>();

        video11.add(new Conteudo("DICIONARIOS", "DICIONARIOS"));
        video11.add(new Conteudo("DICIONARIOS_ACESSO", "DICIONARIOS_ACESSO"));
        video11.add(new Conteudo("DICIONARIOS_METODOS", "DICIONARIOS_METODOS"));

        secoes.add(new Secao("Vídeo 11 - Dicionários", video11));

        // =========================================================
        // SEÇÃO 12: Vídeo 12 - Funções e Revisão Geral
        // =========================================================

        List<Conteudo> video12 = new ArrayList<>();

        video12.add(new Conteudo("FUNCOES_SINTAXE", "FUNCOES_SINTAXE"));
        video12.add(new Conteudo("BUILTIN_FUNCTIONS", "BUILTIN_FUNCTIONS"));
        video12.add(new Conteudo("BYTE_CODE", "BYTE_CODE"));
        video12.add(new Conteudo("9_PASSOS_DOMINAR", "9_PASSOS_DOMINAR"));

        secoes.add(new Secao("Vídeo 12 - Funções e Revisão Geral", video12));

        // =========================================================
        // SEÇÃO 13: Ciladas Gerais e Comparativos
        // =========================================================

        List<Conteudo> ciladas = new ArrayList<>();

        ciladas.add(new Conteudo("CILADAS_GERAIS", "CILADAS_GERAIS"));
        ciladas.add(new Conteudo("MUTAVEIS_VS_IMUTAVEIS", "MUTAVEIS_VS_IMUTAVEIS"));
        ciladas.add(new Conteudo("ESTRUTURAS_COMPARATIVO", "ESTRUTURAS_COMPARATIVO"));

        secoes.add(new Secao("Ciladas Gerais e Comparativos", ciladas));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Python Básico para Concursos - Resumo Completo",
                secoes
        );
    }
}