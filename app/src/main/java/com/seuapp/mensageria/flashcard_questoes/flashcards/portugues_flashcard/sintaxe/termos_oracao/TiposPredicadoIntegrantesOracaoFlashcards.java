package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.termos_oracao;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class TiposPredicadoIntegrantesOracaoFlashcards {


    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ===================== VÍDEO 08 =====================
        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "VERBOS_TRANSITIVIDADE",
                "🧭 Verbos de Ação vs Estado",
                "📌 Dois grandes grupos verbais:\n" +
                        "⚡ AÇÃO/MOVIMENTO: VI, TD, TI, TDI.\n" +
                        "🧘 ESTADO: Verbo de Ligação (VL) + Predicativo."
        ));

        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "CLASSIFICACAO_VERBOS",
                "🧭 Passo a Passo para Classificar",
                "📌 1) Isole o verbo.\n" +
                        "📌 2) Pergunte: Quem? → Sujeito.\n" +
                        "📌 3) Verbo + o quê? → TD.\n" +
                        "📌 4) Verbo + prep + quê/quem? → TI.\n" +
                        "📌 5) Ambos? → TDI.\n" +
                        "📌 6) Não precisa de complemento → VI.\n" +
                        "📌 7) Tem predicativo? > Sim → VL."
        ));

        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "CLASSIFICACAO_VERBOS",
                "🧭 Macetes de Identificação",
                "📌 Verbo Intrasitivo:\n" +
                        "Pode vir seguido de Info. Acessória(Adj. Adv. OU0 Pred. do suj.\n" +
                        "NÃO EXIGE COMPLEMENTO = Pode ser dispensável\n" +
                        "🔑 Ex: 'O menino foi ao clube' → ao clube > (adj. adv de lugar > VI).\n" +
                        "✅ Adj. Adverbial (indica circunstância = onde/quando/como?)."

        ));
        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "CLASSIFICACAO_VERBOS",
                "🧭 Macetes de Identificação",
                "📌 Verbo Ligação:\n" +
                        "Vem com PREDICATIVO DO SUJEITO (Refere-se ao sujeito, indica estado, geralmente adjetivo, varia em gênero/número).\n" +
                        "Indica estado(Permanente, passageiro, mudança...)\n" +
                        "🔑 Ex: 'Ela está cansada' → cansada > (pred. do Sujeito).\n" +
                        "✅ Regra de Ouro: SE NÃO TIVER PREDICATIVO, NÃO É VL."

        ));

        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "MACETE_MENINO",
                "🧭 Teste do Menino",
                "📌 Substitua complemento por MENINO:\n" +
                        "✅ 'o menino' → TD (OD).\n" +
                        "✅ 'ao/do/no menino' → TI (OI).\n" +
                        "🚫 NUNCA troque por 'a mim' (vicia teste)."
        ));

        lista.add(new Flashcard(
                "📘 Predicação Verbal",
                "CILADA_VL",
                "🧭 Verbo de Ligação é Cilada!",
                "📌 VL só é VL se tiver PREDICATIVO + Indica ESTADO.\n" +
                        "📌 Ser, estar, ficar, parecer, permanecer, viver, continuar, virar, andar...\n" +
                        "⚠️ Se não tiver predicativo = ação!\n" +
                        "📌 'Ela caiu doente' → VL (mudança de estado).\n" +
                        "📌 'Ela caiu na rua' → VI (ação + lugar)."
        ));

        // ===================== VÍDEO 09 =====================
        lista.add(new Flashcard(
                "📘 Tipos de Predicado",
                "PREDICADO_ESTADO_ACAO",
                "🧭 Predicado: Estado ou Ação?",
                "📌 1) Verbo é ESTADO? → NOMINAL (PN).\n" +
                        "📌 2) Verbo é AÇÃO? Tem predicativo?\n" +
                        "✅ SIM → VERBO-NOMINAL (PVN).\n" +
                        "✅ NÃO → VERBAL (PV).\n" +
                        "📌 MACETE: Pergunte primeiro: ESTADO ou AÇÃO?"
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Predicado",
                "PN_VS_PV_VS_PVN",
                "🧭 Os 3 Tipos de Predicado",
                "📌 NOMINAL (PN): VL + Predicativo.\n" +
                        "📌 VERBAL (PV): Ação, sem predicativo.\n" +
                        "📌 VERBO-NOMINAL (PVN): Ação + Predicativo.\n" +
                        "🔑 Ex: 'Chegou cansada' → PVN (ação + predicativo).\n" +
                        "🔑 Ex: 'Estava cansada' → PN (estado + predicativo)."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de Predicado",
                "CILADA_ANDAR",
                "🧭 Verbo ANDAR: Cilada",
                "📌 'Andar' pode ser ação ou estado:\n" +
                        "🏃 Ação: 'Andou na rua' → PV.\n" +
                        "🧘 Estado: 'Anda preocupado' (≈ estar) → PN.\n" +
                        "📌 Troque por ESTAR: se encaixar → VL."
        ));

        // ===================== VÍDEO 10 =====================
        lista.add(new Flashcard(
                "📘 Predicado - FCC",
                "ESTRATEGIA_FCC",
                "🧭 Método Infalível para FCC",
                "📌 PASSO 1: Localize verbo principal.\n" +
                        "📌 PASSO 2: Estado? → PN (já era!).\n" +
                        "📌 PASSO 3: Ação? Tem predicativo?\n" +
                        "✅ SIM → PVN.\n" +
                        "✅ NÃO → PV.\n" +
                        "🚫 NÃO viaje em análises desnecessárias!"
        ));

        lista.add(new Flashcard(
                "📘 Predicado - FCC",
                "FCC_CILADAS",
                "🧭 Ciladas Mortais da FCC",
                "📌 Locução verbal: foco no PRINCIPAL(último) que tem a transtividade\n" +
                        "📌 Várias orações: não analise todas.\n" +
                        "📌 Sujeito oculto: predicado = frase toda.\n" +
                        "📌 'Espera (fumando - V.Principal) aflito' → PVN (ação + predicativo)."
        ));

        // ===================== VÍDEO 11 =====================
        lista.add(new Flashcard(
                "📘 Termos Essenciais",
                "SUJEITO_PREDICADO",
                "🧭 Sujeito e Predicado",
                "📌 SUJEITO: Pergunte 'QUEM?/O QUÊ?'\n" +
                        "📌 PREDICADO: tudo menos o sujeito.\n" +
                        "📌 PREDICADO é OBRIGATÓRIO (verbo).\n" +
                        "📌 Sujeito pode ser inexistente (ex: 'Choveu').\n" +
                        "📌 Não existe oração sem verbo!"
        ));

        lista.add(new Flashcard(
                "📘 Termos Essenciais",
                "TIPOS_SUJEITO",
                "🧭 Tipos de Sujeito",
                "📌 SIMPLES: 1 núcleo.\n" +
                        "📌 COMPOSTO: 2+ núcleos.\n" +
                        "📌 OCULTO: desinência revela (ex: 'Chegamos' = nós).\n" +
                        "📌 INDETERMINADO: 3ª plural ou 'se' + 3ª singular.\n" +
                        "📌 INEXISTENTE: Haver (existir), fenômenos, fazer tempo."
        ));

        // ===================== VÍDEO 12 =====================
        lista.add(new Flashcard(
                "📘 Complementos Verbais",
                "OD_OI",
                "🧭 Objeto Direto e Indireto",
                "📌 OD: sem preposição (ou facultativa).\n" +
                        "📌 OI: com preposição OBRIGATÓRIA.\n" +
                        "📌 Teste do MENINO: 'o menino' = OD; 'ao/do' = OI.\n" +
                        "📌 PRONOMES: o/a=OD; lhe/lhes=OI.\n" +
                        "📌 CORINGAS: me/te/se/nos/vos (teste a regência)."
        ));

        lista.add(new Flashcard(
                "📘 Complementos Verbais",
                "OD_PREPOSICIONADO",
                "🧭 Objeto Direto Preposicionado",
                "📌 OD com preposição FACULTATIVA.\n" +
                        "📌 Ex: 'Admiro a todos' = 'Admiro todos'.\n" +
                        "📌 Teste: se der 'o menino' é OD.\n" +
                        "📌 Não confunda com OI (preposição obrigatória)."
        ));

        lista.add(new Flashcard(
                "📘 Complementos Verbais",
                "PLEONASMO",
                "🧭 Pleonasmo do Objeto",
                "📌 Repetição para ênfase.\n" +
                        "📌 'Os livros, li-os todos.'\n" +
                        "📌 OD raiz: 'os livros'; OD pleonástico: 'os'.\n" +
                        "📌 Correto em análise sintática (não é erro!)."
        ));

        // ===================== VÍDEO 13 =====================
        lista.add(new Flashcard(
                "📘 Bitransitivos",
                "TDI_REGENCIA",
                "🧭 Verbos com Dois Complementos",
                "📌 TDI = OD + OI (sempre).\n" +
                        "📌 'Oferecemos café aos amigos.'\n" +
                        "📌 Regra de Ouro:\n" +
                        "  - lhe (OI) + OD explícito.\n" +
                        "  - o/a (OD) + OI explícito.\n" +
                        "🚫 'Deu-lhe ao amigo' → ERRO (dois OIs)."
        ));

        lista.add(new Flashcard(
                "📘 Bitransitivos",
                "HAVER_VS_EXISTIR",
                "🧭 HAVER (existir) vs EXISTIR",
                "📌 HAVER (existir): Impessoal → OD.\n" +
                        "   'Havia crianças' (OD, singular).\n" +
                        "📌 EXISTIR: Pessoal → SUJEITO.\n" +
                        "   'Existiam crianças' (sujeito, plural).\n" +
                        "📌 Sinônimos (semântica), mas sintaxe diferente."
        ));

        lista.add(new Flashcard(
                "📘 Bitransitivos",
                "OI_VS_ADJUNTO",
                "🧭 OI ou Adjunto Adverbial?",
                "📌 OI: verbo exige, não pode retirar.\n" +
                        "📌 Adjunto: circunstância (lugar, tempo, modo).\n" +
                        "📌 'Preciso de você' → OI.\n" +
                        "📌 'Cheguei de manhã' → Adjunto de tempo.\n" +
                        "🔑 Teste: tem cheiro de circunstância? = Adjunto."
        ));

        // ===================== VÍDEO 14 =====================
        lista.add(new Flashcard(
                "📘 Estratégia FCC",
                "FCC_SUJEITO",
                "🧭 Como a FCC pede SUJEITO",
                "📌 'Verbo deve sua flexão ao termo' = SUJEITO.\n" +
                        "📌 Elimine: HAVER (existir), termo com preposição, adjetivo.\n" +
                        "📌 'Falta-lhes a nota grave' → SUJEITO = 'a nota grave'."
        ));

        lista.add(new Flashcard(
                "📘 Estratégia FCC",
                "FCC_OD_OI",
                "🧭 Como a FCC pede OD e OI",
                "📌 OD: elimine SER/VL, preposição, EXISTIR, adjetivo.\n" +
                        "📌 OI: elimine 'o/a' (pronome), termo sem preposição, VL.\n" +
                        "📌 Pronome 'o/a' = OD (certeza).\n" +
                        "📌 Pronome 'lhe/lhes' = OI (certeza)."
        ));

        // ===================== VÍDEO 15 =====================
        lista.add(new Flashcard(
                "📘 Complemento Nominal",
                "CN_CONCEITO",
                "🧭 Complemento Nominal (CN)",
                "📌 Completa NOME (substantivo, adjetivo, advérbio).\n" +
                        "📌 SEMPRE com preposição OBRIGATÓRIA.\n" +
                        "📌 'Necessidade de alimentos' → CN do substantivo.\n" +
                        "📌 'Prejudicial à saúde' → CN do adjetivo.\n" +
                        "🔑 Seta aponta para NOME."
        ));

        lista.add(new Flashcard(
                "📘 Agente da Passiva",
                "AP_CONCEITO",
                "🧭 Agente da Passiva (AP)",
                "📌 Indica quem pratica a ação na passiva.\n" +
                        "📌 Estrutura: ser + particípio + AP (por/de).\n" +
                        "📌 'Foi cercado pelos inimigos' → AP.\n" +
                        "📌 AP NÃO aponta seta para ninguém.\n" +
                        "🔑 Teste: vira sujeito na ativa? = AP."
        ));

        lista.add(new Flashcard(
                "📘 CN vs AP",
                "CN_AP_DIFERENCA",
                "🧭 CN x AP: Não Confunda!",
                "📌 CN: aponta seta para NOME.\n" +
                        "📌 AP: não aponta seta; é agente da passiva.\n" +
                        "📌 'Agradecido aos amigos' → CN (seta para adjetivo).\n" +
                        "📌 'Cercado pelos inimigos' → AP.\n" +
                        "🔑 AP = voz passiva analítica."
        ));

        lista.add(new Flashcard(
                "📘 AP vs Adjunto Adverbial",
                "AP_VS_ADJUNTO",
                "🧭 AP ou Adjunto Adverbial?",
                "📌 Teste: vira sujeito na ativa?\n" +
                        "✅ SIM → AP.\n" +
                        "❌ NÃO → Adjunto Adverbial.\n" +
                        "📌 'Elogiado pela inteligência' → Adjunto (não vira sujeito).\n" +
                        "📌 'Elogiado pelos professores' → AP (professores elogiaram)."
        ));

        // ===================== RESUMO GERAL =====================
        lista.add(new Flashcard(
                "📘 Resumo Geral",
                "TABELA_TERMOS",
                "🧭 Tabela dos Termos Integrantes",
                "📌 OD → Seta para VERBO (prep. facultativa).\n" +
                        "📌 OI → Seta para VERBO (prep. obrigatória).\n" +
                        "📌 CN → Seta para NOME (prep. obrigatória).\n" +
                        "📌 AP → NÃO tem seta (prep. obrigatória).\n" +
                        "🔑 TODOS são casos de SUBSTANTIVO."
        ));

        lista.add(new Flashcard(
                "📘 Resumo Geral",
                "MACETES_FINAIS",
                "🧭 Macetes de Ouro",
                "📌 FCC: Sujeito → elimine HAVER, preposição, adjetivo.\n" +
                        "📌 OD → 'o/a' (pronome) é OD.\n" +
                        "📌 OI → 'lhe/lhes' é OI.\n" +
                        "📌 CN → completa NOME.\n" +
                        "📌 AP → teste da ativa.\n" +
                        "📌 Mantra: 'Não olhe para o verbo, olhe para o que vem depois!'"
        ));

        return lista;
    }
}