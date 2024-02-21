package com.example.ListaExercicio.exercicio20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
   public ArrayList<Item> itens = new ArrayList<Item>();
   public double valorTotalDoPedido = 0;
   
   public void calcularValorTotal(){
         for (Item item : itens) {
              valorTotalDoPedido += item.getValorDoItem();
            }
   }

   public boolean adicionarItemNaLista(Produto produto, int quantidade){
      if(produto.getQuantidadeEmEstoque() >= quantidade){
         Item item = new Item(produto, quantidade);
         itens.add(item);
         produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
         return true;
      }
      return false;
   }

   public void imprimirPedido(){
      for (Item item : itens) {
         System.out.println(item.getProduto().getNome() + " - " + item.getQuantidade() + " - R$ " + item.getValorDoItem());
      }
      System.out.println("Valor total do pedido: R$ " + valorTotalDoPedido);
   }

   public void imprimeValorTotal(){
        System.out.println("Valor total do pedido: R$ " + valorTotalDoPedido);
   }

   public void adicionarItem() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o ID do produto: ");
    int idProduto = scanner.nextInt();
    scanner.nextLine();

    Estoque estoque = new Estoque();

    Produto produto = estoque.encontrarProduto(idProduto);

    if (produto != null) {
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        adicionarItemNaLista(produto, quantidade);
    } else {
        System.out.println("Produto não encontrado no estoque.");
    }

    scanner.close();
    }


    public String receberNomeDoTeclado() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
    String nomeProduto = scanner.nextLine();

    scanner.close();
    return nomeProduto;
    }

    public int recebeQuantidadeDoTeclado() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade desejada: ");
    int quantidade = scanner.nextInt();

    scanner.close();
    return quantidade;
    }

   public void limparCarrinho(){
      itens.clear();
   }

   public double calcularTroco(double valorPago) {
        return valorPago - valorTotalDoPedido;
    }

    public void calcularNotasTroco(double troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("Troco:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
                troco %= nota;
            }
        }
    }
}