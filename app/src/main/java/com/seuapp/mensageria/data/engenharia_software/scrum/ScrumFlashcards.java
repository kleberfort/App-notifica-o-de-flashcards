package com.seuapp.mensageria.data.engenharia_software.scrum;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ScrumFlashcards {

    //"012345678901234567890123456789\n" //ate 32 caracteres por linha e no máximo 10 linhas

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =========================
        // SCRUM - CONCEITOS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "SCRUM_CONCEITO",
                "🧭 Scrum - Conceitos",
                "📌 O que é SCRUM:\n" +
                        "🟢 Framework (não metodologia), foco em gestão (pessoas, produtos e processos), empírico (baseado em experiência), criado para problemas COMPLEXOS.\n" +
                        "💡 É simples de entender e difícil de aplicar.\n" +
                        "🔄 Iterativo e incremental."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "SCRUM_CYNEFIN",
                "🧭 Scrum - Conceitos",
                "📌 Teoria da Complexidade (Cynefin):\n" +
                        "🔹 DOMÍNIO COMPLEXO: causa/efeito só vista retrospectivamente (com feedback). Scrum foi criado para este domínio.\n" +
                        "❌ NÃO usar Scrum em: Simples (use Cascata), Complicado (use regras claras), Caótico (aja para estabilizar)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "SCRUM_VS_TRADICIONAL",
                "🧭 Scrum - Conceitos",
                "📌 SCRUM vs Abordagens Tradicionais:\n" +
                        "🟢 SCRUM: Empírico, adapta-se a mudanças, guia leve (~20 págs).\n" +
                        "🔴 TRADICIONAL: Prescritivo, segue plano fixo, documentação pesada (ex: PMBOK 500+ págs)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "SCRUM_CILADAS_CONCEITO",
                "🧭 Scrum - Conceitos",
                "📌 Principais CILADAS:\n" +
                        "❌ Scrum é metodologia → ✅ É FRAMEWORK.\n" +
                        "❌ Scrum é fácil aplicar → ✅ Difícil na prática.\n" +
                        "❌ Serve p/ qualquer projeto → ✅ Só p/ COMPLEXOS.\n" +
                        "❌ Scrum = XP → ✅ Scrum é GESTÃO, XP é ENGENHARIA.\n" +
                        "❌ PMBOK é leve como Scrum → ✅ PMBOK é PESADO."
        ));

        // =========================
        // SCRUM - PAPÉIS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_PO",
                "🧭 Scrum - Papéis",
                "📌 Product Owner (PO):\n" +
                        "🟢 Dono do Produto, Maximiza VALOR.\n" +
                        "📑 ATRIBUTOS: Uma ÚNICA pessoa (não comitê), disponível p/ equipe, entende do produto/negócio.\n" +
                        "🔨 FAZ: criar/manter/priorizar Product Backlog, decide release, CANCELA a Sprint, remove dúvidas, define Definition of Done."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_PO_REGRA_OURO",
                "🧭 Scrum - Papéis",
                "📌 PO - REGRA DE OURO:\n" +
                        "⚡『 QUEM ESTIMA É QUEM FAZ 』\n" +
                        "📌 RESPONSABILIDADES:\n" +
                        "✅ PO define: O QUÊ e o PORQUÊ.\n" +
                        "✅ Time define: COMO e QUANTO.\n" +
                        "❌ PO NÃO FAZ: Estimar esforço, remover impedimentos, definir tarefas técnicas."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_TIME",
                "🧭 Scrum - Papéis",
                "📌 Time de Desenvolvimento:\n" +
                        "🔄 Transforma itens do PB em Incremento 'Pronto'.\n" +
                        "👥 Tamanho ideal: 3 a 9 pessoas.\n" +
                        "📑 ATRIBUTOS: Multifuncional, Auto-Organizado, sem títulos/rótulos, todos são 'Desenvolvedores'."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_TIME_RESP",
                "🧭 Scrum - Papéis",
                "📌 Time Dev - RESPONSABILIDADES:\n" +
                        "🔨 FAZ: Decide o COMO; Estima esforço dos itens; Desenvolve o Incremento; Atinge a META da Sprint; IDENTIFICA impedimentos.\n" +
                        "❌ NÃO FAZ: Remover impedimentos (é do SM)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_SM",
                "🧭 Scrum - Papéis",
                "📌 Scrum Master (SM):\n" +
                        "🎯 Gestor do PROCESSO / Coach do Time.\n" +
                        "🔨 RESPONSABILIDADES: REMOVE impedimentos; Garante uso correto do Scrum; Facilita cerimônias; Protege a equipe (escudo); Coach do PO e do Time."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "PAPEL_SM_PROIBICOES",
                "🧭 Scrum - Papéis",
                "📌 SM - PROIBIÇÕES:\n" +
                        "🚫 NUNCA acumular com PO (conflito grave).\n" +
                        "🚫 Não é gerente da equipe.\n" +
                        "🚫 Não define prioridades.\n" +
                        "🚫 Não desenvolve código (se papel dedicado).\n" +
                        "📌 DIFERENÇA CRUCIAL: Time IDENTIFICA impedimentos; SM REMOVE impedimentos."
        ));

        // =========================
        // SCRUM - ARTEFATOS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_PB",
                "🧭 Scrum - Artefatos",
                "📌 Product Backlog (PB):\n" +
                        "📋 Lista ÚNICA, ORDENADA e VIVA do produto.\n" +
                        "👤 DONO: Product Owner (exclusivo).\n" +
                        "📦 CONTÉM: funcionalidades, bugs, melhorias, tarefas técnicas.\n" +
                        "❌ NÃO: backlogs paralelos."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_PB_CARACTERISTICAS",
                "🧭 Scrum - Artefatos",
                "📌 PB - CARACTERÍSTICAS:\n" +
                        "🔹 ORDENADO: itens mais valiosos no TOPO.\n" +
                        "🔹 VIVO: PO altera a qualquer momento.\n" +
                        "🔹 DETALHAMENTO PROGRESSIVO: topo detalhado, fundo granularidade grossa.\n" +
                        "⚠️ EXCEÇÃO: itens na Sprint em andamento NÃO podem ser alterados (se afetar a META)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_SB",
                "🧭 Scrum - Artefatos",
                "📌 Sprint Backlog:\n" +
                        "📋 Plano da SPRINT (escopo: uma Sprint).\n" +
                        "👤 DONO: Time de Desenvolvimento (exclusivo).\n" +
                        "📦 CONTÉM: itens do PB selecionados + tarefas técnicas (o COMO).\n" +
                        "🔄 Pode ser alterado DURANTE a Sprint pelo Time.\n" +
                        "❌ NÃO contém funcionalidades (isso é PB)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_DOD",
                "🧭 Scrum - Artefatos",
                "📌 Definition of Done (DoD):\n" +
                        "✅ Acordo de CRITÉRIOS DE QUALIDADE.\n" +
                        "👥 DEFINIDO POR: Time Dev + Product Owner.\n" +
                        "📝 EXEMPLOS: Código revisado; Testes automatizados passando; Documentação atualizada; Aceite do PO."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_INCREMENTO_META",
                "🧭 Scrum - Artefatos",
                "📌 INCREMENTO e META da SPRINT:\n" +
                        "📦 INCREMENTO: Soma da Sprint atual + Sprints anteriores; Deve estar 'Pronto' (DoD); Utilizável e potencialmente implantável.\n" +
                        "🎯 META DA SPRINT: Objetivo de NEGÓCIO da Sprint; Imutável durante a Sprint; Só PO pode CANCELAR se perder sentido."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ARTEFATO_BURNDOWN",
                "🧭 Scrum - Artefatos",
                "📌 Burndown Chart (OPCIONAL):\n" +
                        "📊 Gráfico de progresso do trabalho restante.\n" +
                        "📐 INTERPRETAÇÃO: Linha REAL ABAIXO da ideal → ADIANTADO; Linha REAL ACIMA da ideal → ATRASADO; Linha REAL HORIZONTAL → sem progresso.\n" +
                        "⚠️ NÃO é artefato obrigatório do Scrum Guide."
        ));

        // =========================
        // SCRUM - ESTIMATIVAS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ESTIMATIVA_CONCEITO",
                "🧭 Scrum - Estimativas",
                "📌 Estimativas Ágeis:\n" +
                        "🎯 Filosofia: ACUIDADE relativa (não precisão falsa).\n" +
                        "📏 UNIDADES: Story Points (unidade RELATIVA), T-Shirt Sizing (P, M, G, GG).\n" +
                        "❌ NÃO é: horas de trabalho (1 ponto ≠ 8h)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ESTIMATIVA_PLANNING_POKER",
                "🧭 Scrum - Estimativas",
                "📌 Planning Poker:\n" +
                        "🃏 Técnica consensual de estimativa.\n" +
                        "🎲 COMO FUNCIONA: 1. Time discute o item; 2. Cada Dev escolhe carta (Fibonacci: 1,2,3,5,8,13...); 3. Revelam simultaneamente; 4. Extremos argumentam; 5. Repete até consenso.\n" +
                        "⚠️ NÃO é cerimônia obrigatória do Scrum."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ESTIMATIVA_VELOCIDADE",
                "🧭 Scrum - Estimativas",
                "📌 VELOCIDADE (Velocity):\n" +
                        "📈 Média de Story Points entregues 'prontos' por Sprint.\n" +
                        "📊 USO: guia para planejar próxima Sprint. Ex: Velocidade = 30 pontos → planejar ~30 pontos.\n" +
                        "🚫 NÃO COMPARAR velocidades entre times diferentes! 40 pts do Time A ≠ 40 pts do Time B. Escala é SUBJETIVA e própria de cada time."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "ESTIMATIVA_USER_STORIES",
                "🧭 Scrum - Estimativas",
                "📌 User Stories (Histórias de Usuário):\n" +
                        "📝 Template padrão: 『 Como [PERSONA], eu quero [AÇÃO], para [BENEFÍCIO] 』\n" +
                        "📌 EXEMPLO: 'Como CLIENTE, quero FAZER LOGIN, para ACESSAR MINHAS INFORMAÇÕES'\n" +
                        "🎯 Propósito: é um CARTÃO DE CONVERSAÇÃO. Não substitui documentação pesada."
        ));

        // =========================
        // SCRUM - EVENTOS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_SPRINT",
                "🧭 Scrum - Eventos",
                "📌 A SPRINT:\n" +
                        "⏱️ Coração do Scrum - ciclo de 1 a 4 semanas (FIXO).\n" +
                        "📋 CARACTERÍSTICAS: Timebox FIXO; CONTÍNUA (sem intervalos); Meta imutável (ou cancela); Abriga TODOS os outros eventos.\n" +
                        "❌ Duração > 4 semanas → NÃO é Scrum. Só PO pode CANCELAR a Sprint."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_PLANNING",
                "🧭 Scrum - Eventos",
                "📌 Sprint Planning:\n" +
                        "📅 Planejamento da Sprint (início da Sprint).\n" +
                        "⏱️ TIMEBOX: máx 8h (Sprint 4 sem) / proporcional.\n" +
                        "📋 DUAS PARTES: 1️⃣ O QUÊ? (PO lidera) → define META; 2️⃣ COMO? (Time lidera) → cria SPRINT BACKLOG.\n" +
                        "📦 RESULTADOS: Meta da Sprint + Sprint Backlog. 👥 Participa: TODO Time Scrum."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_DAILY",
                "🧭 Scrum - Eventos",
                "📌 Daily Scrum:\n" +
                        "☀️ Reunião DIÁRIA de 15min (máximo).\n" +
                        "👥 Participação OBRIGATÓRIA: Só Time Dev. PO e SM: opcionais (observadores).\n" +
                        "❓ 3 PERGUNTAS (guia): 1. O que fiz ONTEM?; 2. O que farei HOJE?; 3. Há IMPEDIMENTOS?\n" +
                        "❌ NÃO é: status report, reunião de resolução de problemas."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_REVIEW",
                "🧭 Scrum - Eventos",
                "📌 Sprint Review:\n" +
                        "🎬 Demonstração e feedback do PRODUTO (fim da Sprint).\n" +
                        "⏱️ TIMEBOX: máx 4h (Sprint 4 sem) / proporcional.\n" +
                        "👥 Participantes: Time Scrum + STAKEHOLDERS.\n" +
                        "🎯 Atividade central: Demo funcional do Incremento.\n" +
                        "📦 RESULTADO: Product Backlog revisado. ❌ NÃO é reunião de status."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_RETROSPECTIVE",
                "🧭 Scrum - Eventos",
                "📌 Sprint Retrospective:\n" +
                        "🔧 Melhoria do PROCESSO (fim da Sprint).\n" +
                        "⏱️ TIMEBOX: máx 3h (Sprint 4 sem) / proporcional.\n" +
                        "👥 Participantes: APENAS Time Scrum (fechado). ❌ Stakeholders NÃO participam.\n" +
                        "❓ PERGUNTAS: O que funcionou bem?; O que podemos melhorar?; O que experimentar na próxima Sprint?\n" +
                        "📦 RESULTADO: Plano de ação c/ melhorias."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "EVENTO_ORDEM",
                "🧭 Scrum - Eventos",
                "📌 ORDEM dos EVENTOS (fim da Sprint):\n" +
                        "1️⃣ SPRINT REVIEW (inspeciona o PRODUTO)\n" +
                        "2️⃣ SPRINT RETROSPECTIVE (melhora o PROCESSO)\n" +
                        "3️⃣ (FIM da Sprint)\n" +
                        "4️⃣ SPRINT PLANNING (próxima Sprint)"
        ));

        // =========================
        // SCRUM - COMPARAÇÕES
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "COMPARA_SCRUM_XP",
                "🧭 Scrum - Comparações",
                "📌 SCRUM vs XP:\n" +
                        "🟢 SCRUM: Framework de GESTÃO. Foco: pessoas, produtos, processos.\n" +
                        "🔵 XP (Extreme Programming): Método de ENGENHARIA. Foco: TDD, CI, Pair Programming.\n" +
                        "💡 São COMPLEMENTARES (usados juntos)."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "COMPARA_SCRUM_KANBAN",
                "🧭 Scrum - Comparações",
                "📌 SCRUM vs KANBAN:\n" +
                        "🟢 SCRUM: Framework; Unidade: Sprint (1-4 semanas); Limita por TEMPO; Papéis: PO, SM, Dev.\n" +
                        "🟡 KANBAN: Método de fluxo; Unidade: Contínuo; Limita por QTD (WIP); NÃO define papéis."
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "COMPARA_KANBAN",
                "🧭 Scrum - Comparações",
                "📌 KANBAN - Fundamentos:\n" +
                        "🎯 Método de gestão de FLUXO DE TRABALHO VISUAL.\n" +
                        "🏭 ORIGEM: Sistema Toyota de Produção (Japão).\n" +
                        "❌ NÃO é processo de desenvolvimento de software.\n" +
                        "🔑 PRINCÍPIOS: 1. Visualizar o Fluxo; 2. Limitar WIP; 3. Gerenciar o Fluxo; 4. Melhoria Contínua."
        ));

        // =========================
        // SCRUM - RESUMO
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "RESUMO_QUEM_FAZ",
                "🧭 Scrum - Resumo",
                "📌 QUEM FAZ O QUÊ? (RESUMÃO):\n" +
                        "👤 Gerenciar PB → PO\n" +
                        "👥 Gerenciar SB → Time Dev\n" +
                        "📊 Estimar esforço → Time Dev\n" +
                        "🔧 Remover impedimentos → SM\n" +
                        "❌ Cancelar Sprint → PO\n" +
                        "📋 Priorizar PB → PO\n" +
                        "☀️ Facilitar Daily → Time Dev (auto-organizado)\n" +
                        "✅ Definition of DoD → Time Dev + PO"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "RESUMO_CILADAS_MORAIS",
                "🧭 Scrum - Resumo",
                "📌 CILADAS MORAIS (DECORE!):\n" +
                        "❌ 'Scrum é metodologia' → ✅ É FRAMEWORK\n" +
                        "❌ '1 Story Point = 8 horas' → ✅ Unidade RELATIVA\n" +
                        "❌ 'Comparar velocidades entre times' → ✅ NÃO COMPARAR\n" +
                        "❌ 'Time pode ter títulos (Arquiteto)' → ✅ Todos são DEV\n" +
                        "❌ 'SM conduz a Daily' → ✅ Time se AUTO-ORGANIZA\n" +
                        "❌ 'PO define estimativa' → ✅ Time ESTIMA\n" +
                        "❌ 'Sprint pode ter 6 semanas' → ✅ Máx 4 semanas"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia de Software",
                "RESUMO_REGRAS_OURO",
                "🧭 Scrum - Resumo",
                "📌 REGRAS DE OURO (GUARDE!):\n" +
                        "🥇 'QUEM ESTIMA É QUEM FAZ' → Time Dev estima\n" +
                        "🥈 'PO define o QUÊ e PORQUÊ, Time define COMO'\n" +
                        "🥉 'Sprint Backlog é do Time, PB é do PO'\n" +
                        "🏅 'Apenas PO pode CANCELAR a Sprint'\n" +
                        "🎯 'Daily é do Time Dev (PO e SM opcionais)'\n" +
                        "📊 'Review = PRODUTO, Retrospective = PROCESSO'"
        ));

        return lista;
    }
}