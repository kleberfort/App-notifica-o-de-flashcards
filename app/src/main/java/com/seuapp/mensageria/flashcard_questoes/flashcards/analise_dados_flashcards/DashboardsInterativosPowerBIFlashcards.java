package com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class DashboardsInterativosPowerBIFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();
        // ===== VÍDEO 01 - CONCEITOS FUNDAMENTAIS =====
        lista.add(new Flashcard(
                "📘 Power BI - Conceitos Fundamentais",
                "POWERBI_DEFINICAO",
                "🧭 O que é e para que serve?",
                "📌 Power BI é a plataforma de BI da Microsoft:\n" +
                        "🟢 Transforma dados brutos em info coerente e interativa.\n" +
                        "🔵 Ciclo do Dado: Importar, Limpar, Analisar e Visualizar.\n" +
                        "⚡ Interatividade, Conectividade e Escalabilidade."));

        lista.add(new Flashcard(
                "📘 Power BI - Conceitos Fundamentais",
                "POWERBI_VERSAO_FUNCAO",
                "🧭 Função de cada versão",
                "📌 3 VERSÕES PRINCIPAIS:\n" +
                        "🖥️ Desktop → Criar relatórios (gratuito, foco modelagem).\n" +
                        "☁️ Service → Publicar e compartilhar na nuvem.\n" +
                        "📱 Mobile → Visualizar em dispositivos móveis."));

        lista.add(new Flashcard(
                "📘 Power BI - Conceitos Fundamentais",
                "POWERBI_CILADAS",
                "🧭 Ciladas e Antídotos - Parte 1",
                "📌 FIQUE ATENTO:\n" +
                        "❌ Funciona SÓ com Microsoft? → FALSO (conecta CSV, APIs).\n" +
                        "❌ Só serve para gráficos bonitos? → FALSO (objetivo é INSIGHT).\n" +
                        "❌ Uso exclusivo para grandes empresas? → FALSO (escalável)."));

        // ===== VÍDEO 02 - RECURSOS E FERRAMENTAS =====
        lista.add(new Flashcard(
                "📘 Power BI - Recursos e Ferramentas",
                "POWERBI_DATASET_ETL",
                "🧭 Dataset e ETL",
                "📌 CONJUNTO DE DADOS (Dataset): Matéria-prima.\n" +
                        "🔴 Combina várias fontes em UM único conjunto.\n" +
                        "📊 ETL: Extração (obrigatória) → Transformação (crítica) → Carga (obrigatória)."));

        lista.add(new Flashcard(
                "📘 Power BI - Recursos e Ferramentas",
                "POWERBI_QUERY_DIRECT",
                "🧭 Direct Query vs Power Query",
                "📌 DIRECT QUERY: Visualiza dados GIGANTES sem importar.\n" +
                        "⚙️ POWER QUERY: Ferramenta ETL (interface gráfica).\n" +
                        "💻 Linguagem M: Código gerado automaticamente.\n" +
                        "🔄 Também existe no Excel (não só no Power BI)."));

        lista.add(new Flashcard(
                "📘 Power BI - Recursos e Ferramentas",
                "POWERBI_CILADAS_ETL",
                "🧭 Ciladas sobre ETL e Ferramentas",
                "📌 ANTÍDOTOS:\n" +
                        "🛑 Transformação NÃO é obrigatória no ETL.\n" +
                        "🛑 Fontes diversas geram UM único dataset.\n" +
                        "🛑 Power Query NÃO é exclusivo do Power BI Desktop."));

        // ===== VÍDEO 03 - MODELAGEM E VISUALIZAÇÃO =====
        lista.add(new Flashcard(
                "📘 Power BI - Modelagem e Visualização",
                "POWERBI_MODELAGEM_PIVOT",
                "🧭 Modelagem de Dados e Power Pivot",
                "📌 MODELAGEM: Criar relacionamentos entre tabelas.\n" +
                        "⚡ POWER PIVOT: Ferramenta chave para análises avançadas.\n" +
                        "🔗 Relacionamentos, Medidas (DAX) e Hierarquias."));

        lista.add(new Flashcard(
                "📘 Power BI - Modelagem e Visualização",
                "POWERBI_VISUALIZACOES_1",
                "🧭 Gráficos e suas funções (Parte 1)",
                "📌 PRINCIPAIS VISUAIS:\n" +
                        "📈 Área: Magnitude da alteração ao longo do tempo.\n" +
                        "📊 Barras: Comparação entre categorias.\n" +
                        "📉 Linha: Tendência e formato geral dos dados.\n" +
                        "🍩 Rosca: Relação das partes com o todo."));

        lista.add(new Flashcard(
                "📘 Power BI - Modelagem e Visualização",
                "POWERBI_VISUALIZACOES_2",
                "🧭 Gráficos e funções (Parte 2)",
                "📌 VISUAIS ESPECÍFICOS:\n" +
                        "🧩 Combinação: Colunas + Linhas (1 ou 2 eixos Y).\n" +
                        "📡 Funil: Estágios sucessivos de um processo.\n" +
                        "🎯 Medidor: Progresso em relação a uma meta.\n" +
                        "🔍 Influenciadores: Fatores que influenciam um resultado."));

        lista.add(new Flashcard(
                "📘 Power BI - Modelagem e Visualização",
                "POWERBI_KPI_DATAFLOW",
                "🧭 KPI e Data Flow",
                "📌 KPI: Mede progresso/distorção em relação à meta.\n" +
                        "☁️ DATA FLOW: Power Query executado na NUVEM (Azure/Dataverse).\n" +
                        "🛑 Cilada: Power Query (ETL) e Power Pivot (Modelagem) NÃO são iguais."));

        // ===== VÍDEO 04 - VISUALIZAÇÃO (GRÁFICOS, MAPAS E ELEMENTOS) =====
        lista.add(new Flashcard(
                "📘 Power BI - Visualização de Dados 2",
                "POWERBI_DISP_BOLHA_PONTO",
                "🧭 Dispersão, Bolha e Ponto",
                "📌 DIFERENÇAS IMPORTANTES:\n" +
                        "🔵 Dispersão: Dois eixos numéricos (X e Y).\n" +
                        "🔴 Bolha: Tamanho representa uma 3ª variável.\n" +
                        "🟢 Ponto: Aceita dados categóricos (mais flexível)."));

        lista.add(new Flashcard(
                "📘 Power BI - Visualização de Dados 2",
                "POWERBI_TREEMAP_SLICER",
                "🧭 Treemap e Segmentação",
                "📌 TREEMAP: Retângulos coloridos (tamanho = valor).\n" +
                        "🔶 Mostra hierarquia e proporção (parte/todo). MUITO COBRADO!\n" +
                        "✂️ SEGMENTAÇÃO (Slicer): Filtra os outros visuais da página."));

        lista.add(new Flashcard(
                "📘 Power BI - Visualização de Dados 2",
                "POWERBI_MAPAS",
                "🧭 Mapas: Tipos e funções",
                "📌 TIPOS DE MAPA:\n" +
                        "🗺️ ArcGIS: Avançado, imersivo, camadas de referência.\n" +
                        "☁️ Azure: Dados espaciais corporativos (nuvem MS).\n" +
                        "🎨 Coroplético: Sombreamento (claro→escuro) por região.\n" +
                        "🧩 Formas: Compara regiões com cores (não locais precisos)."));

        lista.add(new Flashcard(
                "📘 Power BI - Visualização de Dados 2",
                "POWERBI_MATRIZ_REL_PAINEL",
                "🧭 Matriz, Relatório e Painel",
                "📌 MATRIZ: Tabela com múltiplas dimensões e drill down.\n" +
                        "📄 RELATÓRIO: Várias páginas, conta uma história detalhada.\n" +
                        "📊 PAINEL: Página única, visão resumida e rápida."));

        // ===== VÍDEO 05 - ANÁLISE, COLABORAÇÃO E SEGURANÇA =====
        lista.add(new Flashcard(
                "📘 Power BI - Análise e Segurança",
                "POWERBI_BLOCOS_ANALISE",
                "🧭 Blocos e Recursos de Análise",
                "📌 BLOCO (Tile): Visualização única no relatório/painel.\n" +
                        "🔍 ANÁLISE: Filtragem, Classificação e Destaque.\n" +
                        "📈 Tendências: Aplicado em gráficos de linha/dispersão.\n" +
                        "📂 Agrupamentos: Dados por critérios específicos."));

        lista.add(new Flashcard(
                "📘 Power BI - Análise e Segurança",
                "POWERBI_COLABORACAO",
                "🧭 Colaboração e Compartilhamento",
                "📌 COMPARTILHAMENTO: É OPCIONAL (não obrigatório).\n" +
                        "👥 Com internos/externos, individualmente ou em grupos.\n" +
                        "💬 Comentários e discussões em painéis.\n" +
                        "🔑 Tripé: Usuário, Senha e Permissão."));

        lista.add(new Flashcard(
                "📘 Power BI - Análise e Segurança",
                "POWERBI_SEGURANCA_AD",
                "🧭 Segurança e Active Directory",
                "📌 AZURE ACTIVE DIRECTORY: Gerencia acessos e credenciais.\n" +
                        "🛡️ Administrador segue política de SEGURANÇA da empresa.\n" +
                        "🔐 Modelos: Por Papéis (funções) ou Direto (usuário).\n" +
                        "📋 Políticas de privacidade definem quem vê o quê."));

        // ===== VÍDEO 06 - RESOLUÇÃO DE QUESTÕES FGV =====
        lista.add(new Flashcard(
                "📘 Power BI - Resolução FGV",
                "POWERBI_FGV_DRILLDOWN",
                "🧭 Drill Down e Segmentação",
                "📌 PALAVRAS-CHAVE (FGV):\n" +
                        "⬇️ 'Nível maior para menor' → DRILL DOWN.\n" +
                        "✂️ 'Gráfico autônomo para filtrar' → SEGMENTAÇÃO.\n" +
                        "📰 'Relatórios paginados' → REPORT BUILDER."));

        lista.add(new Flashcard(
                "📘 Power BI - Resolução FGV",
                "POWERBI_FGV_MAPAS_MATRIZ",
                "🧭 Mapas e Matriz (FGV)",
                "📌 PALAVRAS-CHAVE (FGV):\n" +
                        "🎨 'Sombreamento claro→escuro' → COROPLÉTICO.\n" +
                        "🧩 'Múltiplas dimensões e drill down' → MATRIZ.\n" +
                        "📚 A FGV adora conceitos diretos dos manuais da Microsoft."));

        return lista;
    }
}