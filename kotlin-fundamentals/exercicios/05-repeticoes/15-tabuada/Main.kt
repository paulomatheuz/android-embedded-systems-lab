/*
 * Questão 15 — Tabuada
 *
 * Dado um número inteiro N, exiba os resultados de N × 1 até N × 10,
 * um por linha.
 */

fun main() {
    println("Digite um numero inteiro: ")
    val N = readln().toInt()

    for (i in 1..10) {
        var x = N * i
        println(x)
        x++
    }
}
