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
}
