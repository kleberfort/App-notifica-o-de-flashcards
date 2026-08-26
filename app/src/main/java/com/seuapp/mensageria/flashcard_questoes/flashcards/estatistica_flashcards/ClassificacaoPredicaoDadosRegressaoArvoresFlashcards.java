package com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ClassificacaoPredicaoDadosRegressaoArvoresFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===== VÍDEO 01 - CONCEITOS GERAIS E PREMISSAS =====

        lista.add(new Flashcard(
                "📘 ML - Conceitos Gerais",
                "CLASSIFICACAO_PREDICAO_DADOS_SUPERVISIONADO_DEFINICAO",
                "🧭 Definição Essencial",
                "📌 APRENDIZADO SUPERVISIONADO: Máquina observa dados ROTULADOS.\n" +
                        "🔄 Processo: Dados de entrada → Extrai regras → Constrói modelo → Faz predições."
        ));

        lista.add(new Flashcard(
                "📘 ML - Conceitos Gerais",
                "CLASSIFICACAO_PREDICAO_DADOS_PREMISSAS_MATEMATICAS",
                "🧭 Premissas dos Algoritmos",
                "📌 Cada algoritmo parte de uma premissa matemática DIFERENTE.\n" +
                        "🔹 GEOMÉTRICA: Baseada em distâncias (ex: KNN).\n" +
                        "🔹 PROBABILÍSTICA: Baseada em probabilidades (ex: Naive Bayes).\n" +
                        "🔹 BASEADA EM DADOS: Extrai padrões da estrutura dos dados."
        ));

        lista.add(new Flashcard(
                "📘 ML - Conceitos Gerais",
                "CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_VS_ALGORITMO",
                "🧭 Diferença Fundamental",
                "📌 FUNÇÃO (Modelo): f(x) = ax² + bx + c. É o RESULTADO final.\n" +
                        "⚙️ ALGORITMO: Método que ENCONTRA os parâmetros da função (a, b, c)."
        ));

        lista.add(new Flashcard(
                "📘 ML - Conceitos Gerais",
                "CLASSIFICACAO_PREDICAO_DADOS_NAO_EXISTE_UNIVERSAL",
                "🧭 Principio Fundamental",
                "📌 NÃO EXISTE uma função universal que se adeque a TODOS os casos.\n" +
                        "📌 Cada algoritmo tem sua própria simplificação da realidade."
        ));

        lista.add(new Flashcard(
                "📘 ML - Mecanismos",
                "CLASSIFICACAO_PREDICAO_DADOS_IDENTIFICAR_TIPO_DADO",
                "🧭 Passo a Passo para Prova",
                "📌 1º: Identifique o tipo de dado de entrada (imagem, numérico, texto...).\n" +
                        "📌 2º: Verifique se os dados são ROTULADOS (supervisionado) ou NÃO (não supervisionado)."
        ));

        lista.add(new Flashcard(
                "📘 ML - Ciladas",
                "CLASSIFICACAO_PREDICAO_DADOS_SUPERVISIONADO_VS_NAO",
                "🧭 Como Identificar",
                "📌 CILADA: Confundir supervisionado com não supervisionado.\n" +
                        "🛡️ ANTÍDOTO: Pergunte: 'Os dados têm RÓTULO associado?'.\n" +
                        "✅ Ex: 'Imagem + diagnóstico' = SUPERVISIONADO."
        ));

        lista.add(new Flashcard(
                "📘 ML - Ciladas",
                "CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_VS_ALGORITMO_CILADA",
                "🧭 Como Diferenciar",
                "📌 CILADA: Confundir função com algoritmo.\n" +
                        "🛡️ ANTÍDOTO: Função é o modelo final; Algoritmo é o método que encontra os parâmetros.\n" +
                        "✅ Ex: 'Regressão Linear' = ALGORITMO; 'f(x)=2x+3' = FUNÇÃO."
        ));

        lista.add(new Flashcard(
                "📘 ML - Revisão",
                "CLASSIFICACAO_PREDICAO_DADOS_O_QUE_E_SUPERVISIONADO",
                "🧭 Definição Chave",
                "📌 O que caracteriza o aprendizado supervisionado?\n" +
                        "✅ Dados ROTULADOS (associados a informações) que permitem à máquina extrair regras e fazer predições."
        ));

        lista.add(new Flashcard(
                "📘 ML - Revisão",
                "CLASSIFICACAO_PREDICAO_DADOS_FUNCAO_DO_ALGORITMO",
                "🧭 Pergunta Clássica",
                "📌 Qual a função do algoritmo no aprendizado de máquina?\n" +
                        "✅ Encontrar os PARÂMETROS da função que melhor se ajusta aos dados observados."
        ));

        lista.add(new Flashcard(
                "📘 ML - Revisão",
                "CLASSIFICACAO_PREDICAO_DADOS_EXISTE_ALGORITMO_UNIVERSAL",
                "🧭 Verdade Fundamental",
                "📌 Existe um algoritmo universal que se adequa a todos os casos?\n" +
                        "✅ NÃO. Cada algoritmo tem sua própria premissa e se adequa melhor a casos específicos."
        ));

        lista.add(new Flashcard(
                "📘 ML - Resumo",
                "CLASSIFICACAO_PREDICAO_DADOS_MACETES_MESTRE",
                "🧭 Macetes Mestres",
                "📌 SUPERVISIONADO = Dados ROTULADOS = Máquina aprende com exemplos prontos.\n" +
                        "📌 FUNÇÃO = Modelo final | ALGORITMO = Método para encontrar os parâmetros.\n" +
                        "📌 Premissas: Geométrica, Probabilística, Teoria da Informação.\n" +
                        "📌 NÃO EXISTE algoritmo universal para todos os casos."
        ));

        // ===== VÍDEO 04 - KNN (K-VIZINHOS MAIS PRÓXIMOS) =====

        lista.add(new Flashcard(
                "📊 KNN - Conceito",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_DEFINICAO",
                "🧭 Ideia Central",
                "📌 Um dado é classificado pelo RÓTULO de seus K vizinhos geometricamente mais próximos.\n" +
                        "🔹 PREMISSA: Amostras semelhantes ficam próximas no espaço."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Funcionamento",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_PREDICAO",
                "🧭 Como Faz a Predição",
                "📌 CLASSIFICAÇÃO: Votação majoritária (moda) entre os K vizinhos.\n" +
                        "📈 REGRESSÃO: Média aritmética dos valores dos K vizinhos."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Métricas",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_DISTANCIAS",
                "🧭 Principais Métricas",
                "📌 EUCLIDIANA: Menor distância (linha reta) = √(Σ(xᵢ-yᵢ)²).\n" +
                        "📌 MANHATTAN: Soma das diferenças absolutas = Σ|xᵢ-yᵢ|.\n" +
                        "📌 COSSENO: Mede SIMILARIDADE por ângulo (NÃO é distância!)."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Hiperparâmetro K",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_EQUILIBRIO",
                "🧭 Bias-Variance Trade-off",
                "📌 K BAIXO (ex: K=1) = OVERFITTING (alta variância, decora os dados).\n" +
                        "📌 K ALTO (ex: K=todos) = UNDERFITTING (alto viés, prevê classe majoritária)."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Características",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_NAO_PARAMETRICO",
                "🧭 Pontos-Chave",
                "📌 SUPERVISIONADO e NÃO PARAMÉTRICO (não aprende pesos, só armazena dados).\n" +
                        "📌 Faz INFERÊNCIA POR TRANSUÇÃO (recalcula distâncias para cada novo dado)."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Ciladas",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_CILADAS",
                "🧭 Armadilhas Comuns",
                "📌 KNN é NÃO PARAMÉTRICO (não aprende pesos).\n" +
                        "📌 Atributos irrelevantes PREJUDICAM o KNN.\n" +
                        "📌 Similaridade de cosseno NÃO É DISTÂNCIA.\n" +
                        "📌 KNN faz TRANSUÇÃO, NÃO indução."
        ));

        lista.add(new Flashcard(
                "📊 KNN - Revisão",
                "CLASSIFICACAO_PREDICAO_DADOS_KNN_REVISAO",
                "🧭 Macetes Mestres",
                "📌 KNN = GEOMETRIA + PROXIMIDADE.\n" +
                        "📌 K pequeno = overfitting | K grande = underfitting.\n" +
                        "📌 KNN NÃO aprende parâmetros.\n" +
                        "📌 Euclidiana = Pitágoras; Manhattan = soma sem raiz; Cosseno = ângulo."
        ));

        // ===== VÍDEO 05 - ÁRVORES DE DECISÃO =====

        lista.add(new Flashcard(
                "🌳 Árvores de Decisão",
                "CLASSIFICACAO_PREDICAO_DADOS_ARVORE_CONCEITO",
                "🧭 Definição e Estrutura",
                "📌 Grafo hierárquico com NÓS (critérios) e ARESTAS (resultados dos testes).\n" +
                        "🟢 PRINCIPAL VANTAGEM: Alta interpretabilidade (modelo transparente e explicável)."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores de Decisão",
                "CLASSIFICACAO_PREDICAO_DADOS_ARVORE_INDUCAO",
                "🧭 Tipo de Aprendizado",
                "📌 SUPERVISIONADO, NÃO PARAMÉTRICO (estrutura definida no treinamento).\n" +
                        "📌 Faz INFERÊNCIA POR INDUÇÃO (constrói um modelo e generaliza para novos dados)."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores - Critérios",
                "CLASSIFICACAO_PREDICAO_DADOS_ID3_C4.5_CART",
                "🧭 Algoritmos e seus Critérios",
                "📌 ID3 → Ganho de Informação (Entropia / Desordem).\n" +
                        "📌 C4.5 → Razão de Ganho de Informação (penaliza atributos com muitos valores).\n" +
                        "📌 CART → Índice de Gini (Impureza / Pureza) e árvores BINÁRIAS."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores - Limitações",
                "CLASSIFICACAO_PREDICAO_DADOS_ID3_NUMERICO",
                "🧭 Diferenças Cruciais",
                "📌 ID3 NÃO lida com dados numéricos ou faltantes (precisa discretizar).\n" +
                        "📌 C4.5 e CART lidam com dados numéricos automaticamente."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores - Overfitting",
                "CLASSIFICACAO_PREDICAO_DADOS_ARVORE_PODA",
                "🧭 Como Evitar Overfitting",
                "📌 Árvores tendem a OVERFITTING por sua alta flexibilidade.\n" +
                        "✂️ SOLUÇÃO: Poda (remover ramos com pouco impacto) – C4.5 e CART realizam."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores - Ciladas",
                "CLASSIFICACAO_PREDICAO_DADOS_ARVORE_CILADAS",
                "🧭 Armadilhas Comuns",
                "📌 Árvore NÃO é probabilística (isso é Naive Bayes).\n" +
                        "📌 Árvore DEPENDE fortemente dos dados (tende a overfitting).\n" +
                        "📌 Árvore = INDUÇÃO (NÃO transdução).\n" +
                        "📌 Entropia = ID3; Gini = CART; Razão de Ganho = C4.5."
        ));

        lista.add(new Flashcard(
                "🌳 Árvores - Revisão",
                "CLASSIFICACAO_PREDICAO_DADOS_ARVORE_REVISAO",
                "🧭 Macetes Mestres",
                "📌 Árvore = GRAFO hierárquico = nós + arestas.\n" +
                        "📌 Vantagem principal = INTERPRETABILIDADE (modelo explicável).\n" +
                        "📌 ID3 = Entropia + Ganho de Informação.\n" +
                        "📌 C4.5 = Razão de Ganho + Poda.\n" +
                        "📌 CART = Gini + Árvore Binária + Regressão."
        ));

        // ===== VÍDEO 06 - NAIVE BAYES =====

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_BAYES_CONCEITO",
                "🧭 Classificador Probabilístico",
                "📌 Baseado no TEOREMA DE BAYES: P(A|B) = P(B|A) * P(A) / P(B).\n" +
                        "📌 'NAIVE' (Ingênuo) = Assume independência condicional entre os atributos."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_SPAM",
                "🧭 Aplicação Clássica",
                "📌 FILTRO DE SPAM: Classifica e-mails como spam ou não-spam.\n" +
                        "📌 Calcula a probabilidade de uma classe dado um conjunto de palavras."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_CALCULO",
                "🧭 Como Calcular a Probabilidade",
                "📌 P(Classe) → Frequência da classe no total de dados.\n" +
                        "📌 P(Atributo|Classe) → Frequência do atributo na classe / total de atributos na classe.\n" +
                        "📌 MULTIPLIQUE: P(Classe) × Π P(Atributoᵢ|Classe)."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_DENOMINADOR",
                "🧭 Macete de Cálculo",
                "📌 O denominador P(B) (evidência) é o MESMO para todas as classes.\n" +
                        "📌 Por isso, pode ser IGNORADO na hora de COMPARAR as probabilidades!"
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_VANTAGENS",
                "🧭 Vantagens e Desvantagens",
                "📌 VANTAGENS: Simples, rápido, bom em alta dimensionalidade.\n" +
                        "📌 DESVANTAGENS: Hipótese de independência geralmente falsa.\n" +
                        "📌 Sensível a atributos irrelevantes."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_CILADAS",
                "🧭 Armadilhas Comuns",
                "📌 Naive Bayes é SUPERVISIONADO (NÃO é clusterização).\n" +
                        "📌 Assume INDEPENDÊNCIA condicional.\n" +
                        "📌 É PROBABILÍSTICO (NÃO baseado em distância).\n" +
                        "📌 Palavra-chave: SPAM ou 'ingênuo'."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_REVISAO",
                "🧭 Macetes Mestres",
                "📌 Naive Bayes = BAYES + INDEPENDÊNCIA.\n" +
                        "📌 'Naive' = Assume independência entre atributos.\n" +
                        "📌 Fórmula: P(A|B) = P(B|A) × P(A) / P(B).\n" +
                        "📌 Classificação: Escolhe a classe com MAIOR probabilidade."
        ));

        // ===== VÍDEO 07 - NAIVE BAYES - QUESTÕES =====

        lista.add(new Flashcard(
                "📊 Naive Bayes - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_CARACT",
                "🧭 Características em Prova",
                "📌 Abordagem PROBABILÍSTICA (Teorema de Bayes).\n" +
                        "📌 SUPERVISIONADO (classificação com dados rotulados).\n" +
                        "📌 Hipótese: INDEPENDÊNCIA CONDICIONAL.\n" +
                        "📌 Aplicação clássica: FILTRO DE SPAM."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_PALAVRAS",
                "🧭 Palavras-Chave em Prova",
                "📌 'Ingênuo' / 'Naive' → NAIVE BAYES.\n" +
                        "📌 'Probabilístico' → NAIVE BAYES.\n" +
                        "📌 'Teorema de Bayes' → NAIVE BAYES.\n" +
                        "📌 'Spam' / 'Filtro de spam' → NAIVE BAYES."
        ));

        lista.add(new Flashcard(
                "📊 Naive Bayes - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_NAIVE_QUEST_CALCULO",
                "🧭 Cálculo em Prova",
                "📌 P(Classe) = exemplos da classe / total de exemplos.\n" +
                        "📌 P(Atributo|Classe) = ocorrências do atributo na classe / total de atributos na classe.\n" +
                        "📌 MULTIPLIQUE: P(Classe) × P(Atributo₁|Classe) × P(Atributo₂|Classe)..."
        ));

        // ===== VÍDEO 08 - REGRESSÃO LINEAR =====

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_CONCEITO",
                "🧭 Modelo Supervisionado",
                "📌 Prever VALOR CONTÍNUO (ex: preço, temperatura).\n" +
                        "📌 É SUPERVISIONADO, PARAMÉTRICO (coeficientes β₀, β₁ fixos)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_EQUACAO",
                "🧭 Fórmula Fundamental",
                "📌 SIMPLES: Ŷ = β₀ + β₁·X.\n" +
                        "📌 MÚLTIPLA: Ŷ = β₀ + β₁·X₁ + β₂·X₂ + ... + βₙ·Xₙ.\n" +
                        "📌 β₁ = Cov(X,Y) / Var(X) e β₀ = Ȳ - β₁·X̄."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_MINIMOS_QUADRADOS",
                "🧭 Método de Estimação",
                "📌 Mínimos Quadrados: minimiza a SOMA DOS QUADRADOS DOS RESÍDUOS.\n" +
                        "📌 Erro (Resíduo): ε = Y (real) - Ŷ (predito)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_INTERPRETACAO",
                "🧭 Interpretação dos Coeficientes",
                "📌 β₁ > 0 = Relação POSITIVA (X aumenta, Y aumenta).\n" +
                        "📌 β₁ < 0 = Relação NEGATIVA (X aumenta, Y diminui).\n" +
                        "📌 β₀ = Valor de Y quando X = 0 (intercepto)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_MULTICOLINEARIDADE",
                "🧭 Problema na Múltipla",
                "📌 Ocorre quando preditores têm RELAÇÃO LINEAR entre si.\n" +
                        "📌 Consequência: coeficientes ficam INSTÁVEIS (modelo não confiável)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_CORRELACAO",
                "🧭 Correlação vs Causalidade",
                "📌 CORRELAÇÃO ≠ CAUSALIDADE!\n" +
                        "📌 Correlação mede relacionamento linear.\n" +
                        "📌 Causalidade mede relação de causa e efeito."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_CILADAS",
                "🧭 Armadilhas Comuns",
                "📌 Regressão é SUPERVISIONADO (NÃO é não supervisionado).\n" +
                        "📌 Mínimos Quadrados minimiza SOMA DOS QUADRADOS dos erros.\n" +
                        "📌 Resíduo = Y - Ŷ (NÃO o contrário).\n" +
                        "📌 Correlação NÃO implica causalidade."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_REVISAO",
                "🧭 Macetes Mestres",
                "📌 Regressão = SUPERVISIONADO + PARAMÉTRICO + LINEAR.\n" +
                        "📌 Ŷ = β₀ + β₁·X (simples) ou Ŷ = β₀ + β₁·X₁ + ... (múltipla).\n" +
                        "📌 β₁ = Cov(X,Y) / Var(X).\n" +
                        "📌 β₀ = Ȳ - β₁·X̄.\n" +
                        "📌 Resíduo ε = Y - Ŷ."
        ));

        // ===== VÍDEO 09 - REGRESSÃO LINEAR - QUESTÕES =====

        lista.add(new Flashcard(
                "📈 Regressão Linear - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_CARACT",
                "🧭 Características em Prova",
                "📌 SUPERVISIONADO (possui variável target).\n" +
                        "📌 Objetivo: PREVER valores contínuos.\n" +
                        "📌 PARAMÉTRICO (coeficientes fixos)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_PALAVRAS",
                "🧭 Palavras-Chave em Prova",
                "📌 'Prever valor' → REGRESSÃO.\n" +
                        "📌 'Valor contínuo' → REGRESSÃO.\n" +
                        "📌 'Classificar' → CLASSIFICAÇÃO.\n" +
                        "📌 'Cluster / agrupar' → AGRUPAMENTO."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Linear - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RL_QUEST_ALGORITMOS",
                "🧭 Algoritmos e suas Funções",
                "📌 Regressão Linear = SÓ regressão.\n" +
                        "📌 KNN, SVM, Árvores = podem fazer AMBOS (classificação e regressão).\n" +
                        "📌 Naive Bayes = SÓ classificação.\n" +
                        "📌 Agnes, K-Means = SÓ agrupamento."
        ));

        // ===== VÍDEO 10 - REGRESSÃO LOGÍSTICA =====

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_CONCEITO",
                "🧭 Classificador Probabilístico",
                "📌 É um algoritmo de CLASSIFICAÇÃO (apesar do nome 'regressão').\n" +
                        "📌 Retorna a PROBABILIDADE de um dado pertencer a uma classe (valor entre 0 e 1)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_SIGMOIDE",
                "🧭 Função Sigmóide",
                "📌 Fórmula: P = 1 / (1 + e^(-(β₁·X + β₀))).\n" +
                        "📌 Saída é uma curva em 'S' e o LIMIAR PADRÃO é 50%."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_VEROSSIMILHANCA",
                "🧭 Método de Estimação",
                "📌 REGRESSÃO LINEAR → Mínimos Quadrados.\n" +
                        "📌 REGRESSÃO LOGÍSTICA → MÁXIMA VEROSSIMILHANÇA."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_TIPOS",
                "🧭 Tipos de Classificação",
                "📌 BINÁRIA: 2 classes (ex: Sim/Não).\n" +
                        "📌 MULTINOMIAL: 3+ classes SEM ordem (ex: Suco/Refri/Água).\n" +
                        "📌 ORDINAL: 3+ classes COM ordem (ex: Insatisfeito/Neutro/Satisfeito)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_PROPRIEDADES",
                "🧭 Propriedades Úteis",
                "📌 e^(ln(a)) = a (cancelamento entre e e ln).\n" +
                        "📌 ln(e^a) = a.\n" +
                        "📌 P = 1/(1+e^(-z)) → P ≥ 0,5 = SIM; P < 0,5 = NÃO."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_CILADAS",
                "🧭 Armadilhas Comuns",
                "📌 Regressão Logística faz CLASSIFICAÇÃO (NÃO regressão).\n" +
                        "📌 Usa MÁXIMA VEROSSIMILHANÇA (NÃO mínimos quadrados).\n" +
                        "📌 Entrada deve ser NUMÉRICA (NÃO categórica).\n" +
                        "📌 É SUPERVISIONADO (NÃO é não supervisionado)."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_REVISAO",
                "🧭 Macetes Mestres",
                "📌 Regressão Logística = CLASSIFICAÇÃO + PROBABILIDADE + SIGMOIDE.\n" +
                        "📌 Fórmula: P = 1/(1 + e^(-(β₁X + β₀))).\n" +
                        "📌 Saída: Valor entre 0 e 1 (probabilidade).\n" +
                        "📌 Decisão: P ≥ 50% → SIM; P < 50% → NÃO.\n" +
                        "📌 Estima parâmetros: MÁXIMA VEROSSIMILHANÇA."
        ));

        // ===== VÍDEO 11 - REGRESSÃO LOGÍSTICA - QUESTÕES =====

        lista.add(new Flashcard(
                "📈 Regressão Logística - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_CARACT",
                "🧭 Características em Prova",
                "📌 Tipo de problema: CLASSIFICAÇÃO.\n" +
                        "📌 Saída: PROBABILIDADE entre 0 e 1.\n" +
                        "📌 Decisão: Limiar ≥ 50% → SIM; < 50% → NÃO.\n" +
                        "📌 Função base: SIGMOIDE."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_PALAVRAS",
                "🧭 Palavras-Chave em Prova",
                "📌 'Intervalo numérico de 0 a 1' → REGRESSÃO LOGÍSTICA.\n" +
                        "📌 'Probabilidade' → REGRESSÃO LOGÍSTICA.\n" +
                        "📌 'Classificação binária' → REGRESSÃO LOGÍSTICA.\n" +
                        "📌 'Sigmoide' / 'Logística' → REGRESSÃO LOGÍSTICA."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_COMPARATIVO",
                "🧭 Comparativo com Regressão Linear",
                "📌 REGRESSÃO LINEAR: Problema de REGRESSÃO, saída contínua.\n" +
                        "📌 REGRESSÃO LOGÍSTICA: Problema de CLASSIFICAÇÃO, saída 0-1.\n" +
                        "📌 LINEAR: Mínimos Quadrados.\n" +
                        "📌 LOGÍSTICA: Máxima Verossimilhança."
        ));

        lista.add(new Flashcard(
                "📈 Regressão Logística - Questões",
                "CLASSIFICACAO_PREDICAO_DADOS_RLOG_QUEST_CILADAS",
                "🧭 Armadilhas em Prova",
                "📌 'Regressão logística faz regressão' → ERRADO (faz CLASSIFICAÇÃO).\n" +
                        "📌 'Usa mínimos quadrados' → ERRADO (usa MÁXIMA VEROSSIMILHANÇA).\n" +
                        "📌 'Entrada categórica' → ERRADO (entrada NUMÉRICA).\n" +
                        "📌 'Retorna classe diretamente' → ERRADO (retorna PROBABILIDADE)."
        ));

        return  lista;
    }
}