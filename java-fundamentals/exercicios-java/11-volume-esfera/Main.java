/*
Enunciado:
Leia o raio R de uma esfera e calcule seu volume:

volume = (4.0 / 3.0) × π × R³

Considere π = 3.14159.

Em Java, cuide para que a divisão 4 / 3 não seja feita como uma divisão entre inteiros.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1011
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        float raio = sc.nextFloat();

        float pi = 3.14159f;
        float volume = (4.0f / 3.0f) * pi * (raio * raio * raio);

        System.out.printf("O volume da esfera é de: %.3f%n", volume);

        sc.close();
    }
}
