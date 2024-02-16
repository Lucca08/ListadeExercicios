package com.example.ListaExercicio;
import java.util.Scanner;


public class ConversorTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoSegundos = lerTempo(scanner);
        int horas = obterHoras(tempoSegundos);
        int minutos = obterMinutos(tempoSegundos);
        int segundos = obterSegundos(tempoSegundos);

        exibirResultado(horas, minutos, segundos);
    }
    
    public static int lerTempo(Scanner scanner) {
        System.out.print("Digite o tempo em segundos: ");
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
        System.out.println("O tempo é: " + horas + "h " + minutos + "min " + segundos + "s");
    }

    public static String escritaTempoFormatado(int horas, int minutos, int segundos) {
        return horas + "h" + minutos + "min" + segundos + "seg";
    }
    

}
