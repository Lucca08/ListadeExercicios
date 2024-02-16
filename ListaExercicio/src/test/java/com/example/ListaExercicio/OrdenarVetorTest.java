package com.example.ListaExercicio;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class OrdenarVetorTest {

    @Test
    public void testOrdenarVetor() {
        int[] vetor1 = {5, 2, 8, 1, 6, 3, 7, 4};
        int[] esperado1 = {1, 2, 3, 4, 5, 6, 7, 8};
        OrdenarVetor.ordenarVetor(vetor1);
        assertArrayEquals(esperado1, vetor1);

        int[] vetor2 = {10, 5, 8, 2, 1, 7, 4, 3, 9, 6};
        int[] esperado2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        OrdenarVetor.ordenarVetor(vetor2);
        assertArrayEquals(esperado2, vetor2);

    }

    @Test
    public void testOrdenarVetorVazio() {
        int[] vetor = {};
        int[] esperado = {};
        OrdenarVetor.ordenarVetor(vetor);
        assertArrayEquals(esperado, vetor);
    }

    @Test
    public void testVetorComElementosNegativos() {
        int[] vetor = {5, -2, 8, -1, 6, 3, 7, 4};
        int[] esperado = {-2, -1, 3, 4, 5, 6, 7, 8};
        OrdenarVetor.ordenarVetor(vetor);
        assertArrayEquals(esperado, vetor);
    }
}
