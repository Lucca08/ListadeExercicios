package com.example.ListaExercicio.exercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class VerificarIdade {
    private static final Logger logger = LoggerFactory.getLogger(VerificarIdade.class);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            imprimirMensagemIdade(idade);
        }
    }

    public static void imprimirMensagemIdade(int idade) {
        if (verificarMaioridade(idade)) {
            logger.info("A pessoa e maior de idade.");
        } else {
            logger.info("A pessoa e menor de idade.");
        }
    }

    public static boolean verificarMaioridade(int idade) {
        return idade >= 18;
    }
}
