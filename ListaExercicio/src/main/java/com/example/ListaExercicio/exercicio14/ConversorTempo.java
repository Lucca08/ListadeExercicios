package com.example.ListaExercicio.exercicio14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class ConversorTempo {
    private static final Logger logger = LoggerFactory.getLogger(ConversorTempo.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoSegundos = lerTempo(scanner);
        int horas = obterHoras(tempoSegundos);
        int minutos = obterMinutos(tempoSegundos);
        int segundos = obterSegundos(tempoSegundos);

        exibirResultado(horas, minutos, segundos);
    }

    public static int lerTempo(Scanner scanner) {
        logger.info("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    public static int obterHoras(int tempoSegundos) {
        return tempoSegundos / 3600;
    }

    public static int obterMinutos(int tempoSegundos) {
        return (tempoSegundos % 3600) / 60;
    }

    public static int obterSegundos(int tempoSegundos) {
        return tempoSegundos % 60;
    }

    public static void exibirResultado(int horas, int minutos, int segundos) {
        logger.info("O tempo e: {}h {}min {}s", horas, minutos, segundos);
    }

    public static String escritaTempoFormatado(int horas, int minutos, int segundos) {
        return horas + "h" + minutos + "min" + segundos + "seg";
    }
}
