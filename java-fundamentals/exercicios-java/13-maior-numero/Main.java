/*
Enunciado:
Leia três valores inteiros e determine qual deles é o maior.

O exercício apresenta a seguinte fórmula para encontrar o maior entre dois valores:

maiorAB = (A + B + |A - B|) / 2

Use esse raciocínio para encontrar o maior entre os três números.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1013
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int a = sc.nextInt();

        System.out.println("Digite um valor para B: ");
        int b = sc.nextInt();

        System.out.println("Digite um valor para C: ");
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
