/*
Enunciado:
Leia o raio R de um círculo e calcule sua área usando:

area = π × R²

Neste exercício, considere π = 3.14159.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1002
*/
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o raio de um circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.printf(Locale.US, "A area do circulo e de: %.4f%n", area);
    }
}
