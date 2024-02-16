package com.example.ListaExercicio;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabuadaTest {

    @Test
    public void testTabuadaDoCinco() {
        // Redireciona a saída padrão para um ByteArrayOutputStream
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Executa o método que imprime a tabuada
        Tabuada.main(new String[]{});

        // Restaura a saída padrão
        System.setOut(System.out);

        // Captura a saída impressa e normaliza a formatação
        String output = outputStreamCaptor.toString().trim().replaceAll("\\r\\n", "\n");

        // Resultado esperado com formatação normalizada
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

        // Verifica se a saída impressa é igual ao resultado esperado
        assertEquals(expectedOutput, output);
    }
}
