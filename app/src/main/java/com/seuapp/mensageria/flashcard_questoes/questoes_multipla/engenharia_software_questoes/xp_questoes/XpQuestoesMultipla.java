package com.seuapp.mensageria.flashcard_questoes.questoes_multipla.engenharia_software_questoes.xp_questoes;

import com.seuapp.mensageria.model.QuestaoMultiplaEscolha;

import java.util.ArrayList;
import java.util.List;

// Classe que representa a disciplina de Metodologias Ágeis / XP
public class XpQuestoesMultipla {

    // Lista de questões sobre Extreme Programming (XP)
    private List<QuestaoMultiplaEscolha> questoesXP;

    public XpQuestoesMultipla() {
        questoesXP = new ArrayList<>();
        inicializarQuestoes();
    }

    private void inicializarQuestoes() {
        // Questão 1 (FCC / SANASA Campinas – 2019)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / SANASA Campinas – 2019",
                "Em um projeto de software baseado na metodologia ágil XP, um Analista de TI deve:",
                "consultar o cliente quando uma história exigir, por estimativa, menos do que 3 semanas de desenvolvimento, para que o cliente a complemente com mais tarefas.",
                "ouvir o cliente, durante o levantamento de requisitos, para que este crie as histórias de usuários. Após essa importante etapa nenhuma história nova deve ser criada para não comprometer o cronograma do projeto.",
                "evitar que o projeto caia na armadilha de seguir o princípio KISS de forma a estimular que o projeto de uma funcionalidade extra, que poderá ser necessária no futuro, faça parte do modelo do software.",
                "realizar os testes de unidade de forma manual, evitando que sejam usadas baterias de testes automatizados, pois estes impedem a realização de testes de regressão.",
                "estimular o uso de cartões CRC como um mecanismo eficaz para pensar o software em um contexto orientado a objetos.",
                "e", // resposta correta: letra E
                "O XP valoriza cartões CRC (Classe, Responsabilidade, Colaboradores) para design orientado a objetos."
        ));

        // Questão 2 (FCC / Prefeitura de Teresina – PI – 2016)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / Prefeitura de Teresina – PI – 2016",
                "Os métodos ágeis de desenvolvimento de software como eXtreme Programming – XP consideram um conjunto de valores fundamentais derivados do manifesto ágil. Assim, estes métodos valorizam MENOS:",
                "os indivíduos e a interação entre eles, do que os processos e ferramentas.",
                "o software funcionando, do que uma documentação abrangente.",
                "a colaboração com o cliente, do que negociação de contratos.",
                "a resposta rápida a mudanças, do que seguir um plano previamente definido.",
                "a rigorosidade dos processos, do que a adaptação às mudanças.",
                "e", // resposta correta: letra E
                "O Manifesto Ágil valoriza indivíduos, software funcionando, colaboração com cliente e resposta a mudanças. A alternativa E inverte o sentido (valorizam MENOS rigorosidade dos processos)."
        ));

        // Questão 7 (FCC / TRE-PB – 2015)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / TRE-PB – 2015",
                "Extreme Programming − XP pode ser considerado um modelo de desenvolvimento de software baseado em uma série de valores, princípios e regras, dentre eles:",
                "criar obrigatoriamente uma matriz de rastreabilidade de requisitos.",
                "manter o foco na documentação, detalhada e diversificada.",
                "definir sprint de no máximo duas semanas.",
                "escrever sempre o código, depois, o teste de unidade.",
                "realizar semanalmente o jogo do planejamento (planning game).",
                "e", // resposta correta: letra E
                "O Planning Game é uma prática central do XP, realizada a cada release para priorizar histórias."
        ));

        // Questão 8 (FCC / TST – 2012)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / TST – 2012",
                "O XP (Extreme Programming) utiliza uma abordagem orientada a objetos como seu paradigma de desenvolvimento predileto. Ele:",
                "recomenda que duas pessoas trabalhem juntas para criar o código correspondente a uma história.",
                "recomenda que a equipe XP e os clientes trabalhem de forma separada para não mudar o compromisso básico definido para a versão a ser entregue.",
                "segue rigorosamente o princípio FDD - Feature Driven Development.",
                "recomenda que depois que as histórias forem desenvolvidas e o trabalho preliminar do projeto for feito, a equipe XP avance diretamente para o código.",
                "inclui um conjunto de regras e práticas que ocorrem no contexto de 3 atividades de arcabouço: projeto, implementação e entrega.",
                "a", // resposta correta: letra A
                "Programação em pares (duas pessoas trabalhando juntas) é uma prática fundamental do XP."
        ));

        // Questão (FCC / MPE-AP – 2012)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / MPE-AP – 2012",
                "O Extreme Programming (XP) é, talvez, o mais conhecido e mais utilizado dos métodos ágeis. Dentre suas práticas se encontram programação em pares, integração contínua, refatoração e:",
                "propriedade coletiva, que garante uma participação nos lucros aos membros da equipe de desenvolvimento, técnica que incentiva e aumenta o desempenho de toda a equipe.",
                "envolvimento do cliente apenas na fase final do sistema, fator que difere de outras metodologias como SCRUM e TDD e confere agilidade ao processo de desenvolvimento.",
                "processo de desenvolvimento contínuo, em que a equipe se mantém focada no sistema até que uma funcionalidade específica seja entregue, comumente agregando horas extras ao turno de trabalho.",
                "utilização de técnicas de ofuscação do código fonte, trazendo segurança e garantindo que apenas a equipe de desenvolvimento poderá ter acesso a este código.",
                "desenvolvimento incremental e sustentado por meio de pequenos e frequentes releases do sistema. Os requisitos são baseados em cenários ou em simples histórias de clientes.",
                "e", // resposta correta: letra E
                "Pequenos releases frequentes é uma prática central do XP, juntamente com programação em pares, integração contínua e refatoração."
        ));

        // Questão 10 (FCC / MPE-PE – 2012)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / MPE-PE – 2012",
                "Dentre as práticas do método ágil Extreme Programming (XP), está a prática de propriedade coletiva. É correto afirmar que, nessa prática:",
                "os trabalhos são desenvolvidos em conjunto, para que um programador possa analisar o trabalho do outro.",
                "cada projeto é realizado para atender às necessidades globais dos usuários, focando na coletividade da distribuição da informação.",
                "os pares de desenvolvedores trabalham em todas as áreas do sistema, de modo que não se desenvolvam ilhas de expertise.",
                "grandes quantidades de horas extras não são consideradas aceitáveis, pois o resultado final, muitas vezes, é a redução da qualidade do código e da produtividade a médio prazo, sendo que o indivíduo pode afetar o desempenho de todo o time.",
                "um representante do usuário final do sistema deve estar disponível todo o tempo à equipe de desenvolvimento. Nesse modelo de desenvolvimento, o cliente é membro da equipe e participa da responsabilidade do código desenvolvido.",
                "c", // resposta correta: letra C
                "Propriedade coletiva no XP significa que qualquer par pode modificar qualquer parte do código, evitando ilhas de conhecimento."
        ));

        // Questão 2 (FCC / TRT-MT – 2011) - NÃO se aplica
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / TRT-MT – 2011",
                "NÃO se aplica à disciplina de desenvolvimento de software extreme programming (XP):",
                "Usa notações próprias para construir os diversos produtos de trabalho do projeto.",
                "Encoraja a refabricação para modificar um software sem alterar o comportamento externo do código.",
                "Recomenda que dois programadores trabalhem juntos no mesmo computador para escrever um código.",
                "Baseada em valores de simplicidade, comunicação, feedback e coragem.",
                "Adota como um elemento-chave a criação de testes unitários antes da codificação começar.",
                "a", // resposta correta: letra A
                "XP não usa notações próprias formais ou produtos de trabalho documentais extensos, priorizando código e comunicação direta."
        ));

        // Questão 13 (FCC / TRE-RN – 2011)
        questoesXP.add(new QuestaoMultiplaEscolha(
                "FCC / TRE-RN – 2011",
                "Considere as seguintes características: I. Propriedade coletiva. II. Integração contínua. III. Metáfora. Dentre as práticas componentes da Extreme Programming, aplica-se o que consta em:",
                "I, apenas.",
                "II, apenas.",
                "I e II, apenas.",
                "II e III, apenas.",
                "I, II e III.",
                "e", // resposta correta: letra E
                "Todas as três são práticas do XP: Propriedade Coletiva, Integração Contínua e Metáfora (um sistema de nomes compartilhado)."
        ));
    }

    public List<QuestaoMultiplaEscolha> getQuestoesXP() {
        return questoesXP;
    }

}
