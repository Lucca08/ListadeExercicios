package com.example.ListaExercicio;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AgendaTelefonica {
    private Map<String, String> contatos;
    
    public AgendaTelefonica() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void deletarContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Map.Entry<String, String> entry : contatos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public String buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            return contatos.get(nome);
        } else {
            return "Contato não encontrado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        while (true) {
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Deletar Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Exibir Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    String numeroAdicionar = scanner.nextLine();
                    agenda.adicionarContato(nomeAdicionar, numeroAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser deletado: ");
                    String nomeDeletar = scanner.nextLine();
                    agenda.deletarContato(nomeDeletar);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    String resultadoBusca = agenda.buscarContato(nomeBuscar);
                    System.out.println("Resultado da busca: " + resultadoBusca);
                    break;
                case 4:
                    agenda.exibirContatos();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opçao inválida. Tente novamente.");
            }
        }
    }
}

