/*
 * Questão 20 — Número ou mensagem
 *
 * Leia uma linha de texto. Se ela representar um número inteiro válido,
 * exiba seu dobro; caso contrário, exiba "Entrada inválida".
 */

fun main() {
    val entrada = readln()
    val numero = entrada.toIntOrNull()

    if (numero != null) {
        println(numero * 2)
    } else {
        println("Entrada inválida")
    }
}
