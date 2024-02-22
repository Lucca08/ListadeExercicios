package com.example.ListaExercicio.exercicio20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Menu {
    private Estoque estoque;
    private Pedido pedido;
    private static final Logger logger = LoggerFactory.getLogger(Menu.class);

    public Menu() {
        this.estoque = new Estoque();
        this.pedido = new Pedido();
    }

    public void controlaMenu() {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            logger.info("===== Menu Principal =====");
            logger.info("1. Mostrar Estoque");
            logger.info("2. Fazer Pedido");
            logger.info("3. Sair");
            logger.info("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    mostraEstoque();
                    break;
                case 2:
                    fazerPedido();
                    break;
                case 3:
                    logger.info("Saindo do programa.");
                    break;
                default:
                    logger.info("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public void fazerPedido() {
        Scanner scanner = new Scanner(System.in);

        logger.info("===== Fazer Pedido =====");

        while (true) {
            logger.info("Digite o ID do produto ou 0 para encerrar o pedido: ");
            int idProduto = scanner.nextInt();
            scanner.nextLine();

            if (idProduto == 0) {
                break;
            }

            Produto produto = estoque.encontrarProduto(idProduto);

            if (produto != null) {
                logger.info("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if (pedido.adicionarItemNaLista(produto, quantidade)) {
                    logger.info("Item adicionado ao pedido.");
                } else {
                    logger.info("Quantidade indisponível no estoque.");
                }
            } else {
                logger.info("Produto não encontrado no estoque.");
            }
        }

        logger.info("===== Resumo do Pedido =====");
        pedido.imprimirPedido();

        scanner.close(); 
    }

    public void mostraEstoque() {
        estoque.imprimeCatalogoDoEstoque();
    }
}
