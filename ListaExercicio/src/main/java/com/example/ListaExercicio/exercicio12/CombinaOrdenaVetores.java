package com.example.ListaExercicio.exercicio12;
import java.util.Arrays;

public class CombinaOrdenaVetores {

    public static int[] combinarOrdenarVetores(int[] vetor1, int[] vetor2) {

        ordenarVetor(vetor1);
        Arrays.sort(vetor2);

        int[] vetorCombinado = combinarVetores(vetor1, vetor2);

        Arrays.sort(vetorCombinado);

        return vetorCombinado;
    }

    private static int[] combinarVetores(int[] vetor1, int[] vetor2) {
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorCombinado = new int[tamanhoTotal];

        System.arraycopy(vetor1, 0, vetorCombinado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorCombinado, vetor1.length, vetor2.length);

        return vetorCombinado;
    }

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
}
