package com.example.ListaExercicio;
public class Automovel {
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Automovel(int numRodas, int velMax) {
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O veículo está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O veículo está desligado.");
    }
}
