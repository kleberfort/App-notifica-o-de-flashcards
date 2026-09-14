package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.pontuacao;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class PontuacaoFlashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ==========================================
        // 1. NOÇÕES INICIAIS DE PONTUAÇÃO
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Noções Iniciais",
                "PONTUACAO_ORDEM_DIRETA_SUVECA",
                "🧭 Princípio da Ordem Direta (SuVeCA)",
                "📌 A ordem direta é Sujeito + Verbo + Complemento + Adjuntos.\n" +
                        "🟢 Na ordem direta, NÃO se separam termos essenciais com vírgula.\n" +
                        "🔴 Termos intercalados entre esses elementos DEVEM vir isolados (vírgulas, travessões ou parênteses)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Ordem Direta",
                "PONTUACAO_ESTRUTURAS_INSEPARAVEIS",
                "🧭 O que NÃO pode ser separado na Ordem Direta?",
                "📌 Não se separa com vírgula:\n" +
                        "🟢 Sujeito do Verbo (Ex.: João, saiu).\n" +
                        "🟢 Verbo do Complemento (Ex.: comprou, um carro).\n" +
                        "🟢 Verbo do Predicativo (Ex.: Felipe é, professor).\n" +
                        "🟢 Nome do Complemento/Adjunto (Ex.: Tenho medo, do trânsito)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Polêmicas",
                "PONTUACAO_DIVERGENCIAS_GRAMATICAIS",
                "🧭 Divergências entre Gramáticos",
                "📌 A pontuação não é uma ciência exata; há divergências.\n" +
                        "🟢 Ex.: 'Quem compra, compra algo' → ABL defende vírgula; Sacconi defende facultativa.\n" +
                        "🔴 Para provas, prevalece a regra geral: NÃO use vírgula entre sujeito e verbo."
        ));

        // ==========================================
        // 2. VÍRGULA, RESPIRAÇÃO E SEMÂNTICA
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_SEMANTICA",
                "🧭 Vírgula, Respiração e Semântica",
                "📌 A vírgula NÃO é para respirar; é um marcador de funções sintáticas.\n" +
                        "🟢 A presença/ausência da vírgula altera o sentido da frase.\n" +
                        "🔴 Ex.: 'Não espere por mim!' vs 'Não, espere por mim!'."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_MUDANCA_SENTIDO",
                "🧭 Mudança de Sentido com a Vírgula",
                "📌 A vírgula altera o sentido da frase:\n" +
                        "🟢 'Os servidores, que fizeram greve, levaram falta' → TODOS levaram falta.\n" +
                        "🔴 'Os servidores que fizeram greve levaram falta' → APENAS OS GREVISTAS levaram falta.\n" +
                        "🟢 'Se o homem soubesse o valor que tem, a mulher...' vs 'Se o homem soubesse o valor que tem a mulher...'."
        ));

        // ==========================================
        // 3. USO DA VÍRGULA - Todas as regras
        // ==========================================

        // 3.1 Adjuntos adverbiais deslocados
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ADJUNTO_ADVERBIAL",
                "🧭 1. Separar Adjuntos Adverbiais Deslocados",
                "📌 Termos adverbiais deslocados (antepostos/intercalados) pedem vírgula.\n" +
                        "🟢 Ordem direta: Vou jogar xadrez na casa dela.\n" +
                        "🔴 Deslocado: Na casa dela, vou jogar xadrez.\n" +
                        "⚠️ Pequena extensão (1-2 palavras): VÍRGULA FACULTATIVA (Ex.: Hoje, vou)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ORACAO_ADVERBIAL",
                "🧭 1.1 Orações Subordinadas Adverbiais Antepostas",
                "📌 Orações adverbiais antepostas à principal DEVEM vir separadas por vírgula.\n" +
                        "🟢 Quando cheguei, o cão ficou feliz.\n" +
                        "🟢 Se eu pudesse, viajaria mais.\n" +
                        "🔴 Se estiverem após a principal, a vírgula é FACULTATIVA."
        ));

        // 3.2 Enumeração
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ENUMERACAO",
                "🧭 2. Enumerar Termos de Mesma Função Sintática",
                "📌 É a 'vírgula da listinha'. Separa termos coordenados de uma série.\n" +
                        "🟢 Ex.: Comprei frutas, legumes, cereais e carnes.\n" +
                        "🟢 Ex.: Os líderes eram machistas, tirânicos e corruptos.\n" +
                        "🔴 Antes do 'e', a vírgula sugere que a lista é exemplificativa (não taxativa)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ENUMERACAO_ANAFORA",
                "🧭 2.1 Enumeração por Repetição (Anáfora)",
                "📌 A vírgula separa a repetição de uma estrutura sintática.\n" +
                        "🟢 Ex.: 'É pau, é pedra, é o fim do caminho...'\n" +
                        "🟢 Ex.: 'Chorei, chorei, até ficar com dó de mim...'\n" +
                        "🟢 Ex.: 'Muitos policiais estão envolvidos em corrupção, e tramas obscuras, e conluios...' (Polissíndeto)."
        ));

        // 3.3 Isolar conjunção coordenativa deslocada
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_CONJUNCAO_DESLOCADA",
                "🧭 3. Isolar Conjunção Coordenativa Deslocada",
                "📌 Conjunções deslocadas devem vir isoladas por vírgulas.\n" +
                        "🟢 Ex.: 'Seu lugar, portanto, não é aqui.'\n" +
                        "🟢 Ex.: 'Tinha algumas qualidades; tinha, porém, muitos defeitos.'\n" +
                        "🔴 OBS: O 'mas' NÃO aceita deslocamento."
        ));

        // 3.4 Separar orações coordenadas
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ORACOES_COORDENADAS",
                "🧭 4. Separar Orações Coordenadas",
                "📌 As orações coordenadas são separadas por vírgula.\n" +
                        "🟢 Ex.: Cheguei, tomei banho, me arrumei e saí de novo.\n" +
                        "🟢 Ex.: Ela amava intensamente, mas por pouco tempo.\n" +
                        "🟢 Ex.: Vou embora, pois não aguento mais."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_E_CONJUNCAO",
                "🧭 4.1 Regras da Vírgula antes do 'E'",
                "📌 Obrigatório: No polissíndeto (Ex.: e reclama, e reclama...).\n" +
                        "📌 Obrigatório: Para desfazer ambiguidade (Ex.: comprou o gato, e o cachorro ficou...).\n" +
                        "📌 Facultativo: Orações com sujeitos diferentes (Ex.: Eu trabalhava, e meu filho gastava).\n" +
                        "📌 Facultativo: Com relação adversativa (Ex.: Fez dieta, e não emagreceu).\n" +
                        "🔴 Desaconselhável: Orações com sujeitos iguais (Ex.: Dormi no sofá e acordei...)."
        ));

        // 3.5 Separar expressões explicativas
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_EXPRESSOES_EXPLICATIVAS",
                "🧭 5. Separar Expressões Explicativas/Retificativas",
                "📌 Expressões como 'por exemplo', 'isto é', 'ou seja', 'aliás' devem ser isoladas.\n" +
                        "🟢 Ex.: Vários lutadores perderam, por exemplo, Aldo.\n" +
                        "🟢 Ex.: Gosto muito de livros, isto é, de ler.\n" +
                        "🟢 Ex.: Bem, não posso negar que ela tem coragem."
        ));

        // 3.6 Separar orações interferentes
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ORACOES_INTERFERENTES",
                "🧭 6. Separar Orações Interferentes",
                "📌 Orações que interrompem o período com adendos/explicações do autor.\n" +
                        "🟢 Ex.: Acontece que a donzela, isso era segredo dela, também tinha seus caprichos.\n" +
                        "🟢 Ex.: A vizinha, somente fiquei sabendo agora, guardava um corpo no freezer!"
        ));

        // 3.7 Separar orações adjetivas explicativas
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ORACAO_EXPLICATIVA",
                "🧭 7. Separar Orações Adjetivas Explicativas",
                "📌 Orações explicativas (com pronome relativo) DEVEM vir entre vírgulas.\n" +
                        "🟢 Explicativa: Minha mãe, que era sábia, nunca fez faculdade.\n" +
                        "🔴 Restritiva (sem vírgula): O homem que estuda muito vence na vida.\n" +
                        "⚠️ A vírgula diferencia 'todos' (explicativa) de 'apenas alguns' (restritiva)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_RESTRITIVA_EXPLICATIVA",
                "🧭 7.1 Obrigação das Vírgulas Explicativas",
                "📌 Quando o substantivo é único (nome próprio, entidade única), a oração é OBRIGATORIAMENTE explicativa.\n" +
                        "🟢 Ex.: Minha mãe, que tem medo de avião, viaja de carro.\n" +
                        "🟢 Ex.: O Canadá, que é um país frio, recebe muitos imigrantes.\n" +
                        "🔴 Sem vírgula, a frase fica inadequada."
        ));

        // 3.8 Separar objeto direto pleonástico
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_OBJETO_PLEONASTICO",
                "🧭 8. Separar Objeto Direto Pleonástico (Repetido)",
                "📌 O objeto direto repetido para ênfase é separado por vírgula.\n" +
                        "🟢 Ex.: Os meninos, já os levei para escola.\n" +
                        "🟢 Ex.: Títulos relevantes, não ganhei nenhum deles."
        ));

        // 3.9 Separar aposto
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_APOSTO",
                "🧭 9. Separar o Aposto",
                "📌 Aposto: termo explicativo de valor substantivo que esclarece um termo anterior.\n" +
                        "🟢 Ex.: Ares, o deus da guerra, inspirava os troianos.\n" +
                        "🟢 Ex.: O Presidente do Senado, Renan Calheiros, jurou ser inocente.\n" +
                        "⚠️ Se retirarmos o termo entre vírgulas, a frase continua fazendo sentido."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_APOSTO_TIPOS",
                "🧭 9.1 Tipos de Aposto",
                "📌 Resumitivo: Planejamento, disciplina, estudo, tudo é importante!\n" +
                        "📌 Distributivo/Enumerativo: Chitãozinho e Xororó são cantores, este tem voz aguda e aquele tem voz grave.\n" +
                        "📌 Especificativo: O estado de Minas Gerais possui grande área. (NÃO VEM PONTUADO)\n" +
                        "📌 Aposto de oração: Reprovei quatro vezes, o que abalou minha confiança."
        ));

        // 3.10 Separar vocativo
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_VOCATIVO",
                "🧭 10. Separar o Vocativo",
                "📌 Vocativo: chamamento, invocação do ouvinte. Vem OBRIGATORIAMENTE isolado por vírgula.\n" +
                        "🟢 Ex.: Bom dia, Brasil.\n" +
                        "🟢 Ex.: Felipe, seja mais gentil com ela!\n" +
                        "🟢 Ex.: Olha aqui, meu querido, não há milagre."
        ));

        // 3.11 Marcar omissão de palavra (Elipse/Zeugma)
        lista.add(new Flashcard(
                "📘 Pontuação - Vírgula",
                "PONTUACAO_VIRGULA_ZEUGMA",
                "🧭 11. Marcar Omissão de Palavra (Elipse/Zeugma)",
                "📌 A vírgula substitui um verbo omitido (Elipse).\n" +
                        "🟢 Zeugma (omissão de termo já citado): O meu pai foi peão, minha mãe, solidão.\n" +
                        "🟢 Ex.: A primeira produz 39 compostos, a segunda, 21.\n" +
                        "🟢 Ex.: Na casa de mamãe, roupa lavada; na minha, contas embaixo da porta.\n" +
                        "🔴 Essa vírgula é chamada de VÍRGULA VICÁRIA."
        ));

        // ==========================================
        // 4. PONTO E VÍRGULA (;)
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Ponto e Vírgula",
                "PONTUACAO_PONTO_VIRGULA_USOS",
                "🧭 Funções do Ponto e Vírgula",
                "📌 Pausa maior que a vírgula e menor que o ponto final.\n" +
                        "🟢 Separa itens de uma enumeração que já têm vírgulas internas (Ex.: Carne, frango; frutas, legumes).\n" +
                        "🟢 Separa orações coordenadas com conectivos adversativos/conclusivos (Ex.: Fui; logo, voltei).\n" +
                        "🟢 Agrupa elementos em enumerações (Ex.: Viajei com dois casais: Wandercleverson, Sâmila; Waldisney, Eyshylah)."
        ));

        // ==========================================
        // 5. DOIS-PONTOS (:)
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Dois-Pontos",
                "PONTUACAO_DOIS_PONTOS_USOS",
                "🧭 Funções dos Dois-Pontos",
                "📌 Indica uma relação de explicação/esclarecimento.\n" +
                        "🟢 Introduz citação literal (discurso direto).\n" +
                        "🟢 Introduz enumeração ou aposto explicativo (Ex.: Queria duas coisas: paz e amor).\n" +
                        "🟢 Pode ser substituído por 'pois' (explicação) ou por vírgula."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Dois-Pontos",
                "PONTUACAO_DOIS_PONTOS_APOSTO",
                "🧭 5.1 Dois-Pontos e Aposto Explicativo",
                "📌 Os dois-pontos introduzem orações subordinadas substantivas apositivas (aposto em forma de oração).\n" +
                        "🟢 Ex.: Ela queria apenas uma coisa: que a prova viesse logo.\n" +
                        "🟢 Ex.: Tenho apenas um objetivo: passar em concurso."
        ));

        // ==========================================
        // 6. RETICÊNCIAS (...)
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Reticências",
                "PONTUACAO_RETICENCIAS_USOS",
                "🧭 Funções das Reticências",
                "📌 Indicam interrupção, hesitação, ironia, ideia não concluída.\n" +
                        "🟢 Ex.: Nós fizemos tudo para salvar seu filho, mas...\n" +
                        "🟢 Ex.: O que eu ia dizer é... bem... deixa pra lá.\n" +
                        "🟢 Entre parênteses: indicam supressão de parte do texto (...)."
        ));

        // ==========================================
        // 7. ASPAS (" ")
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Aspas",
                "PONTUACAO_ASPAS_USOS",
                "🧭 Funções das Aspas",
                "📌 Indicam citação literal (discurso direto).\n" +
                        "📌 Indicam estrangeirismo, neologismo, arcaísmo, gíria.\n" +
                        "📌 Indicam ironia e sentido figurado.\n" +
                        "🟢 Ex.: Ele gritou: 'Agora ferrou!' (citação).\n" +
                        "🟢 Ex.: Impetrei um 'habeas corpus' (estrangeirismo).\n" +
                        "🟢 Ex.: Quem foi o 'gênio' que tirou zero? (ironia)."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Aspas",
                "PONTUACAO_ASPAS_PONTUACAO",
                "🧭 7.1 Pontuação com Aspas",
                "📌 Se a frase começa e termina com aspas → o ponto fica DENTRO das aspas.\n" +
                        "🟢 Ex.: 'Nunca fiz amigos bebendo leite.' (Vinícius de Morais)\n" +
                        "🔴 Se apenas parte da citação está entre aspas → o ponto fica FORA.\n" +
                        "🟢 Ex.: Minha mãe sempre dizia que 'lágrimas não são argumentos'."
        ));

        // ==========================================
        // 8. TRAVESSÃO (—)
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Travessão",
                "PONTUACAO_TRAVESSAO_USOS",
                "🧭 Funções do Travessão",
                "📌 Mudança de interlocutor no diálogo.\n" +
                        "📌 Isolar termos/orações intercaladas com caráter explicativo ou de ênfase (substitui a vírgula).\n" +
                        "🟢 Ex.: — Pai, tirei 7.5 no exame! — Parabéns, filho!\n" +
                        "🟢 Ex.: Meus 'queridinhos' — disse ela — quero que vocês explodam!\n" +
                        "🟢 Ex.: Esse seu carro — se é que pode ser chamado assim — é uma 'carroça'."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Travessão",
                "PONTUACAO_TRAVESSAO_VIRGULA",
                "🧭 8.1 Travessão e Vírgula Juntos",
                "📌 A vírgula após o travessão é justificada por sua própria regra.\n" +
                        "🟢 Ex.: Minha filha — amor da minha vida —, não faça mais isso!\n" +
                        "🟢 Sem o termo entre travessões: Minha filha, não faça mais isso! (vocativo)."
        ));

        // ==========================================
        // 9. PARÊNTESES ( )
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Parênteses",
                "PONTUACAO_PARENTESES_USOS",
                "🧭 Funções dos Parênteses",
                "📌 Isolam esclarecimentos acessórios.\n" +
                        "🟢 Ex.: A faculdade em que estudei (UFRJ) era longe do centro.\n" +
                        "🟢 Ex.: Os políticos estão sendo investigados (pela Polícia Federal) na 'lava-jato'.\n" +
                        "🔴 Podem ser substituídos por vírgulas ou travessões."
        ));

        // ==========================================
        // 10. PONTO FINAL (.)
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Ponto Final",
                "PONTUACAO_PONTO_FINAL_USOS",
                "🧭 Funções do Ponto Final",
                "📌 Ponto Simples: indica o término de uma frase declarativa.\n" +
                        "📌 Ponto-parágrafo: indica o término do período e mudança de parágrafo.\n" +
                        "🟢 Ex.: A vida não é justa.\n" +
                        "🟢 Ex.: Tento bastante, mas não consigo melhorar.\n" +
                        "🟢 Ex.: Não sei o que houve. Ela nunca mais falou comigo.\n" +
                        "⚠️ Recurso estilístico: usar ponto final no lugar da vírgula para enfatizar."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Ponto Final",
                "PONTUACAO_PONTO_FINAL_FRAGMENTO",
                "🧭 10.1 Ponto Final e Orações Subordinadas",
                "📌 Entre orações subordinadas, o ponto final tende a NÃO funcionar.\n" +
                        "🟢 Correto: Comprei livros, que me custaram muito caro.\n" +
                        "🔴 Incorreto: Comprei livros. Que me custaram muito caro. (fragmento)."
        ));

        // ==========================================
        // 11. TIPOS DE FRASE
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_TIPOS_FRASE_CONCEITO",
                "🧭 Conceito e Classificação das Frases",
                "📌 Frase: enunciado de sentido completo.\n" +
                        "📌 Quanto à estrutura: Nominal (sem verbo) ou Verbal (com verbo/oração).\n" +
                        "📌 Quanto ao sentido: Declarativa, Interrogativa, Imperativa, Exclamativa, Optativa."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_NOMINAL_VERBAL",
                "🧭 Frase Nominal x Frase Verbal",
                "📌 Frase Nominal: NÃO possui verbo. Núcleo é um substantivo/nome.\n" +
                        "🟢 Ex.: 'Silêncio!', 'Que calor!', 'Fogo!', 'Boa-tarde!'\n" +
                        "📌 Frase Verbal (Oração): POSSUI verbo/locução verbal.\n" +
                        "🟢 Ex.: 'Alguns anos vivi em Itabira.', 'O dia decorreu sem sobressalto.'"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_DECLARATIVA",
                "🧭 Frase Declarativa (Expositiva)",
                "📌 Declara ou enuncia uma informação/juízo de valor.\n" +
                        "🟢 Entoação descendente; termina com ponto final (.) ou reticências (...).\n" +
                        "📌 Afirmativa: sem negação (Ex.: 'O governo mostra-se lento.')\n" +
                        "📌 Negativa: com palavra negativa (Ex.: 'Neli não quis montar o cavalo.')."
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_INTERROGATIVA",
                "🧭 Frase Interrogativa",
                "📌 Expressa uma pergunta/indagação.\n" +
                        "📌 Direta: pergunta direta com ponto de interrogação (?) (Ex.: 'Onde ela mora?')\n" +
                        "📌 Indireta: pergunta dentro de período composto, sem ? e com ponto final.\n" +
                        "🟢 Ex.: 'Não sei onde ela mora.', 'Perguntei quando o edital será publicado.'"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_IMPERATIVA",
                "🧭 Frase Imperativa",
                "📌 Contém ordem, conselho, proibição, solicitação, súplica.\n" +
                        "🟢 Verbos no modo imperativo (afirmativo ou negativo).\n" +
                        "🟢 Termina com ponto final (.), exclamação (!) ou reticências (...).\n" +
                        "🟢 Ex.: 'Cale-se! Respeite este templo.', 'Não me leves para o mar.', 'Por favor, venha comigo!'"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_EXCLAMATIVA",
                "🧭 Frase Exclamativa",
                "📌 Exterioriza emoções, sentimentos: admiração, surpresa, indignação, espanto.\n" +
                        "🟢 Entoação descendente; termina com ponto de exclamação (!).\n" +
                        "🟢 Ex.: 'Como eles são audaciosos!', 'Que pena!', 'Quanto desprezo em suas palavras!'"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_FRASE_OPTATIVA",
                "🧭 Frase Optativa",
                "📌 Exprime desejo, aspiração ou esperança.\n" +
                        "🟢 Verbo no modo subjuntivo.\n" +
                        "🟢 Termina com ponto final (.) ou ponto de exclamação (!).\n" +
                        "🟢 Ex.: 'Bons ventos o levem!', 'Que Deus os proteja!', 'Oxalá dê tudo certo!'"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Tipos de Frase",
                "PONTUACAO_RESUMO_TIPOS_FRASE",
                "🧭 Resumo da Classificação das Frases por Sentido",
                "📌 DECLARATIVA: informa, expõe → . ou ...\n" +
                        "📌 INTERROGATIVA DIRETA: pergunta → ?\n" +
                        "📌 INTERROGATIVA INDIRETA: pergunta embutida → .\n" +
                        "📌 IMPERATIVA: ordem, conselho → . ou ! ou ...\n" +
                        "📌 EXCLAMATIVA: emoção, sentimento → !\n" +
                        "📌 OPTATIVA: desejo, esperança → . ou !"
        ));

        // ==========================================
        // 12. RESUMO GERAL DA PONTUAÇÃO
        // ==========================================

        lista.add(new Flashcard(
                "📘 Pontuação - Resumo",
                "PONTUACAO_RESUMO_VIRGULA",
                "🧭 Resumo: Usos da Vírgula",
                "📌 Adjuntos adverbiais deslocados\n" +
                        "📌 Enumeração de termos de mesma função\n" +
                        "📌 Isolar conjunção coordenativa deslocada\n" +
                        "📌 Separar orações coordenadas\n" +
                        "📌 Separar expressões explicativas/retificativas\n" +
                        "📌 Separar orações interferentes\n" +
                        "📌 Separar orações adjetivas explicativas\n" +
                        "📌 Separar objeto direto pleonástico\n" +
                        "📌 Separar aposto e vocativo\n" +
                        "📌 Marcar omissão de palavra (Elipse/Zeugma)"
        ));

        lista.add(new Flashcard(
                "📘 Pontuação - Resumo",
                "PONTUACAO_RESUMO_SINAIS_AUXILIARES",
                "🧭 Resumo: Sinais Auxiliares",
                "📌 Ponto e Vírgula (;): Pausa intermediária; separa itens com vírgulas internas; separa orações coordenadas.\n" +
                        "📌 Dois-Pontos (:): Explicação, citação literal, enumeração.\n" +
                        "📌 Reticências (...): Interrupção, hesitação, ironia.\n" +
                        "📌 Aspas (\" \"): Citação, ironia, estrangeirismo, gíria.\n" +
                        "📌 Travessão (—): Mudança de interlocutor, isolamento de termos (ênfase).\n" +
                        "📌 Parênteses ( ): Esclarecimentos acessórios."
        ));

        return lista;
    }
}