/**
 * Enunciado:
 * Leia três notas, A, B e C, e calcule a média ponderada usando:
 *
 * - peso 2 para A;
 * - peso 3 para B;
 * - peso 5 para C.
 *
 * As notas ficam entre 0.0 e 10.0.
 *
 * Problema oficial:
 * https://judge.beecrowd.com/pt/problems/view/1006
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota A:");
        float notaA = sc.nextFloat();

        System.out.println("Digite a nota B:");
        float notaB = sc.nextFloat();

        System.out.println("Digite a nota C:");
        float notaC = sc.nextFloat();

        if (notaA < 0.0f || notaA > 10.0f ||
            notaB < 0.0f || notaB > 10.0f ||
            notaC < 0.0f || notaC > 10.0f) {

            System.out.println("Nota inválida!");
        } else {
            float media = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10.0f;
            System.out.printf("Média = %.5f%n", media);
        }

        sc.close();
    }
}
