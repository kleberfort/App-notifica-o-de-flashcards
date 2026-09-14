package com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.pontuacao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class PontuacaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: NOÇÕES INICIAIS DE PONTUAÇÃO
        // =========================================================

        List<Conteudo> secao01 = new ArrayList<>();

        secao01.add(
                new Conteudo("PONTUACAO_ORDEM_DIRETA_SUVECA",
                        "PONTUACAO_ORDEM_DIRETA_SUVECA")
        );

        secao01.add(
                new Conteudo("PONTUACAO_ESTRUTURAS_INSEPARAVEIS",
                        "PONTUACAO_ESTRUTURAS_INSEPARAVEIS")
        );

        secao01.add(
                new Conteudo("PONTUACAO_DIVERGENCIAS_GRAMATICAIS",
                        "PONTUACAO_DIVERGENCIAS_GRAMATICAIS")
        );

        secoes.add(new Secao("Noções Iniciais de Pontuação", secao01));

        // =========================================================
        // SEÇÃO 02: VÍRGULA, RESPIRAÇÃO E SEMÂNTICA
        // =========================================================

        List<Conteudo> secao02 = new ArrayList<>();

        secao02.add(
                new Conteudo("PONTUACAO_VIRGULA_SEMANTICA",
                        "PONTUACAO_VIRGULA_SEMANTICA")
        );

        secao02.add(
                new Conteudo("PONTUACAO_VIRGULA_MUDANCA_SENTIDO",
                        "PONTUACAO_VIRGULA_MUDANCA_SENTIDO")
        );

        secoes.add(new Secao("Vírgula, Respiração e Semântica", secao02));

        // =========================================================
        // SEÇÃO 03: USO DA VÍRGULA - TODAS AS REGRAS
        // =========================================================

        List<Conteudo> secao03 = new ArrayList<>();

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ADJUNTO_ADVERBIAL",
                        "PONTUACAO_VIRGULA_ADJUNTO_ADVERBIAL")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ORACAO_ADVERBIAL",
                        "PONTUACAO_VIRGULA_ORACAO_ADVERBIAL")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ENUMERACAO",
                        "PONTUACAO_VIRGULA_ENUMERACAO")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ENUMERACAO_ANAFORA",
                        "PONTUACAO_VIRGULA_ENUMERACAO_ANAFORA")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_CONJUNCAO_DESLOCADA",
                        "PONTUACAO_VIRGULA_CONJUNCAO_DESLOCADA")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ORACOES_COORDENADAS",
                        "PONTUACAO_VIRGULA_ORACOES_COORDENADAS")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_E_CONJUNCAO",
                        "PONTUACAO_VIRGULA_E_CONJUNCAO")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_EXPRESSOES_EXPLICATIVAS",
                        "PONTUACAO_VIRGULA_EXPRESSOES_EXPLICATIVAS")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ORACOES_INTERFERENTES",
                        "PONTUACAO_VIRGULA_ORACOES_INTERFERENTES")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ORACAO_EXPLICATIVA",
                        "PONTUACAO_VIRGULA_ORACAO_EXPLICATIVA")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_RESTRITIVA_EXPLICATIVA",
                        "PONTUACAO_VIRGULA_RESTRITIVA_EXPLICATIVA")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_OBJETO_PLEONASTICO",
                        "PONTUACAO_VIRGULA_OBJETO_PLEONASTICO")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_APOSTO",
                        "PONTUACAO_VIRGULA_APOSTO")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_APOSTO_TIPOS",
                        "PONTUACAO_VIRGULA_APOSTO_TIPOS")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_VOCATIVO",
                        "PONTUACAO_VIRGULA_VOCATIVO")
        );

        secao03.add(
                new Conteudo("PONTUACAO_VIRGULA_ZEUGMA",
                        "PONTUACAO_VIRGULA_ZEUGMA")
        );

        secoes.add(new Secao("Uso da Vírgula - Todas as Regras", secao03));

        // =========================================================
        // SEÇÃO 04: PONTO E VÍRGULA (;)
        // =========================================================

        List<Conteudo> secao04 = new ArrayList<>();

        secao04.add(
                new Conteudo("PONTUACAO_PONTO_VIRGULA_USOS",
                        "PONTUACAO_PONTO_VIRGULA_USOS")
        );

        secoes.add(new Secao("Ponto e Vírgula", secao04));

        // =========================================================
        // SEÇÃO 05: DOIS-PONTOS (:)
        // =========================================================

        List<Conteudo> secao05 = new ArrayList<>();

        secao05.add(
                new Conteudo("PONTUACAO_DOIS_PONTOS_USOS",
                        "PONTUACAO_DOIS_PONTOS_USOS")
        );

        secao05.add(
                new Conteudo("PONTUACAO_DOIS_PONTOS_APOSTO",
                        "PONTUACAO_DOIS_PONTOS_APOSTO")
        );

        secoes.add(new Secao("Dois-Pontos", secao05));

        // =========================================================
        // SEÇÃO 06: RETICÊNCIAS (...)
        // =========================================================

        List<Conteudo> secao06 = new ArrayList<>();

        secao06.add(
                new Conteudo("PONTUACAO_RETICENCIAS_USOS",
                        "PONTUACAO_RETICENCIAS_USOS")
        );

        secoes.add(new Secao("Reticências", secao06));

        // =========================================================
        // SEÇÃO 07: ASPAS (" ")
        // =========================================================

        List<Conteudo> secao07 = new ArrayList<>();

        secao07.add(
                new Conteudo("PONTUACAO_ASPAS_USOS",
                        "PONTUACAO_ASPAS_USOS")
        );

        secao07.add(
                new Conteudo("PONTUACAO_ASPAS_PONTUACAO",
                        "PONTUACAO_ASPAS_PONTUACAO")
        );

        secoes.add(new Secao("Aspas", secao07));

        // =========================================================
        // SEÇÃO 08: TRAVESSÃO (—)
        // =========================================================

        List<Conteudo> secao08 = new ArrayList<>();

        secao08.add(
                new Conteudo("PONTUACAO_TRAVESSAO_USOS",
                        "PONTUACAO_TRAVESSAO_USOS")
        );

        secao08.add(
                new Conteudo("PONTUACAO_TRAVESSAO_VIRGULA",
                        "PONTUACAO_TRAVESSAO_VIRGULA")
        );

        secoes.add(new Secao("Travessão", secao08));

        // =========================================================
        // SEÇÃO 09: PARÊNTESES ( )
        // =========================================================

        List<Conteudo> secao09 = new ArrayList<>();

        secao09.add(
                new Conteudo("PONTUACAO_PARENTESES_USOS",
                        "PONTUACAO_PARENTESES_USOS")
        );

        secoes.add(new Secao("Parênteses", secao09));

        // =========================================================
        // SEÇÃO 10: PONTO FINAL (.)
        // =========================================================

        List<Conteudo> secao10 = new ArrayList<>();

        secao10.add(
                new Conteudo("PONTUACAO_PONTO_FINAL_USOS",
                        "PONTUACAO_PONTO_FINAL_USOS")
        );

        secao10.add(
                new Conteudo("PONTUACAO_PONTO_FINAL_FRAGMENTO",
                        "PONTUACAO_PONTO_FINAL_FRAGMENTO")
        );

        secoes.add(new Secao("Ponto Final", secao10));

        // =========================================================
        // SEÇÃO 11: TIPOS DE FRASE
        // =========================================================

        List<Conteudo> secao11 = new ArrayList<>();

        secao11.add(
                new Conteudo("PONTUACAO_TIPOS_FRASE_CONCEITO",
                        "PONTUACAO_TIPOS_FRASE_CONCEITO")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_NOMINAL_VERBAL",
                        "PONTUACAO_FRASE_NOMINAL_VERBAL")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_DECLARATIVA",
                        "PONTUACAO_FRASE_DECLARATIVA")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_INTERROGATIVA",
                        "PONTUACAO_FRASE_INTERROGATIVA")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_IMPERATIVA",
                        "PONTUACAO_FRASE_IMPERATIVA")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_EXCLAMATIVA",
                        "PONTUACAO_FRASE_EXCLAMATIVA")
        );

        secao11.add(
                new Conteudo("PONTUACAO_FRASE_OPTATIVA",
                        "PONTUACAO_FRASE_OPTATIVA")
        );

        secao11.add(
                new Conteudo("PONTUACAO_RESUMO_TIPOS_FRASE",
                        "PONTUACAO_RESUMO_TIPOS_FRASE")
        );

        secoes.add(new Secao("Tipos de Frase", secao11));

        // =========================================================
        // SEÇÃO 12: RESUMO GERAL DA PONTUAÇÃO
        // =========================================================

        List<Conteudo> secao12 = new ArrayList<>();

        secao12.add(
                new Conteudo("PONTUACAO_RESUMO_VIRGULA",
                        "PONTUACAO_RESUMO_VIRGULA")
        );

        secao12.add(
                new Conteudo("PONTUACAO_RESUMO_SINAIS_AUXILIARES",
                        "PONTUACAO_RESUMO_SINAIS_AUXILIARES")
        );

        secoes.add(new Secao("Resumo Geral da Pontuação", secao12));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Pontuação",
                secoes
        );
    }
}
