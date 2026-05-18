package com.seuapp.mensageria.data;



import com.seuapp.mensageria.data.desenvolvimento_software.git.GitFlashcards;
import com.seuapp.mensageria.data.engenharia_software.direito_administrativo.PrincipiosAdmFlashcards;
import com.seuapp.mensageria.data.engenharia_software.portugues.PortuguesFlashcards;
import com.seuapp.mensageria.data.engenharia_software.portugues.classe_palavras.VerbosFlashcards;
import com.seuapp.mensageria.data.engenharia_software.scrum.ScrumFlashcards;
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
        // PORTUGUES
        // =========================

        todos.addAll(PortuguesFlashcards.getFlashcards());
        todos.addAll(VerbosFlashcards.getFlashcards());

        // =========================
        // Scrum
        // =========================
        todos.addAll(ScrumFlashcards.getFlashcards());

        todos.addAll(GitFlashcards.getFlashcards());

        return todos;
    }
}
