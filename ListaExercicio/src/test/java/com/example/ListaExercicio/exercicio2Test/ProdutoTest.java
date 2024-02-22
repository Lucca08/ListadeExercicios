package com.example.ListaExercicio.exercicio2Test;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio2.Produto;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    
    @Test
    public void testCalcularValorTotalSemDesconto() {
        Produto produto = new Produto("Produto 1", 10, 5);
        assertEquals(50, produto.calcularValorTotal());
    }

    @Test
    public void testCalcularValorTotalComDezPorcentoDesconto() {
        Produto produto = new Produto("Produto 1", 10, 15);
        assertEquals(135, produto.calcularValorTotal());
    }
    @Test
    public void testCalcularValorTotalComVintePorcentoDesconto() {
        Produto produto = new Produto("Produto 1", 10, 25);
        assertEquals(200, produto.calcularValorTotal());
    }
    @Test   
    public void testCalcularValorTotalComVinteCincoPorcentoDesconto() {
        Produto produto = new Produto("Produto 1", 10, 55);
        assertEquals(412.5, produto.calcularValorTotal());
    }
}
