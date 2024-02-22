package com.example.ListaExercicio.exercicio18Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio18.Carro;

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
