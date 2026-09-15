package com.seuapp.mensageria.flashcard_questoes.flashcards.portugues_flashcard.sintaxe.coordencacao_subordinacao;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;


public class CoordenacaoSubordinacaoOracaoFlashcards {

    public static List<Flashcard> getFlashcards() {

        List<Flashcard> lista = new ArrayList<>();

        // ==================== SINTAXE - NOÇÕES INICIAIS ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SINTAXE_NOCOES_INICIAIS",
                "🧭 Noções Iniciais de Sintaxe",
                "📌 Conceitos:\n" +
                        "📎 SINTAXE: Estuda a organização da língua, a conexão entre as partes da frase.\n" +
                        "📎 MORFOLOGIA: Estuda a classe gramatical da palavra.\n" +
                        "📎 ORDEM DIRETA (SuVeCA): Sujeito + Verbo + Complemento (+ Adjuntos).\n" +
                        "💡 DICA: Ache o verbo, coloque na ordem direta e procure o sujeito."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FRASE_ORACAO_PERIODO",
                "🧭 Frase x Oração x Período",
                "📌 Distinção:\n" +
                        "✅ FRASE: Enunciado de sentido completo (com ou sem verbo).\n" +
                        "✅ ORAÇÃO: Frase verbal (possui verbo).\n" +
                        "✅ PERÍODO: Frase vista como um todo (uma ou mais orações).\n" +
                        "📎 Período Simples: 1 oração (absoluta).\n" +
                        "📎 Período Composto: + de 1 oração."
        ));

        // ==================== FUNÇÕES SINTÁTICAS ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUJEITO",
                "🧭 Sujeito",
                "📌 Definição:\n" +
                        "📎 Termo sobre o qual se declara algo.\n" +
                        "📎 Concorda com o verbo em número e pessoa.\n" +
                        "📎 Núcleo: substantivo, pronome ou palavra substantivada.\n" +
                        "📎 Tipos: Simples (1 núcleo), Composto (+ de 1 núcleo), Oculto/Elíptico/Desinencial (identificável pelo contexto), Indeterminado (não se sabe quem)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_SUJEITO_INDETERMINADO",
                "🧭 Sujeito Indeterminado",
                "📌 Formas de Indeterminar:\n" +
                        "📎 3ª pessoa do plural sem agente expresso: 'Dizem que ela teve um caso'.\n" +
                        "📎 Verbo Intransitivo/Transitivo Indireto/De Ligação + SE (PIS): 'Vive-se bem aqui', 'Trata-se de uma exceção', 'Precisa-se de médicos'.\n" +
                        "📎 Infinitivo impessoal: 'Praticar esportes é bom' (agente genérico)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACAO_SEM_SUJEITO",
                "🧭 Oração sem Sujeito",
                "📌 Casos:\n" +
                        "📎 Fenômenos da natureza: 'Choveu ontem', 'Anoiteceu'.\n" +
                        "📎 Verbos ser/estar/fazer/haver/parecer impessoais (tempo/estado): 'Faz 2 anos', 'Está quente', 'Há pessoas ruins'.\n" +
                        "📎 Verbo HAVER impessoal: sempre no singular, contamina auxiliares. Ex: 'Deve haver mil pessoas'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_OBJETO_DIRETO",
                "🧭 Objeto Direto (OD)",
                "📌 Definição:\n" +
                        "📎 Complemento verbal sem preposição (VTD).\n" +
                        "📎 Pode ter forma de: nome, pronome, oração (OD oracional) ou pleonástico (repetido).\n" +
                        "📎 OD Preposicionado: quando a preposição não é exigida pelo verbo (ênfase, clareza, pronomes tônicos, 'quem', nomes próprios). Ex: 'Amar a Deus'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_OBJETO_INDIRETO",
                "🧭 Objeto Indireto (OI)",
                "📌 Definição:\n" +
                        "📎 Complemento verbal com preposição (VTI).\n" +
                        "📎 Preposições comuns: a, de, em, para, com.\n" +
                        "📎 Pode ter forma de: nome, pronome, oração (OI oracional) ou pleonástico. Ex: 'Gosto de comida', 'Duvidava de que ele passasse', 'Aos amigos, dou-lhes tudo'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COMPLEMENTO_NOMINAL",
                "🧭 Complemento Nominal (CN)",
                "📌 Definição:\n" +
                        "📎 Complemento de um NOME (substantivo abstrato, adjetivo ou advérbio) com preposição.\n" +
                        "📎 Sentido PACIENTE (alvo da ação).\n" +
                        "📎 Pode ter forma de oração: 'O cão sentia falta de que brincassem com ele'.\n" +
                        "⚠️ Distinção do AA: se liga a adjetivo/advérbio, ou tem sentido passivo, é CN."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJUNTO_ADNOMINAL",
                "🧭 Adjunto Adnominal (AA)",
                "📌 Definição:\n" +
                        "📎 Termo que acompanha substantivos (concretos ou abstratos) para atribuir características.\n" +
                        "📎 Sentido AGENTE, de POSSE ou pertinência.\n" +
                        "📎 Não é exigido pelo nome (pode ser retirado).\n" +
                        "📎 Pode ser substituído por adjetivo equivalente.\n" +
                        "📎 Ex: 'Os três carros populares do meu pai'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_AA_VS_CN",
                "🧭 Adjunto Adnominal x Complemento Nominal",
                "📌 Diferenças:\n" +
                        "✅ CN: Liga-se a substantivo abstrato, adjetivo ou advérbio. Sempre preposicionado. Sentido paciente.\n" +
                        "✅ AA: Liga-se a substantivo (concreto ou abstrato). Sentido agente/posse. Pode não ter preposição.\n" +
                        "⚠️ Só há dúvida em: substantivo abstrato + termo preposicionado 'de'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PREDICATIVO_SUJEITO",
                "🧭 Predicativo do Sujeito",
                "📌 Definição:\n" +
                        "📎 Qualificação/estado atribuído ao sujeito.\n" +
                        "📎 Normalmente via verbo de ligação (ser, estar, permanecer, ficar, continuar, tornar-se, andar, virar).\n" +
                        "📎 Pode acompanhar verbos de ação (predicado verbo-nominal): 'A professora saiu atrasada'.\n" +
                        "📎 Ex: 'Ela continuava pomposa', 'O mundo é um moinho'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PREDICATIVO_OBJETO",
                "🧭 Predicativo do Objeto",
                "📌 Definição:\n" +
                        "📎 Qualificação/estado atribuído ao objeto.\n" +
                        "📎 Verbos transobjetivos (julgar, eleger, achar, tornar, chamar, nomear).\n" +
                        "📎 Ex: 'Julgaram o réu culpado', 'O povo elegeu-o senador'.\n" +
                        "📎 Também pode ocorrer com objeto indireto: 'Chamei ao político de ladrão'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_TIPOS_PREDICADO",
                "🧭 Tipos de Predicado",
                "📌 Classificação:\n" +
                        "✅ VERBAL: Núcleo é verbo de ação (transitivo ou intransitivo). Ex: 'João comprou um rifle'.\n" +
                        "✅ NOMINAL: Núcleo é predicativo do sujeito + verbo de ligação. Ex: 'João parece melancólico'.\n" +
                        "✅ VERBO-NOMINAL: Verbo de ação + predicativo (do sujeito ou do objeto). Ex: 'João saiu triste', 'João achou a menina melancólica'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_APOSTO",
                "🧭 Aposto",
                "📌 Definição:\n" +
                        "📎 Palavra/expressão que explica, esclarece, desenvolve ou resume outro termo.\n" +
                        "📎 Relação de equivalência semântica.\n" +
                        "✅ EXPLICATIVO: entre vírgulas, parênteses ou travessões. Ex: 'Jorge, o malandro, ainda é jovem'.\n" +
                        "✅ ESPECIFICATIVO: sem pontuação, individualiza. Ex: 'O artilheiro Messi', 'A cidade do Rio de Janeiro'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ADJUNTO_ADVERBIAL",
                "🧭 Adjunto Adverbial",
                "📌 Definição:\n" +
                        "📎 Termo que modifica o verbo, indicando circunstância (tempo, modo, causa, meio, lugar, instrumento, motivo, oposição).\n" +
                        "📎 Pode modificar adjetivo, advérbio ou oração.\n" +
                        "📎 Pode ter forma de oração (oração adverbial).\n" +
                        "📎 Ex: 'Ele morreu por amor', 'Ela é muito bonita'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_AGENTE_PASSIVA",
                "🧭 Agente da Passiva",
                "📌 Definição:\n" +
                        "📎 Agente do verbo numa sentença na voz passiva.\n" +
                        "📎 Introduzido por 'por' ou 'de'.\n" +
                        "📎 Na conversão da ativa para passiva: sujeito ativo vira agente da passiva; OD vira sujeito paciente.\n" +
                        "📎 Ex: 'Um carro foi comprado por mim'.\n" +
                        "📎 Pode ter forma de oração: 'As vagas foram conquistadas por quem se preparou'."
        ));

        // ==================== VOZES VERBAIS ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_VOZ_PASSIVA",
                "🧭 Voz Passiva",
                "📌 Tipos:\n" +
                        "✅ ANALÍTICA: Verbo SER + PARTICÍPIO. Ex: 'Casas são vendidas'.\n" +
                        "✅ SINTÉTICA: VTD ou VTDI + SE (pronome apassivador). Ex: 'Vendem-se casas'.\n" +
                        "📎 Não há voz passiva com VTI, VI, VL ou verbos com sentido passivo (levar, ganhar, ter, haver).\n" +
                        "⚠️ CUIDADO: Na voz passiva, o OD vira SUJEITO PACIENTE."
        ));

        // ==================== PERÍODO COMPOSTO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_COORDENACAO_SUBORDINACAO",
                "🧭 Coordenação e Subordinação",
                "📌 Distinção:\n" +
                        "✅ COORDENAÇÃO: Orações independentes sintaticamente. Ex: 'Acordei e saí'.\n" +
                        "✅ SUBORDINAÇÃO: Oração dependente sintaticamente da principal. Ex: 'Cheguei quando ele saiu'.\n" +
                        "✅ PERÍODO MISTO: Contém coordenação e subordinação."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACOES_COORDENADAS",
                "🧭 Orações Coordenadas",
                "📌 Classificação (Sindéticas):\n" +
                        "✅ ADITIVAS: e, nem, não só...mas também. Ex: 'Comprei frutas e legumes'.\n" +
                        "✅ ADVERSATIVAS: mas, porém, contudo, todavia, entretanto, no entanto. Ex: 'Estudei pouco, mas passei'.\n" +
                        "✅ ALTERNATIVAS: ou, ou...ou, ora...ora, quer...quer, seja...seja. Ex: 'Ou você estuda ou desiste'.\n" +
                        "✅ CONCLUSIVAS: logo, pois (deslocado), portanto, por conseguinte. Ex: 'Estudei pouco, por conseguinte não passei'.\n" +
                        "✅ EXPLICATIVAS: que, porque, pois (antes do verbo), porquanto. Ex: 'Estude, que o edital vai sair'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACOES_SUBORDINADAS_SUBSTANTIVAS",
                "🧭 Orações Subordinadas Substantivas",
                "📌 Classificação:\n" +
                        "✅ SUBJETIVA: Função de sujeito. Ex: 'É importante que se estude'.\n" +
                        "✅ OBJETIVA DIRETA: Função de OD. Ex: 'Disse que ele deveria procurar ajuda'.\n" +
                        "✅ OBJETIVA INDIRETA: Função de OI. Ex: 'Desconfio de que ela conversa com a tartaruga'.\n" +
                        "✅ COMPLETIVA NOMINAL: Função de CN. Ex: 'Tenho desconfiança de que ela conversa'.\n" +
                        "✅ APOSITIVA: Função de aposto. Ex: 'Só nos resta uma opção: estudarmos muito'.\n" +
                        "✅ PREDICATIVA: Função de predicativo. Ex: 'A intenção é que eu gabarite a prova'.\n" +
                        "✅ AGENTE DA PASSIVA: Ex: 'As vagas foram conquistadas por quem se preparou'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACOES_SUBORDINADAS_ADJETIVAS",
                "🧭 Orações Subordinadas Adjetivas",
                "📌 Classificação:\n" +
                        "✅ RESTRITIVAS: Individualizam o antecedente, sem vírgulas. Ex: 'Meu aluno que mora no interior estuda on-line'.\n" +
                        "✅ EXPLICATIVAS: Acrescentam informação, com vírgulas. Ex: 'Meu aluno, que mora no interior, estuda on-line'.\n" +
                        "📎 Introduzidas por pronome relativo (que, qual, quem, cujo, onde).\n" +
                        "📎 Função: adjunto adnominal do antecedente."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACOES_SUBORDINADAS_ADVERBIAIS",
                "🧭 Orações Subordinadas Adverbiais",
                "📌 Classificação:\n" +
                        "✅ CAUSAIS: porque, visto que, já que, como. Ex: 'Visto que acabara a luz, acendi uma vela'.\n" +
                        "✅ CONSECUTIVAS: de sorte que, de modo que, que (após tal, tão, tanto). Ex: 'Comi tanto que fiquei 16h sem fome'.\n" +
                        "✅ CONDICIONAIS: se, caso, contanto que, desde que. Ex: 'Se quiser passar, estude'.\n" +
                        "✅ TEMPORAIS: quando, enquanto, antes que, depois que, logo que, assim que. Ex: 'Mal ele saiu, o ônibus passou'.\n" +
                        "✅ CONCESSIVAS: embora, ainda que, posto que, conquanto, por mais que. Ex: 'Embora fosse mulato, fundou a ABL'.\n" +
                        "✅ FINAIS: para que, a fim de que, porque (=para que). Ex: 'Dou exemplos para que você entenda'.\n" +
                        "✅ PROPORCIONAIS: à medida que, à proporção que, quanto mais...mais. Ex: 'Quanto mais estudo, mais sorte tenho'.\n" +
                        "✅ COMPARATIVAS: como, assim como, tal qual, mais que, menos que, tanto quanto. Ex: 'Corria como um touro'.\n" +
                        "✅ CONFORMATIVAS: como, conforme, consoante, segundo. Ex: 'Tudo correu conforme planejamos'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_ORACOES_REDUZIDAS_DESENVOLVIDAS",
                "🧭 Orações Reduzidas x Desenvolvidas",
                "📌 Distinção:\n" +
                        "✅ DESENVOLVIDAS: Conjunção + verbo conjugado.\n" +
                        "✅ REDUZIDAS: Sem conjunção + verbo em forma nominal (infinitivo, gerúndio, particípio).\n" +
                        "📎 Para desenvolver: inserir conjunção e conjugar o verbo.\n" +
                        "📎 Ex: 'Ao me ver, não me cumprimente!' (reduzida) → 'Quando me vir, não me cumprimente!' (desenvolvida)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_REDUZIDAS_INFINITIVO",
                "🧭 Orações Reduzidas de Infinitivo",
                "📌 Estruturas Clássicas:\n" +
                        "✅ AO + infinitivo: TEMPO. Ex: 'Ao chegar, avise'.\n" +
                        "✅ A + infinitivo: CONDIÇÃO. Ex: 'A persistirem os sintomas, consulte um médico'.\n" +
                        "✅ POR + infinitivo: CAUSA. Ex: 'Por ser muito capacitado, ganhava bem'.\n" +
                        "✅ SEM + infinitivo: CONCESSÃO. Ex: 'Sem se preparar, passou'.\n" +
                        "✅ SEM + infinitivo: CONDIÇÃO NEGATIVA. Ex: 'Sem se preparar, não passará'."
        ));

        // ==================== PARALELISMO ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PARALELISMO",
                "🧭 Paralelismo",
                "📌 Definição:\n" +
                        "📎 Uso de estruturas paralelas, simétricas, com estrutura gramatical idêntica ou semelhante.\n" +
                        "✅ Ex correto: 'Tenho um primo inteligente e rico' (adjetivo + adjetivo).\n" +
                        "❌ Ex errado: 'Tenho um primo inteligente e que tem muito dinheiro' (adjetivo + oração).\n" +
                        "📎 PARALELISMO SEMÂNTICO: Coerência de sentido entre os termos coordenados."
        ));

        // ==================== FUNÇÕES DA PALAVRA "QUE" ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_QUE",
                "🧭 Funções da Palavra 'QUE'",
                "📌 Classificações:\n" +
                        "✅ PRONOME RELATIVO: 'O aluno que estuda passa'.\n" +
                        "✅ CONJUNÇÃO INTEGRANTE: 'Quero que você se exploda!' (= Quero ISTO).\n" +
                        "✅ CONJUNÇÃO EXPLICATIVA: 'Estude, que o edital já vai sair'.\n" +
                        "✅ CONJUNÇÃO ADITIVA: 'Você fala que fala hein!'.\n" +
                        "✅ CONJUNÇÃO CONSECUTIVA: 'Bebi tanto que passei mal'.\n" +
                        "✅ CONJUNÇÃO COMPARATIVA: 'Estudo mais (do) que você'.\n" +
                        "✅ CONJUNÇÃO FINAL: 'Estudo para que meu filho tenha uma vida melhor'.\n" +
                        "✅ CONJUNÇÃO TEMPORAL: 'Agora que eu ia viajar, chove'.\n" +
                        "✅ PREPOSIÇÃO ACIDENTAL: 'Tenho que passar'.\n" +
                        "✅ PRONOME INDEFINIDO: 'Sei que intenções você tem'.\n" +
                        "✅ PRONOME INTERROGATIVO: '(O) Que houve aqui?'.\n" +
                        "✅ SUBSTANTIVO: 'Essa mulher tem um quê de cigana'.\n" +
                        "✅ ADVÉRBIO DE INTENSIDADE: 'Que chato!'.\n" +
                        "✅ PARTÍCULA EXPLETIVA: 'Você é que manda'."
        ));

        // ==================== FUNÇÕES DA PALAVRA "SE" ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_SE",
                "🧭 Funções da Palavra 'SE'",
                "📌 Classificações:\n" +
                        "✅ PRONOME APASSIVADOR: VTD + SE. Ex: 'Vendem-se casas'.\n" +
                        "✅ PARTÍCULA DE INDETERMINAÇÃO (PIS): VTI/VI/VL + SE. Ex: 'Vive-se bem aqui', 'Trata-se de uma exceção'.\n" +
                        "✅ CONJUNÇÃO INTEGRANTE: 'Não quero saber se ele nasceu pobre'.\n" +
                        "✅ CONJUNÇÃO CONDICIONAL: 'Se eu estudar sempre, serei aprovado'.\n" +
                        "✅ CONJUNÇÃO CAUSAL: 'Se você gosta dela, por que não a procura?'.\n" +
                        "✅ PRONOME REFLEXIVO: 'Minha tia se barbeia'.\n" +
                        "✅ PRONOME RECÍPROCO: 'Irmão e irmã se abraçaram'.\n" +
                        "✅ PARTE INTEGRANTE DO VERBO (PIV): 'Candidatou-se à presidência'.\n" +
                        "✅ PARTÍCULA EXPLETIVA: 'Vão-se minhas últimas economias'."
        ));

        // ==================== FUNÇÕES DA PALAVRA "COMO" ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_PALAVRA_COMO",
                "🧭 Funções da Palavra 'COMO'",
                "📌 Classificações:\n" +
                        "✅ INTERJEIÇÃO: 'Como! Não acredito!'.\n" +
                        "✅ VERBO: 'Eu não como carne'.\n" +
                        "✅ CONJUNÇÃO ADITIVA: 'Tanto corro de dia, como nado à noite'.\n" +
                        "✅ CONJUNÇÃO COMPARATIVA: 'Ele canta como um anjo'.\n" +
                        "✅ CONJUNÇÃO CONFORMATIVA: 'Como todos sabem, não existe milagre'.\n" +
                        "✅ CONJUNÇÃO CAUSAL: 'Como choveu, a rua está molhada'.\n" +
                        "✅ PRONOME RELATIVO: 'A maneira como você fala magoa'.\n" +
                        "✅ PREPOSIÇÃO ACIDENTAL: 'Ele joga como atacante'.\n" +
                        "✅ ADVÉRBIO INTERROGATIVO: 'Como lidar com as críticas?'.\n" +
                        "✅ ADVÉRBIO DE INTENSIDADE: 'Como é grande o meu amor'."
        ));

        // ==================== QUESTÕES COMENTADAS - FGV ====================

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_ORACAO_REDUZIDA",
                "🧭 FGV - Oração Reduzida para Desenvolvida",
                "📌 Como resolver:\n" +
                        "📎 Oração reduzida: sem conjunção, verbo em forma nominal (infinitivo, gerúndio, particípio).\n" +
                        "📎 Oração desenvolvida: com conjunção e verbo conjugado.\n" +
                        "📎 Ex: 'É preciso fazer uma reflexão' → 'É preciso que se faça uma reflexão'.\n" +
                        "⚠️ Manter o tempo verbal original."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_VOZ_PASSIVA_PRONOMINAL",
                "🧭 FGV - Voz Passiva Pronominal",
                "📌 Como identificar:\n" +
                        "📎 Verbo transitivo direto + SE.\n" +
                        "📎 É possível converter para voz passiva analítica.\n" +
                        "📎 Ex: 'Ninguém se prejudicou' = 'Ninguém foi prejudicado'.\n" +
                        "❌ NÃO é voz passiva: verbos intransitivos (ex: 'O sol nunca se põe')."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_PARALELISMO",
                "🧭 FGV - Paralelismo Sintático",
                "📌 Como resolver:\n" +
                        "📎 Estruturas coordenadas devem ter a mesma forma.\n" +
                        "✅ Ex correto: 'Brastemp economiza mais. Brastemp demora menos. Brastemp assa melhor'.\n" +
                        "❌ Ex errado: 'Não só trabalha na fábrica como também é enfermeira'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_ORACAO_CONDICIONAL",
                "🧭 FGV - Oração Condicional",
                "📌 Como identificar:\n" +
                        "📎 Conjunções condicionais: se, caso, uma vez que (com subjuntivo), desde que, contanto que, salvo se, a não ser que.\n" +
                        "📎 Ex: 'Caso o diabo pense que pode...'.\n" +
                        "❌ NÃO é condicional: 'quando' (temporal)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_ORACAO_ADJETIVA_ADJETIVO",
                "🧭 FGV - Oração Adjetiva para Adjetivo",
                "📌 Como resolver:\n" +
                        "📎 Substituir a oração adjetiva por um adjetivo equivalente.\n" +
                        "📎 Ex: 'Uma ideia que desperta entusiasmo' = 'Uma ideia motivadora'.\n" +
                        "⚠️ Atenção ao sentido: 'encarecedor' ≠ 'que não possuem'."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_PREPOSICAO_NOCIONAL",
                "🧭 FGV - Preposição Nocional",
                "📌 Como identificar:\n" +
                        "📎 Preposição GRAMATICAL: exigida pela regência (introduz complemento).\n" +
                        "📎 Preposição NOCIONAL: não exigida, introduz adjunto (tem valor semântico).\n" +
                        "📎 Ex nocional: 'governou Cuba a ferro e fogo' (adjunto adverbial de modo).\n" +
                        "📎 Ex gramatical: 'obrigado a ter vergonha' (complemento nominal)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_ORDEM_DIRETA",
                "🧭 FGV - Ordem Direta",
                "📌 Como identificar:\n" +
                        "📎 Ordem direta: Sujeito + Verbo + Complemento + Adjunto.\n" +
                        "📎 Ex: 'A família teria comprado um novo apartamento no mesmo bairro, neste final de semana'.\n" +
                        "📎 Inversões: adjunto antecipado, sujeito posposto, complemento antecipado."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_TERMO_ELIPTICO",
                "🧭 FGV - Termo Elíptico",
                "📌 Como identificar:\n" +
                        "📎 Termo omitido, subentendido pelo contexto ou pela desinência verbal.\n" +
                        "📎 Ex: '(Você) Trabalhou a noite inteira?'.\n" +
                        "📎 É muito cobrado o sujeito elíptico/desinencial/oculto."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_COMPLEMENTO_TERMO_ANTERIOR",
                "🧭 FGV - Complemento de Termo Anterior",
                "📌 Como identificar:\n" +
                        "📎 Termo que complementa um nome (substantivo, adjetivo ou advérbio) com preposição.\n" +
                        "📎 Ex: 'referência às fontes' (complemento nominal de 'referência').\n" +
                        "📎 Diferenciar de adjunto adnominal (sentido agente/posse, não exigido)."
        ));

        lista.add(new Flashcard(
                "📘 Língua Portuguesa",
                "PORT_FGV_SUJEITO_INDETERMINADO",
                "🧭 FGV - Sujeito Indeterminado",
                "📌 Como identificar:\n" +
                        "📎 Verbo na 3ª pessoa do plural sem agente expresso.\n" +
                        "📎 VTI/VI/VL + SE (partícula de indeterminação).\n" +
                        "📎 Ex: 'Roubaram o giz' (quem roubou? Não se sabe).\n" +
                        "📎 Diferenciar de sujeito oculto (identificável pelo contexto)."
        ));

        return lista;
    }
}