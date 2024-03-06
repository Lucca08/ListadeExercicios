package com.example.ListaExercicio.exercicio19;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class AgendaTelefonica {
    private Map<String, String> contatos;
    private static final Logger logger = Logger.getLogger(AgendaTelefonica.class.getName());

    public AgendaTelefonica() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.put(nome, numero);
        logger.info("Contato adicionado com sucesso!");
    }

    public void deletarContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            logger.info("Contato removido com sucesso!");
        } else {
            logger.info("Contato não encontrado.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            logger.info("Agenda vazia.");
        } else {
            logger.info("Lista de Contatos:");
            for (Map.Entry<String, String> entry : contatos.entrySet()) {
                logger.info(entry.getKey() + ": " + entry.getValue());
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
        boolean shouldExit = false;

        while (!shouldExit) {
            
            logger.info("Escolha uma opção: ");
            
            logger.info("1 - Adicionar Contato");
            logger.info("2 - Deletar Contato");
            logger.info("3 - Buscar Contato");
            logger.info("4 - Exibir Contatos");
            logger.info("5 - Sair");
            

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    logger.info("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    logger.info("Digite o numero do contato: ");
                    String numeroAdicionar = scanner.nextLine();
                    agenda.adicionarContato(nomeAdicionar, numeroAdicionar);
                    break;
                case 2:
                    logger.info("Digite o nome do contato a ser deletado: ");
                    String nomeDeletar = scanner.nextLine();
                    agenda.deletarContato(nomeDeletar);
                    break;
                case 3:
                    logger.info("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    String resultadoBusca = agenda.buscarContato(nomeBuscar);
                    logger.info("Resultado da busca: " + resultadoBusca);
                    break;
                case 4:
                    agenda.exibirContatos();
                    break;
                case 5:
                    logger.info("Saindo do programa.");
                    shouldExit = true;
                    break;
                default:
                    logger.info("Opcao invalida");
                    break;
            }
        }
        scanner.close();
    }
}
