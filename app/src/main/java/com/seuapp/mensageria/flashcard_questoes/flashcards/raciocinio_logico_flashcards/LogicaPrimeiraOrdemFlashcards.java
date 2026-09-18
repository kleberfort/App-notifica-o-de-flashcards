package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class LogicaPrimeiraOrdemFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== INTRODUÇÃO E CONCEITOS BÁSICOS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_INTRODUCAO",
                "🧭 Lógica de Primeira Ordem (LPO)",
                "📌 Definição:\n" +
                        "📎 Extensão da Lógica Proposicional.\n" +
                        "📎 Supera limitações da Lógica Proposicional ao permitir quantificadores e predicados.\n" +
                        "📎 Tudo que é válido na Lógica Proposicional continua válido na LPO.\n" +
                        "📎 Ex: 'Todo aluno do Estratégia é aprovado'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_SENTENCA_ABERTA",
                "🧭 Sentença Aberta na LPO",
                "📌 Definição:\n" +
                        "📎 Expressão que possui um termo variável.\n" +
                        "📎 Não há como atribuir-lhe valor lógico (V ou F).\n" +
                        "📎 NÃO É PROPOSIÇÃO.\n" +
                        "📎 Ex: 'x é ímpar'.\n" +
                        "📎 O valor lógico depende do valor da variável 'x'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_FUNCAO_PREDICADO",
                "🧭 Função-Predicado",
                "📌 Definição:\n" +
                        "📎 Sentença que depende do valor de uma variável para que seja possível atribuí-la determinado valor lógico.\n" +
                        "📎 Ex: 'x é ímpar'.\n" +
                        "📎 Representação: Impar(x) = I(x) = Ix.\n" +
                        "📎 Variável: x (o que pode assumir valores).\n" +
                        "📎 Predicado: 'é ímpar' (o que é dito sobre a variável)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_UNIVERSO_DISCURSO",
                "🧭 Universo de Discurso",
                "📌 Definição:\n" +
                        "📎 Conjunto formado pelos valores que a variável de uma função-predicado pode assumir.\n" +
                        "📎 Em muitas situações, não é explicitamente detalhado, ficando a cargo do leitor sua identificação.\n" +
                        "📎 Ex: 'x é um país emergente' → Universo: todos os países.\n" +
                        "📎 Ex: 'x passou no concurso dos sonhos' → Universo: todas as pessoas que estudam para concursos."
        ));

        // ==================== QUANTIFICADORES ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_QUANTIFICADOR_UNIVERSAL",
                "🧭 Quantificador Universal (∀)",
                "📌 Definição:\n" +
                        "📎 Símbolo: ∀ (para todo, para qualquer, qualquer que seja).\n" +
                        "📎 Transforma sentença aberta em proposição quantificada.\n" +
                        "📎 Ex: '∀x, x + 10 = 50' (Falso).\n" +
                        "📎 Ex: 'Todo homem é careca.'\n" +
                        "📎 Proposição Universal Afirmativa."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_QUANTIFICADOR_EXISTENCIAL",
                "🧭 Quantificador Existencial (∃)",
                "📌 Definição:\n" +
                        "📎 Símbolo: ∃ (existe, algum, pelo menos um).\n" +
                        "📎 Transforma sentença aberta em proposição quantificada.\n" +
                        "📎 Ex: '∃x : x + 10 = 50' (Verdadeiro, pois x = 40).\n" +
                        "📎 Ex: 'Algum homem é careca.'\n" +
                        "📎 Proposição Particular Afirmativa."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_QUANTIFICADOR_UNICIDADE",
                "🧭 Quantificador de Unicidade (∃!)",
                "📌 Definição:\n" +
                        "📎 Símbolo: ∃! (existe um único).\n" +
                        "📎 Transforma sentença aberta em proposição quantificada.\n" +
                        "📎 Ex: '∃!x : x - 2 = 5' (Verdadeiro, pois x = 7 é o único valor).\n" +
                        "📎 Indica que existe exatamente um elemento que satisfaz a condição."
        ));

        // ==================== PROPOSIÇÕES CATEGÓRICAS NA LPO ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_PROPS_CATEGORICAS",
                "🧭 Proposições Categóricas na LPO",
                "📌 Representação Simbólica:\n" +
                        "✅ TODO A é B: ∀x(A(x) → B(x))\n" +
                        "✅ ALGUM A é B: ∃x(A(x) ∧ B(x))\n" +
                        "✅ NENHUM A é B: ¬∃x(A(x) ∧ B(x))\n" +
                        "✅ ALGUM A não é B: ∃x(A(x) ∧ ¬B(x))\n" +
                        "📎 Essas representações são fundamentais para a prova."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_TODO_A_E_B",
                "🧭 Representação: Todo A é B",
                "📌 Representação:\n" +
                        "📎 ∀x(A(x) → B(x))\n" +
                        "📎 Leitura: Para todo x, se x é A, então x é B.\n" +
                        "📎 Ex: 'Todo gerente de projeto é programador' → ∀x(G(x) → P(x)).\n" +
                        "📎 Ex: 'Todo aluno do Estratégia é aprovado' → ∀x(E(x) → A(x))."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_ALGUM_A_E_B",
                "🧭 Representação: Algum A é B",
                "📌 Representação:\n" +
                        "📎 ∃x(A(x) ∧ B(x))\n" +
                        "📎 Leitura: Existe x tal que x é A e x é B.\n" +
                        "📎 Ex: 'Algum auditor fiscal é professor' → ∃x(A(x) ∧ P(x)).\n" +
                        "📎 Ex: 'Algum homem é careca' → ∃x(H(x) ∧ C(x))."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_NENHUM_A_E_B",
                "🧭 Representação: Nenhum A é B",
                "📌 Representação:\n" +
                        "📎 ¬∃x(A(x) ∧ B(x))\n" +
                        "📎 Leitura: Não existe x tal que x é A e x é B.\n" +
                        "📎 Ex: 'Nenhum estudante é preguiçoso' → ¬∃x(E(x) ∧ P(x)).\n" +
                        "📎 Equivalente: ∀x(A(x) → ¬B(x))."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_ALGUM_A_NAO_E_B",
                "🧭 Representação: Algum A não é B",
                "📌 Representação:\n" +
                        "📎 ∃x(A(x) ∧ ¬B(x))\n" +
                        "📎 Leitura: Existe x tal que x é A e x não é B.\n" +
                        "📎 Ex: 'Algum carneiro não é dócil' → ∃x(C(x) ∧ ¬D(x)).\n" +
                        "📎 Ex: 'Nem todo carneiro é dócil' → ∃x(C(x) ∧ ¬D(x))."
        ));

        // ==================== RELAÇÕES E ARIDADE ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_ARIDADE",
                "🧭 Relações e Aridade",
                "📌 Definição:\n" +
                        "📎 Predicados unários: possuem uma única variável (aridade 1).\n" +
                        "📎 Ex: I(x): x é ímpar.\n" +
                        "📎 Predicados binários: possuem duas variáveis (aridade 2).\n" +
                        "📎 Ex: C(x,y): x é casado com y.\n" +
                        "📎 Com duas variáveis, teremos dois quantificadores no mesmo predicado."
        ));

        // ==================== EQUIVALÊNCIAS LÓGICAS NA LPO ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_EQUIVALENCIAS",
                "🧭 Equivalências Lógicas na LPO",
                "📌 Leis de De Morgan:\n" +
                        "📎 ¬(P(x) ∧ Q(x)) ≡ ¬P(x) ∨ ¬Q(x)\n" +
                        "📎 ¬(P(x) ∨ Q(x)) ≡ ¬P(x) ∧ ¬Q(x)\n" +
                        "📎 Ex: Negar ∀x(P(x) → Q(x)) → ∃x(P(x) ∧ ¬Q(x)).\n" +
                        "📎 Ex: Negar ∃x(P(x) → Q(x)) → ∀x(P(x) ∧ ¬Q(x))."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_NEGACAO_QUANTIFICADORES",
                "🧭 Negação de Quantificadores",
                "📌 Regras:\n" +
                        "📎 Negar ∀x(P(x)) → ∃x(¬P(x))\n" +
                        "📎 Negar ∃x(P(x)) → ∀x(¬P(x))\n" +
                        "📎 Negar ∀x(P(x) → Q(x)) → ∃x(P(x) ∧ ¬Q(x))\n" +
                        "📎 Negar ∃x(P(x) ∧ Q(x)) → ∀x(P(x) → ¬Q(x))\n" +
                        "📎 Sempre trocar o quantificador e negar a proposição interna."
        ));

        // ==================== QUESTÕES COMENTADAS - MULTIBANCAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_QUESTOES",
                "🧭 Questões - Lógica de Primeira Ordem",
                "📌 Como resolver:\n" +
                        "📎 Identificar os predicados fornecidos.\n" +
                        "📎 Identificar o quantificador (∀, ∃, ∃!).\n" +
                        "📎 Traduzir a frase para a linguagem simbólica.\n" +
                        "📎 Ex: 'Todo aluno do curso de Informática estuda algum tópico de Matemática Discreta' → ∀x((A(x) ∧ I(x)) → ∃y(T(y) ∧ E(x,y)))."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_1A_ORDEM_FGV_QUESTOES",
                "🧭 FGV - Lógica de Primeira Ordem",
                "📌 Como resolver:\n" +
                        "📎 Identificar o quantificador e o conectivo principal.\n" +
                        "📎 'Qualquer que seja' → ∀x.\n" +
                        "📎 'Se... então' → condicional.\n" +
                        "📎 Ex: 'Qualquer que seja o aluno, se ele sabe lógica ou filosofia, então será aprovado' → ∀x: (p(x) ∨ q(x) → r(x))."
        ));

        return lista;
    }
}
