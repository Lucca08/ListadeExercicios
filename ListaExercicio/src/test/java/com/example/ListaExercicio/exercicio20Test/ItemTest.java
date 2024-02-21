package com.example.ListaExercicio.exercicio20Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Item;
import com.example.ListaExercicio.exercicio20.Produto;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Produto produto;
    private Item item;

    @BeforeEach
    void setUp() {
        produto = new Produto(1, "Produto", 10.0, 20);
        item = new Item(produto, 2);
    }

    @Test
    void testDefineValorTotal() {
        assertEquals(20.0, item.getValorDoItem());
    }

    @Test
    void testSetProduto() {
        Produto novoProduto = new Produto(2, "Novo Produto", 15.0, 30);
        item.setProduto(novoProduto);

        assertEquals(novoProduto, item.getProduto());
    }

    @Test
    void testSetQuantidade() {
        item.setQuantidade(3);

        assertEquals(3, item.getQuantidade());
    }

    @Test
    void testSetValorDoItem() {
        item.setValorDoItem(25.0);

        assertEquals(25.0, item.getValorDoItem());
    }
}
