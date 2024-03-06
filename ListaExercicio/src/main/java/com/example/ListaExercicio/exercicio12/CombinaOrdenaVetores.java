package com.example.ListaExercicio.exercicio12;
import java.util.Arrays;

import com.example.ListaExercicio.exercicio11.OrdenarVetor;

public class CombinaOrdenaVetores {

    public static int[] combinarOrdenarVetores(int[] vetor1, int[] vetor2) {

        int[] vetorCombinado = combinarVetores(vetor1, vetor2);
        OrdenarVetor.ordenarVetor(vetorCombinado);
        return vetorCombinado;
        
    }

    private static int[] combinarVetores(int[] vetor1, int[] vetor2) {
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorCombinado = new int[tamanhoTotal];

        System.arraycopy(vetor1, 0, vetorCombinado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorCombinado, vetor1.length, vetor2.length);

        return vetorCombinado;
    }

}
