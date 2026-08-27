# Diario Emocional

Um sistema que desenvolve seu emocional junto com você

# Sprint Zero

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

## Definição do MVP

O MVP é o escopo mínimo que entrega valor. Declare explicitamente o que fica **fora** — é isso que protege a equipe de estourar o prazo.

**Exemplo, para o Vistoria:**

| No MVP                                                                               | Fora do MVP                                                                |
| ------------------------------------------------------------------------------------ | -------------------------------------------------------------------------- |
| Relato do dia (texto livre)                                                          | Fotos, GPS com o relato                                                    |
| Avaliação dos sentimentos do dia (escala simples, ex.: 1–5 + emoção principal)       | Aspectos da vida relacionados                                              |
| Registro de Pensamento Disfuncional (RPD) para momentos de crise (formulário guiado) | Compartilhar com o psicologo                                               |
| Marcação de pontuação diária                                                         | Gamificação avançada (loja, ranking entre usuários, recompensas complexas) |
| Registro de higiene do sono (horas dormidas + uso de celular antes de dormir)        | Múltiplos perfis e permissões                                              |
| Preenchimento de cronograma semanal de atividades obrigatórias                       | Integração com wearables (smartwatch)                                      |

Enuncie também a hipótese de valor: _acreditamos que [usuários] vão [comportamento] porque [benefício]_.

## Backlog inicial (priorizado)

| Prio | História                                                                                           | Critérios de aceitação                                                                        | Entrega prevista |
| ---- | -------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | ---------------- |
| P1   | Como usuário, quero fazer um relato do dia para registrar como foi minha rotina                    | Campo de texto livre; data automática; registro salvo localmente                              | 1                |
| P1   | Como usuário, quero avaliar os sentimentos do dia para acompanhar meu estado emocional             | Seleciona emoção principal + intensidade; salva junto da data                                 | 1                |
| P1   | Como usuário, quero preencher meu cronograma semanal para me organizar com atividades obrigatórias | Cadastro de atividade com dia/horário; lista semanal visível                                  | 1                |
| P1   | Como usuário, quero registrar pensamentos disfuncionais em crises para organizar minhas ideias     | Formulário com situação, pensamento automático, emoção, resposta alternativa; salva histórico | 2                |
| P1   | Como usuário, quero receber lembretes das atividades para não esquecer compromissos                | Notificação local no horário definido; opção de ativar/desativar lembrete                     | 2                |
| P1   | Como usuário, quero marcar pontuação diária por uso para manter constância                         | Ao completar check-in diário, soma 1 no streak; mantém sequência por dias consecutivos        | 2                |
| P2   | Como usuário, quero registrar higiene do sono para observar hábitos noturnos                       | Campos de horas dormidas + “usou celular antes de dormir” (sim/não)                           | 2                |
| P1   | Como usuário, quero editar ou excluir registros para corrigir informações                          | Ações de editar/excluir com confirmação                                                       | 3                |
| P2   | Como usuário, quero visualizar histórico diário para revisar meus registros passados               | Lista por data com relato, sentimento e sono                                                  | 3                |
| P3   | Como usuário, quero ver resumo semanal simples para perceber padrões                               | Exibe quantidade de check-ins, média de humor e dias com sono inadequado                      | 3                |

> P1 = essencial para o MVP, P2 = importante, P3 = desejável.

## Plataforma escolhida: Android

Levando em consideração o público-alvo do sistema, nesse caso, estudantes universitários, é necessário considerar o poder aquisitivo e a necessidade desses individuos, os quais geralmente se encontram em uma situação de ascensão social. De acordo com uma pesquisa realizada em 2022, pela Partyou, 56% dos entrevistados afirmaram utilizar Android, enquanto 44% deles utilizam o sistema IOS. Portanto, é possível inferir que a plataforma **Android** torna-se mais proveitosa para os usuários.
Contudo, mesmo sendo a preferível, nenhum dos componentes do grupo possível Android, sendo preciso instalar o emulador.

Segue link da pesquisa:
https://consumidormoderno.com.br/consumo-tecnologico-universitarios/

## Escolha do backend: Supabase

Desde a criação do projeto, o grupo sabia que não criaria uma API própria backend, por dificuldades de tempo para criar-lá do zero. No entanto, também não foi cogitado utilizar APIs públicas, pelo empecilho de achar um nicho tão específico de diário e também falta de conformidade com os objetivos. Portanto, dentre as opções restantes, o grupo ficou em dúvida entre utilizar o Firebase ou Supabase, contudo, no final foi escolhido o **Supabase**.

Tendo em vista as funcionalidades do usuário baseadas em preenchimento de formulários, não haverá necessidade de um banco de dados não relacional, como ocorre com o Firebase, os dados possuem atributos e relações claras entre si. Além disso, O Supabase também oferece Row Level Security (RLS), permitindo definir políticas de acesso diretamente sobre as linhas das tabelas. Dessa forma, cada usuário pode acessar somente seus próprios registros, o que é particularmente relevante para a privacidade dos dados pessoais armazenados pelo Diário Emocional.

Por fim, as consultas SQL proporcionadas pelo Supabase facilitaria a implementação do histórico e do resumo semanal, uma vez que as consultas conseguem buscar, filtrar e calcular informações a partir de vários registros.

## This is a Kotlin Multiplatform project targeting Android, Desktop (JVM).

- [/shared](./shared/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./shared/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./shared/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./shared/src/jvmMain/kotlin)
    folder is the appropriate location.

### Running the apps

Use the run configurations provided by the run widget in your IDE's toolbar. You can also use these commands and options:

- Android app: `./gradlew :androidApp:assembleDebug`
- Desktop app:
  - Hot reload: `./gradlew :desktopApp:hotRun --auto`
  - Standard run: `./gradlew :desktopApp:run`

### Running tests

Use the run button in your IDE's editor gutter, or run tests using Gradle tasks:

- Android tests: `./gradlew :shared:testAndroidHostTest`
- Desktop tests: `./gradlew :shared:jvmTest`

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
