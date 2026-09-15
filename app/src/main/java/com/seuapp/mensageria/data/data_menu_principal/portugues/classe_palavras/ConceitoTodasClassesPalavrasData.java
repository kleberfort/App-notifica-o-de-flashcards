package com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class ConceitoTodasClassesPalavrasData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Noções Iniciais
        // =========================================================

        List<Conteudo> nocoesIniciais = new ArrayList<>();

        nocoesIniciais.add(
                new Conteudo("PORT_CLASSES_NOCOES_INICIAIS",
                        "PORT_CLASSES_NOCOES_INICIAIS")
        );

        nocoesIniciais.add(
                new Conteudo("PORT_CLASSES_VARIAVEIS_INVARIAVEIS",
                        "PORT_CLASSES_VARIAVEIS_INVARIAVEIS")
        );

        secoes.add(new Secao("Noções Iniciais", nocoesIniciais));

        // =========================================================
        // SEÇÃO 02: Substantivo
        // =========================================================

        List<Conteudo> substantivo = new ArrayList<>();

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO",
                        "PORT_SUBSTANTIVO")
        );

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO_CLASSIFICACAO",
                        "PORT_SUBSTANTIVO_CLASSIFICACAO")
        );

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO_FLEXAO_GENERO",
                        "PORT_SUBSTANTIVO_FLEXAO_GENERO")
        );

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO_FORMACAO",
                        "PORT_SUBSTANTIVO_FORMACAO")
        );

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO_PLURAL_COMPOSTOS",
                        "PORT_SUBSTANTIVO_PLURAL_COMPOSTOS")
        );

        substantivo.add(
                new Conteudo("PORT_SUBSTANTIVO_GRAU",
                        "PORT_SUBSTANTIVO_GRAU")
        );

        secoes.add(new Secao("Substantivo", substantivo));

        // =========================================================
        // SEÇÃO 03: Adjetivo
        // =========================================================

        List<Conteudo> adjetivo = new ArrayList<>();

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO",
                        "PORT_ADJETIVO")
        );

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO_CLASSIFICACAO",
                        "PORT_ADJETIVO_CLASSIFICACAO")
        );

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO_FLEXAO_COMPOSTOS",
                        "PORT_ADJETIVO_FLEXAO_COMPOSTOS")
        );

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO_VALOR_OBJETIVO_SUBJETIVO",
                        "PORT_ADJETIVO_VALOR_OBJETIVO_SUBJETIVO")
        );

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO_GRAU",
                        "PORT_ADJETIVO_GRAU")
        );

        adjetivo.add(
                new Conteudo("PORT_ADJETIVO_ORDEM",
                        "PORT_ADJETIVO_ORDEM")
        );

        secoes.add(new Secao("Adjetivo", adjetivo));

        // =========================================================
        // SEÇÃO 04: Advérbio
        // =========================================================

        List<Conteudo> adverbio = new ArrayList<>();

        adverbio.add(
                new Conteudo("PORT_ADVERBIO",
                        "PORT_ADVERBIO")
        );

        adverbio.add(
                new Conteudo("PORT_ADVERBIO_CIRCUNSTANCIAS",
                        "PORT_ADVERBIO_CIRCUNSTANCIAS")
        );

        adverbio.add(
                new Conteudo("PORT_ADVERBIO_VS_PRONOME_INDEFINIDO",
                        "PORT_ADVERBIO_VS_PRONOME_INDEFINIDO")
        );

        secoes.add(new Secao("Advérbio", adverbio));

        // =========================================================
        // SEÇÃO 05: Artigo
        // =========================================================

        List<Conteudo> artigo = new ArrayList<>();

        artigo.add(
                new Conteudo("PORT_ARTIGO",
                        "PORT_ARTIGO")
        );

        artigo.add(
                new Conteudo("PORT_ARTIGO_VALORES",
                        "PORT_ARTIGO_VALORES")
        );

        secoes.add(new Secao("Artigo", artigo));

        // =========================================================
        // SEÇÃO 06: Numeral
        // =========================================================

        List<Conteudo> numeral = new ArrayList<>();

        numeral.add(
                new Conteudo("PORT_NUMERAL",
                        "PORT_NUMERAL")
        );

        numeral.add(
                new Conteudo("PORT_NUMERAL_VS_ARTIGO",
                        "PORT_NUMERAL_VS_ARTIGO")
        );

        secoes.add(new Secao("Numeral", numeral));

        // =========================================================
        // SEÇÃO 07: Interjeição
        // =========================================================

        List<Conteudo> interjeicao = new ArrayList<>();

        interjeicao.add(
                new Conteudo("PORT_INTERJEICAO",
                        "PORT_INTERJEICAO")
        );

        secoes.add(new Secao("Interjeição", interjeicao));

        // =========================================================
        // SEÇÃO 08: Palavras Especiais
        // =========================================================

        List<Conteudo> palavrasEspeciais = new ArrayList<>();

        palavrasEspeciais.add(
                new Conteudo("PORT_PALAVRA_O_A_OS_AS",
                        "PORT_PALAVRA_O_A_OS_AS")
        );

        palavrasEspeciais.add(
                new Conteudo("PORT_PALAVRA_SO",
                        "PORT_PALAVRA_SO")
        );

        palavrasEspeciais.add(
                new Conteudo("PORT_PALAVRA_ATE",
                        "PORT_PALAVRA_ATE")
        );

        palavrasEspeciais.add(
                new Conteudo("PORT_PALAVRA_AINDA",
                        "PORT_PALAVRA_AINDA")
        );

        palavrasEspeciais.add(
                new Conteudo("PORT_PALAVRA_MESMO",
                        "PORT_PALAVRA_MESMO")
        );

        secoes.add(new Secao("Palavras Especiais", palavrasEspeciais));

        // =========================================================
        // SEÇÃO 09: Pronomes
        // =========================================================

        List<Conteudo> pronomes = new ArrayList<>();

        pronomes.add(
                new Conteudo("PORT_PRONOME",
                        "PORT_PRONOME")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_PESSOAL",
                        "PORT_PRONOME_PESSOAL")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_POSSESSIVO",
                        "PORT_PRONOME_POSSESSIVO")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_DEMONSTRATIVO",
                        "PORT_PRONOME_DEMONSTRATIVO")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_INDEFINIDO",
                        "PORT_PRONOME_INDEFINIDO")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_INTERROGATIVO",
                        "PORT_PRONOME_INTERROGATIVO")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_RELATIVO",
                        "PORT_PRONOME_RELATIVO")
        );

        pronomes.add(
                new Conteudo("PORT_PRONOME_TRATAMENTO",
                        "PORT_PRONOME_TRATAMENTO")
        );

        secoes.add(new Secao("Pronomes", pronomes));

        // =========================================================
        // SEÇÃO 10: Colocação Pronominal
        // =========================================================

        List<Conteudo> colocacaoPronominal = new ArrayList<>();

        colocacaoPronominal.add(
                new Conteudo("PORT_COLOCACAO_PRONOMINAL",
                        "PORT_COLOCACAO_PRONOMINAL")
        );

        colocacaoPronominal.add(
                new Conteudo("PORT_COLOCACAO_PROCLISE",
                        "PORT_COLOCACAO_PROCLISE")
        );

        colocacaoPronominal.add(
                new Conteudo("PORT_COLOCACAO_PROIBICOES",
                        "PORT_COLOCACAO_PROIBICOES")
        );

        colocacaoPronominal.add(
                new Conteudo("PORT_COLOCACAO_LOCUCAO_VERBAL",
                        "PORT_COLOCACAO_LOCUCAO_VERBAL")
        );

        secoes.add(new Secao("Colocação Pronominal", colocacaoPronominal));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Conceito de Todas as Classes de Palavras",
                secoes
        );
    }
}
