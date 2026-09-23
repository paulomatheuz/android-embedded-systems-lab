/*
Enunciado:
Leia três números de ponto flutuante, A, B e C. Em seguida, calcule:

- a área de um triângulo retângulo cuja base é A e a altura é C;
- a área de um círculo de raio C, usando π = 3.14159;
- a área de um trapézio cujas bases são A e B e cuja altura é C;
- a área de um quadrado de lado B;
- a área de um retângulo de lados A e B.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1012
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159f;

        System.out.println("Digite um valor para A: ");
        float a = sc.nextFloat();

        System.out.println("Digite um valor para B: ");
        float b = sc.nextFloat();

        System.out.println("Digite um valor para C: ");
        float c = sc.nextFloat();

        float areaTrianguloRetangulo = (a * c) / 2.0f;
        float areaCirculo = pi * (c * c);
        float areaTrapezio = ((a + b) * c) / 2.0f;
        float areaQuadrado = b * b;
        float areaRetangulo = a * b;

        System.out.printf("Área do triângulo retângulo: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("Área do círculo: %.3f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
