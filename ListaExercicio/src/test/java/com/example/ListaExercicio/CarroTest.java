package com.example.ListaExercicio;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroTest {

    @Test
    void testLigarCarro() {
        Carro carro = new Carro(120);
        carro.ligar();
        assertTrue(carro.isLigado());
    }

    @Test
    void testDesligarCarro() {
        Carro carro = new Carro(120);
        carro.ligar();
        carro.desligar();
        assertFalse(carro.isLigado());
    }

    
}
