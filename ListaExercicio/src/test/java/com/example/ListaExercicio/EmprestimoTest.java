package com.example.ListaExercicio;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

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
