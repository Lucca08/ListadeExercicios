package com.example.ListaExercicio;
import java.util.Scanner;

public class VerificarIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        imprimirMensagemIdade(idade);
    }

    public static void imprimirMensagemIdade(int idade) {
        if (verificarMaioridade(idade)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }
    }

    public static boolean verificarMaioridade(int idade) {
        return idade >= 18;
    }
}
