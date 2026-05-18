

package com.seuapp.mensageria.ui;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import com.seuapp.mensageria.ConteudoActivity;
import com.seuapp.mensageria.R;
import com.seuapp.mensageria.data.AppData;
import com.seuapp.mensageria.helper.PreferenceHelper;
import com.seuapp.mensageria.model.Assunto;
import com.seuapp.mensageria.model.Categoria;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.GrupoAssunto;
import com.seuapp.mensageria.model.Tema;
import com.seuapp.mensageria.worker.NotificationWorker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button btnVisualizar;

    private LinearLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //PreferenceHelper.limparTudo(this);

        layoutContainer = findViewById(R.id.layoutContainer);
        btnVisualizar = findViewById(R.id.btnVisualizar);

        // =========================
        // BOTÃO VISUALIZAR
        // =========================

        btnVisualizar.setOnClickListener(v -> {
            ArrayList<String> assuntosAtivos = new ArrayList<>();
            List<Tema> temas = AppData.getTemas();

            for (Tema tema : temas) {
                for (Disciplina disciplina : tema.getDisciplinas()) {
                    for (Categoria categoria : disciplina.getCategorias()) {
                        for (Assunto assunto : categoria.getAssuntos()) {
                            boolean ativo = PreferenceHelper.assuntoAtivo(this, assunto.getId());
                            if (ativo) {
                                assuntosAtivos.add(assunto.getId());
                            }
                        }
                    }
                }
            }

            Intent intent = new Intent(this, ConteudoActivity.class);
            intent.putStringArrayListExtra("ASSUNTOS_ATIVOS", assuntosAtivos);
            startActivity(intent);
        });

        // =========================
        // PERMISSÃO NOTIFICAÇÃO
        // =========================

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 1);
            }
        }

        // =========================
        // CARREGAR TEMAS
        // =========================

        List<Tema> temas = AppData.getTemas();

        for (Tema tema : temas) {
            criarTema(tema);
        }

        // =========================
        // WORKMANAGER
        // =========================

        PeriodicWorkRequest request = new PeriodicWorkRequest.Builder(NotificationWorker.class, 15, TimeUnit.MINUTES).build();

        WorkManager.getInstance(this).enqueueUniquePeriodicWork("FLASHCARD_WORK", ExistingPeriodicWorkPolicy.UPDATE, request);
    }

    // =========================
    // CRIAR TEMA
    // =========================

    private void criarTema(Tema tema) {

        TextView tituloTema = new TextView(this);
        tituloTema.setText(tema.getNome());
        tituloTema.setTextSize(26);
        tituloTema.setTypeface(null, Typeface.BOLD);

        tituloTema.setTextColor(Color.parseColor("#8E24AA"));

        tituloTema.setPadding(20, 40, 20, 30);

        layoutContainer.addView(tituloTema);

        // =========================
        // DISCIPLINAS
        // =========================

        for (Disciplina disciplina : tema.getDisciplinas()) {
            criarDisciplina(disciplina);
        }
    }

    // =========================
    // CRIAR DISCIPLINA
    // =========================

    private void criarDisciplina(Disciplina disciplina) {

        // =========================
        // LAYOUT PRINCIPAL
        // =========================

        LinearLayout layoutDisciplina = new LinearLayout(this);
        layoutDisciplina.setOrientation(LinearLayout.VERTICAL);
        layoutDisciplina.setPadding(0, 10, 0, 10);

        // =========================
        // HEADER
        // =========================

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.HORIZONTAL);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(10, 10, 10, 10);

        // =========================
        // SETA
        // =========================

        TextView seta = new TextView(this);
        seta.setText("►");
        seta.setTextSize(18);
        seta.setPadding(10, 0, 20, 0);

        // =========================
        // TÍTULO
        // =========================

        TextView titulo = new TextView(this);
        titulo.setText(disciplina.getNome());
        titulo.setTextSize(20);
        titulo.setTypeface(null, Typeface.BOLD);
        titulo.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        // =========================
        // SWITCH
        // =========================

        Switch sw = new Switch(this);
        aplicarEstiloSwitch(sw);

        // =========================
        // HEADER
        // =========================

        header.addView(seta);
        header.addView(titulo);
        header.addView(sw);

        // =========================
        // CONTEÚDO
        // =========================

        LinearLayout conteudo = new LinearLayout(this);
        conteudo.setOrientation(LinearLayout.VERTICAL);
        conteudo.setPadding(70, 10, 0, 10);

        // =========================
        // CHECKBOXES
        // =========================

        List<CheckBox> checks = new ArrayList<>();

        // =========================
        // CATEGORIAS
        // =========================

        for (Categoria categoria : disciplina.getCategorias()) {
            criarCategoria(categoria, conteudo, checks, sw);
        }

        // =========================
        // SWITCH INICIAL
        // =========================

        atualizarSwitch(sw, checks);

        // =========================
        // EXPANDIR / RECOLHER
        // =========================

        conteudo.setVisibility(View.GONE);

        final boolean[] expandido = {false};


        seta.setOnClickListener(v -> {

            if (expandido[0]) {
                conteudo.setVisibility(View.VISIBLE);
                seta.setText("▼");

                Log.d("seta", "Para baixo");

            } else {
                conteudo.setVisibility(View.GONE);
                seta.setText("►");

                Log.d("seta", "Para o lado");
            }

            expandido[0] = !expandido[0];


        });

        // =========================
        // ADICIONAR
        // =========================

        layoutDisciplina.addView(header);
        layoutDisciplina.addView(conteudo);
        layoutContainer.addView(layoutDisciplina);
    }

    // =========================
    // CRIAR CATEGORIA
    // =========================

    private void criarCategoria(Categoria categoria, LinearLayout parent, List<CheckBox> checks, Switch sw) {

        // =========================
        // TÍTULO CATEGORIA
        // =========================

        TextView tituloCategoria = new TextView(this);
        tituloCategoria.setText(categoria.getNome());
        tituloCategoria.setTextSize(18);
        tituloCategoria.setTypeface(null, Typeface.BOLD);
        tituloCategoria.setBackgroundColor(Color.parseColor("#F3E5F5"));
        tituloCategoria.setPadding(10, 20, 10, 20);
        parent.addView(tituloCategoria);

        // =========================
        // ASSUNTOS
        // =========================

        for (Assunto assunto : categoria.getAssuntos()) {
            criarAssunto(assunto, parent, checks, sw);
        }
    }

    // =========================
    // CRIAR ASSUNTO
    // =========================

    private void criarAssunto(Assunto assunto, LinearLayout parent, List<CheckBox> checks, Switch sw) {

        CheckBox cb = new CheckBox(this);
        cb.setText(assunto.getNome());
        cb.setTextSize(16);
        cb.setTag(assunto);

        // =========================
        // RECUPERAR ESTADO
        // =========================

        boolean ativo = PreferenceHelper.assuntoAtivo(this, assunto.getId());
        cb.setChecked(ativo);

        // =========================
        // LISTENER CHECKBOX
        // =========================

        cb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Assunto assuntoCb = (Assunto) cb.getTag();
            PreferenceHelper.salvarAssunto(this, assuntoCb.getId(), isChecked);
            atualizarSwitch(sw, checks);
                });

        checks.add(cb);
        parent.addView(cb);
    }

    // =========================
    // ESTILO SWITCH
    // =========================

    private void aplicarEstiloSwitch(Switch sw) {

        ColorStateList thumbStates =
                new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_checked},
                                new int[]{-android.R.attr.state_checked}
                        },
                        new int[]{
                                Color.parseColor("#8E24AA"),
                                Color.parseColor("#BDBDBD")
                        }
                );

        ColorStateList trackStates =
                new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_checked},
                                new int[]{-android.R.attr.state_checked}
                        },
                        new int[]{
                                Color.parseColor("#CE93D8"),
                                Color.parseColor("#E0E0E0")
                        }
                );

        sw.setThumbTintList(thumbStates);
        sw.setTrackTintList(trackStates);
    }

    // =========================
    // ATUALIZAR SWITCH
    // =========================

    private void atualizarSwitch(Switch sw, List<CheckBox> checks) {
        boolean todosMarcados = true;

        for (CheckBox cb : checks) {
            if (!cb.isChecked()) {
                todosMarcados = false;
                break;
            }
        }

        // =========================
        // REMOVER LISTENER
        // =========================

        sw.setOnCheckedChangeListener(null);

        // =========================
        // ESTADO VISUAL
        // =========================

        sw.setChecked(todosMarcados);

        // =========================
        // LISTENER SWITCH
        // =========================

        sw.setOnCheckedChangeListener((buttonView, isChecked) -> {
            for (CheckBox cb : checks) {

                        // =========================
                        // REMOVER LISTENER
                        // =========================

                        cb.setOnCheckedChangeListener(null);

                        // =========================
                        // ALTERAR CHECKBOX
                        // =========================

                        cb.setChecked(isChecked);

                        // =========================
                        // SALVAR
                        // =========================

                        Assunto assunto = (Assunto) cb.getTag();
                        PreferenceHelper.salvarAssunto(this, assunto.getId(), isChecked);

                        // =========================
                        // RESTAURAR LISTENER
                        // =========================

                        cb.setOnCheckedChangeListener((buttonView1, checked) -> {
                            Assunto assuntoCb = (Assunto) cb.getTag();

                                    PreferenceHelper.salvarAssunto(this, assuntoCb.getId(), checked);
                                    atualizarSwitch(sw, checks);
                                });
                    }
                });
    }
}