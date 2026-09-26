/*
 * Questão 8 — Conversor de temperatura
 *
 * Dada uma temperatura em Celsius, calcule seu valor em Fahrenheit usando
 * a fórmula F = C × 9 / 5 + 32 e exiba os dois valores em uma frase.
 */

fun main() {
    println("Digite uma temperatura em Celsius: ")
    val celsius = readln().toFloat()

    val fahrenheit = (celsius * (9.0f / 5.0f)) + 32

    println("Celsius: $celsius, é igual a Fahrenheit: $fahrenheit")
}
