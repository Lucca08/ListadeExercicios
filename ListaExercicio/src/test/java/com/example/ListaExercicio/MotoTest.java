package com.example.ListaExercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

    

