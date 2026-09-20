/*
Enunciado:
Leia dois valores inteiros, A e B, e calcule a soma entre eles.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1003
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        int B = sc.nextInt();

        int soma = A + B;

        System.out.println("A soma e de: " + soma);

    }
}
