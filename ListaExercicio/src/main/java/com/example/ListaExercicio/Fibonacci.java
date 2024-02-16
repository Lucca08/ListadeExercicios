package com.example.ListaExercicio;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número nao negativo para calcular a série de Fibonacci: ");
        int numero = scanner.nextInt();

        System.out.println("Série de Fibonacci até o número " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            System.out.print(calcularFibonacci(i) + " ");
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
