package com.seuapp.mensageria.flashcard_questoes.questoes_multipla.direito_questoes.constitucional;

import com.seuapp.mensageria.model.QuestaoMultiplaEscolha;

import java.util.ArrayList;
import java.util.List;

public class AplicabilidadeHierarquiaNormaQuestoesMultipla {

    private List<QuestaoMultiplaEscolha> questoes;

    public AplicabilidadeHierarquiaNormaQuestoesMultipla() {
        questoes = new ArrayList<>();
        inicializarQuestoes();
    }

    private void inicializarQuestoes() {

        // =========================
        // Questão 1 (ESTRATÉGIA/INÉDITA 2022) - COM TEXTO
        // =========================
        String textoQ1 = "Os estudantes do 5º período do Curso de Direito travaram discussão sobre a força normativa das normas programáticas.";
        questoes.add(new QuestaoMultiplaEscolha(
                "ESTRATÉGIA/INÉDITA 2022",
                textoQ1,
                "Concluindo corretamente ao fim, essas normas:",
                "somente podem ser utilizadas, no controle de constitucionalidade, quando inexistir norma de eficácia plena.",
                "somente adquirem eficácia após sua integração pela legislação infraconstitucional.",
                "somente podem ser utilizadas, no controle de constitucionalidade, quando inexistir norma de eficácia plena ou contida.",
                "não terão força normativa e não produzem efeito na realidade.",
                "possuem eficácia, mas de modo limitado, devendo direcionar a interpretação dos demais comandos da ordem jurídica, além de revogar as normas infraconstitucionais preexistentes que se mostrem incompatíveis com elas.",
                "e",
                "As normas programáticas possuem eficácia limitada, devendo direcionar a interpretação dos demais comandos da ordem jurídica, além de revogar as normas infraconstitucionais preexistentes que se mostrem incompatíveis com elas."
        ));

        // =========================
        // Questão 2 (ESTRATÉGIA/INÉDITA 2022) - COM TEXTO (art. 5º, XIII)
        // =========================
        String textoQ2 = "Nos termos do Art. 5º, XIII, da Constituição da República de 1988, \"é livre o exercício de qualquer trabalho, ofício ou profissão, atendidas as qualificações profissionais que a lei estabelecer\".";
        questoes.add(new QuestaoMultiplaEscolha(
                "ESTRATÉGIA/INÉDITA 2022",
                textoQ2,
                "Esse preceito constitucional dá origem a uma norma de eficácia:",
                "plena e aplicabilidade diferida",
                "limitada e princípio institutivo",
                "plena e aplicabilidade imediata",
                "contida e aplicabilidade imediata",
                "limitada e princípio programático",
                "d",
                "A liberdade profissional é norma de eficácia contida, dotada de aplicabilidade direta, imediata, mas não integral (o legislador pode restringir a sua eficácia)."
        ));

        // =========================
        // Questão 3 (ESTRATÉGIA/INÉDITA 2022) - COM TEXTO
        // =========================
        String textoQ3 = "A Constituição Federal de 1988 dispõe que no seio dos direitos individuais e coletivos que \"ninguém será preso senão em flagrante delito ou por ordem escrita e fundamentada de autoridade judiciária competente, salvo nos casos de transgressão militar ou crime propriamente militar, definidos em lei\".";
        questoes.add(new QuestaoMultiplaEscolha(
                "ESTRATÉGIA/INÉDITA 2022",
                textoQ3,
                "Em razão do critério de aplicabilidade e eficácia das normas constitucionais, é possível afirmar que estamos diante de uma norma:",
                "programática",
                "de eficácia plena e aplicabilidade imediata",
                "de eficácia contida e aplicabilidade imediata",
                "preceptiva",
                "de eficácia limitada e aplicabilidade mediata",
                "c",
                "A norma de eficácia contida produz todos os seus efeitos, mas pode ser restringida por lei infraconstitucional posterior."
        ));

        // =========================
        // Questão 4 (ESTRATÉGIA/INÉDITA 2022) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "ESTRATÉGIA/INÉDITA 2022",
                "O Supremo Tribunal Federal possui o seguinte posicionamento: o atendimento em creche e acesso às unidades de pré-escola à criança menor de cinco anos de idade não podem basear-se em juízo de simples conveniência ou mera oportunidade.",
                "Pois o sistema de ensino municipal é regido constitucionalmente por normas de eficácia:",
                "contida, possuindo aplicabilidade indireta, mediata e reduzida.",
                "plena, possuindo aplicabilidade direta, imediata e integral.",
                "limitada, possuindo aplicabilidade indireta, mediata e reduzida e estabelecem apenas diretrizes.",
                "contida, possuindo aplicabilidade direta, imediata e integral.",
                "limitada, possuindo aplicabilidade direta, imediata e reduzida e estabelecem apenas diretrizes.",
                "b",
                "As normas constitucionais de eficácia plena têm aplicabilidade direta, imediata e integral, independente de norma integrativa infraconstitucional."
        ));

        // =========================
        // Questão 5 (ESTRATÉGIA/INÉDITA 2022) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "ESTRATÉGIA/INÉDITA 2022",
                "Em uma palestra de Direito Constitucional, o Professor João explicou que inúmeros juristas nacionais teorizaram a respeito da efetividade das normas constitucionais, sua validade, aplicabilidade e vigência.",
                "De acordo com a classificação de José Afonso da Silva, entende-se que as normas constitucionais de eficácia contida possuem:",
                "aplicabilidade direta, mediata e efeitos integrais.",
                "aplicabilidade indireta, efeitos imediatos e possivelmente não integrais.",
                "plena possuem aplicabilidade direta, imediata e efeitos possivelmente não integrais.",
                "aplicabilidade direta, imediata e efeitos possivelmente não integrais.",
                "aplicabilidade direta, efeitos imediatos e possivelmente não integrais.",
                "d",
                "Normas de eficácia contida: autoaplicáveis, restringíveis, com aplicabilidade direta, imediata e possivelmente não integral."
        ));

        // =========================
        // Questão 6 (FCC / TRT 2ª Região – 2018) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 2ª Região – 2018",
                "Considerando a classificação das normas constitucionais quanto à sua aplicabilidade e eficácia,",
                "a alternativa correta é:",
                "todas as normas de direitos e garantias fundamentais previstas na Constituição Federal têm eficácia plena, já que são normas de aplicação imediata segundo o texto constitucional.",
                "na ausência de norma regulamentadora de norma constitucional de eficácia contida poderá ser impetrado habeas data, desde que para assegurar a aplicação de direitos e liberdades constitucionais e das prerrogativas inerentes à nacionalidade, à soberania e à cidadania.",
                "caracteriza norma de eficácia limitada aquela segundo a qual o direito de greve será exercido pelos servidores públicos nos termos e nos limites definidos em lei específica.",
                "caracteriza norma programática aquela segundo a qual é livre o exercício de qualquer trabalho, ofício ou profissão, atendidas as qualificações profissionais que a lei estabelecer.",
                "na ausência de norma regulamentadora que torne inviável o exercício dos direitos previstos em normas constitucionais de eficácia limitada, poderá ser impetrado mandado de segurança.",
                "c",
                "O direito de greve dos servidores públicos (art. 37, VII, CF/88) é norma de eficácia limitada, pois depende de lei específica para produzir todos os seus efeitos."
        ));

        // =========================
        // Questão 7 (FCC / TRF 3ª Região – 2016) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRF 3ª Região – 2016",
                "Uma das classificações das normas constitucionais quanto a sua aplicabilidade foi proposta por José Afonso da Silva.",
                "Segundo a classificação desse autor, entende-se por norma constitucional de eficácia contida aquela que possui aplicabilidade:",
                "direta e imediata, produzindo de logo todos os seus efeitos, os quais, no entanto, podem ser limitados por outras normas jurídicas, constitucionais ou infraconstitucionais.",
                "direta, imediata e integral, não estando sujeita a qualquer tipo de limitação infraconstitucional.",
                "indireta e mediata, vez depender a sua plena efetividade de regulamentação infraconstitucional.",
                "direta, imediata e integral, competindo ao Poder Público apenas regrar a forma de seu exercício por meio de normas administrativas infralegais, vedada qualquer limitação.",
                "indireta e mediata, vez depender a sua plena efetividade da aplicação de outras normas constitucionais.",
                "a",
                "As normas de eficácia contida têm aplicabilidade direta e imediata, mas podem ser restringidas (aplicabilidade possivelmente não integral)."
        ));

        // =========================
        // Questão 8 (FCC / TRT 23ª Região – 2016) - COM TEXTO (art. 18, §2°)
        // =========================
        String textoQ8 = "Dispõe o artigo 18, § 2°, da Constituição Federal: \"Os Territórios Federais integram a União, e sua criação, transformação em Estado ou reintegração ao Estado de origem serão reguladas em lei complementar\".";
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 23ª Região – 2016",
                textoQ8,
                "De acordo com a classificação de aplicabilidade das normas constitucionais, o art. 18, § 2° da Constituição Federal de 1988 é uma norma de:",
                "eficácia contida.",
                "eficácia plena.",
                "princípio programático.",
                "princípio institutivo ou organizativo.",
                "eficácia controlada.",
                "d",
                "É norma de eficácia limitada do tipo princípio institutivo/organizativo, pois depende de lei complementar para estruturar a criação/transformação de Territórios."
        ));

        // =========================
        // Questão 9 (FCC / TRT 4ª Região – 2015) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 4ª Região – 2015",
                "O direito de greve no serviço público, a inadmissibilidade de provas obtidas por meios ilícitos no processo e a liberdade de exercício de qualquer profissão constituem, respectivamente, normas constitucionais de eficácia:",
                "alternativa correta:",
                "limitada, contida e plena.",
                "contida, plena e limitada.",
                "contida, limitada e plena.",
                "limitada, plena e contida.",
                "plena, limitada e contida.",
                "d",
                "Greve servidor público (art. 37, VII) = limitada; provas ilícitas (art. 5º, LVI) = plena; liberdade profissional (art. 5º, XIII) = contida."
        ));

        // =========================
        // Questão 10 (FCC / TRT 3ª Região – 2015) - COM TEXTO (PEC da Bengala)
        // =========================
        String textoQ10 = "O dispositivo da chamada \"PEC da Bengala\" (Emenda Constitucional n° 88/2015), que prevê que os servidores públicos em geral, com exceção dos Ministros do Supremo Tribunal Federal, dos Tribunais Superiores e Tribunal de Contas da União, serão aposentados \"compulsoriamente, com proventos proporcionais ao tempo de contribuição, aos 70 (setenta) anos de idade, ou aos 75 (setenta e cinco) anos de idade, na forma de lei complementar\".";
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRT 3ª Região – 2015",
                textoQ10,
                "É classificado pela doutrina como norma constitucional de:",
                "eficácia contida.",
                "eficácia plena.",
                "eficácia limitada.",
                "conteúdo programático.",
                "integração restringível.",
                "c",
                "Depende de lei complementar para produzir todos os seus efeitos, sendo, portanto, norma de eficácia limitada."
        ));

        // =========================
        // Questão 11 (FCC / TCE-CE – 2015) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TCE-CE – 2015",
                "Consideram-se normas constitucionais de eficácia contida aquelas em que o legislador constituinte:",
                "alternativa correta:",
                "regulou suficientemente os interesses relativos a determinada matéria produzindo a norma desde logo seus efeitos, mas deixou margem à atuação restritiva por parte do Poder Público, nos termos que vierem a ser previstos em lei.",
                "deixou ao legislador ordinário o poder pleno de disciplinar a matéria, sem delinear os limites de tal atuação.",
                "regulamentou inteiramente a matéria, a qual não pode ser objeto de nenhum juízo restritivo por parte do Poder Público.",
                "deixou ao legislador ordinário o poder de disciplinar a matéria, dependendo a norma constitucional, para gerar efeitos, da existência de regras restritivas por este traçadas.",
                "previu os princípios que devem ser observados pelo Poder Público, sem fixar diretriz a ser seguida na elaboração das leis ordinárias posteriores.",
                "a",
                "Normas de eficácia contida são autoaplicáveis (produzem efeitos desde logo), mas podem ser restringidas posteriormente."
        ));

        // =========================
        // Questão 12 (FCC / CNMP – 2015) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / CNMP – 2015",
                "Em relação à eficácia e aplicabilidade das normas constitucionais, é correto afirmar:",
                "alternativa correta:",
                "As normas constitucionais de aplicabilidade direta, imediata e integral, que admitem norma infraconstitucional posterior restringindo seu âmbito de atuação, são de eficácia plena.",
                "As normas constitucionais de aplicabilidade diferida e mediata, que não são dotadas de eficácia jurídica e não vinculam o legislador infraconstitucional aos seus vetores, são de eficácia contida.",
                "As normas constitucionais de aplicabilidade direta, imediata e integral, por não admitirem que norma infraconstitucional posterior restrinja seu âmbito de atuação, são de eficácia contida.",
                "As normas constitucionais que traçam esquemas gerais de estruturação de órgãos, entidades ou institutos, são de eficácia plena.",
                "As normas constitucionais declaratórias de princípios programáticos, que veiculam programas a serem implementados pelo Poder Público para concretização dos fins sociais, são de eficácia limitada.",
                "e",
                "Normas programáticas são espécies de normas de eficácia limitada, pois dependem de implementação futura pelo Poder Público."
        ));

        // =========================
        // Questão 13 (FCC / TCM-GO – 2015) - SEM TEXTO (alternativas com artigos)
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TCM-GO – 2015",
                "Considerando a classificação que divide as normas constitucionais quanto à sua eficácia em normas de eficácia plena, de eficácia contida e de eficácia limitada,",
                "é exemplo de norma de eficácia contida:",
                "o direito de greve será exercido nos termos e nos limites definidos em lei específica (art. 37, VII)",
                "Cada Assembleia Legislativa, com poderes constituintes, elaborará a Constituição do Estado, no prazo de um ano, contado da promulgação da Constituição Federal, obedecidos os princípios desta (art. 11 - ADCT).",
                "A República Federativa do Brasil buscará a integração econômica, política, social e cultural dos povos da América Latina, visando à formação de uma comunidade latino-americana de nações (art. 4º, parágrafo único).",
                "é livre o exercício de qualquer trabalho, ofício ou profissão, atendidas as qualificações profissionais que a lei estabelecer (art. 5º, XIII)",
                "Os Deputados e Senadores são invioláveis, civil e penalmente, por quaisquer de suas opiniões, palavras e votos (art. 53, caput)",
                "d",
                "A liberdade profissional (art. 5º, XIII) é norma de eficácia contida, pois pode ser restringida por lei que estabeleça qualificações profissionais."
        ));

        // =========================
        // HIERARQUIA DAS NORMAS
        // Questão 1 (FCC / PGE-MT – 2016) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / PGE-MT – 2016",
                "No que concerne aos Tratados Internacionais de proteção dos direitos humanos e sua evolução constitucional no direito brasileiro à luz da Constituição Federal,",
                "eles são caracterizados como sendo de hierarquia:",
                "supraconstitucional, independentemente de aprovação pelo Congresso Nacional.",
                "constitucional, dependendo de aprovação pelas duas casas do Congresso Nacional, pelo quorum mínimo de 3/5, em dois turnos, em cada casa.",
                "infraconstitucional legal, dependendo de aprovação pelas duas casas do Congresso Nacional pelo quórum mínimo de 3/5 de cada casa.",
                "infraconstitucional legal, independentemente de aprovação pelo Congresso Nacional, bastando a assinatura do Presidente da República.",
                "constitucional, independentemente de aprovação pelas duas casas do Congresso Nacional, bastando a assinatura do Presidente da República.",
                "b",
                "Art. 5º, §3º, CF/88: tratados de direitos humanos aprovados em dois turnos por 3/5 em cada Casa equivalem a emendas constitucionais (hierarquia constitucional)."
        ));

        // =========================
        // Questão 2 (FCC / TRE-SP - 2012) - Afirmativa (Certo/Errado adaptado para múltipla)
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRE-SP - 2012",
                "Em reconhecimento à internacionalização da matéria relativa a direitos e garantias fundamentais, a Constituição da República estabelece que tratados internacionais, em matéria de direitos humanos, serão equivalentes a emendas constitucionais se forem aprovados, em cada Casa do Congresso Nacional, em dois turnos, por três quintos dos votos dos respectivos membros.",
                "Esta afirmação está:",
                "Errada, pois tratados de direitos humanos são sempre infraconstitucionais.",
                "Correta, conforme o art. 5º, §3º, da CF/88.",
                "Errada, pois o quórum exigido é de maioria simples.",
                "Errada, pois a aprovação é em turno único.",
                "Errada, pois não há previsão de hierarquia constitucional para tratados de direitos humanos.",
                "b",
                "O §3º do art. 5º foi inserido pela EC 45/2004 e estabelece exatamente esse procedimento para que tratados de direitos humanos tenham status de emenda constitucional."
        ));

        // =========================
        // PODER CONSTITUINTE
        // Questão 1 (FCC - DP RR/DPE RR/2021) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC - DP RR/DPE RR/2021",
                "São características do poder constituinte derivado reformador:",
                "alternativa correta:",
                "Acarretar uma verificação do texto constitucional.",
                "Criar, por parte dos entes federados, sua própria Constituição.",
                "Ser o responsável pela ampliação ou modificação do texto constitucional.",
                "Encontrar previsão nos Atos das Disposições Constitucionais Transitórias.",
                "Acarretar reforma do texto constitucional apenas após cinco anos da promulgação.",
                "c",
                "O poder constituinte derivado reformador é o responsável pela ampliação ou modificação do texto constitucional por meio de emendas."
        ));

        // =========================
        // Questão 2 (FCC / DPE-MA – 2018) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / DPE-MA – 2018",
                "Constitui poder dos Estados, unidades da federação, de elaborar as suas próprias constituições, o poder constituinte derivado:",
                "alternativa correta:",
                "reformador.",
                "revisor.",
                "decorrente.",
                "regulamentar.",
                "subsidiário.",
                "c",
                "Poder Constituinte Derivado Decorrente é aquele conferido aos Estados-membros para elaborarem suas próprias Constituições Estaduais."
        ));

        // =========================
        // Questão 3 (FCC / MPE-PB – 2018) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / MPE-PB – 2018",
                "A distinção entre poder constituinte e poder constituído, sendo aquele exercido pela nação, por meio de representantes para tanto investidos, é devida a:",
                "alternativa correta:",
                "Jean-Jacques Rosseau, na obra 'Do contrato social'.",
                "Emmanuel-Joseph Sieyès, na obra 'O que é o Terceiro Estado?'.",
                "Alexis de Tocqueville, na obra 'A democracia na América'.",
                "Alexis de Tocqueville, na obra 'O Antigo Regime e a revolução'.",
                "Montesquieu, na obra 'O espírito das leis'.",
                "b",
                "A teoria do Poder Constituinte foi concebida pelo abade francês Emmanuel Sieyès no século XVIII."
        ));

        // =========================
        // Questão 4 (FCC / ICMS-SC – 2018) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / ICMS-SC – 2018",
                "Examinando a Constituição Federal vigente à luz da Doutrina do Poder Constituinte, conclui-se que o texto constitucional:",
                "alternativa correta:",
                "não dispõe sobre o exercício do Poder Constituinte no âmbito dos Estados, uma vez que, por força do princípio federativo e da autonomia concedida aos Estados, cabe às constituições estaduais disciplinarem essa matéria.",
                "não dispõe sobre o exercício do Poder Constituinte de revisão ou reformador, por ser desnecessário o estabelecimento de limites ao exercício desse Poder que, por sua natureza, já nasce subordinado aos princípios estabelecidos pelo Constituinte originário.",
                "disciplina o exercício do Poder Constituinte municipal ao dispor que o Município reger-se-á por lei orgânica, que servirá de parâmetro para que o Supremo Tribunal Federal exerça sua competência originária para julgar a ação direta de inconstitucionalidade em face de leis municipais.",
                "disciplina o exercício do Poder Constituinte originário ao determinar que a revisão constitucional será realizada após cinco anos, contados da promulgação da Constituição, pelo voto da maioria absoluta dos membros do Congresso Nacional, em sessão unicameral.",
                "não dispõe sobre o exercício do Poder Constituinte originário, uma vez que esse poder, cujo titular é o povo, caracteriza-se por ser inicial, ilimitado e soberano.",
                "e",
                "O povo é o titular do Poder Constituinte Originário, que é inicial, soberano e juridicamente ilimitado. O texto constitucional não disciplina este poder."
        ));

        // =========================
        // Questão 5 (FCC / TRE-PR – 2017) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRE-PR – 2017",
                "À luz do direito vigente, as emendas à Constituição Federal, aprovadas pela Câmara dos Deputados e pelo Senado Federal, são atos normativos que decorrem do poder:",
                "alternativa correta:",
                "constituinte originário, podendo alterar a Constituição sem encontrar limites jurídicos para tanto, uma vez que o poder constituinte, cujo titular é o povo, é soberano e ilimitado.",
                "constituinte derivado, podendo alterar a Constituição desde que sejam respeitados os limites jurídicos nela originariamente previstos.",
                "constituinte originário, podendo alterar a constituição desde que sejam respeitados os limites nela previstos.",
                "legislativo, mas não do poder constituinte, uma vez que os parlamentares que as aprovam não são especialmente eleitos para o fim de alterarem a Constituição, motivo pelo qual as emendas constitucionais são hierarquicamente inferiores às normas constitucionais originariamente editadas pelo poder constituinte.",
                "legislativo, estando sujeitas aos mesmos limites jurídicos que devem ser observados no processo de elaboração das leis complementares e ordinárias.",
                "b",
                "Emendas decorrem do Poder Constituinte Derivado Reformador, que deve respeitar limites formais, materiais e circunstanciais previstos na CF/88."
        ));

        // =========================
        // Questão 6 (FCC / PGE-MA – 2016) - COM TEXTO (Canotilho)
        // =========================
        String textoQ6 = "\"...se o poder constituinte se destina a criar uma constituição concebida como organização e limitação do poder, não se vê como esta 'vontade de constituição' pode deixar de condicionar a vontade do criador. Por outro lado, este criador, este sujeito constituinte, este povo ou nação, é estruturado e obedece a padrões e modelos de condutas espirituais, culturais, éticos e sociais radicados na consciência jurídica geral da comunidade...\" (CANOTILHO, Joaquim José Gomes. Direito Constitucional e Teoria da Constituição)";
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / PGE-MA – 2016",
                textoQ6,
                "No excerto acima transcrito, o autor discorre sobre a:",
                "existência de condicionantes materiais à atuação do poder constituinte.",
                "compreensão da doutrina clássica do poder constituinte.",
                "relação dicotômica entre poder constituinte originário e poder constituinte derivado.",
                "relação dicotômica entre poder constituinte originário e poder constituinte decorrente.",
                "relação dicotômica entre poder constituinte nacional e poder constituinte supranacional.",
                "a",
                "Canotilho explica que o Poder Constituinte Originário não é ilimitado, devendo obedecer a padrões e modelos de condutas espirituais, culturais, éticos e sociais (condicionantes materiais)."
        ));

        // =========================
        // Questão 7 (FCC / TRE-PB – 2015) - SEM TEXTO
        // =========================
        questoes.add(new QuestaoMultiplaEscolha(
                "FCC / TRE-PB – 2015",
                "O Poder Constituinte conferido pela Constituição Federal aos Estados-membros, para que elaborem as suas próprias Constituições, é denominado:",
                "alternativa correta:",
                "Derivado decorrente.",
                "Originário material.",
                "Derivado reformador.",
                "Originário formal.",
                "Originário limitado.",
                "a",
                "Poder Constituinte Derivado Decorrente é o poder dos Estados de se auto-organizarem por meio de suas Constituições Estaduais."
        ));
    }

    public List<QuestaoMultiplaEscolha> getQuestoes() {
        return questoes;
    }
}
