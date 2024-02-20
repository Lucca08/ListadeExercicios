package com.example.ListaExercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgendaTelefonicaTest {

    @Test
    void testAdicionarContato() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("Alice", "123456789");

        assertEquals("123456789", agenda.buscarContato("Alice"));
    }

    @Test
    void testDeletarContato() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("Bob", "987654321");
        agenda.deletarContato("Bob");

        assertEquals("Contato não encontrado", agenda.buscarContato("Bob"));
    }

    @Test
    void testExibirContatos() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("Charlie", "555555555");

        agenda.exibirContatos();
    }

    @Test
    void testBuscarContato() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("David", "999999999");

        assertEquals("999999999", agenda.buscarContato("David"));
    }
}

