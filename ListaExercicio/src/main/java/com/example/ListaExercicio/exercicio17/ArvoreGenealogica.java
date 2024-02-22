package com.example.ListaExercicio.exercicio17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArvoreGenealogica {
    private static final Logger logger = LoggerFactory.getLogger(ArvoreGenealogica.class);

    public static void main(String[] args) {
        PessoaArvore avo1 = new PessoaArvore("João", 70);
        PessoaArvore avo2 = new PessoaArvore("Maria", 68);

        PessoaArvore pai = new PessoaArvore("Carlos", 40, avo1, avo2);
        PessoaArvore mae = new PessoaArvore("Ana", 38);

        PessoaArvore filho = new PessoaArvore("Pedro", 15, pai, mae);

        pai.getPai().setMae(avo2);

        logger.info("Árvore Genealógica:");
        logger.info("Bisavô: {}", pai.getPai().getPai().getNome());
        logger.info("Bisavó: {}", pai.getPai().getMae().getNome());
        logger.info("Avô: {}", pai.getMae().getNome());
        logger.info("Avó: {}", mae.getNome());
        logger.info("Pai: {}", pai.getNome());
        logger.info("Mãe: {}", mae.getNome());
        logger.info("Filho: {}", filho.getNome());
    }
}
