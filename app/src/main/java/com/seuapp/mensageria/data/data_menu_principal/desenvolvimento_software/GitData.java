package com.seuapp.mensageria.data.data_menu_principal.desenvolvimento_software;

import com.seuapp.mensageria.model.Conteudo;
import com.seuapp.mensageria.model.Disciplina;
import com.seuapp.mensageria.model.Secao;

import java.util.ArrayList;
import java.util.List;

public class GitData {

    public static Disciplina getDisciplina() {

        List<Secao> secoes = new ArrayList<>();


        // =====================================
        // SEÇÃO: Conceitos
        // =====================================

        List<Conteudo> conceitos = new ArrayList<>();

        conceitos.add(
                new Conteudo("GIT_CONCEITO_01", "O que é Git")
        );

        conceitos.add(
                new Conteudo("GIT_CONCEITO_02", "Diferença fundamental")
        );

        secoes.add(
                new Secao("Conceitos", conceitos)
        );


        // =====================================
        // SEÇÃO: Estados dos Arquivos
        // =====================================

        List<Conteudo> estadosArquivos = new ArrayList<>();

        estadosArquivos.add(
                new Conteudo("GIT_ESTADOS_01", "Áreas/Estados do Git")
        );

        estadosArquivos.add(
                new Conteudo("GIT_ESTADOS_02", "Função da Staging Area")
        );

        secoes.add(
                new Secao("Estados dos Arquivos", estadosArquivos)
        );


        // =====================================
        // SEÇÃO: Comandos Básicos
        // =====================================

        List<Conteudo> comandosBasicos = new ArrayList<>();

        comandosBasicos.add(new Conteudo("GIT_COMANDO_01", "git init"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_02", "git status"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_03", "git add <arquivo>"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_04", "git commit -m"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_05", "Histórico de commits"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_06", "git show"));
        comandosBasicos.add(new Conteudo("GIT_COMANDO_07", "git blame"));

        secoes.add(
                new Secao("Comandos Básicos", comandosBasicos)
        );


        // =====================================
        // SEÇÃO: Sincronização
        // =====================================

        List<Conteudo> sincronizacao = new ArrayList<>();

        sincronizacao.add(
                new Conteudo("GIT_SINCRONIA_01", "Comandos remote")
        );

        sincronizacao.add(
                new Conteudo("GIT_SINCRONIA_02", "git push")
        );

        sincronizacao.add(
                new Conteudo("GIT_SINCRONIA_03", "git clone")
        );

        sincronizacao.add(
                new Conteudo("GIT_SINCRONIA_04", "Diferença fundamental")
        );

        secoes.add(
                new Secao("Comandos de Sincronização", sincronizacao)
        );


        // =====================================
        // SEÇÃO: Desfazendo Alterações
        // =====================================

        List<Conteudo> desfazendoAlteracoes = new ArrayList<>();

        desfazendoAlteracoes.add(
                new Conteudo("GIT_DESFAZER_01", "git checkout -- <arquivo>")
        );

        desfazendoAlteracoes.add(
                new Conteudo("GIT_DESFAZER_02", "git commit --amend")
        );

        desfazendoAlteracoes.add(
                new Conteudo("GIT_DESFAZER_03", "Diferença crucial")
        );

        desfazendoAlteracoes.add(
                new Conteudo("GIT_DESFAZER_04", "Descartar staged")
        );

        secoes.add(
                new Secao("Desfazendo Alterações", desfazendoAlteracoes)
        );


        // =====================================
        // SEÇÃO: Branches
        // =====================================

        List<Conteudo> branches = new ArrayList<>();

        branches.add(new Conteudo("GIT_BRANCH_01", "Branches"));
        branches.add(new Conteudo("GIT_BRANCH_02", "git branch"));
        branches.add(new Conteudo("GIT_BRANCH_03", "git checkout -b"));
        branches.add(new Conteudo("GIT_BRANCH_04", "git merge"));
        branches.add(new Conteudo("GIT_BRANCH_05", "Fast-forward merge"));
        branches.add(new Conteudo("GIT_BRANCH_06", "Conflitos"));

        secoes.add(
                new Secao("Branches", branches)
        );


        // =====================================
        // SEÇÃO: Rebase vs Merge
        // =====================================

        List<Conteudo> rebaseMerge = new ArrayList<>();

        rebaseMerge.add(
                new Conteudo("GIT_REBASE_01", "Diferenças")
        );

        secoes.add(
                new Secao("Rebase vs Merge", rebaseMerge)
        );


        // =====================================
        // SEÇÃO: Comandos Avançados
        // =====================================

        List<Conteudo> comandosAvancados = new ArrayList<>();

        comandosAvancados.add(
                new Conteudo("GIT_AVANCADO_01", "git stash")
        );

        comandosAvancados.add(
                new Conteudo("GIT_AVANCADO_02", "git tag")
        );

        comandosAvancados.add(
                new Conteudo("GIT_AVANCADO_03", "git reflog")
        );

        secoes.add(
                new Secao("Comandos Avançados", comandosAvancados)
        );


        // =====================================
        // SEÇÃO: Fluxo de Trabalho
        // =====================================

        List<Conteudo> fluxoTrabalho = new ArrayList<>();

        fluxoTrabalho.add(
                new Conteudo("GIT_FLUXO_01", "GitFlow")
        );

        fluxoTrabalho.add(
                new Conteudo("GIT_FLUXO_02", "Trunk-Based")
        );

        secoes.add(
                new Secao("Fluxo de Trabalho", fluxoTrabalho)
        );


        // =====================================
        // SEÇÃO: Arquivos de Configuração
        // =====================================

        List<Conteudo> arquivosConfiguracao = new ArrayList<>();

        arquivosConfiguracao.add(
                new Conteudo("GIT_CONFIG_01", ".gitignore")
        );

        secoes.add(
                new Secao("Arquivos de Configuração", arquivosConfiguracao)
        );


        // =====================================
        // SEÇÃO: Comando Multiuso
        // =====================================

        List<Conteudo> comandoMultiuso = new ArrayList<>();

        comandoMultiuso.add(
                new Conteudo("GIT_COMANDO_08",
                        "git checkout tem 3 finalidades")
        );

        secoes.add(
                new Secao("Comando Multiuso", comandoMultiuso)
        );


        // =====================================
        // RETORNO FINAL
        // =====================================

        return new Disciplina(
                "Git",
                secoes
        );
    }
}