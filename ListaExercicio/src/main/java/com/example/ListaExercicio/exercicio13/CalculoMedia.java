package com.example.ListaExercicio.exercicio13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculoMedia {
    private static final Logger logger = LoggerFactory.getLogger(CalculoMedia.class);

    public static void main(String[] args) {
        double[] notas = {8.0, 7.5, 9.0, 6.5};
        double media = calcularMedia(notas);
        String status = verificarStatus(media);
        logger.info("A média das notas é: {}", media);
        logger.info("Status: {}", status);
    }

    public static double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static String verificarStatus(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }
}
