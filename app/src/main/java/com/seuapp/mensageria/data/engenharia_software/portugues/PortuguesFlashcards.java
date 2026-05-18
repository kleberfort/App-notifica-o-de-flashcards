package com.seuapp.mensageria.data.engenharia_software.portugues;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class PortuguesFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =========================
        // CONJUNÇÕES ADITIVAS
        // =========================
        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                           "PORTUGUÊS - CONJ COOR. Aditivas",
                                "📌Soma de ações\n" +
                                "🟢 e, nem, não só... mas/como também.\n" +
                                "💡 São correlativas: uma exige a outra.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda e trabalha.\"\n" +
                                " \"João nem estuda nem trabalha.\" \n" +
                                "💡 Adição de negações."
                                //"012345678901234567890123456789\n" //ate 32 caracteres por linha e no máximo 10 linhas


                )
        );


        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ COOR. Adversativas",
                        "📌Contraste/Oposição\n" +
                                "🟢 mas, porém, todavia, contudo, entretanto, no entanto.\n" +
                                "💡 Contraste e oposição são sinônimos.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda, mas trabalha muito.\"\n" +
                                "💡 Ideia de oposição."

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ COOR. Alternativas",
                        "📌Alternância/Escolha\n" +
                                "🟢 ou... ou, ora... ora,já... já, quer... quer. \n" +
                                "📖 Exemplo:\n" +
                                "\"João ou estuda ou trabalha.\"\n" +
                                "\"João ora estuda, ora trabalha.\"\n" +
                                "💡 O contexto define o sentido.\n" +
                                "💡 Ideia de exclusão ou Alternância."
                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ COOR. Conclusivas",
                        "📌Conclusão/Consequência\n" +
                                "🟢 logo, portanto, por isso, por conseguinte, pois (deslocado).\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda, portanto passa na prova.\"\n" +
                                "\"João estuda muito, pois vai passar (pois deslocado).\""
                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ COOR. Explicativas",
                        "📌Explicação/Justificativa\n" +
                                "🟢 que, porque, pois (no início), porquanto.\n" +
                                "⚠️ (porquanto = porque)  (portanto = conclusão)\n" +
                                "📖 Exemplo:\n" +
                                "\"João ficou feliz, que passou na prova (uso explicativo clássico em provas).\n" +
                                "💡 Ideia de justificativa."
                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. CONCESSIVAS",
                        "📌Concessão(ideia contrária, \"apesar de\")\n" +
                                "🟢 embora, ainda que, mesmo que, conquanto, por mais que..\n" +
                                "⚠️ Verbo no subjuntivo.\n" +
                                "⚠️ \"Conquanto\" = embora.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda, embora esteja cansado. \"\n" +
                                "\"João estuda, por mais que esteja cansado.\"\n" +
                                "💡 Ideia de Concessiva."
                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. CONDICIONAIS",
                        "📌Condição, Hipótese (algo que pode ou não acontecer).\n" +
                                "🟢 se, caso, desde que, contanto que, salvo se.\n"+
                                "📖 Exemplo:\n" +
                                "\"João passa na prova, caso estude. \"\n" +
                                "\"João passa na prova, contanto que estude.\"\n"+
                                "💡 se acontecer X, acontece Y."

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. CONFORMATIVAS",
                        "📌Conformidade - de acordo com algo \n" +
                                "🟢 conforme, como (=conforme), segundo.\n" +
                                "⚠️ \"Como\" no sentido de \"conforme\".\n"+
                                "📖 Exemplo:\n" +
                                "\"João faz a prova, conforme o professor ensinou.\"\n" +
                                "\"João faz a prova, segundo o professor ensinou.\"\n"+
                                "💡 De acordo com algo."

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. COMPARATIVAS",
                        "📌comparação entre ações\n" +
                                "🟢 que, do que, como, tal como, como se. \n" +
                                "⚠️ Aparece em estruturas de grau: \"mais... do que\" ,\"menos... que.\"\n " +
                                "📖 Exemplo:\n" +
                                "\"João estuda mais do que trabalha.\"\n" +
                                "\"João estuda tal como trabalha.\""

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. CAUSAIS",
                        "📌Causa (razão, motivo).\n" +
                                "🟢 porque, pois, porquanto, visto que,\n " +
                                " uma vez que, já que, como.\n" +
                                "📖 Exemplo:\n" +
                                "\"João passou na prova porque estudou.\"\n"+
                                "\"João passou na prova, uma vez que estudou.\"\n"+
                                "💡 Relação lógica: \"O fato de... fez com que...\n" +
                                "A causa acontece primeiro."


                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. CONSECUTIVAS",
                        "📌Consequência (efeito, resultado).\n" +
                                "🟢 que (precedido de tão/tanto/tal), de modo que," +
                                "de forma que, de sorte que.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estudou tanto que passou na prova.\"\n"+
                                "\"João estudou de forma que passou na prova.\"\n"+
                                "⚠️Relação lógica: \"O fato de... fez com que...\". " +
                                "A consequência acontece depois."

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. FINAIS",
                        "📌Finalidade, Objetivo.\n" +
                                "🟢 para que, a fim de que.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda para que passe na prova.\"\n"+
                                "\"João estuda a fim de que passe na prova.\"\n"+
                                "⚠️ Equivalem a \"com a finalidade de\"."

                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. TEMPORAIS",
                        "📌Tempo - quando acontece\n" +
                                "🟢 quando, enquanto, assim que, logo que, desde que.\n" +
                                "📖 Exemplo:\n" +
                                "\"João estuda quando tem tempo.\"\n"+
                                "\"João estuda assim que chega em casa.\"\n"+
                                "⚠️ \"Desde que\" no sentido temporal, não condicional."


                )
        );

        lista.add(
                new Flashcard(
                        "📘 Português",
                        "CLASSE_CONJUCAO",
                        "PORTUGUÊS - CONJ. SUB. PROPORCIONAIS",
                        "📌Proporção crescimento simultâneo.\n" +
                                "🟢 à medida que, ao passo que, quanto mais... (mais).\n" +
                                "📖 Exemplo:\n" +
                                "\"À medida que João estuda, ele melhora.\"\n"+
                                "\"Quanto mais João estuda, mais aprende.\"\n"+
                                "⚠️ Cuidado: \"À medida que\" (proporcional) ≠ \"Na medida em que\"" +
                                "(causal/explicativa = porque)."

                )
        );

        return lista;
    }
}
