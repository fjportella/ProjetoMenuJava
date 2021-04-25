/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ProjetoDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        String nome;
        int opcao, n;
        
        System.out.println("");
        System.out.println("|--------------- INICIALIZANDO SISTEMA DEQUE ---------------|");
        System.out.println("");
        
        System.out.print("Informe o tamanho do deque:");
        n = teclado.nextInt();

        Deque objdeque = new Deque();

        do {
            System.out.println("");
            System.out.println("|-------MENU SISTEMA DEQUE-------|");
            System.out.println("0 – Finalizar");
            System.out.println("1 – Inicializa deque");
            System.out.println("2 – Mostra deque");
            System.out.println("3 – Insere elemento no início do deque");
            System.out.println("4 – Insere elemento no fim do deque");
            System.out.println("5 – Remove elemento no início do deque");
            System.out.println("6 – Remove elemento no fim do deque");
            System.out.println("7 - Ordenação ordem alfabética - método da substituição");
            System.out.println("8 - Ordenação ordem alfabética - método Bubble sort ou bolha");
            System.out.print("Qual sua opção:");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    objdeque.inicializa(n);
                    break;
                case 2:
                    objdeque.mostra();
                    break;
                case 3:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!objdeque.cheio()) {
                        System.out.print("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        objdeque.insereinicio(nome);
                    } else {
                        System.out.println("Deque cheio");
                    }
                    break;
                case 4:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!objdeque.cheio()) {
                        System.out.print("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        objdeque.inserefim(nome);
                    } else {
                        System.out.println("Deque cheio");
                    }
                    break;
                case 5:
                    objdeque.removeinicio();
                    break;
                case 6:
                    objdeque.removefim();
                    break;
                case 7:
                    objdeque.ordenasubstituicao();
                    break;
                case 8:
                    objdeque.ordenabolha();
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 8");

            }

        } while (opcao != 0);
        
        System.out.println("");
        System.out.println("|--------------- FINALIZANDO SISTEMA DEQUE ---------------|");
        System.out.println("|----------- RETORNANDO PARA O MENU PRINCIPAL -----------|");
        System.out.println("");

    }

}
