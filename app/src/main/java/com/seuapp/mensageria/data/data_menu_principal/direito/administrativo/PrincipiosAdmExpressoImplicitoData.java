package com.seuapp.mensageria.data.data_menu_principal.direito.administrativo;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class PrincipiosAdmExpressoImplicitoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Fundamentos - Direito Público vs. Privado
        // =========================================================

        List<Conteudo> fundamentos = new ArrayList<>();

        fundamentos.add(
                new Conteudo("DIR_PUBLICO_VS_PRIVADO",
                        "DIR_PUBLICO_VS_PRIVADO")
        );

        fundamentos.add(
                new Conteudo("IDENTIDADE_DO_DIREITO_ADM",
                        "IDENTIDADE_DO_DIREITO_ADM")
        );

        fundamentos.add(
                new Conteudo("REGIMES_NAO_CONFUNDIR",
                        "REGIMES_NAO_CONFUNDIR")
        );

        fundamentos.add(
                new Conteudo("FUNCOES_DOS_PRINCIPIOS",
                        "FUNCOES_DOS_PRINCIPIOS")
        );

        fundamentos.add(
                new Conteudo("HIERARQUIA_ENTRE_PRINCIPIOS",
                        "HIERARQUIA_ENTRE_PRINCIPIOS")
        );

        fundamentos.add(
                new Conteudo("EXPRESSOS_VS_IMPLICITOS",
                        "EXPRESSOS_VS_IMPLICITOS")
        );

        secoes.add(
                new Secao("Regime Jurídico Administrativo", fundamentos)
        );


        // =========================================================
        // SEÇÃO 02: Princípios Expressos (L.I.M.P.E.)
        // =========================================================

        List<Conteudo> principiosExpressos = new ArrayList<>();

        principiosExpressos.add(
                new Conteudo("MACETE_MESTRE_LIMPE",
                        "MACETE_MESTRE_LIMPE")
        );

        principiosExpressos.add(
                new Conteudo("ONDE_SE_APLICA_LIMPE",
                        "ONDE_SE_APLICA_LIMPE")
        );

        principiosExpressos.add(
                new Conteudo("LEGALIDADE_DETALHES",
                        "LEGALIDADE_DETALHES")
        );

        principiosExpressos.add(
                new Conteudo("IMPESSOALIDADE_APLICACOES",
                        "IMPESSOALIDADE_APLICACOES")
        );

        principiosExpressos.add(
                new Conteudo("AGENTE_DE_FATO",
                        "AGENTE_DE_FATO")
        );

        principiosExpressos.add(
                new Conteudo("INTERESSE_PUBLICO_PRIMARIO_SECUNDARIO",
                        "INTERESSE_PUBLICO_PRIMARIO_SECUNDARIO")
        );

        secoes.add(
                new Secao("Princípios Expressos (L.I.M.P.E.)", principiosExpressos)
        );


        // =========================================================
        // SEÇÃO 03: Princípios da Moralidade, Publicidade e Eficiência
        // =========================================================

        List<Conteudo> moralidadePublicidadeEficiencia = new ArrayList<>();

        moralidadePublicidadeEficiencia.add(
                new Conteudo("MORALIDADE_AUTONOMIA",
                        "MORALIDADE_AUTONOMIA")
        );

        moralidadePublicidadeEficiencia.add(
                new Conteudo("SUMULA_VINCULANTE_13_NEPOTISMO",
                        "SUMULA_VINCULANTE_13_NEPOTISMO")
        );

        moralidadePublicidadeEficiencia.add(
                new Conteudo("GRAUS_NEPOTISMO",
                        "GRAUS_NEPOTISMO")
        );

        moralidadePublicidadeEficiencia.add(
                new Conteudo("PUBLICIDADE_EFICACIA",
                        "PUBLICIDADE_EFICACIA")
        );

        moralidadePublicidadeEficiencia.add(
                new Conteudo("TRANSPARENCIA_ATIVA_PASSIVA",
                        "TRANSPARENCIA_ATIVA_PASSIVA")
        );

        moralidadePublicidadeEficiencia.add(
                new Conteudo("EFICIENCIA_EC_19_98",
                        "EFICIENCIA_EC_19_98")
        );

        secoes.add(
                new Secao("Princípios da Moralidade, Publicidade e Eficiência", moralidadePublicidadeEficiencia)
        );


        // =========================================================
        // SEÇÃO 04: Princípios Implícitos (Razoabilidade, Continuidade, Segurança Jurídica)
        // =========================================================

        List<Conteudo> principiosImplicitos = new ArrayList<>();

        principiosImplicitos.add(
                new Conteudo("RAZOABILIDADE_PROPORCIONALIDADE",
                        "RAZOABILIDADE_PROPORCIONALIDADE")
        );

        principiosImplicitos.add(
                new Conteudo("SUBPRINCIPIOS_PROPORCIONALIDADE",
                        "SUBPRINCIPIOS_PROPORCIONALIDADE")
        );

        principiosImplicitos.add(
                new Conteudo("CONTINUIDADE_SERVICO_PUBLICO",
                        "CONTINUIDADE_SERVICO_PUBLICO")
        );

        principiosImplicitos.add(
                new Conteudo("SEGURANCA_JURIDICA",
                        "SEGURANCA_JURIDICA")
        );

        principiosImplicitos.add(
                new Conteudo("PRAZO_DECADENCIAL_5_ANOS",
                        "PRAZO_DECADENCIAL_5_ANOS")
        );

        secoes.add(
                new Secao("Princípios Implícitos (Razoabilidade, Continuidade, Segurança Jurídica)", principiosImplicitos)
        );


        // =========================================================
        // SEÇÃO 05: Autotutela e Motivação
        // =========================================================

        List<Conteudo> autotutelaMotivacao = new ArrayList<>();

        autotutelaMotivacao.add(
                new Conteudo("SUMULA_473_AUTOTUTELA",
                        "SUMULA_473_AUTOTUTELA")
        );

        autotutelaMotivacao.add(
                new Conteudo("AUTOTUTELA_VS_TUTELA",
                        "AUTOTUTELA_VS_TUTELA")
        );

        autotutelaMotivacao.add(
                new Conteudo("MOTIVACAO_REGRA_EXCECAO",
                        "MOTIVACAO_REGRA_EXCECAO")
        );

        secoes.add(
                new Secao("Autotutela e Motivação", autotutelaMotivacao)
        );


        // =========================================================
        // SEÇÃO 06: Outros Princípios Implícitos
        // =========================================================

        List<Conteudo> outrosPrincipios = new ArrayList<>();

        outrosPrincipios.add(
                new Conteudo("CONSENSUALIDADE",
                        "CONSENSUALIDADE")
        );

        outrosPrincipios.add(
                new Conteudo("ESPECIALIDADE",
                        "ESPECIALIDADE")
        );

        outrosPrincipios.add(
                new Conteudo("PRECAUCAO",
                        "PRECAUCAO")
        );

        outrosPrincipios.add(
                new Conteudo("SINDICABILIDADE",
                        "SINDICABILIDADE")
        );

        outrosPrincipios.add(
                new Conteudo("INTRANSCENDENCIA_SUBJETIVA",
                        "INTRANSCENDENCIA_SUBJETIVA")
        );

        secoes.add(
                new Secao("Outros Princípios Implícitos", outrosPrincipios)
        );


        // =========================================================
        // SEÇÃO 07: Resumo Geral dos Princípios
        // =========================================================

        List<Conteudo> resumoGeral = new ArrayList<>();

        resumoGeral.add(
                new Conteudo("CLASSIFICACAO_FINAL",
                        "CLASSIFICACAO_FINAL")
        );

        resumoGeral.add(
                new Conteudo("REGRA_NAO_HA_HIERARQUIA",
                        "REGRA_NAO_HA_HIERARQUIA")
        );

        resumoGeral.add(
                new Conteudo("CILADAS_FINAL",
                        "CILADAS_FINAL")
        );

        resumoGeral.add(
                new Conteudo("MEMORIZE_PARA_PROVA",
                        "MEMORIZE_PARA_PROVA")
        );

        secoes.add(
                new Secao("Resumo Geral dos Princípios", resumoGeral)
        );


        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Princípios Expressos e Implícitos da Administração Pública",
                secoes
        );
    }
}