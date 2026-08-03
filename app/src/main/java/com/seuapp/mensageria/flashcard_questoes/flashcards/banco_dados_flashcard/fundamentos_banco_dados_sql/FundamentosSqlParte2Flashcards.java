package com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FundamentosSqlParte2Flashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // VÍDEO 11 - AULA: COMANDOS DML (PARTE 1) - INSERT, UPDATE E DELETE
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "INSERT_INTO",
                "🧭 INSERT - Inserindo Dados (Vídeo 11)",
                "📌 INSERT adiciona novos registros à tabela.\n\n" +

                        "📝 Sintaxe:\n" +
                        "INSERT INTO tabela (colunas) VALUES (valores);\n" +
                        "💡 Exemplo:\n" +
                        "INSERT INTO alunos (nome, idade) VALUES ('João', 20);\n" +
                        "➡️ Resultado: um novo aluno chamado João, com 20 anos, é cadastrado.\n\n" +

                        "⚠️ A ordem dos valores deve corresponder à ordem das colunas.\n" +
                        "💡 Exemplo correto:\n" +
                        "INSERT INTO alunos (nome, idade) VALUES ('Maria', 22);\n" +
                        "➡️ 'Maria' vai para a coluna nome e 22 para a coluna idade.\n\n" +

                        "❌ Exemplo incorreto:\n" +
                        "INSERT INTO alunos (nome, idade) VALUES (22, 'Maria');\n" +
                        "➡️ O valor 22 seria colocado na coluna nome e 'Maria' na idade, causando erro ou dados inconsistentes.\n\n" +

                        "📋 Se preencher TODAS as colunas, não precisa especificar os nomes.\n" +
                        "💡 Exemplo:\n" +
                        "INSERT INTO alunos VALUES (1, 'Carlos', 19);\n" +
                        "➡️ Funciona apenas se a tabela possuir exatamente essas três colunas nessa ordem.\n\n" +

                        "🔍 Se preencher APENAS algumas colunas, é OBRIGATÓRIO especificar seus nomes.\n" +
                        "💡 Exemplo:\n" +
                        "INSERT INTO alunos (nome) VALUES ('Ana');\n" +
                        "➡️ Apenas a coluna nome recebe valor; as demais usarão NULL ou o valor padrão (DEFAULT), se existir."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "UPDATE_SEM_WHERE",
                "🧭 UPDATE - Perigo do WHERE (Vídeo 11)",
                "📌 UPDATE altera dados existentes em registros.\n\n" +

                        "✏️ Sintaxe:\n" +
                        "UPDATE tabela SET coluna = valor WHERE condição;\n" +
                        "💡 Exemplo:\n" +
                        "UPDATE alunos SET idade = 21 WHERE id = 1;\n" +
                        "➡️ Apenas o aluno com ID 1 terá a idade alterada para 21.\n\n" +

                        "🚨 NUNCA esqueça o WHERE.\n" +
                        "💡 Exemplo correto:\n" +
                        "UPDATE alunos SET idade = 18 WHERE nome = 'João';\n" +
                        "➡️ Somente o registro do João será atualizado.\n\n" +

                        "💀 \"EITA, LASCÓU!\" → O que acontece se esquecer o WHERE?\n" +
                        "❌ Exemplo:\n" +
                        "UPDATE alunos SET idade = 18;\n" +
                        "➡️ TODOS os alunos terão a idade alterada para 18.\n" +
                        "⚠️ Esse é um dos erros mais comuns e perigosos em SQL.\n\n" +

                        "🔄 É possível atualizar várias colunas separando-as por vírgulas.\n" +
                        "💡 Exemplo:\n" +
                        "UPDATE alunos\n" +
                        "SET nome = 'Carlos', idade = 25\n" +
                        "WHERE id = 3;\n" +
                        "➡️ O aluno de ID 3 terá o nome alterado para Carlos e a idade para 25 ao mesmo tempo."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "DELETE_REGISTROS",
                "🧭 DELETE - Removendo Dados (Vídeo 11)",
                "📌 DELETE remove registros da tabela.\n\n" +

                        "🗑️ Sintaxe:\n" +
                        "DELETE FROM tabela WHERE condição;\n" +
                        "💡 Exemplo:\n" +
                        "DELETE FROM alunos WHERE id = 5;\n" +
                        "➡️ Apenas o aluno com ID 5 será removido da tabela.\n\n" +

                        "🚨 Sem WHERE, TODOS os registros serão apagados.\n" +
                        "💡 Exemplo correto:\n" +
                        "DELETE FROM alunos WHERE nome = 'João';\n" +
                        "➡️ Apenas os registros do aluno João serão excluídos.\n\n" +

                        "💀 \"EITA, LASCÓU!\" → O que acontece se esquecer o WHERE?\n" +
                        "❌ Exemplo:\n" +
                        "DELETE FROM alunos;\n" +
                        "➡️ TODOS os registros da tabela serão apagados.\n" +
                        "⚠️ A tabela continua existindo, mas ficará completamente vazia.\n\n" +

                        "⚡ DELETE mantém a estrutura da tabela (diferente do DROP).\n" +
                        "💡 Exemplo:\n" +
                        "DELETE FROM alunos WHERE id = 10;\n" +
                        "➡️ Apenas os dados são removidos. A tabela 'alunos' continua existindo e pode receber novos registros.\n\n" +

                        "📋 O WHERE permite apagar apenas registros específicos.\n" +
                        "💡 Exemplo:\n" +
                        "DELETE FROM alunos WHERE idade < 18;\n" +
                        "➡️ Apenas os alunos menores de 18 anos serão removidos; os demais permanecerão na tabela."
        ));

        // ============================================================
        // VÍDEO 12 - AULA: COMANDOS DML (PARTE 2) - UPDATE, DELETE E SELECT
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "DELETE_TRUNCATE_DROP",
                "🧭 DELETE x TRUNCATE x DROP (Vídeo 12)",
                "📌 Diferenças cruciais entre os comandos:\n" +
                        "🗑️ DELETE (sem WHERE): Apaga dados, mantém estrutura.\n" +
                        "⚡ TRUNCATE: Apaga todos os registros de uma vez (mais rápido).\n" +
                        "🔥 DROP: Apaga TABELA INTEIRA (estrutura + dados).\n" +
                        "⚠️ NUNCA confunda DELETE com DROP em provas."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "SELECT_SINTAXE_BASICA",
                "🧭 SELECT - Sintaxe (Vídeo 12)",
                "📌 SELECT é o comando mais importante do SQL e um dos mais cobrados.\n\n" +

                        "⭐ SELECT * FROM tabela; → Retorna todas as colunas.\n" +
                        "💡 Exemplo:\n" +
                        "SELECT * FROM alunos;\n" +
                        "➡️ Exibe todas as informações dos alunos (id, nome, idade, curso, etc.).\n\n" +

                        "📋 SELECT colunas FROM tabela; → Retorna apenas as colunas desejadas.\n" +
                        "💡 Exemplo:\n" +
                        "SELECT nome, idade FROM alunos;\n" +
                        "➡️ Exibe somente o nome e a idade dos alunos, ignorando as demais colunas.\n\n" +

                        "🔍 DISTINCT → Remove valores duplicados do resultado.\n" +
                        "💡 Imagine que a tabela alunos possui:\n" +
                        "João → ADS\n" +
                        "Maria → ADS\n" +
                        "Pedro → SI\n" +
                        "Ana → ADS\n" +
                        "Carlos → SI\n" +
                        "Julia → CC\n\n" +

                        "Sem DISTINCT:\n" +
                        "SELECT curso FROM alunos;\n" +
                        "➡️ Resultado: ADS, ADS, SI, ADS, SI, CC.\n\n" +

                        "Com DISTINCT:\n" +
                        "SELECT DISTINCT curso FROM alunos;\n" +
                        "➡️ Resultado: ADS, SI, CC.\n" +
                        "🎯 O DISTINCT não remove registros da tabela; ele apenas evita que valores repetidos apareçam no resultado da consulta.\n\n" +

                        "🏷️ AS → Cria um apelido (alias) para colunas ou tabelas.\n" +
                        "💡 Exemplo (coluna):\n" +
                        "SELECT nome AS 'Nome do Aluno' FROM alunos;\n" +
                        "➡️ A coluna será exibida com o título 'Nome do Aluno'.\n\n" +

                        "💡 Exemplo (tabela):\n" +
                        "SELECT a.nome, a.idade FROM alunos AS a;\n" +
                        "➡️ O apelido 'a' substitui o nome da tabela na consulta, deixando o código mais curto e organizado."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "DISTINCT_ALIAS",
                "🧭 DISTINCT e ALIAS (Vídeo 12)",
                "📌 DISTINCT e ALIAS são muito cobrados:\n" +
                        "🔍 DISTINCT: Remove duplicatas APENAS no resultado.\n" +
                        "📌 NÃO altera os dados originais da tabela.\n" +
                        "🏷️ ALIAS (AS): Dá apelido temporário a colunas/tabelas.\n" +
                        "📝 SELECT nome AS Nome_Aluno FROM alunos;"
        ));

        // ============================================================
        // VÍDEO 13 - AULA: COMANDOS DML (PARTE 3) - CLÁUSULAS FROM E JOIN
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "JOIN_TIPOS",
                "🧭 JOIN - Tipos (Vídeo 13)",
                "📌 JOIN combina tabelas com base em coluna comum:\n" +
                        "🟢 INNER JOIN → Apenas a interseção (AMBAS as tabelas).\n" +
                        "🟠 LEFT JOIN → Tudo da esquerda + interseção.\n" +
                        "🟣 RIGHT JOIN → Tudo da direita + interseção.\n" +
                        "🔵 FULL OUTER JOIN → Tudo de tudo (união completa).\n" +
                        "🔁 SELF JOIN → Tabela se relaciona com ela mesma."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "FROM_E_JOIN",
                "🧭 FROM e JOIN (Vídeo 13)",
                "📌 FROM: Indica a(s) tabela(s) de origem dos dados.\n" +
                        "💡 Exemplo: A tabela 'Clientes' possui os registros João, Maria e Pedro.\n" +
                        "Ao executar:\n" +
                        "SELECT * FROM Clientes;\n" +
                        "o SQL buscará os dados apenas da tabela Clientes.\n\n" +

                        "⚠️ FROM com múltiplas tabelas sem WHERE = PRODUTO CARTESIANO.\n" +
                        "💡 Exemplo: A tabela Clientes possui 3 registros e a tabela Pedidos possui 4 registros.\n" +
                        "Ao executar:\n" +
                        "SELECT * FROM Clientes, Pedidos;\n" +
                        "o resultado terá 12 linhas (3 × 4), pois cada cliente será combinado com todos os pedidos.\n\n" +

                        "🔄 JOIN exige coluna comum entre as tabelas.\n" +
                        "💡 Exemplo: A tabela Clientes possui a coluna idCliente e a tabela Pedidos também possui idCliente.\n" +
                        "Ao executar:\n" +
                        "SELECT * FROM Clientes c\n" +
                        "JOIN Pedidos p ON c.idCliente = p.idCliente;\n" +
                        "cada pedido será associado ao seu respectivo cliente.\n\n" +

                        "🎯 SELF JOIN = tabela combinada com ela mesma (com alias).\n" +
                        "💡 Exemplo: A tabela Funcionarios possui as colunas idFuncionario, nome e idGerente.\n" +
                        "Ao executar um SELF JOIN, é possível descobrir quem é o gerente de cada funcionário, relacionando a tabela Funcionarios com ela mesma utilizando apelidos (aliases), como f e g."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "PRODUTO_CARTESIANO",
                "🧭 Produto Cartesiano (Vídeo 13)",
                "📌 SELECT * FROM tabela1, tabela2; gera PRODUTO CARTESIANO.\n" +
                        "🔢 Linhas = multiplicação do número de linhas de cada tabela.\n" +
                        "📊 Exemplo: 3 linhas × 2 linhas = 6 linhas no resultado.\n" +
                        "⚠️ NUNCA é o mesmo que um JOIN com condição."
        ));

        // ============================================================
        // VÍDEO 14 - AULA: COMANDOS DML (PARTE 4) - APROFUNDANDO EM INNER JOIN, LEFT JOIN E RIGHT JOIN
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "INNER_LEFT_RIGHT",
                "🧭 INNER x LEFT x RIGHT (Vídeo 14)",
                "📌 Lógica de conjuntos para JOINs:\n\n" +

                        "🟢 INNER JOIN → Apenas a interseção (registros em ambas).\n" +
                        "💡 Exemplo:\n\n" +

                        "Clientes:\n" +
                        "| idCliente | Nome  |\n" +
                        "|-----------|-------|\n" +
                        "| 1         | João  |\n" +
                        "| 2         | Maria |\n" +
                        "| 3         | Pedro |\n\n" +

                        "Pedidos:\n" +
                        "| idPedido | idCliente |\n" +
                        "|----------|-----------|\n" +
                        "| 101      | 1         |\n" +
                        "| 102      | 2         |\n\n" +

                        "Ao executar:\n" +
                        "SELECT * FROM Clientes c\n" +
                        "INNER JOIN Pedidos p ON c.idCliente = p.idCliente;\n" +
                        "o resultado exibirá apenas João e Maria, pois somente eles possuem pedidos.\n\n" +

                        "🟠 LEFT JOIN → Todos da esquerda + interseção.\n" +
                        "💡 Exemplo:\n\n" +

                        "Clientes:\n" +
                        "| idCliente | Nome  |\n" +
                        "|-----------|-------|\n" +
                        "| 1         | João  |\n" +
                        "| 2         | Maria |\n" +
                        "| 3         | Pedro |\n\n" +

                        "Pedidos:\n" +
                        "| idPedido | idCliente |\n" +
                        "|----------|-----------|\n" +
                        "| 101      | 1         |\n" +
                        "| 102      | 2         |\n\n" +

                        "Ao executar:\n" +
                        "SELECT * FROM Clientes c\n" +
                        "LEFT JOIN Pedidos p ON c.idCliente = p.idCliente;\n" +
                        "o resultado exibirá João, Maria e Pedro. Pedro aparecerá com os dados do pedido como NULL, pois não realizou nenhum pedido.\n\n" +

                        "🟣 RIGHT JOIN → Todos da direita + interseção.\n" +
                        "💡 Exemplo:\n\n" +

                        "Clientes:\n" +
                        "| idCliente | Nome  |\n" +
                        "|-----------|-------|\n" +
                        "| 1         | João  |\n" +
                        "| 2         | Maria |\n\n" +

                        "Pedidos:\n" +
                        "| idPedido | idCliente |\n" +
                        "|----------|-----------|\n" +
                        "| 101      | 1         |\n" +
                        "| 102      | 2         |\n" +
                        "| 103      | 4         |\n\n" +

                        "Ao executar:\n" +
                        "SELECT * FROM Clientes c\n" +
                        "RIGHT JOIN Pedidos p ON c.idCliente = p.idCliente;\n" +
                        "o resultado exibirá todos os pedidos. O pedido 103 aparecerá mesmo sem cliente correspondente, com os dados do cliente como NULL.\n\n" +

                        "⚡ USING → Atalho quando nomes das colunas são idênticos.\n" +
                        "💡 Exemplo:\n\n" +

                        "Clientes:\n" +
                        "| idCliente | Nome  |\n" +
                        "|-----------|-------|\n" +
                        "| 1         | João  |\n" +
                        "| 2         | Maria |\n\n" +

                        "Pedidos:\n" +
                        "| idPedido | idCliente |\n" +
                        "|----------|-----------|\n" +
                        "| 101      | 1         |\n" +
                        "| 102      | 2         |\n\n" +

                        "As tabelas Clientes e Pedidos possuem a coluna idCliente.\n" +
                        "Em vez de escrever:\n" +
                        "JOIN Pedidos ON Clientes.idCliente = Pedidos.idCliente\n" +
                        "é possível utilizar:\n" +
                        "JOIN Pedidos USING (idCliente);\n" +
                        "obtendo o mesmo resultado de forma mais simples."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "CONDICOES_JOIN",
                "🧭 Condições para JOIN (Vídeo 14)",
                "📌 Regras fundamentais para JOIN:\n" +
                        "🔑 Coluna comum é OBRIGATÓRIA.\n" +
                        "📛 Nomes NÃO precisam ser idênticos (mesmo sentido).\n" +
                        "❌ Sem coluna comum → JOIN NÃO é possível (erro).\n" +
                        "🚫 Tentar JOIN sem coluna comum gera ERRO."
        ));

        // ============================================================
        // VÍDEO 15 - AULA: COMANDOS DML (PARTE 5) - RIGHT JOIN, FULL OUTER JOIN E SELF JOIN
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "RIGHT_FULL_SELF",
                "🧭 RIGHT, FULL e SELF (Vídeo 15)",
                "📌 JOINs completos:\n" +
                        "🟣 RIGHT JOIN → Tudo da direita + interseção.\n" +
                        "\n" +
                        "📋 Exemplo:\n" +
                        "Clientes\n" +
                        "| id | nome  |\n" +
                        "|----|-------|\n" +
                        "| 1  | Ana   |\n" +
                        "| 2  | Bruno |\n" +
                        "\n" +
                        "Pedidos\n" +
                        "| id | cliente_id | produto |\n" +
                        "|----|------------|---------|\n" +
                        "| 10 | 1          | Notebook|\n" +
                        "| 11 | 3          | Mouse   |\n" +
                        "\n" +
                        "SELECT * FROM Clientes\n" +
                        "RIGHT JOIN Pedidos\n" +
                        "ON Clientes.id = Pedidos.cliente_id;\n" +
                        "\n" +
                        "Resultado:\n" +
                        "| Cliente | Produto  |\n" +
                        "|---------|----------|\n" +
                        "| Ana     | Notebook |\n" +
                        "| NULL    | Mouse    |\n" +
                        "➡️ Todos os pedidos aparecem, mesmo sem cliente correspondente.\n\n" +

                        "🔵 FULL OUTER JOIN → União completa (tudo de tudo).\n" +
                        "\n" +
                        "📋 Exemplo:\n" +
                        "Clientes\n" +
                        "| id | nome  |\n" +
                        "|----|-------|\n" +
                        "| 1  | Ana   |\n" +
                        "| 2  | Bruno |\n" +
                        "\n" +
                        "Pedidos\n" +
                        "| id | cliente_id | produto |\n" +
                        "|----|------------|---------|\n" +
                        "| 10 | 1          | Notebook|\n" +
                        "| 11 | 3          | Mouse   |\n" +
                        "\n" +
                        "Resultado:\n" +
                        "| Cliente | Produto  |\n" +
                        "|---------|----------|\n" +
                        "| Ana     | Notebook |\n" +
                        "| Bruno   | NULL     |\n" +
                        "| NULL    | Mouse    |\n" +
                        "➡️ Retorna todos os registros das duas tabelas.\n\n" +

                        "🔁 SELF JOIN → Tabela com ela mesma (auto-relacionamento).\n" +
                        "🏷️ ALIAS é OBRIGATÓRIO no SELF JOIN.\n" +
                        "\n" +
                        "📋 Exemplo:\n" +
                        "Funcionarios\n" +
                        "| id | nome  | gerente_id |\n" +
                        "|----|-------|------------|\n" +
                        "| 1  | Carlos| NULL       |\n" +
                        "| 2  | Ana   | 1          |\n" +
                        "| 3  | João  | 1          |\n" +
                        "\n" +
                        "SELECT f.nome, g.nome AS gerente\n" +
                        "FROM Funcionarios f\n" +
                        "LEFT JOIN Funcionarios g\n" +
                        "ON f.gerente_id = g.id;\n" +
                        "\n" +
                        "Resultado:\n" +
                        "| Funcionário | Gerente |\n" +
                        "|-------------|---------|\n" +
                        "| Carlos      | NULL    |\n" +
                        "| Ana         | Carlos  |\n" +
                        "| João        | Carlos  |\n" +
                        "➡️ A mesma tabela é utilizada duas vezes: uma representa o funcionário e a outra o gerente."
        ));
        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "SELF_JOIN_EXEMPLO",
                "🧭 SELF JOIN - Exemplo (Vídeo 15)",
                "📌 SELF JOIN = tabela combinada com ela mesma:\n" +
                        "📊 Exemplo: funcionário que indica outro funcionário.\n" +
                        "🔑 SELECT C1.Nome, C2.Nome FROM Clientes C1 INNER JOIN Clientes C2 ON C1.ID = C2.ID_Indicacao;\n" +
                        "🏷️ ALIAS (C1 e C2) para diferenciar as duas versões da tabela."
        ));

        // ============================================================
        // VÍDEO 16 - AULA: COMANDOS DML (PARTE 6) - CLÁUSULA WHERE, OPERADORES RELACIONAIS E LÓGICOS
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "WHERE_FILTRO",
                "🧭 WHERE - Filtrando Dados (Vídeo 16)",
                "📌 WHERE filtra registros de uma ou mais condições específicas:\n\n" +

                        "🧮 Relacionais: =, >, >=, <, <=, <>(diferente).\n" +
                        "💡 Exemplo:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE idade >= 18;\n\n" +

                        "🔗 AND → TODAS as condições devem ser verdadeiras.\n" +
                        "💡 Exemplo:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE cidade = 'Fortaleza' AND idade >= 18;\n\n" +

                        "🔀 OR → PELO MENOS UMA condição deve ser verdadeira.\n" +
                        "💡 Exemplo:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE cidade = 'Fortaleza' OR cidade = 'Recife';\n\n" +

                        "🚫 NOT → Inverte o valor da condição (\"tia do contra\").\n" +
                        "💡 Exemplo:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE NOT cidade = 'Fortaleza';"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "OPERADORES_LOGICOS",
                "🧭 Operadores Lógicos (Vídeo 16)",
                "📌 AND, OR e NOT no WHERE:\n" +
                        "🔗 AND: Retorna TRUE apenas se TODAS forem verdadeiras.\n" +
                        "🔀 OR: Retorna TRUE se PELO MENOS UMA for verdadeira.\n" +
                        "🚫 NOT: Inverte o valor (Verdadeiro vira Falso).\n" +
                        "⚠️ NUNCA use notação matemática (≥ ou ≤).\n" +
                        "✅ Use sempre >= e <= em SQL."
        ));

        // ============================================================
        // VÍDEO 17 - AULA: COMANDOS DML (PARTE 7) - BETWEEN E LIKE
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "BETWEEN_INCLUSIVO",
                "🧭 BETWEEN - Intervalo (Vídeo 17)",
                "📌 BETWEEN filtra valores em um intervalo INCLUSIVO (números, textos ou datas).\n\n" +

                        "📊 Sintaxe:\n" +
                        "SELECT * FROM produtos\n" +
                        "WHERE preco BETWEEN 150 AND 300;\n\n" +

                        "✅ Inclui os valores extremos (valor1 e valor2).\n" +
                        "💡 Exemplo:\n" +
                        "WHERE preco BETWEEN 150 AND 300;\n" +
                        "→ Retorna: 150, 200, 250 e 300.\n\n" +

                        "📝 Também pode ser usado com datas.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE data_venda BETWEEN '2025-01-01' AND '2025-12-31';"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "LIKE_PADROES",
                "🧭 LIKE - Padrões (Vídeo 17)",
                "📌 LIKE busca por padrões em texto.\n\n" +

                        "💡 Sintaxe:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE nome LIKE 'A%';\n\n" +

                        "❓ % → Zero, um ou mais caracteres (curinga grande).\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE 'A%';\n" +
                        "→ Retorna: Ana, André, Augusto...\n\n" +

                        "❓ _ → Exatamente UM caractere (curinga pequeno).\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '_a';\n" +
                        "→ Retorna: Ca, Ia... (apenas 2 letras).\n\n" +

                        "📝 'A%' → Começa com A.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE 'A%';\n\n" +

                        "📝 '%a' → Termina com a.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '%a';\n\n" +

                        "📝 '%io%' → Contém 'io' em qualquer posição.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '%io%';\n" +
                        "→ Retorna: Fábio, Antonio, Dionísio..."
        ));


        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "LIKE_EXEMPLOS",
                "🧭 LIKE - Exemplos (Vídeo 17)",
                "📌 Padrões LIKE mais cobrados.\n\n" +

                        "💡 Sintaxe:\n" +
                        "SELECT * FROM clientes\n" +
                        "WHERE nome LIKE 'A%';\n\n" +

                        "📝 '_r%' → Segunda letra é 'r'.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '_r%';\n" +
                        "→ Retorna: Bruna, Cristiano, Priscila...\n\n" +

                        "📝 '%a_' → Penúltima letra é 'a'.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '%a_';\n" +
                        "→ Retorna: Carlos, Marcos, Mateus...\n\n" +

                        "📝 'A__%' → Começa com A e tem pelo menos 2 caracteres depois.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE 'A__%';\n" +
                        "→ Retorna: Ana, André, Alberto...\n\n" +

                        "📝 '%a%o' → Contém 'a' em qualquer posição E termina com 'o'.\n" +
                        "💡 Exemplo:\n" +
                        "WHERE nome LIKE '%a%o';\n" +
                        "→ Retorna: Caio, Thiago, Amaro..."
        ));

        // ============================================================
        // VÍDEO 18 - AULA: COMANDOS DML (PARTE 8) - IS NULL, IS NOT NULL, IN E NOT IN
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "IS_NULL_IS_NOT_NULL",
                "🧭 IS NULL e IS NOT NULL (Vídeo 18)",
                "📌 Testando valores nulos:\n" +
                        "❌ NUNCA use = NULL ou <> NULL.\n" +
                        "✅ IS NULL → Retorna TRUE se valor for nulo.\n" +
                        "✅ IS NOT NULL → Retorna TRUE se valor NÃO for nulo.\n" +
                        "⚠️ = NULL não gera erro, mas o resultado é INCORRETO.\n\n" +

                        "💡 Exemplo didático:\n" +
                        "Tabela CLIENTES:\n" +
                        "ID | NOME  | TELEFONE\n" +
                        "1  | Ana   | 11999999999\n" +
                        "2  | Bruno | NULL\n" +
                        "3  | Carla | 21988888888\n\n" +

                        "🔎 Encontrar clientes SEM telefone:\n" +
                        "SELECT * FROM CLIENTES\n" +
                        "WHERE TELEFONE IS NULL;\n\n" +

                        "✅ Resultado:\n" +
                        "Bruno\n\n" +

                        "🔎 Encontrar clientes COM telefone:\n" +
                        "SELECT * FROM CLIENTES\n" +
                        "WHERE TELEFONE IS NOT NULL;\n\n" +

                        "✅ Resultado:\n" +
                        "Ana\n" +
                        "Carla\n\n" +

                        "❌ Errado:\n" +
                        "WHERE TELEFONE = NULL\n\n" +

                        "⚠️ Esse comando não retorna Bruno, pois NULL não pode ser comparado usando '='."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "IN_NOT_IN",
                "🧭 IN e NOT IN (Vídeo 18)",
                "📌 Verificando pertencimento a um conjunto:\n" +
                        "📋 IN → Valor pertence ao conjunto.\n" +
                        "🚫 NOT IN → Valor NÃO pertence ao conjunto.\n" +
                        "🔀 IN é equivalente a uma série de condições OR.\n" +
                        "📝 WHERE cidade IN ('Salvador', 'Goiânia')\n\n" +

                        "💡 Exemplo didático:\n" +
                        "Tabela CLIENTES:\n" +
                        "ID | NOME   | CIDADE\n" +
                        "1  | Ana    | Salvador\n" +
                        "2  | Bruno  | Fortaleza\n" +
                        "3  | Carla  | Goiânia\n" +
                        "4  | Diego  | Recife\n\n" +

                        "🔎 Buscar clientes de Salvador ou Goiânia:\n" +
                        "SELECT * FROM CLIENTES\n" +
                        "WHERE CIDADE IN ('Salvador', 'Goiânia');\n\n" +

                        "✅ Resultado:\n" +
                        "Ana\n" +
                        "Carla\n\n" +

                        "🔎 Buscar clientes que NÃO são de Salvador nem Goiânia:\n" +
                        "SELECT * FROM CLIENTES\n" +
                        "WHERE CIDADE NOT IN ('Salvador', 'Goiânia');\n\n" +

                        "✅ Resultado:\n" +
                        "Bruno\n" +
                        "Diego\n\n" +

                        "💡 Equivalência:\n" +
                        "WHERE CIDADE IN ('Salvador', 'Goiânia')\n" +
                        "é o mesmo que:\n" +
                        "WHERE CIDADE = 'Salvador' OR CIDADE = 'Goiânia'"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "SUBQUERY_IN",
                "🧭 Subquery com IN (Vídeo 18)",
                "📌 IN pode ser usado com subconsulta:\n" +
                        "📝 SELECT * FROM tabela WHERE coluna IN (SELECT coluna FROM outra_tabela WHERE condicao);\n" +
                        "🧩 Resolva sempre a subquery (consulta interna) primeiro.\n" +
                        "🔄 O resultado da subquery é usado na consulta externa.\n\n" +

                        "💡 Exemplo didático:\n" +
                        "Tabela CLIENTES:\n" +
                        "ID | NOME\n" +
                        "1  | Ana\n" +
                        "2  | Bruno\n" +
                        "3  | Carla\n" +
                        "4  | Diego\n\n" +

                        "Tabela PEDIDOS:\n" +
                        "ID_PEDIDO | ID_CLIENTE | VALOR\n" +
                        "101       | 1          | 250\n" +
                        "102       | 3          | 180\n" +
                        "103       | 1          | 90\n\n" +

                        "🔎 Buscar clientes que possuem pedidos:\n" +
                        "SELECT * FROM CLIENTES\n" +
                        "WHERE ID IN (\n" +
                        "    SELECT ID_CLIENTE FROM PEDIDOS\n" +
                        ");\n\n" +

                        "🧩 A subquery é executada primeiro:\n" +
                        "SELECT ID_CLIENTE FROM PEDIDOS;\n\n" +

                        "✅ Resultado da subquery:\n" +
                        "1\n" +
                        "3\n\n" +

                        "🔄 A consulta externa fica equivalente a:\n" +
                        "WHERE ID IN (1, 3)\n\n" +

                        "✅ Resultado final:\n" +
                        "Ana\n" +
                        "Carla"
        ));

        // ============================================================
        // VÍDEO 19 - AULA: COMANDOS DML (PARTE 9) - SUBQUERIES: CORRELACIONADAS E NÃO CORRELACIONADAS
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "SUBQUERY_NAO_CORRELACIONADA",
                "🧭 Subquery Não Correlacionada (Vídeo 19)",
                "📌 Subconsulta independente da consulta externa:\n" +
                        "🔄 Executa primeiro a subconsulta, depois a externa.\n" +
                        "📝 SELECT * FROM Alunos WHERE Cidade IN (SELECT Capital FROM Capitais);\n" +
                        "✅ Pode ser executada sozinha.\n" +
                        "📌 Não referencia colunas da consulta externa.\n\n" +

                        "💡 Exemplo didático:\n" +
                        "Tabela ALUNOS:\n" +
                        "ID | NOME   | CIDADE\n" +
                        "1  | Ana    | Fortaleza\n" +
                        "2  | Bruno  | Sobral\n" +
                        "3  | Carla  | Goiânia\n" +
                        "4  | Diego  | Anápolis\n\n" +

                        "Tabela CAPITAIS:\n" +
                        "CAPITAL\n" +
                        "Fortaleza\n" +
                        "Goiânia\n" +
                        "Salvador\n\n" +

                        "🔎 Buscar alunos que moram em capitais:\n" +
                        "SELECT * FROM ALUNOS\n" +
                        "WHERE CIDADE IN (\n" +
                        "    SELECT CAPITAL FROM CAPITAIS\n" +
                        ");\n\n" +

                        "🧩 A subquery é executada primeiro:\n" +
                        "SELECT CAPITAL FROM CAPITAIS;\n\n" +

                        "✅ Resultado da subquery:\n" +
                        "Fortaleza\n" +
                        "Goiânia\n" +
                        "Salvador\n\n" +

                        "🔄 A consulta externa fica equivalente a:\n" +
                        "WHERE CIDADE IN ('Fortaleza', 'Goiânia', 'Salvador')\n\n" +

                        "✅ Resultado final:\n" +
                        "Ana\n" +
                        "Carla\n\n" +

                        "💡 A subquery pode ser executada sozinha,\n" +
                        "pois não depende de nenhuma coluna da tabela ALUNOS."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "SUBQUERY_CORRELACIONADA",
                "🧭 Subquery Correlacionada (Vídeo 19)",
                "📌 Subconsulta depende da consulta externa:\n" +
                        "🔄 Executa linha por linha da consulta externa.\n\n" +

                        "📋 Tabela CAPITAIS:\n" +
                        "ID | CAPITAL\n" +
                        "1  | São Paulo\n" +
                        "2  | Rio de Janeiro\n" +
                        "3  | Belo Horizonte\n\n" +

                        "📋 Tabela ALUNOS:\n" +
                        "ID | NOME   | CIDADE\n" +
                        "1  | Ana    | São Paulo\n" +
                        "2  | Bruno  | Campinas\n" +
                        "3  | Carla  | Rio de Janeiro\n" +
                        "4  | Daniel | São Paulo\n\n" +

                        "📝 SELECT * FROM Capitais C\n" +
                        "   WHERE EXISTS (\n" +
                        "      SELECT 1\n" +
                        "      FROM Alunos A\n" +
                        "      WHERE A.Cidade = C.Capital\n" +
                        "   );\n\n" +

                        "✅ Resultado:\n" +
                        "São Paulo\n" +
                        "Rio de Janeiro\n\n" +

                        "💡 Explicação:\n" +
                        "Para cada capital da consulta externa, a subconsulta verifica\n" +
                        "se existe pelo menos um aluno naquela cidade.\n" +
                        "Belo Horizonte não aparece porque nenhum aluno mora nela.\n\n" +

                        "❌ NÃO pode ser executada sozinha.\n" +
                        "📌 Referencia colunas da consulta externa."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "EXISTS_OPERADOR",
                "🧭 EXISTS (Vídeo 19)",
                "📌 EXISTS testa se subconsulta retorna linhas:\n" +
                        "✅ Retorna TRUE se pelo menos UMA linha.\n" +
                        "❌ Retorna FALSE se NENHUMA linha.\n" +
                        "📝 WHERE EXISTS (SELECT 1 FROM tabela WHERE condicao);\n" +
                        "🚀 Muito usado em subconsultas correlacionadas."
        ));

        // ============================================================
        // VÍDEO 20 - AULA: COMANDOS DML (PARTE 10) - APROFUNDANDO EM EXISTS E SUBQUERIES CORRELACIONADAS
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "EXISTS_CORRELACIONADO",
                "🧭 EXISTS Correlacionado (Vídeo 20)",
                "📌 EXISTS com subconsulta correlacionada:\n" +
                        "🔄 Executado para CADA linha da consulta externa.\n" +
                        "🏷️ ALIAS é essencial para diferenciar tabelas.\n" +
                        "📝 Exemplo: WHERE EXISTS (SELECT * FROM ArvoreGenealogica AG WHERE AG.Ascendente = 'Bruno' AND AG.Descendente = A.Ascendente);\n" +
                        "🧩 Foque na condição fixa da subconsulta para resolver.\n\n" +

                        "💡 Exemplo didático:\n\n" +

                        "Tabela ARVORE_GENEALOGICA:\n" +
                        "ASCENDENTE | DESCENDENTE\n" +
                        "Alice      | Laura\n" +
                        "Bruno      | Eliz\n" +
                        "Bruno      | Hugo\n" +
                        "Eliz       | Caio\n" +
                        "Gabi       | Alice\n" +
                        "Hugo       | Gabi\n" +
                        "Judide     | Laura\n\n" +

                        "Consulta:\n" +
                        "SELECT A.Ascendente\n" +
                        "FROM ArvoreGenealogica A\n" +
                        "WHERE EXISTS (\n" +
                        "   SELECT *\n" +
                        "   FROM ArvoreGenealogica AG\n" +
                        "   WHERE AG.Ascendente = 'Bruno'\n" +
                        "     AND AG.Descendente = A.Ascendente\n" +
                        ");\n\n" +

                        "🔎 Como funciona:\n" +
                        "• A consulta externa percorre cada ASCENDENTE da tabela.\n" +
                        "• A subconsulta procura um registro onde o ASCENDENTE seja 'Bruno'.\n" +
                        "• Depois verifica se o DESCENDENTE encontrado é igual ao ASCENDENTE da linha atual.\n\n" +

                        "Passo a passo:\n" +
                        "• Alice  → Bruno possui descendente Alice? ❌\n" +
                        "• Bruno  → Bruno possui descendente Bruno? ❌\n" +
                        "• Bruno  → Bruno possui descendente Bruno? ❌\n" +
                        "• Eliz   → Bruno possui descendente Eliz? ✅\n" +
                        "• Gabi   → Bruno possui descendente Gabi? ❌\n" +
                        "• Hugo   → Bruno possui descendente Hugo? ✅\n" +
                        "• Judide → Bruno possui descendente Judide? ❌\n\n" +

                        "Resultado:\n" +
                        "Eliz\n" +
                        "Hugo\n\n" +

                        "💡 Observe que a condição fixa é AG.Ascendente = 'Bruno'.\n" +
                        "A condição correlacionada é AG.Descendente = A.Ascendente, pois utiliza o valor da linha atual da consulta externa."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "RESOLVER_EXISTS",
                "🧭 Resolvendo EXISTS (Vídeo 20)",
                "📌 Passos para resolver questões com EXISTS:\n" +
                        "1️⃣ Desenhe a tabela para visualizar os dados.\n" +
                        "2️⃣ Identifique a condição FIXA da subconsulta.\n" +
                        "3️⃣ Para cada linha externa, pergunte: \"A subconsulta retorna algo?\"\n" +
                        "4️⃣ Se retornar → TRUE (linha é incluída).\n" +
                        "5️⃣ Se NÃO retornar → FALSE (linha é excluída)."
        ));

        // ============================================================
        // VÍDEO 21 - AULA: COMANDOS DML (PARTE 11) - FUNÇÕES DE AGREGAÇÃO, GROUP BY E HAVING
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "FUNCOES_AGREGACAO",
                "🧭 Funções de Agregação (Vídeo 21)",
                "📌 Funções agregadas realizam cálculos sobre um conjunto de registros.\n\n" +

                        "📋 Tabela PEDIDOS:\n" +
                        "ID | VALOR\n" +
                        "1  | 100\n" +
                        "2  | 250\n" +
                        "3  | 150\n\n" +

                        "🔢 COUNT → Conta linhas ou valores não nulos.\n" +
                        "SELECT COUNT(*) FROM PEDIDOS;\n" +
                        "➡️ Resultado: 3\n\n" +

                        "➕ SUM → Soma valores numéricos.\n" +
                        "SELECT SUM(VALOR) FROM PEDIDOS;\n" +
                        "➡️ Resultado: 500\n\n" +

                        "📊 AVG → Calcula a média.\n" +
                        "SELECT AVG(VALOR) FROM PEDIDOS;\n" +
                        "➡️ Resultado: 166.67\n\n" +

                        "⬆️ MAX → Retorna o maior valor.\n" +
                        "SELECT MAX(VALOR) FROM PEDIDOS;\n" +
                        "➡️ Resultado: 250\n\n" +

                        "⬇️ MIN → Retorna o menor valor.\n" +
                        "SELECT MIN(VALOR) FROM PEDIDOS;\n" +
                        "➡️ Resultado: 100"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "GROUP_BY",
                "🧭 GROUP BY (Vídeo 21)",
                "📌 GROUP BY agrupa linhas que possuem o mesmo valor em uma ou mais colunas.\n\n" +

                        "📋 Tabela CLIENTES:\n" +
                        "ID | NOME\n" +
                        "1  | Ana\n" +
                        "2  | Bruno\n" +
                        "3  | Carla\n\n" +

                        "📋 Tabela PEDIDOS:\n" +
                        "ID | CLIENTE_ID | VALOR\n" +
                        "1  | 1           | 150.00\n" +
                        "2  | 1           | 200.00\n" +
                        "3  | 2           | 300.00\n" +
                        "4  | 3           | 120.00\n" +
                        "5  | 3           | 180.00\n" +
                        "6  | 3           | 250.00\n\n" +

                        "📊 Consulta:\n" +
                        "SELECT C.NOME, COUNT(P.ID)\n" +
                        "FROM CLIENTES C\n" +
                        "JOIN PEDIDOS P ON C.ID = P.CLIENTE_ID\n" +
                        "GROUP BY C.NOME;\n\n" +

                        "📈 Resultado:\n" +
                        "NOME  | TOTAL_PEDIDOS\n" +
                        "Ana   | 2\n" +
                        "Bruno | 1\n" +
                        "Carla | 3\n\n" +

                        "🔑 Como C.NOME aparece no SELECT e não está em uma função agregada, ele deve estar no GROUP BY.\n" +
                        "⚠️ Esquecer o GROUP BY ao selecionar colunas não agregadas gera ERRO."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "HAVING",
                "🧭 HAVING - Filtrando Grupos (Vídeo 21)",
                "📌 HAVING filtra grupos criados pelo GROUP BY.\n\n" +

                        "📖 Exemplo didático:\n" +
                        "Imagine que existam alunos cadastrados nas seguintes cidades:\n" +
                        "- João → Fortaleza\n" +
                        "- Maria → Fortaleza\n" +
                        "- Pedro → Recife\n" +
                        "- Ana → São Paulo\n" +
                        "- Carlos → São Paulo\n\n" +

                        "🔍 Consulta:\n" +
                        "SELECT Cidade, COUNT(CPF)\n" +
                        "FROM Alunos\n" +
                        "GROUP BY Cidade\n" +
                        "HAVING COUNT(CPF) > 1;\n\n" +

                        "✅ Resultado esperado:\n" +
                        "- Fortaleza → 2 alunos\n" +
                        "- São Paulo → 2 alunos\n" +
                        "Recife não aparece porque possui apenas 1 aluno.\n\n" +

                        "⚠️ WHERE filtra LINHAS antes do agrupamento.\n" +
                        "Exemplo:\n" +
                        "WHERE Cidade <> 'Recife'\n" +
                        "Remove os alunos de Recife antes do GROUP BY.\n\n" +

                        "❌ WHERE NÃO pode usar funções agregadas.\n" +
                        "Exemplo inválido:\n" +
                        "WHERE COUNT(CPF) > 1\n\n" +

                        "✅ HAVING PODE usar funções agregadas.\n" +
                        "Exemplo válido:\n" +
                        "HAVING COUNT(CPF) > 1\n\n" +

                        "📌 Ordem de execução:\n" +
                        "1️⃣ WHERE → filtra as linhas.\n" +
                        "2️⃣ GROUP BY → cria os grupos.\n" +
                        "3️⃣ HAVING → filtra os grupos."
        ));

        // ============================================================
        // VÍDEO 22 - AULA: COMANDOS DML (PARTE 12) - CLÁUSULA ORDER BY E FINALIZAÇÃO DO SELECT
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "ORDER_BY",
                "🧭 ORDER BY (Vídeo 22)",
                "📌 ORDER BY ordena os resultados:\n" +
                        "⬆️ ASC → Ordem crescente (PADRÃO).\n" +
                        "⬇️ DESC → Ordem decrescente.\n" +
                        "📝 ORDER BY coluna1 ASC, coluna2 DESC;\n" +
                        "🔢 ORDER BY 2 → Ordena pela 2ª coluna do SELECT.\n" +
                        "📌 É a ÚLTIMA cláusula da consulta."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "ORDER_BY_REGRAS",
                "🧭 ORDER BY - Regras (Vídeo 22)",
                "📌 Regras importantes para ORDER BY.\n\n" +

                        "📖 Exemplo didático:\n" +
                        "Imagine a tabela Alunos com os seguintes registros:\n" +
                        "- ID: 3 | Nome: Carlos | Cidade: Recife\n" +
                        "- ID: 1 | Nome: Ana | Cidade: Fortaleza\n" +
                        "- ID: 2 | Nome: Bruno | Cidade: São Paulo\n\n" +

                        "✅ A coluna usada no ORDER BY deve estar no SELECT ou existir na tabela do FROM.\n" +
                        "Exemplo:\n" +
                        "SELECT Nome FROM Alunos ORDER BY Nome;\n" +
                        "Resultado: Ana, Bruno, Carlos.\n\n" +

                        "🔢 Também é possível ordenar pela posição da coluna no SELECT.\n" +
                        "Exemplo:\n" +
                        "SELECT ID, Nome, Cidade FROM Alunos ORDER BY 2;\n" +
                        "A posição 2 corresponde à coluna Nome.\n" +
                        "Resultado: Ana, Bruno, Carlos.\n\n" +

                        "📌 ORDER BY NÃO depende de WHERE, GROUP BY ou HAVING.\n" +
                        "Ele pode ser usado sozinho apenas para ordenar os registros.\n\n" +

                        "📝 Exemplo válido:\n" +
                        "SELECT * FROM Alunos ORDER BY Nome;\n" +
                        "Os registros serão exibidos em ordem alfabética pelo nome."
        ));

        // ============================================================
        // VÍDEO 23 - AULA: COMANDOS DML (PARTE 13) - LIMIT, UNION, UNION ALL, DTL (COMMIT e ROLLBACK)
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "LIMIT",
                "🧭 LIMIT (Vídeo 23)",
                "📌 LIMIT restringe o número de linhas:\n" +
                        "📊 SELECT * FROM tabela LIMIT 10;\n" +
                        "⚠️ LIMIT NÃO é padrão ANSI (é do MySQL/PostgreSQL).\n" +
                        "🔄 SQL Server usa TOP, Oracle usa ROWNUM.\n" +
                        "📌 Muito usado com ORDER BY (top N)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "UNION_UNION_ALL",
                "🧭 UNION e UNION ALL (Vídeo 23)",
                "📌 UNION combina resultados de SELECTs:\n" +
                        "🔄 UNION → Remove duplicatas.\n" +
                        "🔄 UNION ALL → Mantém duplicatas (mais rápido).\n" +
                        "📋 Requisitos: mesmo número de colunas, tipos compatíveis e mesma ordem.\n\n" +

                        "📊 Exemplo:\n" +
                        "Tabela CLIENTES_SP:\n" +
                        "ID | NOME\n" +
                        "1  | Ana\n" +
                        "2  | Bruno\n" +
                        "3  | Carlos\n\n" +

                        "Tabela CLIENTES_RJ:\n" +
                        "ID | NOME\n" +
                        "1  | Bruno\n" +
                        "2  | Daniela\n" +
                        "3  | Eduardo\n\n" +

                        "✅ UNION:\n" +
                        "SELECT nome FROM CLIENTES_SP\n" +
                        "UNION\n" +
                        "SELECT nome FROM CLIENTES_RJ;\n\n" +

                        "Resultado:\n" +
                        "Ana\n" +
                        "Bruno\n" +
                        "Carlos\n" +
                        "Daniela\n" +
                        "Eduardo\n\n" +

                        "✅ UNION ALL:\n" +
                        "SELECT nome FROM CLIENTES_SP\n" +
                        "UNION ALL\n" +
                        "SELECT nome FROM CLIENTES_RJ;\n\n" +

                        "Resultado:\n" +
                        "Ana\n" +
                        "Bruno\n" +
                        "Carlos\n" +
                        "Bruno\n" +
                        "Daniela\n" +
                        "Eduardo"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "COMMIT_ROLLBACK",
                "🧭 COMMIT e ROLLBACK (Vídeo 23)",
                "📌 Comandos DTL para transações:\n" +
                        "✅ COMMIT → Confirma e torna permanente.\n" +
                        "↩️ ROLLBACK → Desfaz todas as alterações.\n" +
                        "⚠️ Após COMMIT, NÃO é possível usar ROLLBACK.\n" +
                        "🔄 ROLLBACK desfaz desde o último COMMIT/ROLLBACK.\n" +
                        "📌 É o \"Estado QAP\" (temporário até confirmar)."
        ));

        // ============================================================
        // VÍDEO 24 - AULA: COMANDOS DCL (GRANT e REVOKE), COMANDOS DE ADMINISTRAÇÃO E VIEWS
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "GRANT_REVOKE",
                "🧭 GRANT e REVOKE (Vídeo 24)",
                "📌 Comandos DCL para permissões:\n" +
                        "✅ GRANT → Concede permissões.\n" +
                        "❌ REVOKE → Remove permissões.\n" +
                        "📝 GRANT SELECT ON Alunos TO joao;\n" +
                        "📝 REVOKE DELETE ON Alunos FROM maria;\n" +
                        "🔑 Privilégios: SELECT, INSERT, UPDATE, DELETE, REFERENCES, EXECUTE."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "CREATE_DROP_DATABASE",
                "🧭 CREATE/DROP DATABASE (Vídeo 24)",
                "📌 Comandos de administração do banco:\n" +
                        "✅ CREATE DATABASE nome; → Cria um novo banco.\n" +
                        "🔥 DROP DATABASE nome; → Remove o banco (CUIDADO!).\n" +
                        "⚠️ DROP DATABASE apaga TODOS os dados PERMANENTEMENTE.\n" +
                        "📌 Comandos executados por administradores."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "VIEWS",
                "🧭 Views - Tabelas Virtuais (Vídeo 24)",
                "📌 View é uma tabela virtual baseada em SELECT:\n" +
                        "✅ CREATE VIEW [nome_view] AS SELECT ...;\n" +
                        "🔄 CREATE OR REPLACE VIEW → Altera ou cria.\n" +
                        "🔥 DROP VIEW nome; → Remove a view.\n" +
                        "⚠️ View NÃO armazena dados fisicamente.\n" +
                        "🔒 Vantagens: Segurança, simplicidade, performance.\n" +
                        "📌 VDL = View Definition Language."
        ));

        // ============================================================
        // VÍDEO 25 - AULA: CONCEITOS AVANÇADOS - STORED PROCEDURES
        // ============================================================

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "STORED_PROCEDURES",
                "🧭 Stored Procedures (Vídeo 25)",
                "📌 Stored Procedure = código SQL pré-compilado:\n" +
                        "✅ CREATE PROCEDURE nome (@parametro TIPO) AS BEGIN ... END;\n" +
                        "⚡ EXEC nome 'valor'; → Executa a procedure.\n" +
                        "🔑 Aceita parâmetros (entrada e saída).\n" +
                        "📦 Vantagens: Reutilização, performance, segurança."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML (Parte 2)",
                "PROCEDURE_VS_VIEW",
                "🧭 Procedure x View (Vídeo 25)",
                "📌 Diferenças fundamentais:\n" +
                        "📋 VIEW → Tabela virtual com SELECT fixo.\n" +
                        "❌ View NÃO aceita parâmetros.\n" +
                        "📦 PROCEDURE → Bloco de código SQL.\n" +
                        "✅ Procedure ACEITA parâmetros.\n" +
                        "⚡ View usa SELECT; Procedure usa EXEC.\n" +
                        "🎯 Use View para consultas fixas; Use Procedure para lógica parametrizada."
        ));

        return lista;
    }
}
