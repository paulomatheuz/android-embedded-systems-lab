# O Caminho para o Eldorado

Repositório criado para registrar minha preparação para uma entrevista técnica voltada à área de Android embarcado no Instituto Eldorado.

A jornada reúne estudos direcionados e o desenvolvimento de projetos em C e Kotlin, com foco na revisão de fundamentos, na evolução da lógica de programação e na aplicação prática de conhecimentos relacionados a sistemas embarcados e desenvolvimento Android.

![Banner O Caminho para o Eldorado](./assets/banner-readme.png)

## Status

🚧 Em desenvolvimento

O repositório é atualizado progressivamente com novos exercícios, funcionalidades, testes e documentação.

## Projetos

### [Native Sensor Packet Decoder](./native-sensor-packet-decoder)

Decoder de pacotes de sensores desenvolvido em C para praticar comunicação binária, validação de dados, operações bit a bit e fundamentos aplicáveis a sistemas embarcados.

O programa interpreta um pacote de cinco bytes, valida seu marcador inicial, calcula um checksum com XOR e extrai os dados somente quando o pacote é considerado válido.

**Tecnologias e conceitos:**

- C;
- arrays de bytes;
- `uint8_t`;
- operações bit a bit;
- checksum XOR;
- validação de dados;
- testes com `assert`;
- compilação com GCC.

**Status:** primeira versão funcional concluída.

---

### [Android Motion Telemetry Diagnostics](./android-motion-telemetry-diagnostics)

Aplicação Android desenvolvida em Kotlin para acessar o acelerômetro do dispositivo e apresentar os valores dos eixos X, Y e Z, além da magnitude total da aceleração.

O projeto explora a integração com sensores do Android, o ciclo de vida da aplicação e a construção de interfaces com Jetpack Compose.

**Tecnologias e conceitos:**

- Kotlin;
- Android SDK;
- `SensorManager`;
- acelerômetro;
- Jetpack Compose;
- Material 3;
- gerenciamento de ciclo de vida;
- testes unitários com JUnit;
- Gradle.

**Status:** em desenvolvimento.

## Estudos e exercícios

### [Java Fundamentals](./java-fundamentals)

Área destinada à revisão dos fundamentos da linguagem Java por meio de exercícios de lógica de programação.

Os exercícios abordam leitura de dados, operadores, estruturas condicionais, cálculos matemáticos e formatação de resultados.

Este diretório representa uma etapa de estudo e preparação. Ele ainda não constitui um projeto completo.

**Conteúdos praticados:**

- entrada e saída de dados;
- tipos primitivos;
- operadores aritméticos;
- variáveis;
- estruturas condicionais;
- cálculos matemáticos;
- formatação de valores;
- uso da classe `Scanner`.

**Status:** estudos em andamento.

## Estrutura atual

```text
o-caminho-para-eldorado/
├── android-motion-telemetry-diagnostics/
│   ├── app/
│   ├── gradle/
│   ├── build.gradle.kts
│   ├── gradle.properties
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle.kts
├── assets/
│   └── banner-readme.png
├── java-fundamentals/
│   ├── exercicios-java/
│   └── README.md
├── native-sensor-packet-decoder/
│   ├── main.c
│   └── README.md
└── README.md
```

Cada diretório reúne o código e a documentação correspondentes à sua finalidade.

Os projetos possuem escopos próprios, enquanto a área `java-fundamentals` registra exercícios e conteúdos utilizados durante a revisão da linguagem Java.

## Tecnologias

- C;
- Java;
- Kotlin;
- Android SDK;
- Jetpack Compose;
- Gradle;
- GCC;
- Git;
- GitHub.

## Metodologia de desenvolvimento

O desenvolvimento é realizado de forma incremental. Cada projeto ou área de estudo é dividido em pequenas etapas, permitindo compreender, implementar, testar e documentar cada evolução antes de avançar.

Os commits funcionam como uma linha do tempo do aprendizado, registrando desde os primeiros exercícios e estruturas até a implementação de funcionalidades mais completas.

## Objetivo

Mais do que uma preparação para uma entrevista, esta jornada representa uma oportunidade de transformar estudo em prática, fortalecer minha base como estudante de Engenharia de Software e demonstrar minha evolução por meio de código organizado, documentação e projetos funcionais.

Este é um repositório pessoal e educacional. Seu conteúdo não representa o Instituto Eldorado e não utiliza informações internas, confidenciais ou proprietárias da instituição.

Desenvolvido por [Paulo Matheus](https://github.com/paulomatheuz).
