package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class EstruturaLogica_2_Flashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== CONVERSÃO DE LINGUAGEM ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_CONVERSAO_LINGUAGEM",
                "🧭 Conversão de Linguagem",
                "📌 Definição:\n" +
                        "📎 Transformar a língua portuguesa (linguagem natural) para a linguagem proposicional (exata).\n" +
                        "📎 Representação: letras para proposições simples e símbolos para conectivos.\n" +
                        "📎 Ex: 'João é meu amigo, consequentemente empresto dinheiro para ele' → a→d."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_ORDEM_PRECEDENCIA",
                "🧭 Ordem de Precedência dos Conectivos",
                "📌 Ordem de execução:\n" +
                        "1. Negação (~): abrangendo o menor enunciado possível.\n" +
                        "2. Conjunção (∧) e Disjunção Inclusiva (∨): na ordem em que aparecerem.\n" +
                        "3. Disjunção Exclusiva (∨).\n" +
                        "4. Condicional (→).\n" +
                        "5. Bicondicional (↔)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_VIRGULAS_PARENTESES",
                "🧭 Uso de Vírgulas para Indicar Parênteses",
                "📌 Regra:\n" +
                        "📎 Vírgulas podem indicar parênteses nas proposições.\n" +
                        "📎 Ex: 'Se Pedro é matemático, então ele passou no vestibular, e hoje ele sabe calcular integrais'.\n" +
                        "📎 Com vírgula: (p → v) ∧ s.\n" +
                        "📎 Sem vírgula: p → (v ∧ s)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_NAO_E_VERDADE",
                "🧭 'Não é verdade que' ou 'É falso que'",
                "📌 Regra:\n" +
                        "📎 Em regra, esses termos, quando utilizados em proposições compostas, negam a proposição composta como um todo.\n" +
                        "📎 Ex: 'É falso que Ana fala alemão ou português, mas não fala inglês' → ~((q∨r)∧~p)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_ANALISE_SIGNIFICADO",
                "🧭 Análise do Significado das Proposições",
                "📌 Conceito:\n" +
                        "📎 O termo proposição se refere ao significado das orações.\n" +
                        "📎 Frases escritas de modo diferente com o mesmo significado são a mesma proposição.\n" +
                        "📎 Ex: 'João bebeu café' = 'O café foi bebido por João' = 'John drank coffee'."
        ));

        // ==================== TABELA-VERDADE ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_TABELA_VERDADE",
                "🧭 Tabela-Verdade",
                "📌 Definição:\n" +
                        "📎 Ferramenta para determinar todos os valores lógicos (V ou F) de uma proposição composta.\n" +
                        "📎 Número de linhas = 2^n, onde n é o número de proposições simples distintas.\n" +
                        "📎 O operador de negação '~' não altera o número de linhas."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_CONSTRUCAO_TABELA",
                "🧭 Construção de uma Tabela-Verdade",
                "📌 Passos:\n" +
                        "1. Determinar o número de linhas da tabela-verdade.\n" +
                        "2. Desenhar o esquema da tabela-verdade.\n" +
                        "3. Atribuir V ou F às proposições simples de maneira alternada.\n" +
                        "4. Obter o valor das demais proposições."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_NUMERO_LINHAS",
                "🧭 Número de Linhas da Tabela-Verdade",
                "📌 Fórmula:\n" +
                        "📎 Se uma proposição for composta por n proposições simples distintas, o número de linhas será 2^n.\n" +
                        "📎 Ex: 2 proposições → 2^2 = 4 linhas.\n" +
                        "📎 Ex: 3 proposições → 2^3 = 8 linhas.\n" +
                        "📎 Ex: 4 proposições → 2^4 = 16 linhas."
        ));

        // ==================== TAUTOLOGIA, CONTRADIÇÃO E CONTINGÊNCIA ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_TAUTOLOGIA",
                "🧭 Tautologia",
                "📌 Definição:\n" +
                        "📎 Proposição cujo valor lógico da tabela-verdade é sempre verdadeiro.\n" +
                        "📎 Ex: p ∨ ~p é uma tautologia.\n" +
                        "📎 Representação: T ou t.\n" +
                        "📎 Método da tabela-verdade: última coluna apenas com V."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_CONTRADICAO",
                "🧭 Contradição",
                "📌 Definição:\n" +
                        "📎 Proposição cujo valor lógico da tabela-verdade é sempre falso.\n" +
                        "📎 Ex: p ∧ ~p é uma contradição.\n" +
                        "📎 Representação: ⊥ ou c.\n" +
                        "📎 Método da tabela-verdade: última coluna apenas com F."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_CONTINGENCIA",
                "🧭 Contingência",
                "📌 Definição:\n" +
                        "📎 Proposição cujo valor lógico pode ser tanto V quanto F.\n" +
                        "📎 Depende dos valores atribuídos às proposições simples.\n" +
                        "📎 Método da tabela-verdade: última coluna com V e F."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_METODO_ABSURDO",
                "🧭 Método da Prova por Absurdo",
                "📌 Procedimento:\n" +
                        "📎 Para suspeita de tautologia: tentar aplicar F à proposição.\n" +
                        "📎 Se for possível que seja F, não é tautologia.\n" +
                        "📎 Se chegar a um absurdo, é tautologia.\n" +
                        "📎 Para suspeita de contradição: tentar aplicar V à proposição.\n" +
                        "📎 Se for possível que seja V, não é contradição.\n" +
                        "📎 Se chegar a um absurdo, é contradição."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_IMPLICACAO",
                "🧭 Implicação",
                "📌 Definição:\n" +
                        "📎 Dizemos que p implica q quando a condicional p→q é uma tautologia.\n" +
                        "📎 Representação: p ⇒ q.\n" +
                        "📎 Ex: (p ∧ q) → p é uma tautologia, logo (p ∧ q) ⇒ p."
        ));

        // ==================== QUESTÕES COMENTADAS - FGV ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_FGV_TABELA_VERDADE",
                "🧭 FGV - Tabela-Verdade",
                "📌 Como resolver:\n" +
                        "📎 Construir a tabela-verdade da proposição composta.\n" +
                        "📎 Identificar as linhas em que a proposição é verdadeira.\n" +
                        "📎 Ex: (avb)→(c∧~b) é verdadeira nas linhas 3, 7 e 8.\n" +
                        "📎 Nesses casos, b é falso."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_FGV_DISJUNCOES",
                "🧭 FGV - Disjunções Simultaneamente Verdadeiras",
                "📌 Como resolver:\n" +
                        "📎 Construir tabela-verdade com as disjunções.\n" +
                        "📎 Identificar linhas em que todas são verdadeiras.\n" +
                        "📎 Ex: p∨q, q∨~r e r∨~p simultaneamente V → q é necessariamente V."
        ));

        // ==================== QUESTÕES COMENTADAS - MULTIBANCAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_MULTI_CONVERSAO",
                "🧭 Multibancas - Conversão de Linguagem",
                "📌 Como resolver:\n" +
                        "📎 Identificar os conectivos e suas representações.\n" +
                        "📎 'Como p, q' = condicional p→q.\n" +
                        "📎 'Uma vez que p, q' = condicional p→q.\n" +
                        "📎 'Mas' = conjunção ∧.\n" +
                        "📎 'Se e somente se' = bicondicional ↔."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_MULTI_TAUTOLOGIA",
                "🧭 Multibancas - Tautologia",
                "📌 Como resolver:\n" +
                        "📎 p ∨ ~p é tautologia.\n" +
                        "📎 p ∧ ~p é contradição.\n" +
                        "📎 (p ∧ q) → p é tautologia.\n" +
                        "📎 (p ∨ q) → p é contingência.\n" +
                        "📎 p → (p ∨ q) é tautologia."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_2_MULTI_CONTRADICAO",
                "🧭 Multibancas - Contradição",
                "📌 Como resolver:\n" +
                        "📎 p ∧ ~p é contradição.\n" +
                        "📎 'Não é caro, mas custa muito caro' = ~p ∧ p (contradição).\n" +
                        "📎 p ↔ ~p é contradição."
        ));

        return lista;
    }
}
