package com.seuapp.mensageria.flashcard_questoes.flashcards.leis_flashcards;

import com.seuapp.mensageria.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class LeiLGPD_13709_2018_Flashcards {
    public static List<Flashcard> getFlashcards() {
        List<Flashcard> lista = new ArrayList<>();

        // ========================================
        // VÍDEO 01 - DISPOSIÇÕES PRELIMINARES E CONCEITOS FUNDAMENTAIS
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Disposições Preliminares",
                "LEI_13709_2018_ID",
                "🧭 Identificação da Lei",
                "📌 LEI Nº 13.709/2018 (LGPD):\n" +
                        "🟢 Inspirada no GDPR Europeu.\n" +
                        "🟢 Vigência desde 18/09/2020.\n" +
                        "🟢 Objetivo: Regulação ética e legítima, NÃO proibição do uso de dados."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Contexto",
                "CASO_CAMBRIDGE_ANALYTICA",
                "🧭 Caso Emblemático",
                "📌 Cambridge Analytica/Facebook (2016):\n" +
                        "🟢 Uso indevido de dados de milhões de usuários.\n" +
                        "🟢 Sem conhecimento ou consentimento.\n" +
                        "🟢 Escancarou a necessidade de leis como a LGPD."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Conceitos",
                "DADO_PESSOAL",
                "🧭 Dado Pessoal",
                "📌 Informação relacionada a pessoa natural identificada ou identificável.\n" +
                        "🟢 Titular é SEMPRE pessoa natural (ser humano).\n" +
                        "🟢 NÃO se aplica a dados de pessoa jurídica."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Conceitos",
                "TRATAMENTO",
                "🧭 Tratamento",
                "📌 Qualquer operação com dados pessoais:\n" +
                        "🟢 Coleta, produção, uso, acesso, armazenamento.\n" +
                        "🟢 Eliminação, comunicação, transferência.\n" +
                        "🟢 Do começo ao fim (coleta ao descarte)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "CONTROLADOR_VS_OPERADOR",
                "🧭 Controlador e Operador",
                "📌 CONTROLADOR: Decide sobre o tratamento (dono do negócio).\n" +
                        "🟢 OPERADOR: Executa o tratamento em nome do controlador.\n" +
                        "🟢 RESPONSABILIDADE: Controlador manda, Operador faz."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "ENCARREGADO_DPO",
                "🧭 Encarregado (DPO)",
                "📌 DPO = Data Protection Officer.\n" +
                        "🟢 Canal de comunicação entre controlador, titulares e ANPD.\n" +
                        "🟢 É UMA PESSOA (CPF), não uma empresa.\n" +
                        "🟢 Não é o único responsável pela conformidade."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Regras",
                "CONSENTIMENTO",
                "🧭 Consentimento",
                "📌 Regra geral para tratamento.\n" +
                        "🟢 Livre + Informado + Inequívoco.\n" +
                        "🟢 Deve ser para finalidade ESPECÍFICA.\n" +
                        "🟢 Revogável a qualquer momento, de graça."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Regras",
                "PRINCIPIOS_LGPD",
                "🧭 Princípios Fundamentais",
                "📌 Finalidade: propósito legítimo, específico e explícito.\n" +
                        "🟢 Adequação: compatível com a finalidade informada.\n" +
                        "🟢 Necessidade: mínimo necessário para a finalidade.\n" +
                        "🟢 Livre Acesso: consulta facilitada e gratuita.\n" +
                        "🟢 Qualidade: exatidão e atualização dos dados.\n" +
                        "🟢 Transparência: informações claras e acessíveis.\n" +
                        "🟢 Segurança: proteção contra acessos não autorizados.\n" +
                        "🟢 Prevenção: evitar danos antes que ocorram.\n" +
                        "🟢 Não Discriminação: vedação de uso discriminatório.\n" +
                        "🟢 Accountability: demonstrar conformidade e assumir responsabilidade."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Dados",
                "DADOS_SENSIVEIS",
                "🧭 Dados Sensíveis",
                "📌 Lista TAXATIVA do Art. 5º, II:\n" +
                        "🟢 Origem racial ou étnica.\n" +
                        "🟢 Convicção religiosa e opinião política.\n" +
                        "🟢 Filiação a sindicato/org. religiosa/filosófica/política.\n" +
                        "🟢 Saúde, vida sexual, dados genéticos e biométricos.\n" +
                        "🟢 ATENÇÃO: Dados bancários NÃO são sensíveis!"
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Regras",
                "PRESTACAO_CONTAS",
                "🧭 Accountability (Prestação de Contas)",
                "📌 Art. 6º, X - Responsabilização e Prestação de Contas:\n" +
                        "🟢 Controlador deve DEMONSTRAR conformidade.\n" +
                        "🟢 Manter registros (logs) das operações.\n" +
                        "🟢 Assumir responsabilidade pelas decisões.\n" +
                        "🟢 É o 'princípio da prova'."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Aplicação",
                "AMBITO_APLICACAO",
                "🧭 Âmbito de Aplicação",
                "📌 Art. 3º - LGPD se aplica se:\n" +
                        "🟢 Operação em território nacional.\n" +
                        "🟢 Oferta de bens/serviços a pessoas NO BRASIL.\n" +
                        "🟢 Dados coletados em território nacional.\n" +
                        "🟢 MACETE: Lei protege pessoas localizadas no Brasil."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Exceções",
                "NAO_APLICACAO",
                "🧭 NÃO Aplicação da LGPD",
                "📌 Art. 4º - Exceções:\n" +
                        "🟢 Uso particular NÃO ECONÔMICO.\n" +
                        "🟢 Fins EXCLUSIVAMENTE jornalísticos/artísticos/acadêmicos.\n" +
                        "🟢 Segurança pública, defesa nacional, investigação penal.\n" +
                        "🟢 Dados de país com proteção adequada SEM vínculo com Brasil."
        ));

        // ========================================
        // VÍDEO 02 - DISPOSIÇÕES PRELIMINARES (Art. 1º a 5º)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 1º",
                "ESCOPO_LEI",
                "🧭 Escopo da Lei (Art. 1º)",
                "📌 Disciplina o tratamento de dados pessoais:\n" +
                        "🟢 Por pessoa natural ou jurídica (pública/privada).\n" +
                        "🟢 Em qualquer meio (físico ou digital).\n" +
                        "🟢 Finalidade: proteger direitos fundamentais de liberdade, privacidade e livre desenvolvimento da personalidade."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 2º",
                "FUNDAMENTOS_LEI",
                "🧭 Fundamentos da LGPD (Art. 2º)",
                "📌 Princípios norteadores:\n" +
                        "🟢 Respeito à privacidade.\n" +
                        "🟢 Autodeterminação informativa (controle do titular).\n" +
                        "🟢 Liberdade de expressão e inviolabilidade da intimidade.\n" +
                        "🟢 Desenvolvimento econômico e tecnológico.\n" +
                        "🟢 Livre iniciativa e direitos humanos."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 4º",
                "EXCECOES_APLICACAO",
                "🧭 Exceções do Art. 4º",
                "📌 LGPD NÃO se aplica:\n" +
                        "🟢 I - Uso particular NÃO ECONÔMICO (ex: lista de aniversários).\n" +
                        "🟢 II - Fins EXCLUSIVAMENTE jornalísticos, artísticos ou acadêmicos.\n" +
                        "🟢 III - Segurança pública, defesa nacional, investigação penal.\n" +
                        "🟢 IV - Dados estrangeiros sem vínculo com Brasil, com proteção adequada."
        ));

        // ========================================
        // VÍDEO 03 - DEFINIÇÕES E CONCEITOS FUNDAMENTAIS (Art. 5º)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 5º",
                "CONCEITOS_LEGAIS",
                "🧭 Definições do Art. 5º",
                "📌 CONCEITOS FUNDAMENTAIS:\n" +
                        "🟢 Dado Pessoal: informação de pessoa natural identificada ou identificável.\n" +
                        "🟢 Dado Sensível: lista taxativa (saúde, origem racial, religião, etc.).\n" +
                        "🟢 Dado Anonimizado: não identifica o titular com meios razoáveis.\n" +
                        "🟢 Bloqueio: suspensão temporária do tratamento.\n" +
                        "🟢 Eliminação: exclusão definitiva do dado.\n" +
                        "🟢 Uso Compartilhado: comunicação entre órgãos públicos/privados."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 5º",
                "DADO_ANONIMIZADO",
                "🧭 Dado Anonimizado",
                "📌 Dado que não pode identificar o titular.\n" +
                        "🟢 Considerando meios técnicos razoáveis disponíveis.\n" +
                        "🟢 NÃO é mais considerado dado pessoal para a LGPD.\n" +
                        "🟢 ATENÇÃO: Se reversível com esforço razoável, volta a ser pessoal."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 5º",
                "RIPD_CONCEITO",
                "🧭 Relatório de Impacto (RIPD)",
                "📌 RIPD = Relatório de Impacto à Proteção de Dados.\n" +
                        "🟢 Documentação do controlador.\n" +
                        "🟢 Contém: descrição dos processos de tratamento.\n" +
                        "🟢 Medidas para mitigar riscos aos titulares.\n" +
                        "🟢 Pode ser exigido pela ANPD."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 5º",
                "TRANSFERENCIA_INTERNACIONAL_CONCEITO",
                "🧭 Transferência Internacional",
                "📌 Transferência de dados para país estrangeiro ou organismo internacional.\n" +
                        "🟢 Sujeita a regras específicas.\n" +
                        "🟢 País destino deve ter grau de proteção adequado.\n" +
                        "🟢 Ou outras hipóteses do Art. 33."
        ));

        // ========================================
        // VÍDEO 04 - ATORES E PAPÉIS (Art. 5º - Continuação)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "TITULAR",
                "🧭 Titular dos Dados",
                "📌 Pessoa natural a quem se referem os dados.\n" +
                        "🟢 É o DONO dos dados.\n" +
                        "🟢 SEMPRE é pessoa física (ser humano).\n" +
                        "🟢 Ex: usuário, cliente, cidadão."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "AGENTES_TRATAMENTO",
                "🧭 Agentes de Tratamento",
                "📌 Termo que engloba Controlador e Operador.\n" +
                        "🟢 São as partes ativas no processamento.\n" +
                        "🟢 CONTROLADOR: toma as decisões.\n" +
                        "🟢 OPERADOR: executa em nome do controlador.\n" +
                        "🟢 Podem ser a mesma pessoa (física ou jurídica)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "ORGAO_PESQUISA",
                "🧭 Órgão de Pesquisa",
                "📌 Art. 5º - Definição:\n" +
                        "🟢 Entidade pública ou privada SEM FINS LUCRATIVOS.\n" +
                        "🟢 Constituída no Brasil.\n" +
                        "🟢 Missão: pesquisa básica ou aplicada (histórica, científica, tecnológica).\n" +
                        "🟢 Ex: IBGE, IPEA.\n" +
                        "🟢 NÃO são: Datafolha, empresas de pesquisa de mercado (têm fins lucrativos)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Atores",
                "ANPD_ORGAO",
                "🧭 ANPD - Autoridade Nacional",
                "📌 Órgão da administração pública.\n" +
                        "🟢 Responsável por zelar, implementar e fiscalizar.\n" +
                        "🟢 Atua em todo território nacional.\n" +
                        "🟢 É o regulador e supervisor da lei."
        ));

        // ========================================
        // VÍDEO 05 - PRINCÍPIOS DO TRATAMENTO (Art. 6º)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_FINALIDADE",
                "🧭 Princípio da Finalidade",
                "📌 Tratamento para propósitos legítimos, específicos, explícitos e informados ao titular.\n" +
                        "🟢 Não pode usar e-mail coletado para newsletter para vender seguros.\n" +
                        "🟢 A nova finalidade exige nova autorização."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_ADECUACAO",
                "🧭 Princípio da Adequação",
                "📌 Tratamento compatível com as finalidades informadas.\n" +
                        "🟢 CPF para compra não pode ser usado para consulta de crédito.\n" +
                        "🟢 Sem novo consentimento é vedado."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_NECESSIDADE",
                "🧭 Princípio da Necessidade",
                "📌 Tratamento limitado ao mínimo necessário.\n" +
                        "🟢 Loja precisa do endereço para entregar, NÃO da religião.\n" +
                        "🟢 Coletar o máximo de dados VIOLA este princípio."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_LIVRE_ACESSO",
                "🧭 Princípio do Livre Acesso",
                "📌 Garantia de consulta facilitada e GRATUITA.\n" +
                        "🟢 Titular pode solicitar relatório de dados a qualquer momento.\n" +
                        "🟢 A empresa NÃO pode cobrar por isso."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_QUALIDADE",
                "🧭 Princípio da Qualidade dos Dados",
                "📌 Garantia de exatidão, clareza, relevância e atualização.\n" +
                        "🟢 Empresa deve permitir correção de dados desatualizados.\n" +
                        "🟢 Ex: mudança de telefone deve ser atualizada."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_TRANSPARENCIA",
                "🧭 Princípio da Transparência",
                "📌 Informações claras, precisas e facilmente acessíveis.\n" +
                        "🟢 Políticas de privacidade em 'juridiquês' VIOLA o princípio.\n" +
                        "🟢 Deve ser de fácil compreensão."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_SEGURANCA",
                "🧭 Princípio da Segurança",
                "📌 Medidas técnicas e administrativas para proteção.\n" +
                        "🟢 Criptografia, controle de acesso, políticas de senha.\n" +
                        "🟢 Aplica-se a TODO tratamento, não só dados sensíveis."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_PREVENCAO",
                "🧭 Princípio da Prevenção",
                "📌 Medidas para prevenir danos.\n" +
                        "🟢 Auditorias de segurança.\n" +
                        "🟢 Avaliação de riscos (Privacy by Design).\n" +
                        "🟢 Agir antes que o vazamento ocorra."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 6º",
                "PRINCIPIO_NAO_DISCRIMINACAO",
                "🧭 Princípio da Não Discriminação",
                "📌 Vedação de uso discriminatório ilícito ou abusivo.\n" +
                        "🟢 Não pode usar origem racial para filtrar candidatos.\n" +
                        "🟢 Protege contra tratamento desigual."
        ));

        // ========================================
        // VÍDEO 06 - HIPÓTESES DE TRATAMENTO LÍCITO (Art. 7º)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "HIPOTESES_DISPENSA_COMPLETO",
                "🧭 10 Hipóteses de Dispensa",
                "📌 Art. 7º - Dispensa consentimento para:\n" +
                        "🟢 II - Obrigação legal ou regulatória.\n" +
                        "🟢 III - Políticas públicas (administração pública).\n" +
                        "🟢 IV - Estudos por órgão de pesquisa (SEM fins lucrativos).\n" +
                        "🟢 V - Execução de contrato ou procedimentos preliminares.\n" +
                        "🟢 VI - Exercício regular de direitos em processo judicial/arbitral.\n" +
                        "🟢 VII - Proteção da vida ou incolumidade física.\n" +
                        "🟢 VIII - Tutela da saúde (profissionais/serviços de saúde).\n" +
                        "🟢 IX - Legítimo interesse do controlador.\n" +
                        "🟢 X - Proteção do crédito.\n" +
                        "🟢 XI - Dados manifestamente públicos."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_OBRIGACAO_LEGAL",
                "🧭 Dispensa - Obrigação Legal",
                "📌 Art. 7º, II - Cumprimento de obrigação legal/regulatória.\n" +
                        "🟢 Atender mandado judicial.\n" +
                        "🟢 Requisição da Receita Federal ou ANPD.\n" +
                        "🟢 Não precisa de consentimento."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_POLITICA_PUBLICA",
                "🧭 Dispensa - Políticas Públicas",
                "📌 Art. 7º, III - Administração pública.\n" +
                        "🟢 Tratamento e uso compartilhado.\n" +
                        "🟢 Necessários à execução de políticas públicas previstas em lei.\n" +
                        "🟢 Ex: Caixa usar CADÚnico para pagar Bolsa Família."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_PESQUISA",
                "🧭 Dispensa - Órgão de Pesquisa",
                "📌 Art. 7º, IV - Realização de estudos.\n" +
                        "🟢 Por órgão de pesquisa (SEM fins lucrativos).\n" +
                        "🟢 Garantida a anonimização quando possível.\n" +
                        "🟢 Ex: IBGE, IPEA.\n" +
                        "🟢 NÃO se aplica a empresas de pesquisa de mercado."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_CONTRATO",
                "🧭 Dispensa - Execução de Contrato",
                "📌 Art. 7º, V - Necessário para execução de contrato.\n" +
                        "🟢 Ou procedimentos preliminares a pedido do titular.\n" +
                        "🟢 Ex: analisar RG/holerite de futuro inquilino."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_PROCESSO",
                "🧭 Dispensa - Exercício de Direitos",
                "📌 Art. 7º, VI - Exercício regular de direitos.\n" +
                        "🟢 Em processo judicial, administrativo ou arbitral.\n" +
                        "🟢 Ex: empresa apresenta dados como prova em defesa."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_VIDA",
                "🧭 Dispensa - Proteção da Vida",
                "📌 Art. 7º, VII - Proteção da vida ou incolumidade física.\n" +
                        "🟢 Do titular ou de terceiro.\n" +
                        "🟢 Ex: SAMU acessando dados de pessoa desacordada."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_SAUDE",
                "🧭 Dispensa - Tutela da Saúde",
                "📌 Art. 7º, VIII - Tutela da saúde.\n" +
                        "🟢 Exclusivamente em procedimento por profissionais de saúde.\n" +
                        "🟢 Serviços de saúde ou autoridade sanitária.\n" +
                        "🟢 Ex: hospitais compartilhando prontuários."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_CREDITO",
                "🧭 Dispensa - Proteção do Crédito",
                "📌 Art. 7º, X - Proteção do crédito.\n" +
                        "🟢 Inclui legislação pertinente.\n" +
                        "🟢 Ex: financeira consulta SPC/Serasa.\n" +
                        "🟢 NÃO precisa de autorização do devedor."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 7º",
                "DISPENSA_PUBLICOS",
                "🧭 Dispensa - Dados Públicos",
                "📌 Art. 7º, XI - Dados manifestamente públicos.\n" +
                        "🟢 Pelo titular.\n" +
                        "🟢 Ex: informações divulgadas em blog ou rede social pública.\n" +
                        "🟢 ATENÇÃO: Demais princípios continuam valendo!"
        ));

        // ========================================
        // VÍDEO 07 - CONSENTIMENTO E DIREITOS DO TITULAR (Arts. 8º, 9º e 18)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 8º",
                "CONSENTIMENTO_REGRAS",
                "🧭 Regras do Consentimento",
                "📌 Art. 8º - Requisitos:\n" +
                        "🟢 Forma: escrito ou outro meio que demonstre vontade.\n" +
                        "🟢 Destaque: cláusula destacada das demais.\n" +
                        "🟢 Ônus da Prova: é do controlador.\n" +
                        "🟢 Vícios: consentimento enganoso é inválido.\n" +
                        "🟢 Especificidade: deve ser para finalidades determinadas.\n" +
                        "🟢 Revogação: a qualquer momento, gratuito e facilitado.\n" +
                        "🟢 Ratificação: tratamentos anteriores válidos permanecem.\n" +
                        "🟢 Mudança: informar previamente o titular."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 18",
                "DIREITOS_TITULAR_COMPLETO",
                "🧭 Direitos do Titular (Art. 18)",
                "📌 O titular pode obter do controlador:\n" +
                        "🟢 I - Confirmação da existência de tratamento.\n" +
                        "🟢 II - Acesso aos dados.\n" +
                        "🟢 III - Correção de dados incompletos/inexatos.\n" +
                        "🟢 IV - Anonimização, bloqueio ou eliminação.\n" +
                        "🟢 V - Portabilidade a outro fornecedor.\n" +
                        "🟢 VI - Informação sobre entidades com quem compartilhou.\n" +
                        "🟢 VII - Informação sobre não consentir e consequências.\n" +
                        "🟢 VIII - Revogação do consentimento.\n" +
                        "🟢 Tudo GRATUITO e por requerimento expresso."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 18",
                "SEGREDO_COMERCIAL",
                "🧭 Limite - Segredo Comercial",
                "📌 Direito de acesso NÃO obriga revelar:\n" +
                        "🟢 Segredos comerciais ou industriais.\n" +
                        "🟢 Fórmula de algoritmo interno.\n" +
                        "🟢 Deve informar a lógica e consequências.\n" +
                        "🟢 NÃO os detalhes proprietários."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 10",
                "INTERESSE_LEGITIMO_COMPLETO",
                "🧭 Interesse Legítimo (Art. 10)",
                "📌 Art. 7º, IX / Art. 10 - Hipótese de dispensa.\n" +
                        "🟢 Permite tratamento para fins legítimos do controlador.\n" +
                        "🟢 Ex: prevenção à fraude, segurança física, aprimoramento.\n" +
                        "🟢 NÃO pode prevalecer sobre direitos fundamentais do titular.\n" +
                        "🟢 É base legal SUBJETIVA (análise caso a caso).\n" +
                        "🟢 Fonte comum de litígios."
        ));

        // ========================================
        // VÍDEO 08 - TRATAMENTO ESPECÍFICO E TÉRMINO (Arts. 11, 14, 15, 16)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 11",
                "DADOS_SENSIVEIS_REGRA_COMPLETA",
                "🧭 Dados Sensíveis - Regras",
                "📌 Art. 11 - Tratamento de dados sensíveis:\n" +
                        "🟢 REGRA: Consentimento ESPECÍFICO e DESTACADO.\n" +
                        "🟢 HIPÓTESES DE DISPENSA:\n" +
                        "🟢 Cumprimento de obrigação legal/regulatória.\n" +
                        "🟢 Políticas públicas.\n" +
                        "🟢 Estudos por órgão de pesquisa (anonimizado).\n" +
                        "🟢 Exercício de direitos em processo.\n" +
                        "🟢 Proteção da vida/integridade física.\n" +
                        "🟢 Tutela da saúde (profissionais da área).\n" +
                        "🟢 Prevenção à fraude e segurança do titular."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 14",
                "DADOS_CRIANCAS_REGRA",
                "🧭 Dados de Crianças e Adolescentes",
                "📌 Art. 14 - REGRA ABSOLUTA:\n" +
                        "🟢 Consentimento específico e destacado pelo menos UM dos PAIS ou RESPONSÁVEL.\n" +
                        "🟢 HIPÓTESES DE DISPENSA (apenas 2):\n" +
                        "🟢 1) Para contatar os pais ou responsável.\n" +
                        "🟢 2) Para proteger a criança/adolescente.\n" +
                        "🟢 NESTES CASOS: Dados NÃO PODEM SER ARMAZENADOS!\n" +
                        "🟢 DEVERES DO CONTROLADOR:\n" +
                        "🟢 Coletar dados ESTRITAMENTE NECESSÁRIOS.\n" +
                        "🟢 Verificar se consentimento é de adulto responsável."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 15",
                "TERMINO_TRATAMENTO_COMPLETO",
                "🧭 Término do Tratamento (Art. 15)",
                "📌 O tratamento termina quando:\n" +
                        "🟢 Finalidade alcançada ou dados desnecessários.\n" +
                        "🟢 Período de tratamento acabou.\n" +
                        "🟢 Titular revogou o consentimento.\n" +
                        "🟢 ANPD determinou.\n" +
                        "🟢 Houver violação de dispositivo da lei."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 16",
                "ELIMINACAO_CONSERVACAO_COMPLETO",
                "🧭 Eliminação e Conservação (Art. 16)",
                "📌 REGRA GERAL: Eliminar dados ao término.\n" +
                        "🟢 HIPÓTESES DE CONSERVAÇÃO:\n" +
                        "🟢 I - Cumprimento de obrigação legal/regulatória.\n" +
                        "🟢 II - Estudo por órgão de pesquisa (anonimizado).\n" +
                        "🟢 III - Transferência a terceiro (respeitadas regras).\n" +
                        "🟢 IV - Uso exclusivo do controlador, sem acesso de terceiro, com dados anonimizados."
        ));

        // ========================================
        // VÍDEO 09 - DIREITOS DO TITULAR (Arts. 18 a 21)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 18-21",
                "DIREITOS_TITULAR_DETALHADO",
                "🧭 Direitos do Titular (Arts. 18-21)",
                "📌 Art. 18 - Direitos básicos:\n" +
                        "🟢 Confirmação, acesso, correção, eliminação.\n" +
                        "🟢 Portabilidade, informação de compartilhamento.\n" +
                        "🟢 Negativa e revogação do consentimento.\n" +
                        "🟢 Tudo GRATUITO e por requerimento.\n" +
                        "🟢 Art. 20 - Revisão de decisões automatizadas.\n" +
                        "🟢 Art. 21 - Vedação de uso prejudicial (ex: ações trabalhistas)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 20",
                "REVISAO_AUTOMATIZADA",
                "🧭 Revisão de Decisões Automatizadas",
                "📌 Art. 20 - Direito do titular:\n" +
                        "🟢 Solicitar revisão de decisões UNICAMENTE automatizadas.\n" +
                        "🟢 Ex: negativa de empréstimo por algoritmo de crédito.\n" +
                        "🟢 Deve informar critérios gerais utilizados.\n" +
                        "🟢 NÃO obriga revelar segredo comercial do algoritmo."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 21",
                "USO_PREJUDICIAL_VEDADO",
                "🧭 Uso Prejudicial Vedado",
                "📌 Art. 21 - Dados referentes ao exercício regular de direitos.\n" +
                        "🟢 NÃO podem ser usados em prejuízo do titular.\n" +
                        "🟢 Ex: descobrir ações trabalhistas e recusar candidato.\n" +
                        "🟢 Protege o cidadão que exerce seus direitos."
        ));

        // ========================================
        // VÍDEO 10 - TRATAMENTO PELO PODER PÚBLICO (Arts. 23 a 32)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 23-24",
                "PODER_PUBLICO_REGRAS",
                "🧭 Tratamento pelo Poder Público",
                "📌 Arts. 23 e 24:\n" +
                        "🟢 Pessoas jurídicas de direito público PODEM tratar dados.\n" +
                        "🟢 Para finalidade pública, interesse público e competências legais.\n" +
                        "🟢 NÃO precisa de consentimento.\n" +
                        "🟢 Cada órgão deve indicar DPO.\n" +
                        "🟢 Cartórios = tratamento de direito público.\n" +
                        "🟢 Dados em formatos interoperáveis (abertos)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 23-24",
                "EMPRESA_ESTATAL_CLASSIFICACAO",
                "🧭 Classificação de Empresas Estatais",
                "📌 Depende da ATUAÇÃO:\n" +
                        "🟢 CONCORRÊNCIA (mercado) = tratamento de PRIVADO.\n" +
                        "🟢 POLÍTICAS PÚBLICAS = tratamento de PÚBLICO.\n" +
                        "🟢 Ex: Correios (concorrência) = privado.\n" +
                        "🟢 Caixa (Bolsa Família/Auxílio) = público."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 26-27",
                "COMPARTILHAMENTO_PUBLICO_PRIVADO_REGRAS",
                "🧭 Compartilhamento Público ↔ Privado",
                "📌 REGRA GERAL: VEDADO compartilhar dados do setor público para o privado.\n" +
                        "🟢 EXCEÇÕES (QUANDO PODE):\n" +
                        "🟢 Dados já forem públicos.\n" +
                        "🟢 Execução descentralizada de atividade pública (contrato de TI).\n" +
                        "🟢 Previsão legal (lei, contrato, convênio).\n" +
                        "🟢 Prevenir fraudes e proteger segurança do titular.\n" +
                        "🟢 Em geral requer consentimento, exceto políticas públicas (Art. 7º, III)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 31-32",
                "RESPONSABILIDADE_PODER_PUBLICO",
                "🧭 Responsabilidade do Poder Público",
                "📌 Arts. 31 e 32:\n" +
                        "🟢 ANPD envia informe com medidas para cessar violação.\n" +
                        "🟢 ANPD pode solicitar publicação de RIPD.\n" +
                        "🟢 Órgãos públicos também são fiscalizados pela ANPD."
        ));

        // ========================================
        // VÍDEO 11 - TRANSFERÊNCIA INTERNACIONAL (Arts. 33 a 35)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 33",
                "TRANSFERENCIA_INTERNACIONAL_HIPOTESES",
                "🧭 Transferência Internacional (Art. 33)",
                "📌 5 HIPÓTESES PERMITIDAS:\n" +
                        "🟢 I - País destino com grau de proteção ADEQUADO.\n" +
                        "🟢 II - Garantias do controlador (cláusulas, selos, certificações).\n" +
                        "🟢 III - Cooperação jurídica internacional (instrumentos de DIREITO INTERNACIONAL).\n" +
                        "🟢 III - Proteção da vida/integridade física.\n" +
                        "🟢 IV - Autorização da ANPD.\n" +
                        "🟢 V - Consentimento ESPECÍFICO e DESTACADO do titular."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 33",
                "TRANSFERENCIA_INTERNACIONAL_PONTOS",
                "🧭 Transferência - Pontos Críticos",
                "📌 ATENÇÃO AOS DETALHES:\n" +
                        "🟢 Cooperação internacional: deve seguir INSTRUMENTOS DE DIREITO INTERNACIONAL.\n" +
                        "🟢 NÃO é baseado em leis internas domésticas.\n" +
                        "🟢 Consentimento: deve ser ESPECÍFICO para a transferência internacional.\n" +
                        "🟢 Não basta consentimento genérico."
        ));

        // ========================================
        // VÍDEO 12 - AGENTES DE TRATAMENTO: DEVERES E RESPONSABILIDADES (Arts. 37 a 46)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 37-38",
                "DEVERES_AGENTES_COMPLETO",
                "🧭 Deveres dos Agentes",
                "📌 Arts. 37 e 38 - Deveres:\n" +
                        "🟢 Registrar operações de tratamento (OBRIGATÓRIO).\n" +
                        "🟢 Especialmente quando baseadas em legítimo interesse.\n" +
                        "🟢 Elaborar RIPD quando determinado pela ANPD.\n" +
                        "🟢 RIPD mínimo: tipos de dados, metodologia, segurança, mitigação de riscos.\n" +
                        "🟢 Observar padrões técnicos da ANPD.\n" +
                        "🟢 Prazos de guarda dos registros conforme ANPD."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 41",
                "DPO_ATRIBUICOES",
                "🧭 Atribuições do DPO",
                "📌 Art. 41 - Funções do Encarregado:\n" +
                        "🟢 Aceitar reclamações dos titulares e prestar esclarecimentos.\n" +
                        "🟢 Receber comunicações da ANPD e adotar providências.\n" +
                        "🟢 Orientar funcionários e contratados sobre práticas.\n" +
                        "🟢 Executar outras atribuições determinadas pelo controlador.\n" +
                        "🟢 É canal de comunicação, NÃO o único responsável."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 42-46",
                "RESPONSABILIDADE_OBJETIVA_COMPLETA",
                "🧭 Responsabilidade por Danos",
                "📌 Arts. 42 a 46 - RESPONSABILIDADE OBJETIVA:\n" +
                        "🟢 Independe de culpa (basta dano e nexo causal).\n" +
                        "🟢 OPERADOR responde SOLIDARIAMENTE se descumprir lei.\n" +
                        "🟢 Irregularidade por falta de segurança.\n" +
                        "🟢 ISENÇÃO (Art. 43): agente prova que:\n" +
                        "🟢 1) Não realizou o tratamento.\n" +
                        "🟢 2) Fez tudo de acordo com a lei.\n" +
                        "🟢 3) Dano por culpa exclusiva do titular/terceiro.\n" +
                        "🟢 ÔNUS DA PROVA da isenção é do agente."
        ));

        // ========================================
        // VÍDEO 13 - SEGURANÇA, INCIDENTES E BOAS PRÁTICAS (Arts. 46 a 52)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 46-47",
                "MEDIDAS_SEGURANCA_COMPLETO",
                "🧭 Medidas de Segurança",
                "📌 Arts. 46 e 47:\n" +
                        "🟢 Adotar medidas técnicas e administrativas.\n" +
                        "🟢 Proteger de acessos não autorizados.\n" +
                        "🟢 Proteger de situações acidentais ou ilícitas.\n" +
                        "🟢 ANPD define padrões técnicos mínimos.\n" +
                        "🟢 PRIVACY BY DESIGN: segurança desde a concepção."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 48-49",
                "COMUNICACAO_INCIDENTES_COMPLETO",
                "🧭 Comunicação de Incidentes",
                "📌 Arts. 48 e 49 - OBRIGAÇÃO:\n" +
                        "🟢 Controlador deve comunicar à ANPD.\n" +
                        "🟢 E aos titulares afetados.\n" +
                        "🟢 Quando houver risco ou dano relevante.\n" +
                        "🟢 Em prazo razoável.\n" +
                        "🟢 CONTEÚDO: natureza dos dados, titulares, medidas, riscos, ações corretivas.\n" +
                        "🟢 ANPD pode determinar divulgação em amplo alcance."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Arts. 50-52",
                "GOVERNAÇA_PROPROCIONALIDADE",
                "🧭 Governança e Proporcionalidade",
                "📌 Arts. 50 a 52:\n" +
                        "🟢 Programa de governança em privacidade.\n" +
                        "🟢 Demonstrar comprometimento com proteção.\n" +
                        "🟢 PRINCÍPIO DA PROPORCIONALIDADE:\n" +
                        "🟢 Medidas de segurança proporcionais a:\n" +
                        "🟢 Natureza e porte da entidade.\n" +
                        "🟢 Volume e tipo de dados tratados.\n" +
                        "🟢 Sensibilidade dos dados.\n" +
                        "🟢 Probabilidade e gravidade dos riscos."
        ));

        // ========================================
        // VÍDEO 14 - SANÇÕES ADMINISTRATIVAS (Art. 52)
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Art. 52",
                "SANCOES_ADMINISTRATIVAS_COMPLETO",
                "🧭 Sanções Administrativas (Art. 52)",
                "📌 SANÇÕES (da mais leve à mais grave):\n" +
                        "🟢 1. Advertência (chamada de atenção).\n" +
                        "🟢 2. Multa Simples (até 2% faturamento OU R$ 50 mi).\n" +
                        "🟢 3. Multa Diária (enquanto persistir a violação).\n" +
                        "🟢 4. Publicização da Infração (dano à reputação).\n" +
                        "🟢 5. Bloqueio dos Dados (suspensão temporária).\n" +
                        "🟢 6. Eliminação dos Dados (exclusão definitiva).\n" +
                        "🟢 7. Suspensão Parcial do funcionamento.\n" +
                        "🟢 8. Suspensão da atividade de tratamento.\n" +
                        "🟢 9. Proibição Parcial/Total da atividade."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Art. 52",
                "CRITERIOS_SANCOES_COMPLETO",
                "🧭 Critérios de Aplicação (Art. 52, §2º)",
                "📌 11 CRITÉRIOS PARA GRADUAÇÃO:\n" +
                        "🟢 1. Gravidade e natureza da infração.\n" +
                        "🟢 2. Boa-fé do infrator.\n" +
                        "🟢 3. Vantagem obtida pelo infrator.\n" +
                        "🟢 4. Condição econômica do infrator.\n" +
                        "🟢 5. Reincidência.\n" +
                        "🟢 6. Grau do dano causado.\n" +
                        "🟢 7. Cooperação com a autoridade.\n" +
                        "🟢 8. Medidas internas para minimizar o dano.\n" +
                        "🟢 9. Políticas de boas práticas e governança.\n" +
                        "🟢 10. Pronta adoção de medidas corretivas.\n" +
                        "🟢 11. Proporcionalidade."
        ));

        // ========================================
        // VÍDEO 15 - ANPD
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - ANPD",
                "ANPD_CARACTERISTICAS_COMPLETO",
                "🧭 ANPD - Características",
                "📌 NATUREZA INICIAL: Transitória.\n" +
                        "🟢 Autonomia técnica e decisória.\n" +
                        "🟢 Servidores remanejados (sem concurso inicial).\n" +
                        "🟢 Receitas próprias (aluguel/venda de bens).\n" +
                        "🟢 COMPETÊNCIAS:\n" +
                        "🟢 Fiscalizar cumprimento da lei.\n" +
                        "🟢 Editar normas técnicas.\n" +
                        "🟢 Aplicar sanções administrativas.\n" +
                        "🟢 Apreciar petições de titulares."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - ANPD",
                "ANPD_ESTRUTURA_COMPLETA",
                "🧭 Estrutura da ANPD",
                "📌 COMPOSIÇÃO:\n" +
                        "🟢 Conselho Diretor (gestão executiva).\n" +
                        "🟢 Conselho Nacional de Proteção de Dados (consultivo).\n" +
                        "🟢 Representantes: Câmara, Senado, sociedade civil.\n" +
                        "🟢 Corregedoria e Ouvidoria.\n" +
                        "🟢 Assessoramento Jurídico.\n" +
                        "🟢 Unidades Administrativas Especializadas (TI, etc.)."
        ));

        // ========================================
        // VÍDEO 16 - ATUALIZAÇÃO LEI 14.460/2022
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - ANPD",
                "LEI_14460_2022_COMPLETA",
                "🧭 Lei 14.460/2022 - ANPD",
                "📌 MUDANÇA PRINCIPAL:\n" +
                        "🟢 DE: Natureza Transitória.\n" +
                        "🟢 PARA: AUTARQUIA DE NATUREZA ESPECIAL.\n" +
                        "🟢 Equiparada às agências reguladoras (Anatel, Anvisa).\n" +
                        "🟢 Autonomia administrativa, financeira e decisória.\n" +
                        "🟢 Orçamento e patrimônio próprios.\n" +
                        "🟢 Carreira de Especialista em Políticas Públicas (APPGG).\n" +
                        "🟢 Pode ajuizar ações civis públicas.\n" +
                        "🟢 Alinhamento com melhores práticas internacionais.\n" +
                        "🟢 Fortalece transferência internacional de dados."
        ));

        // ========================================
        // CILADAS - PRINCIPAIS ARMADILHAS
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_DADOS_SENSIVEIS",
                "🧭 Cilada: Dados Sensíveis",
                "📌 Dados bancários/cartão de crédito NÃO são sensíveis.\n" +
                        "🟢 Sensíveis são APENAS os listados taxativamente no Art. 5º, II.\n" +
                        "🟢 Lista: origem racial, saúde, vida sexual, religião, política, genético, biométrico.\n" +
                        "🟢 Dados financeiros têm proteção específica, mas NÃO se enquadram."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_PROIBICAO",
                "🧭 Cilada: LGPD Proíbe Uso",
                "📌 LGPD NÃO PROÍBE o uso de dados.\n" +
                        "🟢 Exige TRANSPARÊNCIA e CONSENTIMENTO.\n" +
                        "🟢 O uso é permitido se houver base legal.\n" +
                        "🟢 Ex: consentimento ou legítimo interesse."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_APLICACAO_DIGITAL",
                "🧭 Cilada: Aplicação Digital",
                "📌 LGPD NÃO se aplica apenas a dados digitais/online.\n" +
                        "🟢 Aplica-se a QUALQUER OPERAÇÃO.\n" +
                        "🟢 Independente do meio (digital, papel, etc.)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_EXTRATERRITORIAL",
                "🧭 Cilada: Aplicação Extraterritorial",
                "📌 LGPD NÃO vale só para operações no Brasil.\n" +
                        "🟢 TEM APLICAÇÃO EXTRATERRITORIAL.\n" +
                        "🟢 Aplica-se a organizações estrangeiras que:\n" +
                        "🟢 Oferecem serviços a pessoas no Brasil.\n" +
                        "🟢 Coletam dados de indivíduos no território nacional."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_CONSENTIMENTO_UNICO",
                "🧭 Cilada: Consentimento é a Única Base",
                "📌 Consentimento é a regra geral, mas NÃO é a única.\n" +
                        "🟢 A lei prevê OUTRAS 9 hipóteses que dispensam.\n" +
                        "🟢 Ex: obrigação legal, execução de contrato, legítimo interesse, proteção da vida."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_TITULAR_PESSOA_JURIDICA",
                "🧭 Cilada: Titular Pessoa Jurídica",
                "📌 Empresa (pessoa jurídica) NÃO pode ser titular.\n" +
                        "🟢 Titular é SEMPRE pessoa natural (ser humano).\n" +
                        "🟢 Empresa é controladora ou operadora dos dados."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_OPERADOR_DECIDE",
                "🧭 Cilada: Operador Decide",
                "📌 Operador NÃO decide sobre o tratamento.\n" +
                        "🟢 Quem decide é o CONTROLADOR.\n" +
                        "🟢 Operador EXECUTA sob as ordens do controlador."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_DPO_EMPRESA",
                "🧭 Cilada: DPO é Empresa",
                "📌 DPO NÃO pode ser uma empresa terceirizada.\n" +
                        "🟢 Encarregado é UMA PESSOA (CPF).\n" +
                        "🟢 Pode ser funcionário ou terceiro, mas deve ser indivíduo identificável."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_PESQUISA_LUCRO",
                "🧭 Cilada: Pesquisa com Fins Lucrativos",
                "📌 Empresas de pesquisa de mercado NÃO são 'órgão de pesquisa'.\n" +
                        "🟢 Para ser órgão de pesquisa: entidade SEM FINS LUCRATIVOS.\n" +
                        "🟢 Ex: Datafolha tem fins lucrativos, NÃO se enquadra."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_CONTROLADOR_OPERADOR_MESMA",
                "🧭 Cilada: Controlador e Operador Sempre Diferentes",
                "📌 Controlador e Operador PODEM ser a mesma pessoa.\n" +
                        "🟢 Nesse caso, acumula os dois papéis.\n" +
                        "🟢 Ex: uma loja que coleta e armazena dados sem terceirizar."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_CONSENTIMENTO_GENERICO",
                "🧭 Cilada: Consentimento Genérico",
                "📌 Consentimento genérico ('concordo que usem meus dados') é NULO.\n" +
                        "🟢 Deve ser para finalidade ESPECÍFICA e DETERMINADA.\n" +
                        "🟢 Art. 8º, §4º: autorizações genéricas são nulas."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_REVOGACAO_COBRANCA",
                "🧭 Cilada: Cobrança pela Revogação",
                "📌 Revogação deve ser GRATUITA.\n" +
                        "🟢 Empresa NÃO pode cobrar para processar revogação.\n" +
                        "🟢 Art. 8º, §5º: procedimento gratuito e facilitado."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_REVOGACAO_RETROATIVA",
                "🧭 Cilada: Revogação Retroativa",
                "📌 Revogação NÃO torna ilegais tratamentos anteriores.\n" +
                        "🟢 Tratamentos realizados com consentimento válido são RATIFICADOS.\n" +
                        "🟢 Para apagar dados antigos: pedido de eliminação específico."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Ciladas",
                "CILADA_DADOS_PUBLICOS",
                "🧭 Cilada: Dados Públicos Uso Livre",
                "📌 Dados públicos dispensam consentimento, MAS:\n" +
                        "🟢 Demais princípios continuam valendo.\n" +
                        "🟢 Não discriminação, segurança, finalidade, etc.\n" +
                        "🟢 NÃO pode usar de forma discriminatória ou que cause dano."
        ));

        // ========================================
        // RESUMOS DE BOLSO
        // ========================================

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO01",
                "🧭 Resumo - Parte 1",
                "📌 Espírito da Lei: Transparência e consentimento, não proibição.\n" +
                        "🟢 Alcance: Protege pessoas no Brasil, qualquer meio, aplicação extraterritorial.\n" +
                        "🟢 Regra de Ouro: Tratamento requer consentimento (revogável), salvo exceções legais.\n" +
                        "🟢 Dado Sensível: Só os listados na lei. Dado bancário NÃO é sensível.\n" +
                        "🟢 Inspiração: GDPR Europeu.\n" +
                        "🟢 Vigência: 18/09/2020."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO02",
                "🧭 Resumo - Arts. 1º a 5º",
                "📌 Escopo: Protege dados de pessoas naturais.\n" +
                        "🟢 Aplicação (QUANDO VALE):\n" +
                        "🟢 1) Tratamento AQUI.\n" +
                        "🟢 2) Oferta de bens/serviços para pessoas AQUI.\n" +
                        "🟢 3) Coleta de dados AQUI.\n" +
                        "🟢 NÃO Aplica: uso particular não econômico; jornalístico/artístico/acadêmico; segurança pública; dados estrangeiros sem vínculo.\n" +
                        "🟢 MACETE: Lei protege quem está no Brasil."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO03",
                "🧭 Resumo - Art. 5º (Conceitos)",
                "📌 Dado Pessoal = Info sobre pessoa natural.\n" +
                        "🟢 Dado Sensível = Lista fechada (saúde, origem racial, religião, política, vida sexual, genético, biométrico).\n" +
                        "🟢 Consentimento = Livre + Informado + Inequívoco + Para finalidade específica.\n" +
                        "🟢 Anonimizado = Dado que não identifica mais a pessoa (com técnica razoável).\n" +
                        "🟢 Cilada Clássica: Dado financeiro NUNCA é sensível."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO04",
                "🧭 Resumo - Atores (Art. 5º)",
                "📌 Titular: Pessoa física (dono dos dados).\n" +
                        "🟢 Controlador: Quem manda (toma as decisões).\n" +
                        "🟢 Operador: Quem faz (executa o processamento).\n" +
                        "🟢 Encarregado (DPO): Ponto de contato (pessoa física).\n" +
                        "🟢 Órgão de Pesquisa: Entidade sem fins lucrativos (ex: IBGE).\n" +
                        "🟢 ANPD: Fiscal da lei."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO05",
                "🧭 Resumo - Princípios (Art. 6º)",
                "📌 Sigla FANTAS LDQ:\n" +
                        "🟢 Finalidade, Adequação, Necessidade.\n" +
                        "🟢 Transparência, Acesso Livre.\n" +
                        "🟢 Segurança, Não Discriminação.\n" +
                        "🟢 Qualidade dos Dados.\n" +
                        "🟢 Accountability (Responsabilização): princípio da prova."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO06",
                "🧭 Resumo - Hipóteses Lícitas (Art. 7º)",
                "📌 REGRA: Consentimento (Inciso I).\n" +
                        "🟢 EXCEÇÕES MAIS COBRADAS:\n" +
                        "🟢 II - Obrigação legal/Justiça.\n" +
                        "🟢 III - Políticas Públicas.\n" +
                        "🟢 IV - Pesquisa sem fins lucrativos.\n" +
                        "🟢 V - Executar Contrato.\n" +
                        "🟢 VI - Defesa em Processo.\n" +
                        "🟢 VII/VIII - Proteção da Vida/Saúde.\n" +
                        "🟢 X - Proteção do Crédito (SPC).\n" +
                        "🟢 ATENÇÃO: Dispensar consentimento NÃO dispensa Segurança, Transparência, etc."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO07",
                "🧭 Resumo - Consentimento e Direitos",
                "📌 Consentimento Válido = Destacado + Específico + Livre + Com Prova + Revogável (grátis e fácil).\n" +
                        "🟢 Direitos do Titular (Art. 18): Saber, Acessar, Corrigir, Apagar, Portar, Saber com quem compartilhou, Revogar.\n" +
                        "🟢 Limite: Segredo comercial protege detalhes operacionais.\n" +
                        "🟢 Interesse Legítimo: Exceção ao consentimento, análise caso a caso."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO08",
                "🧭 Resumo - Dados Sensíveis, Crianças e Término",
                "📌 Dados Sensíveis: Consentimento específico e destacado. Exceções ≈ Art. 7º.\n" +
                        "🟢 Crianças/Adolescentes: Consentimento dos PAIS. Sem consentimento: 1) contatar pais; 2) proteger criança. NESTES CASOS, SEM ARMAZENAMENTO.\n" +
                        "🟢 Término: finalidade alcançada, prazo acabou, revogação, ANPD mandou.\n" +
                        "🟢 Conservação: obrigação legal, pesquisa, transferência, uso interno anonimizado."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO09",
                "🧭 Resumo - Direitos Arts. 18-21",
                "📌 Direitos Básicos (Art. 18): Saber, Acessar, Corrigir, Apagar, Portar, Saber com quem compartilhou, Negar/Revogar consentimento.\n" +
                        "🟢 Como? De graça, por requerimento expresso.\n" +
                        "🟢 Limite: Segredo comercial protege algoritmos e lista nominal de parceiros.\n" +
                        "🟢 Decisão da Máquina: pode pedir revisão e saber critérios (Art. 20).\n" +
                        "🟢 Exercício de Direitos: não pode ser usado contra você (Art. 21)."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO10",
                "🧭 Resumo - Poder Público",
                "📌 Poder Público: Trata dados por interesse público. Não precisa de consentimento. Precisa de DPO.\n" +
                        "🟢 Empresa Estatal: Concorrência = Privado. Política Pública = Público.\n" +
                        "🟢 Compartilhar (Público → Privado): Em geral NÃO PODE. Exceções: dados públicos, contrato/lei, prevenir fraude.\n" +
                        "🟢 Cartórios: Tratados como públicos pela LGPD."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO11",
                "🧭 Resumo - Transferência Internacional",
                "📌 Pode transferir dados para fora se:\n" +
                        "🟢 1) País protege igual (adequado).\n" +
                        "🟢 2) Controlador garante (contrato/selo).\n" +
                        "🟢 3) Cooperação internacional (por tratado) ou proteger a vida.\n" +
                        "🟢 4) ANPD autorizar.\n" +
                        "🟢 5) Titular consentir de forma específica.\n" +
                        "🟢 Cooperação Internacional: termo chave é 'instrumentos de direito internacional'."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO12",
                "🧭 Resumo - Deveres e Responsabilidade",
                "📌 Agentes devem: Registrar operações, fazer RIPD se solicitado.\n" +
                        "🟢 DPO: É o 'ouvidor' (ponto de contato). Não é o 'dono' do problema.\n" +
                        "🟢 Responsabilidade: Objetiva e solidária.\n" +
                        "🟢 Isenção: só se provar: 1) Não fez; 2) Fez tudo certo; 3) Culpa foi só da vítima/terceiro."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO13",
                "🧭 Resumo - Segurança e Incidentes",
                "📌 Segurança: Adotar medidas técnicas e administrativas razoáveis. ANPD define mínimo.\n" +
                        "🟢 Incidente: Comunicar OBRIGATORIAMENTE à ANPD e aos titulares afetados.\n" +
                        "🟢 Governança: Ter programa de privacidade proporcional.\n" +
                        "🟢 Proporcionalidade: Medidas compatíveis com sensibilidade dos dados e risco do negócio.\n" +
                        "🟢 Privacy by Design: segurança desde a concepção."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO14",
                "🧭 Resumo - Sanções Administrativas",
                "📌 Sanções: Da advertência até proibir de tratar dados.\n" +
                        "🟢 Multa Máxima: 2% do faturamento OU R$ 50 milhões (o que for MENOR).\n" +
                        "🟢 Critério Mestre: Proporcionalidade.\n" +
                        "🟢 Atenua: Boa-fé, cooperação, boas práticas, correção rápida.\n" +
                        "🟢 Agrava: Má-fé, reincidência, vantagem econômica, grande dano."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO15",
                "🧭 Resumo - ANPD",
                "📌 ANPD: O 'Fiscal' da LGPD.\n" +
                        "🟢 Natureza Inicial: Transitória.\n" +
                        "🟢 Faz: Fiscaliza, normatiza, aplica multas, ouve petições.\n" +
                        "🟢 Pessoal: Inicialmente servidores emprestados.\n" +
                        "🟢 Receitas: Aluguel/venda de seus imóveis."
        ));

        lista.add(new Flashcard(
                "📘 LGPD - Resumo",
                "RESUMO_BOLSO_VIDEO16",
                "🧭 Resumo - Lei 14.460/2022",
                "📌 Lei 14.460/2022 mudou o status da ANPD.\n" +
                        "🟢 DE: Órgão transitório, pessoal emprestado.\n" +
                        "🟢 PARA: Autarquia Especial (como agência reguladora).\n" +
                        "🟢 Com autonomia, orçamento próprio e quadro dedicado.\n" +
                        "🟢 Resultado: ANPD mais FORTE, INDEPENDENTE e CRÍVEL."
        ));

        return lista;
    }
}
