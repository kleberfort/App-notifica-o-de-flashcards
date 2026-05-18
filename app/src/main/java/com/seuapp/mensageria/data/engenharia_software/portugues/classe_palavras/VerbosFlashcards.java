package com.seuapp.mensageria.data.engenharia_software.portugues.classe_palavras;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class VerbosFlashcards {

    //"012345678901234567890123456789\n" // ate 32 caracteres por linha e no máximo 10 linhas

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =========================
        // IDENTIFICAÇÃO DE TEMPOS E MODOS (VÍDEO 01)
        // =========================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_IDENTIFICACAO",
                "🧭 Macetes Mestres para Identificar Tempos e Modos",
                "📌 As 'Palavrinhas Mágicas':\n" +
                        "• HOJE → Presente do Indicativo\n" +
                        "• ONTEM → Pretérito Perfeito do Indicativo\n" +
                        "• ANTIGAMENTE → Pretérito Imperfeito do Indicativo\n" +
                        "• OUTRORA → Pretérito Mais-que-Perfeito do Indicativo\n" +
                        "• AMANHÃ → Futuro do Presente do Indicativo\n" +
                        "• SE EU FOSSE VOCÊ, EU... → Futuro do Pretérito do Indicativo\n" +
                        "• QUE → Presente do Subjuntivo\n" +
                        "• SE → Pretérito Imperfeito do Subjuntivo\n" +
                        "• QUANDO → Futuro do Subjuntivo"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_IDENTIFICACAO",
                "🧭 Modo Imperativo: Formação e Macetes",
                "📌 IMPERATIVO AFIRMATIVO:\n" +
                        "• Você (3ª pessoa) → Deriva do PRESENTE DO SUBJUNTIVO (QUE).\n" +
                        "   Ex: 'Que você fale.' → 'Fale!'\n" +
                        "• Tu (2ª pessoa) → Deriva do PRESENTE DO INDICATIVO (HOJE), retirando o 'S'.\n" +
                        "   Ex: 'Hoje tu falas.' → 'Fala!'\n" +
                        "• Nós, Vós → Deriva do PRESENTE DO SUBJUNTIVO.\n\n" +
                        "📌 IMPERATIVO NEGATIVO:\n" +
                        "• SEMPRE deriva do PRESENTE DO SUBJUNTIVO (QUE).\n" +
                        "   Ex: 'Que você não fale.' → 'Não fale!'"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_IDENTIFICACAO",
                "🧭 Ciladas e Antídotos na Identificação",
                "⚠️ CILADA #1 (Indicativo vs. Subjuntivo):\n" +
                        "• Teste com HOJE e QUE.\n" +
                        "• 'É possível que acorde': HOJE eu acordo? NÃO. QUE eu acordo? SIM. → Subjuntivo.\n\n" +
                        "⚠️ CILADA #2 (Imperativo vs. Subjuntivo):\n" +
                        "• Contexto! Ordem/Conselho? → Imperativo. Hipótese/Desejo? → Subjuntivo.\n\n" +
                        "⚠️ CILADA #3 (Infinitivo Pessoal vs. Futuro do Subj.):\n" +
                        "• Formas iguais. Use o macete FAZER/FIZER.\n" +
                        "• 'Para estudares' → 'Para fazer' (certo) → Infinitivo.\n" +
                        "• 'Quando estudares' → 'Quando fizer' (certo) → Fut. do Subj."
        ));

        // =========================
        // SEMÂNTICA DOS TEMPOS VERBAIS (VÍDEO 03 e 04)
        // =========================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA",
                "🧭 Valores Semânticos do Presente e do Imperfeito",
                "📌 PRESENTE DO INDICATIVO ('Hoje'):\n" +
                        "• Ação no momento atual: 'Estou cansado'.\n" +
                        "• Valor de passado (presente histórico): 'Em 1500, Cabral chega ao Brasil.'\n" +
                        "• Valor de futuro: 'Eu vou amanhã.'\n" +
                        "💡 Troca pelo tempo correspondente (chegou / irei) → NÃO altera o sentido factual.\n\n" +
                        "📌 PRETÉRITO IMPERFEITO ('Antigamente'):\n" +
                        "• Ação contínua/habitual: 'Brincava de boneca'.\n" +
                        "• Desejo não realizado: 'Eu jantava com você hoje.'\n" +
                        "💡 Neste caso, equivale ao Futuro do Pretérito ('jantaria'). A troca não altera o sentido, apenas o nível de formalidade."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_SEMANTICA",
                "🧭 Valores do Futuro do Pretérito e do Mais-que-Perfeito",
                "📌 FUTURO DO PRETÉRITO ('Se eu fosse... -ria'):\n" +
                        "• Futuro em relação ao passado (correlação): 'Ele disse que faria os deveres.'\n" +
                        "• Incerteza/Dúvida: 'Quem estaria lá?'\n" +
                        "• Polidez/Cortesia: 'Eu gostaria de um café.'\n\n" +
                        "📌 PRETÉRITO MAIS-QUE-PERFEITO ('Outrora -ra'):\n" +
                        "• Anterioridade no passado: 'Ele já estudara quando a namorada ligou.'\n" +
                        "⚠️ NUNCA vem sozinho. Precisa de outro verbo no passado no contexto para fazer sentido."
        ));

        // =========================
        // ESTRUTURA DO VERBO (DESINÊNCIAS) (VÍDEO 05 a 08)
        // =========================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_ESTRUTURA",
                "🧭 Componentes da Estrutura Verbal",
                "📌 ELEMENTOS PRINCIPAIS:\n" +
                        "• RADICAL: Parte invariável com o significado. (Ex: FAL- ar)\n" +
                        "• VOGAL TEMÁTICA (VT): Classifica a conjugação (1ª: -A-, 2ª: -E-, 3ª: -I-). É a vogal do infinitivo.\n" +
                        "• TEMA: Radical + Vogal Temática.\n" +
                        "• DESINÊNCIA MODO-TEMPORAL (DMT): 'Muleta' do tempo/modo. Se repete nas pessoas. (Ex: -VA- no Pret. Imperfeito).\n" +
                        "• DESINÊNCIA NÚMERO-PESSOAL (DNP): Marca a pessoa e o número. (Ex: -S para 'tu', -MOS para 'nós')."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_ESTRUTURA",
                "🧭 Dicas de Análise Estrutural",
                "📌 COMO IDENTIFICAR CADA PARTE:\n" +
                        "1. INFINITIVO → Leve o verbo para o infinitivo para identificar a VT e a conjugação.\n" +
                        "2. TEMPO/MODO → Use as 'palavrinhas mágicas' (HOJE, ONTEM, QUE...).\n" +
                        "3. DMT → Existe? Só se houver uma terminação que se repete em todas as pessoas da conjugação.\n" +
                        "   • Presente do Indicativo → NÃO TEM DMT.\n" +
                        "4. DNP → É o que sobra ou varia. Pode ser ZERO (ex: 3ª pessoa singular)."
        ));

        // =========================
        // FORMAS NORMAIS DO VERBO (VÍDEO 10, 11 e 12)
        // =========================
        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_FORMAS_NORMAIS",
                "🧭 Particípio: Regra de Ouro para Verbos Abundantes",
                "📌 PARTICÍPIO DE VERBOS ABUNDANTES (duas formas):\n" +
                        "• REGRA DE OURO:\n" +
                        "   • Com TER/HAVER → Use a forma REGULAR (-do).\n" +
                        "       Ex: 'Ele tinha ACEITADO a oferta.'\n" +
                        "   • Com SER/ESTAR/FICAR → Use a forma IRREGULAR (-to, -so, etc.).\n" +
                        "       Ex: 'A oferta foi ACEITA.'\n\n" +
                        "⚠️ EXCEÇÕES (LIBEROU GERAL!): GANHAR, GASTAR, PEGAR, PAGAR.\n" +
                        "   • Aceita-se ambas as formas: 'tinha ganhado' / 'tinha ganho'."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_FORMAS_NORMAIS",
                "🧭 A Grande Cilada: Infinitivo Pessoal vs. Futuro do Subjuntivo",
                "📌 PROBLEMA: Para verbos REGULARES, as formas são IDÊNTICAS.\n" +
                        "   • (Para eu) FALAR / (Quando eu) FALAR.\n\n" +
                        "📌 MACETE DE TROCA (FAZER/FIZER):\n" +
                        "   • Substitua o verbo da frase por FAZER ou FIZER.\n" +
                        "   • Se FAZER encaixar → é INFINITIVO.\n" +
                        "   • Se FIZER encaixar → é FUTURO DO SUBJUNTIVO.\n\n" +
                        "   • 'É bom estudares.' → 'É bom FAZER' (certo) → Infinitivo.\n" +
                        "   • 'Quando estudares, avise.' → 'Quando FIZER, avise' (certo) → Fut. do Subj."
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_FORMAS_NORMAIS",
                "🧭 Gerúndio: Bom Uso, Gerundismo e Valores Semânticos",
                "📌 BOM GERÚNDIO → Ação Contínua/Durativa ou Simultânea.\n" +
                        "   • 'Fiquei ESCREVENDO a redação.'\n" +
                        "   • 'Ele fala GESTICULANDO.'\n\n" +
                        "📌 MAU GERÚNDIO (GERUNDISMO) → Ação Instantânea ou Posterior.\n" +
                        "   • 'Vou estar TRANSFERINDO sua ligação.' (Errado! Ação instantânea).\n\n" +
                        "📌 VALORES SEMÂNTICOS:\n" +
                        "   • Tempo ('Chegando, avise-me.')\n" +
                        "   • Causa ('Terminando o trabalho, foi descansar.')\n" +
                        "   • Consequência ('Contagiou a todos, CHEGANDO feliz.')"
        ));

        lista.add(new Flashcard(
                "📘 Classes de Palavras - Verbos",
                "VERBOS_FORMAS_NORMAIS",
                "🧭 Cilada do Verbo 'Vir': Gerúndio ou Particípio?",
                "📌 O PROBLEMA: A forma VINDO pode ser tanto GERÚNDIO quanto PARTICÍPIO.\n\n" +
                        "📌 ANTÍDOTO (Teste com CHEGAR):\n" +
                        "   • Substitua 'vindo' por 'chegando'. Se fizer sentido → é GERÚNDIO.\n" +
                        "       Ex: 'Estou VINDO.' → 'Estou CHEGANDO.' (Gerúndio)\n" +
                        "   • Substitua 'vindo' por 'chegado'. Se fizer sentido → é PARTICÍPIO.\n" +
                        "       Ex: 'Ele tem VINDO aqui.' → 'Ele tem CHEGADO aqui.' (Particípio)\n\n" +
                        "💡 LEMBRE-SE: O particípio de VIR é VINDO, não 'vido'."
        ));


        return lista;
    }
}
