package com.example.ListaExercicio.exercicio18Test;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio18.Carro;
import com.example.ListaExercicio.exercicio18.Guincho;
import com.example.ListaExercicio.exercicio18.Moto;

import static org.junit.jupiter.api.Assertions.*;


class GuinchoTest {

    @Test
    void testRebocarCarroDesligado() {
        Guincho guincho = new Guincho();
        Carro carro = new Carro(120);

        guincho.rebocar(carro);

        assertFalse(carro.isLigado());
    }

    @Test
    void testRebocarCarroLigado() {
        Guincho guincho = new Guincho();
        Carro carro = new Carro(120);
        carro.ligar();

        guincho.rebocar(carro);

        assertTrue(carro.isLigado());
    }

    @Test
    void testRebocarMotoDesligada() {
        Guincho guincho = new Guincho();
        Moto moto = new Moto(80);

        guincho.rebocar(moto);

        assertFalse(moto.isLigado());
    }

    @Test
    void testRebocarMotoLigada() {
        Guincho guincho = new Guincho();
        Moto moto = new Moto(80);
        moto.ligar();

        guincho.rebocar(moto);

        assertTrue(moto.isLigado());
    }

}
