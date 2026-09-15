package com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.coordenacao_subordincacao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class CoordenacaoSubordinacaoOracaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Sintaxe - Noções Iniciais
        // =========================================================

        List<Conteudo> sintaxeInicial = new ArrayList<>();

        sintaxeInicial.add(
                new Conteudo("PORT_SINTAXE_NOCOES_INICIAIS",
                        "PORT_SINTAXE_NOCOES_INICIAIS")
        );

        sintaxeInicial.add(
                new Conteudo("PORT_FRASE_ORACAO_PERIODO",
                        "PORT_FRASE_ORACAO_PERIODO")
        );

        secoes.add(new Secao("Sintaxe - Noções Iniciais", sintaxeInicial));

        // =========================================================
        // SEÇÃO 02: Funções Sintáticas
        // =========================================================

        List<Conteudo> funcoesSintaticas = new ArrayList<>();

        funcoesSintaticas.add(
                new Conteudo("PORT_SUJEITO",
                        "PORT_SUJEITO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_SUJEITO_INDETERMINADO",
                        "PORT_SUJEITO_INDETERMINADO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_ORACAO_SEM_SUJEITO",
                        "PORT_ORACAO_SEM_SUJEITO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_OBJETO_DIRETO",
                        "PORT_OBJETO_DIRETO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_OBJETO_INDIRETO",
                        "PORT_OBJETO_INDIRETO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_COMPLEMENTO_NOMINAL",
                        "PORT_COMPLEMENTO_NOMINAL")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_ADJUNTO_ADNOMINAL",
                        "PORT_ADJUNTO_ADNOMINAL")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_AA_VS_CN",
                        "PORT_AA_VS_CN")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_PREDICATIVO_SUJEITO",
                        "PORT_PREDICATIVO_SUJEITO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_PREDICATIVO_OBJETO",
                        "PORT_PREDICATIVO_OBJETO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_TIPOS_PREDICADO",
                        "PORT_TIPOS_PREDICADO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_APOSTO",
                        "PORT_APOSTO")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_ADJUNTO_ADVERBIAL",
                        "PORT_ADJUNTO_ADVERBIAL")
        );

        funcoesSintaticas.add(
                new Conteudo("PORT_AGENTE_PASSIVA",
                        "PORT_AGENTE_PASSIVA")
        );

        secoes.add(new Secao("Funções Sintáticas", funcoesSintaticas));

        // =========================================================
        // SEÇÃO 03: Vozes Verbais
        // =========================================================

        List<Conteudo> vozesVerbais = new ArrayList<>();

        vozesVerbais.add(
                new Conteudo("PORT_VOZ_PASSIVA",
                        "PORT_VOZ_PASSIVA")
        );

        secoes.add(new Secao("Vozes Verbais", vozesVerbais));

        // =========================================================
        // SEÇÃO 04: Período Composto
        // =========================================================

        List<Conteudo> periodoComposto = new ArrayList<>();

        periodoComposto.add(
                new Conteudo("PORT_COORDENACAO_SUBORDINACAO",
                        "PORT_COORDENACAO_SUBORDINACAO")
        );

        periodoComposto.add(
                new Conteudo("PORT_ORACOES_COORDENADAS",
                        "PORT_ORACOES_COORDENADAS")
        );

        periodoComposto.add(
                new Conteudo("PORT_ORACOES_SUBORDINADAS_SUBSTANTIVAS",
                        "PORT_ORACOES_SUBORDINADAS_SUBSTANTIVAS")
        );

        periodoComposto.add(
                new Conteudo("PORT_ORACOES_SUBORDINADAS_ADJETIVAS",
                        "PORT_ORACOES_SUBORDINADAS_ADJETIVAS")
        );

        periodoComposto.add(
                new Conteudo("PORT_ORACOES_SUBORDINADAS_ADVERBIAIS",
                        "PORT_ORACOES_SUBORDINADAS_ADVERBIAIS")
        );

        periodoComposto.add(
                new Conteudo("PORT_ORACOES_REDUZIDAS_DESENVOLVIDAS",
                        "PORT_ORACOES_REDUZIDAS_DESENVOLVIDAS")
        );

        periodoComposto.add(
                new Conteudo("PORT_REDUZIDAS_INFINITIVO",
                        "PORT_REDUZIDAS_INFINITIVO")
        );

        secoes.add(new Secao("Período Composto", periodoComposto));

        // =========================================================
        // SEÇÃO 05: Paralelismo
        // =========================================================

        List<Conteudo> paralelismo = new ArrayList<>();

        paralelismo.add(
                new Conteudo("PORT_PARALELISMO",
                        "PORT_PARALELISMO")
        );

        secoes.add(new Secao("Paralelismo", paralelismo));

        // =========================================================
        // SEÇÃO 06: Funções das Palavras
        // =========================================================

        List<Conteudo> funcoesPalavras = new ArrayList<>();

        funcoesPalavras.add(
                new Conteudo("PORT_PALAVRA_QUE",
                        "PORT_PALAVRA_QUE")
        );

        funcoesPalavras.add(
                new Conteudo("PORT_PALAVRA_SE",
                        "PORT_PALAVRA_SE")
        );

        funcoesPalavras.add(
                new Conteudo("PORT_PALAVRA_COMO",
                        "PORT_PALAVRA_COMO")
        );

        secoes.add(new Secao("Funções das Palavras", funcoesPalavras));

        // =========================================================
        // SEÇÃO 07: Questões Comentadas - FGV
        // =========================================================

        List<Conteudo> fgv = new ArrayList<>();

        fgv.add(
                new Conteudo("PORT_FGV_ORACAO_REDUZIDA",
                        "PORT_FGV_ORACAO_REDUZIDA")
        );

        fgv.add(
                new Conteudo("PORT_FGV_VOZ_PASSIVA_PRONOMINAL",
                        "PORT_FGV_VOZ_PASSIVA_PRONOMINAL")
        );

        fgv.add(
                new Conteudo("PORT_FGV_PARALELISMO",
                        "PORT_FGV_PARALELISMO")
        );

        fgv.add(
                new Conteudo("PORT_FGV_ORACAO_CONDICIONAL",
                        "PORT_FGV_ORACAO_CONDICIONAL")
        );

        fgv.add(
                new Conteudo("PORT_FGV_ORACAO_ADJETIVA_ADJETIVO",
                        "PORT_FGV_ORACAO_ADJETIVA_ADJETIVO")
        );

        fgv.add(
                new Conteudo("PORT_FGV_PREPOSICAO_NOCIONAL",
                        "PORT_FGV_PREPOSICAO_NOCIONAL")
        );

        fgv.add(
                new Conteudo("PORT_FGV_ORDEM_DIRETA",
                        "PORT_FGV_ORDEM_DIRETA")
        );

        fgv.add(
                new Conteudo("PORT_FGV_TERMO_ELIPTICO",
                        "PORT_FGV_TERMO_ELIPTICO")
        );

        fgv.add(
                new Conteudo("PORT_FGV_COMPLEMENTO_TERMO_ANTERIOR",
                        "PORT_FGV_COMPLEMENTO_TERMO_ANTERIOR")
        );

        fgv.add(
                new Conteudo("PORT_FGV_SUJEITO_INDETERMINADO",
                        "PORT_FGV_SUJEITO_INDETERMINADO")
        );

        secoes.add(new Secao("Questões Comentadas - FGV", fgv));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Coordenação e Subordinação - Orações",
                secoes
        );
    }
}
