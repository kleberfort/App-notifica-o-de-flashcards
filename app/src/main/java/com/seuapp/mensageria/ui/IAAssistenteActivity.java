package com.seuapp.mensageria.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.seuapp.mensageria.R;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class IAAssistenteActivity
        extends AppCompatActivity {


    // =====================================================
    // COMPONENTES DA TELA
    // =====================================================

    private TextView textoContexto;

    private TextView textoRespostaIA;

    private EditText campoPergunta;

    private Button btnEnviarPergunta;


    // =====================================================
    // DADOS DO CONTEÚDO
    // =====================================================

    private String idConteudo;

    private String tituloConteudo;

    private String conteudo;


    // =====================================================
    // ON CREATE
    // =====================================================

    @Override
    protected void onCreate(
            Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(
                R.layout.activity_iaassistente
        );


        // =================================================
        // COMPONENTES
        // =================================================

        textoContexto =
                findViewById(
                        R.id.textoContexto
                );


        textoRespostaIA =
                findViewById(
                        R.id.textoRespostaIA
                );


        campoPergunta =
                findViewById(
                        R.id.campoPergunta
                );


        btnEnviarPergunta =
                findViewById(
                        R.id.btnEnviarPergunta
                );


        // =================================================
        // RECEBER ID DO CONTEÚDO
        // =================================================

        idConteudo =
                getIntent().getStringExtra(
                        "ID_CONTEUDO"
                );


        // =================================================
        // RECEBER TÍTULO
        // =================================================

        tituloConteudo =
                getIntent().getStringExtra(
                        "TITULO_CONTEUDO"
                );


        // =================================================
        // RECEBER CONTEÚDO
        // =================================================

        conteudo =
                getIntent().getStringExtra(
                        "CONTEUDO"
                );


        // =================================================
        // VERIFICAR ID
        // =================================================

        if (idConteudo == null ||
                idConteudo.trim().isEmpty()) {

            Toast.makeText(
                    this,
                    "ID do conteúdo não encontrado.",
                    Toast.LENGTH_LONG
            ).show();

            finish();

            return;
        }


        // =================================================
        // VERIFICAR TÍTULO
        // =================================================

        if (tituloConteudo == null) {

            tituloConteudo = "";

        }


        // =================================================
        // VERIFICAR CONTEÚDO
        // =================================================

        if (conteudo == null) {

            conteudo = "";

        }


        // =================================================
        // MOSTRAR CONTEXTO
        // =================================================

        textoContexto.setText(
                tituloConteudo
        );


        // =================================================
        // BOTÃO PERGUNTAR
        // =================================================

        btnEnviarPergunta.setOnClickListener(
                v -> enviarPergunta()
        );
    }


    // =====================================================
    // ENVIAR PERGUNTA
    // =====================================================

    private void enviarPergunta() {


        // =================================================
        // OBTER PERGUNTA
        // =================================================

        String pergunta =
                campoPergunta
                        .getText()
                        .toString()
                        .trim();


        // =================================================
        // VERIFICAR PERGUNTA
        // =================================================

        if (pergunta.isEmpty()) {

            campoPergunta.setError(
                    "Digite uma pergunta."
            );

            return;
        }


        // =================================================
        // VERIFICAR ID
        // =================================================

        if (idConteudo == null ||
                idConteudo.trim().isEmpty()) {

            Toast.makeText(
                    this,
                    "Não foi possível identificar o conteúdo.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // MOSTRAR PROCESSAMENTO
        // =================================================

        textoRespostaIA.setText(
                "Consultando o conteúdo..."
        );


        btnEnviarPergunta.setEnabled(
                false
        );


        // =================================================
        // AQUI ENTRARÁ O RAG
        // =================================================

        consultarRAG(
                idConteudo,
                tituloConteudo,
                pergunta
        );
    }


    // =====================================================
    // CONSULTAR RAG
    // =====================================================

    private void consultarRAG(
            String idConteudo,
            String titulo,
            String pergunta) {


        /*
         *
         * AQUI NÃO VAMOS MAIS:
         *
         * enviar o PDF inteiro
         *
         * nem simplesmente mostrar o conteúdo.
         *
         *
         * Vamos enviar:
         *
         * ID DO CONTEÚDO
         * TÍTULO
         * PERGUNTA
         *
         * para o nosso backend RAG.
         *
         */


        // ================================================
        // POR ENQUANTO É APENAS UM TESTE
        // ================================================

        String mensagemTeste =

                "RAG - TESTE\n\n" +

                        "ID DO CONTEÚDO:\n" +
                        idConteudo +

                        "\n\n" +

                        "TÍTULO:\n" +
                        titulo +

                        "\n\n" +

                        "PERGUNTA:\n" +
                        pergunta;


        textoRespostaIA.setText(
                mensagemTeste
        );


        btnEnviarPergunta.setEnabled(
                true
        );


        campoPergunta.setText("");
    }
}