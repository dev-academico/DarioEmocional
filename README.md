# DiarioEmocional
Um sistema que desenvolve seu emocional junto com você

# Guia da Sprint 0 — DIM0524

Prazo em [CRONOGRAMA.md](CRONOGRAMA.md#visão-geral). O que entregar e como é avaliado: [RUBRICAS.md](RUBRICAS.md#sprint-0).

A Sprint 0 é a fase de planejamento: a equipe define o que vai construir, escolhe plataforma-alvo e backend, e deixa o ambiente funcionando.

---

## Visão do produto

Declaração que responde por que o produto existe e qual problema resolve. Use este template:

```
Para adolescentes universitários
Que sofrem de saúde mental instável e falta de organização
O diário emocional 
É um aplicativo de registro de atividades e sentimentos diários
Que permite que o usuário relate suas atividades, sono e emoções
Diferente do Diário e Saúde da Apple
Nosso produto tem a conquista de pontuação diária, semelhante a streak do duolingo e controle de atividades

```

---

## Definição do MVP

O MVP é o escopo mínimo que entrega valor. Declare explicitamente o que fica **fora** — é isso que protege a equipe de estourar o prazo.

**Exemplo, para o Vistoria:**

| No MVP | Fora do MVP |
|---|---|
| Relato do dia (texto livre) | Fotos, GPS com o relato |
| Avaliação dos sentimentos do dia (escala simples, ex.: 1–5 + emoção principal) | Aspectos da vida relacionados |
| Registro de Pensamento Disfuncional (RPD) para momentos de crise (formulário guiado) | Compartilhar com o psicologo |
| Marcação de pontuação diária | Gamificação avançada (loja, ranking entre usuários, recompensas complexas) |
| Registro de higiene do sono (horas dormidas + uso de celular antes de dormir) | Múltiplos perfis e permissões |
| Preenchimento de cronograma semanal de atividades obrigatórias | Integração com wearables (smartwatch) |

Enuncie também a hipótese de valor: *acreditamos que [usuários] vão [comportamento] porque [benefício]*.

---

## Backlog inicial (priorizado)

| Prio | História | Critérios de aceitação | Entrega prevista |
|---|---|---|---|
| P1 | Como usuário, quero fazer um relato do dia para registrar como foi minha rotina | Campo de texto livre; data automática; registro salvo localmente | 1 |
| P1 | Como usuário, quero avaliar os sentimentos do dia para acompanhar meu estado emocional | Seleciona emoção principal + intensidade; salva junto da data | 1 |
| P1 | Como usuário, quero registrar pensamentos disfuncionais em crises para organizar minhas ideias | Formulário com situação, pensamento automático, emoção, resposta alternativa; salva histórico | 2 |
| P1 | Como usuário, quero preencher meu cronograma semanal para me organizar com atividades obrigatórias | Cadastro de atividade com dia/horário; lista semanal visível | 1 |
| P1 | Como usuário, quero receber lembretes das atividades para não esquecer compromissos | Notificação local no horário definido; opção de ativar/desativar lembrete | 2 |
| P1 | Como usuário, quero marcar pontuação diária por uso para manter constância | Ao completar check-in diário, soma 1 no streak; mantém sequência por dias consecutivos | 2 |
| P2 | Como usuário, quero registrar higiene do sono para observar hábitos noturnos | Campos de horas dormidas + “usou celular antes de dormir” (sim/não) | 2 |
| P2 | Como usuário, quero visualizar histórico diário para revisar meus registros passados | Lista por data com relato, sentimento e sono | 3 |
| P2 | Como usuário, quero editar ou excluir registros para corrigir informações | Ações de editar/excluir com confirmação | 3 |
| P3 | Como usuário, quero ver resumo semanal simples para perceber padrões | Exibe quantidade de check-ins, média de humor e dias com sono inadequado | final |

> P1 = essencial para o MVP, P2 = importante, P3 = desejável.

---
