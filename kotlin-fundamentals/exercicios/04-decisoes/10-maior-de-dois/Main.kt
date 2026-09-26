/*
 * Questão 10 — Maior de dois
 *
 * Dados dois números, exiba o maior. Se forem iguais, exiba
 * "Números iguais".
 */

fun main() {
    println("Digite um numero: ")
    val num1 = readln().toFloat()
    println("Digite outro numero: ")
    val num2 = readln().toFloat()

    val resultado = if (num1 > num2) {
        "Numero: $num1 é maior que $num2"
    } else if (num1 == num2) {
        "Números iguais"
    } else {
        "Numero: $num2 é maior que $num1"
    }

    println(resultado)
}
