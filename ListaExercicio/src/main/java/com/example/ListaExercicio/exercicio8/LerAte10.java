package com.example.ListaExercicio.exercicio8;

import java.util.Scanner;
import java.util.logging.Logger;

public class LerAte10 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LerAte10.class.getName());

        try (Scanner scanner = new Scanner(System.in)) {
            int numero = 0;
            int soma = 0;
            int contador = 0;

            while (contador < 10) {
                logger.info("Digite um numero: ");
                numero = scanner.nextInt();
                soma += numero;
                contador++;
            }

            logger.info("A soma dos numeros digitados e: " + soma);
        }
    }
}
