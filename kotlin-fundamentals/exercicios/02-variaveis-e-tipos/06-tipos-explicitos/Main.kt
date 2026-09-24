/*
 * Questão 6 — Tipos explícitos
 *
 * Armazene os valores 42, 3.5, 'K', true e "Kotlin" em variáveis com os
 * tipos declarados explicitamente. Exiba cada valor em uma linha.
 */

fun main() {
    val inteiro: Int = 42
    val float: Float = 3.5f
    val char: Char = 'K'
    val boolean: Boolean = true
    val string: String = "Kotlin"

    println("Inteiro: $inteiro")
    println(String.format("Float: %.2f", float))
    println("Char: $char")
    println("Boolean: $boolean")
    println("String: $string")
}
