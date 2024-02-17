package com.example.ListaExercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


public class ControleEmprestimoTest {

    @Test
    public void testDevolucaoLivro() {
        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", true);
        Pessoa pessoa = new Pessoa("Maria");
        Emprestimo emprestimo = new Emprestimo(pessoa, livro, LocalDate.now());
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testEmprestimoLivroIndisponivel() {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", false);
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }


    @Test
    public void testConstrutoresLivro() {
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", true);
        Livro livro2 = new Livro("1984", "George Orwell", false);

        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testConstrutorPessoa() {
        Pessoa pessoa = new Pessoa("Maria");
        assertEquals("Maria", pessoa.getNome());
    }
}
