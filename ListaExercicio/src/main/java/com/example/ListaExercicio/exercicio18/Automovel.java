
package com.example.ListaExercicio.exercicio18;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        Logger logger = LoggerFactory.getLogger(Automovel.class);
        logger.info("O veiculo esta ligado");
    }

    public void desligar() {
        this.ligado = false;
        Logger logger = LoggerFactory.getLogger(Automovel.class);
        logger.info("O veiculo esta desligado");
    }
}
