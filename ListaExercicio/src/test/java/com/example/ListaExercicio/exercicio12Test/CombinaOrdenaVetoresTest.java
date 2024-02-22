package com.example.ListaExercicio.exercicio12Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio12.CombinaOrdenaVetores;

public class CombinaOrdenaVetoresTest {

    @Test
    public void testCombinarOrdenarVetores() {
        int[] vetor1 = {3, 1, 4, 1, 5};
        int[] vetor2 = {9, 2, 6, 5, 3};

        int[] resultado = CombinaOrdenaVetores.combinarOrdenarVetores(vetor1, vetor2);

        int[] esperado = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};
        assertArrayEquals(esperado, resultado);
    }

}
