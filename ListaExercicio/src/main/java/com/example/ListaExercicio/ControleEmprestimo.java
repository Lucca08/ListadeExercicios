package com.example.ListaExercicio;

import java.time.LocalDate;

public class ControleEmprestimo {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", true);
        Pessoa pessoa1 = new Pessoa("Joao");

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, LocalDate.now());

        System.out.println("Empréstimo realizado:");
        System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
        System.out.println("Pessoa: " + emprestimo1.getPessoa().getNome());
        System.out.println("Data do empréstimo: " + emprestimo1.getDataEmprestimo());

        // Simulando devolução do livro
        livro1.devolver();

        System.out.println("Livro devolvido. Disponível para novo empréstimo: " + livro1.isDisponivel());
    }
}


