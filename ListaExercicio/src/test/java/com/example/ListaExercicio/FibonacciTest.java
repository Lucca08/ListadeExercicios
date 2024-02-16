package com.example.ListaExercicio;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testCalcularFibonacciParaZero() {
        assertEquals(0, Fibonacci.calcularFibonacci(0));
    }

    @Test
    public void testCalcularFibonacciParaUm() {
        assertEquals(1, Fibonacci.calcularFibonacci(1));
    }

    @Test
    public void testCalcularFibonacciParaCinco() {
        assertEquals(5, Fibonacci.calcularFibonacci(5));
    }

    @Test
    public void testCalcularFibonacciParaDez() {
        assertEquals(55, Fibonacci.calcularFibonacci(10));
    }

    @Test
    public void testCalcularFibonacciParaVinte() {
        assertEquals(6765, Fibonacci.calcularFibonacci(20));
    }

    //test para exercicio 9
    @Test
    public void testGerarSequenciaFibonacciAteNumero() {
        assertEquals("", Fibonacci.gerarSequenciaFibonacciAteNumero(0));
        assertEquals("0", Fibonacci.gerarSequenciaFibonacciAteNumero(1));
        assertEquals("0 1 1 2 3 5 8 13 21", Fibonacci.gerarSequenciaFibonacciAteNumero(25));
    }
}