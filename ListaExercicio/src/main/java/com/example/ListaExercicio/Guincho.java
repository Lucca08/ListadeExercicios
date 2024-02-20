package com.example.ListaExercicio;

public class Guincho {
    public void rebocar(Automovel automovel) {
        if (automovel.isLigado()) {
            System.out.println("O veículo está ligado. Desligue-o para rebocá-lo.");
        } else {
            System.out.println("O veículo foi rebocado.");
        }
    }
}
