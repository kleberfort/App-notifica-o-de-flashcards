package com.seuapp.mensageria.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seuapp.mensageria.R;
import com.seuapp.mensageria.data.data_menu_principal.AppFlashcards;
import com.seuapp.mensageria.data.data_menu_principal.MenuPrincipalAppData;
import com.seuapp.mensageria.model.Area;
import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Flashcard;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConteudoActivity extends AppCompatActivity {

    // =====================================================
    // COMPONENTES DA TELA
    // =====================================================

    private LinearLayout layoutConteudo;

    private TextView textoCronometro;

    private Button btnPausar;

    private Button btnConcluir;


    // =====================================================
    // DADOS DA REVISÃO
    // =====================================================

    private ArrayList<String> assuntosAtivos;


    // =====================================================
    // CRONÔMETRO
    // =====================================================

    private Handler handler =
            new Handler(Looper.getMainLooper());

    private long tempoInicial;

    private long tempoPausado = 0;

    private boolean cronometroRodando = false;


    // =====================================================
    // ON CREATE
    // =====================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_conteudo);


        // =================================================
        // COMPONENTES
        // =================================================

        layoutConteudo =
                findViewById(R.id.layoutConteudo);

        textoCronometro =
                findViewById(R.id.textoCronometro);

        btnPausar =
                findViewById(R.id.btnPausar);


        // =================================================
        // INICIAR CRONÔMETRO
        // =================================================

        iniciarCronometro();


        // =================================================
        // BOTÃO PAUSAR / CONTINUAR
        // =================================================

        btnPausar.setOnClickListener(v -> {

            if (cronometroRodando) {

                pausarCronometro();

            } else {

                continuarCronometro();
            }

        });


        // =================================================
        // VERIFICAR SE VEIO DA NOTIFICAÇÃO
        // =================================================

        String tituloNotificacao =
                getIntent().getStringExtra("titulo");

        String conteudoNotificacao =
                getIntent().getStringExtra("conteudo");


        // =================================================
        // ABRIR CONTEÚDO ÚNICO
        // =================================================

        if (tituloNotificacao != null &&
                conteudoNotificacao != null) {

            mostrarConteudoUnico(
                    tituloNotificacao,
                    conteudoNotificacao
            );

            adicionarBotaoConclusao();

            return;
        }


        // =================================================
        // MODO NORMAL
        // =================================================

        assuntosAtivos =
                getIntent().getStringArrayListExtra(
                        "ASSUNTOS_ATIVOS"
                );


        // =================================================
        // VERIFICAR SE EXISTEM ASSUNTOS
        // =================================================

        if (assuntosAtivos == null ||
                assuntosAtivos.isEmpty()) {

            Toast.makeText(
                    this,
                    "Nenhum assunto selecionado.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // OBTER TODOS OS FLASHCARDS
        // =================================================

        List<Flashcard> todos =
                AppFlashcards.getTodosFlashcards();


        // =================================================
        // MATÉRIAS JÁ ADICIONADAS NA TELA
        // =================================================

        List<String> materiasAdicionadas =
                new ArrayList<>();


        // =================================================
        // ADICIONAR TODOS OS CONTEÚDOS SELECIONADOS
        // =================================================

        for (Flashcard card : todos) {


            // ---------------------------------------------
            // VERIFICAR SE O ASSUNTO ESTÁ ATIVO
            // ---------------------------------------------

            if (!assuntosAtivos.contains(
                    card.getAssunto())) {

                continue;
            }


            // ---------------------------------------------
            // ADICIONAR TÍTULO DA MATÉRIA
            // ---------------------------------------------

            if (!materiasAdicionadas.contains(
                    card.getMateria())) {


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


                // Permite selecionar o nome da matéria
                tituloMateria.setTextIsSelectable(true);


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


            // ---------------------------------------------
            // ADICIONAR FLASHCARD
            // ---------------------------------------------

            adicionarFlashcard(
                    card.getTitulo(),
                    card.getConteudo()
            );
        }


        // =================================================
        // BOTÃO CONCLUIR REVISÃO
        // =================================================

        adicionarBotaoConclusao();
    }


    // =====================================================
    // MOSTRAR CONTEÚDO ÚNICO
    // =====================================================

    private void mostrarConteudoUnico(
            String tituloTexto,
            String conteudoTexto) {

        adicionarFlashcard(
                tituloTexto,
                conteudoTexto
        );
    }


    // =====================================================
    // ADICIONAR FLASHCARD
    // =====================================================

    private void adicionarFlashcard(
            String tituloTexto,
            String conteudoTexto) {

        // =================================================
        // TEXTVIEW ÚNICO
        // =================================================

        TextView textoCompleto =
                new TextView(this);


        // =================================================
        // CRIAR TEXTO COMPLETO
        // =================================================

        String texto =
                tituloTexto +
                        "\n\n" +
                        conteudoTexto;


        SpannableString spannable =
                new SpannableString(texto);


        // =================================================
        // FORMATAÇÃO DO TÍTULO
        // =================================================

        int inicioTitulo = 0;

        int fimTitulo =
                tituloTexto.length();


        // Negrito
        spannable.setSpan(
                new StyleSpan(Typeface.BOLD),
                inicioTitulo,
                fimTitulo,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );


        // Tamanho do título
        spannable.setSpan(
                new RelativeSizeSpan(1.25f),
                inicioTitulo,
                fimTitulo,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );


        // =================================================
        // COLOCAR TEXTO NO TEXTVIEW
        // =================================================

        textoCompleto.setText(
                spannable
        );


        // =================================================
        // TAMANHO PADRÃO DO CONTEÚDO
        // =================================================

        textoCompleto.setTextSize(16);


        // =================================================
        // ESPAÇAMENTO ENTRE LINHAS
        // =================================================

        textoCompleto.setLineSpacing(
                1.2f,
                1.2f
        );


        // =================================================
        // PERMITIR SELEÇÃO
        // =================================================

        textoCompleto.setTextIsSelectable(true);


        // =================================================
        // PADDING
        // =================================================

        textoCompleto.setPadding(
                20,
                30,
                0,
                30
        );


        // =================================================
        // ADICIONAR NA TELA
        // =================================================

        layoutConteudo.addView(
                textoCompleto
        );
    }


    // =====================================================
    // INICIAR CRONÔMETRO
    // =====================================================

    private void iniciarCronometro() {

        tempoInicial =
                SystemClock.elapsedRealtime();

        tempoPausado = 0;

        cronometroRodando = true;

        atualizarCronometro();
    }


    // =====================================================
    // ATUALIZAR CRONÔMETRO
    // =====================================================

    private void atualizarCronometro() {

        if (!cronometroRodando) {

            return;
        }


        long tempoDecorrido =
                SystemClock.elapsedRealtime()
                        - tempoInicial;


        atualizarTextoCronometro(
                tempoDecorrido
        );


        handler.postDelayed(
                this::atualizarCronometro,
                1000
        );
    }


    // =====================================================
    // MOSTRAR TEMPO NA TELA
    // =====================================================

    private void atualizarTextoCronometro(
            long tempo) {


        long segundos =
                tempo / 1000;


        long horas =
                segundos / 3600;


        long minutos =
                (segundos % 3600) / 60;


        long segundosRestantes =
                segundos % 60;


        String tempoFormatado;


        // ---------------------------------------------
        // SE PASSOU DE UMA HORA
        // ---------------------------------------------

        if (horas > 0) {

            tempoFormatado =
                    String.format(
                            Locale.getDefault(),
                            "%02d:%02d:%02d",
                            horas,
                            minutos,
                            segundosRestantes
                    );

        }


        // ---------------------------------------------
        // MENOS DE UMA HORA
        // ---------------------------------------------

        else {

            tempoFormatado =
                    String.format(
                            Locale.getDefault(),
                            "%02d:%02d",
                            minutos,
                            segundosRestantes
                    );
        }


        textoCronometro.setText(
                tempoFormatado
        );
    }


    // =====================================================
    // PAUSAR CRONÔMETRO
    // =====================================================

    private void pausarCronometro() {

        if (!cronometroRodando) {

            return;
        }


        tempoPausado =
                SystemClock.elapsedRealtime()
                        - tempoInicial;


        cronometroRodando = false;


        btnPausar.setText(
                "Continuar"
        );
    }


    // =====================================================
    // CONTINUAR CRONÔMETRO
    // =====================================================

    private void continuarCronometro() {

        tempoInicial =
                SystemClock.elapsedRealtime()
                        - tempoPausado;


        cronometroRodando = true;


        btnPausar.setText(
                "Pausar"
        );


        atualizarCronometro();
    }


    // =====================================================
    // ADICIONAR BOTÃO DE CONCLUSÃO
    // =====================================================

    private void adicionarBotaoConclusao() {

        btnConcluir =
                new Button(this);


        btnConcluir.setText(
                "✓ Concluir revisão"
        );


        btnConcluir.setTextSize(16);


        btnConcluir.setOnClickListener(
                v -> concluirRevisao()
        );


        // =================================================
        // TAMANHO E MARGENS
        // =================================================

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );


        params.setMargins(
                0,
                40,
                0,
                40
        );


        btnConcluir.setLayoutParams(
                params
        );


        // =================================================
        // ADICIONAR DEPOIS DE TODO O CONTEÚDO
        // =================================================

        layoutConteudo.addView(
                btnConcluir
        );
    }


    // =====================================================
    // CONCLUIR REVISÃO
    // =====================================================

    private void concluirRevisao() {

        // =================================================
        // VERIFICAR SE EXISTEM ASSUNTOS
        // =================================================

        if (assuntosAtivos == null ||
                assuntosAtivos.isEmpty()) {

            Toast.makeText(
                    this,
                    "Nenhum conteúdo selecionado.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // OBTER TODAS AS ÁREAS
        // =================================================

        List<Area> areas =
                MenuPrincipalAppData.getAreas();


        // =================================================
        // DISCIPLINAS SELECIONADAS
        // =================================================

        List<Disciplina> disciplinasSelecionadas =
                new ArrayList<>();


        // =================================================
        // ÁREA DA DISCIPLINA SELECIONADA
        // =================================================

        Area areaSelecionada = null;


        // =================================================
        // PERCORRER TODA A ESTRUTURA
        // =================================================

        for (Area area : areas) {

            for (Disciplina disciplina :
                    area.getDisciplinas()) {

                boolean possuiSelecionado = false;


                for (Secao secao :
                        disciplina.getCategorias()) {

                    for (Conteudo conteudo :
                            secao.getAssuntos()) {

                        if (assuntosAtivos.contains(
                                conteudo.getId())) {

                            possuiSelecionado = true;

                            break;
                        }
                    }


                    if (possuiSelecionado) {

                        break;
                    }
                }


                // =========================================
                // DISCIPLINA POSSUI CONTEÚDO SELECIONADO
                // =========================================

                if (possuiSelecionado) {

                    disciplinasSelecionadas.add(
                            disciplina
                    );


                    areaSelecionada = area;
                }
            }
        }


        Log.d(
                "DISCIPLINAS",
                "Quantidade: " +
                        disciplinasSelecionadas.size()
        );


        for (Disciplina disciplina :
                disciplinasSelecionadas) {

            Log.d(
                    "DISCIPLINAS",
                    "Nome: " +
                            disciplina.getNome()
            );

            Log.d(
                    "DISCIPLINAS",
                    "Dados: " +
                            disciplina
            );
        }


        // =================================================
        // REGRA 1
        // =================================================

        if (disciplinasSelecionadas.size() != 1) {

            Toast.makeText(
                    this,
                    "A revisão só pode ser concluída com apenas uma disciplina selecionada.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // OBTER A ÚNICA DISCIPLINA
        // =================================================

        Disciplina disciplinaSelecionada =
                disciplinasSelecionadas.get(0);


        // =================================================
        // CONTAR TODOS OS CONTEÚDOS
        // =================================================

        int totalConteudosDisciplina = 0;


        for (Secao secao :
                disciplinaSelecionada.getCategorias()) {

            totalConteudosDisciplina +=
                    secao.getAssuntos().size();
        }


        // =================================================
        // CONTAR CONTEÚDOS SELECIONADOS
        // =================================================

        int conteudosSelecionados = 0;


        for (Secao secao :
                disciplinaSelecionada.getCategorias()) {

            for (Conteudo conteudo :
                    secao.getAssuntos()) {

                if (assuntosAtivos.contains(
                        conteudo.getId())) {

                    conteudosSelecionados++;
                }
            }
        }


        // =================================================
        // REGRA 2
        // =================================================

        if (conteudosSelecionados !=
                totalConteudosDisciplina) {

            Toast.makeText(
                    this,
                    "Para concluir a revisão, todos os conteúdos da disciplina devem estar selecionados.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // VERIFICAR ÁREA
        // =================================================

        if (areaSelecionada == null) {

            Toast.makeText(
                    this,
                    "Não foi possível identificar a área da disciplina.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }


        // =================================================
        // REVISÃO VÁLIDA
        // =================================================

        if (cronometroRodando) {

            pausarCronometro();
        }


        // =================================================
        // TEMPO TOTAL
        // =================================================

        long tempoFinal =
                tempoPausado;


        long segundos =
                tempoFinal / 1000;


        long minutos =
                segundos / 60;


        long segundosRestantes =
                segundos % 60;


        String tempo =
                String.format(
                        Locale.getDefault(),
                        "%02d:%02d",
                        minutos,
                        segundosRestantes
                );


        // =================================================
        // ABRIR PLANILHA DE REVISÃO
        // =================================================

        Intent intent =
                new Intent(
                        ConteudoActivity.this,
                        PlanilhaRevisaoConteudoActivity.class
                );


        intent.putExtra(
                "AREA",
                areaSelecionada.getNome()
        );


        intent.putExtra(
                "DISCIPLINA",
                disciplinaSelecionada.getNome()
        );


        intent.putExtra(
                "TOTAL_CONTEUDOS",
                totalConteudosDisciplina
        );


        intent.putExtra(
                "CONTEUDOS_SELECIONADOS",
                conteudosSelecionados
        );


        intent.putExtra(
                "TEMPO",
                tempo
        );


        startActivity(intent);


        finish();
    }


    // =====================================================
    // ENCERRAR ACTIVITY
    // =====================================================

    @Override
    protected void onDestroy() {

        super.onDestroy();

        handler.removeCallbacksAndMessages(null);
    }
}