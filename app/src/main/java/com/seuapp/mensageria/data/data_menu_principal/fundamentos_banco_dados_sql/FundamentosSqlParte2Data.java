package com.seuapp.mensageria.data.data_menu_principal.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class FundamentosSqlParte2Data {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Comandos DML Parte 1 - INSERT, UPDATE e DELETE (Vídeo 11)
        // =========================================================

        List<Conteudo> dmlParte1 = new ArrayList<>();

        dmlParte1.add(
                new Conteudo("INSERT_INTO",
                        "INSERT_INTO")
        );

        dmlParte1.add(
                new Conteudo("UPDATE_SEM_WHERE",
                        "UPDATE_SEM_WHERE")
        );

        dmlParte1.add(
                new Conteudo("DELETE_REGISTROS",
                        "DELETE_REGISTROS")
        );

        secoes.add(new Secao("Comandos DML - INSERT, UPDATE e DELETE", dmlParte1));

        // =========================================================
        // SEÇÃO 02: Comandos DML Parte 2 - UPDATE, DELETE e SELECT (Vídeo 12)
        // =========================================================

        List<Conteudo> dmlParte2 = new ArrayList<>();

        dmlParte2.add(
                new Conteudo("DELETE_TRUNCATE_DROP",
                        "DELETE_TRUNCATE_DROP")
        );

        dmlParte2.add(
                new Conteudo("SELECT_SINTAXE_BASICA",
                        "SELECT_SINTAXE_BASICA")
        );

        dmlParte2.add(
                new Conteudo("DISTINCT_ALIAS",
                        "DISTINCT_ALIAS")
        );

        secoes.add(new Secao("Comandos DML - SELECT e Operadores", dmlParte2));

        // =========================================================
        // SEÇÃO 03: FROM e JOIN (Vídeo 13)
        // =========================================================

        List<Conteudo> fromJoin = new ArrayList<>();

        fromJoin.add(
                new Conteudo("JOIN_TIPOS",
                        "JOIN_TIPOS")
        );

        fromJoin.add(
                new Conteudo("FROM_E_JOIN",
                        "FROM_E_JOIN")
        );

        fromJoin.add(
                new Conteudo("PRODUTO_CARTESIANO",
                        "PRODUTO_CARTESIANO")
        );

        secoes.add(new Secao("FROM e JOIN", fromJoin));

        // =========================================================
        // SEÇÃO 04: INNER JOIN, LEFT JOIN e RIGHT JOIN (Vídeo 14)
        // =========================================================

        List<Conteudo> innerLeftRight = new ArrayList<>();

        innerLeftRight.add(
                new Conteudo("INNER_LEFT_RIGHT",
                        "INNER_LEFT_RIGHT")
        );

        innerLeftRight.add(
                new Conteudo("CONDICOES_JOIN",
                        "CONDICOES_JOIN")
        );

        secoes.add(new Secao("INNER, LEFT e RIGHT JOIN", innerLeftRight));

        // =========================================================
        // SEÇÃO 05: RIGHT JOIN, FULL OUTER JOIN e SELF JOIN (Vídeo 15)
        // =========================================================

        List<Conteudo> rightFullSelf = new ArrayList<>();

        rightFullSelf.add(
                new Conteudo("RIGHT_FULL_SELF",
                        "RIGHT_FULL_SELF")
        );

        rightFullSelf.add(
                new Conteudo("SELF_JOIN_EXEMPLO",
                        "SELF_JOIN_EXEMPLO")
        );

        secoes.add(new Secao("RIGHT, FULL OUTER e SELF JOIN", rightFullSelf));

        // =========================================================
        // SEÇÃO 06: WHERE, Operadores Relacionais e Lógicos (Vídeo 16)
        // =========================================================

        List<Conteudo> whereOperadores = new ArrayList<>();

        whereOperadores.add(
                new Conteudo("WHERE_FILTRO",
                        "WHERE_FILTRO")
        );

        whereOperadores.add(
                new Conteudo("OPERADORES_LOGICOS",
                        "OPERADORES_LOGICOS")
        );

        secoes.add(new Secao("WHERE, Operadores Relacionais e Lógicos", whereOperadores));

        // =========================================================
        // SEÇÃO 07: BETWEEN e LIKE (Vídeo 17)
        // =========================================================

        List<Conteudo> betweenLike = new ArrayList<>();

        betweenLike.add(
                new Conteudo("BETWEEN_INCLUSIVO",
                        "BETWEEN_INCLUSIVO")
        );

        betweenLike.add(
                new Conteudo("LIKE_PADROES",
                        "LIKE_PADROES")
        );

        betweenLike.add(
                new Conteudo("LIKE_EXEMPLOS",
                        "LIKE_EXEMPLOS")
        );

        secoes.add(new Secao("BETWEEN e LIKE", betweenLike));

        // =========================================================
        // SEÇÃO 08: IS NULL, IS NOT NULL, IN e NOT IN (Vídeo 18)
        // =========================================================

        List<Conteudo> isNullIn = new ArrayList<>();

        isNullIn.add(
                new Conteudo("IS_NULL_IS_NOT_NULL",
                        "IS_NULL_IS_NOT_NULL")
        );

        isNullIn.add(
                new Conteudo("IN_NOT_IN",
                        "IN_NOT_IN")
        );

        isNullIn.add(
                new Conteudo("SUBQUERY_IN",
                        "SUBQUERY_IN")
        );

        secoes.add(new Secao("IS NULL, IS NOT NULL, IN e NOT IN", isNullIn));

        // =========================================================
        // SEÇÃO 09: Subqueries Correlacionadas e Não Correlacionadas (Vídeo 19)
        // =========================================================

        List<Conteudo> subqueries = new ArrayList<>();

        subqueries.add(
                new Conteudo("SUBQUERY_NAO_CORRELACIONADA",
                        "SUBQUERY_NAO_CORRELACIONADA")
        );

        subqueries.add(
                new Conteudo("SUBQUERY_CORRELACIONADA",
                        "SUBQUERY_CORRELACIONADA")
        );

        subqueries.add(
                new Conteudo("EXISTS_OPERADOR",
                        "EXISTS_OPERADOR")
        );

        secoes.add(new Secao("Subqueries Correlacionadas e Não Correlacionadas", subqueries));

        // =========================================================
        // SEÇÃO 10: EXISTS e Subqueries Correlacionadas (Vídeo 20)
        // =========================================================

        List<Conteudo> existsCorrelacionado = new ArrayList<>();

        existsCorrelacionado.add(
                new Conteudo("EXISTS_CORRELACIONADO",
                        "EXISTS_CORRELACIONADO")
        );

        existsCorrelacionado.add(
                new Conteudo("RESOLVER_EXISTS",
                        "RESOLVER_EXISTS")
        );

        secoes.add(new Secao("EXISTS e Subqueries Correlacionadas", existsCorrelacionado));

        // =========================================================
        // SEÇÃO 11: Funções de Agregação, GROUP BY e HAVING (Vídeo 21)
        // =========================================================

        List<Conteudo> agregacao = new ArrayList<>();

        agregacao.add(
                new Conteudo("FUNCOES_AGREGACAO",
                        "FUNCOES_AGREGACAO")
        );

        agregacao.add(
                new Conteudo("GROUP_BY",
                        "GROUP_BY")
        );

        agregacao.add(
                new Conteudo("HAVING",
                        "HAVING")
        );

        secoes.add(new Secao("Funções de Agregação, GROUP BY e HAVING", agregacao));

        // =========================================================
        // SEÇÃO 12: ORDER BY (Vídeo 22)
        // =========================================================

        List<Conteudo> orderBy = new ArrayList<>();

        orderBy.add(
                new Conteudo("ORDER_BY",
                        "ORDER_BY")
        );

        orderBy.add(
                new Conteudo("ORDER_BY_REGRAS",
                        "ORDER_BY_REGRAS")
        );

        secoes.add(new Secao("ORDER BY", orderBy));

        // =========================================================
        // SEÇÃO 13: LIMIT, UNION, UNION ALL, COMMIT e ROLLBACK (Vídeo 23)
        // =========================================================

        List<Conteudo> limitUnionCommit = new ArrayList<>();

        limitUnionCommit.add(
                new Conteudo("LIMIT",
                        "LIMIT")
        );

        limitUnionCommit.add(
                new Conteudo("UNION_UNION_ALL",
                        "UNION_UNION_ALL")
        );

        limitUnionCommit.add(
                new Conteudo("COMMIT_ROLLBACK",
                        "COMMIT_ROLLBACK")
        );

        secoes.add(new Secao("LIMIT, UNION, UNION ALL, COMMIT e ROLLBACK", limitUnionCommit));

        // =========================================================
        // SEÇÃO 14: DCL, CREATE/DROP DATABASE e VIEWS (Vídeo 24)
        // =========================================================

        List<Conteudo> dclViews = new ArrayList<>();

        dclViews.add(
                new Conteudo("GRANT_REVOKE",
                        "GRANT_REVOKE")
        );

        dclViews.add(
                new Conteudo("CREATE_DROP_DATABASE",
                        "CREATE_DROP_DATABASE")
        );

        dclViews.add(
                new Conteudo("VIEWS",
                        "VIEWS")
        );

        secoes.add(new Secao("DCL, CREATE/DROP DATABASE e VIEWS", dclViews));

        // =========================================================
        // SEÇÃO 15: Stored Procedures (Vídeo 25)
        // =========================================================

        List<Conteudo> storedProcedures = new ArrayList<>();

        storedProcedures.add(
                new Conteudo("STORED_PROCEDURES",
                        "STORED_PROCEDURES")
        );

        storedProcedures.add(
                new Conteudo("PROCEDURE_VS_VIEW",
                        "PROCEDURE_VS_VIEW")
        );

        secoes.add(new Secao("Stored Procedures", storedProcedures));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Fundamentos de SQL - Parte 2 (DML)",
                secoes
        );
    }
}
