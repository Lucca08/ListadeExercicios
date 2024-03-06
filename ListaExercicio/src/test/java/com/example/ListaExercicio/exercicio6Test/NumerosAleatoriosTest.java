package com.example.ListaExercicio.exercicio6Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio6.NumerosAleatorios;

public class NumerosAleatoriosTest {
    @Test
    public void testGerarNumerosAleatorios() {
        NumerosAleatorios numerosAleatorios = new NumerosAleatorios();
        int[] numeros = numerosAleatorios.gerarNumerosAleatorios(10, 0, 100);

        assertEquals(10, numeros.length);

        for (int numero : numeros) {
            assertTrue(numero >= 0 && numero <= 100);
        }
    }

    @Test
    public void testExibirNumeros() {
        NumerosAleatorios numerosAleatorios = new NumerosAleatorios();
        int[] numeros = {15, 28, 45, 73, 60, 92, 7, 36, 84, 2};
        String resultado = numerosAleatorios.exibirNumeros(numeros);

        assertEquals("Numeros aleatorios: 15 28 45 73 60 92 7 36 84 2 ", resultado);
    }

    @Test
    public void testIdentificarMenorEMaior() {
        NumerosAleatorios numerosAleatorios = new NumerosAleatorios();
        int[] numeros = {15, 28, 45, 73, 60, 92, 7, 36, 84, 2};
        int menorNumero = numerosAleatorios.identificarMenorNumero(numeros);
        int maiorNumero = numerosAleatorios.identificarMaiorNumero(numeros);

        assertEquals(2, menorNumero);
        assertEquals(92, maiorNumero);
    }
}
