package com.example.ListaExercicio;

import java.util.Random;

public class JokenpoGame {

    public enum Opcao {
        PEDRA,
        PAPEL,
        TESOURA
    }

    public static String jogar(Opcao escolhaJogador) {
        Opcao escolhaMaquina = gerarEscolhaAleatoria();
        String resultado = calcularResultado(escolhaJogador, escolhaMaquina);
        return "Jogador escolheu " + escolhaJogador + "\nMáquina escolheu " + escolhaMaquina + "\nResultado: " + resultado;
    }

    public static Opcao gerarEscolhaAleatoria() {
        Random random = new Random();
        Opcao[] opcoes = Opcao.values();
        return opcoes[random.nextInt(opcoes.length)];
    }

    public static String calcularResultado(Opcao jogador, Opcao maquina) {
        if (jogador == maquina) {
            return "Empate";
        } else if(
        (jogador == Opcao.PEDRA && maquina == Opcao.TESOURA) || 
        (jogador == Opcao.PAPEL && maquina == Opcao.PEDRA) || 
        (jogador == Opcao.TESOURA && maquina == Opcao.PAPEL))
        {
            return "Jogador venceu";
        } else {
            return "Máquina venceu";
        }
    }
}
