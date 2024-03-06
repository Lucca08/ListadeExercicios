package com.example.ListaExercicio.exercicio8Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.ListaExercicio.exercicio8.LerAte10;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

public class LerAte10Test {

    @Test
    public void testLerAte10() {
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        LerAte10.main(new String[0]);
    }
}

