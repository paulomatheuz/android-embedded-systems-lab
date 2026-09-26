/*
 * Questão 12 — Dia da semana
 *
 * Dado um número de 1 a 7, exiba o dia correspondente, considerando 1 como
 * segunda-feira e 7 como domingo. Para qualquer outro número, exiba
 * "Dia inválido".
 */

fun main() {
    println("Digite um numero entre 1 e 7: ")
    val dia = readln().toInt()

    when (dia) {
        1 -> println("Segunda-feira")
        2 -> println("Terça-feira")
        3 -> println("Quarta-feira")
        4 -> println("Quinta-feira")
        5 -> println("Sexta-feira")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Dia inválido")
    }
}
