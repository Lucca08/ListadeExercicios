package com.example.ListaExercicio.exercicio4Test;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio4.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        assertEquals("5.0", Calculadora.calcular(1, 2, 3));
    }

    @Test
    public void testSubtracao() {
        assertEquals("-1.0", Calculadora.calcular(2, 2, 3));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals("6.0", Calculadora.calcular(3, 2, 3));
    }

    @Test
    public void testDivisao() {
        assertEquals("0.6666666666666666", Calculadora.calcular(4, 2, 3));
    }

    @Test
    public void testDivisaoPorZero() {
        assertEquals("Nao e possivel dividir por zero", Calculadora.calcular(4, 2, 0));
    }

    @Test
    public void testEscolhaInvalida() {
        assertEquals("Escolha invalida", Calculadora.calcular(5, 2, 3));
    }
}
