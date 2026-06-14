package com.seuapp.mensageria.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelperQuestao {

    private static final String PREF = "QUESTAO_PREF";

    public static void salvarAssunto(Context context,
                                     String assuntoId,
                                     boolean ativo) {

        SharedPreferences preferences =
                context.getSharedPreferences(PREF, Context.MODE_PRIVATE);

        preferences.edit()
                .putBoolean(assuntoId, ativo)
                .apply();
    }

    public static boolean assuntoAtivo(Context context,
                                       String assuntoId) {

        SharedPreferences preferences =
                context.getSharedPreferences(PREF, Context.MODE_PRIVATE);

        return preferences.getBoolean(assuntoId, false);
    }
}