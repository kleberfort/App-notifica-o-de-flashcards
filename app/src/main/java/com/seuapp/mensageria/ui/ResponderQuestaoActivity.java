package com.seuapp.mensageria.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.seuapp.mensageria.BancoQuestoes;
import com.seuapp.mensageria.R;
import com.seuapp.mensageria.model.QuestaoMultiplaEscolha;

import java.util.ArrayList;
import java.util.List;

public class ResponderQuestaoActivity extends AppCompatActivity {

    private TextView txtContador;
    private TextView txtInfo;
    private TextView txtTextoApoio;  // NOVO
    private TextView txtEnunciado;
    private TextView txtResultado;
    private TextView txtComentario;

    private RadioGroup radioGroup;

    private RadioButton radioA;
    private RadioButton radioB;
    private RadioButton radioC;
    private RadioButton radioD;
    private RadioButton radioE;

    private Button btnResponder;

    private ImageButton btnAnterior;
    private ImageButton btnProxima;

    // =========================
    // QUESTÕES
    // =========================

    private List<QuestaoMultiplaEscolha> listaQuestoes = new ArrayList<>();
    private int questaoAtual = 0;

    // =========================
    // ON CREATE
    // =========================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_responder_questao);

        // =========================
        // COMPONENTES
        // =========================

        txtContador = findViewById(R.id.txtContador);
        txtInfo = findViewById(R.id.txtInfo);
        txtTextoApoio = findViewById(R.id.txtTextoApoio);  // NOVO
        txtEnunciado = findViewById(R.id.txtEnunciado);
        txtResultado = findViewById(R.id.txtResultado);
        txtComentario = findViewById(R.id.txtComentario);

        radioGroup = findViewById(R.id.radioGroup);

        radioA = findViewById(R.id.radioA);
        radioB = findViewById(R.id.radioB);
        radioC = findViewById(R.id.radioC);
        radioD = findViewById(R.id.radioD);
        radioE = findViewById(R.id.radioE);

        btnResponder = findViewById(R.id.btnResponder);
        btnAnterior = findViewById(R.id.btnAnterior);
        btnProxima = findViewById(R.id.btnProxima);

        // =========================
        // RECEBER ASSUNTOS
        // =========================

        ArrayList<String> assuntos = getIntent().getStringArrayListExtra("ASSUNTOS_QUESTAO");

        // =========================
        // CARREGAR QUESTÕES
        // =========================

        if (assuntos != null) {
            for (String assuntoId : assuntos) {
                listaQuestoes.addAll(BancoQuestoes.getQuestoes(assuntoId));
            }
        }

        // =========================
        // MOSTRAR QUESTÃO
        // =========================

        if (!listaQuestoes.isEmpty()) {
            mostrarQuestao();
        }

        // =========================
        // RESPONDER
        // =========================

        btnResponder.setOnClickListener(v -> verificarResposta());

        // =========================
        // PRÓXIMA
        // =========================

        btnProxima.setOnClickListener(v -> {
            if (questaoAtual < listaQuestoes.size() - 1) {
                questaoAtual++;
                mostrarQuestao();
            }
        });

        // =========================
        // ANTERIOR
        // =========================

        btnAnterior.setOnClickListener(v -> {
            if (questaoAtual > 0) {
                questaoAtual--;
                mostrarQuestao();
            }
        });
    }

    // =========================
    // MOSTRAR QUESTÃO
    // =========================

    private void mostrarQuestao() {
        QuestaoMultiplaEscolha questao = listaQuestoes.get(questaoAtual);

        txtContador.setText((questaoAtual + 1) + " de " + listaQuestoes.size());
        txtInfo.setText(questao.getInformacao());

        // =========================
        // EXIBIR TEXTO DE APOIO (SE EXISTIR)
        // =========================

        if (questao.temTextoApoio()) {
            txtTextoApoio.setVisibility(View.VISIBLE);
            txtTextoApoio.setText(questao.getTextoApoio());
        } else {
            txtTextoApoio.setVisibility(View.GONE);
            txtTextoApoio.setText("");  // Limpa o texto antigo (opcional, mas boa prática)
        }

        txtEnunciado.setText(questao.getEnunciado());

        radioA.setText("A) " + questao.getAlternativaA());
        radioB.setText("B) " + questao.getAlternativaB());
        radioC.setText("C) " + questao.getAlternativaC());
        radioD.setText("D) " + questao.getAlternativaD());
        radioE.setText("E) " + questao.getAlternativaE());

        // =========================
        // RESET
        // =========================

        radioGroup.clearCheck();
        txtResultado.setVisibility(View.GONE);
        txtComentario.setVisibility(View.GONE);
    }

    // =========================
    // VERIFICAR RESPOSTA
    // =========================

    private void verificarResposta() {
        int checkedId = radioGroup.getCheckedRadioButtonId();

        if (checkedId == -1) {
            Toast.makeText(this, "Selecione uma alternativa", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton rb = findViewById(checkedId);
        String respostaUsuario = rb.getText().toString().substring(0, 1).toLowerCase();

        QuestaoMultiplaEscolha questao = listaQuestoes.get(questaoAtual);
        String correta = questao.getRespostaCorreta();

        txtResultado.setVisibility(View.VISIBLE);
        txtComentario.setVisibility(View.VISIBLE);

        if (respostaUsuario.equals(correta)) {
            txtResultado.setText("✅ RESPOSTA CORRETA");
            txtResultado.setTextColor(Color.parseColor("#4CAF50"));
        } else {
            txtResultado.setText("❌ RESPOSTA ERRADA\nCorreta: " + correta.toUpperCase());
            txtResultado.setTextColor(Color.parseColor("#F44336"));
        }

        txtComentario.setText(questao.getExplicacao());
    }
}