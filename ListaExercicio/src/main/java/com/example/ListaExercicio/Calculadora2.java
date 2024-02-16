package com.example.ListaExercicio;
public class Calculadora2 {

    private static final String DIVISAO_POR_ZERO = "Não é possível dividir por zero.";

    public static Object calcular(int escolha, double num1, double num2) {
        Object resultado = 0;
    
        switch (escolha) {
            case 1:
                resultado = somar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                return "Escolha inválida.";
        }
    
        return resultado;
    }
    

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static Object dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return DIVISAO_POR_ZERO;
        }
    }
    
}
