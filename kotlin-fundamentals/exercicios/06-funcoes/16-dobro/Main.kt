/*
 * Questão 16 — Dobro
 *
 * Crie uma função que receba um número inteiro e retorne seu dobro.
 * Leia um número, chame a função e exiba o resultado.
 */

fun dobro(x: Int): Int {
    return x * 2
}

fun main() {
    println("Digite um numero inteiro: ")
    val num = readln().toInt()

    val resultado = dobro(num)

    println("O dobro de $num é: $resultado")
}
