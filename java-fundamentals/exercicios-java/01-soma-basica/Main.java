/*
Enunciado:
Leia dois números inteiros, chamados A e B, calcule a soma e guarde o resultado em X.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1001
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num1 = sc.nextInt();
    System.out.println("Digite o segundo numero: ");
    int num2 = sc.nextInt();

    int x = num1 + num2;
    System.out.println("A soma dos numeros e de: "+ x);
    }
}
