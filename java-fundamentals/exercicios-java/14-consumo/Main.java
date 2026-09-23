/*
Enunciado:
Leia a distância total percorrida por um automóvel, em quilômetros, e a quantidade total de combustível gasta, em litros. Calcule o consumo médio em quilômetros por litro.

Problema oficial: https://judge.beecrowd.com/pt/problems/view/1014
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em quilômetros: ");
        int distancia = sc.nextInt();

        System.out.println("Digite a quantidade de combustível gasta em litros: ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distancia / combustivelGasto;

        System.out.printf("Consumo médio: %.3f km/l%n", consumoMedio);

        sc.close();
    }
}
