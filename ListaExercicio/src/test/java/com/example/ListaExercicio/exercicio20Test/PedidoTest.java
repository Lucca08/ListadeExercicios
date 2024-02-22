package com.example.ListaExercicio.exercicio20Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Pedido;
import com.example.ListaExercicio.exercicio20.Produto;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PedidoTest {

    private Pedido pedido;
    private Produto produto;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        produto = new Produto(1, "Produto", 10.0, 20);
    }

    @Test
    void testAdicionarItemNaLista() {
        assertTrue(pedido.adicionarItemNaLista(produto, 2));
        assertEquals(1, pedido.itens.size());
    }

    @Test
    void testAdicionarItemNaListaQuantidadeInvalida() {
        assertFalse(pedido.adicionarItemNaLista(produto, 25));
        assertEquals(0, pedido.itens.size());
    }

    @Test
    void testCalcularValorTotal() {
        pedido.adicionarItemNaLista(produto, 2);
        pedido.calcularValorTotal();
        assertEquals(20.0, pedido.valorTotalDoPedido);
    }
   
    @Test
    void testImprimirPedido() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    
        pedido.adicionarItemNaLista(produto, 2);
        pedido.imprimirPedido();
    
        String expectedOutput = "Produto - 2 - R$ 20.0\nValor total do pedido: R$ 20.0";
        String[] expectedLines = expectedOutput.split("\n");
    
        String[] actualLines = outContent.toString().trim().split("\n");
    
        assertArrayEquals(expectedLines, actualLines);
    }
    

    @Test
    void testImprimeValorTotal() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    
        pedido.adicionarItemNaLista(produto, 2);
        pedido.imprimeValorTotal();
    
        String expectedOutput = "Valor total do pedido: R$ 20.0";
        assertTrue(outContent.toString().contains(expectedOutput));
    }
    

}
