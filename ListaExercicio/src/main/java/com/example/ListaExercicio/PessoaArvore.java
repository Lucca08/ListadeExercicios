package com.example.ListaExercicio;

public class PessoaArvore {
    private String nome;
    private int idade;
    private PessoaArvore pai;
    private PessoaArvore mae;

    public PessoaArvore(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaArvore(String nome, int idade, PessoaArvore pai, PessoaArvore mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public PessoaArvore getPai() {
        return pai;
    }

    public PessoaArvore getMae() {
        return mae;
    }

    public void setPai(PessoaArvore pai) {
        this.pai = pai;
    }

    public void setMae(PessoaArvore mae) {
        this.mae = mae;
    }
}
