package com.seuapp.mensageria.data.data_menu_principal.direito.constitucional;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class AplicabilidadeHierarquiaNormaData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - CLASSIFICAÇÃO DE JOSÉ AFONSO DA SILVA
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo("EFICACIA_PLENA", "EFICACIA_PLENA"));
        video01.add(new Conteudo("EFICACIA_CONTIDA", "EFICACIA_CONTIDA"));
        video01.add(new Conteudo("EFICACIA_LIMITADA", "EFICACIA_LIMITADA"));
        video01.add(new Conteudo("PLENA_VS_CONTIDA", "PLENA_VS_CONTIDA"));
        video01.add(new Conteudo("CONTIDA_VS_LIMITADA", "CONTIDA_VS_LIMITADA"));
        video01.add(new Conteudo("CILADA_NORMA_SEM_EFICACIA", "CILADA_NORMA_SEM_EFICACIA"));

        secoes.add(new Secao("Classificação de José Afonso da Silva", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - CONTIDA vs LIMITADA (APROFUNDAMENTO)
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(new Conteudo("GREVE_TRABALHADOR", "GREVE_TRABALHADOR"));
        video02.add(new Conteudo("GREVE_SERVIDOR", "GREVE_SERVIDOR"));
        video02.add(new Conteudo("ESCUSA_CONSCIENCIA", "ESCUSA_CONSCIENCIA"));
        video02.add(new Conteudo("PROPRIEDADE_CONTIDA", "PROPRIEDADE_CONTIDA"));
        video02.add(new Conteudo("LIMITADA_SUBESPECIES", "LIMITADA_SUBESPECIES"));

        secoes.add(new Secao("Contida vs Limitada (Aprofundamento)", video02));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - ASPECTOS AVANÇADOS E JURISPRUDÊNCIA
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo("SIGILO_CORRESPONDENCIA", "SIGILO_CORRESPONDENCIA"));
        video03.add(new Conteudo("INTERCEPTACAO_TELEFONICA", "INTERCEPTACAO_TELEFONICA"));
        video03.add(new Conteudo("EXTRADICAO_LIMITADA", "EXTRADICAO_LIMITADA"));
        video03.add(new Conteudo("ACESSO_CARGOS", "ACESSO_CARGOS"));
        video03.add(new Conteudo("DEFESA_NORMA_LIMITADA", "DEFESA_NORMA_LIMITADA"));

        secoes.add(new Secao("Aspectos Avançados e Jurisprudência", video03));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - HIERARQUIA DAS NORMAS (FUNDAMENTOS)
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo("PREMISSA_HIERARQUIA", "PREMISSA_HIERARQUIA"));
        video04.add(new Conteudo("HIERARQUIA_ESTADOS_MUNICIPIOS", "HIERARQUIA_ESTADOS_MUNICIPIOS"));
        video04.add(new Conteudo("ESPECIES_PRIMARIAS", "ESPECIES_PRIMARIAS"));
        video04.add(new Conteudo("TRATADOS_DIREITOS_HUMANOS", "TRATADOS_DIREITOS_HUMANOS"));

        secoes.add(new Secao("Hierarquia das Normas (Fundamentos)", video04));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - HIERARQUIA (APLICAÇÃO PRÁTICA)
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo("CONFLITO_LEIS_COMPETENCIA", "CONFLITO_LEIS_COMPETENCIA"));
        video05.add(new Conteudo("INCONSTITUCIONALIDADE_VS_ILEGALIDADE", "INCONSTITUCIONALIDADE_VS_ILEGALIDADE"));
        video05.add(new Conteudo("CILADAS_HIERARQUIA", "CILADAS_HIERARQUIA"));

        secoes.add(new Secao("Hierarquia (Aplicação Prática e Competências)", video05));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "Aplicabilidade e Hierarquia das Normas Constitucionais",
                secoes
        );
    }
}
