package com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class LinguagemPythonFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // VÍDEO 01 - INTRODUÇÃO E CONCEITOS FUNDAMENTAIS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONTEXTO_MERCADO",
                "🧭 Contexto e Níveis",
                "📌 Tendência desde 2017: Python substituiu Java/PHP.\n" +
                        "🐍 Nível Básico: Sintaxe, tipos, strings, condicionais, loops, listas, tuplas, dicionários, sets.\n" +
                        "📚 Nível Intermediário: I/O, banco de dados, ORM, OO.\n" +
                        "🚀 Nível Avançado: Web (Flask/Django), funcional, performance, Cloud Native."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONCEITOS_FUNDAMENTAIS",
                "🧭 Algoritmo e Paradigmas",
                "📌 ALGORITMO: Sequência lógica de passos (receita de bolo).\n" +
                        "📐 ESTRUTURADO: Foco em sequências, funções (maioria das provas).\n" +
                        "🏛️ ORIENTADO A OBJETOS: Classes, objetos, herança, encapsulamento, polimorfismo.\n" +
                        "⚡ FUNCIONAL: Funções puras, imutabilidade, lambdas.\n" +
                        "⚠️ Python é MULTIPARADIGMA: suporta os três."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LINGUAGENS_ALTO_BAIXO_NIVEL",
                "🧭 Alto vs Baixo Nível",
                "📌 ALTO NÍVEL: Próxima do humano, fácil, produtiva. Ex: Python, Java.\n" +
                        "⚙️ BAIXO NÍVEL: Próxima da máquina ('escova bits'), difícil. Ex: Assembly.\n" +
                        "🔄 TRADUTOR: Compilador/Interpretador converte código p/ 0 e 1."
        ));

        // ============================================================
        // VÍDEO 02 - SINTAXE, TIPAGEM E PALAVRAS RESERVADAS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "FUNCIONAMENTO_PYTHON",
                "🧭 Compilação + Interpretação",
                "📌 PYTHON: Compila (implícito) + Interpreta (explícito).\n" +
                        "⚙️ Código Fonte → Compilação → Byte Code (.pyc) → PVM → Execução.\n" +
                        "⚠️ NÃO é 'apenas interpretado'! Cabe recurso se a prova disser isso.\n" +
                        "💡 Estratégia: TI = compilado+interpretado; Área geral = aceite 'interpretado'."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "TIPAGEM_PYTHON",
                "🧭 Tipagem Dinâmica",
                "📌 ESTÁTICA: Tipo definido em compilação e não muda. Ex: Java.\n" +
                        "🔄 DINÂMICA: Tipo definido em execução e pode mudar. Ex: Python.\n" +
                        "📌 EXEMPLO: x = 10 (int); depois x = 'texto' (str) → VÁLIDO.\n" +
                        "🔍 type(x): Retorna o tipo da variável em tempo de execução."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "TIPOS_DADOS_BASICOS",
                "🧭 Tipos Primitivos",
                "🔢 int: idade = 10\n" +
                        "💲 float: preco = 1.1\n" +
                        "🔤 str: nome = 'Rafa' (aspas simples ou duplas)\n" +
                        "✅ bool: ativo = True / False (com maiúscula!)\n" +
                        "📋 list: [1, 2, 3] (mutável)\n" +
                        "📦 tuple: (1, 2, 3) (imutável)\n" +
                        "📚 dict: {'chave': 'valor'}\n" +
                        "🎯 set: {1, 2, 3} (não ordenado, sem duplicatas)"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "PALAVRAS_RESERVADAS",
                "🧭 Palavras-chave Fatais",
                "🔑 def → Define função\n" +
                        "🔑 class → Define classe\n" +
                        "🔑 if, elif, else → Condicionais\n" +
                        "🔑 for, while → Loops\n" +
                        "🔑 import → Importa módulos\n" +
                        "🔑 return → Retorna valor em função\n" +
                        "🔑 True, False → Booleanos\n" +
                        "🔑 and, or, not → Lógicos\n" +
                        "⚠️ NÃO usar como nome de variável!"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "NOMENCLATURA_VARIAVEIS",
                "🧭 Regras de Nomenclatura",
                "✅ VÁLIDO: nome, nome_variavel, _nome, Nome, NOME.\n" +
                        "❌ INVÁLIDO: 2nome (número no início).\n" +
                        "❌ INVÁLIDO: nome-variavel (hífen não permitido).\n" +
                        "❌ INVÁLIDO: nome variavel (espaço).\n" +
                        "❌ INVÁLIDO: def, class, if (palavras reservadas).\n" +
                        "⚡ Case sensitive: Nome é diferente de nome."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "INDENTACAO",
                "🧭 A Alma do Python",
                "📌 IDENTAÇÃO: Define blocos de código (espaços/tabs).\n" +
                        "⚠️ CILADA: A banca pode ignorar a indentação no enunciado.\n" +
                        "💡 Analise a lógica como se estivesse corretamente indentado.\n" +
                        "📌 EXEMPLO: def func(): print('a') em uma linha é válido."
        ));

        // ============================================================
        // VÍDEO 03 - OPERADORES E EXPRESSÕES
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "OPERADORES_MATEMATICOS",
                "🧭 Matemáticos e Divisão",
                "➕ + (soma), ➖ - (subtração), ✖️ * (multiplicação).\n" +
                        "➗ / (divisão float): 5/2 = 2.5\n" +
                        "➗ // (divisão inteira): 5//2 = 2\n" +
                        "🔢 % (módulo/resto): 5%2 = 1\n" +
                        "⬆️ ** (exponenciação): 5**2 = 25\n" +
                        "⚠️ // com negativos arredonda para BAIXO: -5//2 = -3"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "OPERADORES_COMPARACAO",
                "🧭 Comparação e Identidade",
                "🔍 == (igual a), ≠ != (diferente de).\n" +
                        "📈 > (maior), 📉 < (menor), ≥ >=, ≤ <=.\n" +
                        "🔗 is → Compara IDENTIDADE (mesmo objeto).\n" +
                        "🔗 is not → Compara se NÃO é o mesmo objeto.\n" +
                        "🔎 in → Pertence à sequência: 'a' in 'abc' = True.\n" +
                        "🔎 not in → Não pertence."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "PRECEDENCIA_OPERADORES",
                "🧭 Ordem de Precedência",
                "🥇 1º: () Parênteses\n" +
                        "🥈 2º: ** Exponencial\n" +
                        "🥉 3º: *, /, //, % (Multiplicação, Divisão, Módulo)\n" +
                        "🏅 4º: +, - (Adição, Subtração)\n" +
                        "🧭 MACETE: 'Pare E MeMoRize'"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "INCREMENTO_PYTHON",
                "🧭 Cilada: ++ e --",
                "📌 PYTHON NÃO TEM ++x NEM x++!\n" +
                        "❌ ++x: Interpreta como sinal positivo (+x). Não altera a variável.\n" +
                        "❌ x++: Gera erro de sintaxe (SyntaxError).\n" +
                        "✅ CORRETO: x += 1 ou x = x + 1.\n" +
                        "💡 Decisão de design: criadores optaram por não incluir."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONCATENACAO_STR_NUM",
                "🧭 Cilada: String + Número",
                "📌 'idade: ' + 10 → GERA TypeError!\n" +
                        "📌 10 + ' anos' → GERA TypeError!\n" +
                        "✅ SOLUÇÃO: Converter número com str().\n" +
                        "📌 EXEMPLO: 'idade: ' + str(10) → 'idade: 10'.\n" +
                        "💡 A variável original continua sendo inteiro."
        ));

        // ============================================================
        // VÍDEO 04 - STRINGS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "STRINGS_IMUTABILIDADE",
                "🧭 Cilada: Imutabilidade",
                "📌 Strings são IMUTÁVEIS! Métodos criam NOVA string.\n" +
                        "❌ CILADA: nome = 'RAFA'; nome.lower(); print(nome) → 'RAFA'.\n" +
                        "✅ CORRETO: nome = nome.lower() → 'rafa'.\n" +
                        "⚠️ A nova string fica sem referência e é coletada."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "METODOS_STRINGS",
                "🧭 Métodos Mais Cobrados",
                "🔠 upper() → MAIÚSCULAS\n" +
                        "🔡 lower() → minúsculas\n" +
                        "🔤 capitalize() → Primeira maiúscula\n" +
                        "📝 title() → Primeira de cada palavra\n" +
                        "🧹 strip() → Remove espaços das pontas\n" +
                        "✂️ split() → Divide em lista (separador)\n" +
                        "🔄 replace() → Substitui substring\n" +
                        "🔢 count() → Conta ocorrências\n" +
                        "🔍 find() → Retorna índice (ou -1)\n" +
                        "✅ startswith() / endswith() → True/False"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONCATENACAO_STRINGS",
                "🧭 Formas de Concatenação",
                "🔗 1) Operador +: 'texto' + str(var)\n" +
                        "🔗 2) format(): 'texto {}'.format(var)\n" +
                        "🔗 3) f-strings (Python 3.6+): f'texto {var}'\n" +
                        "⭐ f-strings são MAIS PYTHÔNICAS: mais legíveis, permitem expressões."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "STRINGS_IS_VS_EQ",
                "🧭 == vs is em Strings",
                "📌 == → Compara CONTEÚDO (valor).\n" +
                        "📌 is → Compara IDENTIDADE (mesmo objeto).\n" +
                        "❌ nome1 = 'RAFA'.lower(); nome2 = 'RAFA'.lower();\n" +
                        "📌 nome1 == nome2 → True (conteúdo igual)\n" +
                        "📌 nome1 is nome2 → False (objetos diferentes)\n" +
                        "⚠️ Literais iguais podem ser reutilizados (internamento)."
        ));

        // ============================================================
        // VÍDEO 05 - ESTRUTURAS CONDICIONAIS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONDICIONAIS_SINTAXE",
                "🧭 if/elif/else",
                "📌 if condicao: → Com DOIS PONTOS!\n" +
                        "📌 elif condicao: → (não é 'else if'!)\n" +
                        "📌 else: → Com DOIS PONTOS!\n" +
                        "❌ CILADA: else sem : → SyntaxError.\n" +
                        "✅ Parênteses são OPCIONAIS: if (x == 10) também funciona.\n" +
                        "⚡ Apenas UM bloco é executado (primeiro verdadeiro)."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "INPUT_CONDICIONAIS",
                "🧭 Cilada: input()",
                "📌 input() SEMPRE retorna STRING.\n" +
                        "❌ CILADA: numero_magico = 115; num = input('Número: '); if numero_magico == num → False SEMPRE!\n" +
                        "✅ CORRETO: int(input('Digite: ')) → converte para inteiro.\n" +
                        "⚡ Python NÃO faz conversão automática (10 == '10' é False)."
        ));

        // ============================================================
        // VÍDEO 06 - ESTRUTURAS DE REPETIÇÃO (LOOPS)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "WHILE_LOOP",
                "🧭 while",
                "📌 while condicao: → Repete enquanto for True.\n" +
                        "❌ CILADA: Esquecer de incrementar → LOOP INFINITO.\n" +
                        "✅ EXEMPLO: tentativas = 0; while tentativas < 3: tentativas += 1.\n" +
                        "📌 Sempre use += 1 (NÃO existe ++ em Python)."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "FOR_RANGE",
                "🧭 for e range()",
                "📌 range(stop) → 0 a stop-1. Ex: range(5) = 0,1,2,3,4.\n" +
                        "📌 range(start, stop) → start a stop-1.\n" +
                        "📌 range(start, stop, step) → com incremento.\n" +
                        "📌 for i in range(5): → i = 0,1,2,3,4.\n" +
                        "📌 for letra in 'Python': → itera caractere por caractere."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "BREAK_CONTINUE",
                "🧭 break e continue",
                "🛑 break → INTERROMPE o loop imediatamente (sai fora).\n" +
                        "⏭️ continue → PULA para a PRÓXIMA iteração.\n" +
                        "📌 EXEMPLO break: if acertou: break → sai do jogo.\n" +
                        "📌 EXEMPLO continue: if i == 2: continue → pula o 2."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LISTAS_APPEND",
                "🧭 Listas e append()",
                "📌 Lista: [] → mutável, indexada, heterogênea, ordenada.\n" +
                        "📌 append(x) → Adiciona ao FINAL da lista.\n" +
                        "⚠️ append() modifica in-place e retorna NONE.\n" +
                        "❌ CILADA: lista = lista.append(x) → perde a referência!\n" +
                        "✅ CORRETO: lista.append(x) (sem reatribuição)."
        ));

        // ============================================================
        // VÍDEO 07 - RESUMÃO GERAL (PARTE 1)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CONCEITOS_CHAVE",
                "🧭 Resumo Geral",
                "📌 ALTO NÍVEL vs BAIXO NÍVEL.\n" +
                        "📌 ALGORITMO: Sequência lógica de passos.\n" +
                        "📌 PARADIGMAS: Estruturado, OO, Funcional.\n" +
                        "📌 PYTHON: Multiparadigma, tipagem dinâmica.\n" +
                        "📌 FUNCIONAMENTO: Compila (byte code) + Interpreta (PVM).\n" +
                        "📌 INDENTAÇÃO: Define blocos de código."
        ));

        // ============================================================
        // VÍDEO 08 - LISTAS (FATIAMENTO)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LISTAS_SLICING",
                "🧭 Fatiamento (Slicing)",
                "📌 lista[inicio:fim] → início INCLUÍDO, fim EXCLUÍDO.\n" +
                        "📌 numeros = [10,20,30,40,50,60].\n" +
                        "📌 [2:4] → [30,40] (índices 2 e 3).\n" +
                        "📌 [1:] → do índice 1 até o fim.\n" +
                        "📌 [:3] → do início até índice 2.\n" +
                        "📌 Índices NEGATIVOS: -1 = último. [-3:-1] = [40,50].\n" +
                        "📌 [2:2] → [] (vazio)."
        ));

        // ============================================================
        // VÍDEO 09 - MÉTODOS DE LISTAS E TUPLAS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LISTAS_METODOS",
                "🧭 Métodos de Lista",
                "➕ append(x) → Adiciona ao final.\n" +
                        "📤 pop(i) → Remove e retorna o da posição (ou último).\n" +
                        "🗑️ remove(x) → Remove primeira ocorrência de x.\n" +
                        "🧹 clear() → Remove todos.\n" +
                        "📋 copy() → Retorna cópia superficial.\n" +
                        "🔢 count(x) → Nº de ocorrências.\n" +
                        "📍 index(x) → Posição da 1ª ocorrência.\n" +
                        "➕ extend(iteravel) → Adiciona elementos.\n" +
                        "📌 insert(i, x) → Insere na posição i.\n" +
                        "📊 sort() → Ordena in-place (retorna None).\n" +
                        "🔄 reverse() → Inverte a ordem (NÃO ordena!)."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LISTAS_SORT_VS_REVERSE",
                "🧭 sort() vs reverse()",
                "📊 sort() → ORDENA a lista (crescente). Altera in-place e retorna None.\n" +
                        "📊 sort(reverse=True) → Ordem decrescente.\n" +
                        "❌ CILADA: nova = lista.sort() → nova é None.\n" +
                        "🔄 reverse() → INVERTE a ordem atual (não ordena).\n" +
                        "📌 [3,1,2].reverse() → [2,1,3] (apenas inverte)."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "TUPLAS",
                "🧭 Tuplas (Imutáveis)",
                "📌 TUPLA: () → IMUTÁVEL (não pode ser alterada).\n" +
                        "📌 Métodos: count() e index() APENAS.\n" +
                        "❌ CILADA: tupla.append(10) → AttributeError.\n" +
                        "❌ CILADA: tupla.pop() → AttributeError.\n" +
                        "📌 Tupla de 1 elemento: (10,) → VÍRGULA OBRIGATÓRIA!\n" +
                        "📌 (10) é inteiro, não tupla."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "LISTA_VS_TUPLA",
                "🧭 Lista vs Tupla",
                "📋 LISTA: [] → MUTÁVEL. Métodos: append, pop, remove, sort.\n" +
                        "📦 TUPLA: () → IMUTÁVEL. Métodos: count e index.\n" +
                        "📌 USO: Lista para dados variáveis; Tupla para dados fixos.\n" +
                        "⚡ PERFORMANCE: Tupla é mais rápida (imutabilidade otimiza)."
        ));

        // ============================================================
        // VÍDEO 10 - SETS (CONJUNTOS)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "SETS",
                "🧭 Sets (Conjuntos)",
                "🎯 SET: {} (com elementos) ou set() → ELEMENTOS ÚNICOS.\n" +
                        "📌 Não ordenado, mutável, heterogêneo.\n" +
                        "❌ CILADA: {} → DICIONÁRIO vazio! Set vazio é set().\n" +
                        "📌 Elimina duplicatas automaticamente: {1,1,2} → {1,2}.\n" +
                        "📌 NÃO é indexado: set[0] → TypeError."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "SETS_METODOS",
                "🧭 Métodos de Set",
                "➕ add(x) → Adiciona elemento.\n" +
                        "🗑️ remove(x) → Remove (erro se não existir).\n" +
                        "🗑️ discard(x) → Remove (seguro, não gera erro).\n" +
                        "📤 pop() → Remove e retorna elemento ARBITRÁRIO.\n" +
                        "🔗 union(outro) → União (elementos de ambos).\n" +
                        "🔗 intersection(outro) → Interseção (comuns).\n" +
                        "🔗 difference(outro) → Diferença (do 1º que não está no 2º).\n" +
                        "🔗 symmetric_difference(outro) → Diferença simétrica."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "SETS_VS_LISTAS",
                "🧭 Set vs Lista",
                "📋 LISTA: Mantém ordem, permite repetidos, acesso por índice.\n" +
                        "🎯 SET: Não mantém ordem, NÃO permite repetidos, NÃO é indexado.\n" +
                        "⚡ PERFORMANCE: Set é O(1) para busca (tabela hash).\n" +
                        "📋 Lista é O(n) para busca.\n" +
                        "🎯 Uso: Set para eliminar duplicatas e buscas rápidas."
        ));

        // ============================================================
        // VÍDEO 11 - DICIONÁRIOS
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "DICIONARIOS",
                "🧭 Dicionários (dict)",
                "📚 DICT: {chave: valor} → Chave VALOR associado.\n" +
                        "📌 Chaves ÚNICAS e IMUTÁVEIS (str, int, tuple).\n" +
                        "📌 Valores podem ser repetidos e de qualquer tipo.\n" +
                        "📌 Mutável, mantém ordem de inserção (Python 3.7+).\n" +
                        "❌ CILADA: {} → DICIONÁRIO vazio, NÃO set!"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "DICIONARIOS_ACESSO",
                "🧭 Acessando Elementos",
                "📌 dict[chave] → Retorna valor. Gera KeyError se não existir.\n" +
                        "📌 dict.get(chave) → Retorna valor ou None (seguro).\n" +
                        "📌 dict.get(chave, padrao) → Retorna valor padrão.\n" +
                        "⭐ Use get() para evitar erros em provas!"
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "DICIONARIOS_METODOS",
                "🧭 Métodos de Dict",
                "🔑 keys() → Retorna todas as chaves.\n" +
                        "💎 values() → Retorna todos os valores.\n" +
                        "📋 items() → Retorna pares (chave, valor).\n" +
                        "🔄 update(dict) → Adiciona ou atualiza.\n" +
                        "📤 pop(chave) → Remove e retorna valor.\n" +
                        "📤 popitem() → Remove e retorna o ÚLTIMO par.\n" +
                        "🧹 clear() → Remove todos.\n" +
                        "📋 copy() → Cópia superficial."
        ));

        // ============================================================
        // VÍDEO 12 - FUNÇÕES E REVISÃO GERAL
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "FUNCOES_SINTAXE",
                "🧭 Definição de Funções",
                "🔑 def nome(parametros): → Define função.\n" +
                        "📤 return valor → Retorna valor. Sem return → retorna None.\n" +
                        "📌 MÚLTIPLOS RETORNOS: return 10, 20 → recebe com a, b = func().\n" +
                        "❌ CILADA: function ou funcao → NÃO EXISTEM! É def."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "BUILTIN_FUNCTIONS",
                "🧭 Funções Embutidas",
                "🖨️ print() → Imprime.\n" +
                        "⌨️ input() → Lê entrada (retorna string).\n" +
                        "📏 len() → Tamanho.\n" +
                        "🔍 type() → Tipo da variável.\n" +
                        "🔄 int(), str(), float() → Conversão.\n" +
                        "🔢 range() → Gera sequência.\n" +
                        "📊 sorted() → Ordena (retorna nova lista).\n" +
                        "📉 min(), 📈 max(), ➕ sum() → Mínimo, máximo, soma."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "BYTE_CODE",
                "🧭 Compilação em Python",
                "📌 Python gera BYTE CODE (.pyc) na pasta __pycache__.\n" +
                        "📌 Comando: python -m compileall arquivo.py.\n" +
                        "📌 PYTHON: Compila (implícito) + Interpreta (PVM).\n" +
                        "❌ CILADA: 'Python é apenas interpretado' → FALSO (cabe recurso).\n" +
                        "💡 Estratégia: TI = compilado+interpretado; Área geral = aceite 'interpretado'."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "9_PASSOS_DOMINAR",
                "🧭 9 Passos para Dominar",
                "1️⃣ 1: Hello World → print('Olá Mundo').\n" +
                        "2️⃣ 2: Variáveis → Nomenclatura, escopo, tipagem.\n" +
                        "3️⃣ 3: Operadores → Matemáticos, lógicos, precedência.\n" +
                        "4️⃣ 4: Palavras Reservadas → def, class, if, for.\n" +
                        "5️⃣ 5: Strings → Métodos, imutabilidade, concatenação.\n" +
                        "6️⃣ 6: Condicionais → if, elif, else.\n" +
                        "7️⃣ 7: Loops → for, while, break, continue.\n" +
                        "8️⃣ 8: Funções → def, parâmetros, return.\n" +
                        "9️⃣ 9: Estruturas de Dados → Lista, tupla, set, dict."
        ));

        // ============================================================
        // PRINCIPAIS CILADAS - COMPILADO GERAL
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "CILADAS_GERAIS",
                "🧭 Ciladas e Antídotos",
                "❌ Achar que {} é set vazio → {} é dict vazio.\n" +
                        "❌ Esquecer : no else → else: (com :) obrigatório.\n" +
                        "❌ Usar ++x ou x++ → Não existe! Use += 1.\n" +
                        "❌ Achar que input() retorna número → Sempre string! Use int().\n" +
                        "❌ Achar que métodos modificam string → São imutáveis!\n" +
                        "❌ Achar que append() retorna lista → Retorna None.\n" +
                        "❌ Achar que sort() retorna lista → Modifica in-place, retorna None.\n" +
                        "❌ Achar que is compara valor → is compara identidade (objeto).\n" +
                        "❌ Achar que range(5) inclui 5 → Vai de 0 a 4."
        ));

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "MUTAVEIS_VS_IMUTAVEIS",
                "🧭 Mutáveis e Imutáveis",
                "🔒 IMUTÁVEIS: Tupla (tuple), String (str), int, float, bool.\n" +
                        "🔓 MUTÁVEIS: Lista (list), Dicionário (dict), Set.\n" +
                        "📌 Métodos em imutáveis CRIAM NOVA string/objeto.\n" +
                        "📌 Métodos em mutáveis ALTERAM o objeto original.\n" +
                        "❌ CILADA: string.upper() sem reatribuição → string original NÃO muda."
        ));

        // ============================================================
        // ESTRUTURAS DE DADOS - COMPARATIVO FINAL
        // ============================================================

        lista.add(new Flashcard(
                "📘 Python para Concursos",
                "ESTRUTURAS_COMPARATIVO",
                "🧭 Comparativo Estruturas",
                "📋 LISTA: [] → Mutável, indexada, ordenada, permite repetidos.\n" +
                        "📦 TUPLA: () → Imutável, indexada, ordenada, permite repetidos.\n" +
                        "🎯 SET: {} (com elementos) → Mutável, NÃO indexada, NÃO ordenada, NÃO permite repetidos.\n" +
                        "📚 DICT: {chave: valor} → Mutável, NÃO indexada, chaves únicas, valores repetíveis.\n" +
                        "⚠️ {} vazio → DICT! Set vazio é set()."
        ));

        return lista;
    }
}
