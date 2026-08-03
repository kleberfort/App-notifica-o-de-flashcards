package com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class MedidasVariabilidadeDispersaoFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===== VÍDEO 01 - CONCEITOS GERAIS =====
        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Dispersão",
                "CONCEITOS_GERAIS",
                "🧭 Conceitos Fundamentais",
                "📌 O que são medidas de dispersão?\n" +
                        "🟢 Avaliam se os valores estão concentrados (próximos) ou dispersos (distantes).\n" +
                        "💡 Exemplo:\n" +
                        "Turma A: 9, 9, 10, 10\n" +
                        "Turma B: 2, 6, 10, 20\n" +
                        "👉 Leitura: Na Turma A as notas ficam próximas umas das outras (baixa dispersão). Na Turma B as notas estão muito espalhadas (alta dispersão).\n\n" +

                        "📌 Importância da dispersão para a média:\n" +
                        "🟢 Baixa dispersão → Média confiável.\n" +
                        "🔴 Alta dispersão → Média perde eficácia.\n" +
                        "💡 Exemplo:\n" +
                        "Salários: R$ 2.900, R$ 3.000, R$ 3.100\n" +
                        "Média = R$ 3.000\n" +
                        "👉 Leitura: Como todos os salários são parecidos, a média representa bem o grupo.\n\n" +

                        "💡 Outro exemplo:\n" +
                        "Salários: R$ 1.500, R$ 2.000, R$ 15.000\n" +
                        "Média ≈ R$ 6.167\n" +
                        "👉 Leitura: A média fica alta por causa de um único salário muito elevado e deixa de representar a maioria das pessoas.\n\n" +

                        "📌 Relação com amostragem:\n" +
                        "🟢 Baixa dispersão → Amostra menor.\n" +
                        "🔴 Alta dispersão → Amostra maior.\n" +
                        "💡 Exemplo:\n" +
                        "Turma A: quase todos os alunos têm entre 7 e 8 de nota.\n" +
                        "Turma B: há alunos com notas de 1 até 10.\n" +
                        "👉 Leitura: Na Turma A basta analisar poucos alunos para ter uma boa ideia da turma. Na Turma B é preciso analisar mais alunos, pois as notas variam muito."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Dispersão",
                "LISTA_COMPLETA",
                "🧭 Principais Medidas de Dispersão",
                "📌 Lista das principais medidas:\n" +
                        "1️⃣ Amplitude\n" +
                        "2️⃣ Diferença Interquartílica\n" +
                        "3️⃣ Coeficiente Quartílico\n" +
                        "4️⃣ Desvio Médio (Desvio Absoluto Médio)\n" +
                        "5️⃣ Variância\n" +
                        "6️⃣ Desvio Padrão\n" +
                        "7️⃣ Coeficiente de Variação (CV)\n" +
                        "8️⃣ Variância Relativa"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Dispersão",
                "FALSIAS_COMUNS",
                "🧭 Ciladas da Banca",
                "📌 CV vs Coeficiente Quartílico:\n" +
                        "🔴 São diferentes! CV usa média e desvio padrão.\n" +
                        "🟢 Coeficiente Quartílico usa quartis (Q1 e Q3).\n" +
                        "📌 Dispersão vs Tendência Central:\n" +
                        "🔴 Dispersão mede variabilidade (distância).\n" +
                        "🟢 Tendência Central mede centro (média, moda).\n" +
                        "📌 Dispersão e Amostragem:\n" +
                        "🔴 Alta dispersão → amostra maior.\n" +
                        "🟢 Baixa dispersão → amostra menor."
        ));

        // ===== VÍDEO 02 - AMPLITUDE TOTAL =====
        lista.add(new Flashcard(
                "📊 Estatística - Amplitude",
                "AMPLITUDE_TOTAL",
                "🧭 Cálculo e Interpretação",
                "📌 Fórmula: H = Xmáx - Xmín.\n" +
                        "📌 Exemplo: 55, 80, 70, 62, 83.\n" +
                        "🟢 Xmáx = 83 | Xmín = 55.\n" +
                        "🟢 H = 83 - 55 = 28.\n" +
                        "📌 Interpretação:\n" +
                        "🟢 Menor amplitude → dados concentrados.\n" +
                        "🔴 Maior amplitude → dados dispersos."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Amplitude",
                "VANTAGENS_DESVANTAGENS",
                "🧭 Prós e Contras",
                "📌 Vantagem: Cálculo fácil e rápido.\n" +
                        "📌 Desvantagem: Só considera extremos.\n" +
                        "🔴 Ignora valores intermediários.\n" +
                        "🔴 Influenciada por outliers.\n" +
                        "📌 Exemplo: 2,5,5,5,5,98.\n" +
                        "🟢 Amplitude = 96 (alta).\n" +
                        "🔴 Mas 80% dos dados estão concentrados."
        ));

        // ===== VÍDEO 03 - MEDIDAS COM QUARTIS =====
        lista.add(new Flashcard(
                "📊 Estatística - Quartis",
                "QUARTIS_REVISAO",
                "🧭 Relembrando os Quartis",
                "📌 Q1 (1º Quartil): 25% dos dados.\n" +
                        "📌 Q2 (2º Quartil/Mediana): 50% dos dados.\n" +
                        "📌 Q3 (3º Quartil): 75% dos dados.\n" +
                        "📌 Os quartis dividem em 4 partes iguais.\n" +
                        "🔴 Q2 NÃO é ponto médio entre Q1 e Q3!\n" +
                        "🟢 Exemplo: Q1=4, Q3=8, Q2=5 (não 6)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Quartis",
                "MEDIDAS_QUARTIS",
                "🧭 Medidas Derivadas dos Quartis",
                "📌 Diferença Interquartílica (D): Q3 - Q1.\n" +
                        "🟢 Distância que concentra 50% centrais.\n" +
                        "📌 Desvio Quartílico (DQ): (Q3 - Q1)/2.\n" +
                        "🟢 Metade da distância interquartílica.\n" +
                        "📌 Coeficiente de Variação Quartílica:\n" +
                        "🟢 CVq = (Q3 - Q1)/(Q3 + Q1).\n" +
                        "🔴 CVq ≠ CV tradicional!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Quartis",
                "CILADAS_QUARTIS",
                "🧭 Ciladas com Quartis",
                "📌 Q2 não é ponto médio entre Q1 e Q3.\n" +
                        "🔴 Exemplo: Q1=4, Q3=8, ponto médio=6, Q2=5.\n" +
                        "📌 Desvio Quartílico: (Q3 - Q1)/2.\n" +
                        "🔴 Não é Q2 - Q1!\n" +
                        "📌 CVq usa quartis; CV usa média e DP.\n" +
                        "🔴 CVq = (Q3-Q1)/(Q3+Q1).\n" +
                        "🟢 CV = DP/Média × 100."
        ));

        // ===== VÍDEO 04 - DESVIOS EM RELAÇÃO À MÉDIA =====
        lista.add(new Flashcard(
                "📊 Estatística - Desvios",
                "DESVIO_MEDIA",
                "🧭 Conceito de Desvio",
                "📌 Desvio: distância de cada valor à média.\n" +
                        "📌 Fórmula: di = Xi - X̄.\n" +
                        "📌 Exemplo: 4, 6, 10, 12.\n" +
                        "🟢 Média = 8.\n" +
                        "🟢 d1 = -4, d2 = -2, d3 = +2, d4 = +4.\n" +
                        "📌 Sinal: positivo (acima), negativo (abaixo)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desvios",
                "PROPRIEDADE_SOMA",
                "🧭 Soma dos Desvios = Zero",
                "📌 Propriedade fundamental:\n" +
                        "🟢 Σ(Xi - X̄) = 0.\n" +
                        "📌 Exemplo: (-4)+(-2)+(+2)+(+4) = 0.\n" +
                        "📌 Se a soma for diferente de zero:\n" +
                        "🔴 Houve erro no cálculo!\n" +
                        "📌 Vale para qualquer conjunto numérico."
        ));

        // ===== VÍDEO 05 - DESVIO ABSOLUTO MÉDIO =====
        lista.add(new Flashcard(
                "📊 Estatística - Desvio Absoluto Médio",
                "DESVIO_ABSOLUTO_MEDIO",
                "🧭 Conceito e Cálculo",
                "📌 Média dos módulos dos desvios.\n" +
                        "📌 D.M. = Σ|Xi - X̄| / n.\n" +
                        "📌 Por que usar módulo?\n" +
                        "🟢 Soma dos desvios = zero.\n" +
                        "🔴 Média dos desvios puros = zero.\n" +
                        "📌 Interpretação:\n" +
                        "🟢 Menor D.M. → dados mais concentrados."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desvio Absoluto Médio",
                "DADOS_SIMPLES_TABELA",
                "🧭 Cálculo: Dados Simples e Tabela",
                "📌 Dados simples: D.M. = Σ|di| / n.\n" +
                        "📌 Exemplo: 2,3,5,8,12 | Média=6.\n" +
                        "🟢 D.M. = (4+3+1+2+6)/5 = 3,2.\n" +
                        "📌 Tabela de frequência:\n" +
                        "🟢 D.M. = Σ(fi·|di|) / Σfi.\n" +
                        "🔴 Multiplique cada desvio pela frequência."
        ));

        // ===== VÍDEO 06 - VARIÂNCIA =====
        lista.add(new Flashcard(
                "📊 Estatística - Variância",
                "VARIANCIA_CONCEITO",
                "🧭 Conceito e Fórmulas",
                "📌 Média dos quadrados dos desvios.\n" +
                        "📌 Fórmula básica populacional:\n" +
                        "🟢 σ² = Σ(Xi - X̄)² / n.\n" +
                        "📌 Fórmula básica amostral:\n" +
                        "🟢 s² = Σ(Xi - X̄)² / (n-1).\n" +
                        "📌 Fórmula avançada (priorize):\n" +
                        "🟢 σ² = (ΣXi²/n) - (X̄)²."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Variância",
                "POPULACIONAL_AMOSTRAL",
                "🧭 Populacional vs Amostral",
                "📌 Populacional (σ²): divide por n.\n" +
                        "🟢 Usa TODOS os dados da população.\n" +
                        "📌 Amostral (s²): divide por n-1.\n" +
                        "🟢 Usa apenas uma amostra.\n" +
                        "📌 Regra: Se não especificar, use σ².\n" +
                        "🔴 s² SEMPRE maior que σ² para mesmos dados."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Variância",
                "CILADAS_VARIANCIA",
                "🧭 Ciladas da Variância",
                "📌 Variância NUNCA é negativa.\n" +
                        "🟢 Valor mínimo = 0 (todos os dados iguais).\n" +
                        "📌 Não confunda populacional com amostral.\n" +
                        "🔴 Atente-se ao enunciado!\n" +
                        "📌 Variância usa QUADRADOS, não módulos.\n" +
                        "🔴 Desvio -4 → +16, não +4."
        ));

        // ===== VÍDEO 07 - VARIÂNCIA EM TABELAS =====
        lista.add(new Flashcard(
                "📊 Estatística - Variância em Tabelas",
                "TABELA_ABSOLUTA",
                "🧭 Frequência Absoluta",
                "📌 Método básico: σ² = Σfi·(Xi-X̄)²/Σfi.\n" +
                        "📌 Exemplo: Xi=20(fi=2), 25(8), 30(10).\n" +
                        "🟢 Média = 27.\n" +
                        "🟢 di²: 49,4,9; fi·di²: 98,32,90.\n" +
                        "🟢 σ² = 220/20 = 11.\n" +
                        "📌 Amostral: s² = 220/(20-1) ≈ 11,57."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Variância em Tabelas",
                "TABELA_RELATIVA",
                "🧭 Frequência Relativa/Percentual",
                "📌 Usar percentuais como pesos (0,10; 0,40...).\n" +
                        "📌 Calcular X̄ = Σ(Xi × %) e X̄².\n" +
                        "📌 Exemplo: 20(10%), 25(40%), 30(50%).\n" +
                        "🟢 X̄ = 27.\n" +
                        "🟢 X̄² = 740.\n" +
                        "🟢 σ² = 740 - 27² = 11.\n" +
                        "🔴 NÃO divide! Os pesos já estão incorporados."
        ));

        // ===== VÍDEO 08 - DESVIO PADRÃO =====
        lista.add(new Flashcard(
                "📊 Estatística - Desvio Padrão",
                "DESVIO_PADRAO_CONCEITO",
                "🧭 Conceito e Cálculo",
                "📌 Raiz quadrada da variância.\n" +
                        "📌 Restaura a unidade original dos dados.\n" +
                        "📌 Fórmula: σ = √σ² (populacional).\n" +
                        "🟢 s = √s² (amostral).\n" +
                        "📌 Exemplo: dados 2,6,7 | Média=5.\n" +
                        "🟢 σ = √(14/3) ≈ 2,16.\n" +
                        "🟢 s = √(14/2) = √7 ≈ 2,65."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desvio Padrão",
                "COMPARACAO_GRUPOS",
                "🧭 Comparando Grupos",
                "📌 Médias iguais: compare DP diretamente.\n" +
                        "🟢 Maior DP → maior dispersão.\n" +
                        "📌 Médias diferentes: use Coeficiente de Variação.\n" +
                        "🔴 DP absoluto não considera a média.\n" +
                        "📌 Valor mínimo do DP: 0.\n" +
                        "🟢 Ocorre quando todos os valores são iguais."
        ));

        // ===== VÍDEO 09 - COEFICIENTE DE VARIAÇÃO =====
        lista.add(new Flashcard(
                "📊 Estatística - Coeficiente de Variação",
                "CV_CONCEITO",
                "🧭 Conceito e Cálculo",
                "📌 Medida de dispersão relativa.\n" +
                        "📌 Expressa DP como % da média.\n" +
                        "📌 Fórmula: CV = σ/X̄ × 100.\n" +
                        "📌 Exemplo: Média=50, σ=15.\n" +
                        "🟢 CV = 15/50 = 0,30 = 30%.\n" +
                        "📌 Interpretação:\n" +
                        "🟢 CV alto → dados heterogêneos.\n" +
                        "🟢 CV baixo → dados homogêneos."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Coeficiente de Variação",
                "CV_PROPRIEDADES",
                "🧭 Propriedades do CV",
                "📌 Invariante à escala:\n" +
                        "🟢 Mudar minutos/horas não altera CV.\n" +
                        "📌 Pode ser negativo:\n" +
                        "🔴 Se a média for negativa.\n" +
                        "📌 Pode ser zero: todos os dados iguais.\n" +
                        "📌 Adimensional (percentual).\n" +
                        "📌 CV ≠ Coeficiente Quartílico.\n" +
                        "🟢 CV = σ/X̄; CVq = (Q3-Q1)/(Q3+Q1)."
        ));

        // ===== VÍDEO 10 - VARIÂNCIA RELATIVA =====
        lista.add(new Flashcard(
                "📊 Estatística - Variância Relativa",
                "VR_CONCEITO",
                "🧭 Conceito e Fórmula",
                "📌 Dispersão relativa.\n" +
                        "📌 Fórmula: VR = σ²/(X̄)².\n" +
                        "📌 Relação com CV: VR = (CV)².\n" +
                        "📌 Exemplo: CV = 30%.\n" +
                        "🟢 VR = (0,30)² = 0,09 = 9%.\n" +
                        "📌 Quando usar:\n" +
                        "🟢 Comparar grupos com médias diferentes."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Variância Relativa",
                "VR_PROPRIEDADES",
                "🧭 Propriedades da VR",
                "📌 Adimensional (percentual).\n" +
                        "📌 Invariante à escala.\n" +
                        "📌 Sempre ≥ 0.\n" +
                        "📌 CV e VR sempre apontam mesma conclusão.\n" +
                        "🔴 VR ≠ Variância comum (σ²).\n" +
                        "📌 Médias iguais: use Variância comum.\n" +
                        "📌 Médias diferentes: use CV ou VR."
        ));

        // ===== RESUMOS DE BOLSO =====
        lista.add(new Flashcard(
                "📊 Estatística - Resumos",
                "RESUMO_BOLSO_1",
                "🧭 Medidas de Dispersão - Resumo",
                "📌 Conceito: variabilidade dos dados.\n" +
                        "📌 Principais: Amplitude, Quartis, Desvio Médio,\n" +
                        "   Variância, Desvio Padrão, CV, Variância Relativa.\n" +
                        "📌 Foco na prova: Variância e Desvio Padrão.\n" +
                        "📌 Média x Dispersão:\n" +
                        "🟢 Baixa dispersão → média confiável.\n" +
                        "🔴 Alta dispersão → média perde eficácia.\n" +
                        "📌 Dispersão x Amostra:\n" +
                        "🟢 Baixa → amostra menor.\n" +
                        "🔴 Alta → amostra maior."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Resumos",
                "RESUMO_BOLSO_2",
                "🧭 Ciladas - Visão Geral",
                "📌 CV ≠ Coeficiente Quartílico.\n" +
                        "🟢 CV = σ/X̄; CVq = (Q3-Q1)/(Q3+Q1).\n" +
                        "📌 Q2 não é ponto médio entre Q1 e Q3.\n" +
                        "📌 Variância pode ser zero (dados iguais).\n" +
                        "📌 Soma dos desvios SEMPRE = zero.\n" +
                        "📌 Amostral divide por n-1.\n" +
                        "📌 Comparação:\n" +
                        "🟢 Médias iguais → DP.\n" +
                        "🟢 Médias diferentes → CV ou VR."
        ));

        return  lista;
    }
}
