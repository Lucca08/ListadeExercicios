package com.example.ListaExercicio.exercicio11;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrdenarVetor {

    public static void ordenarVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(OrdenarVetor.class);

        int[] vetor = {5, 2, 8, 1, 6, 3, 7, 4};
        ordenarVetor(vetor);

        logger.info(Arrays.toString(vetor));
    }
}
