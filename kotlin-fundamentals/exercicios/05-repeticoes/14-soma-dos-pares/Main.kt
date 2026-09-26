/*
 * Questão 14 — Soma dos pares
 *
 * Dado um inteiro positivo N, calcule e exiba a soma de todos os números
 * pares entre 1 e N, inclusive.
 */

fun main() {
    println("Digite um numero inteiro positivo: ")
    val N = readln().toInt()

    var soma = 0

    for (i in 1..N) {
        if (i % 2 == 0) {
            soma += i
        }
    }

    println("A soma de todos os pares desse intervalo é de: $soma")
}
