package com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards;

import android.system.Os;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class MediaMedianaModaFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // VÍDEO 01 - MEDIDAS DE POSIÇÃO (TENDÊNCIA CENTRAL)
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Posição",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIDAS_POSICAO_CONCEITO",
                "🧭 Função das Medidas de Posição ou Estatística",
                "📌 Definição: Número calculado a partir de dados coletados para caracterizar um grupo.\n" +
                        "🔗 Sinônimos: Medidas de Posição = Medidas de Tendência Central.\n" +
                        "📊 As 3 principais: Média, Moda e Mediana.\n" +
                        "🎯 Função: indicar onde a maioria dos dados se concentra, ficando próximas ao centro da distribuição."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Posição",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_POSICAO_VS_DISPERSAO",
                "🧭 Cilada 1: Posição vs Dispersão",
                "⚠️ CUIDADO! Posição ≠ Dispersão.\n" +
                        "📊 Medidas de Posição (Média, Moda, Mediana) indicam o centro.\n" +
                        "📈 Medidas de Dispersão (Desvio Padrão, Variância) indicam o quão espalhados estão os dados.\n" +
                        "💡 Exemplo: 'Grau de afastamento dos valores em relação à média' é DISPERSÃO, não posição."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Posição",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_POSICAO_CENTRAL_OBRIGATORIA",
                "🧭 Cilada 2: Posição Central é Obrigatória?",
                "❌ NÃO! A medida tende a ficar no centro, mas não é uma obrigação.\n" +
                        "🚫 FALSO afirmar: 'É obrigatório que a média seja o valor exato do centro do grupo'.\n" +
                        "✅ A tendência é ficar próxima ao centro, não uma regra absoluta."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Posição",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_FUNCAO_POSICAO",
                "🧭 Cilada 3: Função da Medida de Posição",
                "📌 A utilidade não é apenas dar um número qualquer.\n" +
                        "🎯 O papel principal é caracterizar o grupo e indicar onde a maioria dos valores se concentra.\n" +
                        "🚫 FALSO: 'A utilidade da média é apenas calcular um valor numérico qualquer'."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Medidas de Posição",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_CONCENTRACAO_DADOS",
                "🧭 Cilada 4: Concentração dos Dados",
                "📌 A maioria dos dados fica PRÓXIMA à medida, não IGUAL a ela.\n" +
                        "🚫 Exemplo: 'Média de 30 anos significa que todos têm 30 anos' → FALSO.\n" +
                        "✅ Significa que a maioria está próxima dos 30 anos."
        ));

        // ============================================================
        // VÍDEO 02 - NOTAÇÃO DE SOMATÓRIO (Σ)
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CONCEITO",
                "🧭 O que é o Somatório (Σ)?",
                "📌 Σ (Sigma maiúsculo) é o comando para 'SOME'.\n" +
                        "📐 Estrutura: Σᵢ₌ₖⁿ Xᵢ\n" +
                        "⬇️ Índice inferior (k) = INÍCIO da soma.\n" +
                        "⬆️ Índice superior (n) = FIM da soma.\n" +
                        "🔗 A soma é contínua: inclui todos os elementos entre o índice inicial e o final, inclusive."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_INDICE_INICIAL",
                "🧭 Cilada 1: Índice Inicial é sempre 1?",
                "❌ NÃO! O índice inferior (i=k) define onde a soma começa.\n" +
                        "📌 Pode ser qualquer número (1, 2, 3...).\n" +
                        "💡 Exemplo: Σᵢ₌₂⁵ Xᵢ = X₂ + X₃ + X₄ + X₅ (começa no X₂, termina no X₅)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_EXTREMOS",
                "🧭 Cilada 2: Somar só os extremos?",
                "❌ NÃO! A soma é contínua, do índice inferior até o superior.\n" +
                        "📌 Não se somam apenas os dois valores dos extremos.\n" +
                        "💡 Exemplo: Σᵢ₌₁⁴ Xᵢ = X₁ + X₂ + X₃ + X₄ (NÃO é X₁ + X₄)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_QUADRADO",
                "🧭 Cilada 3: ΣXᵢ² vs (ΣXᵢ)²",
                "⚠️ SÃO DIFERENTES!\n" +
                        "🟢 ΣXᵢ² = soma dos quadrados de cada X (X₁² + X₂² + ...).\n" +
                        "🔴 (ΣXᵢ)² = soma de todos os X, elevando o resultado ao quadrado.\n" +
                        "💡 Exemplo com 2 e 4: ΣX² = 20; (ΣX)² = 36. CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_INDICE_FINAL",
                "🧭 Cilada 4: Esquecer do Índice Final",
                "📌 O número em cima do Σ define onde a soma termina.\n" +
                        "🚫 Sem ele, o cálculo é impossível.\n" +
                        "✅ A questão sempre fornecerá os dois limites (inferior e superior) para que a conta seja definida."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Somatório",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_OPERACAO_TERMOS",
                "🧭 Cilada 5: Operação se aplica a todos?",
                "📌 A operação (como elevar ao quadrado) se aplica a cada termo individualmente, a menos que explicitamente indicado com parênteses.\n" +
                        "🟢 ΣXᵢ² = X₁² + X₂² + ... (eleva cada um).\n" +
                        "🟢 Σ(Xᵢ)² = (X₁)² + (X₂)² + ... (idem)."
        ));

        // ============================================================
        // VÍDEO 03 - MÉDIA ARITMÉTICA SIMPLES
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CONCEITO",
                "🧭 O que é Média Aritmética Simples?",
                "📌 É a média tradicional: soma-se todos os elementos e divide-se pela quantidade.\n" +
                        "📐 Fórmula 1 (Padrão): x̄ = (ΣXᵢ) / n ou Média = Soma / Quantidade.\n" +
                        "📐 Fórmula 2 (Modificada): Soma = Média × Quantidade.\n" +
                        "💡 Use a Fórmula 2 quando a questão fornecer a média."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_SIMPLES_VS_PONDERADA",
                "🧭 Cilada 1: Média Simples vs Ponderada",
                "📊 Média Simples soma todos e divide pela quantidade.\n" +
                        "⚖️ Média Ponderada atribui pesos diferentes.\n" +
                        "📌 Use a fórmula correta para cada caso.\n" +
                        "💡 Se a questão não citar 'pesos', provavelmente é Média Simples."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_FORMULA_MODIFICADA",
                "🧭 Cilada 2: Esquecer a Fórmula Modificada",
                "📌 Quando a questão der a média, use Soma = Média × n.\n" +
                        "⚡ Isso agiliza e evita equações mais longas.\n" +
                        "💡 Exemplo: 'A média é 10...' → Use Soma = 10 × n."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_ATUALIZAR_N",
                "🧭 Cilada 3: Não atualizar a quantidade (n)",
                "📌 Se alguém sair, 'n' diminui. Se alguém entrar, 'n' aumenta.\n" +
                        "🔄 Atualize sempre!\n" +
                        "💡 Exemplo: 10 funcionários → 1 sai → Agora são 9. FALSO usar n = 10 após a saída."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_DIFERENCA_MEDIAS",
                "🧭 Cilada 4: Diferença entre as médias é a resposta?",
                "❌ NÃO! A diferença entre as médias NÃO é o valor procurado.\n" +
                        "✅ O correto é calcular a diferença entre as SOMAS (usando a fórmula modificada).\n" +
                        "💡 Exemplo: Média caiu de 33 para 30 (diferença de 3). A idade NÃO é 3, é 60 anos. CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Aritmética Simples",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_SIMBOLOS",
                "🧭 Cilada 5: Símbolos da Fórmula",
                "📌 Decore os símbolos:\n" +
                        "🔤 x̄ (x-barra) = Média\n" +
                        "🔤 ΣXᵢ (Somatório) = Soma de todos os X\n" +
                        "🔤 n = Número de elementos\n" +
                        "📌 Não se perca na leitura da questão!"
        ));

        // ============================================================
        // VÍDEO 04 - MÉDIA PONDERADA
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CONCEITO",
                "🧭 O que é Média Ponderada?",
                "📌 É uma média onde alguns elementos têm maior importância (peso) do que outros.\n" +
                        "📐 Fórmula: Média = (X₁×P₁ + X₂×P₂ + ...) / (P₁+P₂+...)\n" +
                        "⚖️ O peso pode representar repetição (ex: valor 6 apareceu 4 vezes) ou importância relativa."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_ABSOLUTA",
                "🧭 Como calcular com Frequência Absoluta?",
                "📌 1. Multiplique cada valor pela sua FA.\n" +
                        "📌 2. Some todos os produtos.\n" +
                        "📌 3. Divida pela soma das FA (total de elementos).\n" +
                        "📐 Fórmula: Média = Σ(X × FA) / ΣFA."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_RELATIVA_DECIMAL",
                "🧭 Como calcular com Frequência Relativa (decimal)?",
                "📌 1. Multiplique cada valor pela sua FR em decimal (ex: 0,2; 0,4).\n" +
                        "📌 2. Some os produtos.\n" +
                        "📌 3. NÃO divida! A soma dos pesos é 1.\n" +
                        "📐 Média = Σ(X × FR).\n" +
                        "💡 Exemplo: 20×0,2 + 25×0,4 + 30×0,4 = 26."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_RELATIVA_PERCENTUAL",
                "🧭 Como calcular com Frequência Relativa (%)?",
                "📌 1. Multiplique cada valor pela sua FR em percentual (ex: 20%; 40%).\n" +
                        "📌 2. Some os produtos.\n" +
                        "📌 3. Divida o resultado por 100.\n" +
                        "💡 Exemplo: (20×20 + 25×40 + 30×40) / 100 = 2600/100 = 26."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_VARIAVEL_VS_PESO",
                "🧭 Cilada 1: Confundir variável com peso",
                "📌 A variável (X) é o que está sendo medido (ex: salário, idade).\n" +
                        "⚖️ O peso (P) é o que indica repetição/importância (ex: frequência).\n" +
                        "💡 Em tabela de salários: Salário é a variável; Nº de funcionários é o peso."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_FREQ_ACUMULADA",
                "🧭 Cilada 2: Usar Frequência Acumulada como peso",
                "📌 O peso é a frequência absoluta simples ou a frequência relativa simples, NUNCA a acumulada.\n" +
                        "🚫 Ignore colunas de 'até 20 anos' para calcular a média.\n" +
                        "✅ Use apenas a FA simples."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Ponderada",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_ESQUECER_MULTIPLICAR",
                "🧭 Cilada 3: Esquecer de multiplicar pelo peso",
                "📌 O erro clássico é somar os valores e dividir pela quantidade de categorias, ignorando os pesos.\n" +
                        "🚫 Exemplo ERRADO: (20+25+30)/3.\n" +
                        "✅ O correto é ponderar pelas frequências."
        ));

        // ============================================================
        // VÍDEO 05 - MÉDIA PARA DADOS AGRUPADOS (TABELAS INTERVALARES)
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Média com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CONCEITO",
                "🧭 O que são Dados Agrupados (Intervalos)?",
                "📌 É uma tabela de frequência onde os dados são apresentados em intervalos (classes).\n" +
                        "📊 Ex: '25 a 35', '35 a 45'.\n" +
                        "🔗 Sinônimos: Tabela intervalar, tabela por classes.\n" +
                        "⭐ REGRA DE OURO: NUNCA use os limites diretamente. SEMPRE use o Ponto Médio (PM)!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_PONTO_MEDIO",
                "🧭 O que é o Ponto Médio (PM)?",
                "📌 É o valor central do intervalo, calculado pela média aritmética dos limites.\n" +
                        "📐 Fórmula: PM = (Limite Inferior + Limite Superior) / 2.\n" +
                        "💡 Exemplo: Classe 25-35 → PM = (25+35)/2 = 30.\n" +
                        "✅ Use o PM como valor representativo da classe."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_FORMULA",
                "🧭 Fórmula da Média para Dados Agrupados",
                "📐 Média = Σ (PM × Frequência) / Σ Frequência.\n" +
                        "📌 É a mesma fórmula da média ponderada, substituindo o valor original (X) pelo Ponto Médio (PM) de cada classe.\n" +
                        "💡 Exemplo: (30×15 + 40×25 + 50×5 + 60×5) / 50 = 40."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CILADA_USAR_LIMITES",
                "🧭 Cilada 1: Usar limites no cálculo",
                "📌 O erro clássico é pegar o 25 ou o 35 para fazer a conta.\n" +
                        "✅ O correto é usar o Ponto Médio (30).\n" +
                        "💡 Exemplo: Na classe 25-35, use 30, não 25 nem 35. CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CILADA_APLICAR_PM",
                "🧭 Cilada 2: Aplicar PM em tabelas pontuais",
                "📌 A regra do PM só se aplica a tabelas com intervalos.\n" +
                        "✅ Se a tabela tiver valores fixos (ex: 20, 25, 30), use-os diretamente.\n" +
                        "🚫 NÃO calcule PM para valores pontuais!"
        ));

        // ============================================================
        // VÍDEO 06 - MÉDIA GEOMÉTRICA
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CONCEITO",
                "🧭 O que é Média Geométrica?",
                "📌 É a raiz enésima da multiplicação de todos os valores.\n" +
                        "📐 Fórmula: G = ⁿ√(X₁ × X₂ × ... × Xₙ).\n" +
                        "📈 Principal aplicação: Cálculo de taxa média percentual (aumentos/descontos sucessivos).\n" +
                        "🚫 NUNCA use a média aritmética para percentuais sucessivos!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_TAXA_MEDIA",
                "🧭 Como calcular Taxa Média Percentual?",
                "📌 1. Transforme cada percentual em fator: aumento de i% → 1+i%; desconto de d% → 1-d%.\n" +
                        "📌 2. Calcule a MG dos fatores: G = ⁿ√(F₁×F₂×...).\n" +
                        "📌 3. Converta para %: Taxa = (G - 1) × 100.\n" +
                        "💡 Exemplo: 20% e 30% → √(1,20×1,30) → (G-1)×100."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_ARITMETICA_PERCENTUAIS",
                "🧭 Cilada 1: Usar Média Aritmética para %",
                "🚫 NUNCA calcule a média de percentuais sucessivos com a aritmética.\n" +
                        "✅ Use a geométrica dos fatores (1+i%).\n" +
                        "🚫 Exemplo: Aumentos de 20% e 30% → média aritmética = 25% (ERRADO!).\n" +
                        "✅ O correto é √(1,20 × 1,30)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_PERCENTUAIS_DIRETOS",
                "🧭 Cilada 2: Multiplicar percentuais diretamente",
                "🚫 Não multiplique 20% × 30%.\n" +
                        "✅ Multiplique os fatores 1,20 × 1,30.\n" +
                        "🚫 √(20% × 30%) está ERRADO.\n" +
                        "✅ O correto é √(1,20 × 1,30). CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_CONVERSAO",
                "🧭 Cilada 3: Esquecer de converter para %",
                "📌 O resultado da raiz é um fator (ex: 1,24).\n" +
                        "📌 Subtraia 1 e multiplique por 100 para achar a taxa percentual.\n" +
                        "💡 Exemplo: Se G = 1,24 → Taxa = (1,24 - 1) × 100 = 24%.\n" +
                        "⚠️ NÃO ESQUEÇA!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Média Geométrica",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_CONFUNDIR_MEDIAS",
                "🧭 Cilada 4: Confundir MG com outras médias",
                "📊 Média Geométrica = Raiz do PRODUTO.\n" +
                        "📊 Média Aritmética = Soma/Quantidade.\n" +
                        "⚠️ Grave a diferença fundamental entre as operações.\n" +
                        "📌 A MG é sempre ≤ MA (iguais apenas se todos os valores forem idênticos)."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CONCEITO_E_APLICACAO",
                "🧭 Teoria Essencial",
                "📌 Média Harmônica: usada para variáveis inversamente proporcionais.\n" +
                        "• Fórmula Geral: H = n / (1/x1 + 1/x2 + ... + 1/xn).\n" +
                        "• Macete: inverso da média dos inversos.\n" +
                        "• 2 valores: H = (2 * x * y) / (x + y)."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FORMULA_2_VALORES",
                "🧭 Fórmula para 2 Valores",
                "📌 Fórmula (decore!): H = (2 * x * y) / (x + y)\n" +
                        "🟢 Exemplo: valores 2 e 3 → H = (2*2*3)/(2+3) = 12/5 = 2,4\n" +
                        "⚡ MUITO COBRADA em provas!\n" +
                        "⏱️ Evita perda de tempo com a fórmula geral."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_QUANDO_USAR",
                "🧭 Identificando a Aplicação",
                "📌 Use quando as grandezas forem inversamente proporcionais.\n" +
                        "🔑 Palavras-chave: velocidade, ritmo, vazão, consumo médio.\n" +
                        "💡 Se uma variável aumenta e a outra diminui → é harmônica!\n" +
                        "❌ NÃO use média aritmética nesses casos!"
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_MAIS_COMUM",
                "🧭 Principais Ciladas e Antídotos",
                "📌 CILADA MORTAL: média aritmética em problemas de ritmo!\n" +
                        "⚠️ Exemplo: 40 e 360 processos/dia → (40+360)/2 = 200 (ERRADO)\n" +
                        "✅ Correto: H = (2*40*360)/(40+360) = 72 (CERTO)\n" +
                        "🛡️ Antídoto: sempre desconfie de 'ritmo médio' ou 'velocidade'."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MACETE_RESUMIDO",
                "🧭 Resumo de Bolso",
                "📌 Macete Mestre: inverso da média dos inversos.\n" +
                        "🔹 Para 2 valores: H = 2xy/(x+y)\n" +
                        "🔹 Use em: velocidade, ritmo, vazão.\n" +
                        "🔹 NUNCA faça média aritmética nesses casos.\n" +
                        "🔹 Primeira ação: identificar relação inversa."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_01",
                "🧭 Fórmula 2 Valores",
                "📌 Qual a fórmula para média harmônica de dois valores (x e y)?\n" +
                        "✅ H = (2 * x * y) / (x + y)"
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_02",
                "🧭 Definição Relacionada",
                "📌 Como a média harmônica se relaciona com a média aritmética?\n" +
                        "✅ A média harmônica é o inverso da média aritmética dos inversos."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_03",
                "🧭 Quando Usar",
                "📌 Quando usar média harmônica em vez da aritmética?\n" +
                        "✅ Em situações com grandezas inversamente proporcionais:\n" +
                        "   velocidade, ritmo ou vazão."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_04",
                "🧭 Cilada Comum",
                "📌 Qual a cilada mais comum em questões de média harmônica?\n" +
                        "✅ Calcular a média aritmética simples quando o correto\n" +
                        "   seria usar a harmônica (ex: problemas de velocidade média)."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_05",
                "🧭 Palavras-Chave",
                "📌 Quais palavras-chave indicam uso da média harmônica?\n" +
                        "✅ Velocidade, ritmo, vazão, ou situações onde uma\n" +
                        "   variável aumenta e a outra diminui."
        ));


        // ================================================================
        // Aula 07 - Média - HARMÔNICA
        // ================================================================

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CONCEITO_E_APLICACAO",
                "🧭 Teoria Essencial",
                "📌 Média Harmônica: usada para variáveis inversamente proporcionais.\n" +
                        "• Fórmula Geral: H = n / (1/x1 + 1/x2 + ... + 1/xn).\n" +
                        "• Macete: inverso da média dos inversos.\n" +
                        "• 2 valores: H = (2 * x * y) / (x + y)."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FORMULA_2_VALORES",
                "🧭 Fórmula para 2 Valores (MUITO IMPORTANTE)",
                "📌 Fórmula (decore!): H = (2 * x * y) / (x + y)\n" +
                        "🟢 Exemplo: valores 2 e 3 → H = (2*2*3)/(2+3) = 12/5 = 2,4\n" +
                        "⚡ MUITO COBRADA em provas!\n" +
                        "⏱️ Evita perda de tempo com a fórmula geral."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_QUANDO_USAR",
                "🧭 Identificando Quando Usar (A Principal Cilada)",
                "📌 Use quando as grandezas forem inversamente proporcionais.\n" +
                        "🔑 Palavras-chave: velocidade, ritmo, vazão, consumo médio.\n" +
                        "💡 Se uma variável aumenta e a outra diminui → é harmônica!\n" +
                        "❌ NÃO use média aritmética nesses casos!"
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_MAIS_COMUM",
                "🧭 Principais Ciladas e Antídotos (FIQUE ALERTA!)",
                "📌 CILADA MORTAL: média aritmética em problemas de ritmo!\n" +
                        "⚠️ Exemplo: 40 e 360 processos/dia → (40+360)/2 = 200 (ERRADO)\n" +
                        "✅ Correto: H = (2*40*360)/(40+360) = 72 (CERTO)\n" +
                        "🛡️ Antídoto: sempre desconfie de 'ritmo médio' ou 'velocidade'."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MACETE_RESUMIDO",
                "🧭 Resumo de Bolso para Revisão Rápida",
                "📌 Macete Mestre: inverso da média dos inversos.\n" +
                        "🔹 Para 2 valores: H = 2xy/(x+y)\n" +
                        "🔹 Use em: velocidade, ritmo, vazão.\n" +
                        "🔹 NUNCA faça média aritmética nesses casos.\n" +
                        "🔹 Primeira ação: identificar relação inversa."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_01",
                "🧭 Fórmula 2 Valores",
                "📌 Qual a fórmula para média harmônica de dois valores (x e y)?\n" +
                        "✅ H = (2 * x * y) / (x + y)"
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_02",
                "🧭 Definição Relacionada",
                "📌 Como a média harmônica se relaciona com a média aritmética?\n" +
                        "✅ A média harmônica é o inverso da média aritmética dos inversos."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_03",
                "🧭 Quando Usar",
                "📌 Quando usar média harmônica em vez da aritmética?\n" +
                        "✅ Em situações com grandezas inversamente proporcionais:\n" +
                        "   velocidade, ritmo ou vazão."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_04",
                "🧭 Cilada Comum",
                "📌 Qual a cilada mais comum em questões de média harmônica?\n" +
                        "✅ Calcular a média aritmética simples quando o correto\n" +
                        "   seria usar a harmônica (ex: problemas de velocidade média)."
        ));

        lista.add(new Flashcard(
                "📘 Média Harmônica - Concursos",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_05",
                "🧭 Palavras-Chave",
                "📌 Quais palavras-chave indicam uso da média harmônica?\n" +
                        "✅ Velocidade, ritmo, vazão, ou situações onde uma\n" +
                        "   variável aumenta e a outra diminui."
        ));


        // ============================================================
        // VÍDEO 08 - DESIGUALDADE ENTRE MÉDIAS
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Desigualdade das Médias",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_ORDEM",
                "🧭 Ordem entre Médias (A, G, H)",
                "⭐ REGRA MESTRE: Aritmética (A) ≥ Geométrica (G) ≥ Harmônica (H).\n" +
                        "📊 A é a maior, H é a menor, G fica no meio.\n" +
                        "✅ Única exceção: todos os valores são iguais → A = G = H.\n" +
                        "📌 Decore: A ≥ G ≥ H."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desigualdade das Médias",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_FORMULA",
                "🧭 Fórmula de Conexão (A, G, H)",
                "📌 As três médias se relacionam por: H = G² / A ou G² = A × H.\n" +
                        "📌 Conhecendo duas médias, você calcula a terceira.\n" +
                        "💡 Exemplo: A=6,5 e G=6 → H = 6²/6,5 = 36/6,5 ≈ 5,54.\n" +
                        "📌 Decore: Harmônica = Geométrica² / Aritmética."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desigualdade das Médias",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_INVERTER_ORDEM",
                "🧭 Cilada 1: Inverter a ordem das médias",
                "📌 Decore: A ≥ G ≥ H.\n" +
                        "📊 A aritmética é a maior, a harmônica é a menor.\n" +
                        "🚫 FALSO afirmar: 'A média harmônica é maior que a geométrica.' (H ≤ G)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desigualdade das Médias",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_IGUALDADE",
                "🧭 Cilada 2: Esquecer a condição de igualdade",
                "📌 A igualdade A=G=H só ocorre se todos os valores forem idênticos.\n" +
                        "💡 Exemplo: Dados 4, 4, 4 → A=G=H=4.\n" +
                        "💡 Dados 4 e 9 → A≠G≠H.\n" +
                        "⚠️ Não confunda!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Desigualdade das Médias",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_FORMULA",
                "🧭 Cilada 3: Confundir a fórmula de conexão",
                "📌 A fórmula correta é H = G² / A.\n" +
                        "🚫 NÃO é G = A² / H, nem H = G / A².\n" +
                        "📌 Decore: Harmônica = Geométrica² / Aritmética.\n" +
                        "✅ Válida para qualquer quantidade de números positivos."
        ));

        // ============================================================
        // VÍDEO 01 - MEDIANA (CONCEITOS E CÁLCULO)
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CONCEITO",
                "🧭 O que é a Mediana?",
                "📌 É o valor que divide um conjunto de dados ordenados em duas partes iguais (50% cada).\n" +
                        "📊 Interpretação: 50% dos valores são menores ou iguais à mediana, e 50% são maiores ou iguais à mediana.\n" +
                        "⚠️ A mediana NÃO é obrigatoriamente um valor do conjunto."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_DADOS_NAO_AGRUPADOS",
                "🧭 Como calcular para Dados Não Agrupados?",
                "📌 1. Ordene os valores (crie o rol).\n" +
                        "📌 2. Conte n(total de elementos).\n" +
                        "📌 3. Se n é ímpar: Mediana = valor central (posição (n+1)/2).\n" +
                        "   Exemplo: 2, 4, 7, 9, 15 → Mediana = 7.\n\n" +
                        "📌 4. Se n é par: Mediana = média dos dois centrais (posições n/2 e n/2+1).\n" +
                        "   Exemplo: 2, 4, 7, 9 → Mediana = (4 + 7) / 2 = 5,5.\n"+
                        "💡 Exemplo: {2,3,5,6} → Mediana = (3+5)/2 = 4."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_TABELA_FREQUENCIA",
                "🧭 Como calcular a Mediana em Tabela de Frequência?",
                "📋 Exemplo:\n" +
                        "Xi | fi\n" +
                        "0 | 3\n" +
                        "1 | 5\n" +
                        "2 | 8\n" +
                        "3 | 10\n" +
                        "4 | 13\n" +
                        "5 | 10\n\n" +

                        "✅ Passo 1: Calcule o total (n).\n" +
                        "n = 3 + 5 + 8 + 10 + 13 + 10 = 49.\n\n" +

                        "✅ Passo 2: Encontre n/2.\n" +
                        "49 ÷ 2 = 24,5.\n\n" +

                        "✅ Passo 3: Monte a Frequência Acumulada (FAC).\n" +
                        "Xi | fi | FAC\n" +
                        "0 | 3  | 3\n" +
                        "1 | 5  | 8\n" +
                        "2 | 8  | 16\n" +
                        "3 | 10 | 26\n" +
                        "4 | 13 | 39\n" +
                        "5 | 10 | 49\n\n" +

                        "✅ Passo 4: Procure o primeiro valor da FAC que seja ≥ 24,5.\n" +
                        "FAC = 26.\n\n" +

                        "🎯 Passo 5: A Mediana é o Xi dessa linha.\n" +
                        "FAC = 26 corresponde ao Xi = 3.\n\n" +

                        "🏆 Resposta: Mediana = 3."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_SEMPRE_DO_CONJUNTO",
                "🧭 Cilada 1: Mediana sempre é do conjunto?",
                "🚫 FALSO! A mediana pode não estar no conjunto, especialmente em conjuntos com número par de elementos.\n" +
                        "💡 Exemplo: {2, 3, 5, 6} → Mediana = 4 (não está no conjunto)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_ESQUECER_ORDENAR",
                "🧭 Cilada 2: Esquecer de ordenar os dados",
                "📌 A mediana só faz sentido com dados ordenados.\n" +
                        "🔄 Ordene sempre antes de calcular.\n" +
                        "💡 Exemplo: Dados {6, 2, 3, 2} → Primeiro ordene: {2, 2, 3, 6}."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_FAC_COMO_RESPOSTA",
                "🧭 Cilada 3: Usar a FAC como resposta",
                "📌 A FAC indica a linha, mas a mediana é o valor da variável (X), não a FAC.\n" +
                        "💡 Exemplo: FAC = 9 → Mediana é o X dessa linha (ex: 30), não 9.\n" +
                        "⚠️ CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_CONDICAO_MAIOR_IGUAL",
                "🧭 Cilada 4: Confundir '≥' com '>'",
                "📌 O primeiro valor da FAC que é MAIOR OU IGUAL a n/2.\n" +
                        "⚠️ Se for apenas 'maior', pode errar.\n" +
                        "💡 Exemplo: n/2 = 5 e a FAC é 5 → a mediana está nessa linha (pois 5 ≥ 5). Use ≥!"
        ));

        // ============================================================
        // VÍDEO 02 - MEDIANA PARA DADOS AGRUPADOS EM CLASSES
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Mediana com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_CONCEITO",
                "🧭 O que é Mediana Grupada (Aproximada)?",
                "📌 Em dados agrupados em intervalos, a informação exata é perdida.\n" +
                        "🚫 Não é possível determinar a Mediana Exata.\n" +
                        "✅ Só é possível calcular uma estimativa: a Mediana Grupada.\n" +
                        "⚠️ Grande CILADA: se pedir 'Mediana Exata' em tabela com intervalos, a resposta é 'Não é possível determinar'."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_FORMULA",
                "🧭 Fórmula da Mediana Grupada",
                "📐 Md = LI + [ (n/2 - FACant) / fMd ] × h\n" +
                        "📌 Onde:\n" +
                        "🔤 LI = Limite Inferior da Classe Mediana\n" +
                        "🔤 n = total de elementos\n" +
                        "🔤 FACant = Frequência Acumulada da classe anterior\n" +
                        "🔤 fMd = Frequência da Classe Mediana\n" +
                        "🔤 h = Amplitude da Classe"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_PASSO_A_PASSO",
                "🧭 Exemplo Resolvido (CESGRANRIO/ELETRONUCLEAR/2022)",
                "📌 Questão:\n" +
                        "Classes: 18⊢26(300), 26⊢34(1280), 34⊢42(380), 42⊢50(180), 50⊢58(48), 58⊢64(8).\n\n" +

                        "✅ Passo 1. Calcule o total (n):\n" +
                        "300 + 1280 + 380 + 180 + 48 + 8 = 2196.\n\n" +

                        "✅ Passo 2. Encontre n/2:\n" +
                        "2196 ÷ 2 = 1098.\n\n" +

                        "✅ Passo 3. Monte a Frequência Acumulada (FAC):\n" +
                        "300 | 1580 | 1960 | 2140 | 2188 | 2196.\n\n" +

                        "✅ Passo 4. Identifique a Classe Mediana:\n" +
                        "1098 está entre 300 e 1580.\n" +
                        "Classe Mediana = 26⊢34.\n\n" +

                        "✅ Passo 5. Identifique os elementos da fórmula:\n" +
                        "LI = 26\n" +
                        "FACant = 300\n" +
                        "fMd = 1280\n" +
                        "h = 8\n\n" +

                        "✅ Passo 6. Aplique a fórmula:\n" +
                        "Md = LI + [(n/2 − FACant) / fMd] × h\n" +
                        "Md = 26 + [(1098 − 300) / 1280] × 8\n" +
                        "Md = 26 + (798/1280) × 8\n" +
                        "Md = 26 + 4,9875\n" +
                        "Md ≈ 30,99 anos.\n\n" +

                        "🎯 Resposta: Mediana ≈ 31 anos."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_CILADA_EXATA",
                "🧭 Cilada 1: Afirmar que a mediana exata está na classe",
                "📌 A mediana exata não pode ser determinada.\n" +
                        "📌 Só sabemos que está entre os limites da classe.\n" +
                        "🚫 Exemplo: 'A mediana exata é 35' → ERRADO (em dados com intervalo).\n" +
                        "✅ O correto é 'a mediana grupada é 35'."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Mediana com Dados Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_PROPRIEDADE_ROBUSTEZ",
                "🧭 Propriedade: Robustez a Outliers",
                "🛡️ A Mediana é robusta (resistente) a valores discrepantes (outliers).\n" +
                        "📌 Valores extremos não alteram significativamente seu valor.\n" +
                        "⚠️ Diferente da Média, que é sensível a outliers.\n" +
                        "✅ Se houver valores extremos, a Mediana é mais representativa."
        ));

        // ============================================================
        // VÍDEO 01 - MODA (CONCEITOS INICIAIS)
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CONCEITO",
                "🧭 O que é a Moda?",
                "📌 É o valor que mais se repete em um conjunto de dados (maior frequência).\n" +
                        "🛡️ Vantagem 1: Não é sensível a outliers (valores extremos).\n" +
                        "📊 Vantagem 2: Pode ser usada para dados qualitativos (categorias), diferente da Média e Mediana.\n" +
                        "💡 Exemplo: 'marca de carro mais vendida' é uma moda."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CILADA_SO_NUMEROS",
                "🧭 Cilada 1: Moda só existe para números",
                "🚫 FALSO! A Moda existe para qualquer tipo de dado (numérico ou categórico/qualitativo).\n" +
                        "💡 Exemplo: A 'cor preferida' ou a 'marca de carro mais vendida' são modas (dados qualitativos)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CILADA_SEMPRE_UNICA",
                "🧭 Cilada 2: Moda é sempre única?",
                "🚫 FALSO! Um conjunto pode ter mais de uma moda (bimodal) ou não ter moda (amodal).\n" +
                        "💡 Exemplo: Dados {2, 2, 3, 3, 4} → Modas: 2 e 3 (bimodal).\n" +
                        "📌 Se todos têm a mesma frequência → amodal."
        ));

        // ============================================================
        // VÍDEO 02 - MODA PARA DADOS NÃO AGRUPADOS
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Moda Não Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CONCEITO",
                "🧭 Como calcular Moda para dados não agrupados?",
                "📌 Basta observar qual valor mais se repete.\n" +
                        "🚫 Não há fórmula; é uma identificação direta pela frequência.\n" +
                        "📊 Classificação:\n" +
                        "🟢 Unimodal (1 moda)\n" +
                        "🟡 Bimodal (2 modas)\n" +
                        "🔴 Amodal (nenhuma moda - todos com mesma frequência ou mais de 2 modas)"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda Não Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CILADA_FREQUENCIA_VS_MODA",
                "🧭 Cilada: Confundir frequência com a moda",
                "📌 A moda é o valor da variável, não a frequência.\n" +
                        "📌 A frequência apenas indica qual valor é a moda.\n" +
                        "💡 Exemplo: Maior FA = 42 → Moda é o X correspondente (ex: 14), NÃO é 42.\n" +
                        "⚠️ CUIDADO!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda Não Agrupados",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CILADA_MAIS_DE_DUAS_MODAS",
                "🧭 Cilada: Pode haver mais de duas modas?",
                "📌 Por convenção, aceita-se até duas modas (bimodal).\n" +
                        "🚫 Mais de duas → considera-se amodal.\n" +
                        "💡 Exemplo: Dados {1,1,2,2,3,3} → Amodal, NÃO trimodal.\n" +
                        "⚠️ ATENÇÃO!"
        ));

        // ============================================================
        // VÍDEO 03 - MODA PARA DADOS AGRUPADOS SEM INTERVALO
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Moda Agrupados sem Intervalo",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_SEM_INTERVALO_CONCEITO",
                "🧭 Moda em tabela sem intervalo (valores pontuais)",
                "📌 O cálculo é o mesmo dos dados não agrupados: observar qual valor tem a maior frequência.\n" +
                        "⭐ REGRA DE OURO: A moda é o valor da variável (X) que possui a maior frequência.\n" +
                        "⚠️ A frequência em si NUNCA é a moda!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda Agrupados sem Intervalo",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_SEM_INTERVALO_CILADA_FREQUENCIA",
                "🧭 Cilada: Confundir frequência com a moda",
                "📌 A moda é o valor da variável, não a frequência.\n" +
                        "💡 Exemplo: Maior FA = 10 → Moda é o X correspondente (ex: 9), NÃO é 10.\n" +
                        "📌 A frequência apenas indica qual valor é a moda."
        ));

        // ============================================================
        // VÍDEO 04 - MODA PARA DADOS AGRUPADOS EM CLASSES
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Moda com Dados Agrupados em Classes",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_CONCEITO",
                "🧭 O que é Moda Grupada?",
                "📌 Em dados agrupados em intervalos, a informação exata é perdida.\n" +
                        "🚫 Não é possível determinar a Moda Exata.\n" +
                        "✅ Só é possível calcular uma estimativa (Moda Grupada).\n" +
                        "📊 Métodos: Bruta (ponto médio), Czuber e King.\n" +
                        "⚠️ Grande CILADA: a moda exata NÃO é obrigatoriamente a classe modal!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda com Dados Agrupados em Classes",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_METODOS",
                "🧭 Métodos de cálculo da Moda Grupada",
                "📌 1) Moda Bruta = Ponto Médio da Classe Modal (estimativa mais simples).\n" +
                        "📌 2) Método de Czuber: Mo = LI + [Δ₁/(Δ₁+Δ₂)] × h\n" +
                        "📌 3) Método de King: Mo = LI + [fpost/(fant+fpost)] × h\n" +
                        "💡 Use Czuber ou King para estimativas mais refinadas."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda com Dados Agrupados em Classes",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_DICA_SEM_CALCULO",
                "🧭 Dica de Ouro: Direção da Moda (sem cálculo!)",
                "📌 Compare as frequências vizinhas:\n" +
                        "➡️ Se fposterior > fanterior → moda é puxada para a DIREITA (maior que o ponto médio).\n" +
                        "⬅️ Se fanterior > fposterior → moda é puxada para a ESQUERDA (menor que o ponto médio).\n" +
                        "💡 Isso ajuda a eliminar alternativas sem fazer contas!"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda com Dados Agrupados em Classes",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_CILADA_MODA_EXATA",
                "🧭 Cilada 1: Moda exata está na classe modal?",
                "🚫 FALSO! A moda exata pode estar em qualquer classe.\n" +
                        "💡 Exemplo: Classe com 19 valores diferentes (moda não está lá) e outra com 4 valores todos iguais a 92 (moda está lá).\n" +
                        "📌 A maior frequência NÃO garante a moda exata."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Moda com Dados Agrupados em Classes",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_AMPLITUDES_DIFERENTES",
                "🧭 Caso Especial: Amplitudes diferentes",
                "📌 Quando as classes têm amplitudes diferentes, a frequência absoluta NÃO é confiável.\n" +
                        "📐 Use Densidade de Frequência = Frequência / Amplitude.\n" +
                        "🔄 Substitua a Frequência pela Densidade em todos os cálculos (classe modal, Δ₁, Δ₂, etc.)."
        ));

        // ============================================================
        // VÍDEO 05 - PROPRIEDADES DA MODA
        // ============================================================
        lista.add(new Flashcard(
                "📊 Estatística - Propriedades da Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_SUBTRACAO",
                "🧭 Propriedade 1: Soma/Subtração (Translação)",
                "📌 Se somarmos ou subtrairmos uma constante (k) a TODOS os valores, a Moda também é somada ou subtraída pela mesma constante.\n" +
                        "📐 Regra: Mo(novo) = Mo(antigo) ± k\n" +
                        "💡 Exemplo: Moda=5, soma 2 a todos → Nova Moda=7."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Propriedades da Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_MULTIPLICACAO",
                "🧭 Propriedade 2: Multiplicação/Divisão (Escala)",
                "📌 Se multiplicarmos ou dividirmos TODOS os valores por uma constante (k), a Moda também é multiplicada ou dividida pela mesma constante.\n" +
                        "📐 Regra: Mo(novo) = Mo(antigo) × k ou Mo(novo) = Mo(antigo) / k\n" +
                        "💡 Exemplo: Moda=5, multiplica todos por 2 → Nova Moda=10."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Propriedades da Moda",
                "MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_CILADA_TODOS_VALORES",
                "🧭 Cilada: Transformação aplicada a todos?",
                "⚠️ A propriedade SÓ é válida se a transformação for aplicada a TODOS os elementos.\n" +
                        "🚫 Se for aplicada apenas a alguns, a propriedade não se aplica.\n" +
                        "💡 Exemplo: 'Adicionou-se 2 a cada elemento' → vale.\n" +
                        "🚫 'Adicionou-se 2 a alguns' → NÃO vale. Leia atentamente!"
        ));

        return lista;
    }
}