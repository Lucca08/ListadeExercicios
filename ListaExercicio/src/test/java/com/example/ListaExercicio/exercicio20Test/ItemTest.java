package com.example.ListaExercicio.exercicio20Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Item;
import com.example.ListaExercicio.exercicio20.Produto;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Item item;  

    @BeforeEach
    void setUp() {
        Produto produto = new Produto(1, "Produto", 10.0, 2);
        item = new Item(produto, 2);
    }

    @Test
    void testDefineValorTotal() {
        assertEquals(20.0, item.getValorDoItem());
    }
}
