package com.example.ListaExercicio;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class LerAte10Test {

    @Test
    public void testLeituraAte10() {
        String input = "5\n8\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LerAte10.main(new String[]{});

        String[] expectedLines = {
            "Digite números até que você digite 10:",
            "Digite um número: Você digitou: 5",
            "Digite um número: Você digitou: 8",
            "Digite um número: Você digitou 10. Fim do programa."
        };
        for (String expectedLine : expectedLines) {
            assertTrue(outContent.toString().contains(expectedLine));
        }
    }
}
