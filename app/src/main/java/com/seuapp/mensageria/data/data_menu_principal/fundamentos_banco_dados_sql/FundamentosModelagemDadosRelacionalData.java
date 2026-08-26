package com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Flashcard;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class FundamentosModelagemDadosRelacionalData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Modelo Lógico e Modelo Relacional - Fundamentos
        // =========================================================

        List<Conteudo> fundamentos = new ArrayList<>();

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_NIVEIS_MODELAGEM",
                        "NIVEIS_MODELAGEM")
        );

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_TIPOS_MODELOS_LOGICOS",
                        "TIPOS_MODELOS_LOGICOS")
        );

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_ELEMENTOS_RELACIONAL",
                        "ELEMENTOS_RELACIONAL")
        );

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_RELACAO_VS_RELACIONAMENTO",
                        "RELACAO_VS_RELACIONAMENTO")
        );

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_PROPRIEDADES_ORDENACAO",
                        "PROPRIEDADES_ORDENACAO")
        );

        fundamentos.add(
                new Conteudo("BANCO_MODELAGEM_DICAS_CILADAS_1",
                        "DICAS_CILADAS_1")
        );

        secoes.add(new Secao(
                "VÍDEO 01 - Modelo Lógico e Modelo Relacional - Fundamentos",
                fundamentos
        ));

        // =========================================================
        // SEÇÃO 02: Álgebra Relacional (Parte 1)
        // =========================================================

        List<Conteudo> algebraParte1 = new ArrayList<>();

        algebraParte1.add(
                new Conteudo("BANCO_MODELAGEM_CONCEITOS_FUNDAMENTAIS",
                        "CONCEITOS_FUNDAMENTAIS")
        );

        algebraParte1.add(
                new Conteudo("BANCO_MODELAGEM_SELECAO_PROJECAO",
                        "SELECAO_PROJECAO")
        );

        algebraParte1.add(
                new Conteudo("BANCO_MODELAGEM_PRODUTO_CARTESIANO_JUNCAO",
                        "PRODUTO_CARTESIANO_JUNCAO")
        );

        algebraParte1.add(
                new Conteudo("BANCO_MODELAGEM_UNIAO_CONDICOES",
                        "UNIAO_CONDICOES")
        );

        algebraParte1.add(
                new Conteudo("BANCO_MODELAGEM_DICAS_CILADAS_2",
                        "DICAS_CILADAS_2")
        );

        secoes.add(new Secao(
                "VÍDEO 02 - Álgebra Relacional (Parte 1)",
                algebraParte1
        ));

        // =========================================================
        // SEÇÃO 03: Álgebra, Views, Índices e Chaves
        // =========================================================

        List<Conteudo> algebraViewsChaves = new ArrayList<>();

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_OPERACOES_COMPLETAS",
                        "OPERACOES_COMPLETAS")
        );

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_PROPRIEDADES_OPERACOES",
                        "PROPRIEDADES_OPERACOES")
        );

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_VIEW_INDICE",
                        "VIEW_INDICE")
        );

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_TIPOS_CHAVES",
                        "TIPOS_CHAVES")
        );

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_RESTRICOES_INTEGRIDADE",
                        "RESTRICOES_INTEGRIDADE")
        );

        algebraViewsChaves.add(
                new Conteudo("BANCO_MODELAGEM_DICAS_CILADAS_CHAVES",
                        "DICAS_CILADAS_CHAVES")
        );

        secoes.add(new Secao(
                "VÍDEO 03 - Álgebra, Views, Índices e Chaves",
                algebraViewsChaves
        ));

        // =========================================================
        // SEÇÃO 04: Chaves, Restrições e Relacionamentos
        // =========================================================

        List<Conteudo> chavesRestricoes = new ArrayList<>();

        chavesRestricoes.add(
                new Conteudo("BANCO_MODELAGEM_RESTRICOES_DETALHADAS",
                        "RESTRICOES_DETALHADAS")
        );

        secoes.add(new Secao(
                "VÍDEO 04 - Chaves, Restrições e Relacionamentos",
                chavesRestricoes
        ));

        // =========================================================
        // SEÇÃO 05: Relacionamentos e Tabelas Associativas
        // =========================================================

        List<Conteudo> relacionamentos = new ArrayList<>();

        relacionamentos.add(
                new Conteudo("BANCO_MODELAGEM_RELACIONAMENTOS_1_1_1_N",
                        "RELACIONAMENTOS_1_1_1_N")
        );

        relacionamentos.add(
                new Conteudo("BANCO_MODELAGEM_RELACIONAMENTO_N_N",
                        "RELACIONAMENTO_N_N")
        );

        relacionamentos.add(
                new Conteudo("BANCO_MODELAGEM_DICAS_CILADAS_RELACIONAMENTOS",
                        "DICAS_CILADAS_RELACIONAMENTOS")
        );

        secoes.add(new Secao(
                "VÍDEO 05 - Relacionamentos e Tabelas Associativas",
                relacionamentos
        ));

        // =========================================================
        // SEÇÃO 06: As 13 Regras de COD
        // =========================================================

        List<Conteudo> regrasCOD = new ArrayList<>();

        regrasCOD.add(
                new Conteudo("BANCO_MODELAGEM_REGRAS_0_A_3",
                        "REGRAS_0_A_3")
        );

        regrasCOD.add(
                new Conteudo("BANCO_MODELAGEM_REGRAS_4_A_7",
                        "REGRAS_4_A_7")
        );

        regrasCOD.add(
                new Conteudo("BANCO_MODELAGEM_REGRAS_8_A_12",
                        "REGRAS_8_A_12")
        );

        regrasCOD.add(
                new Conteudo("BANCO_MODELAGEM_DICAS_CILADAS_COD",
                        "DICAS_CILADAS_COD")
        );

        secoes.add(new Secao(
                "VÍDEO 06 - As 13 Regras de COD",
                regrasCOD
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Fundamentos de Modelagem de Dados Relacional",
                secoes
        );
    }
}