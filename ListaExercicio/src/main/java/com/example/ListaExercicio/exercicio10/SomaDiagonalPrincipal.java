package com.example.ListaExercicio.exercicio10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class SomaDiagonalPrincipal {
    private static final Logger logger = LoggerFactory.getLogger(SomaDiagonalPrincipal.class);

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

        logger.info("Digite a ordem da matriz quadrada: ");
        int ordem = scanner.nextInt();

        int[][] matriz = new int[ordem][ordem];

        logger.info("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                logger.info("Elemento [{}][{}]: ", (i + 1), (j + 1));
                matriz[i][j] = scanner.nextInt();
            }
        }


        int somaDiagonalPrincipal = calcularSomaDiagonalPrincipal(matriz);
    
        logger.info("A soma dos elementos da diagonal principal e: {}", somaDiagonalPrincipal);
    
    }
    }

    public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }
}
