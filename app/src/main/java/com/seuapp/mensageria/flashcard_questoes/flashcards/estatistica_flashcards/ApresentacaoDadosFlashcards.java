package com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ApresentacaoDadosFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // VÍDEO 01 - NOMENCLATURA BÁSICA DA ESTATÍSTICA
        // ============================================================

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_ESTATISTICA_DESCRITIVA",
                "📋 Estatística Descritiva",
                "📌 RESPONSABILIDADE: Coleta, organização, descrição e resumo dos dados observados.\n" +
                        "🔑 MACETE: COLETAR + ORGANIZAR + RESUMIR."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_ESTATISTICA_PROBABILISTICA",
                "🎲 Estatística Probabilística",
                "📌 RESPONSABILIDADE: Estabelecer o modelo matemático adotado para explicar fenômenos aleatórios.\n" +
                        "🔑 MACETE: MODELO MATEMÁTICO + FENÔMENOS ALEATÓRIOS."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_ESTATISTICA_INFERENCIAL",
                "🔎 Estatística Inferencial",
                "📌 RESPONSABILIDADE: Análise e interpretação dos dados.\n" +
                        "🔑 MACETE: ANALISAR + INTERPRETAR."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_POPULACAO_AMOSTRA",
                "🧭 População vs Amostra",
                "📌 POPULAÇÃO: Conjunto COMPLETO de todos os elementos.\n" +
                        "📌 AMOSTRA: Subconjunto PRÓPRIO (parte que NÃO é o todo).\n" +
                        "🔑 MACETE: TUDO vs PEDAÇO/PARTE."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_CENSO_AMOSTRAGEM",
                "🧭 Censo vs Amostragem",
                "📌 CENSO: Pesquisa que utiliza TODA a população.\n" +
                        "📌 AMOSTRAGEM: Ato/processo de selecionar e analisar uma AMOSTRA.\n" +
                        "🔑 MACETE: TOTAL vs AÇÃO DE ESCOLHER."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_PARAMETRO_ESTATISTICA",
                "🧭 Parâmetro vs Estatística",
                "📌 PARÂMETRO: Medida numérica que descreve a POPULAÇÃO (valor geralmente DESCONHECIDO).\n\n" +
                        "💡 Exemplo:\n" +
                        "Uma universidade possui 10.000 alunos.\n" +
                        "A média REAL da altura de TODOS os alunos é 1,72 m.\n" +
                        "➡ Essa média de 1,72 m é um PARÂMETRO, pois representa toda a população.\n\n" +
                        "📌 ESTATÍSTICA (ou ESTIMATIVA): Medida numérica calculada a partir de uma AMOSTRA (valor CONHECIDO).\n\n" +
                        "💡 Exemplo:\n" +
                        "Você mede a altura de apenas 100 alunos e encontra média de 1,70 m.\n" +
                        "➡ Essa média de 1,70 m é uma ESTATÍSTICA/ESTIMATIVA, pois foi calculada usando apenas uma amostra.\n\n" +
                        "🎯 Objetivo: usar a estatística da amostra para ESTIMAR o parâmetro da população.\n\n" +
                        "🔑 MACETE:\n" +
                        "👥 População → Parâmetro\n" +
                        "🧪 Amostra → Estatística (Estimativa)"
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_MOTIVOS_AMOSTRAGEM",
                "🧭 3 Motivos para usar Amostragem",
                "💰 ECONÔMICO: Censo é caro.\n" +
                        "⏰ TEMPORAL: Censo é demorado.\n" +
                        "💥 DESTRUTIVO: Censo destrói o produto.\n" +
                        "🔑 MACETE: E.T.D. (Econômico, Temporal, Destrutivo)."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_CILADA_POPULACAO",
                "🧭 População - Cilada",
                "⚠️ CILADA: Pensar que população NÃO tem características em comum.\n" +
                        "✅ ANTÍDOTO: População tem PELO MENOS UMA característica em comum.\n" +
                        "🔑 MACETE: População = elementos com CARACTERÍSTICA COMUM."
        ));

        lista.add(new Flashcard(
                "📊 Estatística - Nomenclatura",
                "APRESENTACAO_DADOS_CILADA_AMOSTRA",
                "🧭 Amostra - Cilada",
                "⚠️ CILADA: Achar que amostra pode ser qualquer parte.\n" +
                        "✅ ANTÍDOTO: Amostra é subconjunto PRÓPRIO (NUNCA igual à população).\n" +
                        "🔑 MACETE: Amostra ≠ População (sempre menor)."
        ));

        // ============================================================
        // VÍDEO 02 - APRESENTAÇÃO DE DADOS (TABELAS E GRÁFICOS)
        // ============================================================

        lista.add(new Flashcard(
                "📊 Apresentação de Dados",
                "APRESENTACAO_DADOS_FORMAS_APRESENTACAO",
                "🧭 Formas de Apresentar Dados",
                "📋 FORMA TABULAR: Dados organizados em TABELAS (linhas e colunas).\n" +
                        "📈 FORMA GRÁFICA: Dados representados por GRÁFICOS.\n" +
                        "🔑 MACETE: Só existem DUAS formas: TABULAR e GRÁFICA."
        ));

        lista.add(new Flashcard(
                "📊 Apresentação de Dados",
                "APRESENTACAO_DADOS_ELEMENTOS_TABELA",
                "🧭 Elementos Obrigatórios da Tabela",
                "📌 TÍTULO: Responde O QUÊ? QUANDO? ONDE? (obrigatório).\n" +
                        "📌 CABEÇALHO: Parte superior, especifica conteúdo das colunas.\n" +
                        "📌 COLUNA INDICADORA: Primeira coluna, indica a que se refere cada dado.\n" +
                        "📌 CORPO: Os números/dados coletados.\n" +
                        "📌 FONTE: Quem fez a pesquisa  (Obrigatório - dá credibilidade).\n"+
                        "🔑 TABELA: Apresenta dados de modo RESUMIDO e SEGURO."
        ));

        lista.add(new Flashcard(
                "📊 Apresentação de Dados",
                "APRESENTACAO_DADOS_TITULO_TABELA",
                "🧭 Título da Tabela",
                "❓ O Título deve responder a 3 perguntas:\n" +
                        "📌 O QUÊ? (assunto da pesquisa)\n" +
                        "📌 QUANDO? (ano/período)\n" +
                        "📌 ONDE? (local)\n" +
                        "✅ EXEMPLO: 'Número de separações judiciais nas regiões do Brasil em 2011'."
        ));

        lista.add(new Flashcard(
                "📊 Apresentação de Dados",
                "APRESENTACAO_DADOS_ELEMENTOS_OPCIONAIS",
                "🧭 Elementos Opcionais",
                "📌 INFORMAÇÕES COMPLEMENTARES: Notas adicionais abaixo da tabela (OPCIONAL).\n" +
                        "📌 LEGENDA (Gráfico): Explicação dos símbolos/cores (OPCIONAL).\n" +
                        "🔑 MACETE: Só aparecem se houver algo a complementar."
        ));

        lista.add(new Flashcard(
                "📊 Apresentação de Dados",
                "APRESENTACAO_DADOS_CILADA_TABELA",
                "🧭 Tabela - Ciladas",
                "⚠️ CILADA: Achar que fonte é opcional.\n" +
                        "✅ ANTÍDOTO: Fonte é OBRIGATÓRIA (sem fonte = sem credibilidade).\n" +
                        "⚠️ CILADA: Confundir cabeçalho com título.\n" +
                        "✅ ANTÍDOTO: TÍTULO = acima da tabela; CABEÇALHO = parte superior (conteúdo das colunas).\n" +
                        "⚠️ CILADA: Confundir coluna indicadora com cabeçalho.\n" +
                        "✅ ANTÍDOTO: COLUNA INDICADORA = primeira coluna."
        ));

        // ============================================================
        // VÍDEO 03 - MÉTODO EXPERIMENTAL E MÉTODO ESTATÍSTICO
        // ============================================================

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_METODO_EXPERIMENTAL",
                "🧭 Método Experimental",
                "🔬 DEFINIÇÃO: Conjunto de procedimentos para verificar uma hipótese.\n\n" +
                        "💡 Exemplo:\n" +
                        "Hipótese: 'Um novo suplemento aumenta a força muscular.'\n" +
                        "Os pesquisadores dividem pessoas em dois grupos.\n" +
                        "• Grupo A: recebe o suplemento.\n" +
                        "• Grupo B: recebe placebo.\n\n" +
                        "Para saber se a diferença foi causada APENAS pelo suplemento, todos fazem o mesmo treino, comem a mesma dieta, dormem as mesmas horas e treinam no mesmo período.\n\n" +
                        "🎯 CARACTERÍSTICA: O pesquisador controla as demais variáveis para que apenas uma delas (o suplemento) explique o resultado.\n\n" +
                        "🔑 MACETE: MUDA apenas UMA variável; o restante permanece igual."
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_METODO_ESTATISTICO",
                "🧭 Método Estatístico",
                "📊 DEFINIÇÃO: Método usado quando NÃO é possível controlar todas as variáveis.\n" +
                        "📐 CARACTERÍSTICA: Calcula a influência de cada variável.\n" +
                        "📉 EXEMPLO: Preço da mercadoria (oferta, procura, câmbio, inflação, crises).\n" +
                        "🔑 MACETE: NÃO CONTROLA (calcula influência)."
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_VARS_DEPENDENTE_INDEPENDENTE",
                "🧭 Variáveis Dependente vs Independente",
                "🎯 VARIÁVEL INDEPENDENTE: É a variável que o pesquisador altera ou controla (CAUSA).\n\n" +
                        "🎯 VARIÁVEL DEPENDENTE: É a variável observada, que pode mudar em consequência da independente (EFEITO).\n\n" +
                        "💡 Exemplo:\n" +
                        "Hipótese: 'O hormônio aumenta a massa muscular.'\n" +
                        "• O pesquisador decide quem recebe hormônio ou placebo.\n" +
                        "➡ Hormônio = VARIÁVEL INDEPENDENTE.\n\n" +
                        "Depois de alguns meses, mede-se a massa muscular dos participantes.\n" +
                        "➡ Massa muscular = VARIÁVEL DEPENDENTE, pois seu resultado DEPENDE do uso (ou não) do hormônio.\n\n" +
                        "🔑 MACETE:\n" +
                        "CAUSA → Independente\n" +
                        "EFEITO → Dependente"
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_ETAPAS_EXPERIMENTAL",
                "🧭 Etapas do Método Experimental",
                "👁️ 1. OBSERVAÇÃO: Percepção inicial de um padrão (VER).\n" +
                        "❓ 2. PROBLEMATIZAÇÃO: Identificar fatores que influenciam (PERGUNTAR).\n" +
                        "💡 3. HIPÓTESE: Formulação da relação causa-efeito (ACHAR).\n" +
                        "🧪 4. EXPERIMENTAÇÃO: Execução da pesquisa (TESTAR).\n" +
                        "📝 5. TEORIA: Conclusão final (CONCLUSÃO)."
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_ETAPAS_ESTATISTICO",
                "🧭 Etapas do Método Estatístico",
                "📥 1. COLETA: Recolher os dados.\n" +
                        "🔍 2. CRÍTICA: Verificar veracidade (externa) e qualidade da pergunta (interna).\n" +
                        "📊 3. APURAÇÃO: Organizar os dados.\n" +
                        "📋 4. APRESENTAÇÃO: Tabelas e gráficos.\n" +
                        "📈 5. ANÁLISE: Interpretar os resultados."
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_NIVEIS_MANIPULACAO",
                "🧭 Níveis de Manipulação Var Independente",
                "✅ PRESENÇA/AUSÊNCIA: Com ou sem a variável.\n" +
                        "📊 MAIS DE 2 NÍVEIS: Escalas (ex: 0mg, 50mg, 100mg).\n" +
                        "🔄 MODALIDADE: Marcas diferentes (ex: marcas A, B, C).\n" +
                        "🔑 MACETE: PRESENÇA, MAIS DE 2, MODALIDADE."
        ));

        lista.add(new Flashcard(
                "📊 Métodos Estatísticos",
                "APRESENTACAO_DADOS_EXEMPLO_UNICO_MEDICAMENTO",
                "🧭 Exemplo Integrado: Teste de um Novo Medicamento",
                "🏥 SITUAÇÃO:\n" +
                        "Pesquisadores querem descobrir se um novo medicamento reduz a pressão arterial.\n\n" +

                        "👁️ 1. OBSERVAÇÃO (VER):\n" +
                        "Percebem que pacientes que usam o medicamento parecem ter pressão menor.\n\n" +

                        "❓ 2. PROBLEMATIZAÇÃO (PERGUNTAR):\n" +
                        "\"A redução da pressão foi causada pelo medicamento ou por outros fatores, como alimentação, exercícios ou idade?\"\n\n" +

                        "💡 3. HIPÓTESE (ACHAR):\n" +
                        "\"O novo medicamento reduz a pressão arterial.\"\n\n" +

                        "🧪 4. EXPERIMENTAÇÃO (TESTAR):\n" +
                        "Os participantes são divididos em dois grupos:\n" +
                        "• Grupo A: recebe o novo medicamento.\n" +
                        "• Grupo B: recebe placebo.\n\n" +

                        "Para que apenas o medicamento explique o resultado, todos seguem a mesma dieta, praticam os mesmos exercícios, dormem o mesmo tempo e realizam as medições nos mesmos horários.\n\n" +

                        "🎯 MÉTODO EXPERIMENTAL:\n" +
                        "O pesquisador controla as demais variáveis para descobrir se o medicamento é realmente a causa da redução da pressão.\n\n" +

                        "📌 VARIÁVEL INDEPENDENTE (CAUSA):\n" +
                        "Uso do medicamento (quem recebe e quem não recebe).\n\n" +

                        "📌 VARIÁVEL DEPENDENTE (EFEITO):\n" +
                        "Pressão arterial medida ao final do estudo.\nEla DEPENDE do uso (ou não) do medicamento.\n\n" +

                        "📊 NÍVEIS DA VARIÁVEL INDEPENDENTE:\n" +
                        "• Presença/Ausência → Medicamento ou placebo.\n" +
                        "• Mais de 2 níveis → 0 mg, 50 mg e 100 mg.\n" +
                        "• Modalidade → Medicamento A, B ou C.\n\n" +

                        "📝 5. TEORIA (CONCLUSÃO):\n" +
                        "Após analisar os resultados, conclui-se se o medicamento realmente reduz a pressão arterial.\n\n" +

                        "📈 SE NÃO FOR POSSÍVEL CONTROLAR TUDO...\n" +
                        "Em um estudo com milhares de pessoas vivendo normalmente, não é possível controlar alimentação, exercícios, estresse, idade, entre outros fatores.\n" +
                        "Nesse caso utiliza-se o MÉTODO ESTATÍSTICO, que calcula a influência de cada variável sobre o resultado.\n\n" +

                        "📊 ETAPAS DO MÉTODO ESTATÍSTICO:\n" +
                        "1. Coleta dos dados.\n" +
                        "2. Crítica (verificar qualidade e veracidade).\n" +
                        "3. Apuração (organização).\n" +
                        "4. Apresentação (tabelas e gráficos).\n" +
                        "5. Análise (interpretação).\n\n" +

                        "🔑 RESUMÃO:\n" +
                        "Método Experimental = CONTROLA as variáveis.\n" +
                        "Método Estatístico = NÃO controla; CALCULA a influência.\n" +
                        "Variável Independente = CAUSA.\n" +
                        "Variável Dependente = EFEITO."
        ));

        // ============================================================
        // VÍDEO 04 - DADOS ESTATÍSTICOS
        // ============================================================

        lista.add(new Flashcard(
                "📊 Dados Estatísticos",
                "APRESENTACAO_DADOS_DADO_ESTATISTICO",
                "🧭 Dado Estatístico",
                "📌 DEFINIÇÃO: Toda informação coletada ao longo da pesquisa.\n" +
                        "📌 É a MATÉRIA-PRIMA da estatística.\n" +
                        "🔢 Pode ser NUMÉRICO (idade) ou NÃO NUMÉRICO (cidade onde nasceu).\n" +
                        "🔑 MACETE: INFORMAÇÃO COLETADA."
        ));

        lista.add(new Flashcard(
                "📊 Dados Estatísticos",
                "APRESENTACAO_DADOS_FORMAS_OBTENCAO",
                "🧭 Formas de Obtenção de Dados",
                "👀 OBSERVAÇÃO/LEVANTAMENTO: Medir ou perguntar algo que JÁ EXISTE (ex: estatura).\n" +
                        "🔬 EXPERIMENTO: CRIAR uma situação para testar (ex: vacina).\n" +
                        "💻 SIMULAÇÃO: Reproduzir artificialmente (ex: simulador de voo)."
        ));

        lista.add(new Flashcard(
                "📊 Dados Estatísticos",
                "APRESENTACAO_DADOS_CLASSIFICACAO_TEMPO",
                "🧭 Classificação Quanto ao Tempo",
                "🔄 CONTÍNUA: Ocorre SEM INTERRUPÇÃO (ex: registro de acidentes).\n" +
                        "📅 PERIÓDICA: Ocorre em INTERVALOS REGULARES (ex: Censo a cada 10 anos).\n" +
                        "📌 OCASIONAL: Ocorre UMA ÚNICA VEZ (ex: pesquisa de campanha).\n" +
                        "🔑 MACETE: PARA SEMPRE vs DE TEMPO EM TEMPO vs UMA VEZ SÓ."
        ));

        lista.add(new Flashcard(
                "📊 Dados Estatísticos",
                "APRESENTACAO_DADOS_DADO_BRUTO_ROL",
                "🧭 Dado Bruto vs Rol",
                "📦 DADO BRUTO: Dados coletados do jeito que vieram, DESORGANIZADOS.\n" +
                        "📋 ROL: Dados ORGANIZADOS segundo algum critério (ex: ordem crescente).\n" +
                        "🔑 MACETE: BRUTO = DESORGANIZADO; ROL = ORGANIZADO."
        ));

        // ============================================================
        // VÍDEO 05 - VARIÁVEIS ESTATÍSTICAS
        // ============================================================

        lista.add(new Flashcard(
                "📊 Variáveis Estatísticas",
                "APRESENTACAO_DADOS_VARS_QUANTITATIVAS",
                "🧭 Variáveis Quantitativas",
                "🔢 DISCRETA: Só assume VALORES INTEIROS (redondos).\n" +
                        "👶 EXEMPLOS: Número de filhos, número de carros.\n" +
                        "📊 CONTÍNUA: Pode assumir VALORES QUEBRADOS (fracionários).\n" +
                        "💰 EXEMPLOS: Salário (R$ 2.952,70), estatura (1,79 m).\n" +
                        "🔑 MACETE: DISCRETA = SÓ REDONDO; CONTÍNUA = ACEITA QUEBRADO."
        ));

        lista.add(new Flashcard(
                "📊 Variáveis Estatísticas",
                "APRESENTACAO_DADOS_VARS_QUALITATIVAS",
                "🧭 Variáveis Qualitativas",
                "🏷️ NOMINAL: Categorias SEM ORDEM entre si.\n" +
                        "🎨 EXEMPLOS: Cor preferida, estado civil, time de futebol.\n" +
                        "📊 ORDINAL: Categorias COM ORDEM (hierarquia).\n" +
                        "🎓 EXEMPLOS: Grau de escolaridade, classe social.\n" +
                        "🔑 MACETE: NOMINAL = SEM ORDEM; ORDINAL = COM ORDEM."
        ));

        lista.add(new Flashcard(
                "📊 Variáveis Estatísticas",
                "APRESENTACAO_DADOS_PEGADINHA_NUMEROS",
                "🧭 Pegadinha - Números de Registro",
                "🚨 NÚMEROS que NÃO são quantitativos (são QUALITATIVOS NORMAIS):\n" +
                        "🆔 CPF, RG, CNH, Título de Eleitor, CEP, Número da Sessão de Votação.\n" +
                        "📌 Motivo: São números de REGISTRO, não expressam quantidade.\n" +
                        "🔑 MACETE: CPF, RG, CEP, CNH = QUALITATIVA NOMINAL!"
        ));

        lista.add(new Flashcard(
                "📊 Variáveis Estatísticas",
                "APRESENTACAO_DADOS_ARVORE_DECISORIA",
                "🧭 Árvore Decisória - Classificação",
                "🔢 PASSO 1: É uma QUANTIDADE? → SIM = Quantitativa / NÃO = Qualitativa.\n" +
                        "📊 PASSO 2 (Quantitativa): Aceita número quebrado? → NÃO = Discreta / SIM = Contínua.\n" +
                        "🏷️ PASSO 3 (Qualitativa): Existe ordem? → NÃO = Nominal / SIM = Ordinal.\n" +
                        "🔑 MACETE: QUANTIDADE → QUEBRADO? → ORDEM?"
        ));

        // ============================================================
        // VÍDEO 06 - SÉRIES ESTATÍSTICAS
        // ============================================================

        lista.add(new Flashcard(
                "📊 Séries Estatísticas",
                "APRESENTACAO_DADOS_SERIE_ESTATISTICA",
                "🧭 Série Estatística",
                "📋 DEFINIÇÃO: Tabela que apresenta dados em função de 3 fatores:\n" +
                        "⏰ TEMPO (época), 📍 LOCAL (espaço) e 📂 ESPÉCIE (categoria).\n" +
                        "📌 COLUNA INDICADORA: Primeira coluna da tabela, DEFINE o tipo da série.\n" +
                        "🔑 REGRA DE OURO: Olhe a PRIMEIRA COLUNA → o que varia nela define a série."
        ));

        lista.add(new Flashcard(
                "📊 Séries Estatísticas",
                "APRESENTACAO_DADOS_TIPOS_SERIE",
                "🧭 Tipos de Séries Estatísticas",
                "⏰ TEMPORAL (Cronológica ou Histórica): varia o TEMPO.\n" +
                        "Ex.: Número de acidentes de trânsito no Brasil de 2020 a 2025.\n\n" +

                        "📍 GEOGRÁFICA (De Localização): varia o LOCAL.\n" +
                        "Ex.: População dos estados brasileiros em 2025.\n\n" +

                        "📂 ESPECÍFICA (Categórica): varia a ESPÉCIE ou CATEGORIA.\n" +
                        "Ex.: Quantidade de alunos por curso (Direito, Medicina, Engenharia).\n\n" +

                        "🔀 CONJUGADA (Mista): varia DOIS ou mais fatores simultaneamente.\n" +
                        "Ex.: Número de casos de dengue por estado e por ano."
        ));

        lista.add(new Flashcard(
                "📊 Séries Estatísticas",
                "APRESENTACAO_DADOS_FATORES_FIXOS",
                "🧭 Fatores Fixos nas Séries",
                "⏰ TEMPORAL: LOCAL e ESPÉCIE são fixos; TEMPO varia.\n" +
                        "📍 GEOGRÁFICA: TEMPO e ESPÉCIE são fixos; LOCAL varia.\n" +
                        "📂 ESPECÍFICA: TEMPO e LOCAL são fixos; ESPÉCIE varia.\n" +
                        "🔑 MACETE: Só UM fator varia em cada série pura."
        ));

        // ============================================================
        // VÍDEO 07 - DISTRIBUIÇÕES DE FREQUÊNCIA
        // ============================================================

        lista.add(new Flashcard(
                "📊 Distribuições de Frequência",
                "APRESENTACAO_DADOS_DISTRIBUICAO_FREQUENCIA",
                "🧭 Distribuição de Frequência",
                "📋 DEFINIÇÃO: Arranjo/divisão dos valores de uma variável entre categorias.\n" +
                        "📂 CLASSE: Cada categoria ou intervalo da tabela. (linha da tabela)\n" +
                        "📐 ELEMENTOS DA CLASSE: Limite Inferior (li), Limite Superior (ls), Ponto Médio (xi = (li+ls)/2), Amplitude (h = ls - li).\n" +
                        "⚠️ SÍMBOLO |- Limite superior NÃO ESTÁ INCLUÍDO na classe."
        ));

        lista.add(new Flashcard(
                "📊 Distribuições de Frequência",
                "APRESENTACAO_DADOS_FREQUENCIA_ABSOLUTA_RELATIVA",
                "🧭 Frequência Absoluta vs Relativa",
                "🔢 FREQUÊNCIA ABSOLUTA/PONTUAL (fi): Número de vezes que cada valor aparece (QUANTIDADE).\n" +
                        "📊 FREQUÊNCIA RELATIVA/INTERVALAR (fri): Percentual que cada classe representa (fri = fi ÷ total).\n" +
                        "📌 Soma das relativas = 1 (100%).\n" +
                        "🔑 MACETE: ABSOLUTA = CONTAGEM; RELATIVA = PERCENTUAL."
        ));

        lista.add(new Flashcard(
                "📊 Distribuições de Frequência",
                "APRESENTACAO_DADOS_FREQUENCIA_ACUMULADA",
                "🧭 Frequência Acumulada",
                "📊 FREQUÊNCIA ACUMULADA (Fi): Soma das frequências de todas as classes anteriores até a atual.\n" +
                        "📌 Última Fi = TOTAL (n).\n" +
                        "📌 Pode ser acumulada (absoluta) ou relativa.\n" +
                        "🔑 MACETE: SOMA PROGRESSIVA."
        ));

        lista.add(new Flashcard(
                "📊 Distribuições de Frequência",
                "APRESENTACAO_DADOS_DENSIDADE_FREQUENCIA",
                "🧭 Densidade de Frequência",
                "📐 DEFINIÇÃO: Ajusta a frequência pela amplitude da classe.\n\n" +

                        "📊 FÓRMULA: Densidade = fi ÷ h\n\n" +

                        "📚 EXEMPLO:\n" +
                        "Classe 0–10 → fi = 20, h = 10 → Densidade = 2\n" +
                        "Classe 10–30 → fi = 30, h = 20 → Densidade = 1,5\n\n" +

                        "⚠️ Mesmo tendo frequência maior (30), a segunda classe possui MENOR densidade porque sua amplitude é maior.\n\n" +

                        "🔑 QUANDO USAR: Apenas quando as classes possuem AMPLITUDES DIFERENTES.\n" +
                        "💡 MACETE: fi ÷ h (frequência dividida pela amplitude)."
        ));

        lista.add(new Flashcard(
                "📊 Distribuições de Frequência",
                "APRESENTACAO_DADOS_AMPLITUDE_TOTAL",
                "🧭 Amplitude Total vs Amplitude da Classe",
                "📐 AMPLITUDE DA CLASSE (h): ls - li (de UMA classe).\n" +
                        "📊 AMPLITUDE TOTAL (AT): Último ls - Primeiro li (de todas as classes).\n" +
                        "🔑 MACETE: CLASSE = uma; TOTAL = todas."
        ));

        // ============================================================
        // VÍDEO 08 - REPRESENTAÇÕES GRÁFICAS (PARTE 1)
        // ============================================================

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_BASTOES_HISTOGRAMA",
                "🧭 Bastões vs Histograma",
                "📊 GRÁFICO DE BASTÕES: Dados NÃO AGRUPADOS (valores fixos). Hastes SEPARADAS.\n" +
                        "📊 HISTOGRAMA: Dados AGRUPADOS em classes (intervalos). Colunas CONTÍGUAS (coladas).\n" +
                        "🔑 MACETE: BASTÕES = SEPARADOS; HISTOGRAMA = COLADOS.\n\n" +
                        "📝 EXEMPLO:\n" +
                        "Notas: 5, 6, 7, 8, 9.\n" +
                        "➡️ Representação correta: GRÁFICO DE BASTÕES (cada nota é um valor isolado).\n\n" +
                        "Idades agrupadas:\n" +
                        "0–10 | 10–20 | 20–30.\n" +
                        "➡️ Representação correta: HISTOGRAMA (dados em intervalos).\n\n" +
                        "✅ COMO RESOLVER:\n" +
                        "1️⃣ Verifique se os dados são valores individuais ou intervalos.\n" +
                        "2️⃣ Valores individuais → Bastões.\n" +
                        "3️⃣ Intervalos (classes) → Histograma."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_POLIGONO_OGIVA",
                "🧭 Polígono vs Ogiva",
                "📈 POLÍGONO DE FREQUÊNCIA: Liga os PONTOS MÉDIOS de cada classe.\n" +
                        "📈 OGIVA: Liga os LIMITES SUPERIORES com a FREQUÊNCIA ACUMULADA.\n" +
                        "📈 Ogiva é SEMPRE CRESCENTE (frequência acumulada só aumenta).\n" +
                        "🔑 MACETE: POLÍGONO = PONTOS MÉDIOS; OGIVA = LIMITES SUPERIORES.\n\n" +
                        "📝 EXEMPLO:\n" +
                        "Classes: 0–10, 10–20, 20–30.\n" +
                        "Frequências: 4, 6, 5.\n\n" +
                        "➡️ POLÍGONO:\n" +
                        "Pontos médios: 5, 15 e 25.\n" +
                        "Liga os pontos (5,4), (15,6) e (25,5).\n\n" +
                        "➡️ OGIVA:\n" +
                        "Frequência acumulada: 4, 10 e 15.\n" +
                        "Liga (10,4), (20,10) e (30,15).\n\n" +
                        "✅ COMO RESOLVER:\n" +
                        "1️⃣ Se pedir evolução da frequência → Polígono.\n" +
                        "2️⃣ Se pedir frequência acumulada ou percentual acumulado → Ogiva."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_HISTOGRAMA_AREA",
                "🧭 Área do Histograma",
                "📊 A soma das áreas das colunas é PROPORCIONAL à soma das frequências.\n" +
                        "📊 Com FREQUÊNCIA RELATIVA, a área total = 1 (100%).\n" +
                        "📊 Se as larguras das classes forem diferentes, a ALTURA deve ser ajustada para manter a proporcionalidade da área.\n" +
                        "🔑 MACETE: ÁREA representa a frequência.\n\n" +
                        "📝 EXEMPLO:\n" +
                        "Classe 10–20 possui largura 10 e frequência 30.\n" +
                        "Área = 30.\n" +
                        "Altura = Área ÷ Largura = 30 ÷ 10 = 3.\n\n" +
                        "Classe 20–40 possui largura 20 e frequência 40.\n" +
                        "Área = 40.\n" +
                        "Altura = 40 ÷ 20 = 2.\n\n" +
                        "✅ COMO RESOLVER:\n" +
                        "1️⃣ Identifique a largura da classe.\n" +
                        "2️⃣ Use: Altura = Frequência ÷ Largura.\n" +
                        "3️⃣ Verifique que a área (altura × largura) corresponde à frequência."
        ));

        // ============================================================
        // VÍDEO 09 - REPRESENTAÇÕES GRÁFICAS (PARTE 2)
        // ============================================================

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_GRAFICOS_QUALITATIVOS",
                "🧭 Gráficos para Variáveis Qualitativas",
                "📊 GRÁFICO DE COLUNAS: Barras VERTICAIS, separadas (EM PÉ).\n" +
                        "📊 GRÁFICO DE BARRAS: Barras HORIZONTAIS, separadas (DEITADO).\n" +
                        "🥧 GRÁFICO DE SETORES/PIZZA: Círculo dividido em setores (PARTES DO TODO).\n" +
                        "🔑 MACETE: QUALITATIVA = COLUNAS, BARRAS ou PIZZA."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_GRAFICO_LINHA_DISPERSAO",
                "🧭 Linhas vs Dispersão",
                "📈 GRÁFICO DE LINHAS: Mostra a evolução de uma variável ao longo do TEMPO.\n" +
                        "📝 Ex.: Vendas mensais de uma loja.\n\n" +

                        "Vendas\n" +
                        "40 │            ●\n" +
                        "30 │        ●───┘\n" +
                        "20 │    ●───┘\n" +
                        "10 │ ●───┘\n" +
                        " 0 └──────────────────\n" +
                        "    Jan Fev Mar Abr\n\n" +

                        "📊 GRÁFICO DE DISPERSÃO: Relaciona DUAS variáveis quantitativas para verificar se existe correlação.\n" +
                        "📝 Ex.: Horas de estudo × Nota.\n\n" +

                        "Nota\n" +
                        "10 │            •\n" +
                        " 8 │         •\n" +
                        " 6 │      •\n" +
                        " 4 │   •\n" +
                        " 2 │ •\n" +
                        " 0 └──────────────────\n" +
                        "    2  4  6  8 Horas\n\n" +

                        "📈 CORRELAÇÃO:\n" +
                        "✔ Positiva (↑↑): Mais estudo → Maior nota.\n" +
                        "   •\n" +
                        "     •\n" +
                        "       •\n" +
                        "         •\n\n" +

                        "✔ Negativa (↑↓): Maior velocidade → Menor tempo.\n" +
                        "         •\n" +
                        "       •\n" +
                        "     •\n" +
                        "   •\n\n" +

                        "✔ Nula: Número do calçado → Nota.\n" +
                        "   •      •\n" +
                        "      •\n" +
                        " •         •\n" +
                        "     •\n\n" +

                        "🔑 MACETE:\n" +
                        "✔ LINHAS = TEMPO (evolução).\n" +
                        "✔ DISPERSÃO = DUAS VARIÁVEIS QUANTITATIVAS.\n" +
                        "✔ POSITIVA = ↑↑ | NEGATIVA = ↑↓ | NULA = sem relação."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_CARTOGRAMA_PICTOGRAMA",
                "🧭 Cartograma e Pictograma",
                "🗺️ CARTOGRAMA: Mapa DISTORCIDO conforme a variável estudada.\n" +
                        "🎨 PICTOGRAMA: Desenhos/símbolos substituem números (mantém proporcionalidade).\n" +
                        "🔑 MACETE: CARTOGRAMA = MAPA DISTORCIDO; PICTOGRAMA = DESENHOS."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_GRAFICO_POLAR_RAMO",
                "🧭 Polar e Ramo-Folhas",
                "🎯 GRÁFICO POLAR: Círculos concêntricos ligados por linha (dados CÍCLICOS).\n" +
                        "🌿 DIAGRAMA DE RAMO-FOLHAS: Organiza dados quantitativos em RAMO (parte inteira) e FOLHA (decimal).\n" +
                        "📌 Regras: Ordem crescente; NÃO PULE ramos.\n" +
                        "🔑 MACETE: POLAR = CÍRCULOS CONCÊNTRICOS; RAMO-FOLHAS = ORGANIZA POR ORDEM."
        ));

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_CALCULO_SETORES",
                "🧭 Cálculo do Ângulo - Setores",
                "📐 FÓRMULA: Ângulo = (fi ÷ Total) × 360°.\n" +
                        "📊 REGRA DE TRÊS: Total está para 360° assim como fi está para x°.\n" +
                        "📌 Soma de todos os ângulos = 360°.\n" +
                        "✅ EXEMPLO: (5 ÷ 50) × 360 = 36°."
        ));

        // ============================================================
        // VÍDEO 09 - CILADAS (GRÁFICOS)
        // ============================================================

        lista.add(new Flashcard(
                "📊 Representações Gráficas",
                "APRESENTACAO_DADOS_CILADAS_GRAFICOS",
                "🧭 Ciladas - Gráficos",
                "⚠️ CILADA: Achar que setores servem para quantitativas.\n" +
                        "✅ ANTÍDOTO: Setores são para QUALITATIVAS (partes do todo).\n" +
                        "⚠️ CILADA: Colunas e barras são a mesma coisa.\n" +
                        "✅ ANTÍDOTO: COLUNAS = vertical; BARRAS = horizontal.\n" +
                        "⚠️ CILADA: Gráfico de linhas não precisa de tempo.\n" +
                        "✅ ANTÍDOTO: Linhas = SÉRIE TEMPORAL."
        ));

        // ============================================================
        // FLASHCARDS DE REVISÃO RÁPIDA (BÔNUS)
        // ============================================================

        lista.add(new Flashcard(
                "📊 Revisão Rápida",
                "APRESENTACAO_DADOS_CONCEITOS_BASE",
                "🧭 Resumo de Bolso - Conceitos",
                "👥 POPULAÇÃO: Conjunto COMPLETO / TODOS os elementos.\n" +
                        "📌 AMOSTRA: Subconjunto PRÓPRIO / PARTE (NUNCA é o todo).\n" +
                        "📊 CENSO: Pesquisa com TODA a população.\n" +
                        "🎯 AMOSTRAGEM: Pesquisa com PARTE da população.\n" +
                        "📐 PARÂMETRO: Número que descreve a POPULAÇÃO (DESCONHECIDO).\n" +
                        "📈 ESTATÍSTICA: Número que descreve a AMOSTRA (CONHECIDO)."
        ));

        lista.add(new Flashcard(
                "📊 Revisão Rápida",
                "APRESENTACAO_DADOS_VARIAVEIS_RESUMO",
                "🧭 Resumo de Bolso - Variáveis",
                "🔢 QUANTITATIVA DISCRETA: Só número redondo (filhos, carros).\n" +
                        "📊 QUANTITATIVA CONTÍNUA: Aceita número quebrado (salário, estatura).\n" +
                        "🏷️ QUALITATIVA NOMINAL: Sem ordem (cor, time, estado civil).\n" +
                        "📊 QUALITATIVA ORDINAL: Com ordem (escolaridade, classe social).\n" +
                        "🚨 CPF, RG, CEP, CNH = QUALITATIVA NOMINAL (não é quantidade!)"
        ));


        return lista;
    }
}
