package com.example.ListaExercicio.exercicio16;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;

public class ControleEmprestimo {
    private static final Logger logger = LoggerFactory.getLogger(ControleEmprestimo.class);

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", true);
        Pessoa pessoa1 = new Pessoa("Joao");

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, LocalDate.now());

        logger.info("Empréstimo realizado:");
        logger.info("Livro: " + emprestimo1.getLivro().getTitulo());
        logger.info("Pessoa: " + emprestimo1.getPessoa().getNome());
        logger.info("Data do empréstimo: " + emprestimo1.getDataEmprestimo());

        livro1.devolver();

        logger.info("Livro devolvido. Disponível para novo empréstimo: " + livro1.isDisponivel());
    }
}


