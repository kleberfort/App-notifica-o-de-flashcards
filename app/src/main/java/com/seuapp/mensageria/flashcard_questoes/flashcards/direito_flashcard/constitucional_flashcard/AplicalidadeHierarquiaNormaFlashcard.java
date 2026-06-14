package com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.constitucional_flashcard;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class AplicalidadeHierarquiaNormaFlashcard {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ============================================================
        // VÍDEO 01 - CLASSIFICAÇÃO DE JOSÉ AFONSO DA SILVA
        // ============================================================

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "EFICACIA_PLENA",
                "🧭 Eficácia Plena - Macete Mestre",
                "📌 PLENA: Imediata, Direta e Integral.\n" +
                        "✅ Já posso exigir agora, do jeito que está escrito.\n" +
                        "📌 Ex: Art. 5º, LXXVIII (direito de resposta).\n" +
                        "⚖️ STF: Independe de lei de imprensa."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "EFICACIA_CONTIDA",
                "🧭 Eficácia Contida - Macete Mestre",
                "📌 CONTIDA: Imediata, Direta, mas não Integral.\n" +
                        "✅ Já tenho o direito AGORA, MAS a lei pode reduzir.\n" +
                        "📌 Ex: Art. 5º, XIII (liberdade profissional).\n" +
                        "⚖️ Lei só RESTRINGE (ex: OAB para advogado)."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "EFICACIA_LIMITADA",
                "🧭 Eficácia Limitada - Macete Mestre",
                "📌 LIMITADA: Mediata (futura) e Indireta.\n" +
                        "❌ Ainda NÃO posso exigir. Preciso esperar a lei.\n" +
                        "📌 Ex: Art. 208, IV (creche antes da regulamentação).\n" +
                        "⚖️ Lei VIABILIZA o direito."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "PLENA_VS_CONTIDA",
                "🧭 Diferença Crucial: Plena x Contida",
                "📌 Pergunta mágica: Lei pode reduzir esse direito?\n" +
                        "🚫 Se NÃO (direito absoluto) → PLENA.\n" +
                        "✅ Se SIM (lei pode restringir) → CONTIDA.\n" +
                        "📌 Verbo mágico da Contida: lei CONTÉM, DIMINUI."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "CONTIDA_VS_LIMITADA",
                "🧭 Contida x Limitada - Comparativo",
                "📌 CONTIDA: Completa, já produz efeitos.\n" +
                        "📌 LIMITADA: Incompleta, depende de lei para nascer.\n" +
                        "⚖️ Liberdade profissional (art. 5º, XIII) = CONTIDA.\n" +
                        "⚖️ Direito à creche = LIMITADA."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "CILADA_NORMA_SEM_EFICACIA",
                "🧭 Cilada Clássica - Eficácia Jurídica",
                "📌 CILADA: 'Norma limitada não tem eficácia jurídica.'\n" +
                        "❌ ERRADO! Toda norma tem eficácia jurídica.\n" +
                        "✅ No mínimo: revoga lei anterior + vincula legislador.\n" +
                        "📌 AS 5 PALAVRAS PROIBIDAS: 'não tem eficácia jurídica'."
        ));

        // ============================================================
        // VÍDEO 02 - CONTIDA vs LIMITADA (APROFUNDAMENTO)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "GREVE_TRABALHADOR",
                "🧭 Direito de Greve - TRABALHADOR (Art. 9º)",
                "📌 GREVE DO TRABALHADOR (CLT/Iniciativa Privada):\n" +
                        "✅ EFICÁCIA CONTIDA (aplicabilidade imediata).\n" +
                        "⚖️ Verbo no presente: 'é assegurado'.\n" +
                        "📌 Lei só define serviços essenciais (restrição)."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "GREVE_SERVIDOR",
                "🧭 Direito de Greve - SERVIDOR PÚBLICO (Art. 37, VII)",
                "📌 GREVE DO SERVIDOR PÚBLICO ESTATUTÁRIO:\n" +
                        "❌ EFICÁCIA LIMITADA (depende de lei específica).\n" +
                        "⚖️ Verbo no futuro: 'será exercido nos termos da lei'.\n" +
                        "📌 Cilada: não confundir com trabalhador CLT!"
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "ESCUSA_CONSCIENCIA",
                "🧭 Escusa de Consciência (Art. 5º, VIII)",
                "📌 ESCUSA DE CONSCIÊNCIA (ex: adventista no sábado):\n" +
                        "✅ EFICÁCIA CONTIDA (jurisprudência do STF).\n" +
                        "⚖️ Direito existe independentemente de lei regulamentadora.\n" +
                        "📌 Ex: prova de concurso em dia diferente."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "PROPRIEDADE_CONTIDA",
                "🧭 Direito de Propriedade (Art. 5º, XXII)",
                "📌 DIREITO DE PROPRIEDADE:\n" +
                        "✅ EFICÁCIA CONTIDA (sem reserva legal explícita).\n" +
                        "⚖️ Restrição vem da própria CF (função social).\n" +
                        "📌 Prova que Contida não precisa de 'nos termos da lei'."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "LIMITADA_SUBESPECIES",
                "🧭 Subespécies da Norma Limitada",
                "📌 INSTITUTIVO: Institui/cria órgãos ou entidades.\n" +
                        "⚖️ Ex: Art. 88 (criação de Ministérios).\n" +
                        "📌 PROGRAMÁTICA: Programa políticas públicas.\n" +
                        "⚖️ Ex: Art. 7º, XI (Participação nos Lucros - PLR)."
        ));

        // ============================================================
        // VÍDEO 03 - ASPECTOS AVANÇADOS E JURISPRUDÊNCIA
        // ============================================================

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "SIGILO_CORRESPONDENCIA",
                "🧭 Sigilo de Correspondência (Art. 5º, XII)",
                "📌 INVOLABILIDADE do sigilo (correspondência/dados):\n" +
                        "✅ EFICÁCIA CONTIDA (pode ser restrita na CF).\n" +
                        "⚖️ Ex: estado de defesa/sítio quebram o sigilo.\n" +
                        "📌 NÃO precisa de lei para restringir."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "INTERCEPTACAO_TELEFONICA",
                "🧭 Interceptação Telefônica (Art. 5º, XII)",
                "📌 QUEBRA do sigilo (interceptação telefônica):\n" +
                        "❌ EFICÁCIA LIMITADA (depende de Lei 9.296/96).\n" +
                        "⚖️ Sem a lei, o juiz NÃO pode autorizar.\n" +
                        "📌 Prova ilícita sem regulamentação."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "EXTRADICAO_LIMITADA",
                "🧭 Extradição do Brasileiro Naturalizado (Art. 5º, LI)",
                "📌 EXTRADIÇÃO do brasileiro NATURALIZADO:\n" +
                        "❌ EFICÁCIA LIMITADA (depende de lei - Estatuto do Migrante).\n" +
                        "⚖️ Exceções: crime comum antes da naturalização ou tráfico.\n" +
                        "📌 Antes da lei, não se extradita (STF)."
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "ACESSO_CARGOS",
                "🧭 Acesso a Cargos Públicos (Art. 37, I)",
                "📌 BRASILEIRO: EFICÁCIA CONTIDA (já pode acessar).\n" +
                        "📌 ESTRANGEIRO: EFICÁCIA LIMITADA (depende de lei).\n" +
                        "⚖️ Regra: estrangeiro não pode, exceção: professor universitário.\n" +
                        "📌 Cilada: tratar estrangeiro como Contida = erro!"
        ));

        lista.add(new Flashcard(
                "📘 Aplicabilidade da Norma",
                "DEFESA_NORMA_LIMITADA",
                "🧭 Mecanismos de Defesa da Norma Limitada",
                "📌 Problema: legislador omisso → norma prejudicada.\n" +
                        "✅ SOLUÇÃO 1: Mandado de Injunção (Art. 5º, LXXI).\n" +
                        "✅ SOLUÇÃO 2: ADO (Ação Direta de Inconstitucionalidade por Omissão).\n" +
                        "📌 Ambos são normas de eficácia PLENA (garantias individuais)."
        ));

        // ============================================================
        // VÍDEO 04 - HIERARQUIA DAS NORMAS (FUNDAMENTOS)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "PREMISSA_HIERARQUIA",
                "🧭 Premissa Fundamental - Hierarquia",
                "📌 DOGMA 1: CF é o topo. Tudo abaixo é infraconstitucional.\n" +
                        "📌 DOGMA 2: NÃO há hierarquia entre normas da CF.\n" +
                        "⚖️ Art. 5º (direitos) vale igual a Colégio Pedro II.\n" +
                        "📌 Originária e derivada (Emenda) = mesmo nível."
        ));

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "HIERARQUIA_ESTADOS_MUNICIPIOS",
                "🧭 Hierarquia - Estados, Municípios e DF",
                "📌 ESTADUAL: CF > Constituição Estadual > leis estaduais.\n" +
                        "📌 MUNICIPAL: CF > CE > Lei Orgânica Municipal > leis municipais.\n" +
                        "📌 DISTRITO FEDERAL: CF > LODF (status de CE) > leis distritais.\n" +
                        "⚖️ LODF subordina-se SOMENTE à CF!"
        ));

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "ESPECIES_PRIMARIAS",
                "🧭 Espécies Primárias (Art. 59) - Mesma Hierarquia",
                "📌 MESMA HIERARQUIA (STF): LC, LO, MP, LD, DL, RES.\n" +
                        "✅ Diferença: apenas quórum (LC: maioria absoluta).\n" +
                        "⚖️ Cilada: 'LC é superior à LO' → ERRADO!\n" +
                        "📌 Conflito resolve-se por competência material."
        ));

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "TRATADOS_DIREITOS_HUMANOS",
                "🧭 Tratados de Direitos Humanos - Hierarquia",
                "📌 APROVADO COMO EC (3/5, 2 turnos) = hierarquia CONSTITUCIONAL.\n" +
                        "📌 APROVADO POR MAIORIA SIMPLES = hierarquia SUPRALEGAL.\n" +
                        "⚖️ Supralegal = acima das leis, abaixo da CF.\n" +
                        "📌 Nada é supraconstitucional."
        ));

        // ============================================================
        // VÍDEO 05 - HIERARQUIA (APLICAÇÃO PRÁTICA E COMPETÊNCIAS)
        // ============================================================

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "CONFLITO_LEIS_COMPETENCIA",
                "🧭 Conflito entre Leis - NÃO há Hierarquia",
                "📌 REGRA: Lei federal NÃO é maior que lei estadual.\n" +
                        "✅ Resolve-se por COMPETÊNCIA (quem pode legislar).\n" +
                        "⚖️ Ex: Direito Penal (União) → vale lei federal.\n" +
                        "⚖️ Ex: Horário comercial (interesse local) → vale lei municipal."
        ));

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "INCONSTITUCIONALIDADE_VS_ILEGALIDADE",
                "🧭 Inconstitucionalidade x Ilegalidade",
                "📌 INCONSTITUCIONAL: Lei que contraria CF, CE ou LODF.\n" +
                        "📌 ILEGAL: Lei municipal que contraria a Lei Orgânica do Município.\n" +
                        "⚖️ Súmula Vinculante 46: Município não tem constituição.\n" +
                        "📌 TJ NÃO julga ADI contra LOM."
        ));

        lista.add(new Flashcard(
                "📘 Hierarquia das Normas",
                "CILADAS_HIERARQUIA",
                "🧭 Ciladas Clássicas - Hierarquia",
                "📌 'Norma plena é superior à limitada' → ERRADO.\n" +
                        "📌 'LC é superior à LO' → ERRADO (mesma hierarquia).\n" +
                        "📌 'Lei federal > lei estadual' → ERRADO (resolve por competência).\n" +
                        "📌 'LODF subordina-se à CE do entorno' → ERRADO (só à CF)."
        ));

        return lista;
    }
}
