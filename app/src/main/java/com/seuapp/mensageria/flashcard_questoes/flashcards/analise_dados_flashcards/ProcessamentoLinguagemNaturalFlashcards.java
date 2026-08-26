package com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ProcessamentoLinguagemNaturalFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===== VÍDEO 01: CONCEITOS FUNDAMENTAIS =====
        lista.add(new Flashcard(
                "📘 PLN - Conceitos Fundamentais",
                "PLN_DEFINICAO",
                "🧭 O que é PLN?",
                "📌 PLN = IA + Linguística + Computação.\n" +
                        "🎯 Objetivo: Computadores entenderem e gerarem linguagem humana.\n" +
                        "🔄 Diferencial: Aprende com interação (Aprendizado de Máquina).\n" +
                        "💡 Exemplos: Corretores, tradutores, chatbots, assistentes."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Ciladas e Antídotos",
                "PLN_CILADAS",
                "🧭 Erros comuns em provas",
                "📌 Cilada 1: Confundir com programação tradicional.\n" +
                        "✅ Antídoto: Programação normal = Dado + Processamento = Info.\n" +
                        "✅ Antídoto: PLN = Dados + Regras = Modelo que gera novas regras.\n" +
                        "📌 Cilada 2: Humanização = Coloquialismo.\n" +
                        "✅ Antídoto: Humanizar é adaptar ao ambiente (formal/informal).\n" +
                        "📌 Cilada 3: Tudo em TI é IA.\n" +
                        "✅ Antídoto: Só é IA se houver aprendizado/compreensão."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Primeiro Chatbot",
                "PLN_ELISA",
                "🧭 Elisa (1964)",
                "📌 Primeiro chatbot da história.\n" +
                        "⚙️ Abordagem: Baseada em palavras-chave.\n" +
                        "🔄 Abordagem atual: Aprendizado de Máquina.\n" +
                        "💡 A máquina aprende com a interação do usuário."
        ));

        // ===== VÍDEO 02: ASPECTOS DA LINGUAGEM E PRÉ-PROCESSAMENTO =====
        lista.add(new Flashcard(
                "📘 PLN - Pilares da Linguagem",
                "PLN_PILARES",
                "🧭 3 aspectos da comunicação",
                "📌 1️⃣ Fonologia: Sons das palavras (voz/fala).\n" +
                        "📌 2️⃣ Morfologia/Sintaxe: Estrutura da frase.\n" +
                        "📌 3️⃣ Semântica/Pragmática: Significado e contexto.\n" +
                        "⚠️ Cai MUITO em prova! Decore os 3 pilares."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Pré-processamento",
                "PLN_PREPROCESSAMENTO",
                "🧭 Limpeza do texto",
                "📌 O que é: Limpeza e padronização do texto bruto.\n" +
                        "🎯 Objetivo: Remover ruídos, manter relevantes.\n" +
                        "⚠️ REGRA DE OURO: Nunca alterar o sentido original!\n" +
                        "🔧 Ações: Remover acentos, pontuação, emojis, normalizar siglas."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Tokenização",
                "PLN_TOKENIZACAO",
                "🧭 Tarefa 1 - Tokenization",
                "📌 Quebra o texto em unidades menores (tokens).\n" +
                        "🔹 Token pode ser: palavra, frase ou parágrafo.\n" +
                        "🔹 Geralmente separa por espaços ou pontuação.\n" +
                        "📌 Sinônimos: Isolar palavras, segmentação de palavras."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Stemização",
                "PLN_STEMIZACAO",
                "🧭 Tarefa 2 - Stemming",
                "📌 Reduz a palavra ao radical (corte bruto).\n" +
                        "🔹 Remove afixos (prefixos, sufixos).\n" +
                        "🔹 Exemplo: 'correndo' → 'corr'.\n" +
                        "⚠️ Pode gerar palavra que não existe (corte bruto)."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Lematização",
                "PLN_LEMATIZACAO",
                "🧭 Tarefa 3 - Lemmatization",
                "📌 Reduz ao lema (forma base, canônica).\n" +
                        "🔹 Usa dicionário e contexto.\n" +
                        "🔹 Exemplo: 'correndo' → 'correr'.\n" +
                        "✅ Mais precisa que a stemização (etimologia)."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Stem vs Lemmatization",
                "PLN_STEM_LEMA",
                "🧭 Diferença crucial",
                "📌 STEMIZAÇÃO (Stemming): Corte bruto.\n" +
                        "🔹 'correndo' → 'corr' (palavra que não existe).\n" +
                        "📌 LEMATIZAÇÃO (Lemmatization): Mais precisa.\n" +
                        "🔹 'correndo' → 'correr' (verbo infinitivo).\n" +
                        "🔹 'gata/gatos' → 'gato' (masculino singular)."
        ));

        // ===== VÍDEO 03: TAREFAS ADICIONAIS E SEMÂNTICA VETORIAL =====
        lista.add(new Flashcard(
                "📘 PLN - POS Tagging",
                "PLN_POSTAGGING",
                "🧭 Tarefa 4 - Classes Gramaticais",
                "📌 Identifica classe gramatical de cada palavra.\n" +
                        "🔹 Substantivo, verbo, artigo, etc.\n" +
                        "🎯 Ajuda a entender estrutura e sentido da frase.\n" +
                        "📌 Sinônimos: Etiquetagem, Morfologia."
        ));

        lista.add(new Flashcard(
                "📘 PLN - NER",
                "PLN_NER",
                "🧭 Tarefa 5 - Entidades Nomeadas",
                "📌 Identifica e classifica entidades no texto.\n" +
                        "🔹 Pessoas, organizações, locais, datas, valores.\n" +
                        "🎯 Extrai informações significativas.\n" +
                        "📌 Sinônimos: Reconhecimento de entidades."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Stop Words",
                "PLN_STOPWORDS",
                "🧭 Tarefa 6 - Palavras Vazias",
                "📌 Remove palavras com pouco valor semântico.\n" +
                        "🔹 Artigos, preposições, conjunções.\n" +
                        "🔹 Exemplo: 'o', 'a', 'de', 'para', 'e'.\n" +
                        "🎯 Foca nas palavras relevantes, reduz vocabulário."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Hipótese Distributiva",
                "PLN_HIPOTESE_DISTRIBUTIVA",
                "🧭 Fundamento da semântica vetorial",
                "📌 Palavras em contextos semelhantes → significados semelhantes.\n" +
                        "🔹 Exemplo: 'tesguino' (contexto = bebida alcoólica).\n" +
                        "🔹 Máquina deduz significado pelo contexto.\n" +
                        "✅ Base para todo Word Embedding."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Word Embedding",
                "PLN_WORD_EMBEDDING",
                "🧭 Inserção de Palavras",
                "📌 Representa palavras como vetores numéricos.\n" +
                        "🎯 Captura significado e relações semânticas.\n" +
                        "🔹 Palavras semelhantes → vetores próximos.\n" +
                        "📌 Usa matrizes de cocorrência para criar vetores."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Matriz Termo-Documento",
                "PLN_MATRIZ_TD",
                "🧭 Matriz 1 - Termo-Documento",
                "📌 LINHAS = Termos (palavras).\n" +
                        "📌 COLUNAS = Documentos.\n" +
                        "📌 CÉLULA = Frequência do termo no documento.\n" +
                        "📌 Vetores representam documentos.\n" +
                        "✅ Documentos com termos semelhantes = vetores semelhantes."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Matriz Termo-Termo",
                "PLN_MATRIZ_TT",
                "🧭 Matriz 2 - Termo-Termo",
                "📌 LINHAS = Termos (palavras).\n" +
                        "📌 COLUNAS = Termos (palavras).\n" +
                        "📌 CÉLULA = Cocorrência entre palavras.\n" +
                        "🔹 Exemplo: 'gato' e 'miau' cocorrem com frequência.\n" +
                        "⚠️ Mais complexa que a matriz Termo-Documento."
        ));

        // ===== VÍDEO 04: REDUÇÃO, N-GRAMAS E CLASSIFICAÇÃO =====
        lista.add(new Flashcard(
                "📘 PLN - Maldição da Dimensionalidade",
                "PLN_MALDICAO",
                "🧭 O problema das matrizes",
                "📌 Matrizes com muitas dimensões (palavras).\n" +
                        "🔹 Muitos valores zerados (matriz esparsa).\n" +
                        "🔹 Exige alto poder computacional.\n" +
                        "🎯 Solução: Redução de Dimensionalidade."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Redução de Dimensionalidade",
                "PLN_REDUCAO",
                "🧭 PCA e t-SNE",
                "📌 Transforma espaço de alta dimensão em baixa.\n" +
                        "🎯 Simplifica sem perder contexto.\n" +
                        "🔹 PCA (Principal Component Analysis).\n" +
                        "🔹 t-SNE (t-Distributed Stochastic Neighbor).\n" +
                        "⚠️ Cuidado: Reduzir demais perde contexto!"
        ));

        lista.add(new Flashcard(
                "📘 PLN - N-gramas",
                "PLN_NGRAMAS",
                "🧭 Modelos de Linguagem",
                "📌 Sequência de N palavras.\n" +
                        "🔹 Unigrama (1 palavra).\n" +
                        "🔹 Bigrama (2 palavras).\n" +
                        "🔹 Trigrama (3 palavras).\n" +
                        "🎯 Usado em autocompletar, tradutores, corretores.\n" +
                        "🔹 Atribui probabilidades a sequências."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Classificação de Textos",
                "PLN_CLASSIFICACAO",
                "🧭 Atribuir categorias",
                "📌 Supervisionado: Categorias rotuladas (ex: spam).\n" +
                        "📌 Não supervisionado: Identifica padrões.\n" +
                        "🔹 Etapas: Treino → Teste → Produção.\n" +
                        "🎯 Aplicações: Sentimento, spam, tópicos, Netflix."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Bag of Words (BoW)",
                "PLN_BOW",
                "🧭 Saco de Palavras",
                "📌 Conta frequência das palavras no texto.\n" +
                        "🔹 Cria vocabulário.\n" +
                        "🔹 Cada documento = vetor de frequências.\n" +
                        "✅ Simples e eficaz.\n" +
                        "⚠️ Desvantagem: Perde o contexto (ordem das palavras)."
        ));

        lista.add(new Flashcard(
                "📘 PLN - TF-IDF",
                "PLN_TFIDF",
                "🧭 Term Frequency - Inverse",
                "📌 Avalia importância real da palavra.\n" +
                        "🔹 Palavra muito frequente → Peso menor.\n" +
                        "🔹 Palavra rara → Peso maior.\n" +
                        "🎯 Identifica termos importantes para o contexto.\n" +
                        "✅ Ajusta a frequência pela relevância."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Análise de Sentimento",
                "PLN_SENTIMENTO",
                "🧭 Identificar emoções",
                "📌 Positivo / Negativo / Neutro.\n" +
                        "🔹 Divide em partes, atribui pontuação.\n" +
                        "🔹 Pode ser por polaridade, escala ou elementos.\n" +
                        "🎯 Netflix: Personaliza capas por perfil.\n" +
                        "📌 Granularidade baixa = mais detalhada."
        ));

        // ===== VÍDEO 05: RESOLUÇÃO DE QUESTÕES =====
        lista.add(new Flashcard(
                "📘 PLN - Stop Words em Prova",
                "PLN_STOP_QUESTAO",
                "🧭 Stopwords: pouco valor",
                "📌 Exemplo: 'O acesso ao auditório também pode...'\n" +
                        "🔹 Removendo: 'O', 'ao', 'também', 'de', 'uma'.\n" +
                        "🔹 Resultado: 'Acesso auditório pode ser feito...'\n" +
                        "✅ Função remove Stop Words.\n" +
                        "⚠️ Não identifica finais de texto!"
        ));

        lista.add(new Flashcard(
                "📘 PLN - TF-IDF em Prova",
                "PLN_TFIDF_QUESTAO",
                "🧭 Questão sobre frequência",
                "📌 Palavra 'amor' em 10 livros.\n" +
                        "🔹 Aparece 1 vez no último.\n" +
                        "🔹 Aparece em todos os 10 livros.\n" +
                        "⚠️ NÃO dá para calcular TF-IDF só com isso!\n" +
                        "✅ Falta: total de palavras, frequência nos outros."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Polissemia",
                "PLN_POLISSEMIA",
                "🧭 Múltiplos significados",
                "📌 Desafio: Palavra com mais de um sentido.\n" +
                        "🔹 Exemplo: 'Manga' (fruta/parte da camisa/zombar).\n" +
                        "🔹 Depende do contexto para interpretar.\n" +
                        "✅ É um dos maiores desafios do PLN."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Reconhecimento de Voz",
                "PLN_VOZ_QUESTAO",
                "🧭 Transcrição de áudio",
                "📌 Não é processo direto!\n" +
                        "🔹 SEMPRE usa modelos intermediários.\n" +
                        "🔹 Modelos acústicos e de linguagem.\n" +
                        "⚠️ Não é 'mágica' - tem modelo por trás."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Stem vs Lematização em Prova",
                "PLN_STEM_LEMA_QUESTAO",
                "🧭 Etimologia",
                "📌 Questão: 'Stemming encontra etimologia'.\n" +
                        "⚠️ ERRADO! Quem busca etimologia = LEMATIZAÇÃO.\n" +
                        "✅ Stemização = corte bruto ('correndo' → 'corr').\n" +
                        "✅ Lematização = forma base ('correndo' → 'correr')."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Análise de Sentimento Social",
                "PLN_SENTIMENTO_SOCIAL",
                "🧭 Monitoramento em tempo real",
                "📌 Analisa reações sem hashtag.\n" +
                        "🔹 Processa comentários em português.\n" +
                        "🔹 Identifica, filtra e analisa.\n" +
                        "✅ Exemplo: COVID-19 direcionava para info oficial."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Os 3 Pilares em Prova",
                "PLN_PILARES_QUESTAO",
                "🧭 Questão clássica",
                "📌 Opção correta: Som (Fonologia).\n" +
                        "📌 Estrutura (Morfologia/Sintaxe).\n" +
                        "📌 Significado (Semântica/Pragmática).\n" +
                        "⚠️ Cuidado: Áudio, conversação, chatbot = distratores!"
        ));

        lista.add(new Flashcard(
                "📘 PLN - Bag of Words em Prova",
                "PLN_BOW_QUESTAO",
                "🧭 O que NÃO é BoW?",
                "📌 BoW = vetor de frequência de palavras.\n" +
                        "⚠️ NÃO reduz a radicais (quem faz é Stemming/Lemmatização).\n" +
                        "✅ BoW conta ocorrências no texto.\n" +
                        "📌 Exemplo: 'O rato roeu a roupa' → vetor de contagem."
        ));

        lista.add(new Flashcard(
                "📘 PLN - Resumo de Bolso",
                "PLN_RESUMO_GERAL",
                "🧭 Tudo que cai em prova",
                "📌 DEFINIÇÃO: PLN = IA + Linguística + Computação.\n" +
                        "📌 3 PILARES: Fonologia, Morfologia/Sintaxe, Semântica/Pragmática.\n" +
                        "📌 TAREFAS: Tokenização, Stemização, Lematização, POS, NER, Stop.\n" +
                        "📌 FUNDAMENTO: Hipótese Distributiva (contexto define significado).\n" +
                        "📌 MATRIZES: Termo-Documento e Termo-Termo.\n" +
                        "📌 CLASSIFICAÇÃO: BoW (frequência), TF-IDF (importância)."
        ));


        return lista;
    }
}
