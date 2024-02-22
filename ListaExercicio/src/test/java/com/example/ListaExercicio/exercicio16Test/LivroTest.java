package com.example.ListaExercicio.exercicio16Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio16.Livro;

public class LivroTest {

    @Test
    public void testDevolverLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R.Tolkien", true);
        assertTrue(livro.isDisponivel());
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}
