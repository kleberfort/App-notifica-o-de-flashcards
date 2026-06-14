

package com.seuapp.mensageria.ui;

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
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.seuapp.mensageria.R;
import com.seuapp.mensageria.data.data_menu_principal.MenuPrincipalAppData;
import com.seuapp.mensageria.helper.PreferenceHelper;
import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Secao;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Area;
import com.seuapp.mensageria.worker.NotificationWorker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button btnVisualizar;

    private LinearLayout layoutContainer;

    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //PreferenceHelper.limparTudo(this);


        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.menu_home) {

                return true;

            } else if (item.getItemId() == R.id.menu_multipla) {

                Intent intent = new Intent(this, MultiplaEscolhaActivity.class);
                startActivity(intent);

                return true;

            }
//            else if (item.getItemId() == R.id.menu_certo_errado) {
//
//                Intent intent = new Intent(this, CertoErradoActivity.class);
//                startActivity(intent);
//
//                return true;
//            }

            return false;
        });

        layoutContainer = findViewById(R.id.layoutContainer);
        btnVisualizar = findViewById(R.id.btnVisualizar);

        // =========================
        // BOTÃO VISUALIZAR
        // =========================

        btnVisualizar.setOnClickListener(v -> {
            ArrayList<String> assuntosAtivos = new ArrayList<>();
            List<Area> areas = MenuPrincipalAppData.getAreas();

            for (Area area : areas) {
                for (Disciplina disciplina : area.getDisciplinas()) {
                    for (Secao secao : disciplina.getCategorias()) {
                        for (Conteudo conteudo : secao.getAssuntos()) {
                            boolean ativo = PreferenceHelper.assuntoAtivo(this, conteudo.getId());
                            if (ativo) {
                                assuntosAtivos.add(conteudo.getId());
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

        List<Area> areas = MenuPrincipalAppData.getAreas();

        for (Area area : areas) {
            criarTema(area);
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

    private void criarTema(Area area) {

        TextView tituloTema = new TextView(this);
        tituloTema.setText(area.getNome());
        tituloTema.setTextSize(26);
        tituloTema.setTypeface(null, Typeface.BOLD);

        tituloTema.setTextColor(Color.parseColor("#8E24AA"));

        tituloTema.setPadding(20, 40, 20, 30);

        layoutContainer.addView(tituloTema);

        // =========================
        // DISCIPLINAS
        // =========================

        for (Disciplina disciplina : area.getDisciplinas()) {
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

        for (Secao secao : disciplina.getCategorias()) {
            criarCategoria(secao, conteudo, checks, sw);
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

    private void criarCategoria(Secao secao, LinearLayout parent, List<CheckBox> checks, Switch sw) {

        // =========================
        // TÍTULO CATEGORIA
        // =========================

        TextView tituloCategoria = new TextView(this);
        tituloCategoria.setText(secao.getNome());
        tituloCategoria.setTextSize(18);
        tituloCategoria.setTypeface(null, Typeface.BOLD);
        tituloCategoria.setBackgroundColor(Color.parseColor("#F3E5F5"));
        tituloCategoria.setPadding(10, 20, 10, 20);
        parent.addView(tituloCategoria);

        // =========================
        // ASSUNTOS
        // =========================

        for (Conteudo conteudo : secao.getAssuntos()) {
            criarAssunto(conteudo, parent, checks, sw);
        }
    }

    // =========================
    // CRIAR ASSUNTO
    // =========================

    private void criarAssunto(Conteudo conteudo, LinearLayout parent, List<CheckBox> checks, Switch sw) {

        CheckBox cb = new CheckBox(this);
        cb.setText(conteudo.getNome());
        cb.setTextSize(16);
        cb.setTag(conteudo);

        // =========================
        // RECUPERAR ESTADO
        // =========================

        boolean ativo = PreferenceHelper.assuntoAtivo(this, conteudo.getId());
        cb.setChecked(ativo);

        // =========================
        // LISTENER CHECKBOX
        // =========================

        cb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Conteudo conteudoCb = (Conteudo) cb.getTag();
            PreferenceHelper.salvarAssunto(this, conteudoCb.getId(), isChecked);
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

                        Conteudo conteudo = (Conteudo) cb.getTag();
                        PreferenceHelper.salvarAssunto(this, conteudo.getId(), isChecked);

                        // =========================
                        // RESTAURAR LISTENER
                        // =========================

                        cb.setOnCheckedChangeListener((buttonView1, checked) -> {
                            Conteudo conteudoCb = (Conteudo) cb.getTag();

                                    PreferenceHelper.salvarAssunto(this, conteudoCb.getId(), checked);
                                    atualizarSwitch(sw, checks);
                                });
                    }
                });
    }
}