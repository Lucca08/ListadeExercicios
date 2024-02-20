package com.example.ListaExercicio;

public class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public CarroAutomatico(int velMax) {
        super(velMax);
        this.freioPressionado = false;
    }

    public void pressionarFreio() {
        this.freioPressionado = true;
    }

    public void soltarFreio() {
        this.freioPressionado = false;
    }

    @Override
    public void ligar() {
        if (freioPressionado) {
            super.ligar();
        } else {
            System.out.println("Pressione o freio para ligar o carro automático.");
        }
    }
}
