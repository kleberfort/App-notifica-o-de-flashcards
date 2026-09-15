package com.seuapp.mensageria.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.seuapp.mensageria.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



public class PlanilhaRevisaoConteudoActivity extends AppCompatActivity {

    // =====================================================
    // COMPONENTES
    // =====================================================

    private LinearLayout layoutListaRevisoes;


    // =====================================================
    // SHARED PREFERENCES
    // =====================================================

    private static final String PREFS_NAME =
            "HISTORICO_REVISOES";

    private static final String CHAVE_REVISOES =
            "lista_revisoes";


    // =====================================================
    // ON CREATE
    // =====================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(
                R.layout.activity_planilha_revisao_conteudo
        );


        // =================================================
        // AJUSTE DAS BORDAS DO SISTEMA
        // =================================================

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {

                    Insets systemBars =
                            insets.getInsets(
                                    WindowInsetsCompat.Type.systemBars()
                            );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );


        // =================================================
        // COMPONENTE DA LISTA
        // =================================================

        layoutListaRevisoes =
                findViewById(R.id.layoutListaRevisoes);


        // =================================================
        // VERIFICAR SE RECEBEU UMA NOVA REVISÃO
        // =================================================

        receberNovaRevisao();


        // =================================================
        // CARREGAR HISTÓRICO
        // =================================================

        carregarHistorico();

    }


    // =====================================================
    // RECEBER NOVA REVISÃO
    // =====================================================

    private void receberNovaRevisao() {

        Intent intent = getIntent();


        // =================================================
        // RECEBER ÁREA
        // =================================================

        String area =
                intent.getStringExtra("AREA");


        // =================================================
        // RECEBER DISCIPLINA
        // =================================================

        String disciplina =
                intent.getStringExtra("DISCIPLINA");


        // =================================================
        // RECEBER TEMPO
        // =================================================

        String tempo =
                intent.getStringExtra("TEMPO");


        // =================================================
        // VERIFICAR SE EXISTEM DADOS
        // =================================================

        if (area == null ||
                disciplina == null ||
                tempo == null) {

            return;
        }


        // =================================================
        // DATA E HORA ATUAL
        // =================================================

        String dataHora =
                new SimpleDateFormat(
                        "dd/MM/yyyy HH:mm",
                        Locale.getDefault()
                ).format(
                        new Date()
                );


        // =================================================
        // SALVAR NOVA REVISÃO
        // =================================================

        salvarRevisao(
                dataHora,
                area,
                disciplina,
                tempo
        );

    }


    // =====================================================
    // SALVAR REVISÃO
    // =====================================================

    private void salvarRevisao(
            String data,
            String area,
            String disciplina,
            String tempo) {


        // =================================================
        // OBTER PREFERENCES
        // =================================================

        SharedPreferences preferences =
                getSharedPreferences(
                        PREFS_NAME,
                        MODE_PRIVATE
                );


        String jsonAtual =
                preferences.getString(
                        CHAVE_REVISOES,
                        "[]"
                );


        try {

            JSONArray lista =
                    new JSONArray(jsonAtual);


            // =================================================
            // NOVA REVISÃO
            // =================================================

            JSONObject revisao =
                    new JSONObject();


            revisao.put(
                    "data",
                    data
            );


            revisao.put(
                    "area",
                    area
            );


            revisao.put(
                    "disciplina",
                    disciplina
            );


            revisao.put(
                    "tempo",
                    tempo
            );


            // =================================================
            // ADICIONAR NO INÍCIO
            // =================================================

            JSONArray novaLista =
                    new JSONArray();


            novaLista.put(
                    revisao
            );


            // =================================================
            // COPIAR HISTÓRICO ANTIGO
            // =================================================

            for (int i = 0;
                 i < lista.length();
                 i++) {

                novaLista.put(
                        lista.getJSONObject(i)
                );

            }


            // =================================================
            // SALVAR
            // =================================================

            preferences
                    .edit()
                    .putString(
                            CHAVE_REVISOES,
                            novaLista.toString()
                    )
                    .apply();


        } catch (JSONException e) {

            e.printStackTrace();

        }

    }


    // =====================================================
    // CARREGAR HISTÓRICO
    // =====================================================

    private void carregarHistorico() {

        layoutListaRevisoes.removeAllViews();


        SharedPreferences preferences =
                getSharedPreferences(
                        PREFS_NAME,
                        MODE_PRIVATE
                );


        String jsonAtual =
                preferences.getString(
                        CHAVE_REVISOES,
                        "[]"
                );


        try {

            JSONArray lista =
                    new JSONArray(jsonAtual);


            // =================================================
            // VERIFICAR SE ESTÁ VAZIA
            // =================================================

            if (lista.length() == 0) {

                TextView vazio =
                        new TextView(this);


                vazio.setText(
                        "Nenhuma revisão registrada."
                );


                vazio.setTextSize(16);


                vazio.setGravity(
                        Gravity.CENTER
                );


                vazio.setPadding(
                        20,
                        40,
                        20,
                        40
                );


                layoutListaRevisoes.addView(
                        vazio
                );


                return;

            }


            // =================================================
            // PERCORRER HISTÓRICO
            // =================================================

            for (int i = 0;
                 i < lista.length();
                 i++) {

                JSONObject revisao =
                        lista.getJSONObject(i);


                String data =
                        revisao.getString("data");


                String area =
                        revisao.getString("area");


                String disciplina =
                        revisao.getString("disciplina");


                String tempo =
                        revisao.getString("tempo");


                adicionarLinha(
                        i,
                        data,
                        area,
                        disciplina,
                        tempo
                );

            }


        } catch (JSONException e) {

            e.printStackTrace();

        }

    }


    // =====================================================
    // ADICIONAR LINHA
    // =====================================================

    private void adicionarLinha(
            int indice,
            String data,
            String area,
            String disciplina,
            String tempo) {


        // =================================================
        // LINHA PRINCIPAL
        // =================================================

        LinearLayout linha =
                new LinearLayout(this);


        linha.setOrientation(
                LinearLayout.HORIZONTAL
        );


        linha.setGravity(
                Gravity.CENTER_VERTICAL
        );


        linha.setPadding(
                8,
                16,
                8,
                16
        );


        // =================================================
        // DATA
        // =================================================

        TextView textoData =
                criarCelula(
                        data,
                        2.0f
                );


        textoData.setGravity(
                Gravity.CENTER
        );


        textoData.setBackground(
                criarFundoCelula("#ECEFF1")
        );


        // =================================================
        // ÁREA
        // =================================================

        TextView textoArea =
                criarCelula(
                        area,
                        1.2f
                );


        textoArea.setGravity(
                Gravity.CENTER
        );


        // =================================================
        // COR DINÂMICA DA ÁREA
        // =================================================

        textoArea.setBackground(
                criarFundoCelula(
                        obterCorArea(area)
                )
        );


        // =================================================
        // DISCIPLINA
        // =================================================

        TextView textoDisciplina =
                criarCelula(
                        disciplina,
                        1.5f
                );


        textoDisciplina.setGravity(
                Gravity.CENTER
        );


        textoDisciplina.setBackground(
                criarFundoCelula("#E8F5E9")
        );


        // =================================================
        // TEMPO
        // =================================================

        TextView textoTempo =
                criarCelula(
                        tempo,
                        1.0f
                );


        textoTempo.setGravity(
                Gravity.CENTER
        );


        textoTempo.setBackground(
                criarFundoCelula("#FFF3E0")
        );


        // =================================================
        // ADICIONAR CÉLULAS
        // =================================================

        linha.addView(
                textoData
        );


        linha.addView(
                textoArea
        );


        linha.addView(
                textoDisciplina
        );


        linha.addView(
                textoTempo
        );


        // =================================================
        // LINHA DIVISÓRIA
        // =================================================

        View divisor =
                new View(this);


        divisor.setLayoutParams(
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        1
                )
        );


        divisor.setBackgroundColor(
                Color.LTGRAY
        );


        // =================================================
        // ADICIONAR À LISTA
        // =================================================

        layoutListaRevisoes.addView(
                linha
        );


        layoutListaRevisoes.addView(
                divisor
        );


        // =================================================
        // CLIQUE NA LINHA
        // =================================================

        linha.setOnClickListener(v -> {

            new AlertDialog.Builder(this)

                    .setTitle(
                            "Excluir revisão"
                    )

                    .setMessage(
                            "Deseja excluir esta revisão?\n\n" +
                                    disciplina + "\n" +
                                    data
                    )

                    .setNegativeButton(
                            "Cancelar",
                            null
                    )

                    .setPositiveButton(
                            "Excluir",
                            (dialog, which) -> {

                                excluirRevisao(
                                        indice
                                );

                            }
                    )

                    .show();

        });

    }


    // =====================================================
    // OBTER COR DA ÁREA
    // =====================================================

    private String obterCorArea(String area) {

        switch (area.trim().toLowerCase(Locale.ROOT)) {

            case "inglês":
            case "ingles":
                return "#E3F2FD"; // Azul-claro

            case "banco de dados":
                return "#E8F5E9"; // Verde-claro

            case "análise de dados":
            case "analise de dados":
                return "#FFF9C4"; // Amarelo-claro

            case "língua portuguesa":
            case "lingua portuguesa":
                return "#F3E5F5"; // Lilás

            case "raciocínio lógico":
            case "raciocinio logico":
                return "#FFF3E0"; // Laranja-claro

            case "ciência de dados":
            case "ciencia de dados":
                return "#E0F7FA"; // Ciano-claro

            case "programação":
            case "programacao":
                return "#FCE4EC"; // Rosa-claro

            case "direito constitucional":
                return "#EDE7F6"; // Roxo-claro

            case "direito administrativo":
                return "#EFEBE9"; // Marrom-claro

            case "matemática":
            case "matematica":
                return "#E8EAF6"; // Índigo-claro

            case "informática":
            case "informatica":
                return "#F1F8E9"; // Verde-lima-claro

            default:
                return "#F5F5F5"; // Cinza padrão

        }

    }


    // =====================================================
    // CRIAR FUNDO DA CÉLULA
    // =====================================================

    private GradientDrawable criarFundoCelula(
            String cor) {


        GradientDrawable fundo =
                new GradientDrawable();


        fundo.setColor(
                Color.parseColor(cor)
        );


        fundo.setCornerRadius(
                16f
        );


        fundo.setStroke(
                1,
                Color.parseColor("#DDDDDD")
        );


        return fundo;

    }


    // =====================================================
    // EXCLUIR REVISÃO
    // =====================================================

    private void excluirRevisao(
            int indice) {


        SharedPreferences preferences =
                getSharedPreferences(
                        PREFS_NAME,
                        MODE_PRIVATE
                );


        String jsonAtual =
                preferences.getString(
                        CHAVE_REVISOES,
                        "[]"
                );


        try {

            JSONArray lista =
                    new JSONArray(jsonAtual);


            if (indice < 0 ||
                    indice >= lista.length()) {

                return;

            }


            lista.remove(
                    indice
            );


            preferences
                    .edit()
                    .putString(
                            CHAVE_REVISOES,
                            lista.toString()
                    )
                    .apply();


            carregarHistorico();


            Toast.makeText(
                    this,
                    "Revisão excluída.",
                    Toast.LENGTH_SHORT
            ).show();


        } catch (JSONException e) {

            e.printStackTrace();


            Toast.makeText(
                    this,
                    "Erro ao excluir a revisão.",
                    Toast.LENGTH_SHORT
            ).show();

        }

    }


    // =====================================================
    // CRIAR CÉLULA
    // =====================================================

    private TextView criarCelula(
            String texto,
            float peso) {


        TextView textView =
                new TextView(this);


        textView.setText(
                texto
        );


        textView.setTextSize(
                14
        );


        textView.setTextColor(
                Color.rgb(40, 40, 40)
        );


        textView.setPadding(
                10,
                10,
                10,
                10
        );


        textView.setGravity(
                Gravity.CENTER_VERTICAL
        );


        textView.setLayoutParams(
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        peso
                )
        );


        return textView;

    }

}