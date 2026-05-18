package com.seuapp.mensageria.worker;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.seuapp.mensageria.ConteudoActivity;
import com.seuapp.mensageria.data.AppData;
import com.seuapp.mensageria.data.AppFlashcards;

import com.seuapp.mensageria.helper.PreferenceHelper;
import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NotificationWorker extends Worker {

    public NotificationWorker(@NonNull Context context, @NonNull WorkerParameters params) {
        super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {

        // =========================
        // WORKER EXECUTOU
        // =========================

        Log.d("WORKER", "WORKER EXECUTOU");

        // =========================
        // TODOS OS FLASHCARDS
        // =========================

        List<Flashcard> todos = AppFlashcards.getTodosFlashcards();

        // =========================
        // IDS VÁLIDOS DO APPDATA
        // =========================

        Set<String> idsValidos = AppData.getIdsValidos();

        // =========================
        // FLASHCARDS ATIVOS
        // =========================

        List<Flashcard> ativos = new ArrayList<>();

        // =========================
        // FILTRAR FLASHCARDS
        // =========================

        for (Flashcard card : todos) {

            // =========================
            // ID DO ASSUNTO
            // =========================

            String idAssunto = card.getAssunto();

            // =========================
            // IGNORAR ÓRFÃOS
            // =========================

            if (!idsValidos.contains(idAssunto)) {

                Log.d("WORKER", "IGNORADO: " + idAssunto);
                continue;
            }

            // =========================
            // VERIFICAR SE ESTÁ ATIVO
            // =========================

            boolean ativo = PreferenceHelper.assuntoAtivo(getApplicationContext(), idAssunto);

            Log.d("WORKER", idAssunto + " = " + ativo);

            // =========================
            // ADICIONAR
            // =========================

            if (ativo) {
                ativos.add(card);
            }
        }

        // =========================
        // NENHUM ATIVO
        // =========================

        if (ativos.isEmpty()) {

            Log.d("WORKER", "NENHUM ASSUNTO ATIVO");
            return Result.success();
        }

        // =========================
        // FLASHCARD ALEATÓRIO
        // =========================

        Random random = new Random();

        Flashcard card = ativos.get(random.nextInt(ativos.size()));

        // =========================
        // MANAGER
        // =========================

        NotificationManager manager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        // =========================
        // CANAL
        // =========================

        String canal = "flashcards";

        // =========================
        // CANAL ANDROID 8+
        // =========================

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(canal, "Flashcards", NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("Canal de notificações dos flashcards");
            manager.createNotificationChannel(channel);
        }

        // =========================
        // INTENT
        // =========================

        Intent intent = new Intent(getApplicationContext(), ConteudoActivity.class);
        intent.putExtra("titulo", card.getTitulo());
        intent.putExtra("conteudo", card.getConteudo());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        // =========================
        // PENDING INTENT
        // =========================

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                                | PendingIntent.FLAG_IMMUTABLE);

        // =========================
        // BUILDER
        // =========================

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), canal)
                        // TÍTULO
                        .setContentTitle(card.getTitulo())
                        // TEXTO
                        .setContentText(card.getConteudo())
                        // TEXTO GRANDE
                        .setStyle(new NotificationCompat.BigTextStyle().bigText(card.getConteudo()))
                        // ÍCONE
                        .setSmallIcon(android.R.drawable.ic_menu_info_details)
                        // PRIORIDADE
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        // ABRIR AO CLICAR
                        .setContentIntent(pendingIntent)
                        // FECHAR AO CLICAR
                        .setAutoCancel(true);

        // =========================
        // ENVIAR NOTIFICAÇÃO
        // =========================

        manager.notify(new Random().nextInt(), builder.build());

        Log.d("WORKER", "NOTIFICAÇÃO ENVIADA");

        return Result.success();
    }
}