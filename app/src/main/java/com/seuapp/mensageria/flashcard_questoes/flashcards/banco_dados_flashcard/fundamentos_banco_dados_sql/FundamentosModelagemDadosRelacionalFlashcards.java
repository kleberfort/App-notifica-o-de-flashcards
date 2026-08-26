package com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FundamentosModelagemDadosRelacionalFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // VÍDEO 01 - Modelo Lógico e Modelo Relacional - Fundamentos
        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_NIVEIS_MODELAGEM",
                "🧭 Níveis de Modelagem - Hierarquia",
                "📌 Conceitual: visões individuais, abstração total, independente HW/SW.\n" +
                        "🟠 Lógico: visão única, depende do SGBD, menos abstrato.\n" +
                        "🔴 Físico: dependente de HW/SW, detalhes de armazenamento físico."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_TIPOS_MODELOS_LOGICOS",
                "🧭 Tipos de Modelos Lógicos - Palavras-chave",
                "📌 Plano: 'matrizes bidimensionais' (planilhas).\n" +
                        "🟢 Rede: 'apontadores' e 'referências' entre tabelas.\n" +
                        "🌳 Hierárquico: 'árvore', estrutura 'pai e filho'.\n" +
                        "🧊 Orientado a Objetos: 'objetos', 'propriedades', 'métodos'.\n" +
                        "📊 Relacional: 'tabelas', 'linhas', 'colunas', 'chaves'.\n" +
                        "🔀 Hierárquico-Relacional: 'misto' (junção do relacional com OO)."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_ELEMENTOS_RELACIONAL",
                "🧭 Elementos do Modelo Relacional",
                "📌 Tabela (Relação) = Elemento do mundo real (ex: Cliente).\n" +
                        "📏 Linha (Tupla/Registro) = Fato do mundo real (ex: Cliente código 1).\n" +
                        "🔲 Coluna (Atributo/Campo) = Qualidade ou propriedade do elemento.\n" +
                        "📋 Domínio = Tipo de dado da coluna (número, texto, data, etc.)."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_RELACAO_VS_RELACIONAMENTO",
                "🧭 Relação vs Relacionamento",
                "📌 RELAÇÃO = Tabela (relação entre dados dentro da tabela).\n" +
                        "🔗 RELACIONAMENTO = Ligação/associação entre tabelas diferentes."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_PROPRIEDADES_ORDENACAO",
                "🧭 Propriedades de Ordenação da Relação",
                "📌 Linhas (Tuplas): ordem NÃO obrigatória.\n" +
                        "📏 Colunas (Atributos): ordem pode ser relevante (depende do nível de abstração).\n" +
                        "⚠️ Mantida a correspondência entre atributo e valor."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_DICAS_CILADAS_1",
                "🧭 Ciladas e Antídotos - Parte 1",
                "📌 'Relação = Relacionamento' → FALSO. Relação=tabela; Relacionamento=ligação.\n" +
                        "⚠️ 'Linha = elemento do mundo real' → FALSO. Linha=fato; Tabela=elemento.\n" +
                        "📌 'Ordem das tuplas é obrigatória' → FALSO. Pode ser ordenada pelo usuário.\n" +
                        "⚠️ 'Domínio = nome da coluna' → FALSO. Domínio = tipo de dado."
        ));

        // VÍDEO 02 - Álgebra Relacional (Parte 1)
        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_CONCEITOS_FUNDAMENTAIS",
                "🧭 Conceitos Fundamentais do Modelo Relacional",
                "📌 Valores Atômicos: cada valor é indivisível (não composto, não multivalorado).\n" +
                        "🔲 NULL: representa ausência/deconhecimento/não aplicabilidade. ≠ zero/vazio.\n" +
                        "📌 Interpretação da Relação: tabela = elemento; tupla = fato/instância."
        ));

        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_SELECAO_PROJECAO",
                "🧭 Seleção (σ) e Projeção (π) - Operações Unárias",
                "📌 SELEÇÃO (σ): filtra linhas que atendem a condição. Retorna todas as colunas.\n" +
                        "📏 PROJEÇÃO (π): seleciona colunas específicas. Elimina linhas duplicadas.\n" +
                        "⚠️ Projeção elimina duplicatas COMPLETAS nas colunas projetadas."
        ));

        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_PRODUTO_CARTESIANO_JUNCAO",
                "🧭 Produto Cartesiano (×) e Junção (⨝)",
                "📌 PRODUTO CARTESIANO (×): combina TODAS as linhas de uma com TODAS da outra.\n" +
                        "📏 Colunas = soma; Linhas = produto.\n" +
                        "📌 JUNÇÃO (⨝): combina linhas com condição (ex: igualdade de chaves).\n" +
                        "⚠️ Diferença: Junção REMOVE colunas duplicadas."
        ));

        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_UNIAO_CONDICOES",
                "🧭 União (U) - Operação Binária",
                "📌 UNIÃO (U): empilha linhas de duas tabelas, eliminando duplicatas.\n" +
                        "⚠️ CONDIÇÕES OBRIGATÓRIAS:\n" +
                        "  1) Mesmo número de colunas.\n" +
                        "  2) Colunas com os MESMOS domínios (tipos de dados)."
        ));

        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_DICAS_CILADAS_2",
                "🧭 Ciladas e Antídotos - Álgebra Relacional",
                "📌 'Seleção elimina colunas' → FALSO. Seleção filtra LINHAS.\n" +
                        "⚠️ 'Projeção elimina colunas duplicadas' → FALSO. Projeção elimina LINHAS duplicadas.\n" +
                        "📌 'Produto Cartesiano é unário' → FALSO. É BINÁRIO (duas tabelas).\n" +
                        "⚠️ 'NULL = zero ou vazio' → FALSO. NULL = ausência de informação."
        ));

        // VÍDEO 03 - Álgebra, Views, Índices e Chaves
        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_OPERACOES_COMPLETAS",
                "🧭 Resumo das Operações da Álgebra Relacional",
                "📌 SELEÇÃO (σ): filtra linhas (unária).\n" +
                        "📏 PROJEÇÃO (π): seleciona colunas, elimina duplicatas (unária).\n" +
                        "📌 PRODUTO CARTESIANO (×): todas combinações (binária).\n" +
                        "📌 JUNÇÃO (⨝): combina com condição, remove colunas (binária).\n" +
                        "📌 UNIÃO (U): empilha linhas, mesma estrutura (binária).\n" +
                        "📌 INTERSEÇÃO (∩): apenas comuns, mesma estrutura (binária).\n" +
                        "📌 DIFERENÇA (-): primeira menos segunda (binária)."
        ));

        lista.add(new Flashcard(
                "📘 Álgebra Relacional",
                "BANCO_MODELAGEM_PROPRIEDADES_OPERACOES",
                "🧭 Propriedades das Operações",
                "📌 ARIDADE: Unárias (Seleção, Projeção) | Binárias (Demais).\n" +
                        "📌 COMUTATIVAS: Produto Cartesiano, Junção, União, Interseção.\n" +
                        "⚠️ NÃO COMUTATIVAS: Projeção e Diferença (cai MUITO em provas)."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_VIEW_INDICE",
                "🧭 View (Visão) e Índice - Performance/Segurança",
                "📌 VIEW: objeto VIRTUAL (tabela lógica), não armazena dados.\n" +
                        "🎯 Objetivos: performance (evita joins) e SEGURANÇA (restringe acesso).\n" +
                        "📌 VIEW MATERIALIZADA: armazena fisicamente os dados (requer manutenção).\n" +
                        "📌 ÍNDICE: estrutura auxiliar que ACELERA a localização de registros."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_TIPOS_CHAVES",
                "🧭 Chaves no Modelo Relacional",
                "📌 SUPERCHAVE: conjunto de atributos que identifica unicamente uma tupla.\n" +
                        "📌 PK (Primária): superchave MÍNIMA, ÚNICA e NÃO NULA.\n" +
                        "📌 CHAVE COMPOSTA: PK com mais de um atributo.\n" +
                        "📌 CHAVE CANDIDATA: superchave mínima que poderia ser PK.\n" +
                        "📌 CHAVE SECUNDÁRIA: candidata que NÃO foi escolhida como PK.\n" +
                        "📌 FK (Estrangeira): referencia a PK de outra tabela."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_RESTRICOES_INTEGRIDADE",
                "🧭 Restrições de Integridade - Resumo",
                "📌 UNICIDADE: PK não pode ter valores duplicados.\n" +
                        "📌 DOMÍNIO: valores devem ser do tipo definido para a coluna.\n" +
                        "📌 ENTIDADE: PK NÃO pode ser nula.\n" +
                        "📌 REFERENCIAL: FK deve ser compatível com a PK referenciada (ou ser nula)."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_DICAS_CILADAS_CHAVES",
                "🧭 Ciladas e Antídotos - Chaves e Restrições",
                "📌 'FK referencia chave secundária' → FALSO. FK referencia PK (segundo CESPE).\n" +
                        "⚠️ 'PK pode ser nula' → FALSO. PK é NOT NULL.\n" +
                        "📌 'Índice = tipo de chave' → FALSO. Índice é recurso de OTIMIZAÇÃO."
        ));

        // VÍDEO 04 - Chaves, Restrições e Relacionamentos
        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_RESTRICOES_DETALHADAS",
                "🧭 Restrições de Integridade - Aprofundamento",
                "📌 UNICIDADE (Chave): proíbe valores duplicados na PK.\n" +
                        "📌 DOMÍNIO: proíbe valores de tipo diferente do domínio.\n" +
                        "📌 ENTIDADE: proíbe valor NULO na PK.\n" +
                        "📌 REFERENCIAL: proíbe inconsistência entre FK e PK referenciada."
        ));

        // VÍDEO 05 - Relacionamentos e Tabelas Associativas
        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_RELACIONAMENTOS_1_1_1_N",
                "🧭 Relacionamentos 1:1 e 1:N",
                "📌 1:1 (Um para Um): FK em qualquer tabela (ou em ambas).\n" +
                        "📌 1:N (Um para Muitos): FK fica no lado N (tabela com muitos).\n" +
                        "⚠️ Em 1:N, a FK NÃO fica na tabela do lado 1."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_RELACIONAMENTO_N_N",
                "🧭 Relacionamento N:N - Tabela Associativa",
                "📌 N:N: OBRIGATÓRIA criação de tabela ASSOCIATIVA.\n" +
                        "📌 Conteúdo MÍNIMO: duas FKs (uma para cada tabela original).\n" +
                        "📌 Pode conter atributos adicionais (data, valor, status, etc.).\n" +
                        "📌 PK: geralmente composta pelas FKs, mas pode ser própria."
        ));

        lista.add(new Flashcard(
                "📘 Modelagem de Dados",
                "BANCO_MODELAGEM_DICAS_CILADAS_RELACIONAMENTOS",
                "🧭 Ciladas e Antídotos - Relacionamentos",
                "📌 'Em N:N, FKs são opcionais' → FALSO. FKs são OBRIGATÓRIAS.\n" +
                        "⚠️ 'PK da associativa = SEMPRE composta pelas FKs' → FALSO. Depende da regra.\n" +
                        "📌 'Relacionamento 1:1 exige tabela associativa' → FALSO. Não exige.\n" +
                        "📌 'N:N pode ser representado sem tabela associativa' → FALSO."
        ));

        // VÍDEO 06 - As 13 Regras de COD
        lista.add(new Flashcard(
                "📘 Regras de COD",
                "BANCO_MODELAGEM_REGRAS_0_A_3",
                "🧭 Regras de COD - Regras 0 a 3",
                "📌 REGRA 0 (Fundamental): SGBD gerencia tudo com recursos relacionais.\n" +
                        "📌 REGRA 1 (Informação): dados representados em tabelas (linhas e colunas).\n" +
                        "📌 REGRA 2 (Garantia de Acesso): acesso por tabela + PK + coluna.\n" +
                        "📌 REGRA 3 (Nulos): nulos suportados e tratados sistematicamente."
        ));

        lista.add(new Flashcard(
                "📘 Regras de COD",
                "BANCO_MODELAGEM_REGRAS_4_A_7",
                "🧭 Regras de COD - Regras 4 a 7",
                "📌 REGRA 4 (Catálogo): metadados no nível lógico, mesma linguagem relacional.\n" +
                        "📌 REGRA 5 (Sublinguagem): linguagem declarativa (SQL) para definição/manipulação.\n" +
                        "📌 REGRA 6 (Views): views teoricamente atualizáveis devem ser atualizáveis na prática.\n" +
                        "📌 REGRA 7 (Alto Nível): suporte a inserção, atualização e exclusão em alto nível."
        ));

        lista.add(new Flashcard(
                "📘 Regras de COD",
                "BANCO_MODELAGEM_REGRAS_8_A_12",
                "🧭 Regras de COD - Regras 8 a 12",
                "📌 REGRA 8 (Independência Física): mudanças no armazenamento não afetam apps.\n" +
                        "📌 REGRA 9 (Independência Lógica): mudanças na estrutura não afetam a relação lógica.\n" +
                        "📌 REGRA 10 (Independência de Integridade): regras no CATÁLOGO, não nos programas.\n" +
                        "📌 REGRA 11 (Independência de Distribuição): mudanças geográficas não afetam apps.\n" +
                        "📌 REGRA 12 (Não Subversão): baixo nível não pode subverter regras de integridade."
        ));

        lista.add(new Flashcard(
                "📘 Regras de COD",
                "BANCO_MODELAGEM_DICAS_CILADAS_COD",
                "🧭 Ciladas e Antídotos - Regras de COD",
                "📌 'Regras de COD são 12' → FALSO. São 13 (numeradas de 0 a 12).\n" +
                        "⚠️ 'Regra 7 = sétima regra' → CUIDADO! Regra 7 é a de número 7.\n" +
                        "📌 'Nulos não devem ser usados' → FALSO. Devem ser SUPORTADOS.\n" +
                        "📌 'Restrições nos programas' → FALSO. Devem estar no CATÁLOGO."
        ));

        return lista;

    }


}