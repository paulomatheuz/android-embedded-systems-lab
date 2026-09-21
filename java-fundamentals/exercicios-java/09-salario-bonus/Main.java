/*
Enunciado:
Leia o primeiro nome de um vendedor, seu salário fixo e o total vendido por ele no mês. O vendedor recebe uma comissão de 15% sobre as vendas. Calcule o valor total que ele receberá.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1009
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um vendedor: ");
        String nome = sc.nextLine();

        System.out.println("Digite o salario fixo: ");
        float salario = sc.nextFloat();

        System.out.println("Digite o total vendido por ele no mês: ");
        float totalVendido = sc.nextFloat();

        float comissao = totalVendido * 0.15f;
        float salarioTotal = salario + comissao;

        System.out.printf("%s receberá o total de: %.2f%n", nome, salarioTotal);

        sc.close();
    }
}
