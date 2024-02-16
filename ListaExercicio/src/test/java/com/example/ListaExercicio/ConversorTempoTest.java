package com.example.ListaExercicio;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.scanner.Scanner;

public class ConversorTempoTest {

    @Test
    public void testObterHoras() {
        int tempoEmSegundos = 7023;
        int resultado = ConversorTempo.obterHoras(tempoEmSegundos);
        assertEquals(1, resultado);
    }

    @Test
    public void testObterMinutos() {
        int tempoEmSegundos = 7023;
        int resultado = ConversorTempo.obterMinutos(tempoEmSegundos);
        assertEquals(57, resultado);
    }

    @Test
    public void testObterSegundos() {
        int tempoEmSegundos = 7023;
        int resultado = ConversorTempo.obterSegundos(tempoEmSegundos);
        assertEquals(3, resultado);
    }

    @Test
    public void testEscritaTempoFormatado() {
        int horas = 1;
        int minutos = 57;
        int segundos = 3;
        String resultado = ConversorTempo.escritaTempoFormatado(horas, minutos, segundos);
        assertEquals("1h57min3seg", resultado);
    }
}
