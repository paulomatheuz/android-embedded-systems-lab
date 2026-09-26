/*
 * Questão 21 — Média válida
 *
 * Leia três valores decimais, um por linha. Se todos forem números válidos,
 * exiba a média aritmética; caso contrário, exiba "Entrada inválida".
 */

fun main() {
    val num1 = readln().toFloatOrNull()
    val num2 = readln().toFloatOrNull()
    val num3 = readln().toFloatOrNull()

    if (num1 != null && num2 != null && num3 != null) {
        val media = (num1 + num2 + num3) / 3.0f
        println("A média aritmética é: $media")
    } else {
        println("Entrada inválida")
    }
}
