package com.example.ListaExercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculoMediaTest {

    @Test
    public void testCalcularMedia() {
        double[] notas1 = {7.5, 5.0, 3.5};
        assertEquals(5.333333333333333, CalculoMedia.calcularMedia(notas1), 0.0001);

        double[] notas2 = {8.0, 9.5, 7.0, 6.5};
        assertEquals(7.75, CalculoMedia.calcularMedia(notas2), 0.0001);

        double[] notasVazio = {};
        assertEquals(0.0, CalculoMedia.calcularMedia(notasVazio), 0.0001);
    }

    @Test
    public void testVerificarStatus() {
        assertEquals("Aprovado", CalculoMedia.verificarStatus(7.5));
        assertEquals("Verificação Suplementar", CalculoMedia.verificarStatus(5.0));
        assertEquals("Reprovado", CalculoMedia.verificarStatus(3.5));
        assertEquals("Aprovado", CalculoMedia.verificarStatus(8.5));
        assertEquals("Verificação Suplementar", CalculoMedia.verificarStatus(4.5));
        assertEquals("Reprovado", CalculoMedia.verificarStatus(2.0));
    }

}

