
package com.example.ListaExercicio.exercicio16;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;


    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            Logger logger = LoggerFactory.getLogger(Livro.class);
            logger.info("Livro indisponível");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        } else {
            Logger logger = LoggerFactory.getLogger(Livro.class);
            logger.info("Livro já disponível");
        }
    }
}