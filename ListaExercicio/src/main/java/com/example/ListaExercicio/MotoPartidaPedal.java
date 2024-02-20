package com.example.ListaExercicio;

public class MotoPartidaPedal extends Moto{
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int velMax) {
        super(velMax);
        this.aceleradorPuxado = false;
    }

    public void puxarAcelerador() {
        this.aceleradorPuxado = true;
    }

    public void soltarAcelerador() {
        this.aceleradorPuxado = false;
    }

    @Override
    public void ligar() {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Puxe o acelerador para ligar a moto com partida a pedal.");
        }
    }
}
