package com.example.ListaExercicio.exercicio18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guincho {
    private static final Logger logger = LoggerFactory.getLogger(Guincho.class);

    public void rebocar(Automovel automovel) {
        if (automovel.isLigado()) {
            logger.info("Nao e possível rebocar o veículo enquanto estiver ligado, Desligue-o e tente novamente");
        } else {
            logger.info("O veiculo foi rebocado com sucesso");
        }
    }
}
