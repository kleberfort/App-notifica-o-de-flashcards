package com.seuapp.mensageria.data.data_menu_principal;



import com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards.CicloVidaDadoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards.DashboardsInterativosPowerBIFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards.EticaViesesTransparenciaCienciaDadosFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards.OverfittingUnderfittingValidacaoCruzadaFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.analise_dados_flashcards.ProcessamentoLinguagemNaturalFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql.FundamentosBancosDadosFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql.FundamentosModelagemDadosRelacionalFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql.FundamentosSqlParte1Flashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql.FundamentosSqlParte2Flashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.desenvolvimento_software_flashcard.git.GitFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.admnistrativo_flashcard.PrincipiosAdmFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.direito_flashcard.constitucional_flashcard.AplicalidadeHierarquiaNormaFlashcard;
import com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards.AnaliseSeriesTemporaisFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards.ApresentacaoDadosFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards.ClassificacaoPredicaoDadosRegressaoArvoresFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards.MediaMedianaModaFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.estatistica_flashcards.MedidasVariabilidadeDispersaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.ingles_flashcards.CognatesFalseCognateIdiomsFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.ingles_flashcards.IntroducaoScammingSkimmingFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.leis_flashcards.LeiAcessoInformacao_12527_2011_Flashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.leis_flashcards.LeiLGPD_13709_2018_Flashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards.LinguagemPythonFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards.LinguagemRFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.linguagem_programacao_flashcards.PythonBibliotecasVariadasFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.ConceitoTodasClassesPalavrasFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.ConjuncaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.PreposicaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras.VerbosFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.engenharia_software_flashcard.scrum.ScrumFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.engenharia_software_flashcard.xp.XpFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.coordencacao_subordinacao.CoordenacaoSubordinacaoOracaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.pontuacao.PontuacaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.termos_oracao.TiposPredicadoIntegrantesOracaoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.termos_oracao.TiposSujeitoFlashcards;
import com.seuapp.mensageria.flashcard_questoes.flashcards.raciocinio_logico_flashcards.EstruturaLogica_1_Flashcards;
import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class AppFlashcards {

    public static List<Flashcard> getTodosFlashcards() {

        List<Flashcard> todos = new ArrayList<>();



        // =========================
        // DIREITO ADMINISTRATIVO
        // =========================
        todos.addAll(PrincipiosAdmFlashcards.getFlashcards());

        // =========================
        // DIREITO CONSTITUCIONAL
        // =========================
        todos.addAll(AplicalidadeHierarquiaNormaFlashcard.getFlashcards());

        // =========================
        // LEIS
        // =========================
        todos.addAll(LeiAcessoInformacao_12527_2011_Flashcards.getFlashcards());
        todos.addAll(LeiLGPD_13709_2018_Flashcards.getFlashcards());

        // =========================
        // ESTATÍSTICA
        // =========================
        todos.addAll(ApresentacaoDadosFlashcards.getFlashcards());
        todos.addAll(MediaMedianaModaFlashcards.getFlashcards());
        todos.addAll(MedidasVariabilidadeDispersaoFlashcards.getFlashcards());
        todos.addAll(ClassificacaoPredicaoDadosRegressaoArvoresFlashcards.getFlashcards());
        todos.addAll(AnaliseSeriesTemporaisFlashcards.getFlashcards());




        // =========================
        // PORTUGUES
        // =========================

        //CLASSE DE PALAVRAS

        todos.addAll(ConceitoTodasClassesPalavrasFlashcards.getFlashcards());

        todos.addAll(PreposicaoFlashcards.getFlashcards());
        todos.addAll(ConjuncaoFlashcards.getFlashcards());
        todos.addAll(VerbosFlashcards.getFlashcards());

        todos.addAll(CoordenacaoSubordinacaoOracaoFlashcards.getFlashcards());
        todos.addAll(PontuacaoFlashcards.getFlashcards());
        todos.addAll(TiposSujeitoFlashcards.getFlashcards());
        todos.addAll(TiposPredicadoIntegrantesOracaoFlashcards.getFlashcards());


        // =========================
        // ENGENHARIA DE SOFTWARE
        // =========================
        todos.addAll(ScrumFlashcards.getFlashcards());
        todos.addAll(XpFlashcards.getFlashcards());
        todos.addAll(GitFlashcards.getFlashcards());


        // =========================
        // LINGUAGEM DE PROGRAMAÇÃO
        // =========================
        todos.addAll(LinguagemRFlashcards.getFlashcards());
        todos.addAll(LinguagemPythonFlashcards.getFlashcards());
        todos.addAll(PythonBibliotecasVariadasFlashcards.getFlashcards());

        // =========================
        // BANCO DE DADOS
        // =========================
        todos.addAll(FundamentosModelagemDadosRelacionalFlashcards.getFlashcards());
        todos.addAll(FundamentosBancosDadosFlashcards.getFlashcards());
        todos.addAll(FundamentosSqlParte1Flashcards.getFlashcards());
        todos.addAll(FundamentosSqlParte2Flashcards.getFlashcards());

        // =========================
        // ANALISE DE DADOS
        // =========================
        todos.addAll(CicloVidaDadoFlashcards.getFlashcards());
        todos.addAll(EticaViesesTransparenciaCienciaDadosFlashcards.getFlashcards());
        todos.addAll(OverfittingUnderfittingValidacaoCruzadaFlashcards.getFlashcards());
        todos.addAll(ProcessamentoLinguagemNaturalFlashcards.getFlashcards());
        todos.addAll(DashboardsInterativosPowerBIFlashcards.getFlashcards());


        // =========================
        // INGLÊS
        // =========================
        todos.addAll(IntroducaoScammingSkimmingFlashcards.getFlashcards());
        todos.addAll(CognatesFalseCognateIdiomsFlashcards.getFlashcards());


        // =========================
        // RACIOCÍNIO LÓGICO
        // =========================
        todos.addAll(EstruturaLogica_1_Flashcards.getFlashcards());




        return todos;
    }
}
