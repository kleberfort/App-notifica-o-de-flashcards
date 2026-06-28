package com.seuapp.mensageria.flashcard_questoes.flashcards.desenvolvimento_software_flashcard.git;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class GitFlashcards {

    //"012345678901234567890123456789\n" //ate 32 caracteres por linha e no máximo 10 linhas

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // =========================
        // GIT - CONCEITOS FUNDAMENTAIS
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_CONCEITO_01",
                "🧭 Git - O que é?",
                "📌 O que é GIT:\n" +
                        "🟢 Sistema de Controle de Versão (VCS) distribuído.\n" +
                        "🔀 Diferente do SVN (centralizado), cada desenvolvedor tem uma cópia completa do histórico.\n" +
                        "🔐 Usa checksum SHA-1 para garantir integridade dos dados."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_CONCEITO_02",
                "🧭 Git vs GitHub",
                "📌 Diferença fundamental:\n" +
                        "🟢 Git = Sistema de controle de versão distribuído.\n" +
                        "🐙 GitHub/GitLab = Serviços WEB de hospedagem que USAM o Git."
        ));

        // =========================
        // GIT - ESTADOS DOS ARQUIVOS
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_ESTADOS_01",
                "🧭 Três estados do arquivo",
                "📌 Áreas/Estados do Git:\n" +
                        "1️⃣ Working Directory (Diretório de Trabalho) - onde você edita arquivos: " +
                        "Alterações aqui são NÃO RASTREADAS(untracked).\n" +
                        "2️⃣ Staging Area (Área de Preparação) - git add: " +
                        "Seleciono as alterações que farão parte do px commit. \n" +
                        "3️⃣ Repositório Local (.git) - git commit: Onde as versões são definitivamente armazendas."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_ESTADOS_02",
                "🧭 Para que serve a Staging Area?",
                "📌 Função da Staging Area:\n" +
                        "🟢 Área de preparação/seleção.\n" +
                        "✅ Permite fazer commits menores e mais significativos.\n" +
                        "🎯 Escolher apenas PARTES das modificações para o commit."
        ));

        // =========================
        // GIT - COMANDOS BÁSICOS
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_01",
                "⚡ git init",
                "📌 git init:\n" +
                        "🟢 Inicializa um NOVO repositório Git no diretório atual.\n" +
                        "📁 Cria a pasta .git (onde fica todo o versionamento)."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_02",
                "⚡ git status",
                "📌 git status:\n" +
                        "🟢 Mostra o estado atual dos arquivos.\n" +
                        "📋 Exibe: untracked (não rastreado), not staged (não preparado), staged (preparado)."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_03",
                "⚡ git add",
                "📌 git add <arquivo>:\n" +
                        "🟢 Move o arquivo do Working Directory para a Staging Area.\n" +
                        "➕ git add . → adiciona TODOS os arquivos."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_04",
                "⚡ git commit",
                "📌 git commit -m \"mensagem\":\n" +
                        "🟢 Cria uma nova versão (snapshot) PERMANENTE.\n" +
                        "📸 Commit = \"tirar uma foto\" do código naquele momento."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_05",
                "⚡ git log",
                "📌 git log:\n" +
                        "📜 Exibe o histórico de commits.\n" +
                        "📊 git log --oneline → visão compacta (hash reduzido + mensagem).\n" +
                        "🔍 git log -p → mostra as diferenças (diff) de cada commit."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_06",
                "⚡ git show",
                "📌 git show <hash>:\n" +
                        "🔍 Exibe detalhes (autor, data, mensagem e ALTERAÇÕES) de um commit específico."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_07",
                "⚡ git blame",
                "📌 git blame <arquivo>:\n" +
                        "👤 Mostra LINHA por LINHA quem modificou e em qual commit.\n" +
                        "🕵️ Útil para descobrir quem fez determinada alteração."
        ));

        // =========================
        // GIT - COMANDOS DE SINCRONIZAÇÃO
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_SINCRONIA_01",
                "🔗 git remote",
                "📌 Comandos remote:\n" +
                        "🟢 git remote add origin <url> → vincula local ao remoto.\n" +
                        "🟢 git remote -v → lista URLs dos repositórios remotos configurados."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_SINCRONIA_02",
                "📤 git push",
                "📌 git push origin master (ou main):\n" +
                        "🟢 Envia os commits LOCAIS para o repositório REMOTO.\n" +
                        "☁️ Sobe o código para o GitHub/GitLab."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_SINCRONIA_03",
                "📥 git clone",
                "📌 git clone <url>:\n" +
                        "🟢 BAIXA uma cópia COMPLETA de um repositório remoto para a máquina local.\n" +
                        "📦 Diferente de git init (cria novo) ou git pull (atualiza existente)."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_SINCRONIA_04",
                "🔄 git pull vs git fetch",
                "📌 Diferença fundamental:\n" +
                        "🟢 git pull = git fetch + git merge (BAIXA E APLICA).\n" +
                        "🟢 git fetch = APENAS BAIXA as alterações (não aplica).\n" +
                        "💡 pull é análogo ao 'svn update'."
        ));

        // =========================
        // GIT - DESFAZENDO ALTERAÇÕES
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_DESFAZER_01",
                "♻️ git checkout -- <arquivo>",
                "📌 git checkout -- <arquivo>:\n" +
                        "🟢 DESCARTA modificações NÃO SALVAS no Working Directory.\n" +
                        "⚠️ Volta o arquivo para o estado do último commit.\n" +
                        "❌ NÃO desfaz commit! (só mods locais não commitadas)."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_DESFAZER_02",
                "📝 git commit --amend",
                "📌 git commit --amend -m \"nova msg\":\n" +
                        "🟢 Altera a mensagem do ÚLTIMO commit realizado.\n" +
                        "✏️ Útil para corrigir mensagem sem criar novo commit."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_DESFAZER_03",
                "⚠️ git revert vs git reset",
                "📌 Diferença crucial:\n" +
                        "🟢 git revert → cria NOVO commit desfazendo o commit anterior (histórico PRESERVADO).\n" +
                        "🟢 git reset --hard → APAGA commits do histórico (DESTRUTIVO).\n" +
                        "🟢 git reset --soft → remove commit mas MANTÉM alterações na staging area."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_DESFAZER_04",
                "🗑️ git reset (tirar da staging)",
                "📌 Para descartar modificações JÁ ADICIONADAS (staged):\n" +
                        "1️⃣ git reset <arquivo> → tira da staging area.\n" +
                        "2️⃣ git checkout -- <arquivo> → descarta as modificações."
        ));

        // =========================
        // GIT - BRANCHES
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_01",
                "🌿 O que são Branches?",
                "📌 Branches (ramificações):\n" +
                        "🟢 Timeline PARALELA de desenvolvimento.\n" +
                        "🔒 Permite isolar funcionalidades (features) ou correções de bugs.\n" +
                        "👑 Branch padrão: master ou main.\n" +
                        "📍 HEAD = ponteiro que indica onde você está."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_02",
                "⚡ git branch",
                "📌 git branch:\n" +
                        "🟢 Lista branches LOCAIS (* indica a branch atual).\n" +
                        "🟢 git branch -a → lista TODAS (locais e remotas)."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_03",
                "🔄 git checkout -b",
                "📌 git checkout -b <nome_branch>:\n" +
                        "🟢 CRIA uma nova branch e JÁ MUDA para ela.\n" +
                        "⚡ Atalho para: git branch + git checkout."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_04",
                "🔀 git merge",
                "📌 git merge <nome_branch>:\n" +
                        "🟢 MESCLA a branch especificada na branch ATUAL.\n" +
                        "⚡ Integra as alterações de uma branch em outra."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_05",
                "⚡ Fast-forward merge",
                "📌 Fast-forward merge:\n" +
                        "🟢 Ocorre quando a branch DESTINO (ex: master) NÃO evoluiu.\n" +
                        "➡️ Git apenas AVANÇA o ponteiro (histórico LINEAR).\n" +
                        "😊 Cenário feliz: merge sem conflitos."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_BRANCH_06",
                "⚠️ Conflito de merge",
                "📌 Resolvendo conflito:\n" +
                        "1️⃣ git merge <outra_branch> → identifica conflito.\n" +
                        "2️⃣ Editar arquivos marcados (<<<<<< HEAD, ====, >>>>>>).\n" +
                        "3️⃣ git add <arquivo_resolvido>.\n" +
                        "4️⃣ git commit → cria merge commit."
        ));

        // =========================
        // GIT - REBASE VS MERGE
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_REBASE_01",
                "🔀 merge vs rebase",
                "📌 Diferenças:\n" +
                        "🟢 merge → cria commit EXTRA de merge (história PARALELA).\n" +
                        "🟢 rebase → reaplica commits (história LINEAR).\n" +
                        "⚠️ NUNCA faça rebase em branches PÚBLICAS/COMPARTILHADAS!"
        ));

        // =========================
        // GIT - COMANDOS AVANÇADOS
        // =========================


        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_AVANCADO_01",
                "📦 git stash",
                "📌 git stash:\n" +
                        "🟢 Armazena TEMPORARIAMENTE modificações NÃO commitadas.\n" +
                        "🧹 Limpa o working directory para outra tarefa.\n" +
                        "🔁 git stash apply → recupera as modificações guardadas.\n" +
                        "❌ NÃO descarta alterações!"
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_AVANCADO_02",
                "🏷️ git tag",
                "📌 git tag -a <versão> -m \"mensagem\":\n" +
                        "🏷️ Cria marcador IMUTÁVEL em um commit (release).\n" +
                        "📌 Exemplo: git tag -a v1.0.0 -m \"versão 1.0\".\n" +
                        "📤 git push origin --tags → envia tags ao remoto."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_AVANCADO_03",
                "🆘 git reflog",
                "📌 git reflog:\n" +
                        "🟢 Mostra histórico de TODAS as ações LOCAIS (checkouts, merges, resets).\n" +
                        "🆘 SALVADOR! Recupera commits perdidos após reset --hard.\n" +
                        "📋 Diferente do git log (só mostra commits)."
        ));

        // =========================
        // GIT - FLUXOS DE TRABALHO
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_FLUXO_01",
                "🏛️ GitFlow",
                "📌 GitFlow (workflow complexo):\n" +
                        "📁 master → código em PRODUÇÃO.\n" +
                        "📁 develop → branch de INTEGRAÇÃO para features.\n" +
                        "📁 feature/* → novas funcionalidades (criadas da develop).\n" +
                        "📁 hotfix/* → correções críticas (criadas da master).\n" +
                        "📁 release/* → preparação de novas versões."
        ));

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_FLUXO_02",
                "🌳 Trunk-Based Development",
                "📌 Trunk-Based (workflow simples):\n" +
                        "🟢 POUCAS branches (geralmente só master/main).\n" +
                        "📝 Desenvolvedores cometem DIRETO na master com frequência.\n" +
                        "🔘 Usa Feature Toggles para funcionalidades incompletas.\n" +
                        "✅ Integração contínua, menos conflitos complexos."
        ));


        // =========================
        // GIT - CENÁRIO DO PROBLEMA - RESOLUÇÃO
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "CENARIO_01",
                "🚫 Projeto remoto diferente do local",
                "📌 Projeto remoto atualizado e local não - Situações:  \n" +
                        "1️⃣ - você criou o repositório no GitHub com um README, .gitignore ou licença .\n" +
                        "2️⃣ - outra pessoa fez um push .\n" +
                        "3️⃣ - você está trabalhando em outra máquina e o remoto está mais atualizado.\n" +
                        "👉 O que fazer?.\n"+
                        "1° Fazer o pull: git pull origin master.\n" +
                        " ele atualizará os dados remotos em relação ao local."
        ));


        // =========================
        // GIT - ARQUIVOS DE CONFIGURAÇÃO
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_CONFIG_01",
                "🚫 .gitignore",
                "📌 .gitignore:\n" +
                        "🟢 Arquivo que lista quais arquivos/diretórios o Git deve IGNORAR.\n" +
                        "📁 Exemplos: logs, dependências (node_modules/), arquivos de ambiente (.env)."
        ));

        // =========================
        // GIT - COMANDO MULTIUSO (CHECKOUT)
        // =========================

        lista.add(new Flashcard(
                "📘 Controle de Versão - Git",
                "GIT_COMANDO_08",
                "🎯 Os 3 usos do git checkout",
                "📌 git checkout tem 3 finalidades:\n" +
                        "1️⃣ Descartar mudanças no Working Directory: git checkout -- <arquivo>\n" +
                        "2️⃣ Criar nova branch: git checkout -b <nome>\n" +
                        "3️⃣ Trocar entre branches: git checkout <nome_branch>"
        ));

        return lista;
    }
}