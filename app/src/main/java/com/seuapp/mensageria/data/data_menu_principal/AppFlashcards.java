package com.seuapp.mensageria.data.data_menu_principal;



import com.seuapp.mensageria.flashcard_questoes.flashcards.desenvolvimento_software_flashcard.git.GitFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.admnistrativo_flashcard.PrincipiosAdmFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.constitucional_flashcard.AplicalidadeHierarquiaNormaFlashcard;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.ConjuncaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.VerbosFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.engenharia_software_flashcard.scrum.ScrumFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.engenharia_software_flashcard.xp.XpFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.termos_oracao.TiposSujeitoFlashcards;
import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class AppFlashcards {

    public static List<Flashcard> getTodosFlashcards() {

        List<Flashcard> todos = new ArrayList<>();



        // =========================
        // DIREITO ADMINISTRATIVO
        // =========================

        todos.addAll(PrincipiosAdmFlashcards.getFlashcards());

        // =========================
        // DIREITO CONSTITUCIONAL
        // =========================

        todos.addAll(AplicalidadeHierarquiaNormaFlashcard.getFlashcards());


        // =========================
        // PORTUGUES
        // =========================

        todos.addAll(ConjuncaoFlashcards.getFlashcards());
        todos.addAll(VerbosFlashcards.getFlashcards());
        todos.addAll(TiposSujeitoFlashcards.getFlashcards());

        // =========================
        // ENGENHARIA DE SOFTWARE
        // =========================
        todos.addAll(ScrumFlashcards.getFlashcards());
        todos.addAll(XpFlashcards.getFlashcards());

        todos.addAll(GitFlashcards.getFlashcards());

        return todos;
    }
}
