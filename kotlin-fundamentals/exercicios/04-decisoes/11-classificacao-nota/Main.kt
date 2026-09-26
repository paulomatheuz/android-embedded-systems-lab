/*
 * Questão 11 — Classificação de nota
 *
 * Dada uma nota de 0 a 10, exiba "Aprovado" para notas a partir de 7,
 * "Recuperação" para notas de 5 até menos de 7 e "Reprovado" para notas
 * abaixo de 5.
 */

fun main() {
    println("Digite uma nota: ")
    val nota = readln().toFloat()

    val situacao = if (nota >= 7) {
        "Aprovado"
    } else if (nota >= 5) {
        "Recuperação"
    } else {
        "Reprovado"
    }

    println(situacao)
}
