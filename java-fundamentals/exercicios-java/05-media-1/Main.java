/*
Enunciado:
Leia duas notas, A e B, e calcule a média ponderada. Use peso 3.5 para A e peso 7.5 para B. A soma dos pesos é 11.

As notas ficam entre 0.0 e 10.0.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1005
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota A: ");
        float notaA = sc.nextFloat();

        System.out.println("Digite a nota B: ");
        float notaB = sc.nextFloat();

        float media = (notaA * 3.5f) + (notaB * 7.5f) / 11.0f;
        
        System.out.printf("Media = %.5f%n", media);

        sc.close();
    
    }
}
