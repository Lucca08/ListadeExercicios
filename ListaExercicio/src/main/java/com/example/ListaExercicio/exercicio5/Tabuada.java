package com.example.ListaExercicio.exercicio5;

import java.util.Scanner;
import java.util.logging.Logger;

public class Tabuada {

    public static void main(String[] args) {
            Logger logger = Logger.getLogger(Tabuada.class.getName());
            try(Scanner scanner = new Scanner(System.in)){

            logger.info("Digite o número para a tabuada: ");
            
            int numero = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                logger.info("Tabuada do " + numero + ":");
                for (int j = 1; j <= 10; j++) {
                    int resultado = numero * j;
                    logger.info(numero + " x " + j + " = " + resultado);
                }
            }

          }
    }
}
