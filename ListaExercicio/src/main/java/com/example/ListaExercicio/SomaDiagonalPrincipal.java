package com.example.ListaExercicio;
import java.util.Scanner;

public class SomaDiagonalPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada: ");
        int ordem = scanner.nextInt();

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonalPrincipal = calcularSomaDiagonalPrincipal(matriz);

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
    }

    public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }
}
