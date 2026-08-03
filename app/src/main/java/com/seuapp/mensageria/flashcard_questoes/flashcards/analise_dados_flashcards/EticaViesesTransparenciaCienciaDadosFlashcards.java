package com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class EticaViesesTransparenciaCienciaDadosFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();


        // ============================================================
        // VÍDEO AULA 01: RAÍZES E FUNDAMENTOS DA INTELIGÊNCIA ARTIFICIAL
        // Conteúdo: Marco inicial da IA, IA Simbólica, Conhecimento vs Raciocínio,
        //           Base de Conhecimento vs Banco de Dados, Linguagem Formal
        // ============================================================

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "MARCO_INICIAL_IA",
                "🧭 Ano/Evento Chave",
                "📌 O MARCO INICIAL da IA é em 1956:\n" +
                        "🏛️ Evento: Workshop Dartmouth College (EUA).\n" +
                        "👨‍🏫 Responsável: Prof. John McCarthy (matemático).\n" +
                        "💡 1º uso do termo 'Inteligência Artificial'."
        ));

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "CILADA_MARCO_INICIAL",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA: Datas 'icônicas' que NÃO são o marco:\n" +
                        "❌ 1950: Teste de Turing (NÃO é o marco oficial).\n" +
                        "❌ Década de 1960: 1º neurônio artificial.\n" +
                        "❌ Década de 1980: Sistemas Especialistas."
        ));

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "IA_SIMBOLICA",
                "🧭 Abordagem Vencedora",
                "📌 IA SIMBÓLICA (Lógica):\n" +
                        "🧠 Capacidade de raciocínio lógico a partir de conhecimento prévio.\n" +
                        "🔣 Usa símbolos/representações matemáticas formais.\n" +
                        "⚙️ Cria modelo formal do mundo + regras + raciocínio."
        ));

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "CONHECIMENTO_VS_RACIOCINIO",
                "🧭 Diferença Crucial",
                "📌 CONHECIMENTO ≠ RACIOCÍNIO:\n" +
                        "💾 CONHECIMENTO = Quantidade de informações (HD).\n" +
                        "🧮 RACIOCÍNIO = Capacidade de processar (CPU).\n" +
                        "🔑 Quanto + conhecimento, + capacidade de dedução."
        ));

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "BASE_CONHECIMENTO_VS_BD",
                "🧭 Estruturas de Dados",
                "📌 BASE DE CONHECIMENTO ≠ BANCO DE DADOS:\n" +
                        "\n" +
                        "🗃️ BANCO DE DADOS: Dados crus em tabelas (simples).\n" +
                        "💡 Exemplo: Nome: João | Idade: 20 | Cidade: Fortaleza.\n" +
                        "\n" +
                        "🧠 BASE DE CONHECIMENTO: Fatos + Regras interligados (mapa mental).\n" +
                        "💡 Exemplo: João tem 20 anos + 'Se idade ≥ 18 → é adulto'.\n" +
                        "\n" +
                        "🐱 Ex: 'Se mia e tem bigodes → é um gato'.\n" +
                        "💡 Exemplo: Animal observado: mia + tem bigodes → Sistema conclui: Gato."
        ));

        lista.add(new Flashcard(
                "📘 Raízes e Fundamentos da IA",
                "LINGUAGEM_FORMAL",
                "🧭 Por que usar?",
                "📌 LINGUAGEM FORMAL:\n" +
                        "\n" +
                        "🚫 Linguagem natural (português) é ambígua e imprecisa.\n" +
                        "💡 Exemplo: 'João viu Pedro com o telescópio.' (Quem estava com o telescópio?)\n" +
                        "\n" +
                        "✅ Permite manipulação lógica rigorosa.\n" +
                        "💡 Exemplo: 'Se chove → levo guarda-chuva.' (Sem interpretações diferentes.)\n" +
                        "\n" +
                        "📐 Ex: Lógica Proposicional, Primeira Ordem e Fuzzy.\n" +
                        "💡 Exemplo: Proposicional: 'Se estuda → passa'. Primeira Ordem: 'Todo aluno estuda'. Fuzzy: 'Água está morna'."
        ));

        // ============================================================
        // VÍDEO AULA 02: LÓGICAS E ONTOLOGIA
        // Conteúdo: Lógica Proposicional, Lógica de Primeira Ordem,
        //           Lógica Fuzzy, Ontologia
        // ============================================================

        // --- Lógica Proposicional ---
        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "LOGICA_PROPOSICIONAL",
                "🧭 Características",
                "📌 LÓGICA PROPOSICIONAL:\n" +
                        "⚪ Sentenças avaliadas como VERDADEIRAS ou FALSAS (binária).\n" +
                        "🔗 Conectivos: E (∧), OU (∨), SE...ENTÃO (→), SE E SOMENTE SE (↔).\n" +
                        "⚠️ LIMITAÇÃO: Não permite variáveis ou generalizações."
        ));

        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "CONECTIVO_IMPLICACAO",
                "🧭 Regras de Ação",
                "📌 CONECTIVO → (IMPLICAÇÃO):\n" +
                        "🧾 Usado para criar REGRAS DE AÇÃO.\n" +
                        "📖 Leitura: 'Se P, então Q'.\n" +
                        "🤖 Ex: 'Se há parede à frente, então virar à direita'."
        ));

        // --- Lógica de Primeira Ordem ---
        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "LOGICA_PRIMEIRA_ORDEM",
                "🧭 Componentes",
                "📌 LÓGICA DE PRIMEIRA ORDEM:\n" +
                        "🧩 Herda conectivos da proposicional + permite VARIÁVEIS.\n" +
                        "🔢 Quantificadores: ∀ (Universal - 'Todo') e ∃ (Existencial - 'Existe').\n" +
                        "📊 Predicados retornam V/F; Funções retornam OBJETOS."
        ));

        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "QUANTIFICADORES",
                "🧭 Leitura e Tradução",
                "📌 QUANTIFICADORES na Lógica de 1ª Ordem:\n" +
                        "\n" +
                        "🌍 ∀ (UNIVERSAL) = 'Todo', 'Cada', 'Qualquer'.\n" +
                        "💡 Ex.: 'Todo aluno estuda.'\n" +
                        "➡️ ∀x (Aluno(x) → Estuda(x)).\n" +
                        "📖 Lê-se: 'Para todo x, se x é aluno, então x estuda.'\n" +
                        "\n" +
                        "🔎 ∃ (EXISTENCIAL) = 'Existe', 'Algum', 'Pelo menos um'.\n" +
                        "💡 Ex.: 'Existe um aluno aprovado.'\n" +
                        "➡️ ∃x (Aluno(x) ∧ Aprovado(x)).\n" +
                        "📖 Lê-se: 'Existe pelo menos um x que é aluno e está aprovado.'\n" +
                        "\n" +
                        "📝 Tradução: 'Todo X é Y' → ∀x (X(x) → Y(x)).\n" +
                        "💡 Ex.: 'Todo cachorro é mamífero.'\n" +
                        "➡️ ∀x (Cachorro(x) → Mamifero(x)).\n" +
                        "📖 Lê-se: 'Para todo x, se x é cachorro, então x é mamífero.'"
        ));

        // --- Lógica Fuzzy ---
        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "LOGICA_FUZZY",
                "🧭 Tons de Cinza",
                "📌 LÓGICA FUZZY (Nebulosa):\n" +
                        "🎚️ Flexibiliza o binário: valores entre 0 e 1 (GRAUS DE PERTINÊNCIA).\n" +
                        "🌫️ Fronteiras DIFUSAS - ideal para informações imprecisas.\n" +
                        "🎯 Ex: 'Salário adequado' - R$ 1.999,99 pode ser 90% adequado.\n\n" +

                        "💡 EXEMPLO DIDÁTICO:\n" +
                        "Imagine que uma empresa considera:\n" +
                        "• Até R$ 1.500 → salário pouco adequado.\n" +
                        "• Entre R$ 1.500 e R$ 2.500 → adequação aumenta gradualmente.\n" +
                        "• Acima de R$ 2.500 → totalmente adequado.\n\n" +

                        "Funcionários fictícios:\n" +
                        "👤 Ana → R$ 1.300 → Grau de adequação = 0,2 (20%).\n" +
                        "👤 Bruno → R$ 2.000 → Grau de adequação = 0,8 (80%).\n" +
                        "👤 Carla → R$ 2.700 → Grau de adequação = 1,0 (100%).\n\n" +

                        "✔️ Na lógica tradicional, apenas 'adequado' ou 'não adequado'.\n" +
                        "✔️ Na Lógica Fuzzy, cada salário possui um grau de adequação."
        ));

        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "GRAU_PERTINENCIA",
                "🧭 Conceito Chave",
                "📌 GRAU DE PERTINÊNCIA (Fuzzy):\n" +
                        "📊 Mede o QUANTO um elemento pertence a um conjunto (0 a 1).\n" +
                        "❌ NÃO indica SE pertence ou não (isso é binário).\n" +
                        "🔀 Elemento pode pertencer a vários conjuntos com graus diferentes.\n\n" +

                        "💡 EXEMPLO DIDÁTICO:\n" +
                        "Considere a temperatura de 25°C.\n\n" +

                        "Conjuntos Fuzzy:\n" +
                        "🧊 Frio → Grau de pertinência = 0,1 (10%).\n" +
                        "🌤️ Ameno → Grau de pertinência = 0,8 (80%).\n" +
                        "☀️ Quente → Grau de pertinência = 0,4 (40%).\n\n" +

                        "✔️ Os três conjuntos são verdadeiros ao mesmo tempo,\n" +
                        "mas com intensidades diferentes.\n" +
                        "✔️ O valor 25°C pertence principalmente ao conjunto 'Ameno'."
        ));

        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "CILADA_FUNCAO_PERTINENCIA",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA sobre Função de Pertinência:\n" +
                        "❌ Pensar que função de pertinência é sempre LINEAR.\n" +
                        "✅ Pode ser NÃO LINEAR (qualquer formato).\n" +
                        "🎯 O importante é medir o grau, não a forma da função."
        ));

        // --- Ontologia ---
        lista.add(new Flashcard(
                "📘 Lógica Proposicional, 1ª Ordem, Fuzzy e Ontologia",
                "ONTOLOGIA",
                "🧭 Ferramenta de Engenharia",
                "📌 ONTOLOGIA em IA:\n" +
                        "📐 Ferramenta que ORGANIZA o conhecimento de um domínio.\n" +
                        "🧩 Componentes: INDIVÍDUOS, CLASSES, PROPRIEDADES e AXIOMAS.\n" +
                        "🔗 NÃO é sinônimo de Base de Conhecimento (organiza vs armazena).\n\n" +

                        "💡 EXEMPLO DIDÁTICO:\n" +
                        "Domínio: Universidade.\n\n" +

                        "👥 Classe: Pessoa, Aluno, Professor.\n" +
                        "🙋 Indivíduos: João (Aluno) e Maria (Professor).\n" +
                        "🏷️ Propriedade: 'matriculadoEm' → João → Engenharia.\n" +
                        "📏 Axioma: Todo Aluno é uma Pessoa.\n\n" +

                        "✔️ A ontologia define como os conceitos e suas relações são organizados.\n" +
                        "✔️ A Base de Conhecimento armazena os dados, como 'João está matriculado em Engenharia'."
        ));

        // ============================================================
        // VÍDEO AULA 03: SISTEMAS ESPECIALISTAS
        // Conteúdo: Estrutura, Heurística, Limitações, Aplicações
        // ============================================================

        lista.add(new Flashcard(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                "SISTEMAS_ESPECIALISTAS",
                "🧭 Visão Geral",
                "📌 SISTEMAS ESPECIALISTAS:\n" +
                        "📅 Surgiram na DÉCADA DE 1980 ('Último suspiro' da IA Simbólica).\n" +
                        "👨‍⚕️ Imitam a capacidade de decisão de um especialista humano.\n" +
                        "💰 Tiveram grande sucesso comercial na época."
        ));

        lista.add(new Flashcard(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                "ESTRUTURA_SE",
                "🧭 Componentes",
                "📌 ESTRUTURA do Sistema Especialista:\n" +
                        "👤 Especialista Humano → fornece o CONHECIMENTO.\n" +
                        "⚙️ Motor de Inferência → NÚCLEO (realiza o RACIOCÍNIO).\n" +
                        "📚 Base de Conhecimento → armazena FATOS + REGRAS.\n\n" +

                        "💡 EXEMPLO DIDÁTICO:\n" +
                        "Sistema Especialista para diagnóstico médico.\n\n" +

                        "👨‍⚕️ Especialista Humano:\n" +
                        "Informa a regra: 'Se o paciente tem febre e tosse, pode estar com gripe.'\n\n" +

                        "📚 Base de Conhecimento:\n" +
                        "• Fato: João está com febre.\n" +
                        "• Fato: João está com tosse.\n" +
                        "• Regra: Se febre + tosse → suspeita de gripe.\n\n" +

                        "⚙️ Motor de Inferência:\n" +
                        "Analisa os fatos e aplica a regra.\n" +
                        "Resultado: 'João pode estar com gripe.'"
        ));

        lista.add(new Flashcard(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                "HEURISTICA_SE",
                "🧭 Regra Prática",
                "📌 HEURÍSTICA em Sistemas Especialistas:\n" +
                        "📐 Regra prática = solução 'BOA O SUFICIENTE' (não ótima).\n" +
                        "⚖️ Funciona com bom CUSTO-BENEFÍCIO.\n" +
                        "🏦 Ex: 'Se já tem dívida, não conceder novo empréstimo'.\n\n" +

                        "💡 EXEMPLO DIDÁTICO:\n" +
                        "Um banco analisa pedidos de empréstimo.\n\n" +

                        "👤 Cliente Carlos:\n" +
                        "• Possui dívida ativa de R$ 8.000,00.\n" +
                        "• Solicitou novo empréstimo de R$ 15.000,00.\n\n" +

                        "📐 Heurística utilizada:\n" +
                        "'Se o cliente já possui dívida ativa, negar o novo empréstimo.'\n\n" +

                        "✔️ A decisão é rápida e reduz riscos.\n" +
                        "✔️ Porém, pode não ser a melhor decisão, pois Carlos poderia ter renda suficiente para pagar."
        ));

        lista.add(new Flashcard(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                "LIMITACOES_SE",
                "🧭 Pontos de Atenção",
                "📌 LIMITAÇÕES dos Sistemas Especialistas:\n" +
                        "🔧 Manutenção complexa (milhares de regras).\n" +
                        "🚫 NÃO APRENDEM sozinhos (só raciocinam sobre o inserido).\n" +
                        "🎯 Atuam em domínios RESTRITOS (especialistas, não generalistas)."
        ));

        lista.add(new Flashcard(
                "📘 Sistemas Especialistas - IA Simbólica na Prática",
                "CILADA_APRENDIZADO_SE",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA: Sistemas Especialistas APRENDEM?\n" +
                        "❌ NÃO! Só raciocinam sobre conhecimento inserido por humanos.\n" +
                        "🧠 Essa é uma das principais diferenças para Machine Learning.\n" +
                        "📌 Ex: Não funcionam para reconhecer cachorro em foto."
        ));

        // ============================================================
        // VÍDEO AULA 04: HISTÓRIA DA IA - INVERNOS E PRIMAVERAS
        // Conteúdo: Linha do tempo, Invernos, Primaveras, Mudança de Paradigma, AlexNet
        // ============================================================

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "LINHA_TEMPO_IA",
                "🧭 Cronologia Essencial",
                "📌 LINHA DO TEMPO DA IA:\n" +
                        "📅 1956 → Nascimento oficial (Dartmouth).\n" +
                        "📅 1970 → 1º INVERNO (crise/pessimismo).\n" +
                        "📅 1980 → PRIMAVERA (Sistemas Especialistas).\n" +
                        "📅 Fim 80s → 2º INVERNO.\n" +
                        "📅 1990 → Machine Learning (mudança de paradigma).\n" +
                        "📅 2012 → AlexNet (Deep Learning - Primavera atual)."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "INVERNO_IA",
                "🧭 Período de Crise",
                "📌 INVERNO da IA:\n" +
                        "❄️ Período de PESSIMISMO, corte de financiamento.\n" +
                        "😞 Promessas não cumpridas, limitações tecnológicas.\n" +
                        "🔢 OCORRERAM DOIS INVERNOS: 1970 e fim 80s/início 90s."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "PRIMAVERA_IA",
                "🧭 Período de Avanço",
                "📌 PRIMAVERA da IA:\n" +
                        "🌱 Período de OTIMISMO, investimento massivo.\n" +
                        "🚀 Avanços tecnológicos e resultados práticos.\n" +
                        "🌺 Primaveras: 1980 (Sist. Especialistas) e 2012 (Deep Learning)."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "MUDANCA_PARADIGMA_1990",
                "🧭 Revolução Conceitual",
                "📌 MUDANÇA DE PARADIGMA (1990):\n" +
                        "🔄 IA Simbólica → Machine Learning.\n" +
                        "📝 Programar CONHECIMENTO → Programar para APRENDER.\n" +
                        "🤖 Humano insere regras → Máquina gera próprio conhecimento."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "ALEXNET_2012",
                "🧭 Revolução Deep Learning",
                "📌 ALEXNET (2012):\n" +
                        "🏆 Venceu desafio ImageNet (classificação de imagens).\n" +
                        "🚀 Início da PRIMAVERA ATUAL da IA.\n" +
                        "🔑 Impulsionou o Deep Learning."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "TRES_PILARES_2012",
                "🧭 O que viabilizou 2012",
                "📌 3 PILARES que viabilizaram 2012:\n" +
                        "📐 1. Desenvolvimento Matemático (Backpropagation, CNNs).\n" +
                        "💾 2. Dados abundantes (internet).\n" +
                        "🖥️ 3. Tecnologia (GPUs/CUDA - poder computacional)."
        ));

        lista.add(new Flashcard(
                "📘 História da IA - Invernos e Primaveras",
                "CILADA_1950_VS_1956",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA: 1950 vs 1956:\n" +
                        "📅 1950 → Teste de Turing (NÃO é o marco oficial).\n" +
                        "📅 1956 → Nascimento oficial da IA (Dartmouth).\n" +
                        "⚠️ Banca pode trocar as datas!"
        ));

        // ============================================================
        // VÍDEO AULA 05: CONCEITOS DE IA, AGENTES E ARQUITETURAS
        // Conteúdo: 4 Abordagens, Agente Inteligente, Arquiteturas, Agentes com Aprendizado
        // ============================================================

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "QUATRO_ABORDAGENS_IA",
                "🧭 Definições de IA",
                "📌 4 ABORDAGENS para definir IA:\n" +
                        "🧠 Pensar como Humano (neurociência).\n" +
                        "📐 Pensar Racionalmente (lógica - IA Simbólica).\n" +
                        "🎭 Agir como Humano (Teste de Turing).\n" +
                        "🎯 Agir Racionalmente (maximiza desempenho - MAIS IMPORTANTE)."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_DEFINICAO",
                "🧭 Quem AGE",
                "📌 AGENTE em IA:\n" +
                        "👁️ Percebe o ambiente através de SENSORES.\n" +
                        "🦾 Age sobre o ambiente através de ATUADORES.\n" +
                        "🤖 Ex: Robô aspirador (sensor de presença → motor desvia)."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_RACIONAL_VS_INTELIGENTE",
                "🧭 Diferença Chave",
                "📌 RACIONAL vs INTELIGENTE:\n" +
                        "🎯 RACIONAL = maximiza função de desempenho.\n" +
                        "🧠 INTELIGENTE = Racional + APRENDIZADO + AUTONOMIA.\n" +
                        "⚠️ Racional NÃO necessariamente tem aprendizado ou autonomia."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_REATIVO_SIMPLES",
                "🧭 Sem Memória",
                "📌 AGENTE REATIVO SIMPLES:\n" +
                        "⚡ Age apenas com a PERCEPÇÃO ATUAL.\n" +
                        "❌ NÃO TEM MEMÓRIA.\n" +
                        "✅ Exige ambiente TOTALMENTE OBSERVÁVEL.\n" +
                        "♟️ Ex: IA de xadrez (histórico não importa)."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_BASEADO_MODELO",
                "🧭 Com Memória",
                "📌 AGENTE BASEADO EM MODELO:\n" +
                        "✅ TEM MEMÓRIA.\n" +
                        "📊 Mantém modelo do mundo (como evolui e como ações afetam).\n" +
                        "🧹 Ex: Robô que sabe que 'sujeira se acumula a cada 2 dias'."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_BASEADO_OBJETIVO",
                "🧭 Planejamento",
                "📌 AGENTE BASEADO EM OBJETIVO:\n" +
                        "🎯 Planeja ações para atingir um OBJETIVO.\n" +
                        "⚠️ PODE SER INEFICIENTE (só importa cumprir a meta).\n" +
                        "🧹 Ex: Robô que quer limpar TODA a casa."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_BASEADO_UTILIDADE",
                "🧭 Otimização",
                "📌 AGENTE BASEADO EM UTILIDADE:\n" +
                        "📈 Escolhe ação que MAXIMIZA a utilidade (melhor caminho).\n" +
                        "🏆 Dentre todos que cumprem o objetivo, escolhe o MELHOR.\n" +
                        "🧹 Ex: Robô que limpa a casa da forma MAIS EFICIENTE."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "AGENTE_APRENDIZADO_COMPONENTES",
                "🧭 Elementos do Agente",
                "📌 AGENTE com APRENDIZADO - 4 Componentes:\n" +
                        "⚡ Elemento de Desempenho (o agente em si).\n" +
                        "📈 Elemento de Aprendizado (ajusta parâmetros).\n" +
                        "⚖️ Elemento Crítico (compara resultado com o esperado).\n" +
                        "🎲 Gerador de Problemas (insere ALEATORIEDADE para EXPLORAR)."
        ));

        lista.add(new Flashcard(
                "📘 Conceitos de IA, Agentes e Arquiteturas",
                "CILADA_IA_VS_ML",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA: IA vs Machine Learning:\n" +
                        "🤖 IA = uma das 4 abordagens (Pensar/Agir como Humano/Racionalmente).\n" +
                        "📊 ML = sistema que pondera, aprende e age.\n" +
                        "⚠️ Banca pode dar definição de ML como se fosse de IA (É FALSO!)."
        ));

        // ============================================================
        // VÍDEO AULA 06: FILOSOFIA DA IA
        // Conteúdo: Capacidades (Fraca/Forte/AGI/Super), Teste de Turing, Estágios
        // ============================================================

        lista.add(new Flashcard(
                "📘 Filosofia da IA - Capacidades e Estágios",
                "IA_FRACA_VS_FORTE",
                "🧭 Simular vs Atingir",
                "📌 IA FRACA vs IA FORTE (John Searle):\n" +
                        "🛠️ FRACA: SIMULA o raciocínio humano (ferramenta, tarefas específicas).\n" +
                        "🧠 FORTE: ATINGE estado cognitivo (tem consciência, crenças, intenções)."
        ));

        lista.add(new Flashcard(
                "📘 Filosofia da IA - Capacidades e Estágios",
                "AGI_E_SUPERINTELIGENCIA",
                "🧭 Evoluções Modernas",
                "📌 AGI e SUPERINTELIGÊNCIA:\n" +
                        "🎯 AGI: Ampla gama de tarefas, SEM exigir consciência (evolução da Forte).\n" +
                        "🚀 SUPERINTELIGÊNCIA (ASI): Intelecto muito acima do humano em TUDO.\n" +
                        "🦍 Gorila Problem: Superinteligência poderia nos eliminar sem percebermos."
        ));

        lista.add(new Flashcard(
                "📘 Filosofia da IA - Capacidades e Estágios",
                "TESTE_TURING",
                "🧭 Agir como Humano",
                "📌 TESTE DE TURING (1950 - Alan Turing):\n" +
                        "🎭 Jogo da Imitação - máquina passa se humano NÃO a distinguir.\n" +
                        "🗣️ Testa AGIR como humano (NÃO pensar).\n" +
                        "📋 Precisa de: PLN + Representação do Conhecimento + Raciocínio + Aprendizado."
        ));

        lista.add(new Flashcard(
                "📘 Filosofia da IA - Capacidades e Estágios",
                "ESTAGIOS_DESENVOLVIMENTO_IA",
                "🧭 Linha Evolutiva",
                "📌 4 ESTÁGIOS de desenvolvimento da IA:\n" +
                        "♟️ 1. REATIVA: Sem memória (ex: IA de xadrez).\n" +
                        "📱 2. MEMÓRIA LIMITADA: IA atual (ChatGPT, carros autônomos).\n" +
                        "🧠 3. TEORIA DA MENTE: Compreende emoções/intenções (NÃO alcançado).\n" +
                        "🌟 4. AUTOCONSCIENTE: Tem autoconsciência (NÃO alcançado)."
        ));

        lista.add(new Flashcard(
                "📘 Filosofia da IA - Capacidades e Estágios",
                "CILADA_TESTE_TURING",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA sobre Teste de Turing:\n" +
                        "❌ Testa PENSAR como humano? NÃO! Testa AGIR.\n" +
                        "👁️ Precisa de VISÃO COMPUTACIONAL? NÃO! É CEGO (só texto).\n" +
                        "⚠️ 1950 é marco do Teste de Turing, NÃO da IA (que é 1956)."
        ));

        // ============================================================
        // VÍDEO AULA 07: ÉTICA DA INTELIGÊNCIA ARTIFICIAL
        // Conteúdo: IA Explicável (XAI), Viés (Bias), IA Responsável, FAT(E)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "IA_EXPLICAVEL_XAI",
                "🧭 Transparência",
                "📌 IA EXPLICÁVEL (XAI - Explainable AI):\n" +
                        "🔍 Sistemas que explicam e justificam suas decisões.\n" +
                        "📋 Permite auditoria, gera confiança, exigida por lei.\n" +
                        "⚫ OPOSTO: Caixa Preta (entrada → operação desconhecida → saída).\n" +
                        "✅ Critérios: Compreensível, Precisa, Completa, Específica."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "IA_ENVIESADA_BIAS",
                "🧭 Preconceito Algorítmico",
                "📌 VIÉS (BIAS) em IA:\n" +
                        "⚠️ Resultados tendenciosos/discriminatórios.\n" +
                        "📊 Origem: Dados de treinamento enviesados OU algoritmo mal projetado.\n" +
                        "🔄 Amplifica preconceitos do mundo real.\n" +
                        "🛡️ Combate: Dados diversos + revisões regulares + supervisão humana."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "IA_RESPONSAVEL",
                "🧭 Pessoas no Centro",
                "📌 IA RESPONSÁVEL (Responsible AI):\n" +
                        "⚖️ Desenvolvimento ético, seguro e que respeita direitos humanos.\n" +
                        "👥 PESSOAS no centro das decisões (NÃO a tecnologia).\n" +
                        "🔄 Ciclo: Desde a concepção até a desativação.\n" +
                        "🔑 DIFERENÇA: Responsável = é JUSTO; Explicável = MOSTRA COMO decidiu."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "PILAR_FAT_FATE",
                "🧭 Acrônimo Essencial",
                "📌 PILAR FAT(E) da Ética em IA:\n" +
                        "⚖️ F = Fairness (Justiça/Equidade) - ser imparcial.\n" +
                        "👤 A = Accountability (Responsabilização) - CRIADORES respondem.\n" +
                        "🔍 T = Transparency (Transparência) - mostrar COMO funciona.\n" +
                        "🌟 E = Ethics (Ética) - PILAR CENTRAL (norteia todos os outros)."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "ACCOUNTABILITY_IA",
                "🧭 Quem é o Responsável?",
                "📌 ACCOUNTABILITY (Responsabilização):\n" +
                        "👨‍💻 Os CRIADORES/DESENVOLVEDORES são os responsáveis.\n" +
                        "❌ A IA NÃO responde por si mesma legalmente.\n" +
                        "⚖️ Criadores devem assumir responsabilidade pelos impactos."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "CILADA_XAI_VS_RESPONSAVEL",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA: IA Explicável vs IA Responsável:\n" +
                        "❌ São sinônimos? NÃO!\n" +
                        "🔍 XAI = COMO decidiu (transparência do processo).\n" +
                        "⚖️ Responsável = SE é ético/justo (respeito às pessoas).\n" +
                        "✅ Uma IA pode ser responsável mas NÃO explicável (justa, mas opaca)."
        ));

        lista.add(new Flashcard(
                "📘 Ética da Inteligência Artificial",
                "CILADA_BIAS_INCAPACIDADE",
                "🧭 Antídotos para Ciladas",
                "📌 CILADA sobre Viés:\n" +
                        "❌ Viés = incapacidade de aprender? NÃO!\n" +
                        "📊 Viés = aprendeu com dados RUINS (tendenciosos).\n" +
                        "🚫 NÃO se autotreinam para eliminar viés (requer supervisão humana)."
        ));

        return lista;
    }
}
