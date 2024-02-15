package com.example.ListaExercicio;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        if (quantidade <= 10) {
            valorTotal = preco * quantidade;
        } else if (quantidade <= 20) {
            valorTotal = (preco * quantidade) * 0.9; // 10% de desconto
        } else if (quantidade <= 50) {
            valorTotal = (preco * quantidade) * 0.8; // 20% de desconto
        } else {
            valorTotal = (preco * quantidade) * 0.75; // 25% de desconto
        }

        return valorTotal;
    }
    
 }

