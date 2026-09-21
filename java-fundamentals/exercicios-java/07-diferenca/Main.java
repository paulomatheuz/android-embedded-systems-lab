/*
Enunciado:
Leia quatro números inteiros, A, B, C e D, e calcule:

DIFERENCA = (A × B) - (C × D)

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1007
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero para A:");
        int a = sc.nextInt();

        System.out.println("Digite um numero para B:");
        int b = sc.nextInt();

        System.out.println("Digite um numero para C:");
        int c = sc.nextInt();

        System.out.println("Digite um numero para D:");
        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("A diferenca é de: " + diferenca);

        sc.close();
    }
}
