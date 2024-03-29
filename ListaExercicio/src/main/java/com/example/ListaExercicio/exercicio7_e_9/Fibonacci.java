package com.example.ListaExercicio.exercicio7_e_9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Fibonacci {
    private static final Logger logger = LoggerFactory.getLogger(Fibonacci.class);

    public static void main(String[] args) {
            
            try(Scanner scanner = new Scanner(System.in)) {
            logger.info("Digite um numero: ");
            int numero = scanner.nextInt();

            String sequenciaFibonacci = gerarSequenciaFibonacciAteNumero(numero);

            logger.info("Sequencia de Fibonaci ate {}: {}", numero, sequenciaFibonacci);
        }
    }

    public static String gerarSequenciaFibonacciAteNumero(int numero) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; calcularFibonacci(i) < numero; i++) {
            resultado.append(calcularFibonacci(i)).append(" ");
        }

        return resultado.toString().trim();
    }

    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibAtual = 1;
            int fibAnterior = 0;

            for (int i = 2; i <= n; i++) {
                int temp = fibAtual;
                fibAtual = fibAtual + fibAnterior;
                fibAnterior = temp;
            }

            return fibAtual;
        }
    }
}
