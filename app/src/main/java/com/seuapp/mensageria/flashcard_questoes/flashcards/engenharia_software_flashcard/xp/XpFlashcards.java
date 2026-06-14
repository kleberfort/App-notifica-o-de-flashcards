package com.seuapp.mensageria.flashcard_questoes.flashcards.engenharia_software_flashcard.xp;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class XpFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =========================
        // XP - CONCEITOS FUNDAMENTAIS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_CONCEITO",
                "⚡ XP - O que é?",
                "📌 O que é Extreme Programming?\n" +
                        "Metodologia ágil para equipes pequenas e médias " +
                        "Indicado para requisitos VAGOS e em constante MUDANÇA " +
                        "Criado por Kent Beck"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_CRIADOR",
                "⚡ XP - Criador",
                "📌 Quem criou o XP?\n" +
                        "Kent Beck " +
                        "Projeto C3 (Chrysler) Folha de pagamento em Smalltalk " +
                        "Primeiro projeto XP falhou!"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_SIGNIFICADO_NOME",
                "⚡ XP - Significado do nome",
                "📌 O que significa o nome\n" +
                        "'Extreme Programming'? Leva boas práticas conhecidas ao EXTREMO " +
                        "Ex: se testar é bom,testa-se TODA HORA"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_PROJETO_C3",
                "⚡ XP - Projeto C3",
                "📌 O primeiro projeto XP (C3)\n" +
                        "foi um sucesso?\n" +
                        "NÃO! FALHOU\n" +
                        "Migração de Cobol para Smalltalk\n" +
                        "Lição: XP não é garantia\n" +
                        "de sucesso"
        ));

        // =========================
        // ATIVIDADES BÁSICAS DO XP
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_ATIVIDADES_BASICAS",
                "⚡ XP - Atividades Básicas",
                "📌 Quais as 4 atividades\n" +
                        "básicas do XP? (PT PO)\n" +
                        "1. Programar\n" +
                        "2. Testar\n" +
                        "3. Projetar (design)\n" +
                        "4. Ouvir (o cliente)"
        ));

        // =========================
        // VALORES DO XP
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_VALORES",
                "💎 XP - 5 Valores",
                "📌 Quais são os 5 valores do XP?\n" +
                        "1. Comunicação\n" +
                        "2. Simplicidade (KISS)\n" +
                        "3. Feedback\n" +
                        "4. Coragem\n" +
                        "5. Respeito"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_VALOR_CORAGEM",
                "💎 XP - Valor Coragem",
                "📌 Qual valor do XP está\n" +
                        "associado a 'dizer a verdade\n" +
                        "ao cliente sobre prazos'?\n" +
                        "CORAGEM\n" +
                        "Ser honesto sobre dificuldades\n" +
                        "e estimativas"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_VALORES_COMPARACAO",
                "💎 XP x Scrum - Valores",
                "📌 Valor exclusivo do XP?\n" +
                        "Comunicação, Simplicidade,\n" +
                        "Feedback\n" +
                        "Valores comuns:\n" +
                        "Coragem e Respeito (também no Scrum)"
        ));

        // =========================
        // PRÁTICAS DO XP (MAIS COBRADAS)
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_TDD",
                "🧪 XP - TDD",
                "📌 O que é TDD no XP?\n" +
                        "Test Driven Development\n" +
                        "Escreve-se o TESTE ANTES\n" +
                        "do código funcional\n" +
                        "Feedback imediato\n" +
                        "Refatoração segura"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_PAIR_PROGRAMMING",
                "👥 XP - Pair Programming",
                "📌 O que é Pair Programming?\n" +
                        "Dois programadores no mesmo\n" +
                        "computador\n" +
                        "Piloto (escreve) e Copiloto (revisa)\n" +
                        "Mais eficaz com níveis SIMILARES"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_REFACTORING",
                "🔧 XP - Refatoração",
                "📌 O que é Refatoração no XP?\n" +
                        "Melhorar a estrutura interna\n" +
                        "do código SEM alterar\n" +
                        "comportamento externo\n" +
                        "Remove redundâncias\n" +
                        "SÓ é segura com testes automatizados"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_REFACTORING_NAO",
                "🔧 Refatoração - O que NÃO é",
                "📌 O que refatoração NÃO é?\n" +
                        "• Adicionar novas funcionalidades\n" +
                        "• Corrigir bugs (debugging)\n" +
                        "• Mudar o resultado do programa\n" +
                        "Mantém comportamento externo"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_SIMPLE_DESIGN",
                "🎯 XP - Simple Design",
                "📌 O que é Simple Design no XP?\n" +
                        "Código sempre na forma\n" +
                        "MAIS SIMPLES que passa\n" +
                        "em todos os testes\n" +
                        "Evita 'overdesign'\n" +
                        "Princípio KISS"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_INTEGRACAO_CONTINUA",
                "🔄 XP - Integração Contínua",
                "📌 O que é Integração Contínua?\n" +
                        "Cada commit gera BUILD,\n" +
                        "testes automatizados e análise\n" +
                        "Builds FREQUENTES (não 'diário')\n" +
                        "Se falhar, o build QUEBRA"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_PROPRIEDADE_COLETIVA",
                "🏢 XP - Propriedade Coletiva",
                "📌 O que é propriedade coletiva\n" +
                        "do código no XP?\n" +
                        "TODOS podem mexer em\n" +
                        "qualquer parte do código\n" +
                        "Ninguém é 'dono' de um módulo\n" +
                        "Evita ilhas de expertise"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_RITMO_SUSTENTAVEL",
                "⏰ XP - Ritmo Sustentável",
                "📌 O que é ritmo sustentável?\n" +
                        "Máximo de 40 horas/semana\n" +
                        "Horas extras só excepcionais\n" +
                        "Evita burnout da equipe"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_CLIENTE_PRESENTE",
                "👤 XP - Cliente Sempre Presente",
                "📌 O que é a prática\n" +
                        "'cliente sempre presente'?\n" +
                        "Cliente fisicamente junto\n" +
                        "da equipe (ideal)\n" +
                        "Disponível integralmente\n" +
                        "Prioriza requisitos"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_PLANNING_POKER",
                "🎲 XP - Planning Poker",
                "📌 O que é Planning Poker?\n" +
                        "Técnica de estimativa\n" +
                        "Cartas: 1,2,3,5,8,13,21,?\n" +
                        "Estimativa em PONTOS\n" +
                        "(complexidade, NÃO semanas)\n" +
                        "Velocidade média = histórico"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_USER_STORIES",
                "📝 XP - User Stories",
                "📌 O que são user stories no XP?\n" +
                        "Requisitos como cenários\n" +
                        "Estrutura: quem, o quê, por quê\n" +
                        "NÃO são casos de uso!\n" +
                        "O 'como fazer' fica para a equipe"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_STAND_UP",
                "🚶 XP - Stand Up Meetings",
                "📌 O que são stand up meetings?\n" +
                        "Reuniões diárias em PÉ\n" +
                        "Máximo 15 minutos\n" +
                        "Feedback rápido da equipe"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_SMALL_RELEASES",
                "📦 XP - Small Releases",
                "📌 O que são small releases?\n" +
                        "Ciclos curtos (2 a 4 semanas)\n" +
                        "Working software ao final\n" +
                        "Software FUNCIONANDO\n" +
                        "a cada release"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_METAFORA",
                "📖 XP - Metáfora",
                "📌 O que é a prática 'Metáfora'?\n" +
                        "História/analogia que todos\n" +
                        "(stakeholders) entendem\n" +
                        "Facilita a comunicação"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_CODE_CONVENTIONS",
                "📏 XP - Padrões de Codificação",
                "📌 O que são code conventions?\n" +
                        "Padrões de codificação\n" +
                        "consistentes\n" +
                        "Ferramentas: Checkstyle, PMD,\n" +
                        "ESLint, PyLint, Sonar"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_BOY_SCOUT",
                "🏕️ XP - Regra do Escoteiro",
                "📌 O que é a Boy Scout Rule?\n" +
                        "Deixe o código mais LIMPO\n" +
                        "do que você encontrou\n" +
                        "Relacionada à propriedade coletiva"
        ));

        // =========================
        // TÉCNICAS DE REFATORAÇÃO
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_PULL_UP_METHOD",
                "⬆️ Refatoração - Pull Up Method",
                "📌 O que é Pull Up Method?\n" +
                        "Técnica de refatoração\n" +
                        "Move um método da classe filha\n" +
                        "para a SUPERCLASSE\n" +
                        "Quando filhas compartilham\n" +
                        "o mesmo método"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_EXTRACT_METHOD",
                "✂️ Refatoração - Extract Method",
                "📌 O que é Extract Method?\n" +
                        "Técnica de refatoração\n" +
                        "Extrai um trecho de código\n" +
                        "para um NOVO MÉTODO\n" +
                        "dentro da mesma classe"
        ));

        // =========================
        // XP vs SCRUM
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_VS_SCRUM",
                "⚔️ XP x Scrum",
                "📌 Qual a principal diferença\n" +
                        "entre XP e Scrum?\n" +
                        "XP = práticas TÉCNICAS\n" +
                        "(engenharia de software)\n" +
                        "Scrum = práticas de GESTÃO\n" +
                        "Na prática são complementares!"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "XP_APLICABILIDADE",
                "⚔️ XP x Scrum - Aplicabilidade",
                "📌 O XP pode ser usado em\n" +
                        "uma clínica dentária?\n" +
                        "NÃO!\n" +
                        "XP é para desenvolvimento\n" +
                        "de SOFTWARE\n" +
                        "Scrum pode ser usado em qualquer área"
        ));

        // =========================
        // MANIFESTO ÁGIL
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "MANIFESTO_AGIL_VALORES",
                "📜 Manifesto Ágil - 4 Valores",
                "📌 Quais os 4 valores do\n" +
                        "Manifesto Ágil?\n" +
                        "1. Indivíduos > processos\n" +
                        "2. Software funcionando > docs\n" +
                        "3. Colaboração > contratos\n" +
                        "4. Responder mudanças > plano"
        ));

        // =========================
        // PRINCIPAIS CILADAS
        // =========================

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_HORA_EXTRA",
                "⚠️ Cilada - Hora Extra no XP",
                "📌 O XP tolera grandes volumes\n" +
                        "de hora extra?\n" +
                        "NÃO!\n" +
                        "XP prega RITMO SUSTENTÁVEL\n" +
                        "Máximo 40 horas/semana\n" +
                        "Horas extras são EXCEÇÃO"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_MEDIDO_SEMANAS",
                "⚠️ Cilada - Medido em Semanas",
                "📌 No XP, uma user story\n" +
                        "é medida em semanas?\n" +
                        "NÃO!\n" +
                        "É medida em PONTOS de\n" +
                        "complexidade (1,2,3,5,8...)\n" +
                        "NÃO em tempo"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_BUILDS_DIARIOS",
                "⚠️ Cilada - Builds Diários",
                "📌 Integração contínua exige\n" +
                        "builds diários obrigatórios?\n" +
                        "Exige builds FREQUENTES\n" +
                        "'Diário' pode ser considerado\n" +
                        "errado por algumas bancas"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_CASOS_USO",
                "⚠️ Cilada - Casos de Uso",
                "📌 O XP usa casos de uso\n" +
                        "para requisitos?\n" +
                        "NÃO!\n" +
                        "Usa USER STORIES (histórias)\n" +
                        "Casos de uso = técnica pesada"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_DOCUMENTACAO",
                "⚠️ Cilada - Documentação no XP",
                "📌 O XP exige documentação\n" +
                        "extensiva em todas as fases?\n" +
                        "NÃO!\n" +
                        "XP é LEVE em documentação\n" +
                        "Prioriza código e comunicação"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_PAPEIS_ESPECIALIZADOS",
                "⚠️ Cilada - Papéis Especializados",
                "📌 O XP divide a equipe por\n" +
                        "papéis especializados?\n" +
                        "NÃO!\n" +
                        "Todos são desenvolvedores\n" +
                        "Propriedade coletiva do código"
        ));

        lista.add(new Flashcard(
                "📘 Engenharia Software",
                "CILADA_PAIR_NIVEIS",
                "⚠️ Cilada - Pair Programming",
                "📌 Pair programming funciona\n" +
                        "bem com níveis muito diferentes?\n" +
                        "NÃO!\n" +
                        "É mais eficaz com níveis\n" +
                        "SIMILARES (sênior + sênior)"
        ));

        return lista;
    }
}
