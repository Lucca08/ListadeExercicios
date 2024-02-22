package com.example.ListaExercicio.exercicio17Test;

import org.junit.jupiter.api.Test;


import com.example.ListaExercicio.exercicio16.Pessoa;
import com.example.ListaExercicio.exercicio17.PessoaArvore;

import static org.junit.jupiter.api.Assertions.*;

class PessoaArvoreTest {

    @Test
    void testConstrutorComPais() {
        PessoaArvore avo1 = new PessoaArvore("João", 70);
        PessoaArvore avo2 = new PessoaArvore("Maria", 68);

        PessoaArvore pai = new PessoaArvore("Carlos", 40, avo1, avo2);
        PessoaArvore mae = new PessoaArvore("Ana", 38);

        PessoaArvore filho = new PessoaArvore("Pedro", 15, pai, mae);

        assertEquals("Carlos", pai.getNome());
        assertEquals("Ana", mae.getNome());
        assertEquals("Pedro", filho.getNome());

        assertEquals(40, pai.getIdade());
        assertEquals(38, mae.getIdade());
        assertEquals(15, filho.getIdade());

        assertEquals(avo1, pai.getPai());
        assertEquals(avo2, pai.getMae());
        assertNull(mae.getPai());
        assertNull(mae.getMae());

        assertEquals(pai, filho.getPai());
        assertEquals(mae, filho.getMae());
    }

    @Test
    void testSetMae() {
        PessoaArvore avo1 = new PessoaArvore("João", 70);
        PessoaArvore avo2 = new PessoaArvore("Maria", 68);

        PessoaArvore pai = new PessoaArvore("Carlos", 40, avo1, avo2);
        PessoaArvore mae = new PessoaArvore("Ana", 38);

        PessoaArvore filho = new PessoaArvore("Pedro", 15, pai, mae);

        pai.getPai().setMae(avo2);
    
        assertEquals(avo2, pai.getMae());
    }

}

