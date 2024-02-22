package com.example.ListaExercicio.exercicio5Test;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio5.Tabuada;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabuadaTest {

    @Test
    public void testTabuadaDoCinco() {
        
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        Tabuada.main(new String[]{});
        
        System.setOut(System.out);

        String output = outputStreamCaptor.toString().trim().replaceAll("\\r\\n", "\n");

        String expectedOutput = "Tabuada do 5:\n" +
                "5 x 1 = 5\n" +
                "5 x 2 = 10\n" +
                "5 x 3 = 15\n" +
                "5 x 4 = 20\n" +
                "5 x 5 = 25\n" +
                "5 x 6 = 30\n" +
                "5 x 7 = 35\n" +
                "5 x 8 = 40\n" +
                "5 x 9 = 45\n" +
                "5 x 10 = 50";

        assertEquals(expectedOutput, output);
    }
}
