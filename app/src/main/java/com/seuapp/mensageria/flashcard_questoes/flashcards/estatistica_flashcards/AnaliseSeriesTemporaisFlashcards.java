package com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class AnaliseSeriesTemporaisFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===== 📹 VÍDEO 01 - AULA: ANÁLISE DE SÉRIES TEMPORAIS - CONCURSOS =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_REG_LINEAR_VS_SERIE_TEMPORAL",
                "🧭 Regressão vs Série Temporal - Comparativo",
                "📌 REGRESSÃO: Predição, Interpolação, Alta Confiança, Ajuste de parâmetros.\n" +
                        "📌 SÉRIE TEMPORAL: Previsão, Extrapolação, Baixa Confiança, Estudo de comportamento."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_PREVISAO_INTERPOLACAO_EXTRAPOLACAO",
                "🧭 Interpolação vs Extrapolação",
                "📌 Interpolação: valor dentro do domínio conhecido → Regressão (confiança alta).\n" +
                        "📌 Extrapolação: valor fora do domínio (futuro) → Série Temporal (incerteza inerente)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_PREMISSA_BASICA_ST",
                "🧭 Premissa Fundamental da Série Temporal",
                "📌 As causas do comportamento devem ser relativamente estáveis no tempo.\n" +
                        "📌 O padrão observado no passado deve se repetir no futuro para a previsão ser válida."));

        // ===== 📹 VÍDEO 02 - CONCEITOS FUNDAMENTAIS EM SÉRIES TEMPORAIS =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_SERIE_ESTATISTICA_DEFINICAO",
                "🧭 Série Estatística - Definição",
                "📌 Série Estatística = TEMPO + ESPAÇO + ESPÉCIE.\n" +
                        "📌 Definição correta: apresentação de dados observados em função da época, local e espécie."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_TEMPO_DISCRETO_VS_CONTINUO",
                "🧭 Tempo Discreto x Contínuo",
                "📌 ⏰ DISCRETO: observações em intervalos fixos (mensal, diário, anual).\n" +
                        "📌 ⏳ CONTÍNUO: observações em qualquer instante de tempo (ex: marés no porto)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_LAG_DEFASAGEM",
                "🧭 Lag/Defasagem",
                "📌 🔙 Lag/Defasagem = valor da série em períodos anteriores.\n" +
                        "📌 Exemplo: Lag 1 é o valor do mês anterior ao período analisado."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_INTERVENCAO_CLASSIFICACAO",
                "🧭 Intervenção - Classificação",
                "📌 ⚡ MOMENTO: Abrupta (imediata) ou Demorada/Defasada (residual).\n" +
                        "📌 ⏱️ DURAÇÃO: Temporária (retorna ao normal) ou Permanente (shift estrutural)."));

        // ===== 📹 VÍDEO 03 - CARACTERÍSTICAS E PROPRIEDADES =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_DETERMINISTICA_VS_ESTOCASTICA",
                "🧭 Série Determinística x Estocástica",
                "📌 🔮 DETERMINÍSTICA: fórmula fixa, futuro conhecido com precisão (ex: 2^t).\n" +
                        "📌 🎲 ESTOCÁSTICA: regida pelo acaso, futuro incerto (foco da análise de ST)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_RUIDO_BRANCO_WHITE_NOISE",
                "🧭 Ruído Branco - Propriedades",
                "📌 ⚪ Média Zero, Variância Constante e Não Correlacionado.\n" +
                        "📌 Representa o erro (εt) - variações espúrias não modeláveis."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ESTACIONARIEDADE_CONCEITO",
                "🧭 Estacionariedade",
                "📌 📈 Propriedades estatísticas (média e variância) NÃO mudam ao longo do tempo.\n" +
                        "📌 Propriedade desejável para modelagem (ex: ARMA). Invariância das estatísticas."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ESTACIONARIO_VS_NAO_ESTACIONARIO",
                "🧭 Estacionário x Não Estacionário",
                "📌 ✅ ESTACIONÁRIO: média constante, variância constante, pode ser modelado diretamente.\n" +
                        "📌 ❌ NÃO ESTACIONÁRIO: média e/ou variância mudam, pode ser tornado estacionário por diferenciação."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ERGODICIDADE",
                "🧭 Ergodicidade",
                "📌 🎯 Propriedade que garante que o processo se comporta conforme esperado pela probabilidade.\n" +
                        "📌 Exemplo: moeda honesta com 50% de chance de dar cara."));

        // ===== 📹 VÍDEO 04 - COMPONENTES DE UMA SÉRIE TEMPORAL =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_COMPONENTES_SAZONALIDADE",
                "🧭 Sazonalidade",
                "📌 🔄 Padrões que se repetem em intervalos curtos, fixos e conhecidos.\n" +
                        "📌 Exemplo: vendas de sorvete no verão (período < 1 ano)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_COMPONENTES_TENDENCIA",
                "🧭 Tendência",
                "📌 📈 Movimento geral de aumento ou queda sustentada dos valores ao longo do tempo.\n" +
                        "📌 Exemplo: aumento constante das vendas de sorvete ao longo dos anos."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_COMPONENTES_CICLO",
                "🧭 Ciclo",
                "📌 🔁 Flutuações de maior duração com frequência variável (sem período fixo).\n" +
                        "📌 Exemplo: ciclos econômicos (expansão/recessão). Difícil de modelar."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_COMPONENTES_IRREGULARIDADE",
                "🧭 Irregularidade/Ruído",
                "📌 🌊 Oscilações inexplicáveis e pontuais em cada instante da série.\n" +
                        "📌 Presente em TODA série real - não é modelável."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_DEPENDENCIA_SERIAL",
                "🧭 Dependência Serial",
                "📌 🔗 Valor de hoje influencia o valor de amanhã.\n" +
                        "📌 Os dados NÃO podem ser embaralhados - a ordem cronológica deve ser preservada."));

        // ===== 📹 VÍDEO 05 - DECOMPOSIÇÃO DE SÉRIES TEMPORAIS =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_DECOMPOSICAO_ADITIVA",
                "🧭 Decomposição Aditiva",
                "📌 ➕ FÓRMULA: Y = T + S + C + I (SOMA).\n" +
                        "📌 USAR quando: amplitude (dispersão) da série se mantém constante ao longo do tempo."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_DECOMPOSICAO_MULTIPLICATIVA",
                "🧭 Decomposição Multiplicativa",
                "📌 ✖️ FÓRMULA: Y = T × S × C × I (MULTIPLICAÇÃO).\n" +
                        "📌 USAR quando: amplitude (dispersão) da série varia proporcionalmente ao longo do tempo."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MEDIA_MOVEL_CALCULO",
                "🧭 Média Móvel - Cálculo",
                "📌 📊 Objetivo: suavizar a série para capturar a tendência.\n" +
                        "📌 Procedimento: calcular média dos m pontos consecutivos (janela)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_SUAVIZACAO_EXPONENCIAL_FORMULA",
                "🧭 Suavização Exponencial - Fórmula",
                "📌 📐 S_t = α × Y_t + (1 − α) × S_(t−1)\n" +
                        "📌 1º valor suavizado (S_1) = primeiro valor observado (Y_1)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_SUAVIZACAO_EXPONENCIAL_ALFA",
                "🧭 Constante de Suavização (α)",
                "📌 🔺 α ALTO → mais peso ao valor atual → mais sensível/variável.\n" +
                        "📌 🔻 α BAIXO → mais peso aos valores passados → mais suave/estável."));

        // ===== 📹 VÍDEO 06 - GRÁFICOS PARA SÉRIES TEMPORAIS =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_GRAFICO_DIAGRAMA_LINHAS",
                "🧭 Diagrama de Linhas",
                "📌 📈 Diagrama de dispersão com pontos ligados por linhas.\n" +
                        "📌 Objetivo principal: visualizar a TENDÊNCIA da série ao longo do tempo."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_GRAFICO_PERIODOGRAMA",
                "🧭 Periodograma",
                "📌 📊 Eixo X: frequência (baixa=ciclos longos; alta=variações rápidas).\n" +
                        "📌 Eixo Y: potência (força da frequência na série)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_GRAFICO_POLAR",
                "🧭 Gráfico Polar",
                "📌 🎯 Representa um ciclo completo (dia/ano) em 360°.\n" +
                        "📌 Distância ao centro = valor da série (longe = alto; perto = baixo)."));

        // ===== 📹 VÍDEO 07 - MODELOS DE PREVISÃO - MÉDIAS MÓVEIS =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MEDIA_MOVEL_SIMPLES",
                "🧭 Média Móvel Simples (MMS)",
                "📌 📊 Previsão = média aritmética dos k últimos valores.\n" +
                        "📌 ⚠️ Limitação: subestima tendências de alta e superestima tendências de baixa."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MEDIA_MOVEL_PONDERADA",
                "🧭 Média Móvel Ponderada (MMP)",
                "📌 ⚖️ Previsão = média ponderada dos k últimos valores.\n" +
                        "📌 Pesos maiores para os valores mais recentes."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_SUAVIZACAO_EXPONENCIAL_PREVISAO",
                "🧭 Suavização Exponencial - Previsão",
                "📌 📐 Previsão_(t+1) = α × Y_t + (1 − α) × Previsão_t\n" +
                        "📌 α é hiperparâmetro definido pelo analista (não treinável)."));

        // ===== 📹 VÍDEO 08 - MODELOS AUTORREGRESSIVOS (AR) - PARTE 1 =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MODELO_AR_P_ESTRUTURA",
                "🧭 Modelo AR(p) - Estrutura",
                "📌 📐 Y_t = c + φ1Y_(t−1) + ... + φpY_(t−p) + ε_t\n" +
                        "📌 AR(1): Y_t = c + φ1Y_(t−1) + ε_t (valor atual previsto pelo anterior)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ESTACIONARIEDADE_AR_RAIZES",
                "🧭 AR - Estacionariedade por Raízes",
                "📌 📐 Polinômio: 1 − φ1Z − φ2Z² − ... = 0\n" +
                        "📌 Raízes com |Z| > 1 (fora do círculo unitário) → ESTACIONÁRIO."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ESTACIONARIEDADE_AR_RESTRICOES",
                "🧭 AR - Restrições dos Coeficientes",
                "📌 AR(1): -1 < φ1 < 1\n" +
                        "📌 AR(2): φ2 > -1; φ1 + φ2 < 1; φ2 − φ1 < 1 (todas verdadeiras)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_AR_MEDIA_VARIANCIA",
                "🧭 AR - Média e Variância",
                "📌 📊 Média (μ) = c / (1 − φ1 − φ2 − ... − φp)\n" +
                        "📌 Variância: usar estacionariedade Var(Y_t) = Var(Y_(t−1))."));

        // ===== 📹 VÍDEO 09 - MODELOS AUTORREGRESSIVOS (AR) - PARTE 2 =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_AR_AUTOCORRELACAO_FAC",
                "🧭 FAC e FACP - Definições",
                "📌 📊 FAC: correlação total com os lags (inclui intermediários).\n" +
                        "📌 🎯 FACP: correlação direta (elimina intermediários) - identifica ordem p do AR."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_AR_COMPORTAMENTO_GRAFICO",
                "🧭 AR(1) e AR(2) - Comportamentos",
                "📌 AR(1): FAC decai exponencial; FACP corta no lag 1.\n" +
                        "📌 AR(2): FAC decai expo. ou senoidal; FACP corta no lag 2."));

        // ===== 📹 VÍDEO 10 - MODELOS DE MÉDIAS MÓVEIS (MA) =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MODELO_MA_Q_ESTRUTURA",
                "🧭 Modelo MA(q) - Estrutura",
                "📌 📐 Y_t = c + ε_t + θ1ε_(t−1) + ... + θqε_(t−q)\n" +
                        "📌 TODO modelo MA é inerentemente ESTACIONÁRIO."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_INVERTIBILIDADE_MA",
                "🧭 Invertibilidade - MA",
                "📌 MA(1): -1 < θ1 < 1\n" +
                        "📌 MA(2): θ2 > -1; θ1 + θ2 > -1; θ2 − θ1 > -1."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MA_COMPORTAMENTO_GRAFICO",
                "🧭 MA(1) e MA(2) - Comportamentos (INVERSO do AR)",
                "📌 MA(1): FAC corta no lag 1; FACP decai exponencial.\n" +
                        "📌 MA(2): FAC corta no lag 2; FACP decai expo. ou senoidal."));

        // ===== 📹 VÍDEO 11 - MODELOS ARMA =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MODELO_ARMA_P_Q",
                "🧭 Modelo ARMA(p,q) - Estrutura",
                "📌 🔗 Combinação AR (p) + MA (q).\n" +
                        "📌 ARMA(p,q): parte AR define estacionariedade; parte MA define invertibilidade."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ARMA_COMPORTAMENTO_GRAFICO",
                "🧭 ARMA - Comportamento (NUNCA CORTA!)",
                "📌 FAC: decaimento (exponencial ou senoidal) - NUNCA corta.\n" +
                        "📌 FACP: decaimento (exponencial ou senoidal) - NUNCA corta."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_RESUMO_AR_MA_ARMA_COMPORTAMENTO",
                "🧭 Resumo - Comportamento FAC x FACP",
                "📌 📈 AR: FAC decai; FACP corta.\n" +
                        "📌 📉 MA: FAC corta; FACP decai.\n" +
                        "📌 📊 ARMA: FAC decai; FACP decai (NUNCA corta)."));

        // ===== 📹 VÍDEO 12 - MODELO ARIMA =====
        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_MODELO_ARIMA_P_D_Q",
                "🧭 ARIMA(p,d,q) - Estrutura",
                "📌 📐 AR (p) + Integração (d) + MA (q).\n" +
                        "📌 d = número de diferenciações para tornar série estacionária."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_ARIMA_D_0_ARMA",
                "🧭 ARIMA(p,0,q) = ARMA(p,q)",
                "📌 Quando d=0, a série já é estacionária.\n" +
                        "📌 ARIMA(p,0,q) equivale exatamente a um modelo ARMA(p,q)."));

        lista.add(new Flashcard(
                "📊 Análise de Séries Temporais",
                "AST_DIFERENCIACAO_ARIMA",
                "🧭 Diferenciação no ARIMA",
                "📌 d=1: remove tendência linear.\n" +
                        "📌 d=2: remove tendências mais complexas (ex: quadráticas).\n" +
                        "📌 Processo: Diferenciar → Modelar (ARMA) → Integrar (voltar)."));

        return lista;
    }
}