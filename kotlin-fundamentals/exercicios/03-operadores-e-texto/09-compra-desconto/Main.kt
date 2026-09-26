/*
 * Questão 9 — Compra com desconto
 *
 * Dados o preço de um produto e um percentual de desconto, calcule o valor
 * descontado e o preço final. Exiba os resultados em frases que incluam os
 * valores recebidos.
 */

fun main() {
    println("Digite o valor de um produto")
    val precoProduto = readln().toFloat()
    println("Digite o percentual de desconto")
    val percentualDesconto = readln().toFloat()

    val valorDescontado = precoProduto * (percentualDesconto / 100.0f)
    val valorFinal = precoProduto - valorDescontado

    println("O valor do produto: $precoProduto\n")
    println("Percentual de desconto: $percentualDesconto\n")
    println("Valor do desconto: $valorDescontado\n")
    println("Valor final: $valorFinal\n")
}
