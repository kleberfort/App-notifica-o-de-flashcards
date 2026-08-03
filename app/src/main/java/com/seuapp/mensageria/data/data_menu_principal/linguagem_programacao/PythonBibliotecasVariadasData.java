package com.seuapp.mensageria.data.data_menu_principal.linguagem_programacao;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class PythonBibliotecasVariadasData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();

        // =========================================================
        // SEÇÃO 01: VÍDEO 01 - NUMPY (VISÃO GERAL E COBRANÇA)
        // =========================================================

        List<Conteudo> video01 = new ArrayList<>();

        video01.add(new Conteudo("NUMPY_DEFINICAO", "NUMPY_DEFINICAO"));
        video01.add(new Conteudo("NUMPY_CRIACAO", "NUMPY_CRIACAO"));
        video01.add(new Conteudo("NUMPY_ATRIBUTOS", "NUMPY_ATRIBUTOS"));
        video01.add(new Conteudo("NUMPY_FILTRO", "NUMPY_FILTRO"));
        video01.add(new Conteudo("NUMPY_COMPARACAO", "NUMPY_COMPARACAO"));

        secoes.add(new Secao("🎥 VÍDEO 01 - NumPy (Visão Geral e Cobrança)", video01));

        // =========================================================
        // SEÇÃO 02: VÍDEO 02 - SCIPY E PANDAS
        // =========================================================

        List<Conteudo> video02 = new ArrayList<>();

        video02.add(new Conteudo("SCIPY_ECOSSISTEMA", "SCIPY_ECOSSISTEMA"));
        video02.add(new Conteudo("PANDAS_ESTRUTURAS", "PANDAS_ESTRUTURAS"));
        video02.add(new Conteudo("PANDAS_SERIES", "PANDAS_SERIES"));
        video02.add(new Conteudo("PANDAS_ACESSO", "PANDAS_ACESSO"));
        video02.add(new Conteudo("PANDAS_CSV", "PANDAS_CSV"));
        video02.add(new Conteudo("PANDAS_METODOS", "PANDAS_METODOS"));

        secoes.add(new Secao("🎥 VÍDEO 02 - SciPy e Pandas", video02));

        // =========================================================
        // SEÇÃO 03: VÍDEO 03 - RESOLUÇÃO DE QUESTÕES
        // =========================================================

        List<Conteudo> video03 = new ArrayList<>();

        video03.add(new Conteudo("QUESTAO_PILHAS", "QUESTAO_PILHAS"));
        video03.add(new Conteudo("QUESTAO_DATAFRAME", "QUESTAO_DATAFRAME"));
        video03.add(new Conteudo("QUESTAO_FILTRO_NDARRAY", "QUESTAO_FILTRO_NDARRAY"));
        video03.add(new Conteudo("QUESTAO_VETORIZADA", "QUESTAO_VETORIZADA"));
        video03.add(new Conteudo("QUESTAO_STD", "QUESTAO_STD"));
        video03.add(new Conteudo("QUESTAO_MEDIANA", "QUESTAO_MEDIANA"));

        secoes.add(new Secao("🎥 VÍDEO 03 - Resolução de Questões", video03));

        // =========================================================
        // SEÇÃO 04: VÍDEO 04 - REVISÃO NUMPY E PANDAS
        // =========================================================

        List<Conteudo> video04 = new ArrayList<>();

        video04.add(new Conteudo("REVISAO_ESTRATEGIA", "REVISAO_ESTRATEGIA"));
        video04.add(new Conteudo("REVISAO_NUMPY", "REVISAO_NUMPY"));
        video04.add(new Conteudo("REVISAO_PANDAS", "REVISAO_PANDAS"));
        video04.add(new Conteudo("REVISAO_PRIORIDADES", "REVISAO_PRIORIDADES"));

        secoes.add(new Secao("🎥 VÍDEO 04 - Revisão NumPy e Pandas", video04));

        // =========================================================
        // SEÇÃO 05: VÍDEO 05 - REVISÃO SCIPY E PANDAS
        // =========================================================

        List<Conteudo> video05 = new ArrayList<>();

        video05.add(new Conteudo("SCIPY_COMPONENTES", "SCIPY_COMPONENTES"));
        video05.add(new Conteudo("PANDAS_OPERACOES", "PANDAS_OPERACOES"));
        video05.add(new Conteudo("PANDAS_SERIES_VS_DATAFRAME", "PANDAS_SERIES_VS_DATAFRAME"));

        secoes.add(new Secao("🎥 VÍDEO 05 - Revisão SciPy e Pandas", video05));

        // =========================================================
        // SEÇÃO 06: VÍDEO 06 - SCIKIT-LEARN E CONCEITOS DE ML
        // =========================================================

        List<Conteudo> video06 = new ArrayList<>();

        video06.add(new Conteudo("SKLEARN_DEFINICAO", "SKLEARN_DEFINICAO"));
        video06.add(new Conteudo("SKLEARN_TAREFAS", "SKLEARN_TAREFAS"));
        video06.add(new Conteudo("SKLEARN_ALGORITMOS", "SKLEARN_ALGORITMOS"));
        video06.add(new Conteudo("SKLEARN_FLUXO", "SKLEARN_FLUXO"));

        secoes.add(new Secao("🎥 VÍDEO 06 - Scikit-Learn e Conceitos de ML", video06));

        // =========================================================
        // SEÇÃO 07: VÍDEO 07 - IMPLEMENTAÇÃO PRÁTICA
        // =========================================================

        List<Conteudo> video07 = new ArrayList<>();

        video07.add(new Conteudo("SKLEARN_EXEMPLO", "SKLEARN_EXEMPLO"));
        video07.add(new Conteudo("SKLEARN_PREVISOES", "SKLEARN_PREVISOES"));
        video07.add(new Conteudo("SKLEARN_ERRO_COMUM", "SKLEARN_ERRO_COMUM"));

        secoes.add(new Secao("🎥 VÍDEO 07 - Implementação Prática", video07));

        // =========================================================
        // SEÇÃO 08: IA, ML E DL
        // =========================================================

        List<Conteudo> iaMlDl = new ArrayList<>();

        iaMlDl.add(new Conteudo("IA_ML_DL", "IA_ML_DL"));
        iaMlDl.add(new Conteudo("ML_VS_DL", "ML_VS_DL"));
        iaMlDl.add(new Conteudo("ML_TIPO_DADOS", "ML_TIPO_DADOS"));

        secoes.add(new Secao("🤖 IA, Machine Learning e Deep Learning", iaMlDl));

        // =========================================================
        // SEÇÃO 09: CILADAS
        // =========================================================

        List<Conteudo> ciladas = new ArrayList<>();

        ciladas.add(new Conteudo("CILADA_NUMPY_PANDAS", "CILADA_NUMPY_PANDAS"));
        ciladas.add(new Conteudo("CILADA_SKLEARN", "CILADA_SKLEARN"));
        ciladas.add(new Conteudo("CILADA_IA_ML_DL", "CILADA_IA_ML_DL"));

        secoes.add(new Secao("⚠️ Principais Ciladas", ciladas));

        // =========================================================
        // SEÇÃO 10: CONCEITOS GERAIS
        // =========================================================

        List<Conteudo> conceitosGerais = new ArrayList<>();

        conceitosGerais.add(new Conteudo("PYTHON_CARACTERISTICAS", "PYTHON_CARACTERISTICAS"));
        conceitosGerais.add(new Conteudo("PYTHON_BIBLIOTECAS", "PYTHON_BIBLIOTECAS"));
        conceitosGerais.add(new Conteudo("MLOPS", "MLOPS"));
        conceitosGerais.add(new Conteudo("DATA_MINING", "DATA_MINING"));

        secoes.add(new Secao("📚 Conceitos Gerais", conceitosGerais));

        // =========================================================
        // SEÇÃO 11: EIXOS E PARÂMETROS
        // =========================================================

        List<Conteudo> eixosParametros = new ArrayList<>();

        eixosParametros.add(new Conteudo("NUMPY_AXIS", "NUMPY_AXIS"));
        eixosParametros.add(new Conteudo("NUMPY_DDOF", "NUMPY_DDOF"));

        secoes.add(new Secao("📐 Eixos e Parâmetros", eixosParametros));

        // =========================================================
        // SEÇÃO 12: PALAVRAS-CHAVE PARA PROVAS
        // =========================================================

        List<Conteudo> palavrasChave = new ArrayList<>();

        palavrasChave.add(new Conteudo("KEYWORDS_CLASSIFICACAO", "KEYWORDS_CLASSIFICACAO"));
        palavrasChave.add(new Conteudo("KEYWORDS_REGRESSAO", "KEYWORDS_REGRESSAO"));
        palavrasChave.add(new Conteudo("KEYWORDS_CLUSTERIZACAO", "KEYWORDS_CLUSTERIZACAO"));
        palavrasChave.add(new Conteudo("KEYWORDS_ASSOCIACAO", "KEYWORDS_ASSOCIACAO"));

        secoes.add(new Secao("🔑 Palavras-chave para Provas", palavrasChave));

        // =========================================================
        // SEÇÃO 13: CONCURSOS E EDITAIS
        // =========================================================

        List<Conteudo> concursos = new ArrayList<>();

        concursos.add(new Conteudo("CONCURSOS_EDITAIS", "CONCURSOS_EDITAIS"));

        secoes.add(new Secao("📋 Concursos e Editais", concursos));

        // =========================================================
        // RETORNO FINAL
        // =========================================================

        return new Disciplina(
                "🐍 Python - Bibliotecas para Concursos (NumPy, Pandas, SciPy, Scikit-Learn, IA/ML/DL)",
                secoes
        );
    }
}
