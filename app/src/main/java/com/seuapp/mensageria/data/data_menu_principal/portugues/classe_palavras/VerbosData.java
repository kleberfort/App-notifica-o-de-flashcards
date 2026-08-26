package com.seuapp.mensageria.data.data_menu_principal.portugues.classe_palavras;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class VerbosData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();


        // =====================================
        // SEÇÃO: Identificação de Tempos e Modos
        // =====================================

        List<Conteudo> identificacao = new ArrayList<>();
        identificacao.add(new Conteudo("VERBOS_TEMPOS_MODO", "Indicativo"));
        identificacao.add(new Conteudo("VERBOS_SUBJUNTIVO", "Subjuntivo"));
        identificacao.add(new Conteudo("VERBOS_IMPERATIVO", "Imperativo"));
        identificacao.add(new Conteudo("VERBOS_CILADA_INDIC_SUBJ", "Cilada #1: Indicativo vs Subjuntivo"));
        identificacao.add(new Conteudo("VERBOS_CILADA_INF_PESS_FUT_SUBJ", "Cilada #3: Infinitivo Pessoal vs Futuro do Subjuntivo"));

        secoes.add(new Secao("Identificação de Tempos e Modos", identificacao));


        // =====================================
        // SEÇÃO: Semântica dos Tempos Verbais
        // =====================================

        List<Conteudo> semantica = new ArrayList<>();
        semantica.add(new Conteudo("VERBOS_SEMANTICA_PRESENTE", "Semântica: Presente do Indicativo"));
        semantica.add(new Conteudo("VERBOS_SEMANTICA_IMPERFEITO", "Semântica: Pretérito Imperfeito do Indicativo"));
        semantica.add(new Conteudo("VERBOS_SEMANTICA_FUT_PRET", "Semântica: Futuro do Pretérito do Indicativo (-ria)"));
        semantica.add(new Conteudo("VERBOS_SEMANTICA_SUBJUNTIVO", "Semântica: Subjuntivo - Todos com valor de Hipótese"));
        semantica.add(new Conteudo("VERBOS_CORRELACAO_SEMANTICA", "Correlação Semântica (Regra de Ouro)"));

        secoes.add(new Secao("Semântica dos Tempos Verbais", semantica));


        // =====================================
        // SEÇÃO: Estrutura do Verbo (Desinências)
        // =====================================

        List<Conteudo> estrutura = new ArrayList<>();
        estrutura.add(new Conteudo("VERBOS_ESTRUTURA_COMPONENTES", "Estrutura do Verbo - Componentes Básicos"));
        estrutura.add(new Conteudo("VERBOS_ESTRUTURA_DMT", "DMT (Desinência Modo-Temporal) nos Principais Tempos"));
        estrutura.add(new Conteudo("VERBOS_ESTRUTURA_PASSOS", "Método Prático de Análise Estrutural (6 Passos)"));

        secoes.add(new Secao("Estrutura do Verbo", estrutura));


        // =====================================
        // SEÇÃO: Formas Nominais - Particípio
        // =====================================

        List<Conteudo> participio = new ArrayList<>();
        participio.add(new Conteudo("VERBOS_PARTICIPIO_ABUNDANTES", "Verbos Abundantes (Particípio Duplo) - Regra de Ouro"));
        participio.add(new Conteudo("VERBOS_PARTICIPIO_UNICO", "Verbos de Particípio Único"));
        participio.add(new Conteudo("VERBOS_EXCECOES_GANHAR", "Exceções: Ganhar, Gastar, Pegar e Pagar"));

        secoes.add(new Secao("Formas Nominais - Particípio", participio));


        // =====================================
        // SEÇÃO: Formas Nominais - Infinitivo
        // =====================================

        List<Conteudo> infinitivo = new ArrayList<>();
        infinitivo.add(new Conteudo("VERBOS_INFINITIVO_PESSOAL_IMPESSOAL", "Infinitivo: Impessoal vs Pessoal"));
        infinitivo.add(new Conteudo("VERBOS_INFINITIVO_FLEXIONADO", "Infinitivo Pessoal Flexionado vs Não Flexionado"));
        infinitivo.add(new Conteudo("VERBOS_CILADA_INFINITIVO_FUTURO", "Cilada: Infinitivo Pessoal vs Futuro do Subjuntivo"));
        infinitivo.add(new Conteudo("VERBOS_MACETE_FAZER_FIZER", "Macete de Troca: FAZER/FIZER"));

        secoes.add(new Secao("Formas Nominais - Infinitivo", infinitivo));


        // =====================================
        // SEÇÃO: Formas Nominais - Gerúndio
        // =====================================

        List<Conteudo> gerundio = new ArrayList<>();
        gerundio.add(new Conteudo("VERBOS_GERUNDIO_BOM_MAU", "Gerúndio: Bom Uso vs Gerundismo (Mau Uso)"));
        gerundio.add(new Conteudo("VERBOS_GERUNDIO_VALORES", "Gerúndio: Valores Semânticos"));
        gerundio.add(new Conteudo("VERBOS_VINDO_GERUNDIO_PARTICIPIO", "Cilada do Verbo 'VIR': Gerúndio ou Particípio?"));

        secoes.add(new Secao("Formas Nominais - Gerúndio", gerundio));


        // =====================================
        // SEÇÃO: Perfis de Banca
        // =====================================

        List<Conteudo> bancas = new ArrayList<>();
        bancas.add(new Conteudo("VERBOS_BANCA_FUNDATEC", "Perfil Fundatec - Desinência de Infinitivo"));
        bancas.add(new Conteudo("VERBOS_BANCA_HOMOFONIA", "Homofonia: Formas Iguais em Tempos Diferentes"));
        bancas.add(new Conteudo("VERBOS_BANCA_CEBRASPE_FGV", "Perfil Cebraspe e FGV - Semântica"));

        secoes.add(new Secao("Perfis de Banca", bancas));


        // =====================================
        // SEÇÃO: Resumo de Bolso
        // =====================================

        List<Conteudo> resumo = new ArrayList<>();
        resumo.add(new Conteudo("VERBOS_RESUMO_PALAVRINHAS_MAGICAS", "Palavrinhas Mágicas para Prova"));
        resumo.add(new Conteudo("VERBOS_RESUMO_CILADAS_MORTAIS", "Três Ciladas Mortais"));
        resumo.add(new Conteudo("VERBOS_RESUMO_REGRAS_OURO", "Regras de Ouro para Análise"));
        resumo.add(new Conteudo("VERBOS_RESUMO_FLASHCARDS_ANKI", "Flashcards para Revisão Rápida"));

        secoes.add(new Secao("Resumo de Bolso", resumo));


        // =====================================
        // RETORNO FINAL
        // =====================================

        return new Disciplina("Classe Palavras: Verbos", secoes);
    }
}