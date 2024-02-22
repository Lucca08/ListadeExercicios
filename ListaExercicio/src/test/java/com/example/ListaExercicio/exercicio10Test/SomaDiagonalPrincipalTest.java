package com.example.ListaExercicio.exercicio10Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.ListaExercicio.exercicio10.SomaDiagonalPrincipal;

public class SomaDiagonalPrincipalTest {

    @Test
    public void testCalcularSomaDiagonalPrincipal() {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int resultado1 = SomaDiagonalPrincipal.calcularSomaDiagonalPrincipal(matriz1);
        assertEquals(15, resultado1);

        int[][] matriz2 = {{1, 0, 0}, {0, 5, 0}, {0, 0, 9}};
        int resultado2 = SomaDiagonalPrincipal.calcularSomaDiagonalPrincipal(matriz2);
        assertEquals(15, resultado2);

        int[][] matriz3 = {{1}};
        int resultado3 = SomaDiagonalPrincipal.calcularSomaDiagonalPrincipal(matriz3);
        assertEquals(1, resultado3);
    }
}
