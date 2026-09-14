package com.seuapp.mensageria.flashcard_questoes.flashcards.ingles_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class IntroducaoScammingSkimmingFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // Seção 2.1: Técnicas de Leitura
        lista.add(new Flashcard(
                "📘 Leitura em Inglês - Técnicas",
                "ING_INTRODUCAO_SKIMMING_DEFINICAO",
                "🧭 Skimming - Leitura Dinâmica",
                "📌 O que é SKIMMING?:\n" +
                        "🔍 Leitura dinâmica para identificar a ideia geral do texto.\n" +
                        "👀 Foque em cognatos, palavras repetidas, títulos e subtítulos.\n" +
                        "❌ Ignore palavras desconhecidas e NÃO traduza."
        ));

        lista.add(new Flashcard(
                "📘 Leitura em Inglês - Técnicas",
                "ING_INTRODUCAO_SCANNING_DEFINICAO",
                "🧭 Scanning - Busca Específica",
                "📌 O que é SCANNING?:\n" +
                        "🎯 Leitura para encontrar informações específicas no texto.\n" +
                        "📅 Use para: datas, nomes, números.\n" +
                        "🔎 Volte ao texto para confirmar a resposta."
        ));

        lista.add(new Flashcard(
                "📘 Leitura em Inglês - Técnicas",
                "ING_INTRODUCAO_INFERENCIA_CONTEXTUAL",
                "🧭 Macete de Dedução",
                "📌 Palavras desconhecidas não travam a leitura:\n" +
                        "🧠 Use o contexto ao redor para deduzir o significado.\n" +
                        "📌 Exemplo: 'onças em uma capinte se escondendo' → capinte é floresta."
        ));

        // Seção 2.2: Cognatos e Falsos Cognatos
        lista.add(new Flashcard(
                "📘 Vocabulário - Cognatos",
                "ING_INTRODUCAO_COGNATOS_AJUDANTES",
                "🧭 Cognatos - Palavras Amigas",
                "📌 Cognatos são palavras semelhantes ao português:\n" +
                        "📷 CAMERA = câmera | 📞 TELEPHONE = telefone\n" +
                        "💰 ECONOMY = economia | 🌍 GEOGRAPHY = geografia\n" +
                        "✅ Use-os como pistas para o assunto do texto."
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_REALIZE",
                "🧭 Falso Cognato - REALIZE",
                "📌 REALIZE ≠ Realizar:\n" +
                        "⚠️ REALIZE = PERCEBER, NOTAR\n" +
                        "✅ Realizar em inglês = COME TRUE / ACHIEVE"
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_PREJUDICE",
                "🧭 Falso Cognato - PREJUDICE",
                "📌 PREJUDICE ≠ Prejudicial:\n" +
                        "⚠️ PREJUDICE = PRECONCEITO\n" +
                        "✅ Prejudicial em inglês = HARMFUL"
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_COLLEGE",
                "🧭 Falso Cognato - COLLEGE",
                "📌 COLLEGE ≠ Colégio:\n" +
                        "⚠️ COLLEGE = FACULDADE\n" +
                        "✅ Colégio/Escola em inglês = SCHOOL"
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_FABRIC",
                "🧭 Falso Cognato - FABRIC",
                "📌 FABRIC ≠ Fábrica:\n" +
                        "⚠️ FABRIC = TECIDO\n" +
                        "✅ Fábrica em inglês = FACTORY"
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_PASTA",
                "🧭 Falso Cognato - PASTA",
                "📌 PASTA ≠ Pasta de escritório:\n" +
                        "⚠️ PASTA = MASSA (alimento)\n" +
                        "✅ Pasta de escritório = BRIEFCASE / FOLDER"
        ));

        lista.add(new Flashcard(
                "📘 Vocabulário - Falsos Cognatos",
                "ING_INTRODUCAO_FALSOS_COGNATOS_VISITANT",
                "🧭 Falso Cognato - VISITANT",
                "📌 VISITANT ≠ Visitante:\n" +
                        "⚠️ VISITANT = ASSOMBRAÇÃO, FANTASMA\n" +
                        "✅ Visitante em inglês = VISITOR"
        ));

        // Seção 2.3: Gramática - Ordem e Sujeito
        lista.add(new Flashcard(
                "📘 Gramática - Ordem das Palavras",
                "ING_INTRODUCAO_ORDEM_ADJETIVO",
                "🧭 Ordem do Adjetivo",
                "📌 Em inglês, o adjetivo vem ANTES do substantivo:\n" +
                        "🇧🇷 BR: Pessoa elegante.\n" +
                        "🇬🇧 GB: ELEGANT person.\n" +
                        "💡 Pense: What a + (QUALIDADE) + (PESSOA/COISA)."
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Estrutura da Frase",
                "ING_INTRODUCAO_SUJEITO_OBRIGATORIO",
                "🧭 Sujeito Obrigatório",
                "📌 O inglês SEMPRE exige um sujeito na frase:\n" +
                        "🇧🇷 BR: 'Roubaram o carro.' / 'Choveu ontem.'\n" +
                        "🇬🇧 GB: 'They stole the car.' / 'It rained yesterday.'"
        ));

        // Seção 2.4: Verbos
        lista.add(new Flashcard(
                "📘 Gramática - Verbos",
                "ING_INTRODUCAO_VERBO_PRESENTE",
                "🧭 Presente Simples",
                "📌 PRESENTE (Rotina, Fatos):\n" +
                        "✅ Verbo sem 'S' para a maioria; acrescenta 'S' na 3ª pessoa.\n" +
                        "🕐 Marcadores: Always, Usually, Often, Every day.\n" +
                        "📌 Exemplo: I WORK. / He WORKS. / They WORK."
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Verbos",
                "ING_INTRODUCAO_VERBO_PASSADO",
                "🧭 Passado Simples",
                "📌 PASSADO (Ação concluída):\n" +
                        "✅ Verbo termina em '-ED' (regulares) OU muda a letra (irregulares).\n" +
                        "🕐 Marcadores: Yesterday, Last week, Last month, Ago.\n" +
                        "📌 Exemplo: I WORKED. / He DRANK. / They WROTE."
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Verbos",
                "ING_INTRODUCAO_VERBO_FUTURO",
                "🧭 Futuro Simples",
                "📌 FUTURO (Ação futura):\n" +
                        "✅ WILL ou GOING TO + verbo principal.\n" +
                        "🕐 Marcadores: Tomorrow, Next week, In the future.\n" +
                        "📌 Exemplo: I WILL WORK. / He IS GOING TO work."
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Verbos",
                "ING_INTRODUCAO_MACETE_PASSADO_REGULAR",
                "🧭 Macete do 'EI' - Passado",
                "📌 Verbos regulares no passado têm som de 'EI':\n" +
                        "🔊 WORKED (trabalhEI), STUDYED (estudEI), PLAYED (joguEI).\n" +
                        "⚠️ Verbos irregulares NÃO seguem essa lógica (drink -> drank)."
        ));

        // Seção 3: Ciladas e Antídotos
        lista.add(new Flashcard(
                "📘 Estratégia para Prova",
                "ING_INTRODUCAO_CILADA_TRADUCAO",
                "🧭 Antídoto - Não Traduzir",
                "📌 Traduzir palavra por palavra é uma CILADA:\n" +
                        "✅ Use SKIMMING (ideia geral) e SCANNING (detalhes).\n" +
                        "⏰ Pular palavras desconhecidas economiza tempo."
        ));

        lista.add(new Flashcard(
                "📘 Estratégia para Prova",
                "ING_INTRODUCAO_CILADA_PASSADO_ED",
                "🧭 Antídoto - Verbos no Passado",
                "📌 Achar que todo verbo no passado é '-ED' é CILADA:\n" +
                        "✅ Aplique o macete do som 'EI'. Se não funciona, é irregular.\n" +
                        "🔤 Exemplos irregulares: write-wrote, drink-drank, make-made."
        ));

        lista.add(new Flashcard(
                "📘 Estratégia para Prova",
                "ING_INTRODUCAO_CILADA_FALSOS_COGNATOS",
                "🧭 Antídoto - Falsos Cognatos",
                "📌 Suspeite de toda palavra parecida com o português:\n" +
                        "⚠️ 'Prejudice' NUNCA é 'prejudicial'.\n" +
                        "⚠️ 'Realize' NUNCA é 'realizar'.\n" +
                        "✅ Confirme o significado no contexto."
        ));

        // Seção 4: Fontes para Estudo
        lista.add(new Flashcard(
                "📘 Fontes de Estudo",
                "ING_INTRODUCAO_FONTES_TEXTO_CONCURSOS",
                "🧭 Fontes Recorrentes em Provas",
                "📌 Fontes de texto mais cobradas em concursos:\n" +
                        "🗞️ Guardian, BBC News, New York Times\n" +
                        "📰 The Economist, CNN, Time, Newsweek\n" +
                        "🔬 Scientific American, National Geographic"
        ));

        // ===== VÍDEO 02: INTERPRETAÇÃO DE IMAGENS E IDIOMS =====

        // Seção 2.1: Interpretação de Imagens
        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_IMAGENS_REGRA_OURO",
                "🧭 Imagens em Provas",
                "📌 Imagens NUNCA são meramente ilustrativas:\n" +
                        "🔍 Carregam informações essenciais para a interpretação.\n" +
                        "🏷️ Identifique o tipo: tirinha, gráfico, mapa, charge, etc."
        ));

        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_PERSONAGENS_GARFIELD",
                "🧭 Personagens - Garfield",
                "📌 GARFIELD - Características:\n" +
                        "😼 Cínico, sarcástico, preguiçoso\n" +
                        "🍕 Adora comer | ODEIA segundas-feiras"
        ));

        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_PERSONAGENS_MAFALDA",
                "🧭 Personagens - Mafalda",
                "📌 MAFALDA - Características:\n" +
                        "🤔 Reflexiva, crítica sobre política e economia\n" +
                        "🌍 Preocupada com questões sociais e ambientais"
        ));

        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_PERSONAGENS_PEANUTS",
                "🧭 Personagens - Peanuts",
                "📌 PEANUTS (Snoopy/Charlie Brown):\n" +
                        "💭 Reflexivo, aborda temas da vida\n" +
                        "❤️ Temas de amor e amizade com tom filosófico"
        ));

        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_PERSONAGENS_HAGAR",
                "🧭 Personagens - Hagar",
                "📌 HAGAR, O HORRÍVEL:\n" +
                        "⚔️ Crítica ao machismo e à preguiça\n" +
                        "😴 Personagem viking folgado"
        ));

        lista.add(new Flashcard(
                "📘 Interpretação de Imagens",
                "ING_INTRODUCAO_ANALISE_IMAGENS",
                "🧭 Como Analisar Imagens",
                "📌 Passos para analisar imagens:\n" +
                        "1️⃣ Identifique o Tipo (tirinha, gráfico, etc.)\n" +
                        "2️⃣ Conheça o Contexto (personagens)\n" +
                        "3️⃣ Observe Detalhes (cores, números, legendas)\n" +
                        "4️⃣ Relacione com o Texto (imagem + texto verbal)"
        ));

        // Seção 2.2: Expressões Idiomáticas
        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_BETTER_LATE",
                "🧭 Idiom - Better late than never",
                "📌 'Better late than never':\n" +
                        "🇧🇷 SIGNIFICADO: Antes tarde do que nunca.\n" +
                        "🕐 Contexto: atraso ou chegada tardia."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_WORD_TO_WISE",
                "🧭 Idiom - A word to the wise",
                "📌 'A word to the wise is enough':\n" +
                        "🇧🇷 SIGNIFICADO: Para um bom entendedor, meia palavra basta.\n" +
                        "💡 Usado quando uma dica sutil já é suficiente."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_SOME_OTHER_TIME",
                "🧭 Idiom - Maybe some other time",
                "📌 'Maybe some other time':\n" +
                        "🇧🇷 SIGNIFICADO: Fica para a próxima.\n" +
                        "🚫 Usado para recusar um convite de forma educada."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_ONCE_BLUE_MOON",
                "🧭 Idiom - Once in a blue moon",
                "📌 'Once in a blue moon':\n" +
                        "🇧🇷 SIGNIFICADO: Uma vez na vida, outra na morte.\n" +
                        "🔄 Descreve eventos que acontecem MUITO RARAMENTE."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_ONCE_AND_ALL",
                "🧭 Idiom - Once and for all",
                "📌 'Once and for all':\n" +
                        "🇧🇷 SIGNIFICADO: De uma vez por todas.\n" +
                        "✅ Usado para resolver ou encerrar uma questão definitivamente."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_WE_ARE_EVEN",
                "🧭 Idiom - We are even",
                "📌 'We are even':\n" +
                        "🇧🇷 SIGNIFICADO: Estamos quites.\n" +
                        "⚖️ Usado quando dívidas/benefícios entre dois se igualam."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_ROCK_HARD_PLACE",
                "🧭 Idiom - Between a rock and a hard place",
                "📌 'Between a rock and a hard place':\n" +
                        "🇧🇷 SIGNIFICADO: Entre a cruz e a espada.\n" +
                        "😰 Situação difícil com duas opções igualmente ruins."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_JACK_TO_TRADE",
                "🧭 Idiom - Every Jack to his trade",
                "📌 'Every Jack to his trade':\n" +
                        "🇧🇷 SIGNIFICADO: Cada macaco no seu galho.\n" +
                        "🛠️ Cada um deve cuidar do que sabe fazer."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_GRAPEVINE",
                "🧭 Idiom - Heard it through the grapevine",
                "📌 'Heard it through the grapevine':\n" +
                        "🇧🇷 SIGNIFICADO: Um passarinho verde me contou.\n" +
                        "🗣️ Fiquei sabendo por boato, não oficialmente."
        ));

        lista.add(new Flashcard(
                "📘 Expressões Idiomáticas",
                "ING_INTRODUCAO_IDIOM_ACTIONS_SPEAK",
                "🧭 Idiom - Actions speak louder than words",
                "📌 'Actions speak louder than words':\n" +
                        "🇧🇷 SIGNIFICADO: Uma imagem vale mais que mil palavras.\n" +
                        "💪 O que a pessoa faz é mais importante do que o que diz."
        ));

        // Seção 3: Mecanismos Práticos
        lista.add(new Flashcard(
                "📘 Gramática - Pronomes",
                "ING_INTRODUCAO_PRONOME_THEM_FUNCAO",
                "🧭 Pronome THEM",
                "📌 'THEM' é um pronome OBJETO:\n" +
                        "📝 Usado no FINAL da frase (após verbo ou preposição).\n" +
                        "📌 Exemplo: 'I go with THEM.'"
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Classes de Palavras",
                "ING_INTRODUCAO_ADVERBIO_SUFIXO_LY",
                "🧭 Advérbios - Sufixo -LY",
                "📌 Muitos advérbios terminam em -LY:\n" +
                        "📝 Exemplos: simply, newly, slowly.\n" +
                        "🎯 Indica modo: COMO, QUANDO ou ONDE algo acontece."
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Verbos Modais",
                "ING_INTRODUCAO_VERBO_MODAL_CAN",
                "🧭 Verbo Modal - CAN",
                "📌 'CAN' expressa:\n" +
                        "💪 Possibilidade | Habilidade\n" +
                        "📌 Exemplo: 'I CAN swim.' (Eu sei nadar.)"
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Verbos Modais",
                "ING_INTRODUCAO_VERBO_MODAL_MUST",
                "🧭 Verbo Modal - MUST",
                "📌 'MUST' expressa:\n" +
                        "🔒 OBRIGAÇÃO | Necessidade forte\n" +
                        "📌 Exemplo: 'You MUST study.' (Você DEVE estudar.)"
        ));

        lista.add(new Flashcard(
                "📘 Gramática - Artigos",
                "ING_INTRODUCAO_ARTIGOS_A_AN_THE",
                "🧭 Artigos - Diferença",
                "📌 A/AN = ARTIGO INDEFINIDO:\n" +
                        "👉 Não específico (um/uma, qualquer um).\n" +
                        "📌 THE = ARTIGO DEFINIDO:\n" +
                        "👉 Específico (o/a, algo já mencionado ou único)."
        ));

        return lista;
    }
}
