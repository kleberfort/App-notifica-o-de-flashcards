package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ConjuncaoFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // 🎯 VÍDEO 03: CONJUNÇÕES COORDENATIVAS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Coordenativas - Visão Geral",
                "CONJUNCAO_CONJ_COORDENATIVAS_VALORES",
                "🧭 Tipos e Valores Semânticos",
                "📌 A banca cobra o VALOR SEMÂNTICO, não só o nome:\n" +
                        "➕ ADITIVAS: Adição/Soma \n" +
                        "👉(e, nem, não só... mas também/como também (uma exige a outra)).\n" +
                        "➖ ADVERSATIVAS: Contraste/Oposição - PRESENTE + PRESENTE \n" +
                        "👉(mas, porém, todavia, contudo, entretanto, no entanto).\n" +
                        "🤔 Ex.: Estudo bastante, mas não passo no concurso.\n"+
                        "🔄 ALTERNATIVAS: Alternância ou Escolha \n" +
                        "👉(ou... ou, ora... ora já... já, quer... quer (contexto)).\n" +
                        "🔚 CONCLUSIVAS: Conclusão/Consequência - PRESENTE + FUTURO \n" +
                        "👉(logo, portanto, pois deslocado, por conseguinte, por isso).\n" +
                        "🤔 Ex.: Estudou bastante, logo passou no concurso.\n"+
                        "❓ EXPLICATIVAS: Explicação/Justificativa - IMPERATIVO + PRESENTE/FUTURO \n" +
                        "👉(que, porque, pois no início, porquanto).\n"+
                        "🤔 Ex.: Estude bastante, porque a prova exigirá muito conhecimento.\n"

        ));

        lista.add(new Flashcard(
                "📘 Coordenativas - Polissêmicas",
                "CONJUNCAO_CONJ_COORDENATIVAS_POLISSEMICAS",
                "🧭 Os 3 Mosqueteiros (E, OU, POIS)",
                "📌 O contexto é tudo! Identifique pelo sentido:\n" +
                        "🔹 'E': ADITIVO (soma), \n" +
                        "ADVERSATIVO (oposição: 'é rico e infeliz')\n" +
                        "ou CONCLUSIVO (consequência: 'estudou e passou').\n" +
                        "🔹 'OU': EXCLUSÃO (um ou outro) \n" +
                        "ou INCLUSÃO (um e outro - verbo no plural ajuda a identificar).\n" +
                        "EXs.: Ou João ou José casará com Maria (EXCLUSÃO)\n" +
                        " - A bebida ou o fumo prejudicam a saúde. (INCLUSÃO).\n" +
                        "🔹 'POIS': EXPLICATIVO (no início da oração) \n" +
                        "ou CONCLUSIVO (deslocado, entre vírgulas).\n"+
                        "EXs.: Vamos, pois a aula começou. (EXPLICATIVO) \n" +
                        "- Estudou muito, foi, pois, aprovado. (CONCLUSIVO)"
        ));

        lista.add(new Flashcard(
                "📘 Coordenativas - Ciladas",
                "CONJUNCAO_CONJ_COORDENATIVAS_CILADAS",
                "🧭 Ciladas e Antídotos",
                "📌 Armadilhas clássicas da banca:\n" +
                        "⚠️ Achar que 'E' sempre soma e 'OU' sempre exclui.\n" +
                        "✅ 'E' pode ser adversativo ou conclusivo. 'OU' pode ser inclusivo.\n" +
                        "⚠️ Confundir 'pois' explicativo com 'pois' conclusivo.\n" +
                        "✅ Posição: início da oração = EXPLICATIVO; deslocado (entre vírgulas) = CONCLUSIVO.\n" +
                        "⚠️ Confundir 'porquanto' com 'portanto'.\n" +
                        "✅ 'Porquanto' = porque (EXPLICATIVA). 'Portanto' = logo (CONCLUSIVA)."
        ));

        lista.add(new Flashcard(
                "📘 Coordenativas - Reescrita",
                "CONJUNCAO_CONJ_COORDENATIVAS_REESCRITA",
                "🧭 Unindo Orações",
                "📌 Para reescrever, isole as orações e pergunte:\n" +
                        "➕ A segunda SOMA à primeira? → Use conjunção ADITIVA (e).\n" +
                        "➖ A segunda OPÕE à primeira? → Use conjunção ADVERSATIVA (mas).\n" +
                        "🔚 A segunda é CONSEQUÊNCIA da primeira? → Use conjunção CONCLUSIVA (logo).\n" +
                        "❓ A segunda JUSTIFICA a primeira? → Use conjunção EXPLICATIVA (porque)."
        ));

        // ============================================================
        // 🎯 VÍDEO 04: CONJUNÇÕES SUBORDINATIVAS ADVERBIAIS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Subordinativas - Mnemônico",
                "CONJUNCAO_CONJ_SUBORDINATIVAS_MNEMONICO",
                "🧭 '6, C + FTP'",
                "📌 Decore este mnemônico para nunca esquecer:\n" +
                        "🔹 6 que começam com 'C': CONCESSIVAS, CONDICIONAIS, CONFORMATIVAS, COMPARATIVAS, CAUSAIS, CONSECUTIVAS.\n" +
                        "🔹 + 'FTP': FINAIS, TEMPORAIS, PROPORCIONAIS."
        ));

        lista.add(new Flashcard(
                "📘 Subordinativas - Tipos",
                "CONJUNCAO_CONJ_SUBORDINATIVAS_TIPOS",
                "🧭 Valores e Lista Completa",
                "📌 Relação lógica de cada tipo:\n" +
                        "🟣 CONCESSIVAS: Oposição/Exceção \n" +
                        "👉(embora, ainda que, mesmo que, por mais que,  conquanto). Verbo no subjuntivo.\n" +
                        "🟢 CONDICIONAIS: Hipótese \n" +
                        "👉(se, caso, desde que, contanto que, salvo se).\n" +
                        "🟡 CONFORMATIVAS: Conformidade \n" +
                        "👉(conforme, como, segundo).\n" +
                        "🔵 COMPARATIVAS: Comparação \n" +
                        "👉(mais... que/do que, como, tal como, como se).\n" +
                        "🔴 CAUSAIS: Causa/Motivo \n" +
                        "👉(porque, pois, porquanto, visto que, uma vez que, já que, como).\n" +
                        "🟠 CONSECUTIVAS: Consequência \n" +
                        "👉(que precedido de tão/tanto/tal, de modo que, de forma que, de sorte que).\n" +
                        "🟤 FINAIS: Finalidade \n" +
                        "👉(para que, a fim de que).\n" +
                        "⚪ TEMPORAIS: Tempo \n" +
                        "👉(quando, enquanto, assim que, logo que, desde que).\n" +
                        "🟢 PROPORCIONAIS: Proporção \n" +
                        "👉(à medida que, ao passo que, quanto mais...(mais))."
        ));

        lista.add(new Flashcard(
                "📘 Subordinativas - Ciladas",
                "CONJUNCAO_CONJ_SUBORDINATIVAS_CILADAS",
                "🧭 Confusões Clássicas",
                "📌 Fique atento a estas diferenças cruciais:\n" +
                        "🔴 CAUSAL vs EXPLICATIVA: \n" +
                        "Teste se há causa e efeito ('o fato de... fez com que'). Se sim, CAUSAL.\n" +
                        "🟠 'CONQUANTO' vs 'PORQUANTO': \n" +
                        "Conquanto = EMBORA (concessiva). \n" +
                        "Porquanto = PORQUE (causal/explicativa).\n" +
                        "🟢 'À MEDIDA QUE' vs 'NA MEDIDA EM QUE': \n" +
                        "À medida que = PROPORÇÃO. \n" +
                        "Na medida em que = PORQUE (causal).\n" +
                        "🔵 'COMO': \n" +
                        "Pode ser COMPARATIVA, \n" +
                        "CONFORMATIVA (conforme) \n" +
                        "ou CAUSAL (causa)."
        ));

        lista.add(new Flashcard(
                "📘 Subordinativas - Causais vs Consecutivas",
                "CONJUNCAO_CONJ_SUBORDINATIVAS_CAUSAIS_CONSEC",
                "🧭 Como não errar mais",
                "📌 Siga este roteiro para diferenciar:\n" +
                        "1️⃣ Ordene os fatos cronologicamente (o que veio primeiro e o que veio depois).\n" +
                        "2️⃣ A conjunção recebe o nome da ORAÇÃO QUE ELA INTRODUZ.\n" +
                        "3️⃣ Se introduz a CAUSA → CAUSAL.\n" +
                        "4️⃣ Se introduz a CONSEQUÊNCIA → CONSECUTIVA.\n" +
                        "5️⃣ Macete: 'que' consecutivo vem precedido de tão, tanto ou tal."
        ));

        return lista;
    }
}
