package com.example.ListaExercicio.exercicio4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Calculadora {
    private static final Logger logger = LoggerFactory.getLogger(Calculadora.class);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Calculadora Simples");
            logger.info("1. Soma");
            logger.info("2. Subtração");
            logger.info("3. Multiplicação");
            logger.info("4. Divisão");

            logger.info("Escolha a operação (1-4): ");
            int escolha = scanner.nextInt();

            logger.info("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            logger.info("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            String resultado = calcular(escolha, num1, num2);

            logger.info("Resultado: {}", resultado);
        }
    }

    public static String calcular(int escolha, double num1, double num2) {
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    return "Não é possível dividir por zero.";
                }
                break;
            default:
                return "Escolha inválida.";
        }

        return Double.toString(resultado);
    }
}
