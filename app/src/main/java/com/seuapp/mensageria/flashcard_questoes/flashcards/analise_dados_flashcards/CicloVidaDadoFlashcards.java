package com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class CicloVidaDadoFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===================== VÍDEO 01 =====================
        lista.add(new Flashcard(
                "📊 BI - Conceitos Fundamentais",
                "BI_CONCEITOS",
                "🧭 BI - Fundamentos e Definição",
                "📌 BI é sistema de suporte à decisão que coleta, organiza, analisa e monitora dados.\n" +
                        "🎯 Objetivo: subsidiar a tomada de decisões assertivas e tempestivas.\n" +
                        "💰 O 'ouro do século XXI' é a informação.\n" +
                        "🔄 BI não substitui bancos relacionais, são complementares."
        ));

        lista.add(new Flashcard(
                "📊 BI - SAD e Tipos de Análise",
                "BI_SAD_ANALISES",
                "🧭 SAD e 4 Tipos de Análise",
                "📌 SAD = conjunto de procedimentos baseados em modelos.\n" +
                        "✅ CONSISTÊNCIA: decisões similares para casos similares.\n" +
                        "⏱️ TEMPESTIVIDADE: decisão no tempo certo.\n" +
                        "👤 SAD é SUPORTE, NÃO substitui o ser humano.\n" +
                        "📊 DESCRITIVA: O que aconteceu? (diagnóstico do que ocorreu).\n" +
                        "🔍 DIAGNÓSTICA: Por que aconteceu? (causa do evento).\n" +
                        "🔮 PREDITIVA: O que vai acontecer? (tendência e probabilidades).\n" +
                        "💡 PRESCRITIVA: O que fazer? (o que deve ser feito)."
        ));

        // ===================== VÍDEO 02 =====================
        lista.add(new Flashcard(
                "📊 BI - Arquitetura",
                "BI_ARQUITETURA",
                "🧭 Arquitetura e Habilidades do BI",
                "📌 4 HABILIDADES: Memória Organizacional, Integração, Insights e Apresentação.\n" +
                        "🏗️ 4 COMPONENTES: Data Warehouse, Análise de Negócios, BPM e Dashboard.\n" +
                        "📊 Apresentação dos dados é essencial (gráficos/relatórios).\n" +
                        "🔄 BI trabalha com dados estruturados E não estruturados.\n" +
                        "⚠️ Prescritiva pode ser atribuída ao Data Mining."
        ));

        // ===================== VÍDEO 03 =====================
        lista.add(new Flashcard(
                "📦 DW - Conceitos e Origem",
                "DW_CONCEITOS_ORIGEM",
                "🧭 DW - Definição e Características",
                "📌 DW = repositório centralizado para suporte à decisão.\n" +
                        "📋 4 CARACTERÍSTICAS: Orientado por Assunto, Integrado, Não Volátil e Histórico.\n" +
                        "🔒 NÃO VOLÁTIL: dados apenas para consulta (READ-ONLY).\n" +
                        "🔄 Relacional alimenta o DW; são complementares, não excludentes.\n" +
                        "💡 Motivação: consultas lentas no relacional e perda da visão holística."
        ));

        lista.add(new Flashcard(
                "⚖️ Banco Operacional vs Data Warehouse",
                "COMPARACAO_OPERACIONAL_DW",
                "🧭 Diferenças entre Relacional e DW",
                "📌 OPERACIONAL (RELACIONAL) \n" +
                        "• Foco: operações do dia a dia (Transacional).\n" +
                        "• Dados: atuais/correntes.\n" +
                        "• Estrutura: tabelas normalizadas.\n" +
                        "• Alterações: permite INSERT, UPDATE e DELETE (CRUD).\n" +
                        "• Atualização: em tempo real, campo a campo.\n" +
                        "• Objetivo: rapidez nas operações.\n\n" +
                        "📌 DATA WAREHOUSE (DW):\n" +
                        "• Foco: análise e suporte à decisão.\n" +
                        "• Dados: históricos, integrados e sumarizados.\n" +
                        "• Estrutura: modelo dimensional (Fato e Dimensão).\n" +
                        "• Alterações: não volátil (somente consulta).\n" +
                        "• Atualização: cargas periódicas/importações.\n" +
                        "• Objetivo: gerar informações estratégicas.\n\n" +
                        "💡 RESUMO: Banco Relacional opera o negócio; DW analisa o negócio."
        ));

        // ===================== VÍDEO 04 =====================
        lista.add(new Flashcard(
                "📦 DW - Tipos e Características",
                "DW_TIPOS_CARACTERISTICAS",
                "🧭 EDW, ODS e Data Mart",
                "📌 EDW: Data Warehouse corporativo (visão holística).\n" +
                        "📊 ODS: Armazenamento intermediário operacional.\n" +
                        "📁 DATA MART: Subconjunto do DW, focado em departamento.\n" +
                        "🔄 Data Marts: Dependente (via EDW), Independente (via fontes) ou Híbrido.\n" +
                        "📋 4 CARACTERÍSTICAS: Orientado por Assunto, Integrado, Não Volátil e Histórico."
        ));

        // ===================== VÍDEO 05 =====================
        lista.add(new Flashcard(
                "📦 DW - Processos e Abordagens",
                "DW_PROCESSOS_ABORDAGENS",
                "🧭 Fluxo e Construção do DW",
                "📌 FLUXO: Fontes → ETL → DW → Metadados → Data Marts → Middleware → Visualização.\n" +
                        "📋 ETL: obrigatório (Extrai, Transforma, Carrega).\n" +
                        "📌 METADADOS: 'dados sobre os dados' (dicionário).\n" +
                        "🔄 MIDDLEWARE: 'tradutor' entre tecnologias.\n" +
                        "📊 INMON (Top-Down): EDW → Data Marts.\n" +
                        "📊 KIMBALL (Bottom-Up): Data Marts → EDW."
        ));

        // ===================== VÍDEO 06 =====================
        lista.add(new Flashcard(
                "📦 DW - Modelagem Dimensional",
                "DW_MODELAGEM_DIMENSIONAL",
                "🧭 Fatos, Dimensões e Granularidade",
                "📌 MODELAGEM DIMENSIONAL: Fatos e Dimensões.\n" +
                        "📊 FATO: Métrica numérica (ex: vendas, matrículas).\n" +
                        "📋 DIMENSÃO: Atributos descritivos (ex: cliente, produto, tempo).\n" +
                        "⚖️ GRANULARIDADE: + detalhes = - granularidade; - detalhes = + granularidade.\n" +
                        "🔑 1º Passo: Identificar Processos do Negócio."
        ));

        lista.add(new Flashcard(
                "📦 DW - Inmon vs Kimball",
                "DW_INMON_KIMBALL",
                "🧭 Comparação de Abordagens",
                "📌 INMON (Top-Down): EDW → Data Marts. Mais normalizado.\n" +
                        "📊 KIMBALL (Bottom-Up): Data Marts → EDW. Desnormalizado.\n" +
                        "💰 Kimball é mais comum (custo inicial menor e ágil).\n" +
                        "🎯 Inmon voltado para TI; Kimball voltado para usuário final.\n" +
                        "📊 Consultas: Inmon no EDW; Kimball nos Data Marts."
        ));

        // ===================== VÍDEO 07 =====================
        lista.add(new Flashcard(
                "⚙️ ETL - Processo e Etapas",
                "ETL_PROCESSO",
                "🧭 ETL - Coração do DW",
                "📌 ETL = Extract, Transform, Load (80% do esforço do DW).\n" +
                        "📥 EXTRATIVO (60%): identificar e extrair dados de fontes.\n" +
                        "🔧 TRANSFORMAÇÃO: limpar, padronizar, consolidar.\n" +
                        "💾 CARGA: completa (1ª vez) ou incremental (periódica).\n" +
                        "📂 STAGE AREA: área temporária durante o ETL.\n" +
                        "⚠️ Transformação NÃO pode alterar o valor original do dado."
        ));

        lista.add(new Flashcard(
                "⚙️ ETL vs ELT",
                "ETL_VS_ELT",
                "🧭 Comparação ETL x ELT",
                "📌 ETL: Extrai → Transforma → Carrega (tradicional).\n" +
                        "📊 ELT: Extrai → Carrega → Transforma (moderno).\n" +
                        "☁️ ELT viabilizado por custo baixo de armazenamento em nuvem.\n" +
                        "🔒 ETL: melhor para dados sensíveis.\n" +
                        "⚡ ELT: mais ágil, flexível e com menor custo de manutenção.\n" +
                        "👤 ELT: transformação feita por Analistas de Negócio."
        ));

        // ===================== VÍDEO 08 =====================
        lista.add(new Flashcard(
                "⚙️ Pipeline de Dados",
                "PIPELINE_CONCEITOS",
                "🧭 Pipeline - Automatização e Orquestração",
                "📌 PIPELINE = fluxo automatizado de dados (produtor → consumidor).\n" +
                        "🤖 AUTOMATIZAÇÃO: execução sem intervenção manual.\n" +
                        "🎯 ORQUESTRAÇÃO: gerenciar e sincronizar etapas.\n" +
                        "🔄 REPRODUTIBILIDADE: mesmo resultado em condições similares.\n" +
                        "📊 ETL e ELT são TIPOS de pipelines de dados.\n" +
                        "💡 ETAPAS COMUNS: Coleta → Transporte → Limpeza → Transformação → Carga."
        ));

        lista.add(new Flashcard(
                "⚙️ Pipeline - Benefícios",
                "PIPELINE_BENEFICIOS",
                "🧭 Vantagens da Pipeline",
                "📌 MELHOR QUALIDADE: processos automatizados de limpeza.\n" +
                        "⚡ PROCESSAMENTO EFICIENTE: divide tarefas em etapas menores.\n" +
                        "🔄 INTEGRAÇÃO ABRANGENTE: combina fontes distintas.\n" +
                        "📈 ESCALABILIDADE: cresce com a demanda.\n" +
                        "💰 REDUÇÃO DE CUSTOS: minimiza trabalho manual e erros."
        ));

        // ===================== VÍDEO 09 =====================
        lista.add(new Flashcard(
                "⚙️ Pipeline - Lote vs Fluxo",
                "PIPELINE_BATCH_STREAM",
                "🧭 Processamento em Lote e Fluxo",
                "📌 BATCH (Lote): grandes volumes, periódico (dados 'frios').\n" +
                        "🌊 STREAMING (Fluxo): contínuo, pequenos pacotes (dados 'quentes').\n" +
                        "💻 Batch: alto poder computacional por curto período.\n" +
                        "📡 Streaming: baixa latência e conexão confiável.\n" +
                        "🏦 Exemplos: Folha de pagamento (Batch) vs Transações bancárias (Streaming).\n" +
                        "📊 ETL é tradicionalmente em lote, mas pode ser adaptado."
        ));

        lista.add(new Flashcard(
                "⚙️ Pipeline vs ETL",
                "PIPELINE_VS_ETL",
                "🧭 Diferenças Fundamentais",
                "📌 PIPELINE: conceito genérico (qualquer fluxo automatizado).\n" +
                        "📊 ETL: tipo específico (Extração → Transformação → Carga).\n" +
                        "🎯 Pipeline: destinos variados (DW, Data Lake, Apps, Dashboards).\n" +
                        "📦 ETL: destino típico é Data Warehouse.\n" +
                        "🔄 Pipeline: pode ser lote OU fluxo.\n" +
                        "📊 ETL: tradicionalmente focado em processamento em lote."
        ));

        return lista;
    }
}
