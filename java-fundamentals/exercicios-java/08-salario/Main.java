/*
Enunciado:
Leia o número de identificação de um funcionário, a quantidade de horas trabalhadas e o valor recebido por hora. Calcule o salário total.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1008
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o identificador de um funcionario: ");
        int identificacao = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        float qtdHorasTrabalhadas = sc.nextFloat();

        System.out.println("Digite o valor recebido por hora: ");
        float valorHoraRecebido = sc.nextFloat();

        float salarioTotal = qtdHorasTrabalhadas * valorHoraRecebido;

        System.out.printf("O funcionario de identificacao %d, receberá o total de: %.2f", identificacao, salarioTotal);

        sc.close();
    }
}
