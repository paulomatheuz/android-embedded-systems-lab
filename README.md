# Android Embedded Systems Lab

Laboratório de projetos e estudos práticos em Android embarcado, sensores, telemetria e processamento de dados em C, Java e Kotlin.

O repositório reúne implementações funcionais, testes automatizados e exercícios utilizados para desenvolver conhecimentos em integração com hardware, processamento de dados, ciclo de vida Android e fundamentos de programação.

## Visão geral

| Área | Conteúdo |
|---|---|
| Android embarcado | Integração com sensores e ciclo de vida |
| Telemetria | Aquisição, processamento e apresentação de dados |
| Programação nativa | Manipulação de bytes e validação de pacotes em C |
| Kotlin | Fundamentos utilizados no desenvolvimento Android |
| Java | Lógica, orientação a objetos e fundamentos da plataforma |
| Qualidade | Testes automatizados, documentação e Git |

## Projetos

### [Android Motion Telemetry Diagnostics](./android-motion-telemetry-diagnostics)

Aplicação Android desenvolvida em Kotlin e Jetpack Compose que lê o acelerômetro do dispositivo e apresenta telemetria em tempo real.

O aplicativo exibe os valores dos eixos X, Y e Z, calcula a magnitude da aceleração e compara amostras consecutivas para classificar o movimento como `Stable`, `Moving` ou `Strong motion`.

#### Funcionalidades

- detecção da disponibilidade do acelerômetro;
- leitura contínua dos eixos X, Y e Z;
- cálculo da magnitude da aceleração;
- cálculo da intensidade entre amostras consecutivas;
- classificação do movimento;
- interface reativa com Jetpack Compose;
- retenção visual de alertas fortes;
- registro e cancelamento do sensor conforme o ciclo de vida;
- testes unitários para cálculos, classificações e valores de limite;
- documentação com arquitetura, screenshots e vídeo.

#### Tecnologias

- Kotlin;
- Android SDK;
- `SensorManager`;
- `SensorEventListener`;
- Jetpack Compose;
- Material 3;
- JUnit 4;
- Gradle.

**Status:** versão funcional `v1.0.0` publicada.

[Ver documentação](./android-motion-telemetry-diagnostics/README.md)  
[Ver release v1.0.0](https://github.com/paulomatheuz/android-embedded-systems-lab/releases/tag/v1.0.0)  
[Baixar APK demonstrativo](https://github.com/paulomatheuz/android-embedded-systems-lab/releases/download/v1.0.0/motion-diagnostics-v1.0.0-debug.apk)

---

### [Native Sensor Packet Decoder](./native-sensor-packet-decoder)

Decoder de pacotes de sensores desenvolvido em C para praticar comunicação binária, validação de dados e operações bit a bit aplicáveis a sistemas embarcados.

O programa interpreta um pacote fixo de cinco bytes, valida seu marcador inicial, recalcula o checksum com XOR e extrai os dados somente quando o pacote é considerado válido.

#### Conceitos demonstrados

- arrays de bytes;
- tipos inteiros de tamanho definido;
- operações bit a bit;
- checksum XOR;
- validação de estrutura;
- separação de responsabilidades;
- testes com `assert`;
- compilação com GCC.

**Status:** primeira versão funcional concluída.

[Ver documentação](./native-sensor-packet-decoder/README.md)

## Fundamentos

### [Kotlin Fundamentals](./kotlin-fundamentals)

Coleção incremental de exercícios utilizados para desenvolver os fundamentos da linguagem Kotlin necessários para aplicações Android.

#### Conteúdos praticados

- estrutura básica de um programa;
- variáveis e tipos;
- operadores e manipulação de texto;
- estruturas condicionais;
- estruturas de repetição;
- funções;
- entrada e conversão de dados;
- coleções;
- valores anuláveis.

**Status:** estudos em andamento.

---

### [Java Fundamentals](./java-fundamentals)

Área dedicada à revisão dos fundamentos da linguagem Java por meio de exercícios de lógica e resolução de problemas.

O conteúdo reforça conceitos que também aparecem no desenvolvimento Android com Kotlin, como tipos, controle de fluxo, métodos, objetos e organização de código.

#### Conteúdos praticados

- entrada e saída de dados;
- tipos primitivos;
- variáveis;
- operadores aritméticos;
- estruturas condicionais;
- cálculos matemáticos;
- formatação de valores;
- uso da classe `Scanner`.

**Status:** estudos em andamento.

[Ver documentação](./java-fundamentals/README.md)

## Fluxos técnicos explorados

### Sensor Android

```text
Acelerômetro físico
        ↓
Driver e HAL
        ↓
Framework Android
        ↓
SensorManager
        ↓
SensorEventListener
        ↓
Processamento das amostras
        ↓
Estado observável
        ↓
Interface Compose
```

O aplicativo Android atua na camada de aplicação e utiliza as APIs públicas fornecidas pelo framework. O projeto não implementa nem afirma acesso direto ao driver ou à HAL.

### Pacote nativo

```text
Pacote de bytes
        ↓
Validação do marcador
        ↓
Cálculo do checksum
        ↓
Comparação do checksum
        ↓
Extração dos dados
        ↓
Resultado válido ou erro
```

Esse fluxo representa uma versão reduzida do processamento realizado por software que recebe dados de sensores ou controladores externos.

## Estrutura do repositório

```text
android-embedded-systems-lab/
├── android-motion-telemetry-diagnostics/
│   ├── app/
│   ├── docs/
│   ├── gradle/
│   ├── README.md
│   ├── build.gradle.kts
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle.kts
├── native-sensor-packet-decoder/
│   ├── main.c
│   └── README.md
├── kotlin-fundamentals/
│   └── exercicios/
├── java-fundamentals/
│   ├── assets/
│   ├── exercicios-java/
│   └── README.md
├── assets/
└── README.md
```

Cada diretório possui uma finalidade específica:

- `android-motion-telemetry-diagnostics`: aplicação Android funcional;
- `native-sensor-packet-decoder`: processamento nativo de pacotes em C;
- `kotlin-fundamentals`: exercícios e fundamentos de Kotlin;
- `java-fundamentals`: exercícios e fundamentos de Java;
- `assets`: recursos utilizados pela documentação principal.

## Tecnologias

- C;
- Java;
- Kotlin;
- Android SDK;
- Jetpack Compose;
- Material 3;
- Gradle;
- JUnit;
- GCC;
- Git;
- GitHub.

## Práticas de desenvolvimento

Os projetos são desenvolvidos incrementalmente. Cada evolução procura formar uma unidade pequena, compreensível e verificável.

As práticas utilizadas incluem:

- commits incrementais;
- separação de cálculos testáveis;
- testes automatizados;
- validação em dispositivo físico;
- documentação de decisões técnicas;
- tratamento explícito de limitações;
- uso consciente do ciclo de vida Android;
- releases versionadas;
- demonstrações com screenshots e vídeo.

## Como explorar o repositório

Clone o repositório:

```powershell
git clone https://github.com/paulomatheuz/android-embedded-systems-lab.git
cd android-embedded-systems-lab
```

Para abrir o aplicativo Android, carregue diretamente esta pasta no Android Studio:

```text
android-motion-telemetry-diagnostics
```

As instruções completas para executar, testar e gerar o APK estão disponíveis no [README do aplicativo](./android-motion-telemetry-diagnostics/README.md).

O projeto em C possui instruções próprias de compilação e execução no [README do decoder](./native-sensor-packet-decoder/README.md).

## Limites do escopo

Os projetos deste repositório possuem finalidade prática e educacional.

O aplicativo Android utiliza a API pública de sensores e não implementa driver, HAL ou acesso privilegiado. O decoder em C utiliza pacotes simulados e não se comunica diretamente com hardware externo.

Esses limites são documentados para que cada projeto seja apresentado de maneira tecnicamente precisa e verificável.

## Próximas evoluções

Possíveis extensões do laboratório:

- separação entre gravidade e aceleração linear;
- filtragem de sinais;
- cálculo da taxa de amostragem;
- exportação de telemetria;
- integração entre Kotlin e código nativo com JNI;
- processamento de outros sensores;
- testes instrumentados de interface;
- estudo de arquitetura Android;
- comunicação com dispositivos externos.

## Objetivo

Transformar fundamentos de programação em implementações funcionais e documentar minha evolução em Android embarcado, sensores, telemetria e processamento de dados.

A prioridade é construir projetos pequenos, tecnicamente honestos e demonstráveis, compreendendo desde a origem dos dados até seu processamento, validação e apresentação.

---

Desenvolvido por [Paulo Matheus](https://github.com/paulomatheuz).
