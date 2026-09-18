package com.seuapp.mensageria.data.data_menu_principal.raciocionio_logico;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class LogicaPrimeiraOrdemData {

        public static Disciplina getDisciplina() {

            List<Secao> secoes = new ArrayList<>();

            // =========================================================
            // SEÇÃO 01: Introdução e Conceitos Básicos
            // =========================================================

            List<Conteudo> introducao = new ArrayList<>();

            introducao.add(
                    new Conteudo("LOGICA_1A_ORDEM_INTRODUCAO",
                            "LOGICA_1A_ORDEM_INTRODUCAO")
            );

            introducao.add(
                    new Conteudo("LOGICA_1A_ORDEM_SENTENCA_ABERTA",
                            "LOGICA_1A_ORDEM_SENTENCA_ABERTA")
            );

            introducao.add(
                    new Conteudo("LOGICA_1A_ORDEM_FUNCAO_PREDICADO",
                            "LOGICA_1A_ORDEM_FUNCAO_PREDICADO")
            );

            introducao.add(
                    new Conteudo("LOGICA_1A_ORDEM_UNIVERSO_DISCURSO",
                            "LOGICA_1A_ORDEM_UNIVERSO_DISCURSO")
            );

            secoes.add(new Secao("Introdução e Conceitos Básicos", introducao));

            // =========================================================
            // SEÇÃO 02: Quantificadores
            // =========================================================

            List<Conteudo> quantificadores = new ArrayList<>();

            quantificadores.add(
                    new Conteudo("LOGICA_1A_ORDEM_QUANTIFICADOR_UNIVERSAL",
                            "LOGICA_1A_ORDEM_QUANTIFICADOR_UNIVERSAL")
            );

            quantificadores.add(
                    new Conteudo("LOGICA_1A_ORDEM_QUANTIFICADOR_EXISTENCIAL",
                            "LOGICA_1A_ORDEM_QUANTIFICADOR_EXISTENCIAL")
            );

            quantificadores.add(
                    new Conteudo("LOGICA_1A_ORDEM_QUANTIFICADOR_UNICIDADE",
                            "LOGICA_1A_ORDEM_QUANTIFICADOR_UNICIDADE")
            );

            secoes.add(new Secao("Quantificadores", quantificadores));

            // =========================================================
            // SEÇÃO 03: Proposições Categóricas na LPO
            // =========================================================

            List<Conteudo> categoricas = new ArrayList<>();

            categoricas.add(
                    new Conteudo("LOGICA_1A_ORDEM_PROPS_CATEGORICAS",
                            "LOGICA_1A_ORDEM_PROPS_CATEGORICAS")
            );

            categoricas.add(
                    new Conteudo("LOGICA_1A_ORDEM_TODO_A_E_B",
                            "LOGICA_1A_ORDEM_TODO_A_E_B")
            );

            categoricas.add(
                    new Conteudo("LOGICA_1A_ORDEM_ALGUM_A_E_B",
                            "LOGICA_1A_ORDEM_ALGUM_A_E_B")
            );

            categoricas.add(
                    new Conteudo("LOGICA_1A_ORDEM_NENHUM_A_E_B",
                            "LOGICA_1A_ORDEM_NENHUM_A_E_B")
            );

            categoricas.add(
                    new Conteudo("LOGICA_1A_ORDEM_ALGUM_A_NAO_E_B",
                            "LOGICA_1A_ORDEM_ALGUM_A_NAO_E_B")
            );

            secoes.add(new Secao("Proposições Categóricas na LPO", categoricas));

            // =========================================================
            // SEÇÃO 04: Relações e Aridade
            // =========================================================

            List<Conteudo> relacoes = new ArrayList<>();

            relacoes.add(
                    new Conteudo("LOGICA_1A_ORDEM_ARIDADE",
                            "LOGICA_1A_ORDEM_ARIDADE")
            );

            secoes.add(new Secao("Relações e Aridade", relacoes));

            // =========================================================
            // SEÇÃO 05: Equivalências Lógicas na LPO
            // =========================================================

            List<Conteudo> equivalencias = new ArrayList<>();

            equivalencias.add(
                    new Conteudo("LOGICA_1A_ORDEM_EQUIVALENCIAS",
                            "LOGICA_1A_ORDEM_EQUIVALENCIAS")
            );

            equivalencias.add(
                    new Conteudo("LOGICA_1A_ORDEM_NEGACAO_QUANTIFICADORES",
                            "LOGICA_1A_ORDEM_NEGACAO_QUANTIFICADORES")
            );

            secoes.add(new Secao("Equivalências Lógicas na LPO", equivalencias));

            // =========================================================
            // SEÇÃO 06: Questões Comentadas - Multibancas
            // =========================================================

            List<Conteudo> multibancas = new ArrayList<>();

            multibancas.add(
                    new Conteudo("LOGICA_1A_ORDEM_QUESTOES",
                            "LOGICA_1A_ORDEM_QUESTOES")
            );

            secoes.add(new Secao("Questões Comentadas - Multibancas", multibancas));

            // =========================================================
            // SEÇÃO 07: Questões Comentadas - FGV
            // =========================================================

            List<Conteudo> fgv = new ArrayList<>();

            fgv.add(
                    new Conteudo("LOGICA_1A_ORDEM_FGV_QUESTOES",
                            "LOGICA_1A_ORDEM_FGV_QUESTOES")
            );

            secoes.add(new Secao("Questões Comentadas - FGV", fgv));

            // =========================================================
            // RETORNO FINAL
            // =========================================================

            return new Disciplina(
                    "Lógica de Primeira Ordem e Argumentação",
                    secoes
            );
        }

}
