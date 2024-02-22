
package com.example.ListaExercicio.exercicio18;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotoPartidaPedal extends Moto{
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int velMax) {
        super(velMax);
        this.aceleradorPuxado = false;
    }

    public void puxarAcelerador() {
        this.aceleradorPuxado = true;
    }

    @Override
    public void ligar() {
        Logger logger = LoggerFactory.getLogger(MotoPartidaPedal.class);
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            logger.info("Puxe o acelerador para ligar a moto com partida a pedal.");
        }
    }
}
