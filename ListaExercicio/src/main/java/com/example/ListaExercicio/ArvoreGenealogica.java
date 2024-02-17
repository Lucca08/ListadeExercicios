package com.example.ListaExercicio;

public class ArvoreGenealogica {
    public static void main(String[] args) {
        PessoaArvore avo1 = new PessoaArvore("João", 70);
        PessoaArvore avo2 = new PessoaArvore("Maria", 68);

        PessoaArvore pai = new PessoaArvore("Carlos", 40, avo1, avo2);
        PessoaArvore mae = new PessoaArvore("Ana", 38);

        PessoaArvore filho = new PessoaArvore("Pedro", 15, pai, mae);

        pai.getPai().setMae(avo2);

        System.out.println("Árvore Genealógica:");
        System.out.println("Bisavô: " + pai.getPai().getPai().getNome());
        System.out.println("Bisavó: " + pai.getPai().getMae().getNome());
        System.out.println("Avô: " + pai.getMae().getNome());
        System.out.println("Avó: " + mae.getNome());
        System.out.println("Pai: " + pai.getNome());
        System.out.println("Mãe: " + mae.getNome());
        System.out.println("Filho: " + filho.getNome());
    }
}
