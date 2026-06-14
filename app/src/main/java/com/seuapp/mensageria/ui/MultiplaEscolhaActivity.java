package com.seuapp.mensageria.ui;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.seuapp.mensageria.R;
import com.seuapp.mensageria.data.data_menu_questoes_multipla.AppDataQuestoes;
import com.seuapp.mensageria.helper.PreferenceHelperQuestao;
import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Secao;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Area;

import java.util.ArrayList;
import java.util.List;

public class MultiplaEscolhaActivity extends AppCompatActivity {

    private LinearLayout layoutContainer;

    private Button btnCarregarQuestoes;

    // =========================
    // ON CREATE
    // =========================

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_multipla_escolha);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );

            return insets;
        });

        // =========================
        // COMPONENTES
        // =========================

        layoutContainer = findViewById(R.id.layoutContainer);

        btnCarregarQuestoes = findViewById(R.id.btnCarregarQuestoes);

        // =========================
        // CARREGAR TEMAS
        // =========================

        List<Area> areas = AppDataQuestoes.getTemasQuestoes();

        for (Area area : areas) {

            criarTema(area);
        }

        // =========================
        // BOTÃO CARREGAR QUESTÕES
        // =========================

        btnCarregarQuestoes.setOnClickListener(v -> {

            ArrayList<String> assuntosSelecionados =
                    new ArrayList<>();

            List<Area> temasQuestoes =
                    AppDataQuestoes.getTemasQuestoes();

            for (Area area : temasQuestoes) {

                for (Disciplina disciplina :
                        area.getDisciplinas()) {

                    for (Secao secao :
                            disciplina.getCategorias()) {

                        for (Conteudo conteudo :
                                secao.getAssuntos()) {

                            boolean ativo =
                                    PreferenceHelperQuestao
                                            .assuntoAtivo(
                                                    this,
                                                    conteudo.getId()
                                            );

                            if (ativo) {

                                assuntosSelecionados.add(
                                        conteudo.getId()
                                );
                            }
                        }
                    }
                }
            }

            // =========================
            // ABRIR TELA QUESTÕES
            // =========================

            Intent intent =
                    new Intent(
                            this,
                            ResponderQuestaoActivity.class
                    );

            intent.putStringArrayListExtra(
                    "ASSUNTOS_QUESTAO",
                    assuntosSelecionados
            );

            startActivity(intent);
        });
    }

    // =========================
    // CRIAR TEMA
    // =========================

    private void criarTema(Area area) {

        TextView tituloTema = new TextView(this);

        tituloTema.setText(area.getNome());

        tituloTema.setTextSize(26);

        tituloTema.setTypeface(null, Typeface.BOLD);

        tituloTema.setTextColor(
                Color.parseColor("#8E24AA")
        );

        tituloTema.setPadding(
                20,
                40,
                20,
                30
        );

        layoutContainer.addView(tituloTema);

        // =========================
        // DISCIPLINAS
        // =========================

        for (Disciplina disciplina :
                area.getDisciplinas()) {

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

        LinearLayout layoutDisciplina =
                new LinearLayout(this);

        layoutDisciplina.setOrientation(
                LinearLayout.VERTICAL
        );

        layoutDisciplina.setPadding(
                0,
                10,
                0,
                10
        );

        // =========================
        // HEADER
        // =========================

        LinearLayout header =
                new LinearLayout(this);

        header.setOrientation(
                LinearLayout.HORIZONTAL
        );

        header.setGravity(Gravity.CENTER_VERTICAL);

        header.setPadding(
                10,
                10,
                10,
                10
        );

        // =========================
        // SETA
        // =========================

        TextView seta = new TextView(this);

        seta.setText("►");

        seta.setTextSize(18);

        seta.setPadding(
                10,
                0,
                20,
                0
        );

        // =========================
        // TÍTULO
        // =========================

        TextView titulo = new TextView(this);

        titulo.setText(disciplina.getNome());

        titulo.setTextSize(20);

        titulo.setTypeface(null, Typeface.BOLD);

        titulo.setLayoutParams(
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1
                )
        );

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

        LinearLayout conteudo =
                new LinearLayout(this);

        conteudo.setOrientation(
                LinearLayout.VERTICAL
        );

        conteudo.setPadding(
                70,
                10,
                0,
                10
        );

        // =========================
        // CHECKBOXES
        // =========================

        List<CheckBox> checks =
                new ArrayList<>();

        // =========================
        // CATEGORIAS
        // =========================

        for (Secao secao :
                disciplina.getCategorias()) {

            criarCategoria(
                    secao,
                    conteudo,
                    checks,
                    sw
            );
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

            } else {

                conteudo.setVisibility(View.GONE);

                seta.setText("►");
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

    private void criarCategoria(
            Secao secao,
            LinearLayout parent,
            List<CheckBox> checks,
            Switch sw
    ) {

        // =========================
        // TÍTULO
        // =========================

        TextView tituloCategoria =
                new TextView(this);

        tituloCategoria.setText(
                secao.getNome()
        );

        tituloCategoria.setTextSize(18);

        tituloCategoria.setTypeface(
                null,
                Typeface.BOLD
        );

        tituloCategoria.setBackgroundColor(
                Color.parseColor("#F3E5F5")
        );

        tituloCategoria.setPadding(
                10,
                20,
                10,
                20
        );

        parent.addView(tituloCategoria);

        // =========================
        // ASSUNTOS
        // =========================

        for (Conteudo conteudo :
                secao.getAssuntos()) {

            criarAssunto(
                    conteudo,
                    parent,
                    checks,
                    sw
            );
        }
    }

    // =========================
    // CRIAR ASSUNTO
    // =========================

    private void criarAssunto(
            Conteudo conteudo,
            LinearLayout parent,
            List<CheckBox> checks,
            Switch sw
    ) {

        CheckBox cb = new CheckBox(this);

        cb.setText(conteudo.getNome());

        cb.setTextSize(16);

        cb.setTag(conteudo);

        // =========================
        // RECUPERAR ESTADO
        // =========================

        boolean ativo =
                PreferenceHelperQuestao
                        .assuntoAtivo(
                                this,
                                conteudo.getId()
                        );

        cb.setChecked(ativo);

        // =========================
        // LISTENER
        // =========================

        cb.setOnCheckedChangeListener((buttonView, isChecked) -> {

            Conteudo conteudoCb =
                    (Conteudo) cb.getTag();

            PreferenceHelperQuestao
                    .salvarAssunto(
                            this,
                            conteudoCb.getId(),
                            isChecked
                    );

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
                                new int[]{
                                        android.R.attr.state_checked
                                },
                                new int[]{
                                        -android.R.attr.state_checked
                                }
                        },
                        new int[]{
                                Color.parseColor("#8E24AA"),
                                Color.parseColor("#BDBDBD")
                        }
                );

        ColorStateList trackStates =
                new ColorStateList(
                        new int[][]{
                                new int[]{
                                        android.R.attr.state_checked
                                },
                                new int[]{
                                        -android.R.attr.state_checked
                                }
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

    private void atualizarSwitch(
            Switch sw,
            List<CheckBox> checks
    ) {

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

                Conteudo conteudo =
                        (Conteudo) cb.getTag();

                PreferenceHelperQuestao
                        .salvarAssunto(
                                this,
                                conteudo.getId(),
                                isChecked
                        );

                // =========================
                // RESTAURAR LISTENER
                // =========================

                cb.setOnCheckedChangeListener(
                        (buttonView1, checked) -> {

                            Conteudo conteudoCb =
                                    (Conteudo) cb.getTag();

                            PreferenceHelperQuestao
                                    .salvarAssunto(
                                            this,
                                            conteudoCb.getId(),
                                            checked
                                    );

                            atualizarSwitch(sw, checks);
                        }
                );
            }
        });
    }
}