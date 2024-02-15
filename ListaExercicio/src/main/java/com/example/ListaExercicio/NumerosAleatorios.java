package com.example.ListaExercicio;
import java.util.Random;


public class NumerosAleatorios {

    public int[] gerarNumerosAleatorios(int quantidade, int min, int max) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = gerarNumeroAleatorio(min, max);
        }
        return numeros;
    }

    public String exibirNumeros(int[] numeros) {
        StringBuilder resultado = new StringBuilder("Números aleatórios: ");
        for (int numero : numeros) {
            resultado.append(numero).append(" ");
        }
        return resultado.toString();
    }

    public int identificarMenorNumero(int[] numeros) {
        int menorNumero = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public int identificarMaiorNumero(int[] numeros) {
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    private int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
