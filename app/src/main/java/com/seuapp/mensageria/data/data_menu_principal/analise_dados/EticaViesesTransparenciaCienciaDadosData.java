package com.seuapp.mensageria.data.data_menu_principal.analise_dados;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class EticaViesesTransparenciaCienciaDadosData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO AULA 01 - RAÍZES E FUNDAMENTOS DA IA
        // =========================================================

        List<Conteudo> raizesFundamentos = new ArrayList<>();

        raizesFundamentos.add(
                new Conteudo("MARCO_INICIAL_IA",
                        "MARCO_INICIAL_IA")
        );

        raizesFundamentos.add(
                new Conteudo("CILADA_MARCO_INICIAL",
                        "CILADA_MARCO_INICIAL")
        );

        raizesFundamentos.add(
                new Conteudo("IA_SIMBOLICA",
                        "IA_SIMBOLICA")
        );

        raizesFundamentos.add(
                new Conteudo("CONHECIMENTO_VS_RACIOCINIO",
                        "CONHECIMENTO_VS_RACIOCINIO")
        );

        raizesFundamentos.add(
                new Conteudo("BASE_CONHECIMENTO_VS_BD",
                        "BASE_CONHECIMENTO_VS_BD")
        );

        raizesFundamentos.add(
                new Conteudo("LINGUAGEM_FORMAL",
                        "LINGUAGEM_FORMAL")
        );

        secoes.add(new Secao(
                "📘 Raízes e Fundamentos da Inteligência Artificial",
                raizesFundamentos
        ));

        // =========================================================
        // SEÇÃO 02: VÍDEO AULA 02 - LÓGICAS E ONTOLOGIA
        // =========================================================

        List<Conteudo> logicaOntologia = new ArrayList<>();

        // --- Lógica Proposicional ---
        logicaOntologia.add(
                new Conteudo("LOGICA_PROPOSICIONAL",
                        "LOGICA_PROPOSICIONAL")
        );

        logicaOntologia.add(
                new Conteudo("CONECTIVO_IMPLICACAO",
                        "CONECTIVO_IMPLICACAO")
        );

        // --- Lógica de Primeira Ordem ---
        logicaOntologia.add(
                new Conteudo("LOGICA_PRIMEIRA_ORDEM",
                        "LOGICA_PRIMEIRA_ORDEM")
        );

        logicaOntologia.add(
                new Conteudo("QUANTIFICADORES",
                        "QUANTIFICADORES")
        );

        // --- Lógica Fuzzy ---
        logicaOntologia.add(
                new Conteudo("LOGICA_FUZZY",
                        "LOGICA_FUZZY")
        );

        logicaOntologia.add(
                new Conteudo("GRAU_PERTINENCIA",
                        "GRAU_PERTINENCIA")
        );

        logicaOntologia.add(
                new Conteudo("CILADA_FUNCAO_PERTINENCIA",
                        "CILADA_FUNCAO_PERTINENCIA")
        );

        // --- Ontologia ---
        logicaOntologia.add(
                new Conteudo("ONTOLOGIA",
                        "ONTOLOGIA")
        );

        secoes.add(new Secao(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                logicaOntologia
        ));

        // =========================================================
        // SEÇÃO 03: VÍDEO AULA 03 - SISTEMAS ESPECIALISTAS
        // =========================================================

        List<Conteudo> sistemasEspecialistas = new ArrayList<>();

        sistemasEspecialistas.add(
                new Conteudo("SISTEMAS_ESPECIALISTAS",
                        "SISTEMAS_ESPECIALISTAS")
        );

        sistemasEspecialistas.add(
                new Conteudo("ESTRUTURA_SE",
                        "ESTRUTURA_SE")
        );

        sistemasEspecialistas.add(
                new Conteudo("HEURISTICA_SE",
                        "HEURISTICA_SE")
        );

        sistemasEspecialistas.add(
                new Conteudo("LIMITACOES_SE",
                        "LIMITACOES_SE")
        );

        sistemasEspecialistas.add(
                new Conteudo("CILADA_APRENDIZADO_SE",
                        "CILADA_APRENDIZADO_SE")
        );

        secoes.add(new Secao(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                sistemasEspecialistas
        ));

        // =========================================================
        // SEÇÃO 04: VÍDEO AULA 04 - HISTÓRIA DA IA (INVERNOS E PRIMAVERAS)
        // =========================================================

        List<Conteudo> historiaIA = new ArrayList<>();

        historiaIA.add(
                new Conteudo("LINHA_TEMPO_IA",
                        "LINHA_TEMPO_IA")
        );

        historiaIA.add(
                new Conteudo("INVERNO_IA",
                        "INVERNO_IA")
        );

        historiaIA.add(
                new Conteudo("PRIMAVERA_IA",
                        "PRIMAVERA_IA")
        );

        historiaIA.add(
                new Conteudo("MUDANCA_PARADIGMA_1990",
                        "MUDANCA_PARADIGMA_1990")
        );

        historiaIA.add(
                new Conteudo("ALEXNET_2012",
                        "ALEXNET_2012")
        );

        historiaIA.add(
                new Conteudo("TRES_PILARES_2012",
                        "TRES_PILARES_2012")
        );

        historiaIA.add(
                new Conteudo("CILADA_1950_VS_1956",
                        "CILADA_1950_VS_1956")
        );

        secoes.add(new Secao(
                "📘 História da IA - Invernos e Primaveras",
                historiaIA
        ));

        // =========================================================
        // SEÇÃO 05: VÍDEO AULA 05 - CONCEITOS DE IA, AGENTES E ARQUITETURAS
        // =========================================================

        List<Conteudo> agentesArquiteturas = new ArrayList<>();

        agentesArquiteturas.add(
                new Conteudo("QUATRO_ABORDAGENS_IA",
                        "QUATRO_ABORDAGENS_IA")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_DEFINICAO",
                        "AGENTE_DEFINICAO")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_RACIONAL_VS_INTELIGENTE",
                        "AGENTE_RACIONAL_VS_INTELIGENTE")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_REATIVO_SIMPLES",
                        "AGENTE_REATIVO_SIMPLES")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_BASEADO_MODELO",
                        "AGENTE_BASEADO_MODELO")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_BASEADO_OBJETIVO",
                        "AGENTE_BASEADO_OBJETIVO")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_BASEADO_UTILIDADE",
                        "AGENTE_BASEADO_UTILIDADE")
        );

        agentesArquiteturas.add(
                new Conteudo("AGENTE_APRENDIZADO_COMPONENTES",
                        "AGENTE_APRENDIZADO_COMPONENTES")
        );

        agentesArquiteturas.add(
                new Conteudo("CILADA_IA_VS_ML",
                        "CILADA_IA_VS_ML")
        );

        secoes.add(new Secao(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                agentesArquiteturas
        ));

        // =========================================================
        // SEÇÃO 06: VÍDEO AULA 06 - FILOSOFIA DA IA
        // =========================================================

        List<Conteudo> filosofiaIA = new ArrayList<>();

        filosofiaIA.add(
                new Conteudo("IA_FRACA_VS_FORTE",
                        "IA_FRACA_VS_FORTE")
        );

        filosofiaIA.add(
                new Conteudo("AGI_E_SUPERINTELIGENCIA",
                        "AGI_E_SUPERINTELIGENCIA")
        );

        filosofiaIA.add(
                new Conteudo("TESTE_TURING",
                        "TESTE_TURING")
        );

        filosofiaIA.add(
                new Conteudo("ESTAGIOS_DESENVOLVIMENTO_IA",
                        "ESTAGIOS_DESENVOLVIMENTO_IA")
        );

        filosofiaIA.add(
                new Conteudo("CILADA_TESTE_TURING",
                        "CILADA_TESTE_TURING")
        );

        secoes.add(new Secao(
                "📘 Filosofia da IA - Capacidades e Estágios",
                filosofiaIA
        ));

        // =========================================================
        // SEÇÃO 07: VÍDEO AULA 07 - ÉTICA DA IA
        // =========================================================

        List<Conteudo> eticaIA = new ArrayList<>();

        eticaIA.add(
                new Conteudo("IA_EXPLICAVEL_XAI",
                        "IA_EXPLICAVEL_XAI")
        );

        eticaIA.add(
                new Conteudo("IA_ENVIESADA_BIAS",
                        "IA_ENVIESADA_BIAS")
        );

        eticaIA.add(
                new Conteudo("IA_RESPONSAVEL",
                        "IA_RESPONSAVEL")
        );

        eticaIA.add(
                new Conteudo("PILAR_FAT_FATE",
                        "PILAR_FAT_FATE")
        );

        eticaIA.add(
                new Conteudo("ACCOUNTABILITY_IA",
                        "ACCOUNTABILITY_IA")
        );

        eticaIA.add(
                new Conteudo("CILADA_XAI_VS_RESPONSAVEL",
                        "CILADA_XAI_VS_RESPONSAVEL")
        );

        eticaIA.add(
                new Conteudo("CILADA_BIAS_INCAPACIDADE",
                        "CILADA_BIAS_INCAPACIDADE")
        );

        secoes.add(new Secao(
                "📘 Ética da Inteligência Artificial",
                eticaIA
        ));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Ética e Boas Práticas em Ciência de Dados - Vieses Algorítmicos e Equidade",
                secoes
        );
    }
}
