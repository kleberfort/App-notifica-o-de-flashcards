package com.seuapp.mensageria;

import android.util.Log;

import com.seuapp.mensageria.flashcard_questoes.questoes_multipla.direito_questoes.administrativo.PrincipiosExpressosImplicitosQuestoesMultipla;
import com.seuapp.mensageria.flashcard_questoes.questoes_multipla.direito_questoes.constitucional.AplicabilidadeHierarquiaNormaQuestoesMultipla;
import com.seuapp.mensageria.flashcard_questoes.questoes_multipla.engenharia_software_questoes.xp_questoes.XpQuestoesMultipla;
import com.seuapp.mensageria.flashcard_questoes.questoes_multipla.portugues_questoes.classe_palavras.PortuguesVerbosQuestaoMultipla;
import com.seuapp.mensageria.flashcard_questoes.questoes_multipla.portugues_questoes.sintaxe.termos_oracao.TiposSujeitoQuestaoMultipla;
import com.seuapp.mensageria.model.QuestaoMultiplaEscolha;

import java.util.ArrayList;
import java.util.List;

public class BancoQuestoes {

    // =========================
    // RETORNAR QUESTÕES
    // =========================

    public static List<QuestaoMultiplaEscolha> getQuestoes(String assuntoId) {

        List<QuestaoMultiplaEscolha> lista = new ArrayList<>();

        // Classe responsável para receber a lista de questões criada e mapeado com a classe AppDataQuestoes para Mostrar na tela.

        //Mostra a disciplina selecionada para responder as questões
        Log.d("ASSUNTO", "Recebido: [" + assuntoId + "]");


        switch (assuntoId) {

            // =====================================================
            // PORTUGUES
            // =====================================================

            case "VERBOS_TEMPOS_MODO":
                PortuguesVerbosQuestaoMultipla portuguesVerbosQuestaoMultipla = new PortuguesVerbosQuestaoMultipla();
                lista.addAll(portuguesVerbosQuestaoMultipla.getQuestoesVerbos());
                break;

            case "TIPOS_SUJEITO":
                TiposSujeitoQuestaoMultipla tiposSujeitoQuestaoMultipla = new TiposSujeitoQuestaoMultipla();
                lista.addAll(tiposSujeitoQuestaoMultipla.getQuestoesSintaxe());
                break;
            // =====================================================
            // DIREITO ADMINISTRATIVO
            // =====================================================

             case "PRNCIPIOS_EXPRESSOS_IMPLICITO":
              PrincipiosExpressosImplicitosQuestoesMultipla principiosExpressosImplicitosQuestoesMultipla = new PrincipiosExpressosImplicitosQuestoesMultipla();
              lista.addAll(principiosExpressosImplicitosQuestoesMultipla.getQuestoesPrincipios());
                 break;
                 // =====================================================
                 // DIREITO CONSTITUCIONAL
                 // =====================================================

            case "APLICABILIDADE_HIERARQUIA_NORMA":
                AplicabilidadeHierarquiaNormaQuestoesMultipla aplicabilidadeHierarquiaNormaQuestoesMultipla = new AplicabilidadeHierarquiaNormaQuestoesMultipla();
                lista.addAll(aplicabilidadeHierarquiaNormaQuestoesMultipla.getQuestoes());
                break;

            // =====================================================
            // ENGENHARIA DE SOFTWARE
            // =====================================================

            case "XP_PRATICAS":
                XpQuestoesMultipla xpQuestoesMultipla = new XpQuestoesMultipla();
                lista.addAll(xpQuestoesMultipla.getQuestoesXP());
                break;

        }


        Log.d("ASSUNTO", "Questões carregadas: " + lista.size());
        for (QuestaoMultiplaEscolha q : lista) {
            Log.d("QUESTAO", q.getInformacao());
        }

        return lista;
    }
}