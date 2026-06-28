package com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FundamentosSqlParte1Flashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ======================================================================
        // VÍDEO 01 - INTRODUÇÃO AO SQL
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Fundamentos",
                "SQL_CONCEITOS_BASE",
                "🧭 O que é SQL e sua importância",
                "📌 SQL (Structured Query Language): linguagem padrão para manipular dados e estruturas em bancos relacionais.\n" +
                        "🔹 Linguagem DECLARATIVA (dá a ordem, não ensina o passo a passo).\n" +
                        "⚙️ SGBD interpreta e executa a parte procedural internamente."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Fundamentos",
                "LINGUAGEM_DECLARATIVA_VS_PROCEDURAL",
                "🧭 Diferença entre linguagens",
                "📌 DECLARATIVA: \"Faça um bolo\" (ordem, sem detalhes).\n" +
                        "🔧 PROCEDURAL: \"Pegue o liquidificador, coloque...\" (passo a passo).\n" +
                        "✅ SQL é DECLARATIVA; SGBD executa os passos proceduralmente."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Fundamentos",
                "EXTENSOES_PROCEDURAIS",
                "🧭 Extensões procedurais do SQL",
                "🔶 PL/SQL → Oracle.\n" +
                        "🔷 T-SQL (Transaction SQL) → SQL Server.\n" +
                        "➕ Adicionam recursos procedurais ao SQL declarativo."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Fundamentos",
                "CHAR_VS_VARCHAR",
                "🧭 Diferença entre CHAR e VARCHAR",
                "📦 CHAR(N): tamanho FIXO de N caracteres (obrigatório).\n" +
                        "📏 VARCHAR(N): tamanho MÁXIMO de N caracteres (variável).\n" +
                        "💡 EX: CHAR(30) = sempre 30; VARCHAR(30) = até 30."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Fundamentos",
                "CASE_SENSITIVE_SQL",
                "🧭 Case sensitive no SQL",
                "🔤 COMANDOS NÃO são case sensitive: CREATE = create.\n" +
                        "🔠 DADOS são case sensitive: 'Emanuel' ≠ 'emanuel'.\n" +
                        "💬 Valores literais vão entre aspas simples ('texto')."
        ));

        // ======================================================================
        // VÍDEO 02 - TIPOS DE DADOS
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Tipos de Dados",
                "TIPOS_TEXTUAIS",
                "🧭 Tipos de dados para texto",
                "📦 CHAR(N): tamanho FIXO (ex: sexo 'F'/'M').\n" +
                        "📏 VARCHAR(N): tamanho MÁXIMO (mais usado no dia a dia).\n" +
                        "📄 CLOB: Character Large Object - textos gigantescos."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Tipos de Dados",
                "TIPOS_NUMERICOS",
                "🧭 Tipos numéricos: precisão e escala",
                "🔢 PRECISÃO: número TOTAL de dígitos.\n" +
                        "🎯 ESCALA: número de dígitos após o ponto decimal.\n" +
                        "📊 EX: 5279.18436 → precisão 9, escala 5.\n" +
                        "⚖️ Declaração: FLOAT(9,3) - máximo, não obrigatório."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Tipos de Dados",
                "TIPOS_BINARIOS",
                "🧭 Tipos binários (BIT e BLOB)",
                "🔲 BIT(N): cadeia de bits de tamanho FIXO.\n" +
                        "🔳 BIT VARYING(N): cadeia de bits de tamanho MÁXIMO.\n" +
                        "💾 BLOB: Binary Large Object - imagens, vídeos, documentos."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Tipos de Dados",
                "TIPO_BOOLEAN",
                "🧭 Tipo BOOLEAN e o NULL",
                "🎯 Valores: TRUE, FALSE e NULL.\n" +
                        "🚫 NULL = dado NÃO FORNECIDO (ausência de valor).\n" +
                        "❌ NULL ≠ VAZIO (\"\") ≠ ZERO (0).\n" +
                        "💾 Ocupa 1 byte."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Tipos de Dados",
                "TIPOS_DATA_HORA",
                "🧭 DATE, TIME, TIMESTAMP, INTERVAL e DATETIME",
                "📅 DATE: YYYY-MM-DD (10 posições - mês 1-12, dia 1-31).\n" +
                        "⏰ TIME: HH:MM:SS (8 posições - hora 0-23).\n" +
                        "📌 TIMESTAMP: Data + Hora + Fuso horário (momento exato).\n" +
                        "⏳ INTERVAL: cálculo de diferenças temporais.\n"+
                        "💾 DATETIME: Data e hora combinados (Armazenamento integrado)."
        ));

        // ======================================================================
        // VÍDEO 03 - SUBLINGUAGENS E DDL (CREATE TABLE)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Sublinguagens",
                "DDL_DML_DCL_DTL",
                "🧭 As 4 sublinguagens do SQL",
                "🏗️ DDL (Definição): CREATE, DROP, TRUNCATE, ALTER, RENAME.\n" +
                        "📊 DML (Manipulação): SELECT, INSERT, UPDATE, DELETE.\n" +
                        "🔐 DCL (Controle): GRANT, REVOKE.\n" +
                        "💳 DTL/TCL (Transação): COMMIT, ROLLBACK."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Sublinguagens",
                "SELECT_DML_OU_DQL",
                "🧭 O SELECT pode ser DML ou DQL?",
                "📊 Visão tradicional: SELECT é DML (manipula dados).\n" +
                        "📋 Algumas bancas (CESPE, César Gran Hill): SELECT é DQL.\n" +
                        "⭐ REGRA DE OURO: ambos são aceitos em prova!"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "CREATE_TABLE_SINTAXE",
                "🧭 Sintaxe do CREATE TABLE",
                "✏️ Ordem: CREATE TABLE nome (coluna tipo restrição, ...);\n" +
                        "📋 Elementos obrigatórios: CREATE, TABLE, nome, parênteses.\n" +
                        "🔸 Separador entre colunas: VÍRGULA (,).\n" +
                        "🔹 Final: PONTO E VÍRGULA (;)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "CREATE_TABLE_ORDER",
                "🧭 Ordem dos elementos na coluna",
                "1️⃣ 1º: Nome da coluna.\n" +
                        "2️⃣ 2º: Tipo do dado (CHAR, VARCHAR, INT...).\n" +
                        "3️⃣ 3º: Restrição (NOT NULL, PRIMARY KEY...).\n" +
                        "❌ ERRADO: NOT NULL nome VARCHAR; → ordem incorreta!"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "CREATE_TABLE_AS",
                "🧭 Criar tabela a partir de outra",
                "🧭 Criar tabela a partir de outra\n" +
                        "📋 CREATE TABLE nova AS SELECT colunas FROM antiga;\n" +
                        "📦 Copia ESTRUTURA e DADOS da tabela antiga.\n" +
                        "⚠️ Se origem tiver dados, a nova também terá!"
        ));

        // ======================================================================
        // VÍDEO 04 - DDL (DROP, TRUNCATE, ALTER, RENAME)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "DROP_VS_TRUNCATE",
                "🧭 DROP vs TRUNCATE - diferenças",
                "💣 DROP: apaga TABELA e DADOS (remove estrutura).\n" +
                        "🧹 TRUNCATE: apaga DADOS (mantém estrutura).\n" +
                        "🚫 TRUNCATE NÃO aceita WHERE.\n" +
                        "⚠️ DROP geralmente IRREVERSÍVEL."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "ALTER_TABLE_OPERACOES",
                "🧭 ALTER TABLE - principais operações",
                "🧭 ALTER TABLE - principais operações: \n" +
                        "➕ ADD COLUMN: adiciona nova coluna.\n" +
                        "➖ DROP COLUMN: remove coluna (só o nome, sem tipo).\n" +
                        "✏️ ALTER/MODIFY COLUMN: altera tipo ou restrição.\n" +
                        "🔄 RENAME: renomeia tabela ou coluna."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "ALTER_SINTAXE_SGBD",
                "🧭 Variações do ALTER por SGBD",
                "🧭 Variações do ALTER por SGBD\n" +
                        "🟦 SQL Server / Access: ALTER COLUMN.\n" +
                        "🟩 MySQL / Oracle 10g+: MODIFY.\n" +
                        "➕ Adicionar coluna: ADD (todos).\n" +
                        "➖ Apagar coluna: DROP COLUMN (padrão) ou DROP (MySQL)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "RENAME_TABELA",
                "🧭 Renomear tabela - duas formas",
                "🧭 Renomear tabela - duas formas: \n" +
                        "📝 Forma 1: RENAME TABLE antigo TO novo;\n" +
                        "📝 Forma 2: ALTER TABLE antigo RENAME TO novo;\n" +
                        "✅ Ambas são aceitáveis em prova!"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DDL",
                "RENAME_COLUNA",
                "🧭 Renomear coluna",
                "🧭 Renomear coluna:\n" +
                        "ALTER TABLE nome_tabela RENAME COLUMN nome_antigo TO nome_novo;"
        ));

        // ======================================================================
        // VÍDEO 05 - RESTRIÇÕES (CONSTRAINTS) - PARTE 1 (NOT NULL)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "CONSTRAINTS_CONCEITO",
                "🧭 O que são restrições (constraints)",
                "⛔ Limitações/regras para os dados na tabela.\n" +
                        "✅ Garantem: qualidade, confiabilidade e integridade.\n" +
                        "🎯 Aplicam-se à COLUNA INTEIRA ou à TABELA.\n" +
                        "🚫 NÃO se aplicam a linhas específicas."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Principais Constraints",
                "CONSTRAINTS_PRINCIPAIS",
                "🧭 Quais são as principais restrições (constraints)",
                "⛔ NOT NULL → Impede valores nulos.\n" +
                        "   ✅ Coluna obrigatória.\n\n" +
                        "🔐 UNIQUE → Garante valores únicos.\n" +
                        "   🚫 Não permite duplicatas.\n\n" +
                        "🔑 PRIMARY KEY → Define a chave primária.\n" +
                        "   ✅ UNIQUE + NOT NULL.\n\n" +
                        "🔗 FOREIGN KEY → Define chave estrangeira (pode ser nulo).\n" +
                        "   🔄 Referencia outra tabela.\n\n" +
                        "✔️ CHECK → Valida uma condição.\n" +
                        "   🎯 Filtra valores permitidos.\n\n" +
                        "⚙️ DEFAULT → Define valor padrão.\n" +
                        "   🤖 Preenche automaticamente se não informado."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "NOT_NULL_CONCEITO",
                "🧭 Restrição NOT NULL - conceito",
                "🚫 Impede valores NULL na coluna (torna OBRIGATÓRIA).\n" +
                        "📌 Por padrão, colunas ACEITAM NULL.\n" +
                        "❓ NULL = dado NÃO FORNECIDO (≠ 0, ≠ vazio).\n" +
                        "🔑 PRIMARY KEY já implica NOT NULL automaticamente."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "NOT_NULL_SINTAXE",
                "🧭 Sintaxe do NOT NULL",
                "✏️ CREATE: coluna tipo NOT NULL.\n" +
                        "🔄 ALTER (SQL Server): ALTER TABLE tabela ALTER COLUMN coluna tipo NOT NULL;\n" +
                        "📋 Ordem: NOME → TIPO → NOT NULL."
        ));

        // ======================================================================
        // VÍDEO 06 - RESTRIÇÕES (UNIQUE E PRIMARY KEY)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "UNIQUE_CONCEITO",
                "🧭 Restrição UNIQUE - conceito",
                "🆓 Impede valores repetidos na coluna.\n" +
                        "🔢 Pode ter vários UNIQUE por tabela.\n" +
                        "🔹 Permite NULL (em muitos SGBDs).\n" +
                        "⚠️ Nem todo UNIQUE é PRIMARY KEY."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "PRIMARY_KEY_CONCEITO",
                "🧭 Restrição PRIMARY KEY - conceito",
                "🔑 Identifica unicamente cada registro da tabela.\n" +
                        "PK = UNIQUE + NOT NULL (automaticamente).\n" +
                        "1️⃣ Apenas UMA por tabela.\n" +
                        "🧩 Pode ser COMPOSTA (várias colunas)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "PK_UNIQUE_NOTNULL",
                "🧭 Comparação: NOT NULL × UNIQUE × PK",
                "🔑 PRIMARY KEY: NOT NULL + UNIQUE.\n" +
                        "🆓 UNIQUE: permite NULL; não é PK.\n" +
                        "🚫 NOT NULL: só impede NULL; não é único.\n" +
                        "✅ Toda PK é UNIQUE, mas nem toda UNIQUE é PK."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "UNIQUE_SINTAXE",
                "🧭 Sintaxe do UNIQUE",
                "🧭 Sintaxe do UNIQUE.\n" +
                        "✏️ Direto: matricula INTEGER UNIQUE.\n" +
                        "✏️ Separado: No final das definições dos campos -> UNIQUE (matricula).\n" +
                        "✏️ Com nome: Define um nome para a restrição ->  CONSTRAINT nome UNIQUE (matricula).\n" +
                        "🧩 Múltiplas colunas: CONSTRAINT nome UNIQUE (col1, col2)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "REMOVER_UNIQUE_SINTAXE",
                "🧭 Sintaxe para Remover UNIQUE",
                "🧭 Sintaxe para Remover UNIQUE.\n" +
                        "Em SQL Server, Oracle, Acess: \n" +
                        "EX.: ALTER TABLE aluno DROP CONSTRAINT uk_matricula;\n" +
                        "Em MySql: \n" +
                        "Ex.: ALTER TABLE aluno DROP INDEX uk_matricula;"
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "PRIMARY_KEY_SINTAXE",
                "🧭 Sintaxe da PRIMARY KEY",
                "🧭 Sintaxe da PRIMARY KEY\n" +
                        "✏️ Direto: CPF INTEGER PRIMARY KEY.\n" +
                        "✏️ Separado: No final das definições dos campos -> PRIMARY KEY (CPF).\n" +
                        "🧩 Composta: PRIMARY KEY (id_aluno, id_curso).\n" +
                        "✏️ Com nome: Define um nome para a restrição -> CONSTRAINT pk_nome PRIMARY KEY (CPF)."
        ));

        // ======================================================================
        // VÍDEO 07 - RESTRIÇÕES (FOREIGN KEY E CHECK)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "FOREIGN_KEY_CONCEITO",
                "🧭 FOREIGN KEY - conceito e tabelas",
                "🔗 Estabelece relacionamentos entre tabelas.\n" +
                        "👨‍👧 TABELA PAI: contém a PRIMARY KEY referenciada.\n" +
                        "👶 TABELA FILHA: contém a FOREIGN KEY.\n" +
                        "🔹 FK pode ser NULL e pode ser Composta."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "ON_DELETE_CASCADE",
                "🧭 ON DELETE CASCADE - cuidado!",
                "💣 Ao excluir registro da tabela PAI, exclui automaticamente os FILHOS.\n" +
                        "⚠️ É RADICAL - pode causar perda massiva de dados.\n" +
                        "🔴 Use com MUITA atenção em produção.\n" +
                        "🔄 Geralmente melhor controlar pela aplicação."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "CHECK_CONCEITO",
                "🧭 Restrição CHECK - conceito",
                "✅ Limita os valores aceitos em uma coluna.\n" +
                        "📋 Define uma condição booleana que deve ser satisfeita.\n" +
                        "🎯 Pode ser aplicada à coluna ou tabela inteira.\n" +
                        "📌 Ex: CHECK (idade >= 18) ou CHECK (idade >= 18 AND sexo = 'F')."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "CHECK_SINTAXE",
                "🧭 Sintaxe do CHECK",
                "✏️ Direto: idade INTEGER CHECK (idade >= 18).\n" +
                        "✏️ Com nome: CONSTRAINT chk_idade CHECK (idade >= 18).\n" +
                        "🧩 Composto: CHECK (idade >= 18 AND sexo = 'F').\n" +
                        "🔄 ALTER: ADD CONSTRAINT chk_idade CHECK (idade >= 18)."
        ));

        // ======================================================================
        // VÍDEO 08 - RESTRIÇÕES (DEFAULT E QUESTÕES)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "DEFAULT_CONCEITO",
                "🧭 Restrição DEFAULT - conceito",
                "🎯 Define um valor PADRÃO para a coluna.\n" +
                        "📥 Usado quando NENHUM valor é fornecido na inserção.\n" +
                        "✏️ Pode ser sobrescrito pelo usuário.\n" +
                        "📌 Sintaxe: cidade VARCHAR(50) DEFAULT 'Brasília'."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "DEFAULT_SINTAXE",
                "🧭 Sintaxe do DEFAULT por SGBD",
                "🟦 SQL Server: ALTER TABLE ... ADD CONSTRAINT df_nome DEFAULT 'valor' FOR coluna;\n" +
                        "🟩 MySQL: ALTER TABLE ... ALTER COLUMN coluna SET DEFAULT 'valor';\n" +
                        "🟧 Oracle: ALTER TABLE ... MODIFY coluna DEFAULT 'valor';\n" +
                        "🗑️ Remover: DROP DEFAULT ou SET DEFAULT NULL."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Constraints",
                "TABELA_ASSOCIATIVA",
                "🧭 Tabela associativa (N:N)",
                "🔄 Indica cardinalidade MUITOS PARA MUITOS.\n" +
                        "🔑 PRIMARY KEY é COMPOSTA pelas duas FKs.\n" +
                        "🔗 Cada FK referencia a PK de sua tabela origem.\n" +
                        "📌 Ex: matricula_curso (id_aluno, id_curso)."
        ));

        // ======================================================================
        // VÍDEO 09 - REVISÃO DDL + INTRODUÇÃO DML
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - DML",
                "COMANDOS_EXCLUSAO",
                "🧭 Comandos de exclusão - comparativo",
                "💣 DROP: apaga DADOS e ESTRUTURA (DDL, sem WHERE).\n" +
                        "🧹 TRUNCATE: apaga DADOS, mantém ESTRUTURA (DDL, sem WHERE).\n" +
                        "🗑️ DELETE: apaga DADOS, mantém ESTRUTURA (DML, com WHERE)."
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML",
                "UPDATE_SINTAXE",
                "🧭 Comando UPDATE - sintaxe",
                "✏️ UPDATE tabela SET coluna = valor WHERE condição;\n" +
                        "🔄 Altera dados existentes na tabela.\n" +
                        "🎯 WHERE especifica qual(is) registro(s) atualizar.\n" +
                        "⚠️ Sem WHERE, atualiza TODOS os registros!"
        ));

        lista.add(new Flashcard(
                "📘 SQL - DML",
                "ESTRATEGIA_PALAVRAS_CHAVE",
                "🧭 Estratégia de palavras-chave para provas",
                "🏗️ \"Estrutura da tabela\" → DROP ou TRUNCATE.\n" +
                        "📊 \"Apenas dados\" → DELETE ou TRUNCATE.\n" +
                        "🆓 \"Valores repetidos\" → UNIQUE.\n" +
                        "🎯 \"Valor padrão\" → DEFAULT.\n" +
                        "✅ \"Condição\" → CHECK.\n" +
                        "🔗 \"Relacionamento\" → FOREIGN KEY."
        ));

        // ======================================================================
        // VÍDEO 10 - REVISÃO DDL (PARTE 2)
        // ======================================================================

        lista.add(new Flashcard(
                "📘 SQL - Revisão",
                "SQL_CARACTERISTICAS",
                "🧭 Características principais do SQL",
                "📌 Linguagem DECLARATIVA (dá a ordem, sem passo a passo).\n" +
                        "📅 Padronização: ANSI (1986) e ISO (1987).\n" +
                        "⚡ Permite otimização: SGBD escolhe plano de execução.\n" +
                        "🗄️ Manipula dados e estruturas em bancos relacionais."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Revisão",
                "RESUMO_SUBLINGUAGENS",
                "🧭 Resumo das sublinguagens SQL",
                "🏗️ DDL: CREATE, DROP, TRUNCATE, ALTER, RENAME.\n" +
                        "📊 DML: SELECT, INSERT, UPDATE, DELETE.\n" +
                        "🔐 DCL: GRANT, REVOKE.\n" +
                        "💳 DTL: COMMIT, ROLLBACK."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Revisão",
                "ESTRATEGIA_AMBIGUIDADE",
                "🧭 Estratégia para questões ambíguas",
                "🔍 Enunciado com informações faltando → marque a MENOS ERRADA.\n" +
                        "🔎 Duas alternativas parecem corretas → verifique SINTATXE.\n" +
                        "❌ Elimine por: ordem, separadores, parênteses, ponto e vírgula.\n" +
                        "💡 Use lógica: PK é o campo lógico de identificação."
        ));

        lista.add(new Flashcard(
                "📘 SQL - Revisão",
                "GABARITO_QUESTAO_22",
                "🧭 Otimização de consultas (FGV)",
                "⚡ SQL é propício à otimização por ser DECLARATIVA.\n" +
                        "🎯 Permite diferentes planos de execução pelo SGBD.\n" +
                        "🔒 Linguagens procedurais são mais rígidas.\n" +
                        "🚫 Não tem relação com sintaxe, subconsultas ou persistência."
        ));

        return lista;
    }
}