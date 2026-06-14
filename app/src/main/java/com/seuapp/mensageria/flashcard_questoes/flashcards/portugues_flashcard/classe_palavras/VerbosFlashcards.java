package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class VerbosFlashcards {

    //"012345678901234567890123456789\n" // ate 32 caracteres por linha e no máximo 10 linhas

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =============================================
// SEÇÃO 1: IDENTIFICAÇÃO DE TEMPOS E MODOS
// =============================================

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_TEMPOS_MODO",
                "🧭 Identificar Tempos e Modos: Indicativo",
                "📌 As Terminações dos tempos: [Falar - Beber - Partir] \n" +
                        "✅ Presente → HOJE  \n →   [O, AS] - [O, ES] - [O, ES] \n" +
                        "✅ Pret. Perfeito → ONTEM  \n →    [EI, STE] - [I, STE] - [I, STE]   \n" +
                        "✅ Pret. Imperfeito → ANTIGAMENTE  \n  →  [VA, VAS] - [IA, IAS] - [IA, IAS]  \n" +
                        "✅ Pret. Mais-que-Perfeito →  OUTRORA  \n →   [RA, RAS] - [RA, RAS] - [RA, RAS]   \n" +
                        "✅ Fut. do Presente → AMANHÃ   \n  →  [REI, RÁS] - [REI, RÁS] - [REI, RÁS]  \n" +
                        "✅ Fut. do Pretérito → SE EU FOSSE VOCÊ, \n   →  [RIA, S] - [RIA, S] - [RIA, S]  "
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SUBJUNTIVO",
                "🧭 Identificar Tempos e Modos: Subjuntivo",
                "📌 As Terminações dos tempos: [Falar - Beber - Partir]\n" +
                        "✅ Presente → 'QUE' → [E - A - A] .\n" +
                        "✅ Pret. Imperfeito >  'SE' → [SSE - SSE - SSE] .\n" +
                        "✅ Futuro → 'QUANDO' → [AR - ER - IR] ."

        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_IMPERATIVO",
                "🧭 Identificar Tempos e Modos: Imperativo",
                "📌 As Terminações dos tempos: [Falar - Beber - Partir] \n" +
                        "✅ Afirmativo: → Deriva Pres. Subjuntivo, SEM [tu e vós] que são Pres. Indicativo → V + Pronome.\n" +
                        "✅ Negativo: → Deriva Pres. Subjuntivo → NÃO + V + PRONOME.\n" +
                        "👀 Ele(s) → Você(s) na conjugação. "

        ));



        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_CILADA_INDIC_SUBJ",
                "⚠️ Cilada #1: Indicativo vs. Subjuntivo",
                "🔍 ANTÍDOTO: Teste com HOJE (Indicativo) e QUE (Subjuntivo).\n" +
                        "• Se encaixa com HOJE → Presente do Indicativo.\n" +
                        "• Se encaixa com QUE → Presente do Subjuntivo.\n" +
                        "✅ Exemplo: 'É possível que (acorde) cedo.' → 'HOJE eu acordo?' NÃO. 'QUE eu acorde?' SIM. É Subjuntivo."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_CILADA_INF_PESS_FUT_SUBJ",
                "⚠️ Cilada #3: Infinitivo Pessoal vs. Futuro do Subjuntivo",
                "🔍 ANTÍDOTO (Macete de Troca): Substitua o verbo por um irregular (FAZER ou DIZER).\n" +
                        "• Se encaixar 'fazer' (infinitivo) → Infinitivo Pessoal.\n" +
                        "• Se encaixar 'fizer' (futuro subj.) → Futuro do Subjuntivo.\n" +
                        "✅ Exemplo: 'Logo que (amares)...' → 'Logo que fizeres...' → Futuro do Subjuntivo."
        ));

// =============================================
// SEÇÃO 2: SEMÂNTICA DOS TEMPOS VERBAIS
// =============================================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA_PRESENTE",
                "🧠 Semântica: Presente do Indicativo",
                "📌 O Presente pode ter 3 valores semânticos sem alterar o sentido factual:\n" +
                        "🟢 Valor de Presente: 'Guilherme está cansado.'\n" +
                        "🟢 Valor de Passado (Presente Histórico): 'Em 1500, Cabral chega ao Brasil.' (equivale a 'chegou')\n" +
                        "🟢 Valor de Futuro: 'Eu vou para Búzios amanhã.' (equivale a 'irei')"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA_IMPERFEITO",
                "🧠 Semântica: Pretérito Imperfeito do Indicativo",
                "📌 Dois principais valores semânticos cobrados em provas:\n" +
                        "🟢 Ação Contínua/Habitual: 'Ela brincava de boneca na infância.' (ação repetida no passado)\n" +
                        "🟢 Desejo NÃO Realizado (uso coloquial): 'Ah, eu jantava com você hoje.' (equivale ao Futuro do Pretérito 'jantaria', mudando apenas o nível de formalidade)"
        ));



        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA_FUT_PRET",
                "🧠 Semântica: Futuro do Pretérito do Indicativo (-ria)",
                "📌 Três valores semânticos principais:\n" +
                        "🟢 Fato Futuro em Relação ao Passado: 'Ele disse que faria os deveres.' (CORRELAÇÃO OBRIGATÓRIA)\n" +
                        "🟢 Incerteza/Dúvida: 'Quem estaria lá?'\n" +
                        "🟢 Polidez/Cortesia: 'Eu gostaria de um café, por favor.'"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA_SUBJUNTIVO",
                "🧠 Semântica: Hipótese, possibilidade, dúvida",
                "📌 Aplica-se a todos os seus tempos:\n" +
                        "🟢 Presente: Esperamos que ele vença.\n" +
                        "🟢 Imperfeito: Se os alunos estudassem, iriam bem na prova.\n" +
                        "🟢 Futuro: Quando eu chegar na praia, vou mergulhar no mar.'"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_CORRELACAO_SEMANTICA",
                "⚠️ Correlação Semântica (Regra de Ouro)",
                "✅ Regra Infalível para provas:\n" +
                        "• Verbo introdutório no PRESENTE + ação futura → FUTURO DO PRESENTE ('Ele diz que fará').\n" +
                        "• Verbo introdutório no PASSADO + ação futura → FUTURO DO PRETÉRITO ('Ele disse que faria').\n" +
                        "❌ Erro comum: 'Ele disse que fará' → Incorreto! Deve ser 'faria'."
        ));

// =============================================
// SEÇÃO 3: ESTRUTURA DO VERBO (DESINÊNCIAS)
// =============================================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_ESTRUTURA_COMPONENTES",
                "🔧 Estrutura do Verbo - Componentes Básicos",
                "📌 1. RADICAL: Parte invariável com o significado (ex: FAL- de falar).\n" +
                        "📌 2. VOGAL TEMÁTICA (VT): Classifica a conjugação (1ª = A, 2ª = E, 3ª = I). Descoberta no infinitivo.\n" +
                        "📌 3. TEMA = RADICAL + VOGAL TEMÁTICA.\n" +
                        "📌 4. DESINÊNCIA MODO-TEMPORAL (DMT): Marca tempo/modo. É a 'muleta' repetida nas pessoas.\n" +
                        "📌 5. DESINÊNCIA NÚMERO-PESSOAL (DNP): Marca a pessoa (eu, tu, ele)."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_ESTRUTURA_DMT",
                "🔧 DMT (Desinência Modo-Temporal) nos Principais Tempos",
                "📌 PRETÉRITO IMPERFEITO do INDICATIVO: DMT = -va- (1ª conj.) e -ia- (2ª/3ª conj.).\n" +
                        "📌 FUTURO DO PRESENTE do INDICATIVO: DMT = -r(e)- (com alomorfes -rá-, -rê-).\n" +
                        "📌 PRESENTE do SUBJUNTIVO: DMT = -e- (1ª conj.) e -a- (2ª/3ª conj.).\n" +
                        "📌 PRETÉRITO IMPERFEITO do SUBJUNTIVO: DMT = -sse-.\n" +
                        "📌 PRESENTE do INDICATIVO: NÃO POSSUI DMT."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_ESTRUTURA_PASSOS",
                "🔧 Método Prático de Análise Estrutural (6 Passos)",
                "✅ 1. INFINITIVO: Leve a forma para o infinitivo.\n" +
                        "✅ 2. TEMPO/MODO: Use as 'palavrinhas mágicas'.\n" +
                        "✅ 3. RADICAL: Isole a parte invariável.\n" +
                        "✅ 4. VOGAL TEMÁTICA (VT): Consulte o infinitivo (A, E, I).\n" +
                        "✅ 5. DMT: Identifique a terminação repetida no tempo.\n" +
                        "✅ 6. DNP: O que sobra ou varia de pessoa para pessoa (pode ser ZERO)."
        ));

// =============================================
// SEÇÃO 4: FORMAS NORMAIS (PARTICÍPIO, INFINITIVO, GERÚNDIO)
// =============================================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_PARTICIPIO_ABUNDANTES",
                "📌 Verbos Abundantes (Particípio Duplo) - Regra de Ouro",
                "✅ REGRA INFALÍVEL para verbos abundantes (aceitar, entregar, imprimir):\n" +
                        "• Com TER/HAVER → Use PARTICÍPIO REGULAR (-do). Ex: 'Tinha aceitado'.\n" +
                        "• Com SER/ESTAR/FICAR → Use PARTICÍPIO IRREGULAR. Ex: 'Foi aceito'.\n" +
                        "⚠️ EXCEÇÕES (Liberou Geral): ganhar, gastar, pegar, pagar → aceita ambas as formas."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_INFINITIVO_PESSOAL_IMPESSOAL",
                "📌 Infinitivo: Impessoal vs. Pessoal",
                "📌 INFINITIVO IMPESSOAL: É o nome do verbo. Termina em -R. Não tem sujeito. Ex: 'Comer faz bem.'\n" +
                        "📌 INFINITIVO PESSOAL: É o infinitivo conjugado. Tem sujeito. Macete: use 'PARA' antes (Para eu falar, para tu falares).\n" +
                        "📌 INFINITIVO PESSOAL FLEXIONADO: Apresenta desinências (-es, -mos, -des). Ex: 'É importante estudares.'\n" +
                        "📌 INFINITIVO PESSOAL NÃO FLEXIONADO: Mantém a forma do impessoal, mas tem sujeito. Ex: 'Ficamos felizes por você chegar.'"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_GERUNDIO_BOM_MAU",
                "📌 Gerúndio: Bom Uso vs. Gerundismo (Mau Uso)",
                "✅ BOM GERÚNDIO (uso correto):\n" +
                        "🟢 Ação Contínua/Durativa: 'Fiquei escrevendo a redação.'\n" +
                        "🟢 Ação Simultânea: 'Ele fala gesticulando.'\n" +
                        "❌ GERUNDISMO (uso incorreto):\n" +
                        "🔴 Ação Instantânea: 'Vou estar transferindo' (o correto é 'Vou transferir').\n" +
                        "🔴 Ação Posterior: 'Escreveu enviando' (o correto é 'Escreveu e enviou')."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_GERUNDIO_VALORES",
                "🧠 Gerúndio: Valores Semânticos (Substitui Orações Adverbiais)",
                "📌 VALOR de TEMPO: 'Chegando, avise-me.' (equivale a 'Quando chegar')\n" +
                        "📌 VALOR de CAUSA: 'Terminando o trabalho, foi descansar.' (equivale a 'Porque terminou')\n" +
                        "📌 VALOR de CONSEQUÊNCIA: 'Ele chegou feliz, contagiando a todos.' (equivale a 'de modo que contagiou')\n" +
                        "🧠 MACETE: Isole o gerúndio e pergunte a relação lógica com o verbo principal (quando? por quê? com que efeito?)."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_VINDO_GERUNDIO_PARTICIPIO",
                "⚠️ Cilada do Verbo 'VIR': Gerúndio ou Particípio?",
                "🔍 O problema: 'vindo' pode ser GERÚNDIO ('estou vindo') ou PARTICÍPIO ('ele tem vindo').\n" +
                        "✅ ANTÍDOTO: Substitua mentalmente por 'CHEGAR'.\n" +
                        "• Se 'chegando' fizer sentido → é GERÚNDIO. (Estou vindo → Estou chegando)\n" +
                        "• Se 'chegado' fizer sentido → é PARTICÍPIO. (Ele tem vindo → Ele tem chegado)"
        ));

        return lista;
    }
}
