package com.example.ListaExercicio;
import java.util.Scanner;

public class LerAte10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite números até que você digite 10:");

        do {
            System.out.print("Digite um número: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); 
            }

            numero = scanner.nextInt();

            if (numero != 10) {
                System.out.println("Você digitou: " + numero);
            }

        } while (numero != 10);

        System.out.println("Você digitou 10. Fim do programa.");
    }
}
