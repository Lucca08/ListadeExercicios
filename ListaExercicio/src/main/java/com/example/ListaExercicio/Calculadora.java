package com.example.ListaExercicio;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("1. Soma");
        System.out.println("2. Subtraçao");
        System.out.println("3. Multiplicaçao");
        System.out.println("4. Divisao");

        System.out.print("Escolha a operaçao (1-4): ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        String resultado = calcular(escolha, num1, num2);

        System.out.println("Resultado: " + resultado);
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
