package com.example.ListaExercicio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerificarIdadeTest {

    @Test
    public void testVerificarMaioridadeComIdadeMaiorOuIgualDezoito() {
        assertTrue(VerificarIdade.verificarMaioridade(18));
        assertTrue(VerificarIdade.verificarMaioridade(25));
    }

    @Test
    public void testVerificarMaioridadeComIdadeMenorDezoito() {
        assertFalse(VerificarIdade.verificarMaioridade(16));
        assertFalse(VerificarIdade.verificarMaioridade(17));
    }

}

