package com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class PythonBibliotecasVariadasFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ==================== VÍDEO 01 - NUMPY (VISÃO GERAL E COBRANÇA) ====================
        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_DEFINICAO",
                "🧭 NumPy - Visão Geral",
                "📌 NumPy é biblioteca para computação científica.\n" +
                        "🔢 Principal estrutura: ndarray (array N-dimensional).\n" +
                        "⚡ Operações vetorizadas em C → MUITO mais rápido que listas Python.\n" +
                        "💾 ndarray são homogêneos (todos elementos do mesmo tipo)."
        ));

        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_CRIACAO",
                "🧭 NumPy - Criação de Arrays",
                "📌 np.array([1, 2, 3, 4]) → cria um array corretamente.\n" +
                        "Exemplo: np.array([1, 2, 3, 4]) → array([1, 2, 3, 4]).\n\n" +

                        "❌ np.array(1, 2, 3, 4) → gera erro.\n" +
                        "Exemplo: TypeError: array() takes from 1 to 2 positional arguments.\n\n" +

                        "📌 np.arange(início, fim, passo) → cria uma sequência de valores.\n" +
                        "Exemplo: np.arange(1, 6, 1) → [1, 2, 3, 4, 5].\n\n" +

                        "⚠️ O valor final é excluído.\n" +
                        "Exemplo: np.arange(0, 10, 2) → [0, 2, 4, 6, 8]."
        ));

        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_ATRIBUTOS",
                "🧭 NumPy - Atributos do ndarray",
                "📌 .shape → dimensões do array.\n" +
                        "Exemplo: np.array([[1,2,3],[4,5,6]]).shape → (2, 3).\n\n" +

                        "📌 .ndim → número de dimensões (eixos).\n" +
                        "Exemplo: np.array([[1,2,3],[4,5,6]]).ndim → 2.\n\n" +

                        "📌 .size → número total de elementos.\n" +
                        "Exemplo: np.array([[1,2,3],[4,5,6]]).size → 6.\n\n" +

                        "📌 .dtype → tipo dos elementos.\n" +
                        "Exemplo: np.array([1,2,3]).dtype → int64."
        ));

        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_FILTRO",
                "🧭 NumPy - Filtro com Condição",
                "📌 a = np.array([10,40,15,12,4,5,78,8,20]).\n\n" +

                        "📌 a[a > 10] → retorna apenas os valores maiores que 10.\n" +
                        "Exemplo: [40, 15, 12, 78, 20].\n\n" +

                        "⚠️ O resultado é sempre um array unidimensional.\n" +
                        "Exemplo: a[a > 10].shape → (5,).\n\n" +

                        "🔄 Funciona para arrays de qualquer dimensão."
        ));

        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_COMPARACAO",
                "🧭 Lista Python vs ndarray NumPy",
                "📌 Velocidade: NumPy MUITO mais rápido (operações em C).\n" +
                        "📌 Sintaxe: NumPy mais enxuta (ex: array * 2 em 1 linha).\n" +
                        "📌 Memória: NumPy consome menos memória.\n" +
                        "📌 Homogeneidade: NumPy é homogêneo; lista Python é heterogênea."
        ));

        // ==================== VÍDEO 02 - SCIPY E PANDAS ====================
        lista.add(new Flashcard(
                "📘 Python - SciPy",
                "SCIPY_ECOSSISTEMA",
                "🧭 SciPy - Ecossistema",
                "📌 SciPy é ecossistema open source para matemática/ciência.\n" +
                        "🔧 Componentes: NumPy, Pandas, Matplotlib, IPython, SymPy.\n" +
                        "📌 Pacotes: special, integrate, interpolate, linalg, spatial.\n" +
                        "⚠️ Para concursos área geral: foco conceitual, não funções específicas."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_ESTRUTURAS",
                "🧭 Pandas - Series e DataFrame",
                "📌 Series → estrutura unidimensional com rótulos (labels).\n" +
                        "Exemplo: pd.Series([10,20,30], index=['A','B','C']) → A:10, B:20, C:30.\n\n" +

                        "📌 DataFrame → estrutura bidimensional (linhas e colunas).\n" +
                        "Exemplo:\n" +
                        "Nome  Idade\n" +
                        "Ana     20\n" +
                        "João    25\n\n" +

                        "📌 Criação de Series.\n" +
                        "Exemplo: pd.Series([1,3,5], index=['A','B','C']).\n\n" +

                        "📌 Criação de DataFrame.\n" +
                        "Exemplo: pd.DataFrame({'Nome':['Ana','João'], 'Idade':[20,25]})."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_SERIES",
                "🧭 Pandas - Series (1D com Labels)",
                "📌 série['Rafa'] → acessa o valor pelo label.\n" +
                        "Exemplo: série = pd.Series([8,9,10], index=['Ana','Rafa','João'])\n" +
                        "série['Rafa'] → 9.\n\n" +

                        "📌 série.array ou série.to_numpy() → retorna os valores da Series.\n" +
                        "Exemplo: série.to_numpy() → [8, 9, 10].\n\n" +

                        "📌 Operações vetorizadas → aplicam a operação em todos os elementos.\n" +
                        "Exemplo: série + 1 → [9, 10, 11].\n\n" +

                        "📌 Métodos estatísticos.\n" +
                        "Exemplo: série.mean() → 9.0 | série.sum() → 27 | série.median() → 9.0."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_ACESSO",
                "🧭 Pandas - Acesso a Colunas",
                "📌 Exemplo:\n" +
                        "df = pd.DataFrame({'Nome':['Ana','João'], 'Idade':[20,25]}).\n\n" +

                        "📌 Uma coluna: df['Nome'] → retorna uma Series.\n" +
                        "Exemplo: ['Ana', 'João'].\n\n" +

                        "📌 Múltiplas colunas: df[['Nome', 'Idade']] → retorna um DataFrame.\n" +
                        "Exemplo:\n" +
                        "Nome  Idade\n" +
                        "Ana     20\n" +
                        "João    25\n\n" +

                        "❌ df['Nome', 'Idade'] → gera erro.\n" +
                        "Exemplo: use colchetes duplos: df[['Nome', 'Idade']]."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_CSV",
                "🧭 Pandas - Leitura de CSV",
                "📌 Arquivo alunos.csv:\n" +
                        "Nome,Idade,Nota\n" +
                        "Ana,20,8.5\n" +
                        "João,22,7.0\n" +
                        "Maria,21,9.2\n\n" +

                        "📌 Leitura padrão (separador = vírgula).\n" +
                        "Exemplo: df = pd.read_csv('alunos.csv').\n\n" +

                        "⚠️ Se o arquivo usar ';':\n" +
                        "Nome;Idade;Nota\n" +
                        "Ana;20;8.5\n" +
                        "João;22;7.0\n" +
                        "Maria;21;9.2\n" +
                        "Exemplo: df = pd.read_csv('alunos.csv', sep=';').\n\n" +

                        "📌 df.info() → informações das colunas.\n" +
                        "Exemplo:\n" +
                        "3 entradas, 3 colunas\n" +
                        "Nome(object), Idade(int64), Nota(float64).\n\n" +

                        "📌 df.shape → quantidade de linhas e colunas.\n" +
                        "Exemplo: (3, 3).\n\n" +

                        "📌 df.head() → primeiras linhas.\n" +
                        "Exemplo:\n" +
                        "Ana  20  8.5\n" +
                        "João 22  7.0\n" +
                        "Maria 21 9.2\n\n" +

                        "📌 df.tail() → últimas linhas.\n" +
                        "Exemplo:\n" +
                        "Ana  20  8.5\n" +
                        "João 22  7.0\n" +
                        "Maria 21 9.2\n\n" +

                        "📌 df.describe() → estatísticas das colunas numéricas.\n" +
                        "Exemplo:\n" +
                        "Idade: média = 21\n" +
                        "Nota: média = 8.23."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_METODOS",
                "🧭 Pandas - Métodos Principais",
                "📌 Considere o DataFrame:\n" +
                        "Nome  Idade  Nota\n" +
                        "Ana     20    8.5\n" +
                        "João    22    7.0\n" +
                        "Maria   21    9.2\n\n" +

                        "📌 df.info() → mostra informações do DataFrame.\n" +
                        "Exemplo:\n" +
                        "3 entradas, 3 colunas\n" +
                        "Nome(object), Idade(int64), Nota(float64).\n\n" +

                        "📌 df.shape → retorna (linhas, colunas).\n" +
                        "Exemplo: (3, 3).\n\n" +

                        "📌 df.head(2) → primeiras 2 linhas.\n" +
                        "Exemplo:\n" +
                        "Ana   20   8.5\n" +
                        "João  22   7.0\n\n" +

                        "📌 df.tail(2) → últimas 2 linhas.\n" +
                        "Exemplo:\n" +
                        "João  22   7.0\n" +
                        "Maria 21   9.2\n\n" +

                        "📌 df.describe() → estatísticas das colunas numéricas.\n" +
                        "Exemplo:\n" +
                        "Idade: média=21, mín=20, máx=22\n" +
                        "Nota: média=8.23, mín=7.0, máx=9.2."
        ));

        // ==================== VÍDEO 03 - RESOLUÇÃO DE QUESTÕES ====================
        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_PILHAS",
                "🧭 Questão - Transferência entre Pilhas",
                "📌 P1 = [50,40,30,20,10] (topo no final).\n" +
                        "📌 Para transferir mantendo ordem: P2.append(P1[-1]) + del P1[-1].\n" +
                        "⚠️ pop() inverteria a ordem! (ficaria [10,20,30,40,50]).\n" +
                        "✅ Gabarito: alternativa B (recursiva com append + del)."
        ));

        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_DATAFRAME",
                "🧭 Questão - Acesso a Colunas DataFrame",
                "📌 Acessar colunas: df[['país', 'ano', 'renda_per_capita']].\n" +
                        "📌 Colchetes DUPLOS para múltiplas colunas.\n" +
                        "❌ df['país', 'ano'] → GERA ERRO!\n" +
                        "✅ Gabarito: df[['país', 'ano', 'renda_per_capita', 'expectativa_de_vida']]."
        ));

        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_FILTRO_NDARRAY",
                "🧭 Questão - Filtro em ndarray 3D",
                "📌 arr[arr > 5] → retorna array UNIDIMENSIONAL.\n" +
                        "📌 Independente da dimensão original do array.\n" +
                        "📌 Ex: array 3D com elementos → filtro retorna 1D.\n" +
                        "✅ Gabarito: array([6, 7, 8, 9, 10, 11, 12])."
        ));

        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_VETORIZADA",
                "🧭 Questão - Operações Vetorizadas",
                "📌 valor_aplicado * taxa_juros → multiplicação elemento a elemento.\n" +
                        "📌 [5000,6000,7000,8000] * [1,2,3,4] = [5000,12000,21000,32000].\n" +
                        "📌 Operações vetorizadas são ELEMENTO A ELEMENTO.\n" +
                        "✅ Gabarito: array([5000, 12000, 21000, 32000])."
        ));

        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_STD",
                "🧭 Questão - Desvio Padrão (Nível Hard)",
                "📌 np.std(dados) → desvio padrão populacional (ddof=0 padrão).\n" +
                        "📌 np.std(dados, ddof=1) → desvio padrão AMOSTRAL.\n" +
                        "📌 ddof = Delta Degrees of Freedom.\n" +
                        "✅ Questão CERTA: código retorna desvio padrão amostral."
        ));

        lista.add(new Flashcard(
                "📘 Python - Questões",
                "QUESTAO_MEDIANA",
                "🧭 Questão - Mediana e Eixos",
                "📌 np.median(matriz, axis=0) → calcula mediana ao longo das COLUNAS.\n" +
                        "📌 axis=0 → vertical (colunas). axis=1 → horizontal (linhas).\n" +
                        "📌 Matriz [[1,2,3],[2,2,3],[4,7,8]] → colunas: [1,2,4] med=2.\n" +
                        "✅ Questão CERTA: retorna array([2, 2, 3])."
        ));

        // ==================== VÍDEO 04 - REVISÃO NUMPY E PANDAS ====================
        lista.add(new Flashcard(
                "📘 Python - Revisão",
                "REVISAO_ESTRATEGIA",
                "🧭 Estratégia de Estudo - Concursos",
                "📌 NumPy e Pandas são interseção de TODOS os editais.\n" +
                        "📌 Área geral: foco conceitual e sintaxe básica.\n" +
                        "📌 TI: aprofundar em funções específicas (std, median, axis).\n" +
                        "📌 Pré-requisito: Python básico (listas, dicts, loops, funções)."
        ));

        lista.add(new Flashcard(
                "📘 Python - Revisão",
                "REVISAO_NUMPY",
                "🧭 Revisão NumPy - Principais Conceitos",
                "📌 Criação: np.array([...]) e np.arange().\n" +
                        "📌 Atributos: .shape, .ndim, .size, .dtype.\n" +
                        "📌 Filtro: arr[arr > X] → retorna 1D.\n" +
                        "📌 Arrays são homogêneos (tipos mistos NÃO permitidos)."
        ));

        lista.add(new Flashcard(
                "📘 Python - Revisão",
                "REVISAO_PANDAS",
                "🧭 Revisão Pandas - Principais Conceitos",
                "📌 Series: 1D com labels. DataFrame: 2D tabular.\n" +
                        "📌 Acesso 1 coluna: df['col'] → Series.\n" +
                        "📌 Acesso N colunas: df[['col1','col2']] → DataFrame.\n" +
                        "📌 Leitura CSV: pd.read_csv('arq.csv', delimiter=';')."
        ));

        lista.add(new Flashcard(
                "📘 Python - Revisão",
                "REVISAO_PRIORIDADES",
                "🧭 O que vale a pena memorizar",
                "🔴 PRIORIDADE ALTA: np.array([...]), .shape, .ndim, .size.\n" +
                        "🔴 PRIORIDADE ALTA: filtro arr[arr>X] retorna 1D.\n" +
                        "🔴 PRIORIDADE ALTA: df[['col1','col2']] (colchetes duplos).\n" +
                        "🟡 PRIORIDADE MÉDIA: reshape(), operações vetorizadas, read_csv.\n" +
                        "🟢 PRIORIDADE BAIXA: std(), median() com parâmetros específicos."
        ));

        // ==================== VÍDEO 05 - REVISÃO SCIPY E PANDAS ====================
        lista.add(new Flashcard(
                "📘 Python - SciPy",
                "SCIPY_COMPONENTES",
                "🧭 SciPy - Componentes do Ecossistema",
                "📌 NumPy → arrays multidimensionais e operações matemáticas.\n" +
                        "📌 Pandas → análise e manipulação de dados tabulares.\n" +
                        "📌 Matplotlib → criação de gráficos e visualização.\n" +
                        "📌 SymPy → matemática simbólica (cálculo algébrico).\n" +
                        "📌 IPython → console interativo aprimorado."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_OPERACOES",
                "🧭 Pandas - Operações com Series/DataFrame",
                "📌 .drop_duplicates() → remove valores duplicados.\n" +
                        "📌 .append() → adiciona novo elemento à Series.\n" +
                        "📌 .isin(['valor1','valor2']) → verifica existência de valores.\n" +
                        "📌 .index → índices (labels) das linhas.\n" +
                        "📌 .columns → nomes das colunas."
        ));

        lista.add(new Flashcard(
                "📘 Python - Pandas",
                "PANDAS_SERIES_VS_DATAFRAME",
                "🧭 Series vs DataFrame - Comparação",
                "📌 Series é 1D com labels → wrapper do ndarray.\n" +
                        "📌 DataFrame é 2D tabular → coleção de Series.\n" +
                        "📌 type(df['col']) → pandas.core.series.Series.\n" +
                        "📌 type(df[['col1','col2']]) → pandas.core.frame.DataFrame."
        ));

        // ==================== VÍDEO 06 - SCIKIT-LEARN E CONCEITOS DE ML ====================
        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_DEFINICAO",
                "🧭 Scikit-Learn - Machine Learning",
                "📌 Biblioteca Python para Machine Learning clássico.\n" +
                        "📌 NÃO é para Deep Learning (use TensorFlow/PyTorch).\n" +
                        "🔢 Integra-se com NumPy e Pandas.\n" +
                        "📌 Principais tarefas: Classificação, Regressão, Clusterização."
        ));

        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_TAREFAS",
                "🧭 Tarefas de Machine Learning",
                "📌 CLASSIFICAÇÃO: supervisionado, categorias pré-definidas.\n" +
                        "📌 REGRESSÃO: supervisionado, valores numéricos contínuos.\n" +
                        "📌 CLUSTERIZAÇÃO: não supervisionado, agrupamento por similaridade.\n" +
                        "📌 ASSOCIAÇÃO: não supervisionado, co-ocorrência entre itens."
        ));

        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_ALGORITMOS",
                "🧭 Algoritmos por Tarefa",
                "📌 Classificação: Naive Bayes, KNN, Árvore de Decisão, SVM.\n" +
                        "📌 Regressão: Regressão Linear, DecisionTreeRegressor.\n" +
                        "📌 Clusterização: K-Means, DBSCAN, Hierarchical Clustering.\n" +
                        "📌 Associação: Apriori, FP-Growth."
        ));

        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_FLUXO",
                "🧭 Fluxo de Trabalho Scikit-Learn",
                "📌 1. Importar algoritmo (from sklearn.tree import DecisionTreeClassifier).\n" +
                        "📌 2. Criar classificador: clf = DecisionTreeClassifier().\n" +
                        "📌 3. Treinar: clf.fit(X, y) → OBRIGATÓRIO antes de prever!\n" +
                        "📌 4. Prever: clf.predict([[novo_dado]]) → ERRO se não treinar!"
        ));

        // ==================== VÍDEO 07 - IMPLEMENTAÇÃO PRÁTICA ====================
        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_EXEMPLO",
                "🧭 Exemplo Prático - Árvore de Decisão",
                "📌 Características: [peso, textura] (0=rugosa, 1=lisa).\n" +
                        "📌 Dados: [155,0] laranja, [180,0] laranja, [135,1] maçã, [110,1] maçã.\n" +
                        "📌 clf.fit(caracteristicas, categorias) → treina o modelo.\n" +
                        "📌 clf.predict([[150,0]]) → prevê [1] = laranja."
        ));

        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_PREVISOES",
                "🧭 Previsões - Comportamento do Modelo",
                "📌 [150,0] → laranja (peso alto + rugosa).\n" +
                        "📌 [80,0] → maçã (peso baixo).\n" +
                        "📌 [110,1] → maçã (peso baixo + lisa).\n" +
                        "📌 [300,1] → laranja (peso muito alto)."
        ));

        lista.add(new Flashcard(
                "📘 Python - Scikit-Learn",
                "SKLEARN_ERRO_COMUM",
                "🧭 Erro Comum - Modelo Não Treinado",
                "📌 clf = DecisionTreeClassifier()\n" +
                        "📌 clf.predict([[150,0]]) → ERRO!\n" +
                        "📌 Mensagem: 'not fitted yet'.\n" +
                        "✅ Correção: clf.fit(X, y) ANTES de prever!"
        ));

        // ==================== IA / ML / DL ====================
        lista.add(new Flashcard(
                "📘 Inteligência Artificial",
                "IA_ML_DL",
                "🧭 IA, Machine Learning e Deep Learning",
                "📌 IA → conceito mais amplo (máquinas agem como humanos).\n" +
                        "📌 ML → subconjunto da IA (aprende com dados estruturados).\n" +
                        "📌 DL → subconjunto do ML (redes neurais profundas).\n" +
                        "📌 DL trabalha com dados NÃO estruturados (imagens, áudio, texto)."
        ));

        lista.add(new Flashcard(
                "📘 Inteligência Artificial",
                "ML_VS_DL",
                "🧭 Machine Learning vs Deep Learning",
                "📌 ML: mais intervenção humana, dados estruturados.\n" +
                        "📌 DL: aprende sozinho, dados não estruturados, mais autonomia.\n" +
                        "📌 ML: hardware menos exigente, treino mais rápido.\n" +
                        "📌 DL: GPUs, treino demorado, decisão quase simultânea."
        ));

        lista.add(new Flashcard(
                "📘 Inteligência Artificial",
                "ML_TIPO_DADOS",
                "🧭 Dados - ML vs DL",
                "📌 Machine Learning: prefere dados ESTRUTURADOS (tabelas, planilhas).\n" +
                        "📌 Deep Learning: trabalha com dados ESTRUTURADOS e NÃO ESTRUTURADOS.\n" +
                        "📌 Dados não estruturados: imagens, áudio, texto, vídeos.\n" +
                        "📌 Big Data → DL se destaca com grandes volumes."
        ));

        // ==================== CILADAS ====================
        lista.add(new Flashcard(
                "📘 Ciladas - NumPy/Pandas",
                "CILADA_NUMPY_PANDAS",
                "🧭 Principais Ciladas - Antídotos",
                "📌 np.array(1,2,3) → ERRADO! Use np.array([1,2,3]).\n" +
                        "📌 df['col1','col2'] → ERRO! Use df[['col1','col2']].\n" +
                        "📌 arr[arr > X] → SEMPRE retorna array UNIDIMENSIONAL.\n" +
                        "📌 read_csv sem especificar ; → PODE dar erro se delimitador for ;."
        ));

        lista.add(new Flashcard(
                "📘 Ciladas - Scikit-Learn",
                "CILADA_SKLEARN",
                "🧭 Ciladas Scikit-Learn",
                "📌 .predict() sem .fit() → ERRO 'not fitted yet'.\n" +
                        "📌 Confundir Classificação (categorias) com Regressão (números).\n" +
                        "📌 Scikit-Learn NÃO é para Deep Learning.\n" +
                        "📌 DecisionTreeClassifier vs DecisionTreeRegressor."
        ));

        lista.add(new Flashcard(
                "📘 Ciladas - IA/ML",
                "CILADA_IA_ML_DL",
                "🧭 Ciladas IA, ML e DL",
                "📌 Confundir ML com DL: DL é subconjunto do ML.\n" +
                        "📌 Supervisionado vs Não Supervisionado: labels definem a diferença.\n" +
                        "📌 Clusterização vs Associação: similaridade vs co-ocorrência.\n" +
                        "📌 Scikit-Learn (ML clássico) ≠ TensorFlow (Deep Learning)."
        ));

        // ==================== CONCEITOS GERAIS ====================
        lista.add(new Flashcard(
                "📘 Python - Conceitos Gerais",
                "PYTHON_CARACTERISTICAS",
                "🧭 Características do Python",
                "📌 Python é linguagem de ALTO NÍVEL.\n" +
                        "📌 Possui bibliotecas como Pandas, NumPy, Scikit-Learn.\n" +
                        "📌 Sintaxe simples e intuitiva.\n" +
                        "📌 Uma das linguagens mais utilizadas (atrás apenas de JavaScript)."
        ));

        lista.add(new Flashcard(
                "📘 Python - Conceitos Gerais",
                "PYTHON_BIBLIOTECAS",
                "🧭 Bibliotecas Python - Finalidades",
                "📌 NumPy → arrays multidimensionais e operações matemáticas.\n" +
                        "📌 Pandas → análise e manipulação de dados tabulares.\n" +
                        "📌 Scikit-Learn → Machine Learning clássico.\n" +
                        "📌 TensorFlow/PyTorch → Deep Learning (redes neurais).\n" +
                        "📌 Matplotlib → visualização de dados (gráficos)."
        ));

        lista.add(new Flashcard(
                "📘 Python - MLOps",
                "MLOPS",
                "🧭 MLOps - Machine Learning Operations",
                "📌 Prática de integrar desenvolvimento de ML com operações.\n" +
                        "📌 Etapas: 1. Design do Projeto, 2. Desenvolvimento, 3. Operação.\n" +
                        "📌 Similar ao DevOps para Machine Learning.\n" +
                        "📌 Tema trending (em alta) em concursos."
        ));

        lista.add(new Flashcard(
                "📘 Python - Data Mining",
                "DATA_MINING",
                "🧭 Data Mining - Mineração de Dados",
                "📌 Processo de explorar grandes volumes de dados (Big Data).\n" +
                        "📌 Objetivo: descobrir padrões e tendências não facilmente visíveis.\n" +
                        "📌 ML é uma das técnicas utilizadas em Data Mining.\n" +
                        "📌 Inclui etapas: preparação, limpeza, visualização e análise."
        ));

        // ==================== EIXOS E PARÂMETROS ====================
        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_AXIS",
                "🧭 Eixos (axis) no NumPy",
                "📌 axis=0 → calcula estatística ao longo das COLUNAS (vertical).\n" +
                        "📌 axis=1 → calcula estatística ao longo das LINHAS (horizontal).\n" +
                        "📌 Ex: np.median(matriz, axis=0) → mediana de cada coluna.\n" +
                        "📌 Ex: np.mean(matriz, axis=1) → média de cada linha."
        ));

        lista.add(new Flashcard(
                "📘 Python - NumPy",
                "NUMPY_DDOF",
                "🧭 ddof - Desvio Padrão",
                "📌 ddof = Delta Degrees of Freedom (graus de liberdade).\n" +
                        "📌 ddof=0 (padrão) → desvio padrão POPULACIONAL.\n" +
                        "📌 ddof=1 → desvio padrão AMOSTRAL.\n" +
                        "📌 np.std(dados, ddof=1) → amostral."
        ));

        // ==================== PALAVRAS-CHAVE PARA PROVAS ====================
        lista.add(new Flashcard(
                "📘 Python - Palavras-chave",
                "KEYWORDS_CLASSIFICACAO",
                "🧭 Classificação - Palavras-chave",
                "📌 CLASSES PRÉ-DEFINIDAS.\n" +
                        "📌 SUPERVISIONADO.\n" +
                        "📌 CATEGORIZAÇÃO.\n" +
                        "📌 Algoritmos: Naive Bayes, KNN, Árvore de Decisão, SVM."
        ));

        lista.add(new Flashcard(
                "📘 Python - Palavras-chave",
                "KEYWORDS_REGRESSAO",
                "🧭 Regressão - Palavras-chave",
                "📌 VALORES REAIS / CONTÍNUOS.\n" +
                        "📌 SUPERVISIONADO.\n" +
                        "📌 PREVISÃO NUMÉRICA.\n" +
                        "📌 Algoritmos: Regressão Linear, DecisionTreeRegressor."
        ));

        lista.add(new Flashcard(
                "📘 Python - Palavras-chave",
                "KEYWORDS_CLUSTERIZACAO",
                "🧭 Clusterização - Palavras-chave",
                "📌 NÃO SUPERVISIONADO.\n" +
                        "📌 AGRUPAMENTO POR SIMILARIDADE.\n" +
                        "📌 AGREGAÇÃO DE SEMELHANTES.\n" +
                        "📌 Algoritmos: K-Means, DBSCAN, Hierarchical Clustering."
        ));

        lista.add(new Flashcard(
                "📘 Python - Palavras-chave",
                "KEYWORDS_ASSOCIACAO",
                "🧭 Associação - Palavras-chave",
                "📌 NÃO SUPERVISIONADO.\n" +
                        "📌 CO-OCORRÊNCIA.\n" +
                        "📌 RELAÇÕES ENTRE ITENS.\n" +
                        "📌 REGRAS DE ASSOCIAÇÃO.\n" +
                        "📌 Ex: 'quem compra fraldas também compra cerveja'.\n" +
                        "📌 Algoritmos: Apriori, FP-Growth."
        ));

        // ==================== CONCURSOS E EDITAS ====================
        lista.add(new Flashcard(
                "📘 Python - Concursos",
                "CONCURSOS_EDITAIS",
                "🧭 Editais e Bibliotecas Cobradas",
                "📌 TCU (área geral): NLTK, TensorFlow, Pandas, NumPy, PyTorch.\n" +
                        "📌 Caixa (TI): Pandas, NumPy, SciPy, Matplotlib.\n" +
                        "📌 Banco do Brasil (TI): Pandas, NumPy, SciPy, Matplotlib, TF, PyTorch.\n" +
                        "📌 Banespa (TI): NumPy, Pandas, Scikit-Learn.\n" +
                        "🔴 NumPy e Pandas → INTERSEÇÃO DE TODOS OS CONCURSOS!"
        ));

        return lista;
    }
}