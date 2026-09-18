package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class EquivalenciasNegacaoLogicasFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== EQUIVALÊNCIAS E NEGAÇÕES LÓGICAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_EQUIVALENCIA_LOGICA",
                "🧭 O que é uma Equivalência Lógica?",
                "📌 Definição:\n" +
                        "📎 Duas proposições são equivalentes quando todos os valores lógicos (V ou F) assumidos por elas são iguais para todas as combinações de valores lógicos atribuídos às proposições simples que as compõem.\n" +
                        "📎 Representação: A ⇔ B ou A ≡ B.\n" +
                        "⚠️ O símbolo de equivalência (⇔) é diferente do conectivo bicondicional (↔)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_CONTRAPOSITIVA",
                "🧭 Equivalência Contrapositiva",
                "📌 Regra:\n" +
                        "📎 p → q ≡ ~q → ~p\n" +
                        "📎 Invertem-se as posições do antecedente e do consequente; e\n" +
                        "📎 Negam-se ambos os termos da condicional.\n" +
                        "⚠️ p → q NÃO é equivalente a ~p → ~q."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_COND_DISJUNCAO",
                "🧭 Transformação da Condicional em Disjunção Inclusiva",
                "📌 Regra:\n" +
                        "📎 p → q ≡ ~p ∨ q\n" +
                        "📎 Nega-se o primeiro termo;\n" +
                        "📎 Troca-se a condicional (→) pela disjunção inclusiva (∨); e\n" +
                        "📎 Mantém-se o segundo termo.\n" +
                        "📎 Ex: 'Se hoje choveu, então João fez a barba' ≡ 'Hoje não choveu ou João fez a barba'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_DISJUNCAO_COND",
                "🧭 Transformação da Disjunção Inclusiva em Condicional",
                "📌 Regra:\n" +
                        "📎 p ∨ q ≡ ~p → q\n" +
                        "📎 Nega-se o primeiro termo;\n" +
                        "📎 Troca-se a disjunção inclusiva (∨) pela condicional (→); e\n" +
                        "📎 Mantém-se o segundo termo.\n" +
                        "📎 Ex: 'Pedro estuda ou Maria trabalha' ≡ 'Se Pedro não estuda, então Maria trabalha'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_DUPLA_NEGACAO",
                "🧭 Dupla Negação",
                "📌 Regra:\n" +
                        "📎 ~(~p) ≡ p\n" +
                        "📎 A negação da negação de p é equivalente a p.\n" +
                        "📎 Ex: 'Não é verdade que Joãozinho não comeu o chocolate' ≡ 'Joãozinho comeu o chocolate'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_DE_MORGAN_CONJUNCAO",
                "🧭 Negação da Conjunção (Lei de De Morgan)",
                "📌 Regra:\n" +
                        "📎 ~(p ∧ q) ≡ ~p ∨ ~q\n" +
                        "📎 Negam-se ambas as parcelas da conjunção; e\n" +
                        "📎 Troca-se a conjunção (∧) pela disjunção inclusiva (∨).\n" +
                        "📎 Ex: 'Comi lasanha e bebi refrigerante' → 'Não comi lasanha ou não bebi refrigerante'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_DE_MORGAN_DISJUNCAO",
                "🧭 Negação da Disjunção Inclusiva (Lei de De Morgan)",
                "📌 Regra:\n" +
                        "📎 ~(p ∨ q) ≡ ~p ∧ ~q\n" +
                        "📎 Negam-se ambas as parcelas da disjunção inclusiva; e\n" +
                        "📎 Troca-se a disjunção inclusiva (∨) pela conjunção (∧).\n" +
                        "📎 Ex: 'Caminho ou não saio do lugar' → 'Não caminho e saio do lugar'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_NEGACAO_CONDICIONAL",
                "🧭 Negação da Condicional",
                "📌 Regra:\n" +
                        "📎 ~(p → q) ≡ p ∧ ~q\n" +
                        "📎 Mantém-se o primeiro termo;\n" +
                        "📎 Troca-se a condicional (→) pela conjunção (∧); e\n" +
                        "📎 Nega-se o segundo termo.\n" +
                        "📎 Ex: 'Se eu comi lasanha, então eu bebi refrigerante' → 'Eu comi lasanha e eu não bebi refrigerante'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_NEGACAO_CONJ_COND",
                "🧭 Negação da Conjunção para Forma Condicional",
                "📌 Regras:\n" +
                        "📎 ~(p ∧ q) ≡ p → ~q\n" +
                        "📎 ~(p ∧ q) ≡ q → ~p\n" +
                        "📎 Ex: 'Corro e não fico cansado' → 'Se corro, então fico cansado'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_CONJUNCAO_CONDICIONAIS",
                "🧭 Conjunção de Condicionais",
                "📌 Regras:\n" +
                        "📎 (p → r) ∧ (q → r) ≡ (p ∨ q) → r\n" +
                        "📎 (p → q) ∧ (p → r) ≡ p → (q ∧ r)\n" +
                        "📎 Quando o termo comum é o consequente, a equivalência apresenta uma disjunção inclusiva no antecedente.\n" +
                        "📎 Quando o termo comum é o antecedente, a equivalência apresenta uma conjunção no consequente."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_EQUIV_DISJ_EXCLUSIVA",
                "🧭 Equivalências da Disjunção Exclusiva",
                "📌 Regras:\n" +
                        "📎 p ∨ q ≡ (~p) ∨ (~q)\n" +
                        "📎 p ∨ q ≡ (~p) ↔ q\n" +
                        "📎 p ∨ q ≡ p ↔ (~q)\n" +
                        "📎 Ex: 'Ou jogo bola, ou jogo sinuca' ≡ 'Ou não jogo bola, ou não jogo sinuca'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_NEGACAO_DISJ_EXCLUSIVA",
                "🧭 Negação da Disjunção Exclusiva",
                "📌 Regras:\n" +
                        "📎 ~(p ∨ q) ≡ p ↔ q\n" +
                        "📎 ~(p ∨ q) ≡ (~p) ∨ q\n" +
                        "📎 ~(p ∨ q) ≡ p ∨ (~q)\n" +
                        "📎 Ex: 'Ou Renato é gerente, ou Rodrigo é dono' → 'Renato é gerente se e somente se Rodrigo não é dono'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_EQUIV_BICONDICIONAL",
                "🧭 Equivalências da Bicondicional",
                "📌 Regras:\n" +
                        "📎 p ↔ q ≡ (p → q) ∧ (q → p)\n" +
                        "📎 p ↔ q ≡ (~p) ↔ (~q)\n" +
                        "📎 p ↔ q ≡ (~p) ∨ q\n" +
                        "📎 p ↔ q ≡ p ∨ (~q)\n" +
                        "📎 Mnemônico: uma forma equivalente à bicondicional é ir e voltar com a condicional."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_NEGACAO_BICONDICIONAL",
                "🧭 Negação da Bicondicional",
                "📌 Regras:\n" +
                        "📎 ~(p ↔ q) ≡ p ∨ q\n" +
                        "📎 ~(p ↔ q) ≡ (~p) ↔ q\n" +
                        "📎 ~(p ↔ q) ≡ p ↔ (~q)\n" +
                        "📎 ~(p ↔ q) ≡ (p ∧ ~q) ∨ (q ∧ ~p)\n" +
                        "📎 Ex: 'A Fênix é imortal se e somente se renasce das cinzas' → 'Ou a Fênix é imortal ou renasce das cinzas'."
        ));

        // ==================== ÁLGEBRA DE PROPOSIÇÕES ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_COMUTATIVA",
                "🧭 Propriedade Comutativa",
                "📌 Regra:\n" +
                        "📎 Todos os conectivos, exceto o condicional (→), gozam da propriedade comutativa.\n" +
                        "📎 p ∧ q ≡ q ∧ p\n" +
                        "📎 p ∨ q ≡ q ∨ p\n" +
                        "📎 p ∨ q ≡ q ∨ p\n" +
                        "📎 p ↔ q ≡ q ↔ p\n" +
                        "⚠️ p → q NÃO é equivalente a q → p."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_ASSOCIATIVA",
                "🧭 Propriedade Associativa",
                "📌 Regra:\n" +
                        "📎 (p ∧ q) ∧ r ≡ p ∧ (q ∧ r)\n" +
                        "📎 (p ∨ q) ∨ r ≡ p ∨ (q ∨ r)\n" +
                        "📎 A ordem em que é executada a conjunção ou a disjunção não importa.\n" +
                        "⚠️ A propriedade associativa não mistura em uma mesma expressão o conectivo 'e' e o conectivo 'ou'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_DISTRIBUTIVA",
                "🧭 Propriedade Distributiva",
                "📌 Regras:\n" +
                        "📎 p ∧ (q ∨ r) ≡ (p ∧ q) ∨ (p ∧ r)\n" +
                        "📎 p ∨ (q ∧ r) ≡ (p ∨ q) ∧ (p ∨ r)\n" +
                        "📎 É possível colocar o termo em evidência:\n" +
                        "📎 (p ∧ q) ∨ (p ∧ r) ≡ p ∧ (q ∨ r)\n" +
                        "📎 (p ∨ q) ∧ (p ∨ r) ≡ p ∨ (q ∧ r)"
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_IDENTIDADE",
                "🧭 Propriedade da Identidade",
                "📌 Regras:\n" +
                        "📎 p ∧ t ≡ p\n" +
                        "📎 p ∧ c ≡ c\n" +
                        "📎 p ∨ t ≡ t\n" +
                        "📎 p ∨ c ≡ p\n" +
                        "📎 Onde t é uma tautologia e c é uma contradição."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_ABSORCAO",
                "🧭 Propriedade da Absorção",
                "📌 Regras:\n" +
                        "📎 p ∨ (p ∧ q) ≡ p\n" +
                        "📎 p ∧ (p ∨ q) ≡ p\n" +
                        "📎 Ex: p ∧ (p ∨ q) é equivalente a p. Logo, a negação é ~p."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_PROP_IDEMPOTENCIA",
                "🧭 Propriedade da Idempotência",
                "📌 Regras:\n" +
                        "📎 p ∧ p ≡ p\n" +
                        "📎 p ∨ p ≡ p\n" +
                        "📎 Ex: ~Q ∧ ~Q é equivalente a ~Q."
        ));

        // ==================== ÁLGEBRA X TAUTOLOGIA, CONTRADIÇÃO E CONTINGÊNCIA ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_ALGEBRA_TAUTOLOGIA",
                "🧭 Álgebra de Proposições x Tautologia",
                "📌 Como resolver:\n" +
                        "📎 Desenvolver a proposição composta original até se chegar:\n" +
                        "📎 Em uma tautologia t; ou\n" +
                        "📎 Em uma contradição c; ou\n" +
                        "📎 Em uma contingência (proposição simples, conjunção, etc.).\n" +
                        "📎 Ex: ~P → (P → Q) é uma tautologia."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_ALGEBRA_CONTRADICAO",
                "🧭 Álgebra de Proposições x Contradição",
                "📌 Como resolver:\n" +
                        "📎 Desenvolver a proposição composta original até se chegar em uma contradição c.\n" +
                        "📎 Ex: (A ∧ B) ↔ (~A ∨ ~B) é uma contradição."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_BICOND_TAUT_CONTRAD",
                "🧭 Bicondicional em Problemas de Tautologia e Contradição",
                "📌 Regras:\n" +
                        "📎 Se X e Y forem proposições equivalentes, a bicondicional X ↔ Y será uma tautologia.\n" +
                        "📎 Se X e Y forem proposições em que uma é a negação da outra, a bicondicional X ↔ Y será uma contradição.\n" +
                        "📎 Ex: (P → Q) ↔ (~P ∨ Q) é uma tautologia, pois os termos são equivalentes."
        ));

        // ==================== QUESTÕES COMENTADAS - FGV ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_FGV_EQUIVALENCIA",
                "🧭 FGV - Equivalência Lógica",
                "📌 Como resolver:\n" +
                        "📎 Identificar se a questão pede equivalência ou negação.\n" +
                        "📎 Utilizar a contrapositiva (~q → ~p) ou a transformação em disjunção (~p ∨ q).\n" +
                        "📎 Ex: 'Se tenho namorada então não fico sozinho' ≡ 'Se fico sozinho então não tenho namorada'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_FGV_NEGACAO",
                "🧭 FGV - Negação Lógica",
                "📌 Como resolver:\n" +
                        "📎 Identificar o conectivo principal e aplicar a negação correspondente.\n" +
                        "📎 Negação da condicional: p ∧ ~q.\n" +
                        "📎 Negação da conjunção: ~p ∨ ~q.\n" +
                        "📎 Negação da disjunção: ~p ∧ ~q.\n" +
                        "📎 Ex: 'Se estamos em fevereiro, então eu pago o IPVA' → 'Estamos em fevereiro e eu não pago o IPVA'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EQUIVALENCIA_NEGACAO_FGV_ALGEBRA",
                "🧭 FGV - Álgebra de Proposições",
                "📌 Como resolver:\n" +
                        "📎 Utilizar as propriedades comutativa, associativa e distributiva.\n" +
                        "📎 Colocar termos em evidência.\n" +
                        "📎 Ex: (p ∨ q) ∧ (p ∨ r) ≡ p ∨ (q ∧ r)."
        ));

        return lista;
    }
}