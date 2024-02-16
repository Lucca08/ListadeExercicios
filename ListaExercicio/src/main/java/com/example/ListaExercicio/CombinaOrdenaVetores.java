package com.example.ListaExercicio;
import java.util.Arrays;

public class CombinaOrdenaVetores {

    public static int[] combinarOrdenarVetores(int[] vetor1, int[] vetor2) {
        // Ordenando os vetores
        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        // Combinando os dois vetores
        int[] vetorCombinado = combinarVetores(vetor1, vetor2);

        // Ordenando o vetor combinado
        Arrays.sort(vetorCombinado);

        return vetorCombinado;
    }

    // Método para combinar dois vetores
    private static int[] combinarVetores(int[] vetor1, int[] vetor2) {
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorCombinado = new int[tamanhoTotal];

        System.arraycopy(vetor1, 0, vetorCombinado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorCombinado, vetor1.length, vetor2.length);

        return vetorCombinado;
    }
}
