package com.example.ListaExercicio;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    public void testDevolverLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R.Tolkien", true);
        assertTrue(livro.isDisponivel());
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}
