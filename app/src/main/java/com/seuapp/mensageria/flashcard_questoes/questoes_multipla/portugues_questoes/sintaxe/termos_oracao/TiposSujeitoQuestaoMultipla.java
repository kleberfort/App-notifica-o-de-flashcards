package com.seuapp.mensageria.flashcard_questoes.questoes_multipla.portugues_questoes.sintaxe.termos_oracao;

import com.seuapp.mensageria.model.QuestaoMultiplaEscolha;

import java.util.ArrayList;
import java.util.List;

public class TiposSujeitoQuestaoMultipla {

    private List<QuestaoMultiplaEscolha> questoesSintaxe;

    public TiposSujeitoQuestaoMultipla() {
        questoesSintaxe = new ArrayList<>();
        inicializarQuestoes();
    }

    private void inicializarQuestoes() {

        // =================================================================================
        // QUESTÃO 1 (FCC / TRT - 15ª REGIÃO - SP / 2025)
        // =================================================================================
        String textoQuestao1 =
                "Muitos e muitos anos atrás, antes do asfalto, quando a rodovia Fernão Dias ou era [um mar de pó]\n" +
                        "ou um mar de lama, as viagens eram aventuras. Eu morava no interior de Minas e o jeito de vir a\n" +
                        "Campinas para ver a namorada era arranjar carona em algum caminhão. Pois foi numa destas\n" +
                        "vezes que o motorista, delicadamente, para início de uma conversa que prometia ser muito\n" +
                        "longa, me perguntou: \"E O que [é que] você faz?\" Eu poderia ter dito simplesmente: \"Sou\n" +
                        "professor\". [Isto] ele entenderia [perfeitamente], pois já havia frequentado escolas, sabia [muitas coisas]\n" +
                        "sobre professores, e passaria então a contar de suas proezas na aritmética e suas\n" +
                        "dificuldades com a língua pátria. Mas eu, tolo, e para dar um ar de importância, respondi: \"Sou\n" +
                        "professor de filosofia...\" O rosto do motorista se iluminou num largo sorriso. \"Até que enfim\", ele\n" +
                        "disse. \"Faz anos que eu quero saber o que é filosofia e até hoje não encontrei ninguém que me\n" +
                        "explique. Mas hoje tenho a sorte de ter um professor de filosofia como companheiro de viagem.\n" +
                        "Afinal de contas, o que é filosofia?\"\n" +
                        "Não tenho [memória alguma] do que lhe disse como inútil explicação.\n" +
                        "(ALVES, Rubens. O retorno e terno. Papirus, Campinas, 2010)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 15ª REGIÃO - SP / 2025",
                textoQuestao1,
                "A expressão do trecho que realça um segmento da frase sem exercer função sintática está sublinhado em:",
                "quando a rodovia Fernão Dias ou era [um mar de pó]",
                "Isto ele entenderia [perfeitamente]",
                "“E o que [é que] você faz?”",
                "sabia [muitas coisas] sobre professores",
                "não tenho memória [alguma] do que lhe disse como inútil explicação",
                "c",
                "Na letra C, “[é que]” é uma expressão expletiva ou de realce e serve apenas para dar ênfase, não exercendo qualquer função sintática na oração e podendo ser retirada sem qualquer prejuízo: “E o que é que você faz?” / “E o que você faz?”"
        ));

        // =================================================================================
        // QUESTÃO 2 (FCC / TRT - 6ª REGIÃO - PE / 2025)
        // =================================================================================
        String textoQuestao2 =
                "[Entre luas]\n" +
                        "Declarou-me uma amiga que passou a se dedicar a olhar o céu estrelado para se consolar das\n" +
                        "feiuras terrestres. Não seria isso uma solução excessivamente cômoda? Se quiséssemos levar essa\n" +
                        "declaração às últimas consequências, acabaríamos dizendo: \"que a Terra continue de mal a pior,\n" +
                        "eu olho para o céu e reencontro meu equilíbrio interior\". Não estaria minha amiga\n" +
                        "instrumentalizando Ilicitamente esse céu estrelado?\n" +
                        "Não buscaria eu exortá-la a mais entusiasmo lembrando as magníficas aventuras cosmonáuticas\n" +
                        "da humanidade, essas lutas míticas pela supremacia terrestre sobre o firmamento. O que me\n" +
                        "interessa, ao contrário, é tudo o que é apropriação verdadeira do espaço e dos objetos celestes,\n" +
                        "ou seja, o conhecimento objetivo de uma relação entre nós e o universo extra-humano.\n" +
                        "A Lua, desde a Antiguidade, significou para os homens esse desejo de um paraíso luminoso e\n" +
                        "sereno, e essa devoção lunar dos poetas se perpetuou pelos tempos. Mas a Lua dos poetas tem\n" +
                        "alguma coisa a ver com as imagens leitosas e esburacadas que os foguetes nos enviam? Talvez\n" +
                        "não, ainda; mas o fato de sermos obrigados a reconsiderar a Lua de maneira nova nos levará a\n" +
                        "reconsiderar de maneira nova Inúmeras outras coisas. Quem ama a Lua realmente não se\n" +
                        "contenta em contemplá-la como uma imagem convencional: quer entrar numa relação mais\n" +
                        "estreita com ela, quer ver [mais] na Lua, quer que a [Lua] lhe diga [mais].\n" +
                        "(Adaptado de: CALVINO. Italo. Assunto encerrado - Discursos sobre literatura e sociedade. Tradução: Roberta Bami.\n" +
                        "São Paulo: Companhia das Letras, 2006, p. 217-218)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 6ª REGIÃO - PE / 2025",
                textoQuestao2,
                "No último parágrafo, em quer ver mais na Lua e quer que a Lua lhe diga mais,",
                "o termo mais intensifica as ações representadas.",
                "os verbos são intransitivos.",
                "o termo Lua repete-se na função de sujeito.",
                "o termo Lua repete-se na função de complemento verbal.",
                "reconhecemos duas orações sem sujeito.",
                "a",
                "“mais” é advérbio de intensidade e, em ambas as orações, intensifica os verbos correspondentes: “ver” e “diga”."
        ));

        // =================================================================================
        // QUESTÃO 3 (FCC / TRF 3ª / 2024)
        // =================================================================================
        String textoQuestao3 =
                "Devaneio, logo existo\n" +
                        "As três pessoas que estavam comigo no elevador se recusavam a devanear. Assim como as\n" +
                        "pessoas do vagão do metrô. Foram duas rápidas observações que me levaram a respirar aliviado\n" +
                        "por ter percebido que ainda preservava a auto indulgência tanto do devaneio quanto da\n" +
                        "inspeção de atitudes alheias. A crítica de “ninguém mais conversa; todo mundo anda e até come\n" +
                        "com a fuça no celular” nunca me convenceu, pois se a pessoa não está prejudicando ninguém,\n" +
                        "que faça o que bem entender. No meu conceito, porém, ela está deixando de existir como\n" +
                        "indivíduo, pois é no devaneio, na contemplação e na troca que se imprime identidade no mundo.\n" +
                        "Explico melhor. E [para isso] recorro à inteligência artificial generativa, uma evocação à própria\n" +
                        "base de dados para geração de conteúdos novos, sejam textos, áudios, músicas, imagens ou\n" +
                        "vídeos. E o que é essa jornada se não o próprio caminho do processo criativo, por onde\n" +
                        "estabelecemos nossa assinatura? Os pensamentos não nascem no vácuo. As descobertas\n" +
                        "tampouco. Insights germinam do correlacionamento de memórias, da conexão das diferentes\n" +
                        "peças no repertório intelectual que fomos colecionando no decorrer da vida. A iluminação é\n" +
                        "elaborada em nosso devaneio. Só que cada vez menos somos propensos à permissão de\n" +
                        "experiências tão somente contemplativas. Até o caminhar precisa ser preenchido por fone de\n" +
                        "ouvido, consumo de notícias, checagem de mensagens de Whatsapp.\n" +
                        "Quando dizem que a meditação é um dos pilares de estilo de vida saudável não explicam\n" +
                        "devidamente sua importância. O próprio René Descartes, inspirador do título deste artigo e do\n" +
                        "cartesianismo, lançou obra chamada Meditações. Também não é explicito o risco do comodismo\n" +
                        "de entregar tudo o que torna humana a nossa espécie a um dispositivo. Já é sabido desde o\n" +
                        "século 18, na Revolução Industrial, que as máquinas são superiores em produção. Só que [a mecanização] não ativa a inteligência nem a razão, que são as ligas da vida e do real progresso\n" +
                        "dos seres humanos. Ainda no século 17 [os filósofos iluministas] ensinaram o valor do devaneio na\n" +
                        "formação de pessoas com melhores decisões morais.\n" +
                        "(Adaptado de: PIMENTAL, Luiz Cesar, Revista Isto é, 15/03/2024, Disponível em: https:/fistoe.com.br)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRF 3ª / 2024",
                textoQuestao3,
                "O elemento sublinhado em 'Ainda no século 17 [os filósofos iluministas] ensinaram o valor do devaneio' (3º parágrafo) exerce a mesma função sintática daquele sublinhado em:",
                "E para [isso] recorro à inteligência artificial generativa (2º parágrafo)",
                "pois se a pessoa não está prejudicando [ninguém] (1º parágrafo)",
                "Só que [a mecanização] não ativa a inteligência nem a razão (3º parágrafo)",
                "As três pessoas que estavam comigo [no elevador] se recusavam a devanear (1º parágrafo)",
                "ela está deixando de existir [como indivíduo] (1º parágrafo)",
                "c",
                "O elemento sublinhado '[os filósofos iluministas]' exerce função sintática de sujeito. Na C, '[a mecanização]' é sujeito do verbo 'ativa'."
        ));

        // =================================================================================
        // QUESTÃO 4 (FCC / MPE-AM / 2024)
        // =================================================================================
        String textoQuestao4 =
                "Atenção: Considere o texto “A irresistível ascensão do boto”, de Marcelo Leite, para responder à questão.\n" +
                        "Diz a lenda amazônica que os botos saem do rio, se transformam em moços formosos e\n" +
                        "conquistam as donzelas, engravidando-as. Vaidoso, na forma humana leva sempre um chapéu na\n" +
                        "cabeça, supostamente para cobrir o orifício reminiscente da existência aquática. Pode não ser\n" +
                        "verdade, mas serve como justificação para barrigas inexplicáveis pela ausência de marido. Bem\n" +
                        "ao modo da natureza social da Amazônia, onde bichos costumam virar gente, e vice-versa. O\n" +
                        "trânsito de jabutis, onças, peixes e botos entre o que nós, de fora, enxergamos como dois\n" +
                        "mundos é um verdadeiro carnaval.\n" +
                        "Mitos e causos à parte, não é que a ciência revela o que os amazônidas já sabiam? [Botos machos] são mesmo galantes. Como seus primos humanos, muitas vezes partem para atrair\n" +
                        "fêmeas com um ramalhete — não de flores, mas de plantas aquáticas. Essa imitação barata do\n" +
                        "comportamento humano é pesquisada por Vera Maria Ferreira da Silva, do Instituto Nacional de\n" +
                        "Pesquisas da Amazônia (INPA), e Tony Martin, do Serviço Antártico Britânico. Não deixa de ser\n" +
                        "irônico que a instituição de Martin promova estudos em plena região equatorial. Nem, tampouco,\n" +
                        "que o estudo de Silva se torne público no Brasil por intermédio de uma revista de divulgação\n" +
                        "britânica, a New Scientist.\n" +
                        "[Silva e Martin] estudaram [botos-tucuxis] por três anos na região amazônica. Avistaram mais\n" +
                        "de 6.000 grupos em Mamirauá, Tefé (oeste do Estado do Amazonas). Em mais de 200 dessas\n" +
                        "observações havia um indivíduo carregando objetos com o bico, como um maço de ervas ou um\n" +
                        "pedaço de pau. Em geral [o portador] era [um macho]. Era, portanto, forte a sugestão de que se\n" +
                        "trata de um comportamento sexual. Para comprovar sua hipótese, Silva e Martin buscaram o\n" +
                        "socorro da genética. Os resultados preliminares indicam que os mais assíduos portadores de\n" +
                        "ramos e paus seriam também os reprodutores mais bem-sucedidos. Em português claro, O\n" +
                        "comportamento seria uma forma de exibicionismo — no bom sentido. [Machos] exibem [objetos vistosos] para se valorizar sexualmente aos olhos das fêmeas.\n" +
                        "O curioso é encontrar o expediente só em alguns grupos isolados desses cetáceos. O\n" +
                        "padrão parece sugerir que [o comportamento] só faz parte do repertório de alguns bandos,\n" +
                        "disseminando-se neles, ou para outros, por imitação e aprendizado. Numa única e controversa\n" +
                        "palavra, cultura. Não faz muito tempo, essa era uma noção que só fazia sentido aplicar a\n" +
                        "humanos. “Cultura”, afinal, sempre foi entendida como o oposto de “natureza”. A fronteira, tão\n" +
                        "cara às ciências humanas, foi ficando menos nítida com as sucessivas documentações, por vários\n" +
                        "grupos de pesquisa, do uso de ferramentas por outros primatas. Pelo visto, [os botos] saem do rio.\n" +
                        "(Adaptado de: LEITE, Marcelo. Ciência: use com cuidado. Campinas: Editora da Unicamp, 2014)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / MPE-AM / 2024",
                textoQuestao4,
                "Em '[Silva e Martin] estudaram [botos-tucuxis]' (3º parágrafo), a expressão sublinhada '[botos-tucuxis]' exerce a mesma função sintática da expressão sublinhada em:",
                "Machos exibem [objetos vistosos] para se valorizar (3º parágrafo).",
                "[o comportamento] só faz parte do repertório de alguns bandos (4º parágrafo).",
                "Em geral o portador era [um macho] (3º parágrafo).",
                "[Botos machos] são mesmo galantes (2º parágrafo).",
                "[os botos] saem do rio (1º parágrafo).",
                "a",
                "'Silva e Martin' são o sujeito do verbo 'estudaram' e '[botos-tucuxis]', seu objeto direto. O outro objeto direto está na letra A: '[objetos vistosos]'."
        ));

        // =================================================================================
        // QUESTÃO 5 (FCC / DPE-AM / 2024)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / DPE-AM / 2024",
                "Do início da Segunda Revolução Industrial até hoje, [a temperatura média do planeta] subiu cerca de 1,1 grau Celsius (ºC).",
                "O elemento que exerce, no contexto em que se encontra, a mesma função sintática que o sublinhado ([a temperatura média do planeta]) na frase acima está também sublinhado em:",
                "um padrão de habitação e ocupação do solo provavelmente inédito [na história da humanidade].",
                "Hoje, [as ilhas de calor] se manifestam em cidades de qualquer tamanho, das menores às maiores.",
                "A emissão de gases de efeito estufa é o principal motivo que torna [o clima na Terra] progressivamente mais quente a partir de meados do século XIX.",
                "No plano local, o estilo de vida urbano adotado atualmente pela maior parte da população global potencializa ainda mais o calor de fundo criado [pelas mudanças climáticas].",
                "Com menos [áreas verdes], mais concreto e asfalto e ocupação geralmente desordenada do solo, as cidades são mais abafadas.",
                "b",
                "Quem/O que subiu? '[a temperatura média do planeta]' subiu (sujeito). Quem/O que se manifesta? '[as ilhas de calor]' se manifestam (sujeito)."
        ));

        // =================================================================================
        // QUESTÃO 6 (FCC/MPE PB/2023)
        // =================================================================================
        String textoQuestao6 =
                "Leia o conto “Casos de baleias”, de Carlos Drummond de Andrade.\n" +
                        "[A baleia] telegrafou [ao superintendente da Pesca], queixando-se de que estava sendo caçada\n" +
                        "demais, e a continuar assim sua espécie desapareceria com prejuízo geral do meio ambiente e\n" +
                        "dos usuários.\n" +
                        "[O superintendente], em ofício, respondeu [à baleia] que não podia fazer nada senão recomendar\n" +
                        "que de duas baleias uma fosse poupada, e esta ganhasse número de registro para identificar-se.\n" +
                        "Em face dessa resolução, todas as baleias providenciaram registro, e o obtiveram pela maneira\n" +
                        "como se obtêm [essas coisas], à margem dos regulamentos. O mar ficou coalhado de números,\n" +
                        "que rabeavam alegremente, e [o esguicho dos cetáceos] [...] dava [ideia de imenso jardim] explodindo em repuxos, dourados de sol, ou prateados de\n" +
                        "lua.\n" +
                        "[Um inspetor da Superintendência] [...] pôs-se a examinar os livros e verificou que havia infinidade de números repetidos.\n" +
                        "Cancelou-se o registro, e os funcionários responsáveis pela fraude, jogados ao mar, foram\n" +
                        "devorados pelas baleias, que passaram a ser caçadas indiscriminadamente. A recomendação\n" +
                        "internacional para suspender a caça por tempo indeterminado só alcançará duas baleias vivas,\n" +
                        "escondidas e fantasiadas de rochedo, no litoral do Espírito Santo.\n" +
                        "(ANDRADE, Carlos Drummond de. Contos plausíveis. São Paulo: Companhia das Letras, 2012)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC/MPE PB/2023",
                textoQuestao6,
                "O elemento sublinhado em “pela maneira como se obtêm [essas coisas]” (3º parágrafo) exerce a mesma função sintática daquele sublinhado em:",
                "A baleia telegrafou ao [superintendente da Pesca] (1º parágrafo).",
                "O superintendente [...] respondeu à baleia que não podia fazer [nada] (2º parágrafo).",
                "o esguicho dos cetáceos [...] dava [ideia de imenso jardim] (3º parágrafo).",
                "Em [face dessa resolução], todas as baleias providenciaram registro (3º parágrafo).",
                "[Um inspetor da Superintendência] [...] pôs-se a examinar os livros (4º parágrafo).",
                "e",
                "Em “como se obtêm [essas coisas]”; “[essas coisas]” é sujeito passivo: como essas coisas são obtidas. Em e) '[Um inspetor da Superintendência]' é o sujeito de 'pôs-se'."
        ));

        // =================================================================================
        // QUESTÃO 7 (FCC/TRT 18/2023) - POEMA
        // =================================================================================
        String textoQuestao7 =
                "Atenção: Considere o poema de Fernando Pessoa para responder à questão.\n" +
                        "Às vezes, em sonho triste\n" +
                        "[Nos meus desejos] existe\n" +
                        "Longinquamente [um país]\n" +
                        "Onde ser feliz consiste\n" +
                        "Apenas em ser feliz.\n" +
                        "Vive-se como se nasce\n" +
                        "Sem o querer nem saber.\n" +
                        "Nessa ilusão de viver\n" +
                        "O tempo morre e renasce\n" +
                        "Sem que o sintamos correr.\n" +
                        "O sentir e o desejar\n" +
                        "São banidos dessa terra.\n" +
                        "O amor não é amor\n" +
                        "[Nesse país] por onde erra\n" +
                        "[Meu longínquo divagar].\n" +
                        "Nem se sonha nem se vive:\n" +
                        "É uma infância sem fim.\n" +
                        "Parece que se revive\n" +
                        "Tão suave é viver assim\n" +
                        "[Nesse impossível jardim].\n" +
                        "(PESSOA, Fernando. Obra poética. Rio de Janeiro: Editora Nova Aguilar, 1997)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC/TRT 18/2023",
                textoQuestao7,
                "Exerce a função sintática de sujeito a expressão sublinhada em:",
                "Onde ser feliz consiste / [Apenas em ser feliz].",
                "[Nos meus desejos] existe / Longinquamente um país.",
                "Nesse país por onde erra / [Meu longínquo divagar].",
                "Vive-se [como se nasce].",
                "Tão suave é viver assim / [Nesse impossível jardim].",
                "c",
                "‘[Meu longínquo divagar]’ é sujeito do verbo 'errar': Meu longínquo divagar ERRA (VAGA) por esse país."
        ));

        // =================================================================================
        // QUESTÃO 8 (FCC/PM BA/2023)
        // =================================================================================
        String textoQuestao8 =
                "Para responder à questão, leia a crônica O importuno, de Carlos Drummond de Andrade.\n" +
                        "– Que negócio é esse? Ninguém me atende?\n" +
                        "A muito custo, atenderam; isto é, confessaram que não podiam atender, por causa do jogo com a Bulgária.\n" +
                        "– Mas que tenho eu com o jogo com a Bulgária, façam-me o favor? E os senhores por acaso foram escalados para jogar?\n" +
                        "O chefe da seção aproximou-se, apaziguador:\n" +
                        "– Desculpe, cavalheiro. Queira voltar na quinta-feira, 14. [Quinta-feira] não haverá jogo, estaremos mais tranquilos.\n" +
                        "– Mas prometeram que meu papel ficaria pronto hoje sem falta.\n" +
                        "– Foi um lapso do funcionário que lhe prometeu tal coisa. Ele não se lembrou da Bulgária. O Brasil lutando com a Bulgária, o senhor quer que o nosso pessoal tenha cabeça fria para informar papéis?\n" +
                        "– Perdão, o jogo vai ser logo mais, às quinze horas. É meio-dia, e já estão torcendo?\n" +
                        "– Ah, meu caro senhor, não critique nossos bravos companheiros, que fizeram o sacrifício de vir à repartição trabalhar quando podiam ficar em casa ou na rua, participando da emoção do povo…\n" +
                        "– Se vieram trabalhar, por que não trabalham?\n" +
                        "– Porque não podem, ouviu? Porque não podem. [O senhor] está ficando [impertinente]. Aliás, disse logo de saída que não tinha nada com o jogo com a Bulgária! O Brasil em guerra – porque é uma verdadeira guerra, como revelam os jornais – nos campos da Europa, e o senhor, indiferente, alienado, perguntando por um vago papel, uma coisinha individual, insignificante, em face dos interesses da pátria!\n" +
                        "– Muito bem! Muito bem! – funcionários batiam palmas.\n" +
                        "– Mas, perdão, eu... eu…\n" +
                        "– Já sei que vai se desculpar. O momento não é para dissensões. O momento é de união nacional, cérebros e corações uníssonos. Vamos, cavalheiro, não perturbe a preparação espiritual dos meus colegas, que estão analisando a Seleção Búlgara e descobrindo meios de frustrar a marcação de Pelé. O senhor acha bem o 4-2-4 ou prefere o 4-3-3?\n" +
                        "– Bem, eu... eu…\n" +
                        "– Compreendo que não queira opinar. É muita responsabilidade. Eu aliás não forço opinião de ninguém. Esta algazarra que o senhor está vendo resulta da ampla liberdade de opinião com que se discute a formação do selecionado. Todos querem ajudar, por isso cada um tem sua ideia própria, que não se ajusta com a ideia do outro, mas o resultado é admirável. A unidade pela diversidade. [Na hora da batalha], formamos [uma frente única].\n" +
                        "– Está certo, mas será que, voltando na quinta-feira, eu encontro o meu papel pronto mesmo?\n" +
                        "– Ah, o senhor é terrível, nem numa hora dessas esquece o seu papelzinho! Eu disse quinta-feira? Sim, certamente, pois é dia de folga no campeonato. Mas espere aí, com quatro jogos na quarta-feira, e o gasto de energia que isso determina, como é que eu posso garantir o seu papel para quinta-feira? Quer saber de uma coisa? Seja razoável, meu amigo, procure colaborar. Procure ser bom brasileiro, volte em agosto, na segunda quinzena de agosto é melhor, depois de comemorarmos a conquista do Tri.\n" +
                        "– E... se não conquistarmos?\n" +
                        "– [Não diga uma besteira dessas]! Sai, azar! Vá-se embora, antes que eu perca a cabeça e…\n" +
                        "Vozes indignadas:\n" +
                        "– Fora! Fora!\n" +
                        "O servente sobe na cadeira e comanda o coro:\n" +
                        "– Bra-sil! Bra-sil! Bra-sil!\n" +
                        "[Estava salva a honra da torcida], e o importuno retirou-se precipitadamente.\n" +
                        "(Adaptado de: ANDRADE, Carlos Drummond de. Quando é dia de futebol. São Paulo: Companhia das Letras, 2014)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC/PM BA/2023",
                textoQuestao8,
                "Exerce a função sintática de sujeito o elemento sublinhado no seguinte trecho:",
                "O senhor está ficando [impertinente] (11º parágrafo).",
                "Quinta-feira não haverá [jogo] (5º parágrafo).",
                "Estava salva [a honra da torcida] (25º parágrafo).",
                "Na hora da batalha, formamos [uma frente única] (16º parágrafo).",
                "Não diga [uma besteira dessas] (20º parágrafo).",
                "c",
                "Temos sujeito do verbo 'estar' em: 'Estava salva a honra da torcida'."
        ));

        // =================================================================================
        // QUESTÃO 9 (FCC/TRT 18/2023) - "A casadeira"
        // =================================================================================
        String textoQuestao9 =
                "Atenção: Leia a crônica “A casadeira”, de Carlos Drummond de Andrade, para responder à questão.\n" +
                        "Testemunhei ontem, na loja de Copacabana, um acontecimento banal e maravilhoso. A senhora\n" +
                        "sentou-se na banqueta e cruzou elegantemente as pernas. O vendedor, agachado, calçou-[lhe] o\n" +
                        "par de sapatos. Ela se ergueu, ensaiou alguns passos airosos em frente do espelho, mirou-se,\n" +
                        "remirou-se, voltou à banqueta. O sapato foi substituído por outro. Seguiu-se na mesma\n" +
                        "autocontemplação, e o novo par de sapatos foi experimentado, e nova verificação especular.\n" +
                        "Isso, infinitas vezes. No semblante do vendedor, nem cansaço, nem impaciência. Explica-se: a\n" +
                        "cliente não refugava os sapatos experimentados. Adquiria-os todos. Adquiriu dozes pares, se\n" +
                        "bem contei.\n" +
                        "– Ela está fazendo sua reforma de base? – perguntei a outro vendedor, que sorriu e esclareceu:\n" +
                        "– A de base e a civil. Vai se casar pela terceira vez.\n" +
                        "– Coitada... Vocação de viúva.\n" +
                        "– Não é isso, senhor. Os dois primeiros maridos estão vivos. É casadeira, sabe como é?\n" +
                        "Não me pareceu que, para casar pela terceira vez, ela tivesse necessidade de tanto calçamento.\n" +
                        "Oito ou nove pares seriam talvez para irmãs de pé igual ao seu, que ficaram em casa? Hipótese\n" +
                        "boba, que formulei e repeli incontinente. Ninguém neste mundo tem pé igual ao de ninguém,\n" +
                        "nem sequer ao de si mesmo, quanto mais ao da irmã. Daí avancei para outra hipótese mais\n" +
                        "plausível. Aquela senhora, na aparência normal, devia ter pés suplementares, Deus me perdoe, e\n" +
                        "usava-os dois de cada vez, recolhendo os demais mediante uma organização anatômica (ou\n" +
                        "eletrônica) absolutamente inédita. Observei-[a] com atenção e zelo científico, na expectativa de\n" +
                        "movimento menos controlado, que denunciasse o segredo. Nada disso. Até onde se podia\n" +
                        "perceber, eram apenas duas pernas, e bem agradáveis, terminando em dois exclusivos pés, de\n" +
                        "esbelto formato.\n" +
                        "Assim, a coleção era mesmo para casar – e fiquei conjeturando que o casamento é uma rara\n" +
                        "coisa, exigindo a todo instante que a mulher troque de sapato, não se sabe bem para quê – a\n" +
                        "menos que os vá perdendo no afã de atirá-los sobre o marido, e eles (não o marido) sumam pela\n" +
                        "janela do apartamento.\n" +
                        "A senhora pagou – não em dinheiro ou cheque, mas com um sorriso que mandava receber num\n" +
                        "lugar bastante acreditado, pois já reparei que as maiores compras são sempre pagas nele, e [aos comerciantes] agrada-[lhes] o sistema. As caixas de sapato adquiridas foram transportadas para o\n" +
                        "carro, estacionado em frente à loja. Mentiria se dissesse que eram doze carros monumentais, com\n" +
                        "doze motoristas louros, de olhos azuis. Não. Era um carro só, simplesinho, sem motorista, nem\n" +
                        "precisava dele, pois logo se percebeu sua natureza de teleguiado. Sem manobra, flechou no\n" +
                        "espaço e sumiu, levando a noiva e seus doze pares de França, perdão! de sapatos. Eu preveni\n" +
                        "que o caso era banal e maravilhoso.\n" +
                        "(Adaptado de: ANDRADE, Carlos Drummond de. Cadeira de balanço. São Paulo: Companhia das Letras, 2020)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC/TRT 18/2023",
                textoQuestao9,
                "Sempre que haja necessidade expressiva de reforço, de ênfase, pode o objeto indireto vir repetido. Essa reiteração recebe o nome de objeto indireto pleonástico. Ocorre objeto indireto pleonástico no seguinte trecho:",
                "aos comerciantes agrada-lhes o sistema.",
                "O vendedor, agachado, calçou-lhe o par de sapatos.",
                "a cliente não refugava os sapatos experimentados.",
                "Ninguém neste mundo tem pé igual ao de ninguém.",
                "Observei-a com atenção e zelo científico.",
                "a",
                "Aqui a banca pede o objeto pleonástico, que é 'repetido' por motivo de ênfase: AOS COMERCIANTES agrada-LHES (A ELES/AOS COMERCIANTES) o sistema."
        ));

        // =================================================================================
        // QUESTÃO 10 (FCC / MPE-PB /Analista de Sistemas / 2023) - POEMA SABARÁ
        // =================================================================================
        String textoQuestao10 =
                "Leia o trecho do poema de Carlos Drummond de Andrade.\n" +
                        "II. SABARÁ\n" +
                        "A dois passos da cidade importante\n" +
                        "[a cidadezinha] está calada, entrevada.\n" +
                        "(Atrás daquele morro, com vergonha do trem.)\n" +
                        "Só as igrejas\n" +
                        "só [as torres pontudas das igrejas]\n" +
                        "não brincam de esconder.\n" +
                        "[O Rio das Velhas] lambe [as casas velhas],\n" +
                        "[casas encardidas] onde há [velhas] nas janelas.\n" +
                        "Ruas em pé\n" +
                        "(...)\n" +
                        "Eu fico cá embaixo maginando na ponte moderna – moderna por quê?\n" +
                        "[A água] que corre\n" +
                        "já viu o Borba.\n" +
                        "Não a que corre, mas a que não para nunca de correr.\n" +
                        "Ai tempo!\n" +
                        "Nem é bom pensar nessas coisas mortas, muito mortas.\n" +
                        "Os séculos cheiram a mofo\n" +
                        "e a história é cheia de teias de aranha.\n" +
                        "(ANDRADE, Carlos Drummond de. Alguma poesia. São Paulo: Record, edição digital)";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / MPE-PB /Analista de Sistemas / 2023",
                textoQuestao10,
                "O elemento sublinhado no verso '[casas encardidas] onde há [velhas] nas janelas' exerce, no contexto em que se encontra, a mesma função sintática daquele sublinhado em:",
                "A água [que] corre",
                "[a cidadezinha] está calada, entrevada.",
                "Eu fico cá embaixo maginando [na ponte moderna]",
                "O Rio das Velhas lambe [as casas velhas]",
                "só [as torres] pontudas das igrejas / não brincam de esconder",
                "d",
                "Em 'há [velhas]', o verbo haver é impessoal e '[velhas]' é objeto direto. O outro objeto direto está em: D) '[O Rio das Velhas] lambe [as casas velhas]'."
        ));

        // =================================================================================
        // QUESTÃO 11 (FCC/TRT 18/2023) - Frase única
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC/TRT 18/2023",
                "um poeta torna [aberto] para todos [o universo reflexivo de sua intimidade]",
                "Na frase acima,",
                "o termo [aberto] qualifica o objeto direto [universo reflexivo].",
                "[sua intimidade] refere-se ao termo [todos].",
                "[para todos] é um exemplo de vocativo.",
                "ocorre uma indeterminação do sujeito em um [poeta].",
                "o verbo [tornar] está conjugado na voz passiva.",
                "a",
                "O termo '[aberto]' é predicativo do objeto, qualifica o objeto direto '[universo reflexivo]'."
        ));

        // =================================================================================
        // QUESTÃO 12 (FCC / PREF. RECIFE / 2022)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / PREF. RECIFE / 2022",
                "[a fregueses mais antigos] oferece, antes do menu, o jornal do dia 'facilitado'",
                "O termo sublinhado na frase acima exerce a mesma função sintática do termo sublinhado em:",
                "[O garçom] estendeu-lhe o menu e esperou",
                "seu Adelino veio sentar-se [ao lado da antiga freguesa]",
                "Vez por outra, indaga [se a comida está boa]",
                "[Uma noite dessas], o movimento era pequeno",
                "seu Adelino faculta [ao cliente] dar palpites ao cozinheiro",
                "e",
                "No enunciado, o termo sublinhado é complemento verbal, um objeto indireto de 'oferece'. O mesmo ocorre em 'seu Adelino faculta [ao cliente] dar palpites ao cozinheiro'."
        ));

        // =================================================================================
        // QUESTÃO 13 (FCC / PGE-AM / 2022)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / PGE-AM / 2022",
                "Aqui mora [uma devedora inadimplente].",
                "O termo sublinhado exerce a mesma função sintática do termo sublinhado em:",
                "Ela agora estava [irritada]:",
                "Chovia mais forte, [agora].",
                "[Você] é uma devedora inadimplente.",
                "[Neste] momento começou a chuviscar.",
                "− Posso lhe dar [um guarda-chuva]...",
                "c",
                "Quem mora? '[Uma devedora inadimplente]' mora (sujeito). O mesmo ocorre em '[Você] é uma devedora inadimplente'."
        ));

        // =================================================================================
        // QUESTÃO 14 (QUESTÃO INÉDITA / ESTRATÉGIA CONCURSOS / 2021)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "QUESTÃO INÉDITA / ESTRATÉGIA CONCURSOS / 2021",
                "Pesquisa da Universidade Federal do Rio Grande do Norte (UFRN) prevê [mudanças]...",
                "No contexto, o verbo da frase acima possui o mesmo tipo de complemento do que se encontra em:",
                "quantidade de peixes que se alimentam de algas na região tropical",
                "em algumas regiões [haverá deslocamento geográfico]",
                "é preciso pensar em alternativas para isso",
                "se esses ambientes mudarão",
                "Os resultados são desanimadores",
                "b",
                "O verbo em questão (prever) é transitivo direto, portanto pede como complemento um objeto direto. O verbo 'haver' possui como complemento um objeto direto ('[deslocamento geográfico]')."
        ));

        // =================================================================================
        // QUESTÃO 15 (FCC / ALAP / AUXILIAR LEGISLATIVO / 2020)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / ALAP / AUXILIAR LEGISLATIVO / 2020",
                "E há [o capitalismo de 'stakeholders' (partes interessadas)], que posiciona...",
                "O segmento sublinhado acima exerce a mesma função sintática daquele sublinhado em:",
                "está sendo lançado [um novo 'Manifesto de Davos'].",
                "Os líderes empresariais têm neste momento [uma grande oportunidade].",
                "não existe [outra alternativa].",
                "a adesão ao [atual sistema econômico] representa uma traição às futuras gerações.",
                "[as empresas] devem mostrar tolerância zero à corrupção.",
                "b",
                "O termo sublinhado é objeto direto de 'haver'. Na letra B, o termo '[uma grande oportunidade]' é objeto direto de 'tem'."
        ));

        // =================================================================================
        // QUESTÃO 16 (FCC / ALAP / ASS. LEGISLATIVO / 2020)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / ALAP / ASS. LEGISLATIVO / 2020",
                "O desempenho dos chips de computador dobra, sem que aumentem [os custos de fabricação].",
                "O segmento sublinhado acima exerce a mesma função sintática daquele sublinhado em:",
                "Algum funcionário da NASA, também envolvido com [o projeto]",
                "Vale lembrar que o computador que usamos hoje também começou com [um passo singelo]",
                "[A revelação] foi resultado de uma distração.",
                "O arquivo, já programado para ser divulgado oficialmente, permaneceu [poucos segundos] no ar",
                "O avanço ainda se restringe a [âmbitos estritamente técnicos]",
                "c",
                "O que aumenta? '[Os custos de fabricação]' aumentam (sujeito). O outro sujeito está na letra C: o que foi resultado de uma distração? '[A revelação]'."
        ));

        // =================================================================================
        // QUESTÃO 17 (FCC / SEFAZ-SC / Auditor Fiscal da Receita Estadual / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / SEFAZ-SC / Auditor Fiscal da Receita Estadual / 2018",
                "Analise as alternativas abaixo.",
                "Os termos sublinhados exercem a mesma função sintática em:",
                "A bandeira [da educação compulsória e universal], financiada e pelo menos parcialmente provida [pelo Estado]",
                "Com isso, aumenta [o poder de ganho] dos indivíduos no mercado e [eles] aprendem",
                "[a pobreza] de uma geração se torna [o berço] da incompetência da geração seguinte",
                "[É a falta de capacitação] da comunidade para integrar-se de forma dinâmica à economia mundial que compromete [o esforço de crescimento]",
                "A incompetência econômica [do indivíduo] resulta [em privação material]",
                "b",
                "Na letra B, '[o poder de ganho]' e '[eles]' são sujeitos de 'aumenta' e 'aprendem', respectivamente."
        ));

        // =================================================================================
        // QUESTÃO 18 (FCC / Prefeitura de Macapá - AP/ Técnico em Enfermagem / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Prefeitura de Macapá - AP/ Técnico em Enfermagem / 2018",
                "[Jones Barsou], diretor do espetáculo, diz que esse olhar sobre a mulher é feito de forma brutal...",
                "O verbo e seu sujeito estão sublinhados em:",
                "[Jones Barsou], diretor do espetáculo, [diz] que esse olhar sobre a mulher é feito de forma brutal...",
                "Uma montagem solo amapaense [traz] à [reflexão] a figura da mulher contemporânea...",
                "A peça [tem] a assinatura da [Associação Artística Casa Circo]...",
                "[a mulher] é obrigada a impor uma política que [valide] o seu corpo e o seu discurso...",
                "Essa condição seria desnecessária se a vida de cada [pessoa fosse] restrita a ela...",
                "a",
                "Na letra A, '[Jones Barsou]' é o sujeito do verbo '[diz]'."
        ));

        // =================================================================================
        // QUESTÃO 19 (FCC / SEAD - AP / Assistente Administrativo / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / SEAD - AP / Assistente Administrativo / 2018",
                "Ela [essa projeção da vida] existiu sempre na memória das gentes, mas só a escrita [a] fixou",
                "O elemento sublinhado acima possui, no contexto, a mesma função sintática do que está também sublinhado em:",
                "Contar histórias é o [antecedente remoto] da literatura...",
                "...inspirava nos humanos [a mesma ficção]...",
                "... as vidas que não tinham nem nunca teriam [em sua miúda e sucinta realidade].",
                "... e os faziam viajar [pelo espaço]...",
                "A oralidade contribuiu de [maneira decisiva]...",
                "b",
                "A escrita fixou o quê? Fixou 'essa projeção da vida', então o '[a]' é objeto direto. O mesmo ocorre em: ...inspirava nos humanos [a mesma ficção]..."
        ));


        // =================================================================================
        // QUESTÃO 21 (FCC / TRT - 15ª Região (SP) / Analista Judiciário / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 15ª Região (SP) / Analista Judiciário / 2018",
                "Analise as alternativas abaixo.",
                "Os termos sublinhados têm a mesma função sintática em:",
                "A [criatividade] muitas vezes é atiçada pela colisão de ideias surgidas em [disciplinas] e culturas diferentes.",
                "O que um dia foi [um meio anônimo] transformou-se numa ferramenta dedicada a analisar [dados pessoais].",
                "A tarefa de examinar essa torrente cada vez mais ampla em busca das [partes realmente importantes], ou apenas relevantes, já demanda [dedicação integral].",
                "... os [filtros] de personalização servem como uma espécie de autopropaganda invisível, doutrinando-[nos] com as nossas próprias ideias...",
                "Na bolha dos filtros, há [menos espaço] para os encontros fortuitos que proporcionam [novas percepções]....",
                "e",
                "Na letra E, '[menos espaço]' e '[novas percepções]' são objetos diretos dos verbos 'haver' e 'proporcionam'."
        ));

        // =================================================================================
        // QUESTÃO 22 (FCC / Prefeitura de Macapá - AP / Administrador / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Prefeitura de Macapá - AP / Administrador / 2018",
                "como querem os militantes [mais entusiasmados]",
                "A expressão sublinhada no trecho acima tem função sintática equivalente à também sublinhada em:",
                "O critério é só [emotivo]...",
                "para gozar [da plenitude de direitos]...",
                "Tudo caminha para que os animais [de estimação] se integrem...",
                "um ex-marido reivindica o direito de visitação [à cadela]...",
                "estamos condenados a agir [com incoerência].",
                "c",
                "'[mais entusiasmados]' é um adjunto adnominal. Em 'animais [de estimação]', '[de estimação]' é locução adjetiva, outro adjunto adnominal."
        ));

        // =================================================================================
        // QUESTÃO 23 (FCC / TRT - 2ª REGIÃO (SP) / Analista Judiciário / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 2ª REGIÃO (SP) / Analista Judiciário / 2018",
                "Foi assim que me [fiz] escritor",
                "No segmento textual acima,",
                "o verbo [ir] está flexionado numa forma do pretérito.",
                "o sujeito de [fazer] está oculto.",
                "as duas formas verbais têm o mesmo sujeito.",
                "[escritor] é sujeito de uma forma verbal passiva.",
                "a expressão [assim que] tem sentido temporal.",
                "b",
                "O sujeito de '[fiz]' é oculto (EU)."
        ));

        // =================================================================================
        // QUESTÃO 24 (FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018",
                "Há [livros] que apenas terão isso dos seus autores",
                "O segmento destacado na frase acima exerce a mesma função sintática do segmento destacado em:",
                "eu conheço [de vista e de chapéu].",
                "vê se deixas [essa caverna do Engenho Novo].",
                "[A viagem] era curta.",
                "– São [muito bonitos].",
                "a casa é [a mesma da Renânia].",
                "b",
                "O verbo 'haver' impessoal tem como complemento um objeto direto ('[livros]'). O outro termo com essa função está em: 'deixas [essa caverna]' (objeto direto)."
        ));

        // =================================================================================
        // QUESTÃO 25 (FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018",
                "Para mim, é mais fácil escrever [um romance de 200 páginas]...",
                "O segmento sublinhado acima exerce a mesma função sintática do segmento sublinhado em:",
                "... o leitor, [que] não precisa de teoria, sabe exatamente...",
                "... acabo de ler [dois ótimos livros de contos]...",
                "O atávico país rural (...) explode [em todos os poros] da cidade moderna.",
                "... Como diz o narrador do conto 'Sempre assim', '[é tudo] uma engrenagem muito maior'.",
                "Essa é uma questão comercial...",
                "b",
                "'[Um romance de 200 páginas]' é objeto direto de 'escrever'. O mesmo ocorre em '[dois ótimos livros de contos]' para o verbo 'ler'."
        ));

        // =================================================================================
        // QUESTÃO 26 (FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Câmara Legislativa do Distrito Federal / Técnico Legislativo / 2018",
                "Hoje, graças à internet e a novas tecnologias, surgem [novos padrões de atenção].",
                "O elemento que, no contexto, possui a mesma função sintática do sublinhado acima encontra-se também sublinhado em:",
                "Hoje [esses cineastas] poderiam ser vistos [como a vanguarda] de uma forma.",
                "Com o drama televisivo granjeando [aplausos] tanto do público quanto da crítica.",
                "... em que ele declarou que o cinema estava [morto]...",
                "[Cineastas] sempre flertaram com a televisão.",
                "... em vez de apenas entreter e vender produtos [por meio de anúncios].",
                "d",
                "'[novos padrões de atenção]' é o sujeito de 'surgem'. O outro sujeito está em: '[Cineastas]' flertaram."
        ));

        // =================================================================================
        // QUESTÃO 27 (FCC / TRT 6ª REGIÃO / ANALISTA JUDICIÁRIO / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 6ª REGIÃO / ANALISTA JUDICIÁRIO / 2018",
                "Analise as alternativas abaixo.",
                "São exemplos de uma mesma função sintática os elementos sublinhados no segmento:",
                "Sua [vida] sobreviveu guardada nas mais de 15 mil [crônicas].",
                "Resolvi usar as crônicas como se fossem uma longa [entrevista] que Braga tivesse [me] concedido.",
                "Grande parte dos relatos do livro não tem a [pretensão] de ser uma reconstituição fiel dos [fatos].",
                "Toneladas de [acontecimentos] estão cimentadas pela [força] do lirismo.",
                "A [vida] não basta, é preciso dar sentido ao viver, ou [tudo] se evapora.",
                "e",
                "Na letra E, '[A vida]' e '[tudo]' são núcleos do sujeito de 'basta' e 'se evapora'."
        ));

        // =================================================================================
        // QUESTÃO 28 (FCC / TRT 6ª REGIÃO / TÉC. JUD. – ÁREA ADM. / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 6ª REGIÃO / TÉC. JUD. – ÁREA ADM. / 2018",
                "Analise as alternativas abaixo.",
                "No contexto, os elementos sublinhados que apresentam a mesma função sintática se encontram em:",
                "[o jornalismo televisivo] se faz pautar pela imprensa // os eleitores haveriam de aprender a exercer [a democracia]",
                "A chance de erro, sobretudo de imprecisões, é [grande] // sua capacidade de atingir mais leitores se multiplica [na internet]",
                "O jornalismo de verdade (...) é sempre elitista // os veículos (...) servem [como arena de ideias e soluções]",
                "O que nos remete à questão do início // [a prática jornalística] municia seus leitores de ferramentas",
                "conforme se torna visível [a perspectiva] de universalizar o ensino superior // [A imprensa], que vive de cobrir crises, sempre esteve em crise",
                "e",
                "Na letra E, '[a perspectiva]' e '[A imprensa]' são sujeitos de 'se torna' e 'esteve', respectivamente."
        ));

        // =================================================================================
        // QUESTÃO 29 (FCC / DPE-AM / CIÊNCIAS JURÍDICAS / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / DPE-AM / CIÊNCIAS JURÍDICAS / 2018",
                "Analise as alternativas abaixo.",
                "Ambos os elementos sublinhados constituem exemplos de uma mesma função sintática na frase:",
                "A mediação e a conciliação são [termos] por vezes empregados sem [qualquer] critério.",
                "O [autor] do texto considera eminentemente [retórica] a função da conciliação.",
                "É bizarra, por vezes, a [tentativa] de conciliar [posições] inteiramente antagônicas.",
                "O mediador parece estar sempre mais [apto] a compreender o que divide as [opiniões].",
                "Os conciliadores tendem a suprimir ou ocultar as [diferenças], ao examinarem [posições] opostas.",
                "e",
                "Na letra E, '[as diferenças]' e '[posições opostas]' são objetos diretos dos verbos 'suprimir/ocultar' e 'examinarem'."
        ));

        // =================================================================================
        // QUESTÃO 30 (FCC / ALESE / TÉCNICO LEGISLATIVO / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / ALESE / TÉCNICO LEGISLATIVO / 2018",
                "Vi [a propaganda] no mesmo dia em que a Câmara Brasileira do Livro e a Amazon anunciaram uma nova categoria do prêmio Jabuti...",
                "No contexto, possui a mesma função sintática que o elemento sublinhado acima o que está também sublinhado em:",
                "Ou seja, pela [via do meio], o novo prêmio atenderia ao mercado...",
                "Os prêmios literários são [asserções]...",
                "[exceção e subjetividade] não fazem parte do vocabulário...",
                "É claro que há [diferenças].",
                "Um [filme publicitário] traz um ator interpretando um boçal...",
                "d",
                "'[a propaganda]' é objeto direto de 'Vi'. O verbo 'haver' em 'há [diferenças]' também exige objeto direto."
        ));


        //PAREI AQUI
        // =================================================================================
        // QUESTÃO 31 (FCC / DPE-AM / ANALISTA DE BANCO DE DADOS / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / DPE-AM / ANALISTA DE BANCO DE DADOS / 2018",
                "Será que lhes faltam [características]",
                "O segmento que exerce a mesma função sintática do sublinhado acima está também sublinhado em:",
                "As ideias estão no ar.",
                "A mimese adiciona uma dimensão representativa à imitação.",
                "que as reorganize em algo pessoal.",
                "Há ecos, imitações, paráfrases de Rossini.",
                "[A criatividade] envolve não só anos de preparação e treinamento.",
                "e",
                "'[características]' é sujeito de 'faltam'. Em '[A criatividade] envolve...', '[A criatividade]' também é sujeito."
        ));

        // =================================================================================
        // QUESTÃO 32 (FCC / Prefeitura de Macapá - AP / Assistente Social / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / Prefeitura de Macapá - AP / Assistente Social / 2018",
                "Sempre existiram [madrugadores e notívagos]...",
                "O segmento sublinhado acima possui a mesma função sintática do que se encontra também sublinhado em:",
                "... [a sociedade] considera virtuosos os que madrugam...",
                "... o cronótipo individual é forçado a adaptar-se às normas sociais...",
                "Há evidências de que a falta de sincronismo entre o relógio interno e o despertador...",
                "O organismo procura organizar sua rotina de modo a dar conta de nossas ações.",
                "Entre esses mecanismos estão os que regulam as alternâncias de sono e vigília.",
                "a",
                "'[madrugadores e notívagos]' é sujeito de 'existiram'. '[a sociedade]' é sujeito de 'considera'."
        ));

        // =================================================================================
        // QUESTÃO 33 (FCC / TRT - 15ª Região (SP) / Técnico Judiciário / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 15ª Região (SP) / Técnico Judiciário / 2018",
                "As questões importantes, porém, cabe a mim determinar [as questões importantes]",
                "A expressão que apresenta função sintática idêntica à da sublinhada acima está também sublinhada no trecho:",
                "... se eu sou o mestre do meu destino...",
                "... os seres humanos não podem ser definidos pelas suas propriedades.",
                "... nós, seres humanos, podemos gerar...",
                "... podemos autocriar [nossas propriedades físicas].",
                "... essas palavras de Sartre venceriam.",
                "d",
                "'[As questões importantes]' é objeto direto de 'determinar'. Em 'autocriar [nossas propriedades físicas]', '[nossas propriedades físicas]' também é objeto direto."
        ));

        // =================================================================================
        // QUESTÃO 34 (FCC / DPE-RS / Defensor Público / 2018)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / DPE-RS / Defensor Público / 2018",
                "Analise as alternativas abaixo sobre estruturação sintática.",
                "Caso se queira minorar o destaque dado ao sujeito responsável por determinado ato, deve-se adotar a estruturação sintática exemplificada por:",
                "Estamos acostumados a rir do que é baixo ou vil, e atribuímos uma natureza solene às histórias elevadas.",
                "Em seus depoimentos, os indígenas queixavam-se pelo fato de os brancos considerarem-nos como objetos de museu.",
                "À chegada dos antropólogos, os índios escondiam o aparelho de televisão, rindo-se do olhar sisudo que os perscrutava.",
                "O riso, em nossa sociedade, muitas vezes corrobora a ordem moral estabelecida, sobretudo quando se volta contra o que é posto à margem.",
                "[As histórias] tinham sido contadas com riqueza de detalhes, de modo que [todos] foram transportados para dentro da ação.",
                "e",
                "A voz passiva (tinham sido contadas / foram transportados) é um recurso para tirar o foco do agente, omitindo o responsável pela ação."
        ));

        // =================================================================================
        // QUESTÃO 35 (FCC / TRT - 24ª REGIÃO (MS) / Analista Judiciário / 2017)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRT - 24ª REGIÃO (MS) / Analista Judiciário / 2017",
                "Parece ser um fato assentado [que um jornal expresse a 'realidade']",
                "Na frase, os termos sublinhados",
                "prendem-se ao mesmo verbo, do qual constituem adjuntos.",
                "são sujeitos de uma mesma forma verbal.",
                "integram duas orações distintas.",
                "exercem, respectivamente, a função de complemento nominal e a de complemento verbal.",
                "estão empregados como predicativos do sujeito.",
                "c",
                "'[Um fato assentado]' faz parte da oração principal. '[Que um jornal expresse a realidade]' é uma oração subordinada substantiva subjetiva."
        ));

        // =================================================================================
        // QUESTÃO 36 (FCC / TRF - 5ª REGIÃO / Técnico Judiciário / 2017)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRF - 5ª REGIÃO / Técnico Judiciário / 2017",
                "que [alguns] supõem substituir 'velharias'.",
                "No contexto, o termo sublinhado acima exerce a mesma função sintática que o sublinhado em:",
                "Mas o trabalho do poeta é muitas vezes invisível.",
                "permite automatizar grande parte das tarefas.",
                "T.S. Eliot, um dos grandes poetas do século XX, afirma que...",
                "não há tempo de trabalho normal para a feitura de um poema",
                "[O tempo livre] parece ter encolhido",
                "e",
                "O termo '[alguns]' é sujeito de 'supõem'; '[O tempo livre]' é sujeito de 'parece'."
        ));

        // =================================================================================
        // QUESTÃO 37 (FCC / CREMESP / Advogado / 2016)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / CREMESP / Advogado / 2016",
                "Quando [fizerem], no futuro, a leitura de nossa época, qual será a conclusão errada?",
                "Analisando-se a construção sintática da frase acima, é correto observar que",
                "a forma verbal '[fizerem]' tem o mesmo sujeito da forma verbal 'será'.",
                "está indeterminado o sujeito da forma verbal '[fizerem]'.",
                "a expressão 'Quando fizerem' tem o valor de uma condicional.",
                "'a leitura de nossa época' exerce a função de sujeito.",
                "'no futuro' é exemplo de uma oração intercalada.",
                "b",
                "O sujeito de '[fizerem]' é indeterminado, não sabemos quem fará a leitura."
        ));

        // =================================================================================
        // QUESTÃO 38 (FCC / TRF 3ª REGIÃO / 2016)
        // =================================================================================
        String textoQuestao38 =
                "Mas, apesar de terem ocorrido essas transformações que tornaram Santos num dos centros do comércio internacional, [o local] conserva uma beleza secreta; à medida que [o barco] penetra lentamente por entre as ilhas, [experimento] aqui o primeiro sobressalto dos trópicos. Estamos encerrados num canal verdejante. Quase podíamos, só com estender a mão, agarrar essas plantas que o Rio ainda mantinha à distância nas suas estufas empoleiradas lá no alto. Aqui se estabelece, num palco mais modesto, o contato com a paisagem.";

        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / TRF 3ª REGIÃO / 2016",
                textoQuestao38,
                "No primeiro período do segundo parágrafo, as duas orações que não se subordinam a nenhuma outra contêm os seguintes verbos:",
                "[conserva] − [experimento]",
                "terem ocorrido − conserva",
                "tornaram − penetra",
                "tornaram − experimento",
                "conserva − penetra",
                "a",
                "As orações independentes (coordenadas) são '[o local] conserva uma beleza secreta' e '[experimento] aqui o primeiro sobressalto dos trópicos'."
        ));

        // =================================================================================
        // QUESTÃO 39 (FCC / PGE-MT / Administrador / 2016)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / PGE-MT / Administrador / 2016",
                "Quem nos deu [o sentimento do justo e do injusto]?",
                "A função sintática do elemento sublinhado na frase acima corresponde à mesma do sublinhado em:",
                "Quando nos ensina [que dois e dois são quatro].",
                "Nada é aquilo que chamamos inato",
                "Deus nos faz nascer com órgãos.",
                "Foi Deus que nos deu um cérebro e um coração.",
                "não há árvore que contenha folhas e frutos ao sair da terra.",
                "a",
                "'[o sentimento]' é objeto direto. Em 'nos ensina [que dois e dois são quatro]', a oração '[que dois e dois são quatro]' também é objeto direto."
        ));

        // =================================================================================
        // QUESTÃO 40 (FCC / SEGEP-MA / Técnico da Receita Estadual / 2016)
        // =================================================================================
        questoesSintaxe.add(new QuestaoMultiplaEscolha(
                "FCC / SEGEP-MA / Técnico da Receita Estadual / 2016",
                "[A tragédia] vinha sendo anunciada...",
                "O segmento grifado exerce na frase acima a mesma função sintática que o segmento também grifado em:",
                "... devido à ganância humana...",
                "Hoje restam apenas [29 mil]...",
                "... havia a esperança última de que um habitat selvagem pudesse surtir algum efeito.",
                "... país que ainda sofre os efeitos de uma guerra civil iniciada em 1996...",
                "... o diretor da instituição descreveria a perda como 'terrível'...",
                "b",
                "'[A tragédia]' é sujeito de 'vinha', assim como '[29 mil]' é sujeito de 'restam'."
        ));
    }

    public List<QuestaoMultiplaEscolha> getQuestoesSintaxe() {
        return questoesSintaxe;
    }
}