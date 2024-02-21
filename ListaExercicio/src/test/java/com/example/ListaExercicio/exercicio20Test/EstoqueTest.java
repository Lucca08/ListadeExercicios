package com.example.ListaExercicio.exercicio20Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Produto;
import com.example.ListaExercicio.exercicio20.Estoque;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    private Estoque estoque;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
    }

    @Test
    void testCadastrarProduto() {
        Produto produto = new Produto(1, "ProdutoTeste", 10.0, 20);

        assertTrue(estoque.cadastrarProduto(produto));
        assertEquals(produto, estoque.encontrarProduto(1));
        assertEquals(produto, estoque.encontrarProduto("ProdutoTeste"));
    }

    @Test
    void testCadastrarProdutoDuplicado() {
        Produto produto1 = new Produto(1, "ProdutoDuplicado", 10.0, 20);
        Produto produto2 = new Produto(1, "ProdutoDuplicado", 15.0, 25);

        assertTrue(estoque.cadastrarProduto(produto1));
        assertFalse(estoque.cadastrarProduto(produto2)); 
    }

    @Test
    void testDarBaixaEmEstoque() {
        Produto produto = new Produto(1, "ProdutoDarBaixa", 10.0, 20);

        assertTrue(estoque.cadastrarProduto(produto));

        assertTrue(estoque.darBaixaEmEstoque("ProdutoDarBaixa", 5));
        assertEquals(15, estoque.getQuantidadeAtualEmEstoque(produto));
    }

    @Test
    void testDarBaixaEmEstoqueProdutoInexistente() {
        assertFalse(estoque.darBaixaEmEstoque("ProdutoInexistente", 5));
    }

    @Test
    void testTemEstoqueOuNao() {
        Produto produto = new Produto(1, "ProdutoEstoque", 10.0, 20);

        assertTrue(estoque.cadastrarProduto(produto));

        assertTrue(estoque.temEstoqueOuNao(produto, 10));
        assertFalse(estoque.temEstoqueOuNao(produto, 25));
    }
}

