package com.example.ListaExercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JokenpoGameTest {

    @Test
    public void testPedra() {
        assertEquals("Empate", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PEDRA, JokenpoGame.Opcao.PEDRA));
        assertEquals("Jogador venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PEDRA, JokenpoGame.Opcao.TESOURA));
        assertEquals("Máquina venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PEDRA, JokenpoGame.Opcao.PAPEL));
    }

    @Test
    public void testPapel() {
        assertEquals("Empate", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PAPEL, JokenpoGame.Opcao.PAPEL));
        assertEquals("Jogador venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PAPEL, JokenpoGame.Opcao.PEDRA));
        assertEquals("Máquina venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.PAPEL, JokenpoGame.Opcao.TESOURA));
    }

    @Test
    public void testTesoura() {
        assertEquals("Empate", JokenpoGame.calcularResultado(JokenpoGame.Opcao.TESOURA, JokenpoGame.Opcao.TESOURA));
        assertEquals("Jogador venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.TESOURA, JokenpoGame.Opcao.PAPEL));
        assertEquals("Máquina venceu", JokenpoGame.calcularResultado(JokenpoGame.Opcao.TESOURA, JokenpoGame.Opcao.PEDRA));
    }
}



