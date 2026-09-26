/*
 * Questão 18 — Área do retângulo
 *
 * Crie uma função que receba a largura e a altura de um retângulo e retorne
 * sua área. Use a função para calcular e exibir a área de um retângulo
 * informado.
 */

fun areaRetangulo(x: Float, y: Float): Float {
    return x * y
}

fun main() {
    println("Digite a largura de um retangulo: ")
    val largura = readln().toFloat()
    println("Digite a altura de um retangulo: ")
    val altura = readln().toFloat()

    val area = areaRetangulo(largura, altura)

    println("A area do retangulo é de: $area")
}
