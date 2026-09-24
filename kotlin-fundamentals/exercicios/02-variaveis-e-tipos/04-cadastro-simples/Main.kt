/*
 * Questão 4 — Cadastro simples
 *
 * Declare um nome, uma idade, uma altura e uma informação que indique se
 * a pessoa é estudante. Exiba os quatro valores, cada um em uma linha.
 */

fun main() {
    val nome: String = "Paulo"
    val idade: Int = 25
    val altura: Float = 1.80f
    val estudante: Boolean = true

    println("Nome: $nome")
    println("Idade: $idade")
    println(String.format("Altura: %.2f", altura))
    println("É estudante?: $estudante")
}
