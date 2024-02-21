package com.example.ListaExercicio.exercicio20Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Produto;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto(1, "Produto", 10.0, 20);
    }

    @Test
    void testGetId() {
        assertEquals(1, produto.getId());
    }

    @Test
    void testGetNome() {
        assertEquals("Produto", produto.getNome());
    }

    @Test
    void testGetPreco() {
        assertEquals(10.0, produto.getPreco());
    }

    @Test
    void testGetQuantidadeEmEstoque() {
        assertEquals(20, produto.getQuantidadeEmEstoque());
    }

    @Test
    void testSetId() {
        produto.setId(2);
        assertEquals(2, produto.getId());
    }

    @Test
    void testSetNome() {
        produto.setNome("Novo Produto");
        assertEquals("Novo Produto", produto.getNome());
    }

    @Test
    void testSetPreco() {
        produto.setPreco(15.0);
        assertEquals(15.0, produto.getPreco());
    }

    @Test
    void testSetQuantidadeEmEstoque() {
        produto.setQuantidadeEmEstoque(30);
        assertEquals(30, produto.getQuantidadeEmEstoque());
    }

}
