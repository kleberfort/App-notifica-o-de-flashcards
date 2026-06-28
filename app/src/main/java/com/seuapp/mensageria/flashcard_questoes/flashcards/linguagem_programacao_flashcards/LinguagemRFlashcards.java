package com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class LinguagemRFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // VÍDEO 01 - CONCEITOS FUNDAMENTAIS
        lista.add(new Flashcard(
                "📘 Linguagem R - Fundamentos",
                "R_CONCEITOS_BASE",
                "🧭 Definições e Propósito da Linguagem R",
                "📌 PRINCIPAIS CONCEITOS DA LINGUAGEM R:\n" +
                        "🟢 PROPÓSITO: Realizar análises estatísticas, construir gráficos e manipular grandes volumes de dados.\n" +
                        "🔵 R STUDIO: Ambiente de Desenvolvimento Integrado (IDE) que facilita o uso do R com console, scripts e help.\n" +
                        "🟠 VARIÁVEL (OBJETO): Espaço na memória RAM que armazena um dado, criado com '<-' (ex: nota1 <- 8).\n" +
                        "🔴 COMENTÁRIOS: Linhas ignoradas pelo R, iniciadas com '#' (ex: # Este é um comentário)."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Operadores",
                "R_OPERADORES",
                "🧭 Operadores Matemáticos, Comparação e Lógicos",
                "📌 PRINCIPAIS OPERADORES:\n" +
                        "🟢 MATEMÁTICOS: ^ (potência), * (mult.), / (div.), + (soma), - (subtr.), %% (mod/resto), %/% (divisão inteira).\n" +
                        "🔵 ATRIBUIÇÃO: <- (recebe), = (recebe), -> (recebe, inverte a ordem).\n" +
                        "🟠 COMPARAÇÃO: == (igual), != (diferente), > (maior), < (menor), >= (maior ou igual), <= (menor ou igual). RETORNAM: TRUE ou FALSE\n" +
                        "🔴 LÓGICOS: & (E - AND), | (OU - OR), ! (NÃO - NOT), xor() (OU EXCLUSIVO - XOR)."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Variáveis",
                "R_VARIAVEIS",
                "🧭 Regras de Nomenclatura e Função de Atribuição",
                "📌 REGRAS PARA NOMEAR UMA VARIÁVEL:\n" +
                        "🟢 Começar com uma letra (a-zA-Z).\n" +
                        "🔵 Pode conter números, underscores (_) e pontos (.).\n" +
                        "🟠 Diferencia letras maiúsculas de minúsculas (case sensitive).\n" +
                        "🔴 IGUALDADE VS ATRIBUIÇÃO: '=' é atribuição; '==' é comparação de igualdade."
        ));

        // VÍDEO 02 - VETORES, TIPOS DE DADOS E OPERAÇÕES
        lista.add(new Flashcard(
                "📘 Linguagem R - Tipos de Dados",
                "R_TIPOS_DADOS",
                "🧭 Classes/ Tipos Primitivos de Dados",
                "📌 CLASSES BÁSICAS (ATÔMICAS) DE DADOS:\n" +
                        "🟢 NUMERIC: Números reais (decimais). Ex: idade <- 30.5\n" +
                        "🔵 INTEGER: Números inteiros, indicado com L. Ex: quantidade <- 10L\n" +
                        "🟠 CHARACTER: Textos (strings), entre aspas. Ex: nome <- 'Renato'\n" +
                        "🔴 LOGICAL: Valores lógicos TRUE ou FALSE. Ex: aprovado <- TRUE\n" +
                        "🟣 COMPLEX: Números complexos. Ex: numc <- 2 + 3i\n" +
                        "💡 R é uma linguagem DINAMICAMENTE TIPADA: a variável assume o tipo do valor atribuído. Use class(objeto) para verificar.\n"+
                        "💚 Função: class(objeto) - Verifica o tipo de uma variável."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Vetores",
                "R_VETORES",
                "🧭 Estrutura, Criação e Indexação de Vetores",
                "📌 VETORES (VECTOR):\n" +
                        "🟢 Estrutura unidimensional e homogênea (todos os elementos são do mesmo tipo).\n" +
                        "🔵 CRIAÇÃO: c() combina valores (ex: notas <- c(7, 8, 6)); ':' cria sequência (1:10); seq(1,10,2) R = 1,3,5,7,9. sequência com passo; rep(5,3) R = 5,5,5. repetição.\n" +
                        "🟠 INDEXAÇÃO: Índice inicial é 1 (não 0!). Acesse com vetor[índice] (ex: notas[3]). Remova com vetor[-índice].\n" +
                        "🔴 VALOR FALTANTE: NA (Not Available) representa dado ausente e contamina operações."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Operações com Vetores",
                "R_OP_VETORES",
                "🧭 Operações Aritméticas e Reciclagem",
                "📌 OPERAÇÕES COM VETORES:\n" +
                        "🟢 Vetor + Número: Soma o número a cada elemento. Ex: c(3,7,9) + 5 = (8,12,14)\n" +
                        "🔵 Vetor + Vetor (mesmo comprimento): Soma elemento a elemento. Ex: c(3,7,9) + c(9,8,15) = (12,15,24)\n" +
                        "🟠 RECICLAGEM: Vetor + Vetor (comprimentos múltiplos) recicla (repete) o menor para igualar ao maior.\n" +
                        "🔴 OPERAÇÕES COM NA: Qualquer operação aritmética ou lógica que envolva NA resulta em NA."
        ));

        // VÍDEO 03 - FUNÇÕES rep(), seq(), sample()
        lista.add(new Flashcard(
                "📘 Linguagem R - rep() e seq()",
                "R_REP_SEQ",
                "🧭 Funções de Repetição e Sequência",
                "📌 FUNÇÃO rep() - REPETIÇÃO:\n" +
                        "🟢 rep(x, times): Repete o vetor x inteiro 'times' vezes. Ex: rep(5, 3) -> 5 5 5\n" +
                        "🔵 rep(vetor, times): Repete cada elemento do vetor o número de vezes especificado. Ex: rep(c(1,3), c(3,2)) -> 1,1,1,3,3\n" +
                        "🟠 FUNÇÃO seq() - SEQUÊNCIA: Cria sequências numéricas. seq(from, to, by). Ex: seq(-1, 1, 0.5) -> -1, -0.5, 0, 0.5, 1\n" +
                        "🔴 NÚMERO DE ELEMENTOS: (fim - início) / passo + 1. Ex: seq(10,20,1) tem 11 elementos."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - sample()",
                "R_SAMPLE",
                "🧭 Amostragem Aleatória e Reprodutibilidade",
                "📌 FUNÇÃO sample() - AMOSTRAGEM:\n" +
                        "🟢 sample(x, size): Extrai 'size' elementos aleatórios de x.\n" +
                        "🔵 sample(x, size, replace = FALSE): Extrai elementos sem reposição (comum para sorteios). Ex: sample(1:60, 6) para Mega-Sena.\n" +
                        "🟠 set.seed(n): Define uma 'semente' para o gerador de números aleatórios, garantindo reprodutibilidade.\n" +
                        "🔴 REGRA DE OURO: Se um código usa sample(), a banca pode definir set.seed() para fixar o resultado."
        ));

        // VÍDEO 04 - MATRIZES: CRIAÇÃO E OPERAÇÕES
        lista.add(new Flashcard(
                "📘 Linguagem R - Matrizes",
                "R_MATRIZES_CRIACAO",
                "🧭 Criação de Matrizes e Combinação",
                "📌 CRIANDO MATRIZES:\n" +
                        "🟢 matrix(dados, nrow, ncol): Cria matriz a partir de um vetor. PREENCHIMENTO POR COLUNA (padrão). Use byrow=TRUE para preencher por linha.\n" +
                        "🔵 cbind(vetor1, vetor2, ...): Combina vetores como COLUNAS.\n" +
                        "🟠 rbind(vetor1, vetor2, ...): Combina vetores como LINHAS.\n" +
                        "🔴 dim(vetor) <- c(nrow, ncol): Converte um vetor em matriz.\n" +
                        "💡 MATRIZ: Estrutura bidimensional e homogênea (um tipo apenas). Indexação: matriz[linha, coluna]."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Operações com Matrizes",
                "R_MAT_OPERACOES",
                "🧭 Operações Matemáticas com Matrizes",
                "📌 OPERAÇÕES COM MATRIZES:\n" +
                        "🟢 ADIÇÃO/SUBTRAÇÃO: A + B ou A - B (elemento a elemento). Condição: Mesmas dimensões.\n" +
                        "🔵 MULTIPLICAÇÃO POR ESCALAR: k * A (multiplica cada elemento por k).\n" +
                        "🟠 MULTIPLICAÇÃO MATRICIAL: A %*% B. Condição: nº colunas de A = nº linhas de B. Resultado: m x p.\n" +
                        "🔴 NÃO CONFUNDA: A * B é multiplicação elemento a elemento (Hadamard); A %*% B é multiplicação matricial."
        ));

        // VÍDEO 05 - MATRIZES AVANÇADAS E DATAFRAMES
        lista.add(new Flashcard(
                "📘 Linguagem R - diag() e det()",
                "R_DIAG_DET",
                "🧭 Diagonal, Determinante e Arrays 3D",
                "📌 FUNÇÕES PARA MATRIZES:\n" +
                        "🟢 diag(matriz): Retorna um vetor com os elementos da diagonal principal. Ex: diag(matrix(1:16,4,4)) -> c(1,6,11,16)\n" +
                        "🔵 diag(matriz) <- novo_vetor: Substitui a diagonal principal pelos valores do vetor.\n" +
                        "🟠 det(matriz): Calcula o determinante de matrizes quadradas.\n" +
                        "🔴 MATRIZES MULTIDIMENSIONAIS (ARRAY): array(dados, dim = c(linhas, colunas, paginas)). Acesso: arr[linha, coluna, pagina]."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Dataframes",
                "R_DATAFRAMES",
                "🧭 Tabelas Heterogêneas: Criação e Manipulação",
                "📌 DATAFRAMES (TABELAS HETEROGÊNEAS):\n" +
                        "🟢 Criação: data.frame(coluna1 = vetor1, coluna2 = vetor2, ...).\n" +
                        "🔵 Acessar coluna (nome): df$nome_coluna (retorna vetor).\n" +
                        "🟠 Acessar coluna (índice): df[, coluna] (vetor) ou df[[coluna]] (vetor). df[3] retorna a 3ª coluna como dataframe.\n" +
                        "🔴 FILTRAR LINHAS: df[df$idade > 30, ] (NÃO ESQUEÇA a vírgula!).\n" +
                        "💡 DIFERENÇA: MATRIZ = homogênea. DATAFRAME = heterogêneo (tipos por coluna)."
        ));

        // VÍDEO 06 - FUNÇÕES ESTATÍSTICAS BÁSICAS
        lista.add(new Flashcard(
                "📘 Linguagem R - Estatística",
                "R_ESTATISTICAS",
                "🧭 Funções Estatísticas do R Base",
                "📌 PRINCIPAIS FUNÇÕES ESTATÍSTICAS:\n" +
                        "🟢 sum(x): Soma de todos os elementos.\n" +
                        "🔵 mean(x): Média aritmética.\n" +
                        "🟠 median(x): Mediana (valor central).\n" +
                        "🔴 min(x): Menor valor. max(x): Maior valor.\n" +
                        "🟣 var(x): Variância amostral (divide por n-1).\n" +
                        "⚫ sd(x): Desvio padrão amostral (raiz da variância).\n" +
                        "🟡 summary(x): Resumo estatístico (mínimo, quartis, mediana, média, máximo)."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Estatística (Cálculos)",
                "R_CALC_ESTAT",
                "🧭 Como Calcular Medidas Estatísticas Manualmente",
                "📌 CÁLCULO DAS MEDIDAS:\n" +
                        "🟢 MÉDIA: Soma dos valores / quantidade. Ex: (46+33+29+40+32)/5 = 36\n" +
                        "🔵 MEDIANA: Valor central da lista ordenada. Se n for par, média dos dois centrais.\n" +
                        "🟠 AMPLITUDE: max(x) - min(x). Ex: 46 - 29 = 17\n" +
                        "🔴 VARIÂNCIA AMOSTRAL: Σ(xi - média)² / (n - 1). Ex: 190/4 = 47.5\n" +
                        "💡 O R calcula VARIÂNCIA AMOSTRAL por padrão. Para populacional: var(x) * (n-1)/n"
        ));

        // VÍDEO 07 - GRÁFICOS BÁSICOS
        lista.add(new Flashcard(
                "📘 Linguagem R - Gráficos Base",
                "R_GRAFICOS_BASE",
                "🧭 Gráficos da Instalação Base do R",
                "📌 GRÁFICOS BASE DO R:\n" +
                        "🟢 barplot(vetor): Gráfico de barras verticais. Use horiz=TRUE para horizontais.\n" +
                        "🔵 pie(vetor): Gráfico de pizza (setores).\n" +
                        "🟠 plot(x, y): Gráfico de dispersão (pontos). Exige dois vetores de mesmo comprimento.\n" +
                        "🔴 boxplot(vetor): Diagrama de caixa (boxplot). Mostra mínimo, Q1, mediana, Q3, máximo e outliers.\n" +
                        "💡 ggplot2: Pacote adicional para gráficos avançados (funções com geom_)."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Boxplot",
                "R_BOXPLOT",
                "🧭 Interpretação do Diagrama de Caixa",
                "📌 COMPONENTES DO BOXPLOT:\n" +
                        "🟢 CAIXA: Representa o intervalo interquartil (Q1 a Q3).\n" +
                        "🔵 LINHA NA CAIXA: É a MEDIANA (Q2).\n" +
                        "🟠 BIGODES: Linhas que saem da caixa, representando valores MÍNIMO e MÁXIMO (não outliers).\n" +
                        "🔴 OUTLIERS: Pontos isolados fora dos bigodes (valores atípicos).\n" +
                        "💡 ORDEM: Mínimo → Q1 → Mediana → Q3 → Máximo."
        ));

        // VÍDEO 08 - HISTOGRAMAS
        lista.add(new Flashcard(
                "📘 Linguagem R - Histogramas",
                "R_HISTOGRAMA",
                "🧭 Conceito e Função hist()",
                "📌 HISTOGRAMA:\n" +
                        "🟢 Gráfico de barras JUSTAPOSTAS (sem espaços) para distribuição de frequências de variável quantitativa contínua.\n" +
                        "🔵 EIXO X: Classes/intervalos de valores (mesma amplitude). EIXO Y: Frequência (absoluta ou relativa).\n" +
                        "🟠 FUNÇÃO NO R: hist(vetor).\n" +
                        "🔴 REGRA DE INCLUSÃO NO R: 1ª classe: [lim_inf, lim_sup] (fechada em ambos). Demais classes: (lim_inf, lim_sup] (aberta à esquerda, fechada à direita)."
        ));

        // VÍDEO 09 - IMPORTAÇÃO E EXPORTAÇÃO DE DADOS
        lista.add(new Flashcard(
                "📘 Linguagem R - CSV",
                "R_CSV",
                "🧭 Importar e Exportar Arquivos CSV",
                "📌 DIRETÓRIO DE TRABALHO:\n" +
                        "🟢 getwd(): Retorna o diretório atual.\n" +
                        "🔵 setwd('caminho'): Altera o diretório. Use BARRA (/) para caminhos (padrão Linux).\n" +
                        "🟠 EXPORTAR CSV: write.csv() (padrão US: vírgula e ponto). write.csv2() (padrão BR: ponto e vírgula e vírgula).\n" +
                        "🔴 IMPORTAR CSV: read.csv() (padrão US). read.csv2() (padrão BR). Use sep e dec para personalizar.\n" +
                        "💡 head(df): Exibe as primeiras 6 linhas (cabeçalho + dados)."
        ));

        // VÍDEO 10 - PRÁTICA COM DADOS REAIS
        lista.add(new Flashcard(
                "📘 Linguagem R - Dados Reais",
                "R_DADOS_REAIS",
                "🧭 Prática com Dados Governamentais",
                "📌 FLUXO DE TRABALHO COM DADOS REAIS:\n" +
                        "🟢 IMPORTAR: read.csv2() para arquivos brasileiros (separador ; e decimal ,).\n" +
                        "🔵 FILTRAR: dados$coluna[dados$ano == 2023] para cálculos específicos.\n" +
                        "🟠 GRÁFICOS: Use barplot() para poucas categorias e hist() para dados contínuos/muitos valores.\n" +
                        "🔴 hist(vetor, breaks = n): Sugere o número aproximado de classes no histograma."
        ));

        // VÍDEO 11 - CORRELAÇÃO E REGRESSÃO LINEAR
        lista.add(new Flashcard(
                "📘 Linguagem R - Correlação",
                "R_CORRELACAO",
                "🧭 Coeficiente de Correlação - cor()",
                "📌 CORRELAÇÃO:\n" +
                        "🟢 cor(x, y): Calcula o coeficiente de correlação entre x e y.\n" +
                        "🔵 INTERPRETAÇÃO: Próximo de +1 = correlação positiva forte; próximo de -1 = negativa forte; próximo de 0 = fraca.\n" +
                        "🟠 CORRELAÇÃO POSITIVA: X ↑ → Y ↑. CORRELAÇÃO NEGATIVA: X ↑ → Y ↓.\n" +
                        "🔴 FORÇA: |r| > 0.6 = forte (recomenda regressão). 0.3 < |r| ≤ 0.6 = moderada/fraca. |r| ≤ 0.3 = inconclusiva."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Regressão",
                "R_REGRESSAO",
                "🧭 Modelo Linear e Predições - lm() e predict()",
                "📌 REGRESSÃO LINEAR:\n" +
                        "🟢 lm(y ~ x, data = df): Ajusta modelo de regressão linear simples.\n" +
                        "🔵 lm(y ~ x1 + x2, data = df): Regressão linear múltipla (várias variáveis independentes).\n" +
                        "🟠 O operador TIL (~) SEPARA a variável dependente (Y) das independentes (X).\n" +
                        "🔴 PREDIÇÃO: predict(modelo, newdata = data.frame(x = valor)).\n" +
                        "💡 NUNCA use '=' ou '>' no lm(); use sempre '~'."
        ));

        // VÍDEO 12 - ESTRUTURAS DE CONTROLE E FUNÇÕES
        lista.add(new Flashcard(
                "📘 Linguagem R - Condicionais",
                "R_CONDICIONAIS",
                "🧭 Estruturas if, else e ifelse()",
                "📌 ESTRUTURAS CONDICIONAIS:\n" +
                        "🟢 if (condicao) { comandos }: Executa se condição for TRUE.\n" +
                        "🔵 if (condicao) { cmd1 } else { cmd2 }: Executa cmd1 se TRUE, cmd2 se FALSE.\n" +
                        "🟠 if (c1) { cmd1 } else if (c2) { cmd2 } else { cmd3 }: Múltiplas condições em sequência.\n" +
                        "🔴 ifelse(condicao, valor_TRUE, valor_FALSE): VETORIZADO. Retorna um vetor com resultados para cada elemento.\n" +
                        "💡 O 'else' DEVE estar na MESMA LINHA do '}' que o antecede."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Laços de Repetição",
                "R_LACOS",
                "🧭 for, while e repeat",
                "📌 ESTRUTURAS DE REPETIÇÃO:\n" +
                        "🟢 for (var in vetor) { comandos }: Número determinado de repetições.\n" +
                        "🔵 while (condicao) { comandos }: Repete enquanto condição for TRUE.\n" +
                        "🟠 repeat { comandos; if (condicao) break }: Executa pelo menos uma vez. Use 'break' para sair.\n" +
                        "🔴 CONTROLE DE FLUXO: 'break' interrompe o laço; 'next' pula para a próxima iteração."
        ));

        lista.add(new Flashcard(
                "📘 Linguagem R - Funções",
                "R_FUNCOES",
                "🧭 Criando Funções Próprias e Recursividade",
                "📌 CRIANDO FUNÇÕES:\n" +
                        "🟢 nome <- function(parametros) { comandos }: Define uma função.\n" +
                        "🔵 return(valor): Especifica o valor de saída da função (opcional; se omitido, retorna o último valor).\n" +
                        "🟠 FUNÇÃO RECURSIVA: Função que chama a si mesma. Precisa de um CASO BASE para interromper a recursão.\n" +
                        "🔴 EXEMPLO (FATORIAL): fatorial <- function(n) { if (n == 0) { return(1) } else { return(n * fatorial(n-1)) } }"
        ));

        // VÍDEO 13 - PACOTES
        lista.add(new Flashcard(
                "📘 Linguagem R - Pacotes",
                "R_PACOTES",
                "🧭 Instalação, Carregamento e Principais Pacotes",
                "📌 PACOTES (PACKAGES):\n" +
                        "🟢 INSTALAÇÃO: install.packages('nome_do_pacote') (com aspas, feito uma vez).\n" +
                        "🔵 CARREGAMENTO: library(nome_do_pacote) (sem aspas, feito toda sessão).\n" +
                        "🟠 PRINCIPAIS PACOTES: ggplot2 (gráficos), dplyr (manipulação), tidyr (limpeza), readr (CSV), readxl (Excel), lubridate (datas).\n" +
                        "🔴 PACOTE BASE: JÁ VEM COM O R e NÃO precisa instalar/carregar (ex: stats, graphics)."
        ));

        return lista;
    }
}
