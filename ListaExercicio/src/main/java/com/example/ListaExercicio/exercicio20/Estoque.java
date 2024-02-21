package com.example.ListaExercicio.exercicio20;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int id = 1;
    private List<Produto> listaDeProdutos;

    public Estoque() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void inicializaEstoque() {
        listaDeProdutos = new ArrayList<>();
    }

    public Produto encontrarProduto(int id) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public Produto encontrarProduto(String nome) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public boolean cadastrarProduto(Produto produto) {
        if (encontrarProduto(produto.getId()) == null) {
            listaDeProdutos.add(produto);
            return true;
        }
        return false;
    }

    public void imprimeCatalogoDoEstoque() {
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - R$ " +
                    produto.getPreco() + " - " + produto.getQuantidadeEmEstoque() + " unidades");
        }
    }

    public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa) {
        Produto produto = encontrarProduto(nome);
        return produto != null && darBaixa(produto, quantidadeParaDarBaixa);
    }

    public boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa) {
        Produto produto = encontrarProduto(id);
        return produto != null && darBaixa(produto, quantidadeParaDarBaixa);
    }

    private boolean darBaixa(Produto produto, int quantidadeParaDarBaixa) {
        if (produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        return false;
    }

    public int getQuantidadeAtualEmEstoque(Produto produto) {
        return listaDeProdutos.indexOf(produto) != -1 ? produto.getQuantidadeEmEstoque() : -1;
    }

    public int getPosicaoDoProdutoNaLista(Produto produto) {
        return listaDeProdutos.indexOf(produto);
    }

    public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa) {
        return listaDeProdutos.contains(produto) &&
                produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa;
    }
}
