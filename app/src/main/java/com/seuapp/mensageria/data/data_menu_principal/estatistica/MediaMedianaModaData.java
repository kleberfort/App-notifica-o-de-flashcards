package com.seuapp.mensageria.data.data_menu_principal.estatistica;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class MediaMedianaModaData {

    public static Disciplina getDisciplina() {
        List<Secao> secoes = new ArrayList<>();

        // ============================================================
        // SEÇÃO: VÍDEO 01 - MEDIDAS DE POSIÇÃO (TENDÊNCIA CENTRAL)
        // ============================================================
        List<Conteudo> video01 = new ArrayList<>();
        video01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIDAS_POSICAO_CONCEITO", "MEDIDAS_POSICAO_CONCEITO"));
        video01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_POSICAO_VS_DISPERSAO", "CILADA_POSICAO_VS_DISPERSAO"));
        video01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_POSICAO_CENTRAL_OBRIGATORIA", "CILADA_POSICAO_CENTRAL_OBRIGATORIA"));
        video01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_FUNCAO_POSICAO", "CILADA_FUNCAO_POSICAO"));
        video01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_CONCENTRACAO_DADOS", "CILADA_CONCENTRACAO_DADOS"));
        secoes.add(new Secao("📊 VÍDEO 01 - Medidas de Posição", video01));

        // ============================================================
        // SEÇÃO: VÍDEO 02 - NOTAÇÃO DE SOMATÓRIO (Σ)
        // ============================================================
        List<Conteudo> video02 = new ArrayList<>();
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CONCEITO", "SOMATORIO_CONCEITO"));
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_INDICE_INICIAL", "SOMATORIO_CILADA_INDICE_INICIAL"));
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_EXTREMOS", "SOMATORIO_CILADA_EXTREMOS"));
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_QUADRADO", "SOMATORIO_CILADA_QUADRADO"));
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_INDICE_FINAL", "SOMATORIO_CILADA_INDICE_FINAL"));
        video02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_SOMATORIO_CILADA_OPERACAO_TERMOS", "SOMATORIO_CILADA_OPERACAO_TERMOS"));
        secoes.add(new Secao("📊 VÍDEO 02 - Notação de Somatório", video02));

        // ============================================================
        // SEÇÃO: VÍDEO 03 - MÉDIA ARITMÉTICA SIMPLES
        // ============================================================
        List<Conteudo> video03 = new ArrayList<>();
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CONCEITO", "MEDIA_SIMPLES_CONCEITO"));
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_SIMPLES_VS_PONDERADA", "MEDIA_SIMPLES_CILADA_SIMPLES_VS_PONDERADA"));
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_FORMULA_MODIFICADA", "MEDIA_SIMPLES_CILADA_FORMULA_MODIFICADA"));
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_ATUALIZAR_N", "MEDIA_SIMPLES_CILADA_ATUALIZAR_N"));
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_DIFERENCA_MEDIAS", "MEDIA_SIMPLES_CILADA_DIFERENCA_MEDIAS"));
        video03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_SIMPLES_CILADA_SIMBOLOS", "MEDIA_SIMPLES_CILADA_SIMBOLOS"));
        secoes.add(new Secao("📊 VÍDEO 03 - Média Aritmética Simples", video03));

        // ============================================================
        // SEÇÃO: VÍDEO 04 - MÉDIA PONDERADA
        // ============================================================
        List<Conteudo> video04 = new ArrayList<>();
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CONCEITO", "MEDIA_PONDERADA_CONCEITO"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_ABSOLUTA", "MEDIA_PONDERADA_FREQ_ABSOLUTA"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_RELATIVA_DECIMAL", "MEDIA_PONDERADA_FREQ_RELATIVA_DECIMAL"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_FREQ_RELATIVA_PERCENTUAL", "MEDIA_PONDERADA_FREQ_RELATIVA_PERCENTUAL"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_VARIAVEL_VS_PESO", "MEDIA_PONDERADA_CILADA_VARIAVEL_VS_PESO"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_FREQ_ACUMULADA", "MEDIA_PONDERADA_CILADA_FREQ_ACUMULADA"));
        video04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_PONDERADA_CILADA_ESQUECER_MULTIPLICAR", "MEDIA_PONDERADA_CILADA_ESQUECER_MULTIPLICAR"));
        secoes.add(new Secao("📊 VÍDEO 04 - Média Ponderada", video04));

        // ============================================================
        // SEÇÃO: VÍDEO 05 - MÉDIA PARA DADOS AGRUPADOS (TABELAS INTERVALARES)
        // ============================================================
        List<Conteudo> video05 = new ArrayList<>();
        video05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CONCEITO", "DADOS_AGRUPADOS_CONCEITO"));
        video05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_PONTO_MEDIO", "DADOS_AGRUPADOS_PONTO_MEDIO"));
        video05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_FORMULA", "DADOS_AGRUPADOS_FORMULA"));
        video05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CILADA_USAR_LIMITES", "DADOS_AGRUPADOS_CILADA_USAR_LIMITES"));
        video05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DADOS_AGRUPADOS_CILADA_APLICAR_PM", "DADOS_AGRUPADOS_CILADA_APLICAR_PM"));
        secoes.add(new Secao("📊 VÍDEO 05 - Média para Dados Agrupados", video05));

        // ============================================================
        // SEÇÃO: VÍDEO 06 - MÉDIA GEOMÉTRICA
        // ============================================================
        List<Conteudo> video06 = new ArrayList<>();
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CONCEITO", "MEDIA_GEOMETRICA_CONCEITO"));
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_TAXA_MEDIA", "MEDIA_GEOMETRICA_TAXA_MEDIA"));
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_ARITMETICA_PERCENTUAIS", "MEDIA_GEOMETRICA_CILADA_ARITMETICA_PERCENTUAIS"));
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_PERCENTUAIS_DIRETOS", "MEDIA_GEOMETRICA_CILADA_PERCENTUAIS_DIRETOS"));
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_CONVERSAO", "MEDIA_GEOMETRICA_CILADA_CONVERSAO"));
        video06.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIA_GEOMETRICA_CILADA_CONFUNDIR_MEDIAS", "MEDIA_GEOMETRICA_CILADA_CONFUNDIR_MEDIAS"));
        secoes.add(new Secao("📊 VÍDEO 06 - Média Geométrica", video06));


        // ============================================================
        // SEÇÃO: VÍDEO 06 - MÉDIA HARMÔNICA - CONCURSOS
        // ============================================================
        List<Conteudo> video07 = new ArrayList<>();
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CONCEITO_E_APLICACAO", "CONCEITO_E_APLICACAO"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FORMULA_2_VALORES", "FORMULA_2_VALORES"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_QUANDO_USAR", "QUANDO_USAR"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_CILADA_MAIS_COMUM", "CILADA_MAIS_COMUM"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MACETE_RESUMIDO", "MACETE_RESUMIDO"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_01", "FLASHCARD_ANKI_01"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_02", "FLASHCARD_ANKI_02"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_03", "FLASHCARD_ANKI_03"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_04", "FLASHCARD_ANKI_04"));
        video07.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_FLASHCARD_ANKI_05", "FLASHCARD_ANKI_05"));
        secoes.add(new Secao("📊 VÍDEO 07 - Média Harmônica", video07));

        // ============================================================
        // SEÇÃO: VÍDEO 08 - DESIGUALDADE ENTRE MÉDIAS
        // ============================================================
        List<Conteudo> video08 = new ArrayList<>();
        video08.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_ORDEM", "DESIGUALDADE_MEDIAS_ORDEM"));
        video08.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_FORMULA", "DESIGUALDADE_MEDIAS_FORMULA"));
        video08.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_INVERTER_ORDEM", "DESIGUALDADE_MEDIAS_CILADA_INVERTER_ORDEM"));
        video08.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_IGUALDADE", "DESIGUALDADE_MEDIAS_CILADA_IGUALDADE"));
        video08.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_DESIGUALDADE_MEDIAS_CILADA_FORMULA", "DESIGUALDADE_MEDIAS_CILADA_FORMULA"));
        secoes.add(new Secao("📊 VÍDEO 08 - Desigualdade entre Médias", video08));

        // ============================================================
        // SEÇÃO: VÍDEO 01 - MEDIANA (CONCEITOS E CÁLCULO)
        // ============================================================
        List<Conteudo> mediana01 = new ArrayList<>();
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CONCEITO", "MEDIANA_CONCEITO"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_DADOS_NAO_AGRUPADOS", "MEDIANA_DADOS_NAO_AGRUPADOS"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_TABELA_FREQUENCIA", "MEDIANA_TABELA_FREQUENCIA"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_SEMPRE_DO_CONJUNTO", "MEDIANA_CILADA_SEMPRE_DO_CONJUNTO"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_ESQUECER_ORDENAR", "MEDIANA_CILADA_ESQUECER_ORDENAR"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_FAC_COMO_RESPOSTA", "MEDIANA_CILADA_FAC_COMO_RESPOSTA"));
        mediana01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_CILADA_CONDICAO_MAIOR_IGUAL", "MEDIANA_CILADA_CONDICAO_MAIOR_IGUAL"));
        secoes.add(new Secao("📊 VÍDEO 01 - Mediana (Conceitos e Cálculo)", mediana01));

        // ============================================================
        // SEÇÃO: VÍDEO 02 - MEDIANA PARA DADOS AGRUPADOS EM CLASSES
        // ============================================================
        List<Conteudo> mediana02 = new ArrayList<>();
        mediana02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_CONCEITO", "MEDIANA_AGRUPADA_CONCEITO"));
        mediana02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_FORMULA", "MEDIANA_AGRUPADA_FORMULA"));
        mediana02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_PASSO_A_PASSO", "MEDIANA_AGRUPADA_PASSO_A_PASSO"));
        mediana02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_CILADA_EXATA", "MEDIANA_AGRUPADA_CILADA_EXATA"));
        mediana02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MEDIANA_AGRUPADA_PROPRIEDADE_ROBUSTEZ", "MEDIANA_AGRUPADA_PROPRIEDADE_ROBUSTEZ"));
        secoes.add(new Secao("📊 VÍDEO 02 - Mediana para Dados Agrupados", mediana02));

        // ============================================================
        // SEÇÃO: VÍDEO 01 - MODA (CONCEITOS INICIAIS)
        // ============================================================
        List<Conteudo> moda01 = new ArrayList<>();
        moda01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CONCEITO", "MODA_CONCEITO"));
        moda01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CILADA_SO_NUMEROS", "MODA_CILADA_SO_NUMEROS"));
        moda01.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_CILADA_SEMPRE_UNICA", "MODA_CILADA_SEMPRE_UNICA"));
        secoes.add(new Secao("📊 VÍDEO 01 - Moda (Conceitos Iniciais)", moda01));

        // ============================================================
        // SEÇÃO: VÍDEO 02 - MODA PARA DADOS NÃO AGRUPADOS
        // ============================================================
        List<Conteudo> moda02 = new ArrayList<>();
        moda02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CONCEITO", "MODA_NAO_AGRUPADO_CONCEITO"));
        moda02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CILADA_FREQUENCIA_VS_MODA", "MODA_NAO_AGRUPADO_CILADA_FREQUENCIA_VS_MODA"));
        moda02.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_NAO_AGRUPADO_CILADA_MAIS_DE_DUAS_MODAS", "MODA_NAO_AGRUPADO_CILADA_MAIS_DE_DUAS_MODAS"));
        secoes.add(new Secao("📊 VÍDEO 02 - Moda para Dados Não Agrupados", moda02));

        // ============================================================
        // SEÇÃO: VÍDEO 03 - MODA PARA DADOS AGRUPADOS SEM INTERVALO
        // ============================================================
        List<Conteudo> moda03 = new ArrayList<>();
        moda03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_SEM_INTERVALO_CONCEITO", "MODA_SEM_INTERVALO_CONCEITO"));
        moda03.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_SEM_INTERVALO_CILADA_FREQUENCIA", "MODA_SEM_INTERVALO_CILADA_FREQUENCIA"));
        secoes.add(new Secao("📊 VÍDEO 03 - Moda para Dados Agrupados sem Intervalo", moda03));

        // ============================================================
        // SEÇÃO: VÍDEO 04 - MODA PARA DADOS AGRUPADOS EM CLASSES
        // ============================================================
        List<Conteudo> moda04 = new ArrayList<>();
        moda04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_CONCEITO", "MODA_AGRUPADA_CLASSES_CONCEITO"));
        moda04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_METODOS", "MODA_AGRUPADA_CLASSES_METODOS"));
        moda04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_DICA_SEM_CALCULO", "MODA_AGRUPADA_CLASSES_DICA_SEM_CALCULO"));
        moda04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_CILADA_MODA_EXATA", "MODA_AGRUPADA_CLASSES_CILADA_MODA_EXATA"));
        moda04.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_MODA_AGRUPADA_CLASSES_AMPLITUDES_DIFERENTES", "MODA_AGRUPADA_CLASSES_AMPLITUDES_DIFERENTES"));
        secoes.add(new Secao("📊 VÍDEO 04 - Moda para Dados Agrupados em Classes", moda04));

        // ============================================================
        // SEÇÃO: VÍDEO 05 - PROPRIEDADES DA MODA
        // ============================================================
        List<Conteudo> moda05 = new ArrayList<>();
        moda05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_SUBTRACAO", "PROPRIEDADES_MODA_SUBTRACAO"));
        moda05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_MULTIPLICACAO", "PROPRIEDADES_MODA_MULTIPLICACAO"));
        moda05.add(new Conteudo("MEDIA_MEDIANA_MODA_ESTATISTICA_PROPRIEDADES_MODA_CILADA_TODOS_VALORES", "PROPRIEDADES_MODA_CILADA_TODOS_VALORES"));
        secoes.add(new Secao("📊 VÍDEO 05 - Propriedades da Moda", moda05));

        // ============================================================
        // RETORNO FINAL
        // ============================================================
        return new Disciplina("📊 Média, Mediana e Moda - Estatística para Concursos", secoes);
    }
}
