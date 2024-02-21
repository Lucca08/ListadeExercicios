package com.example.ListaExercicio.exercicio20;
import java.util.Scanner;

public class Menu {
    private Estoque estoque;
    private Pedido pedido;

    public Menu() {
        this.estoque = new Estoque();
        this.pedido = new Pedido();
    }

    public void controlaMenu() {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Mostrar Estoque");
            System.out.println("2. Fazer Pedido");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

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
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public void fazerPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Fazer Pedido =====");

        while (true) {
            System.out.print("Digite o ID do produto ou 0 para encerrar o pedido: ");
            int idProduto = scanner.nextInt();
            scanner.nextLine(); 

            if (idProduto == 0) {
                break;
            }

            Produto produto = estoque.encontrarProduto(idProduto);

            if (produto != null) {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine(); 

                if (pedido.adicionarItemNaLista(produto, quantidade)) {
                    System.out.println("Item adicionado ao pedido.");
                } else {
                    System.out.println("Quantidade indisponível no estoque.");
                }
            } else {
                System.out.println("Produto não encontrado no estoque.");
            }
        }

        System.out.println("===== Resumo do Pedido =====");
        pedido.imprimirPedido();
    }

    public void mostraEstoque() {
        estoque.imprimeCatalogoDoEstoque();
    }
}
