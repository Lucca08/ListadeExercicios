package com.example.ListaExercicio.exercicio20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private static final Logger logger = LoggerFactory.getLogger(Pedido.class);

    public ArrayList<Item> itens = new ArrayList<Item>();
    public double valorTotalDoPedido = 0;

    public void calcularValorTotal() {
        for (Item item : itens) {
            valorTotalDoPedido += item.getValorDoItem();
        }
    }

    public boolean adicionarItemNaLista(Produto produto, int quantidade) {
        if (produto.getQuantidadeEmEstoque() >= quantidade) {
            Item item = new Item(produto, quantidade);
            itens.add(item);
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
            return true;
        }
        return false;
    }

    public void imprimirPedido() {
        calcularValorTotal();
    
        StringBuilder pedidoStringBuilder = new StringBuilder();
    
        for (Item item : itens) {
            pedidoStringBuilder.append(item.getProduto().getNome())
                    .append(" - ").append(item.getQuantidade())
                    .append(" - R$ ").append(item.getValorDoItem()).append("\n");
        }
    
        pedidoStringBuilder.append("Valor total do pedido: R$ ").append(valorTotalDoPedido);
    
        System.out.println(pedidoStringBuilder.toString());
    }
    
    

    public void imprimeValorTotal() {
        calcularValorTotal();
        logger.info("Valor total do pedido: R$ {}", valorTotalDoPedido);
    }

    public void adicionarItem() {
        Scanner scanner = new Scanner(System.in);

        try {
            logger.info("Digite o ID do produto: ");
            int idProduto = scanner.nextInt();
            scanner.nextLine();

            Estoque estoque = new Estoque();

            Produto produto = estoque.encontrarProduto(idProduto);

            if (produto != null) {
                logger.info("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                adicionarItemNaLista(produto, quantidade);
            } else {
                logger.info("Produto não encontrado no estoque.");
            }
        } catch (Exception e) {
            logger.error("Erro ao processar entrada do usuário.", e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public String receberNomeDoTeclado() {
        Scanner scanner = new Scanner(System.in);

        try {
            logger.info("Digite o nome do produto: ");
            return scanner.nextLine();
        } catch (Exception e) {
            logger.error("Erro ao processar entrada do usuário.", e);
            return null;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public int recebeQuantidadeDoTeclado() {
        Scanner scanner = new Scanner(System.in);

        try {
            logger.info("Digite a quantidade desejada: ");
            return scanner.nextInt();
        } catch (Exception e) {
            logger.error("Erro ao processar entrada do usuário.", e);
            return 0;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void limparCarrinho() {
        itens.clear();
    }

    public double calcularTroco(double valorPago) {
        return valorPago - valorTotalDoPedido;
    }

    public void calcularNotasTroco(double troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        logger.info("Troco:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            if (quantidadeNotas > 0) {
                logger.info("{} nota(s) de R$ {},00", quantidadeNotas, nota);
                troco %= nota;
            }
        }
    }
}
