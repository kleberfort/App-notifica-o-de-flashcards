package com.seuapp.mensageria.flashcard_questoes.flashcards.banco_dados_flashcard.fundamentos_banco_dados_sql;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FundamentosBancosDadosFlashcards {

    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ===================== VÍDEO 01 =====================
        lista.add(new Flashcard(
                "📘 Fundamentos BD - Dado/Informação",
                "DADO_INFORMACAO",
                "🧠 Conceitos Fundamentais",
                "💡 Dado: elemento básico, sem contexto.\n" +
                        "💡 Informação: dado contextualizado com sentido.\n" +
                        "⚙️ Processamento: conversão do dado em informação.\n" +
                        "🖥️ Informática: ciência que estuda processamento de dados.\n" +
                        "🎯 Foco: velocidade e segurança."
        ));

        lista.add(new Flashcard(
                "📘 Fundamentos BD - Pirâmide da Informação",
                "PIRAMIDE_ABSTRACAO",
                "🧠 Do Dado à Inteligência",
                "⬇️ 1. Dado (base)\n" +
                        "Exemplo: 150\n\n" +
                        "⬇️ 2. Informação (dado + contexto)\n" +
                        "Exemplo: 150 produtos vendidos no mês de Janeiro.\n\n" +
                        "⬇️ 3. Conhecimento (informação + uso)\n" +
                        "Exemplo: A empresa percebe que Janeiro teve aumento de vendas " +
                        "e decide aumentar o estoque.\n\n" +
                        "⬇️ 4. Inteligência (conhecimento + fim definido)\n" +
                        "Exemplo: O sistema prevê a demanda dos próximos meses e " +
                        "recomenda automaticamente a quantidade ideal de produtos.\n\n" +
                        "⚠️ Dado = fato bruto.\n" +
                        "⚠️ Informação = dado interpretado.\n" +
                        "⚠️ Conhecimento = informação aplicada para tomar decisões.\n" +
                        "⚠️ Inteligência = conhecimento usado para gerar estratégias."
        ));

        lista.add(new Flashcard(
                "📘 Fundamentos BD - Tipos Conhecimento",
                "TIPOS_CONHECIMENTO",
                "🧠 Conhecimento: Explícito vs Tácito",
                "📋 EXPLÍCITO: formal, codificado, objetivo, racional. " +
                        "Fácil de documentar e compartilhar.\n" +
                        "🧘 TÁCITO: pessoal, internalizado, subjetivo. " +
                        "Adquirido por experiências ao longo da vida.\n" +
                        "🚨 CILADA: tácito NÃO é intuição!"
        ));

        lista.add(new Flashcard(
                "📘 Fundamentos BD - Transmissão Conhecimento",
                "TRANSMISSAO_CONHECIMENTO",
                "🧠 Formas de Transmissão do Conhecimento:",
                "🤝 SOCIALIZAÇÃO: troca de experiências (tácito).\n" +
                        "📄 EXTERNALIZAÇÃO: documentação (torna-se explícito).\n" +
                        "📖 INTERNALIZAÇÃO: aprendizado próprio/autodidata.\n" +
                        "🧩 COMBINAÇÃO: agrupar conhecimentos explícitos."
        ));

        lista.add(new Flashcard(
                "📘 Fundamentos BD - Tipos de Dados",
                "TIPOS_DADOS",
                "🧠 Classificação de Dados",
                "📊 ESTRUTURADO: pré-definido, organizado, SQL.\n" +
                        "🔀 SEMIESTRUTURADO: estrutura definida após existir.\n" +
                        "🖼️ Ex: XML, imagens, áudio.\n" +
                        "🌀 NÃO ESTRUTURADO: caos total, estrutura nunca definida.\n" +
                        "🎬 Ex: textos, vídeos (maior volume atual)."
        ));

        // ===================== VÍDEO 02 =====================
        lista.add(new Flashcard(
                "📘 Dados Abertos - Conceitos",
                "DADOS_ABERTOS",
                "🧠 Open Data - Definição",
                "🔓 Dado aberto (OKFN): livre uso, reúso e redistribuição.\n" +
                        "📝 Mínimo: creditar autoria e compartilhar licença.\n" +
                        "🚫 Nem todo dado é aberto (ex: dados privados).\n" +
                        "⚖️ Dado público ≠ dado aberto (ex: PDF não editável)."
        ));

        lista.add(new Flashcard(
                "📘 Dados Abertos - 3 Leis",
                "LEIS_DADOS_ABERTOS",
                "🧠 Leis (testes de David Eaves)",
                "🔍 1ª LEI: Encontrar/Indexar na web.\n" +
                        "🤖 2ª LEI: Formato compreensível por máquina.\n" +
                        "⚖️ 3ª LEI: Sem barreiras legais para replicação.\n" +
                        "💡 'Leis' figuradas, NÃO jurídicas!"
        ));

        lista.add(new Flashcard(
                "📘 Dados Abertos - 8 Princípios",
                "PRINCIPIOS_DADOS_ABERTOS",
                "🧠 Mnemônico: CAPA-PAL",
                "8 Princípios dos Dados aberto:\n " +
                        "1️⃣  Completos (totalidade)\n" +
                        "2️⃣ Primários (fonte original)\n" +
                        "3️⃣ Atuais (atualizados) \n" +
                        "4️⃣ Acessíveis (amplo acesso) \n" +
                        "5️⃣ Processáveis (automação) \n" +
                        "6️⃣ Acesso não discriminatório (sem cadastro) \n" +
                        "7️⃣ Formato não proprietário (padrão aberto), Garante acesso futuro - evita obsolescência - PDF é padrão aberto \n" +
                        "8️⃣ Licenças livres (sem restrições)"
        ));

        lista.add(new Flashcard(
                "📘 Dados Abertos - LAI",
                "LAI_TRANSPARENCIA",
                "🧠 Lei de Acesso à Informação",
                "🔦 Transparência ativa: obrigatória sem pedido.\n" +
                        "🏛️ Divulgação em site oficial.\n" +
                        "📊 Deve permitir gravação em múltiplos formatos.\n" +
                        "🤖 Possibilitar acesso automatizado."
        ));

        lista.add(new Flashcard(
                "📘 Ciclo de Vida do Dado",
                "CICLO_VIDA_DADO",
                "🧠 Fases: Coletar → Armazenar → Recuperar → Descartar",
                "🎣 COLETA: obter dados para necessidade específica.\n" +
                        "💾 ARMAZENAMENTO: persistir em algum local.\n" +
                        "🔎 RECUPERAÇÃO: encontrar, acessar, consultar (NÃO é consertar!)\n" +
                        "🗑️ DESCARTE: eliminar seguindo regras de temporalidade.\n" +
                        "🔗 INTEGRAÇÃO: fase transversal (une todas as etapas)."
        ));

        // ===================== VÍDEO 03 =====================
        lista.add(new Flashcard(
                "📘 BD - Conceitos Básicos",
                "CONCEITO_BD",
                "🧠 O que é um Banco de Dados?",
                "📚 Coleção de dados relacionados/inter-relacionados.\n" +
                        "🌍 Representa um domínio específico do mundo real.\n" +
                        "📓 Pode ser manual (agenda) ou automatizado.\n" +
                        "📏 Qualquer tamanho/complexidade.\n" +
                        "🔄 Solução dinâmica (NÃO estática)."
        ));

        lista.add(new Flashcard(
                "📘 SGBD - Conceitos",
                "CONCEITO_SGBD",
                "🧠 O que é SGBD?",
                "🧩 Conjunto de programas que gerencia bancos.\n" +
                        "🏗️ Permite criar e manter múltiplos BDs.\n" +
                        "🔀 BD ≠ SGBD (BD é a base, SGBD é o software).\n" +
                        "🧬 SBD = SGBD + BD."
        ));

        lista.add(new Flashcard(
                "📘 SGBD - 6 Funcionalidades",
                "FUNCIONALIDADES_SGBD",
                "🧠 Definir, Construir, Manipular, Compartilhar, Proteger, Manter",
                "📐 DEFINIR: tipos, estruturas e restrições.\n" +
                        "🏗️ CONSTRUIR: armazenar dados (criar BD).\n" +
                        "🔧 MANIPULAR: consultar, atualizar, excluir.\n" +
                        "👥 COMPARTILHAR: acesso simultâneo.\n" +
                        "🛡️ PROTEGER: hardware/software e acessos não autorizados.\n" +
                        "🔧 MANTER: evoluir com novos requisitos."
        ));

        lista.add(new Flashcard(
                "📘 SBD - Aplicações",
                "SBD_APLICACOES",
                "🧠 Sistema de Banco de Dados",
                "🧬 SBD = SGBD + BD + Aplicações.\n" +
                        "📱 Aplicações: programas que acessam o BD.\n" +
                        "🎯 São opcionais (podem ou não existir).\n" +
                        "🧩 Camadas independentes."
        ));

        // ===================== VÍDEO 04 =====================
        lista.add(new Flashcard(
                "📘 SGBD - Detalhamento",
                "SGBD_DETALHADO",
                "🧠 Recursos e Controles do SGBD",
                "📐 Definir: tipos, estruturas e restrições.\n" +
                        "💾 Construir: persistência dos dados.\n" +
                        "🔧 Manipular: consultar, alterar, excluir.\n" +
                        "🔎 Recuperar = ir buscar (NÃO é consertar!).\n" +
                        "⚙️ Controles automáticos: integridade e concorrência."
        ));

        // ===================== VÍDEO 05 =====================
        lista.add(new Flashcard(
                "📘 Características BD Relacional",
                "CARACTERISTICAS_RELACIONAL",
                "🧠 4 Características Essenciais",
                "📋 AUTODESCRIÇÃO: armazena metadados.\n" +
                        "🔄 ISOLAMENTO/ABSTRAÇÃO: mudanças não afetam outras camadas.\n" +
                        "👁️ MÚLTIPLAS VISÕES: cada usuário vê o que precisa.\n" +
                        "👥 COMPARTILHAMENTO/CONCORRÊNCIA: acesso simultâneo com controle."
        ));

        lista.add(new Flashcard(
                "📘 Metadados",
                "METADADOS",
                "🧠 Dado sobre o dado",
                "🏷️ Metadado = informação que descreve outros dados.\n" +
                        "📋 Ex: estrutura, formato, restrições, autor, data.\n" +
                        "🔑 Essencial para autodescrição do banco.\n" +
                        "📚 Analogia: 'ficha do livro'."
        ));

        lista.add(new Flashcard(
                "📘 Tipos de BD - Comparativo",
                "TIPOS_BD",
                "🧠 Arquivo vs Relacional vs Orientado a Objetos",
                "📄 ARQUIVO: única tabela, gerenciamento manual, mais antigo.\n" +
                        "🔗 RELACIONAL: várias tabelas relacionadas (foco do estudo).\n" +
                        "🔷 ORIENTADO A OBJETOS: objetos com classes/métodos.\n" +
                        "🔄 Pode usar BD relacional com programação orientada a objetos."
        ));

        // ===================== VÍDEO 06 =====================
        lista.add(new Flashcard(
                "📘 Questões - Características BD",
                "QUESTOES_RELACIONAIS",
                "🧠 Pegadinhas Frequentes",
                "👥 Acesso concorrente: permitido com controle.\n" +
                        "🔄 Independência: dados e programas são independentes.\n" +
                        "📐 Estrutura padronizada: não pode ser independente por aplicação.\n" +
                        "📋 Autodescrição: banco armazena metadados."
        ));

        lista.add(new Flashcard(
                "📘 Questões - SGBD",
                "QUESTOES_SGBD",
                "🧠 SGBD - Definição e Funções",
                "🧩 Conjunto de programas que gerencia BD.\n" +
                        "🔍 Suporta linguagem de consulta.\n" +
                        "📊 Gera relatórios.\n" +
                        "🖥️ Interface para incluir, alterar ou consultar.\n" +
                        "🚫 NÃO tem dependência de dados do programa."
        ));

        // ===================== VÍDEO 07 =====================
        lista.add(new Flashcard(
                "📘 Transações - Propriedades ACID",
                "ACID",
                "🧠 Atomicidade, Consistência, Isolamento, Durabilidade",
                "💣 ATOMICIDADE: 'tudo ou nada' (Commit/Rollback).\n" +
                        "⚖️ CONSISTÊNCIA: estado consistente → estado consistente.\n" +
                        "🏝️ ISOLAMENTO: cada transação parece isolada das demais.\n" +
                        "💾 DURABILIDADE: dados persistem mesmo com falhas."
        ));

        lista.add(new Flashcard(
                "📘 Transações - Commit e Rollback",
                "COMMIT_ROLLBACK",
                "🧠 Efetivar e Desfazer",
                "✅ COMMIT: efetiva a transação com sucesso.\n" +
                        "↩️ ROLLBACK: desfaz em caso de falha.\n" +
                        "🏧 Exemplo saque: debitar + entregar (tudo ou nada).\n" +
                        "🚨 I ≠ Integridade, D ≠ Disponibilidade (cuidado!)."
        ));

        // ===================== VÍDEO 08 =====================
        lista.add(new Flashcard(
                "📘 DBA vs DA",
                "DBA_AD_COMPARATIVO",
                "🧠 Administrador de BD vs Administrador de Dados",
                "🔧 DBA: perfil TÉCNICO (infraestrutura, performance, backup).\n" +
                        "📊 AD perfil GERENCIAL (modelagem, relevância do dado).\n" +
                        "⚙️ DBA instala SGBD, gerencia backup, hardware/software.\n" +
                        "📐 AD define dados, padrões e valida valor para negócio."
        ));

        lista.add(new Flashcard(
                "📘 DBA - Responsabilidades",
                "DBA_RESPONSABILIDADES",
                "🧠 Administrador de Banco de Dados",
                "🖥️ Instalação do SGBD.\n" +
                        "📊 Análise de performance.\n" +
                        "💾 Gerenciamento de backups.\n" +
                        "🖥️ Solicitação de hardware/software.\n" +
                        "🚫 NÃO é dono dos dados e NÃO define o que armazenar."
        ));

        lista.add(new Flashcard(
                "📘 DA - Responsabilidades",
                "AD_RESPONSABILIDADES",
                "🧠 Administrador de Dados",
                "📋 Define quais dados serão armazenados.\n" +
                        "📐 Desenvolve projeto e modelagem.\n" +
                        "📏 Define padrões e procedimentos.\n" +
                        "💰 Valida relevância do dado para o negócio.\n" +
                        "💸 Preocupa-se com custo de armazenamento."
        ));

        // ===================== VÍDEO 09 =====================
        lista.add(new Flashcard(
                "📘 Arquitetura ANSI/SPARC",
                "ANSI_SPARC_NIVEIS",
                "🧠 3 Níveis: Externo, Conceitual, Interno",
                "👁️ EXTERNO: visão do usuário, individual, personalizada.\n" +
                        "🧩 CONCEITUAL: visão geral do banco, unifica visões.\n" +
                        "💾 INTERNO: armazenamento físico (índices, performance).\n" +
                        "🔮 Dado só existe de fato no nível interno."
        ));

        lista.add(new Flashcard(
                "📘 Esquema vs Instância",
                "ESQUEMA_INSTANCIA",
                "🧠 Estrutura vs Dado em si",
                "📐 ESQUEMA: descrição da estrutura (tabelas, campos).\n" +
                        "🏠 Analogia: tabela profissão, campos: id, nome, especialidade.\n" +
                        "📊 INSTÂNCIA: o dado em si (ocorrência).\n" +
                        "👤 Analogia: /'Emanuele'/ instância da tabela de profissão."
        ));

        // ===================== VÍDEO 10 =====================
        lista.add(new Flashcard(
                "📘 Independência de Dados",
                "INDEPENDENCIA_DADOS",
                "🧠 Lógica vs Física",
                "INDEPENDENCIA DE DADOS - Capacidade de alterar uma camada sem interfeir na outra.\n" +
                        "🧩 LÓGICA: muda conceitual, não afeta externo.\n" +
                        "🔗 Mapeamento: Externo → Conceitual.\n" +
                        "💾 FÍSICA: muda interno, não afeta conceitual.\n" +
                        "🔗 Mapeamento: Conceitual → Interno.\n" +
                        "🔧 Física = SGBD garante; Lógica = depende do analista."
        ));

        // ===================== VÍDEO 12 =====================
        lista.add(new Flashcard(
                "📘 Modelos de Projeto - Conceitual",
                "MODELO_CONCEITUAL",
                "🧠 Alto Nível (Usuário)",
                "🧠 Alto Nível (Usuário).\n" +
                         "📐 Independente de hardware e software.\n" +
                        "🔷 Entidades, atributos, relacionamentos.\n" +
                        "👤 Fácil para usuário final (leigo).\n" +
                        "📊 Diagrama Entidade-Relacionamento (MER).\n" +
                        "👁️ Corresponde ao Nível Externo do ANSI/SPARC."
        ));

        lista.add(new Flashcard(
                "📘 Modelos de Projeto - Lógico",
                "MODELO_LOGICO",
                "🧠 Nível Intermediário (Software)",
                "🧠 Nível Intermediário (Software).\n" +
                        "💻 Depende de software/SGBD.\n" +
                        "🔑 Chaves primárias e estrangeiras, Tipos de dados.\n" +
                        "🖥️ Independente de hardware.\n" +
                        "🧩 Corresponde ao Nível Conceitual do ANSI/SPARC."
        ));

        lista.add(new Flashcard(
                "📘 Modelos de Projeto - Físico",
                "MODELO_FISICO",
                "🧠 Baixo Nível (Hardware + Software)",
                "🧠 Baixo Nível (Hardware + Software).\n" +
                        "🖥️ Depende de hardware e software.\n" +
                        "📊 Índices, métodos de acesso, alocação.\n" +
                        "⚡ Performance e SQL.\n" +
                        "🔧 Difícil para leigos (especialista/DBA).\n" +
                        "💾 Corresponde ao Nível Interno do ANSI/SPARC."
        ));

        // ===================== RESUMÃO FINAL =====================
        lista.add(new Flashcard(
                "📘 Mapa Mental - Conceitos BD",
                "RESUMO_BD",
                "🧠 Revisão Rápida para Prova",
                "💡 Dado = básico; Informação = dado + contexto.\n" +
                        "📚 BD = coleção relacionada; SGBD = software que gerencia.\n" +
                        "⚡ ACID = Atomicidade, Consistência, Isolamento, Durabilidade.\n" +
                        "🔧 DBA = técnico; 📊 AD = gerencial.\n" +
                        "📐 ANSI/SPARC: Externo, Conceitual, Interno.\n" +
                        "📋 Projetos: Conceitual → Lógico → Físico."
        ));

        return lista;
    }
}
