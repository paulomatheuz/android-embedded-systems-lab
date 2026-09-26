/*
 * Questão 13 — Contagem progressiva
 *
 * Dado um inteiro positivo N, exiba todos os números de 1 até N,
 * um por linha.
 */

fun main() {
    println("Digite um numero inteiro positivo: ")
    val N = readln().toInt()

    var x = 1
    while (x <= N) {
        println(x)
        x++
    }
}
