package com.example.ListaExercicio.exercicio18Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio18.Moto;

class MotoTest {

    @Test
    void testLigarMoto() {
        Moto moto = new Moto(80);
        moto.ligar();
        assertTrue(moto.isLigado());
    }

    @Test
    void testDesligarMoto() {
        Moto moto = new Moto(80);
        moto.ligar();
        moto.desligar();
        assertFalse(moto.isLigado());
    }

}

    

