package com.example.ListaExercicio.exercicio5;

import java.util.logging.Logger;

public class Tabuada {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Tabuada.class.getName());

        for (int i = 1; i <= 10; i++) {
            logger.info("Tabuada do {}: ");
            for (int j = 1; j <= 10; j++) {
                logger.info("{} x {} = {}");
            }
        }
 }
}