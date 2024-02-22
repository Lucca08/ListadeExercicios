package com.example.ListaExercicio.exercicio16Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio16.Emprestimo;
import com.example.ListaExercicio.exercicio16.Livro;
import com.example.ListaExercicio.exercicio16.Pessoa;

public class EmprestimoTest {

    @Test
    public void testRegistrarEmprestimo() {
        Livro livro = new Livro("Harry Potter", "J.K.Rowling", true);
        Pessoa pessoa = new Pessoa("Bruno");

        Emprestimo emprestimo = new Emprestimo(pessoa, livro, LocalDate.now());

        assertEquals("Harry Potter", emprestimo.getLivro().getTitulo());
        assertEquals("Bruno", emprestimo.getPessoa().getNome());
        assertNotNull(emprestimo.getDataEmprestimo());
    }
}
