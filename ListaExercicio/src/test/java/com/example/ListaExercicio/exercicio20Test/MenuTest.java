package com.example.ListaExercicio.exercicio20Test;

import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio20.Menu;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    @Test
    void testMostraEstoque() {
        
        InputStream originalSystemIn = System.in;
    
        String input = "1\n"; 
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        System.setIn(originalSystemIn);
    }
    
    @Test
    void testFazerPedido() {
    
        InputStream originalSystemIn = System.in;

        String input = "1\n"; 
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        System.setIn(originalSystemIn);
    }


    @Test
    void testSairDoPrograma() {
        Menu menu = new Menu();
     
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> menu.controlaMenu(), "Exception not expected");
    }

    @Test
    void testOpcaoInvalida() {
        InputStream originalSystemIn = System.in;

        String input = "texto_invalido\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        System.setIn(originalSystemIn);
    }

}
