package com.seuapp.mensageria.data;

import com.seuapp.mensageria.model.Assunto;
import com.seuapp.mensageria.model.Categoria;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.GrupoAssunto;
import com.seuapp.mensageria.model.Tema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppData {

    public static List<Tema> getTemas() {


        // =====================================
        // LISTA DE TEMAS
        // =====================================
        List<Tema> temas = new ArrayList<>();
        List<Disciplina> disciplinasEngenhariaSoftware = new ArrayList<>();
        List<Disciplina> disciplinasDesenvSoftware = new ArrayList<>();
        temas.add(new Tema("Engenharia de Software", disciplinasEngenhariaSoftware));
        temas.add(new Tema("Desenvolvimento de Software", disciplinasDesenvSoftware));


        // =====================================
        // ENGENHARIA DE SOFTWARE
        // =====================================

        // =====================================
        // ASSUNTOS SCRUM
        // =====================================

        // =====================================
        // CATEGORIAS E DISCIPLINAS
        // =====================================
        List<Categoria> scrumCategorias = new ArrayList<>();
        disciplinasEngenhariaSoftware.add(new Disciplina("Scrum", scrumCategorias));

        //CONCEITO
        List<Assunto> scrumConceitos = new ArrayList<>();
        scrumConceitos.add(new Assunto("SCRUM_CONCEITO", "O que é SCRUM?"));
        scrumConceitos.add(new Assunto("SCRUM_CYNEFIN", "Teoria da Complexidade (Cynefin)"));
        scrumConceitos.add(new Assunto("SCRUM_CILADAS_CONCEITO", "Principais CILADAS:"));
        scrumCategorias.add(new Categoria("Conceitos", scrumConceitos ));


        // PAPÉIS
        List<Assunto> scrumPapeis = new ArrayList<>();
        scrumPapeis.add(new Assunto("PAPEL_PO", "Product Owner (PO)"));
        scrumPapeis.add(new Assunto("PAPEL_PO_REGRA_OURO", "PO - REGRA DE OURO"));
        scrumPapeis.add(new Assunto("PAPEL_TIME", "Time de Desenvolvimento"));
        scrumPapeis.add(new Assunto("PAPEL_TIME_RESP", "Time Dev - RESPONSABILIDADES"));
        scrumPapeis.add(new Assunto("PAPEL_SM", "Scrum Master (SM)"));
        scrumPapeis.add(new Assunto("PAPEL_SM_PROIBICOES", "SM - PROIBIÇÕES"));
        scrumCategorias.add(new Categoria("Papéis", scrumPapeis));


        // ARTEFATOS
        List<Assunto> scrumArtefatos = new ArrayList<>();
        scrumArtefatos.add(new Assunto("ARTEFATO_PB", "Product Backlog (PB)"));
        scrumArtefatos.add(new Assunto("ARTEFATO_PB_CARACTERISTICAS", "PB - CARACTERÍSTICAS"));
        scrumArtefatos.add(new Assunto("ARTEFATO_SB", "Sprint Backlog"));
        scrumArtefatos.add(new Assunto("ARTEFATO_DOD", "Definition of Done (DoD)"));
        scrumArtefatos.add(new Assunto("ARTEFATO_INCREMENTO_META", "INCREMENTO e META da SPRINT:"));
        scrumArtefatos.add(new Assunto("ARTEFATO_BURNDOWN", "Burndown Chart (OPCIONAL)"));
        scrumCategorias.add(new Categoria("Artefatos", scrumArtefatos));

        // ESTIMATIVAS
        List<Assunto> scrumEstimativas = new ArrayList<>();
        scrumEstimativas.add(new Assunto("ESTIMATIVA_CONCEITO", "Estimativas Ágeis"));
        scrumEstimativas.add(new Assunto("ESTIMATIVA_PLANNING_POKER", "Planning Poker"));
        scrumEstimativas.add(new Assunto("ESTIMATIVA_VELOCIDADE", "VELOCIDADE (Velocity)"));
        scrumEstimativas.add(new Assunto("ESTIMATIVA_USER_STORIES", "User Stories (Histórias de Usuário)"));
        scrumCategorias.add(new Categoria("Estimativas", scrumEstimativas));

        // EVENTOS
        List<Assunto> scrumEventos = new ArrayList<>();
        scrumEventos.add(new Assunto("EVENTO_SPRINT", "A SPRINT"));
        scrumEventos.add(new Assunto("EVENTO_PLANNING", "Sprint Planning"));
        scrumEventos.add(new Assunto("EVENTO_DAILY", "Daily Scrum"));
        scrumEventos.add(new Assunto("EVENTO_REVIEW", "Sprint Review"));
        scrumEventos.add(new Assunto("EVENTO_RETROSPECTIVE", "Sprint Retrospective"));
        scrumEventos.add(new Assunto("EVENTO_ORDEM", "ORDEM dos EVENTOS (fim da Sprint)"));
        scrumCategorias.add(new Categoria("Eventos", scrumEventos));

        // SRCUM COMPARAÇÕES
        List<Assunto> scrumComparacoes = new ArrayList<>();
        scrumComparacoes.add(new Assunto("COMPARA_SCRUM_XP", "SCRUM vs XP"));
        scrumComparacoes.add(new Assunto("COMPARA_SCRUM_KANBAN", "SCRUM vs KANBAN"));
        scrumComparacoes.add(new Assunto("COMPARA_KANBAN", "KANBAN - Fundamentos"));
        scrumCategorias.add(new Categoria("Comparações", scrumComparacoes));

        // SRCUM - RESUMO
        List<Assunto> scrumResumo = new ArrayList<>();
        scrumResumo.add(new Assunto("RESUMO_QUEM_FAZ", "QUEM FAZ O QUÊ? (RESUMÃO)"));
        scrumResumo.add(new Assunto("RESUMO_CILADAS_MORAIS", "CILADAS MORAIS (DECORE!)"));
        scrumResumo.add(new Assunto("RESUMO_REGRAS_OURO", "REGRAS DE OURO (GUARDE!)"));
        scrumCategorias.add(new Categoria("Resumo", scrumResumo));



        // =====================================
        // ASSUNTO XP
        // =====================================

        List<Categoria> xpCategorias = new ArrayList<>();

        List<Assunto> xpConceitos = new ArrayList<>();

        xpConceitos.add(new Assunto("XP_1", "O que é XP"));
        xpConceitos.add(new Assunto("XP_2", "Práticas do XP"));
        xpCategorias.add(new Categoria("Conceitos", xpConceitos));
        disciplinasEngenhariaSoftware.add(new Disciplina("XP", xpCategorias));


        // =====================================
        // DESENVOLVIMENTO DE SOFTWARE
        // =====================================

        // =====================================
        // ASSUNTO GIT
        // =====================================

        List<Categoria> gitCategorias = new ArrayList<>();


        disciplinasDesenvSoftware.add(new Disciplina("GIT", gitCategorias));

        // =========================
        // GIT - CONCEITOS FUNDAMENTAIS
        // =========================
        List<Assunto> gitConceitos = new ArrayList<>();
        gitConceitos.add(new Assunto("GIT_CONCEITO_01", "O que é GIT"));
        gitConceitos.add(new Assunto("GIT_CONCEITO_02", "Diferença fundamental"));
        gitCategorias.add(new Categoria("Conceitos", gitConceitos));


        // =========================
        // GIT - ESTADOS DOS ARQUIVOS
        // =========================

        List<Assunto> gitEstadosArquivos = new ArrayList<>();
        gitEstadosArquivos.add(new Assunto("GIT_ESTADOS_01", "Áreas/Estados do Git"));
        gitEstadosArquivos.add(new Assunto("GIT_ESTADOS_02", "Função da Staging Area"));
        gitCategorias.add(new Categoria("Estados dos arquivos", gitEstadosArquivos));


        // =========================
        // GIT - COMANDOS BÁSICOS
        // =========================

        List<Assunto> gitComandosBasicos = new ArrayList<>();
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_01", "git init"));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_02", "git status"));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_03", "git add <arquivo>"));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_04", "git commit -m \"mensagem\""));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_05", "Exibe o histórico de commits"));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_06", "git show <hash>"));
        gitComandosBasicos.add(new Assunto("GIT_COMANDO_07", "git blame <arquivo>"));
        gitCategorias.add(new Categoria("Comandos Básicos", gitComandosBasicos));

        // =========================
        // GIT - COMANDOS DE SINCRONIZAÇÃO
        // =========================

        List<Assunto> gitComandosSincronizacao = new ArrayList<>();
        gitComandosSincronizacao.add(new Assunto("GIT_SINCRONIA_01", "Comandos remote"));
        gitComandosSincronizacao.add(new Assunto("GIT_SINCRONIA_02", "git push origin master (ou main)"));
        gitComandosSincronizacao.add(new Assunto("GIT_SINCRONIA_03", "git clone <url>"));
        gitComandosSincronizacao.add(new Assunto("GIT_SINCRONIA_04", "Diferença fundamental"));
        gitCategorias.add(new Categoria("Comandos de Sincronização", gitComandosSincronizacao));

        // =========================
        // GIT - DESFAZENDO ALTERAÇÕES
        // =========================

        List<Assunto> gitDesfazendoAlteracoes = new ArrayList<>();
        gitDesfazendoAlteracoes.add(new Assunto("GIT_DESFAZER_01", "git checkout -- <arquivo>"));
        gitDesfazendoAlteracoes.add(new Assunto("GIT_DESFAZER_02", "git commit --amend -m \"nova msg\""));
        gitDesfazendoAlteracoes.add(new Assunto("GIT_DESFAZER_03", "Diferença crucial"));
        gitDesfazendoAlteracoes.add(new Assunto("GIT_DESFAZER_04", "Para descartar modificações JÁ ADICIONADAS (staged)"));
        gitCategorias.add(new Categoria("Desfazendo Alterações", gitDesfazendoAlteracoes));

        // =========================
        // GIT - BRANCHES
        // =========================

        List<Assunto> gitBranches = new ArrayList<>();
        gitBranches.add(new Assunto("GIT_BRANCH_01", "Branches (ramificações)"));
        gitBranches.add(new Assunto("GIT_BRANCH_02", "git branch"));
        gitBranches.add(new Assunto("GIT_BRANCH_03", "git checkout -b <nome_branch>"));
        gitBranches.add(new Assunto("GIT_BRANCH_04", "git merge <nome_branch>"));
        gitBranches.add(new Assunto("GIT_BRANCH_05", "Fast-forward merge"));
        gitBranches.add(new Assunto("GIT_BRANCH_06", "Resolvendo conflito"));
        gitCategorias.add(new Categoria("Git Branches", gitBranches));

        // =========================
        // GIT - REBASE VS MERGE
        // =========================

        List<Assunto> gitRebaseMerge = new ArrayList<>();
        gitRebaseMerge.add(new Assunto("GIT_REBASE_01", "Diferenças"));
        gitCategorias.add(new Categoria("Git Rebase VS Merge", gitRebaseMerge));

        // =========================
        // GIT - COMANDOS AVANÇADOS
        // =========================

        List<Assunto> gitComandosAvancados = new ArrayList<>();
        gitComandosAvancados.add(new Assunto("GIT_AVANCADO_01", "git stash"));
        gitComandosAvancados.add(new Assunto("GIT_AVANCADO_02", "git tag -a <versão> -m \"mensagem\""));
        gitComandosAvancados.add(new Assunto("GIT_AVANCADO_03", "git reflog"));
        gitCategorias.add(new Categoria("Comandos Avançados", gitComandosAvancados));

        // =========================
        // GIT - FLUXOS DE TRABALHO
        // =========================

        List<Assunto> gitFluxoTrabalho = new ArrayList<>();
        gitFluxoTrabalho.add(new Assunto("GIT_FLUXO_01", "GitFlow (workflow complexo)"));
        gitFluxoTrabalho.add(new Assunto("GIT_FLUXO_02", "Trunk-Based (workflow simples)"));
        gitCategorias.add(new Categoria("Fluxo de Trabalho", gitFluxoTrabalho));

        // =========================
        // GIT - ARQUIVOS DE CONFIGURAÇÃO
        // =========================

        List<Assunto> gitArquivosConfiguracao = new ArrayList<>();
        gitArquivosConfiguracao.add(new Assunto("GIT_CONFIG_01", ".gitignore"));
        gitCategorias.add(new Categoria("Arquivo de Configuração", gitArquivosConfiguracao));

        // =========================
        // GIT - COMANDO MULTIUSO (CHECKOUT)
        // =========================

        List<Assunto> gitComandoMultiuso = new ArrayList<>();
        gitComandoMultiuso.add(new Assunto("GIT_COMANDO_08", "git checkout tem 3 finalidades"));

        gitCategorias.add(new Categoria("Comando Multiuso", gitComandoMultiuso));


        return temas;
    }

    public static Set<String> getIdsValidos() {

        Set<String> ids = new HashSet<>();

        List<Tema> temas = getTemas();

        for (Tema tema : temas) {
            for (Disciplina disciplina : tema.getDisciplinas()) {

                for (Categoria categoria : disciplina.getCategorias()) {

                    for (Assunto assunto : categoria.getAssuntos()) {
                        ids.add(assunto.getId());
                    }
                }
            }
        }

        return ids;
    }
}