package com.seuapp.mensageria.data.data_menu_principal.portugues.sintaxe.termos_oracao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class TiposPredicadoIntegrantesOracaoData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: Predicação Verbal (Transitividade)
        // =========================================================

        List<Conteudo> conteudosVideo08 = new ArrayList<>();

        conteudosVideo08.add(new Conteudo("VERBOS_TRANSITIVIDADE", "VERBOS_TRANSITIVIDADE"));
        conteudosVideo08.add(new Conteudo("CLASSIFICACAO_VERBOS", "CLASSIFICACAO_VERBOS"));
        conteudosVideo08.add(new Conteudo("MACETE_MENINO", "MACETE_MENINO"));
        conteudosVideo08.add(new Conteudo("CILADA_VL", "CILADA_VL"));

        secoes.add(new Secao("📘 Predicação Verbal", conteudosVideo08));

        // =========================================================
        // SEÇÃO 02: Tipos de Predicado (Nominal, Verbal e Verbo-Nominal)
        // =========================================================

        List<Conteudo> conteudosVideo09 = new ArrayList<>();

        conteudosVideo09.add(
                new Conteudo("PREDICADO_ESTADO_ACAO",
                        "PREDICADO_ESTADO_ACAO")
        );

        conteudosVideo09.add(
                new Conteudo("PN_VS_PV_VS_PVN",
                        "PN_VS_PV_VS_PVN")
        );

        conteudosVideo09.add(
                new Conteudo("CILADA_ANDAR",
                        "CILADA_ANDAR")
        );

        secoes.add(new Secao("📘 Tipos de Predicado", conteudosVideo09));

        // =========================================================
        // SEÇÃO 03: Predicado - Estratégia FCC
        // =========================================================

        List<Conteudo> conteudosVideo10 = new ArrayList<>();

        conteudosVideo10.add(
                new Conteudo("ESTRATEGIA_FCC",
                        "ESTRATEGIA_FCC")
        );

        conteudosVideo10.add(
                new Conteudo("FCC_CILADAS",
                        "FCC_CILADAS")
        );

        secoes.add(new Secao("📘 Predicado - FCC", conteudosVideo10));

        // =========================================================
        // SEÇÃO 04: Termos Essenciais (Sujeito e Predicado)
        // =========================================================

        List<Conteudo> conteudosVideo11 = new ArrayList<>();

        conteudosVideo11.add(
                new Conteudo("SUJEITO_PREDICADO",
                        "SUJEITO_PREDICADO")
        );

        conteudosVideo11.add(
                new Conteudo("TIPOS_SUJEITO",
                        "TIPOS_SUJEITO")
        );

        secoes.add(new Secao("📘 Termos Essenciais", conteudosVideo11));

        // =========================================================
        // SEÇÃO 05: Complementos Verbais (OD e OI)
        // =========================================================

        List<Conteudo> conteudosVideo12 = new ArrayList<>();

        conteudosVideo12.add(
                new Conteudo("OD_OI",
                        "OD_OI")
        );

        conteudosVideo12.add(
                new Conteudo("OD_PREPOSICIONADO",
                        "OD_PREPOSICIONADO")
        );

        conteudosVideo12.add(
                new Conteudo("PLEONASMO",
                        "PLEONASMO")
        );

        secoes.add(new Secao("📘 Complementos Verbais", conteudosVideo12));

        // =========================================================
        // SEÇÃO 06: Verbos Bitransitivos (TDI)
        // =========================================================

        List<Conteudo> conteudosVideo13 = new ArrayList<>();

        conteudosVideo13.add(
                new Conteudo("TDI_REGENCIA",
                        "TDI_REGENCIA")
        );

        conteudosVideo13.add(
                new Conteudo("HAVER_VS_EXISTIR",
                        "HAVER_VS_EXISTIR")
        );

        conteudosVideo13.add(
                new Conteudo("OI_VS_ADJUNTO",
                        "OI_VS_ADJUNTO")
        );

        secoes.add(new Secao("📘 Verbos Bitransitivos", conteudosVideo13));

        // =========================================================
        // SEÇÃO 07: Estratégia FCC - Sujeito, OD e OI
        // =========================================================

        List<Conteudo> conteudosVideo14 = new ArrayList<>();

        conteudosVideo14.add(
                new Conteudo("FCC_SUJEITO",
                        "FCC_SUJEITO")
        );

        conteudosVideo14.add(
                new Conteudo("FCC_OD_OI",
                        "FCC_OD_OI")
        );

        secoes.add(new Secao("📘 Estratégia FCC - Sujeito/OD/OI", conteudosVideo14));

        // =========================================================
        // SEÇÃO 08: Complemento Nominal e Agente da Passiva
        // =========================================================

        List<Conteudo> conteudosVideo15 = new ArrayList<>();

        conteudosVideo15.add(
                new Conteudo("CN_CONCEITO",
                        "CN_CONCEITO")
        );

        conteudosVideo15.add(
                new Conteudo("AP_CONCEITO",
                        "AP_CONCEITO")
        );

        conteudosVideo15.add(
                new Conteudo("CN_AP_DIFERENCA",
                        "CN_AP_DIFERENCA")
        );

        conteudosVideo15.add(
                new Conteudo("AP_VS_ADJUNTO",
                        "AP_VS_ADJUNTO")
        );

        secoes.add(new Secao("📘 Complemento Nominal e Agente da Passiva", conteudosVideo15));

        // =========================================================
        // SEÇÃO 09: Resumo Geral
        // =========================================================

        List<Conteudo> conteudosResumo = new ArrayList<>();

        conteudosResumo.add(
                new Conteudo("TABELA_TERMOS",
                        "TABELA_TERMOS")
        );

        conteudosResumo.add(
                new Conteudo("MACETES_FINAIS",
                        "MACETES_FINAIS")
        );

        secoes.add(new Secao("📘 Resumo Geral", conteudosResumo));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Tipos de Predicado e Termos Integrantes",
                secoes
        );
    }
}
