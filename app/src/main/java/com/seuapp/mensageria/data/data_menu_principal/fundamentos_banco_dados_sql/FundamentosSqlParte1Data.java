package com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class FundamentosSqlParte1Data {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Vídeo 01 - Introdução ao SQL
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo("SQL_CONCEITOS_BASE",
                "SQL_CONCEITOS_BASE"));

        video01.add(new Conteudo("LINGUAGEM_DECLARATIVA_VS_PROCEDURAL",
                "LINGUAGEM_DECLARATIVA_VS_PROCEDURAL"));

        video01.add(new Conteudo("EXTENSOES_PROCEDURAIS",
                "EXTENSOES_PROCEDURAIS"));

        video01.add(new Conteudo("CHAR_VS_VARCHAR",
                "CHAR_VS_VARCHAR"));

        video01.add(new Conteudo("CASE_SENSITIVE_SQL",
                "CASE_SENSITIVE_SQL"));

        secoes.add(new Secao("🧭 Vídeo 01 - Introdução ao SQL", video01));

        // =========================================================
        // SEÇÃO 02: Vídeo 02 - Tipos de Dados
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(new Conteudo("TIPOS_TEXTUAIS",
                "TIPOS_TEXTUAIS"));

        video02.add(new Conteudo("TIPOS_NUMERICOS",
                "TIPOS_NUMERICOS"));

        video02.add(new Conteudo("TIPOS_BINARIOS",
                "TIPOS_BINARIOS"));

        video02.add(new Conteudo("TIPO_BOOLEAN",
                "TIPO_BOOLEAN"));

        video02.add(new Conteudo("TIPOS_DATA_HORA",
                "TIPOS_DATA_HORA"));

        secoes.add(new Secao("🧭 Vídeo 02 - Tipos de Dados", video02));

        // =========================================================
        // SEÇÃO 03: Vídeo 03 - Sublinguagens e DDL (CREATE TABLE)
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo("DDL_DML_DCL_DTL",
                "DDL_DML_DCL_DTL"));

        video03.add(new Conteudo("SELECT_DML_OU_DQL",
                "SELECT_DML_OU_DQL"));

        video03.add(new Conteudo("CREATE_TABLE_SINTAXE",
                "CREATE_TABLE_SINTAXE"));

        video03.add(new Conteudo("CREATE_TABLE_ORDER",
                "CREATE_TABLE_ORDER"));

        video03.add(new Conteudo("CREATE_TABLE_AS",
                "CREATE_TABLE_AS"));

        secoes.add(new Secao("🧭 Vídeo 03 - Sublinguagens e DDL (CREATE TABLE)", video03));

        // =========================================================
        // SEÇÃO 04: Vídeo 04 - DDL (DROP, TRUNCATE, ALTER, RENAME)
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo("DROP_VS_TRUNCATE",
                "DROP_VS_TRUNCATE"));

        video04.add(new Conteudo("ALTER_TABLE_OPERACOES",
                "ALTER_TABLE_OPERACOES"));

        video04.add(new Conteudo("ALTER_SINTAXE_SGBD",
                "ALTER_SINTAXE_SGBD"));

        video04.add(new Conteudo("RENAME_TABELA",
                "RENAME_TABELA"));

        video04.add(new Conteudo("RENAME_COLUNA",
                "RENAME_COLUNA"));

        secoes.add(new Secao("🧭 DDL (DROP, TRUNCATE, ALTER, RENAME)", video04));

        // =========================================================
        // SEÇÃO 05: Vídeo 05 - Restrições (NOT NULL)
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo("CONSTRAINTS_CONCEITO",
                "CONSTRAINTS_CONCEITO"));

        video05.add(new Conteudo("CONSTRAINTS_PRINCIPAIS",
                "CONSTRAINTS_PRINCIPAIS"));

        video05.add(new Conteudo("NOT_NULL_CONCEITO",
                "NOT_NULL_CONCEITO"));

        video05.add(new Conteudo("NOT_NULL_SINTAXE",
                "NOT_NULL_SINTAXE"));

        secoes.add(new Secao("🧭 Vídeo 05 - Restrições (NOT NULL)", video05));

        // =========================================================
        // SEÇÃO 06: Vídeo 06 - Restrições (UNIQUE e PRIMARY KEY)
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(new Conteudo("UNIQUE_CONCEITO",
                "UNIQUE_CONCEITO"));

        video06.add(new Conteudo("PRIMARY_KEY_CONCEITO",
                "PRIMARY_KEY_CONCEITO"));

        video06.add(new Conteudo("PK_UNIQUE_NOTNULL",
                "PK_UNIQUE_NOTNULL"));

        video06.add(new Conteudo("UNIQUE_SINTAXE",
                "UNIQUE_SINTAXE"));

        video06.add(new Conteudo("REMOVER_UNIQUE_SINTAXE",
                "REMOVER_UNIQUE_SINTAXE"));

        video06.add(new Conteudo("PRIMARY_KEY_SINTAXE",
                "PRIMARY_KEY_SINTAXE"));

        secoes.add(new Secao("🧭 Vídeo 06 - Restrições (UNIQUE e PRIMARY KEY)", video06));

        // =========================================================
        // SEÇÃO 07: Vídeo 07 - Restrições (FOREIGN KEY e CHECK)
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(new Conteudo("FOREIGN_KEY_CONCEITO",
                "FOREIGN_KEY_CONCEITO"));

        video07.add(new Conteudo("ON_DELETE_CASCADE",
                "ON_DELETE_CASCADE"));

        video07.add(new Conteudo("CHECK_CONCEITO",
                "CHECK_CONCEITO"));

        video07.add(new Conteudo("CHECK_SINTAXE",
                "CHECK_SINTAXE"));

        secoes.add(new Secao("🧭 Vídeo 07 - Restrições (FOREIGN KEY e CHECK)", video07));

        // =========================================================
        // SEÇÃO 08: Vídeo 08 - Restrições (DEFAULT e Questões)
        // =========================================================

        List<Conteudo> video08 = new ArrayList<>();

        video08.add(new Conteudo("DEFAULT_CONCEITO",
                "DEFAULT_CONCEITO"));

        video08.add(new Conteudo("DEFAULT_SINTAXE",
                "DEFAULT_SINTAXE"));

        video08.add(new Conteudo("TABELA_ASSOCIATIVA",
                "TABELA_ASSOCIATIVA"));

        secoes.add(new Secao("🧭 Vídeo 08 - Restrições (DEFAULT e Questões)", video08));

        // =========================================================
        // SEÇÃO 09: Vídeo 09 - Revisão DDL + Introdução DML
        // =========================================================

        List<Conteudo> video09 = new ArrayList<>();

        video09.add(new Conteudo("COMANDOS_EXCLUSAO",
                "COMANDOS_EXCLUSAO"));

        video09.add(new Conteudo("UPDATE_SINTAXE",
                "UPDATE_SINTAXE"));

        video09.add(new Conteudo("ESTRATEGIA_PALAVRAS_CHAVE",
                "ESTRATEGIA_PALAVRAS_CHAVE"));

        secoes.add(new Secao("🧭 Vídeo 09 - Revisão DDL + Introdução DML", video09));

        // =========================================================
        // SEÇÃO 10: Vídeo 10 - Revisão DDL (Parte 2)
        // =========================================================

        List<Conteudo> video10 = new ArrayList<>();

        video10.add(new Conteudo("SQL_CARACTERISTICAS",
                "SQL_CARACTERISTICAS"));

        video10.add(new Conteudo("RESUMO_SUBLINGUAGENS",
                "RESUMO_SUBLINGUAGENS"));

        video10.add(new Conteudo("ESTRATEGIA_AMBIGUIDADE",
                "ESTRATEGIA_AMBIGUIDADE"));

        video10.add(new Conteudo("GABARITO_QUESTAO_22",
                "GABARITO_QUESTAO_22"));

        secoes.add(new Secao("🧭 Vídeo 10 - Revisão DDL (Parte 2)", video10));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Fundamentos de SQL - Parte 1",
                secoes
        );
    }
}
