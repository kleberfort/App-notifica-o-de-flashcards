package com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class OverfittingUnderfittingValidacaoCruzadaFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();
        // ===== VÍDEO 01: APRENDIZADO SUPERVISIONADO =====
        lista.add(new Flashcard(
                "📘 Machine Learning - Conceitos Fundamentais",
                "IA_VS_ML",
                "🧭 Aprendizado de Máquina - Base",
                "📌 IA é o GÊNERO (pensar/agir), ML é a ESPÉCIE (aprender com dados).\n\n" +

                        "🤖 IA Simbólica: Humano insere conhecimento (regras/símbolos).\n" +
                        "📊 Machine Learning: Máquina APRENDE sozinha a partir de dados.\n" +
                        "🔑 ML: observa → constrói modelo → generaliza (faz predições).\n\n" +

                        "💡 Exemplo:\n" +
                        "🤖 IA Simbólica:\n" +
                        "Se temperatura > 38°C → paciente com febre.\n\n" +
                        "📊 Machine Learning:\n" +
                        "Recebe milhares de pacientes (temperatura, idade, sintomas e diagnóstico).\n" +
                        "Depois, prevê o diagnóstico de um novo paciente.\n\n" +

                        "🔎 Como ler o exemplo:\n" +
                        "➡️ Na IA Simbólica, a regra foi criada por um especialista.\n" +
                        "➡️ No Machine Learning, a máquina descobre os padrões analisando os exemplos.\n" +
                        "➡️ Depois do treinamento, consegue fazer previsões para novos casos."
        ));

        lista.add(new Flashcard(
                "📘 Aprendizado Supervisionado",
                "SUPERVISIONADO_DEF",
                "🧭 Supervisionado - Mecanismo",
                "📌 SUPERVISIONADO = dados ROTULADOS por especialista.\n\n" +

                        "📥 Dados de entrada (atributos) + 📤 Saída esperada (rótulo).\n" +
                        "🎯 Objetivo: aprender a regra para PREVER novas associações.\n\n" +

                        "💡 Exemplo:\n" +
                        "🏠 Casa A: 80 m², 2 quartos → R$ 300.000\n" +
                        "🏠 Casa B: 120 m², 3 quartos → R$ 500.000\n" +
                        "🏠 Nova casa: 100 m², 3 quartos → ?\n\n" +

                        "🔎 Como ler o exemplo:\n" +
                        "➡️ As duas primeiras casas já possuem o preço (rótulo).\n" +
                        "➡️ O algoritmo aprende a relação entre características e preço.\n" +
                        "➡️ Quando recebe uma nova casa sem preço, consegue estimar seu valor."
        ));

        lista.add(new Flashcard(
                "📘 Regressão vs Classificação",
                "REGRESSAO_CLASSIFICACAO",
                "🧭 Tarefas do Supervisionado",
                "📌 REGRESSÃO: saída é NÚMERO (variável quantitativa).\n" +
                        "🔢 Ex: Prever preço (R$), temperatura (25°C).\n" +
                        "📌 CLASSIFICAÇÃO: saída é CATEGORIA (variável qualitativa).\n" +
                        "🏷️ Ex: 'Spam' ou 'Não Spam', 'Saudável' ou 'Doente'."
        ));

        lista.add(new Flashcard(
                "📘 Variáveis - Classificação Detalhada",
                "VARIAVEIS_TIPOS",
                "🧭 Tipos de Variáveis - Análise",
                "📌 QUANTITATIVA (NÚMERO):\n" +
                        "🔹 Discreta: inteiros (1, 2, 3) → contar itens.\n" +
                        "🔸 Contínua: decimais (3.14, 75.49) → medidas.\n" +
                        "📌 QUALITATIVA (PALAVRA):\n" +
                        "🏷️ Nominal: sem ordem (cor do cabelo).\n" +
                        "📊 Ordinal: com ordem (nível de satisfação)."
        ));

        // ===== VÍDEO 02: APRENDIZADO NÃO SUPERVISIONADO =====
        lista.add(new Flashcard(
                "📘 Aprendizado Não Supervisionado",
                "NAO_SUPERVISIONADO",
                "🧭 Não Supervisionado - Definição",
                "📌 Dados NÃO ROTULADOS (sem saída esperada).\n" +
                        "🔍 Objetivo: DESCOBRIR PADRÕES e estruturas ocultas.\n" +
                        "🔄 Comparação: Supervisionado = orientado a TAREFA.\n" +
                        "🔎 Não Supervisionado = orientado a DADOS."
        ));

        lista.add(new Flashcard(
                "📘 5 Atividades do Não Supervisionado",
                "ATIVIDADES_NAO_SUPERV",
                "🧭 Atividades Essenciais",
                "📌 1️⃣ CLUSTERIZAÇÃO: agrupar dados similares (ex: perfis).\n" +
                        "🔧 Técnicas: K-Means, AGNES, DIANA, DBSCAN, Gaussian Mixture Models (GMM).\n" +
                        "💡 Exemplo: alunos são agrupados automaticamente em 'alto', 'médio' e 'baixo' desempenho.\n" +
                        "👀 Como ler: o algoritmo encontrou grupos parecidos sem receber rótulos.\n\n" +

                        "📌 2️⃣ REDUÇÃO DIMENSIONAL: simplificar atributos (ex: PCA).\n" +
                        "🔧 Técnicas: PCA, t-SNE, UMAP, Autoencoders, ICA.\n" +
                        "💡 Exemplo: uma planilha com 100 características de clientes é reduzida para apenas 5 variáveis principais.\n" +
                        "👀 Como ler: as informações são resumidas em menos dimensões, preservando a maior parte do conteúdo.\n\n" +

                        "📌 3️⃣ DETECÇÃO DE ANOMALIAS: identificar outliers (ex: fraudes).\n" +
                        "🔧 Técnicas: Isolation Forest, One-Class SVM, Local Outlier Factor (LOF), DBSCAN.\n" +
                        "💡 Exemplo: entre milhares de compras abaixo de R$500, surge uma compra de R$50.000.\n" +
                        "👀 Como ler: esse registro foge do comportamento normal e pode indicar fraude ou erro.\n\n" +

                        "📌 4️⃣ APRENDIZADO DE REPRESENTAÇÃO: descobrir características importantes automaticamente.\n" +
                        "🔧 Técnicas: Autoencoders, Deep Belief Networks (DBN), Restricted Boltzmann Machines (RBM), Word2Vec.\n" +
                        "💡 Exemplo: ao analisar imagens de gatos e cachorros, o algoritmo aprende que formato das orelhas e do focinho são características importantes.\n" +
                        "👀 Como ler: o modelo aprende sozinho quais atributos representam melhor os dados.\n\n" +

                        "📌 5️⃣ REGRAS DE ASSOCIAÇÃO: descobrir itens que aparecem juntos.\n" +
                        "🔧 Técnicas: Apriori, FP-Growth, Eclat.\n" +
                        "💡 Exemplo: clientes que compram pão também costumam comprar manteiga.\n" +
                        "👀 Como ler: o algoritmo encontra padrões frequentes de coocorrência entre itens."
        ));

        lista.add(new Flashcard(
                "📘 Clusterização e Regras de Associação",
                "CLUSTERIZACAO_ASSOCIACAO",
                "🧭 Aplicações Práticas - Destaque",
                "📌 CLUSTERIZAÇÃO: 'agrupar', 'segmentar', 'dividir em grupos'.\n" +
                        "🛒 Ex: agrupar clientes por perfil de compra.\n" +
                        "📌 REGRAS DE ASSOCIAÇÃO: 'quem compra X também compra Y'.\n" +
                        "🛍️ Ex: 'fralda + leite → chupeta' (market basket analysis)."
        ));

        // ===== VÍDEO 03: QUESTÕES COMENTADAS =====
        lista.add(new Flashcard(
                "📘 Hierarquia IA - ML - Deep Learning",
                "HIERARQUIA_IA",
                "🧭 Relação entre Conceitos",
                "📌 1️⃣ INTELIGÊNCIA ARTIFICIAL (IA): campo mais amplo.\n" +
                        "📌 2️⃣ MACHINE LEARNING (ML): subconjunto da IA.\n" +
                        "📌 3️⃣ DEEP LEARNING: subconjunto do ML (redes neurais).\n" +
                        "⚠️ ERRADO: 'IA é subárea de ML' → inversão hierárquica!"
        ));

        lista.add(new Flashcard(
                "📘 ML vs Sistemas Especialistas",
                "ML_SISTEMAS_ESPECIALISTAS",
                "🧭 Diferenças Cruciais",
                "📌 MACHINE LEARNING: aprende com DADOS e EXPERIÊNCIA.\n" +
                        "📌 SISTEMA ESPECIALISTA: usa REGRAS + BASE DE CONHECIMENTO.\n" +
                        "🔴 ERRADO: ML 'usa base de regras' ou 'símbolos'.\n" +
                        "🟢 CERTO: ML 'usa dados de treinamento'."
        ));

        lista.add(new Flashcard(
                "📘 IA Simbólica vs ML Conexionista",
                "SIMBOLICA_CONEXIONISTA",
                "🧭 Abordagens da IA",
                "📌 IA SIMBÓLICA: símbolos + regras lógicas formais.\n" +
                        "📌 ML CONEXIONISTA: redes neurais + aprendizado com dados.\n" +
                        "⚠️ CILADA: afirmar que ML é baseado em símbolos = ERRADO!\n" +
                        "🎯 Dica: ML moderno é CONEXIONISTA, não simbólico."
        ));

        // ===== OVERFITTING E UNDERFITTING =====
        lista.add(new Flashcard(
                "📘 Overfitting (Sobreajuste)",
                "OVERFITTING",
                "🧭 Overfitting - Definição",
                "📌 OVERFITTING: modelo DECORA os dados de treinamento.\n" +
                        "📊 Desempenho: ÓTIMO no treino, PÉSSIMO em novos dados.\n" +
                        "🔴 Sintomas: erro baixo no treino, erro alto no teste.\n" +
                        "🧠 Analogia: aluno que 'decora' mas não aprende o conceito."
        ));

        lista.add(new Flashcard(
                "📘 Underfitting (Subajuste)",
                "UNDERFITTING",
                "🧭 Underfitting - Definição",
                "📌 UNDERFITTING: modelo NÃO aprende os padrões dos dados.\n" +
                        "📊 Desempenho: RUIM no treino E RUIM em novos dados.\n" +
                        "🔴 Sintomas: erro alto no treino, erro alto no teste.\n" +
                        "🧠 Analogia: modelo muito simples que não consegue captar padrões."
        ));

        lista.add(new Flashcard(
                "📘 Generalização - O Santo Graal",
                "GENERALIZACAO",
                "🧭 Generalização - Conceito",
                "📌 GENERALIZAÇÃO: capacidade de ACERTAR em dados NOVOS.\n" +
                        "🎯 É o OBJETIVO principal do Machine Learning.\n" +
                        "✅ Bom modelo: acerta no treino E no teste (generaliza).\n" +
                        "❌ Overfitting: acerta treino, mas erra no teste."
        ));

        lista.add(new Flashcard(
                "📘 Validação Cruzada (Cross-Validation)",
                "VALIDACAO_CRUZADA",
                "🧭 Cross-Validation - Explicação",
                "📌 TÉCNICA: divide dados em k partes (folds).\n" +
                        "🔄 Processo: treina k vezes, cada vez com uma parte para teste.\n" +
                        "📊 Resultado: média dos erros das k execuções.\n" +
                        "✅ Vantagem: usa TODO o conjunto para treino e teste."
        ));

        lista.add(new Flashcard(
                "📘 Overfitting e Validação Cruzada",
                "VALIDACAO_CRUZADA_OVER",
                "🧭 Como a CV ajuda - Overfitting",
                "📌 A Validação Cruzada DETECTA overfitting:\n" +
                        "🔍 Se erro no treino é baixo e no teste é alto = OVERFITTING.\n" +
                        "📊 K-Fold CV estabiliza a estimativa de erro.\n" +
                        "⚖️ Técnicas para reduzir overfitting:\n" +
                        "🔹 Regularização (L1/L2) | 🔹 Mais dados | 🔹 Menos atributos."
        ));

        lista.add(new Flashcard(
                "📘 Underfitting - Causas e Soluções",
                "UNDERFITTING_SOLUCOES",
                "🧭 Underfitting - Prevenção",
                "📌 CAUSAS DO UNDERFITTING:\n" +
                        "🔹 Modelo muito SIMPLES (ex: regressão linear p/ dados não-lineares).\n" +
                        "🔹 Poucas CARACTERÍSTICAS (atributos) nos dados.\n" +
                        "📌 SOLUÇÕES:\n" +
                        "🔹 Aumentar complexidade do modelo.\n" +
                        "🔹 Adicionar mais características (feature engineering)."
        ));

        // ===== RESUMO FINAL - MACETES PARA PROVA =====
        lista.add(new Flashcard(
                "📘 Macetes - Identificação Rápida",
                "MACETES_PROVA",
                "🧭 Palavras-chave por Conceito",
                "📌 SUPERVISIONADO: dados ROTULADOS, prever, classificar, regredir.\n" +
                        "📌 NÃO SUPERVISIONADO: NÃO rotulados, agrupar, descobrir padrões.\n" +
                        "📌 OVERFITTING: DECOROU, erra no teste, complexo demais.\n" +
                        "📌 UNDERFITTING: NÃO aprendeu, erra no treino, simples demais.\n" +
                        "📌 GENERALIZAÇÃO: dados NOVOS, acerta, é o objetivo final."
        ));

        lista.add(new Flashcard(
                "📘 Ciladas Mestras - Concursos",
                "CILADAS_CONCURSOS",
                "🧭 Armadilhas comuns - Atenção!",
                "📌 ERRADO: 'IA é subárea de ML' → É o INVERSO.\n" +
                        "📌 ERRADO: 'ML usa símbolos/regras' → Isso é IA Simbólica.\n" +
                        "📌 ERRADO: 'ML é só agrupamento' → Ignora o supervisionado.\n" +
                        "📌 ERRADO: 'Sistema Especialista aprende com dados' → ML que aprende.\n" +
                        "📌 CORRETO: 'ML aprende com dados, identifica padrões, faz previsões'."
        ));

        return lista;
    }
}
