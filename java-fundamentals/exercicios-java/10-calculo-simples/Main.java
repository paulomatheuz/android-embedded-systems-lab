/*
Enunciado:
Leia os dados de duas peças. Para cada peça serão informados o código, a quantidade comprada e o preço por unidade. Calcule o valor total da compra considerando as duas peças.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1010
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1: ");
        int cod1 = sc.nextInt();
        System.out.println("Digite a quantidade da peça 1: ");
        int qtdPeca1 = sc.nextInt();
        System.out.println("Digite o preco por unidade da peça 1: ");
        float precoPeca1 = sc.nextFloat();

        System.out.println("Digite o codigo da peça 2: ");
        int cod2 = sc.nextInt();
        System.out.println("Digite a quantidade da peça 2: ");
        int qtdPeca2 = sc.nextInt();
        System.out.println("Digite o preco por unidade da peça 2: ");
        float precoPeca2 = sc.nextFloat();

        float valorTotal = (qtdPeca1 * precoPeca1) + (qtdPeca2 * precoPeca2);

        System.out.printf("Valor total da compra: %.2f%n", valorTotal);

        sc.close();
    }
}
