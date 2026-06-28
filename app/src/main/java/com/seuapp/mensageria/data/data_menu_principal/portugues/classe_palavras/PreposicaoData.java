package com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class PreposicaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Conceitos Fundamentais
        // =========================================================

        List<Conteudo> conceitosFundamentais = new ArrayList<>();

        conceitosFundamentais.add(
                new Conteudo("PREPOSICAO_CONCEITO",
                        "PREPOSICAO_CONCEITO")
        );

        conceitosFundamentais.add(
                new Conteudo("LOCUCAO_PREPOSITIVA",
                        "LOCUCAO_PREPOSITIVA")
        );

        conceitosFundamentais.add(
                new Conteudo("PREPOSICAO_VS_ADVERBIO",
                        "PREPOSICAO_VS_ADVERBIO")
        );

        conceitosFundamentais.add(
                new Conteudo("PREPOSICAO_VS_CONJUNCAO",
                        "PREPOSICAO_VS_CONJUNCAO")
        );



        secoes.add(new Secao(
                "🧭 Conceitos Fundamentais",
                conceitosFundamentais
        ));

        // =========================================================
        // SEÇÃO 02: Valores da Preposição (Relacional x Nocional)
        // =========================================================

        List<Conteudo> valoresPreposicao = new ArrayList<>();

        valoresPreposicao.add(
                new Conteudo("VALOR_RELACIONAL",
                        "VALOR_RELACIONAL")
        );

        valoresPreposicao.add(
                new Conteudo("VALOR_NOCIONAL",
                        "VALOR_NOCIONAL")
        );

        valoresPreposicao.add(
                new Conteudo("PERGUNTA_CHAVE_VALOR",
                        "PERGUNTA_CHAVE_VALOR")
        );

        valoresPreposicao.add(
                new Conteudo("IDENTIFICAR_NOCAO",
                        "IDENTIFICAR_NOCAO")
        );

        secoes.add(new Secao(
                "🧭 Valores da Preposição",
                valoresPreposicao
        ));

        // =========================================================
        // SEÇÃO 03: Reescrita de Frases
        // =========================================================

        List<Conteudo> reescrita = new ArrayList<>();

        reescrita.add(
                new Conteudo("REESCRITA_PREP_CONJ",
                        "REESCRITA_PREP_CONJ")
        );

        secoes.add(new Secao(
                "🧭 Reescrita: Troca Prep. ↔ Conj.",
                reescrita
        ));

        // =========================================================
        // SEÇÃO 04: Valores Semânticos da Preposição "PARA"
        // =========================================================

        List<Conteudo> valoresPara = new ArrayList<>();

        valoresPara.add(
                new Conteudo("PARA_FINALIDADE",
                        "PARA_FINALIDADE")
        );

        valoresPara.add(
                new Conteudo("PARA_DIRECAO_LUGAR",
                        "PARA_DIRECAO_LUGAR")
        );

        valoresPara.add(
                new Conteudo("PARA_DESTINATARIO",
                        "PARA_DESTINATARIO")
        );

        valoresPara.add(
                new Conteudo("PARA_CONFORMIDADE",
                        "PARA_CONFORMIDADE")
        );

        valoresPara.add(
                new Conteudo("PARA_TEMPO",
                        "PARA_TEMPO")
        );

        secoes.add(new Secao(
                "🧭 Valores Semânticos do 'PARA'",
                valoresPara
        ));

        // =========================================================
        // SEÇÃO 05: Ciladas e Antídotos sobre o "PARA"
        // =========================================================

        List<Conteudo> ciladasPara = new ArrayList<>();

        ciladasPara.add(
                new Conteudo("PARA_CILADA_FINALIDADE",
                        "PARA_CILADA_FINALIDADE")
        );

        ciladasPara.add(
                new Conteudo("PARA_PARA_QUE",
                        "PARA_PARA_QUE")
        );

        secoes.add(new Secao(
                "🧭 Ciladas do 'PARA'",
                ciladasPara
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "📘 Classes de Palavras - Preposição",
                secoes
        );
    }
}
