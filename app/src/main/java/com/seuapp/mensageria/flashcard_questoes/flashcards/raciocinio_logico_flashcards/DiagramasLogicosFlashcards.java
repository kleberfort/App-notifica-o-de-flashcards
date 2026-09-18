package com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class DiagramasLogicosFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== PROPOSIÇÕES QUANTIFICADAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_SENTENCA_ABERTA",
                "🧭 Sentença Aberta",
                "📌 Definição:\n" +
                        "📎 Expressão que possui um termo variável.\n" +
                        "📎 Não há como atribuir-lhe valor lógico (V ou F).\n" +
                        "📎 NÃO É PROPOSIÇÃO.\n" +
                        "📎 Ex: 'x + 10 = 50'.\n" +
                        "📎 O valor lógico depende do valor da variável 'x'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_QUANTIFICADOR_UNIVERSAL",
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
                "DIAGRAMAS_LOGICO_QUANTIFICADOR_EXISTENCIAL",
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
                "DIAGRAMAS_LOGICO_PROPS_CATEGORICAS",
                "🧭 Proposições Categóricas",
                "📌 Classificação:\n" +
                        "✅ FORMA A (Universal Afirmativa): Todo S é P.\n" +
                        "✅ FORMA E (Universal Negativa): Nenhum S é P.\n" +
                        "✅ FORMA I (Particular Afirmativa): Algum S é P.\n" +
                        "✅ FORMA O (Particular Negativa): Algum S não é P.\n" +
                        "📎 As letras vêm do latim: A (affirmo) e E (nego) para universais; I (affirmo) e O (nego) para particulares."
        ));

        // ==================== NEGAÇÃO DE PROPOSIÇÕES QUANTIFICADAS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_AFIRMATIVA",
                "🧭 Negação de Proposição Universal Afirmativa",
                "📌 Regra:\n" +
                        "📎 Substituir o quantificador universal por um existencial.\n" +
                        "📎 Negar o predicado da oração.\n" +
                        "📎 Ex: 'Todo brasileiro gosta de futebol' → 'Pelo menos um brasileiro não gosta de futebol'.\n" +
                        "📎 Ex: 'Todo engenheiro é responsável' → 'Algum engenheiro não é responsável'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_NEGACAO_UNIVERSAL_NEGATIVA",
                "🧭 Negação de Proposição Universal Negativa",
                "📌 Regra:\n" +
                        "📎 Substituir o quantificador universal (nenhum) por um existencial (pelo menos um, algum).\n" +
                        "📎 O predicado NÃO precisa ser negado, pois 'nenhum' já engloba a negação.\n" +
                        "📎 Ex: 'Nenhuma cobra voa' → 'Pelo menos uma cobra voa'.\n" +
                        "📎 Ex: 'Nenhum soldado escuta mal' → 'Há pelo menos um soldado que escuta mal'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_AFIRMATIVA",
                "🧭 Negação de Proposição Particular Afirmativa",
                "📌 Regra:\n" +
                        "📎 Substituir o quantificador existencial por um universal.\n" +
                        "📎 Negar o predicado da oração.\n" +
                        "📎 Ex: 'Existem pessoas que não pegaram Covid-19' → 'Todas as pessoas pegaram Covid-19'.\n" +
                        "📎 Ex: 'Existem insetos que não são pretos' → 'Todo inseto é preto'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_NEGACAO_PARTICULAR_NEGATIVA",
                "🧭 Negação de Proposição Particular Negativa",
                "📌 Regra:\n" +
                        "📎 Substituir o quantificador existencial por um universal.\n" +
                        "📎 Negar o predicado da oração.\n" +
                        "📎 Ex: 'Pelo menos uma pessoa participou do congresso' → 'Nenhuma pessoa participou do congresso'.\n" +
                        "📎 Ex: 'Algum engenheiro não faltou à aula' → 'Nenhum engenheiro faltou à aula'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_TERMOS_ADICIONAIS",
                "🧭 Cuidado com Termos Adicionais",
                "📌 Atenção:\n" +
                        "📎 As bancas adicionam termos para confundir.\n" +
                        "📎 NÃO substitua 'com' por 'sem', 'quente' por 'frio', etc.\n" +
                        "📎 O foco é: substituir o quantificador e negar o predicado.\n" +
                        "📎 Ex: 'À noite, todos os gatos são pretos' → 'À noite, há pelo menos um gato que não é preto'."
        ));

        // ==================== DIAGRAMAS LÓGICOS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_DIAGRAMA_TODO",
                "🧭 Diagrama Lógico: Todo A é B",
                "📌 Representação:\n" +
                        "📎 O conjunto A está inteiramente contido no conjunto B.\n" +
                        "📎 A é um subconjunto de B.\n" +
                        "📎 Ex: 'Todo engenheiro é responsável'.\n" +
                        "📎 NÃO significa que todo responsável é engenheiro."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_DIAGRAMA_NENHUM",
                "🧭 Diagrama Lógico: Nenhum A é B",
                "📌 Representação:\n" +
                        "📎 Os conjuntos A e B são disjuntos (separados).\n" +
                        "📎 Não há intersecção entre eles.\n" +
                        "📎 Ex: 'Nenhum engenheiro é responsável'.\n" +
                        "📎 Nenhum elemento de A é elemento de B."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM",
                "🧭 Diagrama Lógico: Algum A é B",
                "📌 Representação:\n" +
                        "📎 Há intersecção entre os conjuntos A e B.\n" +
                        "📎 Existe pelo menos um elemento que pertence a ambos.\n" +
                        "📎 Ex: 'Algum engenheiro é responsável'.\n" +
                        "📎 A intersecção indica os elementos comuns."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_DIAGRAMA_ALGUM_NAO",
                "🧭 Diagrama Lógico: Algum A não é B",
                "📌 Representação:\n" +
                        "📎 Há elementos de A que estão fora de B.\n" +
                        "📎 Existe pelo menos um elemento de A que não pertence a B.\n" +
                        "📎 Ex: 'Algum engenheiro não é responsável'.\n" +
                        "📎 A parte de A fora da intersecção."
        ));

        // ==================== VALIDADE DE ARGUMENTOS ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_VALIDADE_ARGUMENTOS",
                "🧭 Validade de Argumentos com Diagramas",
                "📌 Como resolver:\n" +
                        "📎 Desenhar os diagramas lógicos das premissas.\n" +
                        "📎 Verificar se a conclusão é verdadeira em TODAS as configurações possíveis.\n" +
                        "📎 Se a conclusão for verdadeira em todas as configurações, o argumento é VÁLIDO.\n" +
                        "📎 Se houver uma configuração em que a conclusão é falsa, o argumento é INVÁLIDO."
        ));

        // ==================== QUESTÕES COMENTADAS - FGV ====================

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_FGV_PROPS_QUANTIFICADAS",
                "🧭 FGV - Proposições Quantificadas",
                "📌 Como resolver:\n" +
                        "📎 Identificar o quantificador (todo, algum, nenhum).\n" +
                        "📎 Para negar: substituir o quantificador e negar o predicado.\n" +
                        "📎 Ex: 'Todo candidato possui curso superior ou 5 anos de experiência' → 'Há candidato que não possui curso superior e não possui 5 anos de experiência'."
        ));

        lista.add(new Flashcard(
                "📘 Raciocínio Lógico",
                "DIAGRAMAS_LOGICO_FGV_DIAGRAMAS",
                "🧭 FGV - Diagramas Lógicos",
                "📌 Como resolver:\n" +
                        "📎 Desenhar os diagramas das premissas.\n" +
                        "📎 Avaliar cada alternativa para ver se é necessariamente verdadeira.\n" +
                        "📎 Ex: 'Todos os ciclistas jogam futebol e alguns ciclistas jogam basquete' → 'Quem não joga futebol não é ciclista'."
        ));

        return lista;
    }
}
