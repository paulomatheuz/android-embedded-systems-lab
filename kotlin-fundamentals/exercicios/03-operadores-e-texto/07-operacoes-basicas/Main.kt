/*
 * Questão 7 — Operações básicas
 *
 * Dados dois números inteiros, exiba a soma, a subtração, a multiplicação
 * e o resto da divisão do primeiro pelo segundo. Considere que o segundo
 * número é diferente de zero.
 */

fun main() {
    println("Digite um numero inteiro: ")
    val num1 = readln().toInt()
    println("Digite outro numero inteiro: ")
    val num2 = readln().toInt()

    val soma = num1 + num2
    val subtracao = num1 - num2
    val multiplicacao = num1 * num2

    println("Soma: $soma")
    println("Subtracao: $subtracao")
    println("multiplicacao: $multiplicacao")

    if (num2 != 0) {
        val restoDivisao = num1 % num2
        println("Resto da divisao: $restoDivisao")
    } else {
        println("Divisão por 0!")
    }
}
