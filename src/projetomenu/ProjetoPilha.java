/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

import java.util.Scanner;

/**
 *
 * @author Fernando Portella
 */
public class ProjetoPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variáveis
        String nome;
        int opcao, elem;

        nome = "";
        opcao =  elem = 0;

        Scanner teclado = new Scanner(System.in);

        Pilha pilhaCalcObj;
        pilhaCalcObj = new Pilha();
        
        System.out.println("");
        System.out.println("|--------------- INICIALIZANDO SISTEMA PILHA ---------------|");
        System.out.println("");
        
        System.out.println("Informe a quantidade de Elementos da Pilha");
        elem = teclado.nextInt();
        pilhaCalcObj.PilhaCalc(elem);

        do {
            System.out.println("");
            System.out.println("|-------MENU SISTEMA PILHA-------|");
            System.out.println("0 – Finalizar");
            System.out.println("1 – Inicializa Pilha");
            System.out.println("2 – Mostra Pilha");
            System.out.println("3 – Insere elemento na Pilha");
            System.out.println("4 – Remove elemento da Pilha");
            System.out.print("Qual sua opção:");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    pilhaCalcObj.inicializa();
                    break;
                case 2:
                    pilhaCalcObj.mostrapilha();
                    break;
                case 3:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!pilhaCalcObj.cheia()) {
                        System.out.println("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        pilhaCalcObj.empilhar(nome);
                    } else {
                        System.out.println("Pilha cheia");
                    }
                    break;
                case 4:
                    pilhaCalcObj.desempilhar();
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 4");
                    break;
            }

        } while (opcao != 0);
        
        System.out.println("");
        System.out.println("|--------------- FINALIZANDO SISTEMA PILHA ---------------|");
        System.out.println("|----------- RETORNANDO PARA O MENU PRINCIPAL -----------|");
        System.out.println("");

    }
    
}
