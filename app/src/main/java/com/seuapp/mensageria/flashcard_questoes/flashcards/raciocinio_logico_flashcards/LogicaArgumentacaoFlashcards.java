package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class LogicaArgumentacaoFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== CONECTIVOS LÓGICOS: QUESTÕES CLÁSSICAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_CONECTIVOS_QUESTOES_CLASSICAS",
                "🧭 Conectivos Lógicos: Questões Clássicas",
                "📌 Definição:\n" +
                        "📎 Questões que apresentam um conjunto de afirmações no enunciado e pedem uma consequência verdadeira.\n" +
                        "📎 As afirmações devem ser consideradas verdadeiras, a não ser que a questão indique que alguma é falsa.\n" +
                        "📎 Resolução em 4 etapas:\n" +
                        "1. Identificar afirmações em 'formatos fáceis'.\n" +
                        "2. Desconsiderar o contexto (traduzir para linguagem proposicional).\n" +
                        "3. Obter valores lógicos das proposições simples.\n" +
                        "4. Verificar a resposta que apresenta uma proposição verdadeira."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_FORMATOS_FACEIS",
                "🧭 Formatos Fáceis",
                "📌 São afirmações que fornecem de imediato o valor lógico de uma ou mais proposições simples:\n" +
                        "✅ Proposição simples (verdadeira ou falsa).\n" +
                        "✅ Conjunção (e; ∧) verdadeira.\n" +
                        "✅ Disjunção inclusiva (ou; ∨) falsa.\n" +
                        "✅ Condicional (se...então; →) falsa.\n" +
                        "📎 Nesses casos, temos 'de graça' o valor lógico de uma ou mais proposições simples."
        ));

        // ==================== LÓGICA DE ARGUMENTAÇÃO: ARGUMENTOS DEDUTIVOS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_DEFINICAO_ARGUMENTO",
                "🧭 Definição de Argumento",
                "📌 Definição:\n" +
                        "📎 Relação que se dá entre um conjunto de premissas que dão suporte à defesa de uma conclusão.\n" +
                        "📎 As premissas são proposições que devem ser consideradas verdadeiras para se chegar a uma conclusão.\n" +
                        "📎 As premissas também são conhecidas por hipóteses do argumento."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_ARGUMENTOS_DEDUTIVOS",
                "🧭 Argumentos Dedutivos",
                "📌 Definição:\n" +
                        "📎 São aqueles que NÃO produzem conhecimento novo.\n" +
                        "📎 A informação presente na conclusão já estava presente nas premissas.\n" +
                        "📎 Ex: 'João e Pedro foram à praia' → 'Logo, João foi à praia'.\n" +
                        "📎 Silogismo: argumento dedutivo composto por duas premissas e uma conclusão."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_CATEGORICOS_HIPOTETICOS",
                "🧭 Argumentos Categóricos e Hipotéticos",
                "📌 Distinção:\n" +
                        "✅ CATEGÓRICOS: Apresentam proposições categóricas (todo, nenhum, algum, etc.).\n" +
                        "✅ HIPOTÉTICOS: Não apresentam proposições categóricas; fazem uso dos conectivos (e, ou, se...então, etc.)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_VALIDADE_VERACIDADE",
                "🧭 Validade x Veracidade",
                "📌 Distinção:\n" +
                        "✅ VALIDADE: Característica dos argumentos dedutivos. Um argumento pode ser VÁLIDO ou INVÁLIDO.\n" +
                        "✅ VERACIDADE: Característica das proposições. As proposições podem ser VERDADEIRAS ou FALSAS.\n" +
                        "📎 Não há relação direta entre a validade de um argumento e a veracidade da sua conclusão."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_ARGUMENTO_VALIDO",
                "🧭 Argumento Dedutivo Válido",
                "📌 Definição:\n" +
                        "📎 A conclusão é uma consequência inevitável do conjunto de premissas.\n" +
                        "📎 A conclusão é necessariamente verdadeira uma vez que as premissas são CONSIDERADAS verdadeiras.\n" +
                        "📎 Pode ter: premissas V e conclusão V; premissas F e conclusão V; premissas F e conclusão F.\n" +
                        "⚠️ NÃO É POSSÍVEL: premissas verdadeiras e conclusão falsa."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_ARGUMENTO_INVALIDO",
                "🧭 Argumento Dedutivo Inválido",
                "📌 Definição:\n" +
                        "📎 CONSIDERADAS as premissas como verdadeiras, a conclusão NÃO é necessariamente verdadeira.\n" +
                        "📎 Também é conhecido por falácia formal ou sofisma.\n" +
                        "📎 Pode ter: premissas V e conclusão V; premissas V e conclusão F; premissas F e conclusão V; premissas F e conclusão F."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_REPRESENTACAO_ARGUMENTO",
                "🧭 Representação de um Argumento",
                "📌 Formas:\n" +
                        "✅ FORMA SIMBÓLICA: P1; P2; ...; Pn ⊢ C\n" +
                        "✅ FORMA PADRONIZADA:\n" +
                        "P1\n" +
                        "P2\n" +
                        "...\n" +
                        "Pn\n" +
                        "___\n" +
                        "C\n" +
                        "📎 Condicional associada: (P1 ∧ P2 ∧ ... ∧ Pn) → C"
        ));

        // ==================== SILOGISMO CATEGÓRICO ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_SILOGISMO_CATEGORICO",
                "🧭 Silogismo Categórico",
                "📌 Definição:\n" +
                        "📎 Argumento com exatamente duas premissas que são proposições categóricas.\n" +
                        "📎 Formado por três termos:\n" +
                        "✅ TERMO MAIOR: aparece no predicado da conclusão.\n" +
                        "✅ TERMO MÉDIO: aparece nas premissas e NÃO aparece na conclusão.\n" +
                        "✅ TERMO MENOR: aparece no sujeito da conclusão."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_MODOS_SILOGISMO",
                "🧭 Modos do Silogismo Categórico",
                "📌 Definição:\n" +
                        "📎 Composto por três letras entre A, E, I e O que representam as proposições categóricas na sequência: [Premissa Maior][Premissa Menor][Conclusão].\n" +
                        "✅ A: Universal Afirmativa (Todo S é P).\n" +
                        "✅ E: Universal Negativa (Nenhum S é P).\n" +
                        "✅ I: Particular Afirmativa (Algum S é P).\n" +
                        "✅ O: Particular Negativa (Algum S não é P)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_FIGURAS_SILOGISMO",
                "🧭 Figuras do Silogismo Categórico",
                "📌 Classificação:\n" +
                        "✅ 1ª FIGURA: termo médio é sujeito na premissa maior e predicado na menor.\n" +
                        "✅ 2ª FIGURA: termo médio é predicado nas duas premissas.\n" +
                        "✅ 3ª FIGURA: termo médio é sujeito nas duas premissas.\n" +
                        "✅ 4ª FIGURA: termo médio é predicado na premissa maior e sujeito na menor."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_REGRAS_SILOGISMO",
                "🧭 Regras de Validade do Silogismo",
                "📌 Regras:\n" +
                        "1. Todo silogismo deve conter somente três termos: maior, médio e menor.\n" +
                        "2. O termo médio deve ser universal ao menos uma vez.\n" +
                        "3. O termo médio não pode entrar na conclusão.\n" +
                        "4. Nenhum termo da conclusão pode ser mais extenso na conclusão do que nas premissas.\n" +
                        "5. A conclusão sempre acompanha a premissa mais fraca.\n" +
                        "6. De duas premissas afirmativas a conclusão deve ser afirmativa.\n" +
                        "7. De duas premissas particulares não poderá haver conclusão.\n" +
                        "8. De duas premissas negativas não poderá haver conclusão."
        ));

        // ==================== MÉTODOS DE VERIFICAÇÃO DA VALIDADE ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_METODO_DIAGRAMAS",
                "🧭 Método dos Diagramas Lógicos",
                "📌 Aplicação:\n" +
                        "📎 Usado para argumentos categóricos.\n" +
                        "📎 Desenhar os diagramas lógicos das premissas.\n" +
                        "📎 Verificar se a conclusão é necessariamente verdadeira em todas as configurações.\n" +
                        "📎 Se a conclusão for necessariamente verdadeira, o argumento é VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_METODO_PREMISSAS_VERDADEIRAS",
                "🧭 Método das Premissas Verdadeiras",
                "📌 Aplicação:\n" +
                        "📎 Considerar todas as premissas como verdadeiras.\n" +
                        "📎 Verificar se a conclusão é necessariamente verdadeira.\n" +
                        "📎 Similar às 'questões clássicas' envolvendo conectivos lógicos.\n" +
                        "📎 Útil quando as premissas estão em 'formatos fáceis' (proposição simples V, conjunção V, disjunção F, condicional F)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_METODO_TABELA_VERDADE",
                "🧭 Método da Tabela-Verdade",
                "📌 Aplicação:\n" +
                        "📎 Construir a tabela-verdade da condicional associada ao argumento: (P1 ∧ P2 ∧ ... ∧ Pn) → C.\n" +
                        "📎 Se a condicional for uma TAUTOLOGIA, o argumento é VÁLIDO.\n" +
                        "📎 Se a condicional NÃO for uma tautologia, o argumento é INVÁLIDO.\n" +
                        "📌 Para múltipla escolha:\n" +
                        "1. Desconsiderar o contexto.\n" +
                        "2. Inserir premissas na tabela e obter linhas em que todas são V.\n" +
                        "3. Verificar a resposta que é verdadeira em todas as linhas obtidas."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_METODO_CONCLUSAO_FALSA",
                "🧭 Método da Conclusão Falsa",
                "📌 Aplicação:\n" +
                        "📎 Requer que a conclusão seja: proposição simples, disjunção inclusiva (∨) ou condicional (→).\n" +
                        "📎 Passos:\n" +
                        "1. Desconsiderar o contexto.\n" +
                        "2. Partir da hipótese de que a conclusão é FALSA.\n" +
                        "3. Tentar obter AO MENOS UM CASO em que todas as premissas sejam verdadeiras mantendo a conclusão falsa.\n" +
                        "📎 Se for possível, o argumento é INVÁLIDO.\n" +
                        "📎 Se NÃO for possível, o argumento é VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_METODO_TRANSITIVIDADE",
                "🧭 Método da Transitividade do Condicional",
                "📌 Aplicação:\n" +
                        "📎 Premissas no formato condicional em que o antecedente da premissa posterior é igual ao consequente da premissa anterior.\n" +
                        "📎 Conclusão no formato condicional cujo antecedente é o da primeira premissa e cujo consequente é o da última premissa.\n" +
                        "📎 Esse tipo de argumento é SEMPRE VÁLIDO.\n" +
                        "📎 Ex: a→b, b→c, c→d, d→e ⊢ a→e.\n" +
                        "📎 Pode ser necessário usar a equivalência contrapositiva (p→q ≡ ~q→~p) para conectar as condicionais."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_TRANSITIVIDADE_DISJUNCAO",
                "🧭 Transitividade com Disjunção Inclusiva",
                "📌 Regra:\n" +
                        "📎 Premissas podem estar no formato de disjunção inclusiva (ou; ∨).\n" +
                        "📎 Nesse caso, transformar em condicional utilizando a equivalência p∨q ≡ ~p→q.\n" +
                        "📎 Em seguida, aplicar o método da transitividade do condicional."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_CONCLUSAO_SIMPLES",
                "🧭 Transitividade com Conclusão Simples",
                "📌 Regra:\n" +
                        "📎 Premissas condicionais e conclusão é uma proposição simples.\n" +
                        "📎 Buscar obter uma conclusão da forma ~p→p ou da forma p→~p.\n" +
                        "✅ Conclusão ~p→p significa que p é VERDADEIRO.\n" +
                        "✅ Conclusão p→~p significa que p é FALSO."
        ));

        // ==================== MÉTODO DAS REGRAS DE INFERÊNCIA ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_REGRAS_INFERENCIA",
                "🧭 Método das Regras de Inferência",
                "📌 Definição:\n" +
                        "📎 Regras de bolso que servem para verificar a validade de um argumento dedutivo com maior rapidez.\n" +
                        "📎 As regras de inferência sempre apresentam argumentos VÁLIDOS."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_MODUS_PONENS",
                "🧭 Modus Ponens (Afirmação do Antecedente)",
                "📌 Formato:\n" +
                        "Premissa 1: Se p, então q.\n" +
                        "Premissa 2: p.\n" +
                        "Conclusão: q.\n" +
                        "📎 Temos como premissas um condicional e a afirmação do antecedente.\n" +
                        "📎 A conclusão é o consequente.\n" +
                        "📎 SEMPRE VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_MODUS_TOLLENS",
                "🧭 Modus Tollens (Negação do Consequente)",
                "📌 Formato:\n" +
                        "Premissa 1: Se p, então q.\n" +
                        "Premissa 2: ~q.\n" +
                        "Conclusão: ~p.\n" +
                        "📎 Temos como premissas um condicional e a negação do consequente.\n" +
                        "📎 A conclusão é a negação do antecedente.\n" +
                        "📎 SEMPRE VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_SILOGISMO_HIPOTETICO",
                "🧭 Silogismo Hipotético",
                "📌 Formato:\n" +
                        "Premissa 1: Se p, então q.\n" +
                        "Premissa 2: Se q, então r.\n" +
                        "Conclusão: Se p, então r.\n" +
                        "📎 Utiliza a transitividade do condicional quando temos duas premissas.\n" +
                        "📎 SEMPRE VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_DILEMA_CONSTRUTIVO",
                "🧭 Dilema Construtivo (Silogismo Disjuntivo)",
                "📌 Formato:\n" +
                        "Premissa 1: Se p, então q.\n" +
                        "Premissa 2: Se r, então s.\n" +
                        "Premissa 3: p ou r.\n" +
                        "Conclusão: q ou s.\n" +
                        "📎 Três premissas: duas condicionais e a disjunção inclusiva dos antecedentes.\n" +
                        "📎 A conclusão é a disjunção inclusiva dos consequentes.\n" +
                        "📎 SEMPRE VÁLIDO."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "LOGICA_ARG_DILEMA_DESTRUTIVO",
                "🧭 Dilema Destrutivo",
                "📌 Formato:\n" +
                        "Premissa 1: Se p, então q.\n" +
                        "Premissa 2: Se r, então s.\n" +
                        "Premissa 3: ~q ou ~s.\n" +
                        "Conclusão: ~p ou ~r.\n" +
                        "📎 Três premissas: duas condicionais e a disjunção inclusiva da negação dos consequentes.\n" +
                        "📎 A conclusão é a disjunção inclusiva da negação dos antecedentes.\n" +
                        "📎 SEMPRE VÁLIDO."
        ));

        return lista;
    }
}
