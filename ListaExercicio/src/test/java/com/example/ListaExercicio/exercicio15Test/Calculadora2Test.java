package com.example.ListaExercicio.exercicio15Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio15.Calculadora2;

public class Calculadora2Test {

    @Test
    public void testSomar() {
        assertEquals(5.0, Calculadora2.somar(2.0, 3.0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(2.0, Calculadora2.subtrair(5.0, 3.0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15.0, Calculadora2.multiplicar(5.0, 3.0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora2.dividir(6.0, 3.0));
    }

    @Test
    public void testDividirPorZero() {
        assertEquals("Nao e possivel dividir por zero", Calculadora2.dividir(6.0, 0.0));
    }

    @Test
    public void testCalcularSoma() {
        assertEquals(5.0, Calculadora2.calcular(1, 2.0, 3.0));
    }

    @Test
    public void testCalcularSubtracao() {
        assertEquals(2.0, Calculadora2.calcular(2, 5.0, 3.0));
    }

    @Test
    public void testCalcularMultiplicacao() {
        assertEquals(15.0, Calculadora2.calcular(3, 5.0, 3.0));
    }

    @Test
    public void testCalcularDivisao() {
        assertEquals(2.0, Calculadora2.calcular(4, 6.0, 3.0));
    }

    @Test
    public void testCalcularDivisaoPorZero() {
        assertEquals("Nao e possivel dividir por zero", Calculadora2.calcular(4, 6.0, 0.0));
    }

    @Test
    public void testCalcularEscolhaInvalida() {
        assertEquals("Escolha Invalida", Calculadora2.calcular(6, 6.0, 3.0));
    }
}