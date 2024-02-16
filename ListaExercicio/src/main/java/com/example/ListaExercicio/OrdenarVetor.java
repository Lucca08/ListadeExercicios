package com.example.ListaExercicio;

import java.util.Arrays;

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
        int[] vetor = {5, 2, 8, 1, 6, 3, 7, 4};
        ordenarVetor(vetor);

        System.out.println(Arrays.toString(vetor));
    }
}
