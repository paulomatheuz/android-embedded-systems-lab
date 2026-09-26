/*
 * Questão 17 — Maior de três
 *
 * Crie uma função que receba três números inteiros e retorne o maior deles.
 * Exiba o valor retornado.
 */

// Sei que existe a função maxOf

fun maior(x: Int, y: Int, z: Int): Int {
    val maior = if (x >= y && x >= z) {
        x
    } else if (y >= x && y >= z) {
        y
    } else {
        z
    }
    return maior
}

fun main() {
    println("Digite o primeiro numero: ")
    val a = readln().toInt()
    println("Digite o segundo numero: ")
    val b = readln().toInt()
    println("Digite o terceiro numero: ")
    val c = readln().toInt()

    val resultado = maior(a, b, c)

    println("O maior é: $resultado")
}
