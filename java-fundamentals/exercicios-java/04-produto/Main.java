/*
Enunciado:
Leia dois valores inteiros e calcule o produto entre eles.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1004
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int A = sc.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int B = sc.nextInt();

        int produto = A * B;

        System.out.println("O produto e de: " + produto);
    }
}
