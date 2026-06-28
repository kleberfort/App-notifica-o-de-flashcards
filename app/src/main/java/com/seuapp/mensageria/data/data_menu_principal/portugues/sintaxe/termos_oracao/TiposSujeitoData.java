package com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.termos_oracao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class TiposSujeitoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =============================================
        // SEÇÃO 1: CONCEITOS BÁSICOS (Vídeo 01)
        // =============================================

        List<Conteudo> conceitosBasicos = new ArrayList<>();
        conceitosBasicos.add(new Conteudo("CONCEITO", "Frase, Oração e Período"));
        conceitosBasicos.add(new Conteudo("MESTRE_DESESPERO", "Macete: Vá ao VERBO"));
        conceitosBasicos.add(new Conteudo("SUJEITO_VS_REFERENTE", "Diferença: Sujeito x Referente"));

        secoes.add(new Secao("📘 Conceitos Fundamentais", conceitosBasicos));

        // =============================================
        // SEÇÃO 2: FCC - SINTONIA FINA (Vídeo 02)
        // =============================================

        List<Conteudo> fccSintonia = new ArrayList<>();
        fccSintonia.add(new Conteudo("MACETE_ELIMINACAO_SUJEITO", "Macete de Eliminação para Sujeito"));
        fccSintonia.add(new Conteudo("INFINITIVO_RESPETTO", "Infinitivo como Verbo de Respeito"));
        fccSintonia.add(new Conteudo("SE_PASSIVADOR", "Macete: 'Um SE muda tudo' (P.A.P.)"));

        secoes.add(new Secao("🎯 FCC - Sintonias para Prova", fccSintonia));

        // =============================================
        // SEÇÃO 3: TIPOS DE SUJEITO (Vídeo 03)
        // =============================================

        List<Conteudo> tiposSujeito = new ArrayList<>();
        tiposSujeito.add(new Conteudo("SIMPLES_VS_COMPOSTO", "1. Simples e 2. Composto (Núcleo do Sujeito)"));
        tiposSujeito.add(new Conteudo("OCULTO_DESINENCIAL_CONTEXTUAL", "3. Sujeito Oculto (Elíptico)"));
        tiposSujeito.add(new Conteudo("INFINITIVO_IMPESSOAL", "3ª Forma de Indeterminado (Infinitivo Impessoal)"));
        tiposSujeito.add(new Conteudo("SUJEITO_INDETERMINADO", "4. Sujeito Indeterminado (3 Formas)"));
        tiposSujeito.add(new Conteudo("SUJEITO_INEXISTENTE", "5. Sujeito Inexistente (Verbos Impessoais)"));
        tiposSujeito.add(new Conteudo("SUJEITO_ORACIONAL", "6. Sujeito Oracional (Macete do ISSO)"));
        tiposSujeito.add(new Conteudo("FLUXO_DECISAO_SUJEITO", "Passo a Passo para Classificar"));

        secoes.add(new Secao("🔍 Os 6 Tipos de Sujeito", tiposSujeito));

        // =============================================
        // SEÇÃO 4: CILADAS E ANTÍDOTOS (Vídeo 03-05)
        // =============================================

        List<Conteudo> ciladas = new ArrayList<>();
        ciladas.add(new Conteudo("CILADA_3_PLURAL", "Cilada: Verbo na 3ª plural NÃO é sempre indeterminado"));
        ciladas.add(new Conteudo("HOUVE_VS_OCORRERAM", "Cilada Clássica: Houve vs Ocorreram"));
        ciladas.add(new Conteudo("VIVA_CADA_VERBO", "Macete: Frases com 2 ou mais verbos"));
        ciladas.add(new Conteudo("POSICAO_DO_SUJEITO", "Sujeito Posposto não muda classificação"));

        secoes.add(new Secao("⚠️ Ciladas e Antídotos", ciladas));

        // =============================================
        // SEÇÃO 5: REVISÃO RÁPIDA (Flashcards ANKI)
        // =============================================

        List<Conteudo> revisaoRapida = new ArrayList<>();
        revisaoRapida.add(new Conteudo("REVISAO_RAPIDA_01", "Perguntas e Respostas - Parte 1"));
        revisaoRapida.add(new Conteudo("REVISAO_RAPIDA_02", "Perguntas e Respostas - Parte 2"));
        revisaoRapida.add(new Conteudo("REVISAO_RAPIDA_03", "Tabela Resumo dos 6 Tipos"));
        revisaoRapida.add(new Conteudo("MACETES_FINAIS", "Macetes de OURO para Prova"));

        secoes.add(new Secao("⚡ Revisão Rápida para Prova", revisaoRapida));

        // =============================================
        // Criando e retornando a Disciplina
        // =============================================

        return new Disciplina("Análise Sintática - Tipos de Sujeito", secoes);
    }
}