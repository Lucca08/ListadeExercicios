package com.example.ListaExercicio.exercicio18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public CarroAutomatico(int velMax) {
        super(velMax);
        this.freioPressionado = false;
    }

    public void pressionarFreio() {
        this.freioPressionado = true;
    }

    @Override
    public void ligar() {
        Logger logger = LoggerFactory.getLogger(CarroAutomatico.class);
        if (freioPressionado) {
            super.ligar();
        } else {
            logger.info("Pressione o freio para ligar o carro automático.");
        }
    }
}
