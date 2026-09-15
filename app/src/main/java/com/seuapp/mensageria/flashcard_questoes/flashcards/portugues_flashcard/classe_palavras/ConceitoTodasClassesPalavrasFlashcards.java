package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.classe_palavras;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class ConceitoTodasClassesPalavrasFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== NOÇÕES INICIAIS ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_CLASSES_NOCOES_INICIAIS",
                "🧭 Noções Iniciais de Classes de Palavras",
                "📌 Conceitos:\n" +
                        "📎 São 10 classes gramaticais: Substantivo, Adjetivo, Advérbio, Verbo, Conjunção, Interjeição, Preposição, Artigo, Numeral e Pronome.\n" +
                        "📎 Locuções: Conjunto de palavras que equivale a uma classe. Ex: 'com coragem' (locução adjetiva).\n" +
                        "📎 Relação classe/função: 'hoje' é advérbio (classe) e adjunto adverbial de tempo (função)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_CLASSES_VARIAVEIS_INVARIAVEIS",
                "🧭 Classes Variáveis x Invariáveis",
                "📌 Distinção:\n" +
                        "✅ VARIÁVEIS: Flexionam em gênero/número. Substantivo, Adjetivo, Numeral, Pronome, Verbo, Artigo.\n" +
                        "✅ INVARIÁVEIS: Não flexionam. Advérbio, Conjunção, Preposição, Interjeição.\n" +
                        "📎 Ex: 'bonito/feia' (variável) x 'lentamente' (invariável)."
        ));

        // ==================== SUBSTANTIVO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO",
                "🧭 Substantivo",
                "📌 Definição:\n" +
                        "📎 Classe variável que nomeia seres.\n" +
                        "📎 É o núcleo das funções nominais (sujeito, objeto, etc.).\n" +
                        "📎 Recebe modificadores (determinantes) que concordam com ele.\n" +
                        "📎 Ex: 'Os seus cinco patinhos amarelos nadam na lagoa'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO_CLASSIFICACAO",
                "🧭 Classificação do Substantivo",
                "📌 Tipos:\n" +
                        "✅ COMUM: nomeia seres da mesma espécie. Ex: 'menino'.\n" +
                        "✅ PRÓPRIO: nomeia ser específico. Ex: 'João'.\n" +
                        "✅ CONCRETO: existência própria. Ex: 'pedra'.\n" +
                        "✅ ABSTRATO: ação, estado, sentimento. Ex: 'beleza'.\n" +
                        "✅ COLETIVO: pluralidade da mesma espécie. Ex: 'cardume'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO_FLEXAO_GENERO",
                "🧭 Flexão de Gênero do Substantivo",
                "📌 Classificação:\n" +
                        "✅ BIFORMES: Mudam de forma. Ex: 'lobo/loba'.\n" +
                        "✅ UNIFORMES: Uma forma para ambos. Ex: 'estudante'.\n" +
                        "📎 EPICENOS: Animais com um gênero. Ex: 'a águia'.\n" +
                        "📎 SOBRECOMUNS: Pessoas, um gênero. Ex: 'a criança'.\n" +
                        "📎 COMUNS DE DOIS GÊNEROS: Artigo distingue. Ex: 'o/a chefe'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO_FORMACAO",
                "🧭 Formação de Substantivos",
                "📌 Processos:\n" +
                        "✅ PRIMITIVOS: Forma original. Ex: 'pedra'.\n" +
                        "✅ DERIVADOS: Com afixos. Ex: 'pedreiro'.\n" +
                        "✅ DERIVAÇÃO REGRESSIVA: Verbo vira substantivo. Ex: 'cantar > canto'.\n" +
                        "✅ DERIVAÇÃO IMPRÓPRIA: Artigo substantiva qualquer classe. Ex: 'O fazer é melhor'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO_PLURAL_COMPOSTOS",
                "🧭 Plural dos Substantivos Compostos",
                "📌 Regras:\n" +
                        "✅ REGRA GERAL: Quem varia, varia. Ex: 'couves-flores'.\n" +
                        "✅ SUBSTANTIVO + PREPOSIÇÃO: Só o primeiro varia. Ex: 'pés de moleque'.\n" +
                        "✅ 2º ESPECIFICA: Ambos ou só o 1º. Ex: 'pombos-correio(s)'.\n" +
                        "📎 Guarda-chuva (verbo) → 'guarda-chuvas'.\n" +
                        "📎 Guarda-noturno (subst.) → 'guardas-noturnos'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUBSTANTIVO_GRAU",
                "🧭 Grau do Substantivo",
                "📌 Aumentativo e Diminutivo:\n" +
                        "📎 Aumentativo: 'carrão', 'homenzarrão'.\n" +
                        "📎 Diminutivo: 'carrinho', 'casebre'.\n" +
                        "⚠️ Valores discursivos: afetividade, ironia, depreciação.\n" +
                        "📎 Ex: 'sabichão' (ironia), 'padreco' (depreciação), 'carrão' (admiração)."
        ));

        // ==================== ADJETIVO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO",
                "🧭 Adjetivo",
                "📌 Definição:\n" +
                        "📎 Classe variável que se refere ao substantivo, atribuindo qualificação, condição ou estado.\n" +
                        "📎 Concorda em gênero e número com o substantivo.\n" +
                        "📎 Funções sintáticas: adjunto adnominal ou predicativo.\n" +
                        "📎 Ex: 'homem mau', 'céu azul'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO_CLASSIFICACAO",
                "🧭 Classificação do Adjetivo",
                "📌 Tipos:\n" +
                        "✅ SIMPLES: Um radical. Ex: 'literário'.\n" +
                        "✅ COMPOSTO: Mais de um radical. Ex: 'lítero-musical'.\n" +
                        "✅ PRIMITIVO: Forma original. Ex: 'bom'.\n" +
                        "✅ DERIVADO: De outra palavra. Ex: 'bondoso'.\n" +
                        "✅ EXPLICATIVO: Característica inerente. Ex: 'homem mortal'.\n" +
                        "✅ RESTRITIVO: Característica não própria. Ex: 'homem valente'.\n" +
                        "✅ GENTÍLICO: Povos. Ex: 'israelita'.\n" +
                        "✅ PÁTRIO: Cidades/países. Ex: 'israelense'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO_FLEXAO_COMPOSTOS",
                "🧭 Flexão dos Adjetivos Compostos",
                "📌 Regras:\n" +
                        "✅ REGRA GERAL: Só o segundo varia. Ex: 'luso-americanos'.\n" +
                        "✅ ADJETIVO + SUBSTANTIVO: Nenhum varia. Ex: 'camisas amarelo-ouro'.\n" +
                        "⚠️ INVARIÁVEIS: 'azul-marinho', 'cor-de-rosa', 'sem-terra'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO_VALOR_OBJETIVO_SUBJETIVO",
                "🧭 Valor Objetivo x Subjetivo do Adjetivo",
                "📌 Distinção:\n" +
                        "✅ OBJETIVO: Fato, classificação. Ex: 'carro preto', 'turista japonês'.\n" +
                        "✅ SUBJETIVO: Opinião, valoração. Ex: 'carro bonito', 'turista animado'.\n" +
                        "📎 Adjetivos de relação são objetivos e não aceitam grau."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO_GRAU",
                "🧭 Grau do Adjetivo",
                "📌 Classificação:\n" +
                        "✅ COMPARATIVO: Superioridade ('mais alto'), Inferioridade ('menos alto'), Igualdade ('tão alto quanto').\n" +
                        "✅ SUPERLATIVO RELATIVO: 'o mais alto', 'o menos alto'.\n" +
                        "✅ SUPERLATIVO ABSOLUTO: Analítico ('muito alto'), Sintético ('altíssimo').\n" +
                        "📎 Formas sintéticas: 'melhor', 'pior', 'maior', 'menor'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJETIVO_ORDEM",
                "🧭 Ordem do Adjetivo",
                "📌 Efeitos da Inversão:\n" +
                        "✅ NÃO MUDA SENTIDO: 'cão bom' x 'bom cão'.\n" +
                        "✅ MUDA SENTIDO: 'candidato pobre' (sem recursos) x 'pobre candidato' (coitado).\n" +
                        "✅ MUDA CLASSE E SENTIDO: 'alemão comunista' (foco na doutrina) x 'comunista alemão' (foco na nacionalidade).\n" +
                        "📎 Pares clássicos: 'simples questão' x 'questão simples'; 'velho amigo' x 'amigo velho'."
        ));

        // ==================== ADVÉRBIO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADVERBIO",
                "🧭 Advérbio",
                "📌 Definição:\n" +
                        "📎 Classe invariável que modifica verbo, adjetivo ou outro advérbio.\n" +
                        "📎 Indica circunstância (tempo, lugar, modo, etc.).\n" +
                        "📎 Ex: 'trabalha muito', 'muito bonita', 'muito bem'.\n" +
                        "📎 Pode modificar oração inteira: 'Infelizmente, ele faltou'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADVERBIO_CIRCUNSTANCIAS",
                "🧭 Circunstâncias Adverbiais",
                "📌 Principais:\n" +
                        "✅ TEMPO: hoje, ontem, amanhã, sempre, nunca.\n" +
                        "✅ LUGAR: aqui, ali, lá, perto, longe.\n" +
                        "✅ MODO: bem, mal, assim, devagar.\n" +
                        "✅ INTENSIDADE: muito, pouco, bastante, demais.\n" +
                        "✅ DÚVIDA: talvez, provavelmente, possivelmente.\n" +
                        "✅ AFIRMAÇÃO: sim, certamente, realmente.\n" +
                        "✅ NEGAÇÃO: não, nunca, jamais.\n" +
                        "⚠️ Analise sempre o contexto, pois o sentido varia."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADVERBIO_VS_PRONOME_INDEFINIDO",
                "🧭 Advérbio x Pronome Indefinido",
                "📌 Distinção:\n" +
                        "✅ ADVÉRBIO: Invariável. Modifica verbo, adjetivo ou advérbio. Ex: 'Trabalho muito'.\n" +
                        "✅ PRONOME INDEFINIDO: Variável. Modifica substantivo. Ex: 'Tenho muitos carros'.\n" +
                        "📎 Palavras: mais, menos, muito, pouco, bastante, demais."
        ));

        // ==================== ARTIGO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ARTIGO",
                "🧭 Artigo",
                "📌 Definição:\n" +
                        "📎 Classe variável que se antepõe ao substantivo para determiná-lo.\n" +
                        "✅ DEFINIDO: 'o', 'a', 'os', 'as'. Indica ser preciso, conhecido.\n" +
                        "✅ INDEFINIDO: 'um', 'uma', 'uns', 'umas'. Indica ser vago, não específico.\n" +
                        "📎 Ex: 'Na porta havia um policial. O policial sacou a arma.'"
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ARTIGO_VALORES",
                "🧭 Valores do Artigo",
                "📌 Usos Especiais:\n" +
                        "✅ SUBSTANTIVADOR: 'O fazer é melhor que o esperar'.\n" +
                        "✅ NOTORIEDADE: 'Ele não é um médico, é o médico'.\n" +
                        "✅ UNIVERSALIZAÇÃO: 'O homem é criativo' (todo homem).\n" +
                        "📎 'Toda casa' (qualquer) x 'toda a casa' (inteira)."
        ));

        // ==================== NUMERAL ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_NUMERAL",
                "🧭 Numeral",
                "📌 Definição:\n" +
                        "📎 Classe variável que indica quantidade, ordem, sequência ou posição.\n" +
                        "✅ CARDINAL: um, dois, três.\n" +
                        "✅ ORDINAL: primeiro, segundo, terceiro.\n" +
                        "✅ FRACIONÁRIO: um terço, dois terços.\n" +
                        "✅ MULTIPLICATIVO: o dobro, o triplo.\n" +
                        "📎 'Ambos' e 'zero' são numerais."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_NUMERAL_VS_ARTIGO",
                "🧭 Numeral x Artigo Indefinido",
                "📌 Distinção:\n" +
                        "✅ NUMERAL: Indica quantidade exata. Ex: 'Comprei um livro' (apenas um).\n" +
                        "✅ ARTIGO INDEFINIDO: Indica ser vago. Ex: 'Comprei um livro' (qualquer um).\n" +
                        "📎 O contexto define a classificação."
        ));

        // ==================== INTERJEIÇÃO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_INTERJEICAO",
                "🧭 Interjeição",
                "📌 Definição:\n" +
                        "📎 Classe invariável que expressa emoções e estados de espírito.\n" +
                        "📎 Sintetiza frases exclamativas ou apelativas.\n" +
                        "📎 Ex: 'Olá!', 'Oba!', 'Nossa!', 'Ai!', 'Puxa!'.\n" +
                        "⚠️ O valor semântico depende do contexto: 'Psiu' pode ser convite ou ordem."
        ));

        // ==================== PALAVRAS ESPECIAIS ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_O_A_OS_AS",
                "🧭 Funções de 'O, A, Os, As'",
                "📌 Classificações:\n" +
                        "✅ SUBSTANTIVO: 'O a é uma vogal'.\n" +
                        "✅ ARTIGO DEFINIDO: 'A menina comeu as balas'.\n" +
                        "✅ PRONOME OBLÍQUO ÁTONO: 'João não ama Maria. Ele a odeia'.\n" +
                        "✅ PRONOME DEMONSTRATIVO: 'Entre as camisas, comprei a de menor preço'.\n" +
                        "✅ PREPOSIÇÃO: 'Ele se referiu a João'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_SO",
                "🧭 Funções de 'Só'",
                "📌 Classificações:\n" +
                        "✅ ADVÉRBIO: Modifica verbo. Ex: 'Você só reclama'.\n" +
                        "✅ PALAVRA DENOTATIVA: Exclusão/restrição. Ex: 'Só você reclama'.\n" +
                        "✅ ADJETIVO: Sentido de 'sozinho'. Ex: 'Estou só'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_ATE",
                "🧭 Funções de 'Até'",
                "📌 Classificações:\n" +
                        "✅ PREPOSIÇÃO: Limite de tempo/espaço. Ex: 'Fui até a última parte'.\n" +
                        "✅ PALAVRA DENOTATIVA: Inclusão/reforço. Ex: 'Até o padre riu de mim'.\n" +
                        "✅ ADVÉRBIO: Inclusão/reforço. Ex: 'Ele até riu de mim'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_AINDA",
                "🧭 Funções de 'Ainda'",
                "📌 Classificações:\n" +
                        "✅ TEMPO: 'Ainda não entendi'.\n" +
                        "✅ VALOR ENFÁTICO: 'Cheguei ainda agora'.\n" +
                        "✅ ADIÇÃO: 'Ela cuida de sete filhos e ainda faz faculdade'.\n" +
                        "✅ RESSALVA: 'Se ainda fosse competente, não o demitiria'.\n" +
                        "✅ OPOSIÇÃO: 'Seu filho só faz bobagem e você ainda o recompensa'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_MESMO",
                "🧭 Funções de 'Mesmo'",
                "📌 Classificações:\n" +
                        "✅ PRONOME DEMONSTRATIVO: Reforçativo ('Eu mesma cozinho'), Comparativo ('do mesmo modo'), Especificativo ('da mesma cidade').\n" +
                        "✅ PALAVRA DENOTATIVA: Inclusão ('Todos morreram, mesmo a mãe').\n" +
                        "✅ ADVÉRBIO: Afirmação ('Ele canta mesmo!').\n" +
                        "✅ PREPOSIÇÃO ACIDENTAL: Concessão ('Mesmo cansado, não desisto').\n" +
                        "✅ LOCUÇÃO CONCESSIVA: 'Mesmo que eu falhe, não desanimarei'.\n" +
                        "⚠️ Evite usar 'o mesmo' como pronome pessoal."
        ));

        // ==================== PRONOMES ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME",
                "🧭 Pronome",
                "📌 Definição:\n" +
                        "📎 Palavra que substitui ou acompanha um substantivo.\n" +
                        "📎 Indica pessoas, posse, indefinição, quantidade, localização.\n" +
                        "✅ ADJETIVO: Acompanha o substantivo. Ex: 'Estes livros'.\n" +
                        "✅ SUBSTANTIVO: Substitui o substantivo. Ex: 'Aqueles são do Ricardo'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_PESSOAL",
                "🧭 Pronomes Pessoais",
                "📌 Classificação:\n" +
                        "✅ RETOS: eu, tu, ele, nós, vós, eles (sujeito).\n" +
                        "✅ OBLÍQUOS ÁTONOS: me, te, se, o, a, lhe, nos, vos (complemento).\n" +
                        "✅ OBLÍQUOS TÔNICOS: mim, comigo, ti, contigo, si, conosco, convosco (com preposição).\n" +
                        "📎 'o, a, os, as' = objeto direto.\n" +
                        "📎 'lhe, lhes' = objeto indireto."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_POSSESSIVO",
                "🧭 Pronomes Possessivos",
                "📌 Definição:\n" +
                        "📎 Indicam posse. Concordam com o substantivo posterior.\n" +
                        "📎 Ex: 'meu(s)', 'minha(s)', 'teu(s)', 'seu(s)', 'nosso(s)', 'vosso(s)'.\n" +
                        "📎 Função sintática: adjunto adnominal.\n" +
                        "📎 Podem ter valor afetivo, de parentesco, etc."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_DEMONSTRATIVO",
                "🧭 Pronomes Demonstrativos",
                "📌 Definição:\n" +
                        "📎 Apontam a posição dos elementos no tempo, espaço e texto.\n" +
                        "✅ ESTE: Perto do falante; tempo presente; será mencionado (catafórico).\n" +
                        "✅ ESSE: Perto do ouvinte; passado recente; já mencionado (anafórico).\n" +
                        "✅ AQUELE: Longe de ambos; passado distante.\n" +
                        "📎 'O, A, OS, AS' podem ser demonstrativos. Ex: 'Quero o que está em promoção'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_INDEFINIDO",
                "🧭 Pronomes Indefinidos",
                "📌 Definição:\n" +
                        "📎 Indicam quantidade de forma vaga, imprecisa.\n" +
                        "📎 Ex: 'ninguém', 'algum', 'todo', 'outro', 'muito', 'pouco', 'cada', 'qualquer'.\n" +
                        "📎 Locuções: 'qualquer um', 'cada um', 'todo mundo'.\n" +
                        "⚠️ 'Certo' e 'bastante' são pronomes antes do substantivo e adjetivos depois."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_INTERROGATIVO",
                "🧭 Pronomes Interrogativos",
                "📌 Definição:\n" +
                        "📎 Introduzem perguntas diretas (com ?) ou indiretas (sem ?).\n" +
                        "📎 Ex: 'Que', 'Quem', 'Qual(is)', 'Quantos'.\n" +
                        "📎 Ex direta: 'Quem é ele?'\n" +
                        "📎 Ex indireta: 'Perguntei quem era ele'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_RELATIVO",
                "🧭 Pronomes Relativos",
                "📌 Definição:\n" +
                        "📎 Retomam um antecedente e introduzem orações adjetivas.\n" +
                        "✅ VARIÁVEIS: 'o qual', 'a qual', 'os quais', 'as quais', 'cujo', 'cuja'.\n" +
                        "✅ INVARIÁVEIS: 'que', 'quem', 'onde', 'como', 'quando', 'quanto'.\n" +
                        "📎 'Cujo' indica posse e não aceita artigo depois.\n" +
                        "📎 'Onde' só para lugar físico."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PRONOME_TRATAMENTO",
                "🧭 Pronomes de Tratamento",
                "📌 Definição:\n" +
                        "📎 Formas de cortesia e reverência.\n" +
                        "📎 Concordam com a 3ª pessoa (pense em 'Você').\n" +
                        "✅ Vossa Excelência: altas autoridades.\n" +
                        "✅ Vossa Senhoria: autoridades de menor escalão.\n" +
                        "✅ Vossa Santidade: Papa.\n" +
                        "✅ Vossa Reverência: sacerdotes.\n" +
                        "⚠️ 'Sua Excelência' = 3ª pessoa; 'Vossa Excelência' = 2ª pessoa."
        ));

        // ==================== COLOCAÇÃO PRONOMINAL ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COLOCACAO_PRONOMINAL",
                "🧭 Colocação Pronominal",
                "📌 Posições:\n" +
                        "✅ PRÓCLISE: Antes do verbo. Ex: 'Hoje me escondi'.\n" +
                        "✅ ÊNCLISE: Depois do verbo. Ex: 'Escondi-me'.\n" +
                        "✅ MESÓCLISE: No meio do verbo. Ex: 'Esconder-me-ia'.\n" +
                        "📎 Regra geral: Palavras atrativas (negativas, advérbios, pronomes) exigem próclise."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COLOCACAO_PROCLISE",
                "🧭 Palavras Atrativas de Próclise",
                "📌 Atraem o pronome para antes do verbo:\n" +
                        "✅ PALAVRAS NEGATIVAS: não, nunca, jamais.\n" +
                        "✅ ADVÉRBIOS: sempre, certamente, provavelmente.\n" +
                        "✅ PRONOMES RELATIVOS: que, os quais, cujas.\n" +
                        "✅ PRONOMES INDEFINIDOS: nada, tudo, outros, certas.\n" +
                        "✅ PRONOMES INTERROGATIVOS: quem, que, qual.\n" +
                        "✅ CONJUNÇÕES SUBORDINATIVAS: que, se, embora, quando, como."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COLOCACAO_PROIBICOES",
                "🧭 Proibições na Colocação Pronominal",
                "📌 Não se usa pronome átono:\n" +
                        "❌ No início de período: 'Me dá um cigarro' (errado).\n" +
                        "❌ Após futuros (presente e pretérito): 'Darei-te' (errado).\n" +
                        "❌ Após particípio: 'Tinha emprestado-lhe' (errado).\n" +
                        "⚠️ Após vírgula, recomenda-se evitar próclise."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COLOCACAO_LOCUCAO_VERBAL",
                "🧭 Colocação Pronominal na Locução Verbal",
                "📌 Regras:\n" +
                        "✅ Sem palavra atrativa: pronome antes, depois ou no meio.\n" +
                        "📎 Ex: 'Eu lhe estou emprestando' / 'Eu estou lhe emprestando' / 'Eu estou-lhe emprestando'.\n" +
                        "✅ Com palavra atrativa: próclise obrigatória.\n" +
                        "📎 Ex: 'Eu não lhe estou emprestando' / 'Eu não estou lhe emprestando'.\n" +
                        "❌ 'Eu não estou-lhe emprestando' (errado)."
        ));

        return lista;
    }
}
