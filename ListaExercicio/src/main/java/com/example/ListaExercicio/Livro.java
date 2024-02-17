package com.example.ListaExercicio;

public class Livro {
    String titulo;
    String autor;
    boolean disponivel;


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
        }else {
            System.out.println("Livro indisponível");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        }else {
            System.out.println("Livro já disponível");
        }
    }
}