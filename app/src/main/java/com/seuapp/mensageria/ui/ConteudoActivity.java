package com.seuapp.mensageria.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.seuapp.mensageria.R;
import com.seuapp.mensageria.data.data_menu_principal.AppFlashcards;
import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ConteudoActivity extends AppCompatActivity {

    private LinearLayout layoutConteudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_conteudo);

        layoutConteudo = findViewById(R.id.layoutConteudo);

        // =========================
        // VERIFICAR SE VEIO DA NOTIFICAÇÃO
        // =========================

        String tituloNotificacao =
                getIntent().getStringExtra("titulo");

        String conteudoNotificacao =
                getIntent().getStringExtra("conteudo");

        // =========================
        // ABRIR CONTEÚDO ÚNICO
        // =========================

        if (tituloNotificacao != null &&
                conteudoNotificacao != null) {

            mostrarConteudoUnico(
                    tituloNotificacao,
                    conteudoNotificacao
            );

            return;
        }

        // =========================
        // MODO NORMAL
        // =========================

        ArrayList<String> assuntosAtivos =
                getIntent().getStringArrayListExtra(
                        "ASSUNTOS_ATIVOS"
                );

        if (assuntosAtivos == null) {
            return;
        }

        List<Flashcard> todos =
                AppFlashcards.getTodosFlashcards();

        List<String> materiasAdicionadas =
                new ArrayList<>();

        for (Flashcard card : todos) {

            if (!assuntosAtivos.contains(
                    card.getAssunto()
            )) {
                continue;
            }

            // =========================
            // MATÉRIA
            // =========================

            if (!materiasAdicionadas.contains(
                    card.getMateria()
            )) {

                TextView tituloMateria =
                        new TextView(this);

                tituloMateria.setText(
                        card.getMateria()
                );

                tituloMateria.setTextSize(22);

                tituloMateria.setTypeface(
                        null,
                        Typeface.BOLD
                );

                tituloMateria.setPadding(
                        0,
                        40,
                        0,
                        20
                );

                layoutConteudo.addView(
                        tituloMateria
                );

                materiasAdicionadas.add(
                        card.getMateria()
                );
            }

            adicionarFlashcard(
                    card.getTitulo(),
                    card.getConteudo()
            );
        }
    }

    // =========================
    // MOSTRAR CONTEÚDO ÚNICO
    // =========================

    private void mostrarConteudoUnico(
            String tituloTexto,
            String conteudoTexto
    ) {

        adicionarFlashcard(
                tituloTexto,
                conteudoTexto
        );
    }

    // =========================
    // ADICIONAR FLASHCARD
    // =========================

    private void adicionarFlashcard(
            String tituloTexto,
            String conteudoTexto
    ) {

        // =========================
        // TITULO
        // =========================

        TextView titulo =
                new TextView(this);

        titulo.setText(
                tituloTexto
        );

        titulo.setTextSize(20);

        titulo.setTypeface(
                null,
                Typeface.BOLD
        );

        titulo.setPadding(
                0,
                30,
                0,
                15
        );

        // =========================
        // CONTEÚDO
        // =========================

        TextView conteudo =
                new TextView(this);

        conteudo.setText(
                conteudoTexto
        );

        conteudo.setTextSize(16);

        conteudo.setLineSpacing(
                1.2f,
                1.2f
        );

        conteudo.setPadding(
                20,
                0,
                0,
                30
        );

        // =========================
        // ADICIONAR NA TELA
        // =========================

        layoutConteudo.addView(
                titulo
        );

        layoutConteudo.addView(
                conteudo
        );
    }
}