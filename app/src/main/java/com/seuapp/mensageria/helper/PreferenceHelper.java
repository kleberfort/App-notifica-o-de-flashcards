package com.seuapp.mensageria.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    private static final String PREF = "FLASHCARD_PREF";

    // =========================
    // SALVAR ASSUNTO
    // =========================

    public static void salvarAssunto(Context context, String assuntoId, boolean ativo) {

        SharedPreferences preferences = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);

        preferences.edit().putBoolean(assuntoId, ativo).apply();


    }

    // =========================
    // VERIFICAR ASSUNTO
    // =========================

    public static boolean assuntoAtivo(Context context, String assuntoId) {

        SharedPreferences preferences = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        // AGORA O PADRÃO É FALSE
        return preferences.getBoolean(assuntoId, false);
    }

    public static void limparTudo(Context context) {

        SharedPreferences preferences =
                context.getSharedPreferences(PREF, Context.MODE_PRIVATE);

        preferences.edit().clear().apply();
    }

}
