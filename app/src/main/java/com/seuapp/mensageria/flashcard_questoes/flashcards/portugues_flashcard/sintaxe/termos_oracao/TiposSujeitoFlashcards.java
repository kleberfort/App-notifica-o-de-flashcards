package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.termos_oracao;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class TiposSujeitoFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // === VÍDEO 01 - CONCEITOS BÁSICOS ===

        lista.add(new Flashcard(
                "📘 Análise Sintática - Conceitos",
                "CONCEITO",
                "🧭 Macetes de Acesso Rápido",
                "📌 FRASE: Qualquer enunciado com sentido.\n" +
                        "🟢 ORAÇÃO: Frase com verbo (TEM QUE TER VERBO).\n" +
                        "🔵 PERÍODO: Frase verbal com 1 OU + orações.\n" +
                        "📌 PREDICADO: É TUDO MENOS O SUJEITO (obrigatório).\n" +
                        "🟢 ORDEM DIRETA: SVC + Adj. Adverbial no final.\n" +
                        "🔴 ORDEM INVERSA: Fuga do padrão SVC (NÃO É ERRO)."
        ));

        lista.add(new Flashcard(
                "📘 Análise Sintática - Conceitos",
                "CONCEITO",
                "🧭 Macetes de Acesso Rápido",
                "📌 SUJEITO: QUEM ou O QUE executa ou Sofre a ação.\n" +
                        "🟢 PODE SER: Ativa ou Passiva.\n" +
                        "🔵 Pergunte: (QUMEM/O QUE É) que + verbo? \n" +
                        " Ex.: O empregado vendeu o carro. \n" +
                        "🟢 ORDEM DIRETA: SVC + Adj. Adverbial no final.\n" +
                        "🔴 ORDEM INVERSA: Fuga do padrão SVC (NÃO É ERRO)."
        ));

        lista.add(new Flashcard(
                "📘 Análise Sintática - Conceitos",
                "MESTRE_DESESPERO",
                "🧭 Macete Mestre para Achar Sujeito",
                "📌 'No desespero, vá ao VERBO!':\n" +
                        "🟢 Comece a análise sempre pelo verbo.\n" +
                        "🔵 Para achar sujeito: Pergunte 'QUEM é que + verbo?'.\n" +
                        "📌 O que sobrar é o PREDICADO.\n" +
                        "🟢 Ordem direta = SVC. Deslocamento = inversa."
        ));

        lista.add(new Flashcard(
                "📘 Análise Sintática - Conceitos",
                "SUJEITO_VS_REFERENTE",
                "🧭 Diferença Crucial para Prova",
                "📌 SUJEITO (sintático): está PRESENTE na oração.\n" +
                        "🔵 REFERENTE (semântico): está FORA da oração.\n" +
                        "🟢 Referente 'recebe a seta' do contexto.\n" +
                        "📌 Ex: 'Meninos jogam futebol. Jogam todo dia' → verbo 'jogam' tem sujeito oculto (meninos = referente)."
        ));

        // === VÍDEO 02 - FCC SINTONIA FINA ===

        lista.add(new Flashcard(
                "📘 Análise Sintática FCC",
                "MACETE_ELIMINACAO_SUJEITO",
                "🧭 Eliminação Rápida para Sujeito",
                "📌 Sujeito NUNCA é preposicionado.\n" +
                        "🔵 Sujeito NUNCA é circunstância (tempo, modo, lugar).\n" +
                        "🟢 Elimine alternativas com 'pelo, da, no, na'.\n" +
                        "📌 Elimine alternativas com 'ontem, ali, devagar'.\n" +
                        "🔴 Pergunta certa: 'O que é que começou?' (sujeito primeiro)."
        ));

        lista.add(new Flashcard(
                "📘 Análise Sintática FCC",
                "INFINITIVO_RESPETTO",
                "🧭 Tratamento do Infinitivo",
                "📌 Infinitivo é VERBO DE RESPEITO.\n" +
                        "🟢 Ele tem sujeito e objeto como qualquer verbo.\n" +
                        "🔵 Ao ver infinitivo, pergunte: 'Quem pratica essa ação?'.\n" +
                        "🔴 Sujeito geralmente é OCULTO (elipse do contexto).\n" +
                        "📌 Ex: 'Ao ler o necrológio...' → Quem lê? Alguém (oculto)."
        ));

        lista.add(new Flashcard(
                "📘 Análise Sintática FCC",
                "SE_PASSIVADOR",
                "🧭 Um SE Muda Tudo (P.A.P.)",
                "📌 'Um SE muda tudo' - Partícula Apassivadora.\n" +
                        "🟢 Sem SE: Sujeito agente + Objeto Direto.\n" +
                        "🔵 Com SE: Objeto Direto vira SUJEITO PACIENTE(sofre ou recebe) ação do verbo.\n" +
                        "📌 Ex: 'Fez o rio' → rio = OD.\n" +
                        "🔴 'Fez-se o rio' → rio = Sujeito ('O rio foi feito')."
        ));

        // === VÍDEO 03 - TIPOS DE SUJEITO (PASSO A PASSO) ===

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "SIMPLES_VS_COMPOSTO",
                "🧭 Núcleo do Sujeito",
                "📌 Núcleo = substantivo, pronome ou numeral.\n" +
                        "🟢 Núcleo NUNCA vem precedido de preposição.\n" +
                        "🔵 SIMPLES: 1 único núcleo. 'O menino chegou'.\n" +
                        "📌 COMPOSTO: 2 ou mais núcleos. 'João e Maria chegaram'.\n" +
                        "🔴 'Alguém chegou' → SIMPLES (núcleo: alguém), não é indeterminado."
        ));


        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "OCULTO_DESINENCIAL_CONTEXTUAL",
                "🧭 Sujeito Oculto (Elíptico)",
                "📌 OCULTO DESINENCIAL: Verbo na 1ª = (Sin/Plu) pessoa revela.\n" +
                        "🟢 Ex: 'Estamos felizes' → sujeito = NÓS (desinência -mos).\n" +
                        "🔵 OCULTO CONTEXTUAL: Verbo na 3ª sing., contexto revela.\n" +
                        "📌 Ex: 'João chegou. (Ele) Estava feliz'.\n" +
                        "🔴 Diferença: Oculto → você SABE quem é | Indeterminado → NÃO sabe."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "SUJEITO_INDETERMINADO",
                "🧭 3 Formas de Indeterminar",
                "📌 Forma 1: Verbo na 3ª pessoa do plural sem referente.\n" +
                        "🟢 Ex: 'Falaram bem de você' (quem? não sei).\n" +
                        "🔵 Forma 2: Verbo na 3ª sing. + SE (IIS - verbo TI ou VI (Não vai para passiva)).\n" +
                        "📌 Ex: 'Precisa-se de ajudantes' (verbo transitivo indireto).\n"+
                        "🔵 Forma 3: Infinitivo Impessoal sem sujeito explícito.\n"+
                        "📌 Ex: 'Fraudar/fazer."
        ));


        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "INFINITIVO_IMPESSOAL",
                "🧭 3ª Forma de Indeterminado",
                "📌 INFINITIVO IMPESSOAL = sujeito INDETERMINADO.\n" +
                        "🟢 Verbo no infinitivo sem sujeito explícito.\n" +
                        "🔵 Ex: 'Prenderam os suspeitos de FRAUDAR o INSS'.\n" +
                        "📌 Quem frauda? Alguém, não se sabe (indeterminado).\n" +
                        "🔴 Ex2: 'É necessário FAZER a revisão' → sujeito de 'fazer' = indeterminado."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "SUJEITO_INEXISTENTE",
                "🧭 Verbos Impessoais (Decore!)",
                "📌 Situações de Sujeito INEXISTENTE - Verbo Impessoal\n" +
                        "🟢 1. Fenômenos da natureza: chover, nevar, ventar.\n" +
                        "🔵 2. Verbo HAVER sentido de existir/ocorrer: 'Há problemas'.\n" +
                        "📌 3. Verbo FAZER/HAVER indicando tempo: 'Faz 3 anos'.\n" +
                        "🔴 CILADA: 'Fazem 2 horas' ❌ | 'Faz 2 horas' ✓"
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "SUJEITO_ORACIONAL",
                "🧭 Macete do ISSO",
                "📌 Sujeito ORACIONAL = sujeito é uma oração (tem verbo dentro).\n" +
                        "🟢 TESTE: Troque o sujeito por 'ISSO'.\n" +
                        "🔵 Se fizer sentido e tiver verbo dentro = Oracional.\n" +
                        "📌 Ex: 'Que você estudasse era importante' → 'ISSO era importante'.\n" +
                        "🔴 NÃO precisa ter 'QUE'! 'Praticar exercícios é bom' → Oracional."
        ));



        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "FLUXO_DECISAO_SUJEITO",
                "🧭 Passo a Passo para Classificar",
                "📌 1º Verbo impessoal? (fenomeno natural, \'faz\' tempo, \'há\' existindo)  → INEXISTENTE. (FIM)\n" +
                        "📌 2º Sujeito NÃO aparece na oração? → OCULTO > Desinência (1° Sin/Plu) (FIM).\n" +
                        "📌 3º Aparece mas NÃO sei quem é? → INDETERMINADO (3° Plural ou 3° Singular + SE) (FIM).\n" +
                        "📌 4º Aparece e sei: 1 núcleo = SIMPLES | 2+ = COMPOSTO.\n" +
                        "🔴 CASO ESPECIAL: Sujeito é oração (tem verbo) = ORACIONAL. Troque por (ISSO)."
        ));



        // === VÍDEO 04 - TABELA COMPARATIVA ===




        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "CILADA_3_PLURAL",
                "🧭 Verbo na 3ª Plural NÃO é sempre Indeterminado",
                "📌 MITO: 'Verbo na 3ª plural = indeterminado'.\n" +
                        "🟢 Pode ser SIMPLES: 'Os meninos chegaram' (sujeito aparece).\n" +
                        "🔵 Pode ser OCULTO: 'Chegaram. Os meninos...' (referente no contexto).\n" +
                        "📌 É INDETERMINADO só quando NÃO dá para saber quem.\n" +
                        "🔴 Ex: 'Chegaram cedo' (alguém, mas quem? ninguém sabe)."
        ));

        // === VÍDEO 05 - EXERCÍCIOS DE FIXAÇÃO ===

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "HOUVE_VS_OCORRERAM",
                "🧭 Cilada Clássica das Bancas",
                "📌 'Houve' (sentido existir) → INEXISTENTE (impessoal).\n" +
                        "🟢 Ex: 'Houve algumas rebeliões' → NÃO tem sujeito.\n" +
                        "🔵 'Ocorreram' → tem sujeito (pessoal).\n" +
                        "📌 Ex: 'Ocorreram algumas rebeliões' → sujeito SIMPLES (rebeliões).\n" +
                        "🔴 A banca ADORA trocar esses dois para confundir."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "VIVA_CADA_VERBO",
                "🧭 Frases com 2 ou Mais Verbos",
                "📌 'Viva cada verbo a seu momento'.\n" +
                        "🟢 Pegue um verbo por vez, classifique seu sujeito.\n" +
                        "🔵 Depois vá ao próximo verbo. SEM PÂNICO.\n" +
                        "📌 Ex: 'Parece que ele chega hoje'.\n" +
                        "🔴 Verbo 'Parece' → sujeito: 'que ele chega' (oracional). Verbo 'chega' → sujeito: 'ele' (simples)."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "POSICAO_DO_SUJEITO",
                "🧭 Sujeito Posposto não Muda Classificação",
                "📌 Sujeito pode vir antes OU depois do verbo.\n" +
                        "🟢 Ex: 'A chama arde' = 'Arde a chama' (mesmo sujeito simples).\n" +
                        "🔵 CUIDADO com adjuntos adverbiais no início.\n" +
                        "📌 'Na torre habita uma bruxa' → 'na torre' é adjunto (preposição).\n" +
                        "🔴 Sujeito é 'uma bruxa' (simples). Núcleo NUNCA tem preposição."
        ));

        // === FLASHCARDS DE REVISÃO RÁPIDA (ESTILO ANKI DO RESUMO) ===

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "REVISAO_RAPIDA_01",
                "🧭 Perguntas e Respostas - Parte 1",
                "📌 Q: O que é uma frase? R: Qualquer enunciado com sentido.\n" +
                        "🟢 Q: O que é uma oração? R: Frase que contém verbo.\n" +
                        "🔵 Q: Termo obrigatório na oração? R: Predicado (tem o verbo).\n" +
                        "📌 Q: Como perguntar pelo sujeito? R: 'QUEM/O QUE é que + verbo?'\n" +
                        "🔴 Q: Ordem inversa é erro? R: NÃO! É deslocamento para ênfase."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "REVISAO_RAPIDA_02",
                "🧭 Perguntas e Respostas - Parte 2",
                "📌 Q: Diferença sujeito indeterminado vs oculto? R: Oculto você SABE quem é (desinência). Indeterminado NÃO sabe.\n" +
                        "🟢 Q: Verbo fazer tempo ('faz 2 horas')? R: Sujeito INEXISTENTE (impessoal).\n" +
                        "🔵 Q: Como identificar sujeito oracional? R: Troque por ISSO. Se tiver verbo dentro = oracional.\n" +
                        "📌 Q: 'Sujeito oracional sempre tem QUE'? R: ERRADO! Pode ser infinitivo: 'Estudar é bom'."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "REVISAO_RAPIDA_03",
                "🧭 Tabela dos 6 Tipos - Resumo",
                "📌 SIMPLES: 1 núcleo. 'O menino chegou'.\n" +
                        "🟢 COMPOSTO: 2+ núcleos. 'João e Maria chegaram'.\n" +
                        "🔵 OCULTO: Não aparece, mas sabemos. '(Eu) Estou feliz'.\n" +
                        "📌 INDETERMINADO: Aparece? NÃO, mas existe. 'Chegaram cedo'.\n" +
                        "🔴 INEXISTENTE: Não existe sujeito. 'Choveu' / 'Há problemas'.\n" +
                        "🟢 ORACIONAL: Sujeito é oração. 'Que você estude é bom'."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Sujeito",
                "MACETES_FINAIS",
                "🧭 Macetes de OURO para Prova",
                "📌 Núcleo do sujeito NUNCA tem preposição.\n" +
                        "🟢 Trocar por ISSO → revela sujeito oracional.\n" +
                        "🔵 Verbo na 3ª plural NÃO é sinônimo de indeterminado.\n" +
                        "📌 Decore: HAVER (existir) e FAZER (tempo) = INEXISTENTE.\n" +
                        "🔴 'Choveram elogios' → tem sujeito (sentido figurado, não é fenômeno)."
        ));


        return lista;

    }
}
