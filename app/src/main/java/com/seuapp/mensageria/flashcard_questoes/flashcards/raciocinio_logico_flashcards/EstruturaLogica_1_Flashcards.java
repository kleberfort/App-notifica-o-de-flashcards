package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class EstruturaLogica_1_Flashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ==========================================
        // 1. INTRODUÇÃO ÀS PROPOSIÇÕES
        // ==========================================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_DEFINICAO_PROPOSICAO",
                "🧭 O que é uma Proposição Lógica?",
                "📌 Definição:\n" +
                        "✅ ORAÇÃO: Sentido completo com verbo.\n" +
                        "✅ DECLARATIVA: Afirmativa ou negativa.\n" +
                        "✅ VALOR LÓGICO: Admite um, e apenas um, V ou F.\n" +
                        "❌ NÃO SÃO: Exclamativas, interrogativas, imperativas, optativas e sentenças abertas."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_ORACAO_DECLARATIVA",
                "🧭 Oração e Sentença Declarativa",
                "📌 Regras:\n" +
                        "✅ ORAÇÃO: Ter verbo e sentido completo.\n" +
                        "✅ DECLARATIVA: Afirmativa ou negativa.\n" +
                        "✅ Afirmativa: 'Taubaté é a capital de São Paulo.'\n" +
                        "✅ Negativa: 'João não é nordestino.'"
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_NAO_PROPOSICOES",
                "🧭 O que NÃO é Proposição?",
                "📌 Sentenças que não são proposições:\n" +
                        "❌ EXCLAMATIVA: 'Que noite agradável!'\n" +
                        "❌ INTERROGATIVA: 'Qual é a sua idade?'\n" +
                        "❌ IMPERATIVA: 'Chute a bola.'\n" +
                        "❌ OPTATIVA: 'Que Deus o conserve.'\n" +
                        "❌ SENTENÇA ABERTA: 'x + 9 = 10'"
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_SENTENCA_VS_EXPRESSAO",
                "🧭 Sentença vs Expressão",
                "📌 Distinção:\n" +
                        "✅ SENTENÇA: Exterioriza pensamento com sentido completo (possui verbo).\n" +
                        "❌ EXPRESSÃO: Não exprime pensamento completo (NÃO possui verbo). Ex: 'A casa de Pedro', 'Teclado'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_SENTENCAS_ABERTAS",
                "🧭 Sentenças Abertas",
                "📌 Característica:\n" +
                        "❌ NÃO SÃO PROPOSIÇÕES.\n" +
                        "⚠️ VALOR LÓGICO: Depende da determinação de uma variável.\n" +
                        "📎 Exemplos: 'x + 9 = 10', 'Ele correu 100 metros...'.\n" +
                        "📎 Pronomes 'ele', 'ela' funcionam como variáveis."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_QUANTIFICADORES",
                "🧭 Quantificadores",
                "📌 Transformam sentenças abertas em proposições:\n" +
                        "✅ 'todo', 'para todo', 'para qualquer', 'qualquer que seja'.\n" +
                        "✅ 'existe', 'algum', 'pelo menos um'.\n" +
                        "✅ 'nenhum', 'não existe'.\n" +
                        "✅ 'existe um único'.\n" +
                        "📎 Ex: 'Alguém correu 100m em 9,58s em 2009' (V)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_PARADOXOS_SUBJETIVIDADE",
                "🧭 Paradoxos e Subjetividade",
                "📌 Não são proposições:\n" +
                        "❌ PARADOXOS: Frases que geram contradição (Ex: 'Esta frase é uma mentira').\n" +
                        "❌ SUBJETIVIDADE: Frases com alta carga de opinião (Ex: 'Maria é formosíssima', 'João é incrível')."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_LOGICABIVALENTE",
                "🧭 Lógica Bivalente e Leis do Pensamento",
                "📌 Princípios da Lógica Proposicional:\n" +
                        "✅ IDENTIDADE: Uma proposição verdadeira é sempre verdadeira; falsa é sempre falsa.\n" +
                        "✅ NÃO CONTRADIÇÃO: Uma proposição não pode ser V e F ao mesmo tempo.\n" +
                        "✅ TERCEIRO EXCLUÍDO: Uma proposição ou é V ou é F, não existe 'talvez'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_PROP_SIMPLES",
                "🧭 Proposições Simples",
                "📌 Definição:\n" +
                        "✅ Não pode ser dividida em proposições menores.\n" +
                        "✅ É uma única parcela elementar indivisível.\n" +
                        "✅ Representada por letras (p, q, r).\n" +
                        "📎 Ex: p: 'Pedro é o estagiário do banco.'"
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_NEGACAO_SIMPLES",
                "🧭 Negação de Proposições Simples",
                "📌 Regras de Negação (~p):\n" +
                        "✅ Gera uma nova proposição simples com valor lógico oposto.\n" +
                        "✅ Uso do 'não', 'não é verdade que', 'é falso que'. No inícío\n" +
                        "✅ Para negar uma sentença negativa, remove-se o 'não'.\n" +
                        "⚠️ Cuidado com antônimos: 'vencer' e 'perder' não são negações (pode haver empate)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_NEGACAO_DECLARATIVA_NEGATIVA",
                "🧭 Negação de Sentença Declarativa Negativa",
                "📌 Regra Principal:\n" +
                        "✅ Remover o 'não' → transformar em afirmativa.\n" +
                        "📎 Ex: q: 'Taubaté não é a capital de MT'.\n" +
                        "📎 ~q: 'Não é verdade que Taubaté não é a capital de MT'.\n" +
                        "📎 ~q: 'É falso que Taubaté não é a capital de MT'.\n" +
                        "📎 ~q: 'Taubaté é a capital de MT'.\n" +
                        "⚠️ A negação nem sempre contém 'não' (a original já pode tê-lo)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_NEGACAO_ORACAO_PRINCIPAL",
                "🧭 Negação de Oração Principal",
                "📌 Regra:\n" +
                        "✅ Para negar proposição com oração principal e subordinada, nega-se a PRINCIPAL.\n" +
                        "📎 Ex: 'Pedro respondeu que estudou' → 'Pedro NÃO respondeu que estudou'.\n" +
                        "❌ É ERRADO negar a subordinada: 'Pedro respondeu que NÃO estudou'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_DUPLA_NEGACAO",
                "🧭 Dupla Negação e Múltiplas Negação",
                "📌 Regras:\n" +
                        "✅ ~(~p) ≡ p (Dupla negação volta ao original).\n" +
                        "✅ Número PAR de negações: equivale à proposição original.\n" +
                        "✅ Número ÍMPAR de negações: equivale à negação da original."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_PROP_COMPOSTAS",
                "🧭 Proposições Compostas",
                "📌 Definição:\n" +
                        "✅ Resulta da combinação de duas ou mais proposições simples.\n" +
                        "✅ Unidas por conectivos lógicos.\n" +
                        "✅ O valor lógico depende dos valores das proposições simples."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_CONJUNCAO",
                "🧭 Conjunção (p ∧ q)",
                "📌 Conectivo 'E':\n" +
                        "✅ Símbolo: ∧ ou &.\n" +
                        "✅ Valor lógico: VERDADEIRA somente quando ambas as parcelas são verdadeiras.\n" +
                        "❌ Nos demais casos, é FALSA.\n" +
                        "📎 'Mas', 'entretanto', 'nem' (e não) também são conjunções."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_DISJUNCAO_INCLUSIVA",
                "🧭 Disjunção Inclusiva (p ∨ q)",
                "📌 Conectivo 'OU':\n" +
                        "✅ Símbolo: ∨ ou U.\n" +
                        "❌ Valor lógico: FALSA somente quando ambas as parcelas são falsas.\n" +
                        "✅ Nos demais casos, é VERDADEIRA.\n" +
                        "📎 Indica inclusão (pode ser um, outro ou ambos)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_DISJUNCAO_EXCLUSIVA",
                "🧭 Disjunção Exclusiva (p ∨ q)",
                "📌 Conectivo 'OU...OU':\n" +
                        "✅ Símbolo: ∨ ou Ø (ou ⊻).\n" +
                        "❌ Valor lógico: FALSA somente quando ambas as parcelas têm o MESMO valor lógico.\n" +
                        "✅ É VERDADEIRA quando as parcelas são diferentes.\n" +
                        "📎 Indica exclusão (um ou outro, nunca ambos)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_CONDICIONAL",
                "🧭 Condicional (p → q)",
                "📌 Conectivo 'SE...ENTÃO':\n" +
                        "✅ Símbolo: →.\n" +
                        "❌ Valor lógico: FALSA somente quando a primeira é V e a segunda é F (V→F).\n" +
                        "✅ Nos demais casos, é VERDADEIRA.\n" +
                        "📎 p é condição suficiente para q. q é condição necessária para p."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_BICONDICIONAL",
                "🧭 Bicondicional (p ↔ q)",
                "📌 Conectivo 'SE E SOMENTE SE':\n" +
                        "✅ Símbolo: ↔.\n" +
                        "✅ Valor lógico: VERDADEIRA somente quando ambas as parcelas têm o MESMO valor lógico.\n" +
                        "❌ É FALSA quando as parcelas são diferentes.\n" +
                        "📎 p é condição necessária e suficiente para q."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FORMAS_CONDICIONAL",
                "🧭 Formas Alternativas da Condicional",
                "📌 Formas de representar p → q:\n" +
                        "📎 Se p, q.\n" +
                        "📎 Como p, q.\n" +
                        "📎 p, logo q.\n" +
                        "📎 p implica q.\n" +
                        "📎 Quando p, q.\n" +
                        "📎 Toda vez que p, q.\n" +
                        "📎 p somente se q.\n" +
                        "📎 q, se p. / q, pois p. / q porque p."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FORMAS_BICONDICIONAL",
                "🧭 Formas Alternativas da Bicondicional",
                "📌 Formas de representar p ↔ q:\n" +
                        "📎 p se e somente se q.\n" +
                        "📎 p assim como q.\n" +
                        "📎 p se e só se q.\n" +
                        "📎 Se p, então q e se q, então p.\n" +
                        "📎 p somente se q e q somente se p."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FORMAS_DISJUNCAO_EXCLUSIVA",
                "🧭 Formas Alternativas da Disjunção Exclusiva",
                "📌 Formas de representar p ∨ q:\n" +
                        "📎 Ou p, ou q.\n" +
                        "📎 p ou q, mas não ambos.\n" +
                        "⚠️ Em algumas questões, o 'ou' sozinho pode ser exclusivo (quando as proposições não podem ser simultaneamente verdadeiras)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_COND_SUFICIENTE_NECESSARIA",
                "🧭 Condição Suficiente e Necessária",
                "📌 Na condicional p → q:\n" +
                        "✅ p é condição SUFICIENTE para q.\n" +
                        "✅ q é condição NECESSÁRIA para p.\n" +
                        "⚠️ Macete: a palavra 'Se' aponta para a condição Suficiente.\n" +
                        "📎 'Se p, então q' → p é Suficiente, q é Necessária."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_BICOND_NECESSARIA_SUFICIENTE",
                "🧭 Condição Necessária e Suficiente",
                "📌 Na bicondicional p ↔ q:\n" +
                        "✅ p é condição necessária e suficiente para q.\n" +
                        "✅ q é condição necessária e suficiente para p.\n" +
                        "📎 Ex: 'Pedro vai ao parque se e somente se Maria vai ao cinema.'"
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_NOMENCLATURA_CONDICIONAL",
                "🧭 Nomenclatura da Condicional",
                "📌 Termos da condicional p → q:\n" +
                        "✅ p: Antecedente / Precedente / Condição Suficiente.\n" +
                        "✅ q: Consequente / Subsequente / Condição Necessária.\n" +
                        "⚠️ Não confunda 'subsequente' com 'suficiente'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_MACETES_TABELAS",
                "🧭 Macetes Mestres das Tabelas-Verdade",
                "📌 Resumo dos Conectivos:\n" +
                        "✅ CONJUNÇÃO (∧): V apenas se ambos V.\n" +
                        "❌ DISJUNÇÃO INCLUSIVA (∨): F apenas se ambos F.\n" +
                        "❌ DISJUNÇÃO EXCLUSIVA (∨): F apenas se ambos iguais.\n" +
                        "❌ CONDICIONAL (→): F apenas se V→F.\n" +
                        "✅ BICONDICIONAL (↔): V apenas se ambos iguais."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CONDICIONAL_FALSA",
                "🧭 FGV - Condicional Falsa",
                "📌 Como resolver:\n" +
                        "⚠️ Quando a questão diz que uma condicional (p → q) é FALSA, conclua que:\n" +
                        "✅ O antecedente (p) é VERDADEIRO.\n" +
                        "❌ O consequente (q) é FALSO.\n" +
                        "📎 Ex: 'Se A e B, então C ou D' é Falsa → A e B são V, C e D são F."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_DISJUNCAO_FALSA",
                "🧭 FGV - Disjunção Inclusiva Falsa",
                "📌 Como resolver:\n" +
                        "⚠️ Quando a questão diz que uma disjunção inclusiva (p ∨ q) é FALSA, conclua que:\n" +
                        "❌ Ambas as parcelas (p e q) são FALSAS.\n" +
                        "📎 Ex: 'Paulo não é louro ou Margarida é morena' é Falsa → Paulo é louro e Margarida não é morena."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CONJUNCAO_VERDADEIRA",
                "🧭 FGV - Conjunção Verdadeira",
                "📌 Como resolver:\n" +
                        "⚠️ Quando a questão afirma que uma conjunção (p ∧ q) é VERDADEIRA, conclua que:\n" +
                        "✅ Ambas as parcelas (p e q) são VERDADEIRAS.\n" +
                        "📎 Ex: 'Marlene é médica e Olga é oftalmologista' é V → Marlene é médica e Olga é oftalmologista."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CONDICIONAL_VERDADEIRA",
                "🧭 FGV - Condicional Verdadeira",
                "📌 Como resolver:\n" +
                        "⚠️ Quando a questão afirma que uma condicional (p → q) é VERDADEIRA, você NÃO pode concluir os valores de p e q.\n" +
                        "✅ A condicional é V nos casos: V→V, F→V, F→F.\n" +
                        "❌ A única certeza é que NÃO ocorre V→F."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CASOS_PRATICOS",
                "🧭 FGV - Casos Práticos Resolvidos",
                "📌 Exemplos:\n" +
                        "❌ 'Se a calça é verde e a camisa é rosa, então o sapato é branco ou o cinto é marrom' é FALSA.\n" +
                        "✅ Conclusão: calça verde (V), camisa rosa (V), sapato NÃO branco (F), cinto NÃO marrom (F).\n" +
                        "❌ 'Paulo não é louro ou Margarida é morena' é FALSA.\n" +
                        "✅ Conclusão: Paulo é louro (V), Margarida NÃO é morena (F)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CARTAS_PRIMO",
                "🧭 FGV - Problema dos Cartões (Triângulo/Primo)",
                "📌 Como resolver:\n" +
                        "📎 Afirmação: 'Todo cartão com triângulo tem número primo'.\n" +
                        "📎 Condicional: p → q (triângulo → primo).\n" +
                        "⚠️ Para verificar, vire APENAS:\n" +
                        "✅ O cartão com triângulo (para confirmar se tem primo).\n" +
                        "❌ O cartão com número NÃO primo (para confirmar se NÃO tem triângulo)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_CONTRA_EXEMPLO",
                "🧭 FGV - Contra-Exemplo",
                "📌 Definição:\n" +
                        "📎 Para uma condicional 'Se antecedente, então consequente'.\n" +
                        "✅ Contra-exemplo torna o antecedente V e o consequente F.\n" +
                        "📎 Ex: 'SE x é múltiplo de 7 ENTÃO x é ímpar'.\n" +
                        "❌ Contra-exemplo: x = 14 (múltiplo de 7 e NÃO é ímpar)."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "EST_LOG_1_FGV_SOMENTE_SE",
                "🧭 FGV - 'Somente Se'",
                "📌 Regra:\n" +
                        "✅ 'p somente se q' é equivalente a 'Se p, então q' (p → q).\n" +
                        "📎 Ex: 'O jogo só será realizado se não chover'.\n" +
                        "📎 Equivale a: 'Se o jogo é realizado, então não chove'.\n" +
                        "⚠️ Cuidado: 'se e somente se' é bicondicional, diferente de 'somente se'."
        ));

        return lista;

    }
}
