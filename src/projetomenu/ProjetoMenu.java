/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

import java.util.Scanner;

/**
 *
 * @author CGC
 */
public class ProjetoMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcao;
        
        opcao = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("|----------- MENU PRINCIPAL -----------|");
        
    //    ProjetoFila_v2 menufilaObj;
    //    menufilaObj = new ProjetoFila_v2();

        do {
            System.out.println("");
            System.out.println("|-------MENU PRINCIPAL------|");
            System.out.println("0 – Finalizar");
            System.out.println("1 – Chama Projeto Fila");
            System.out.println("2 – Chama Projeto Pilha");
            System.out.println("3 – Chama Projeto Lista");
            System.out.println("4 – Chama Projeto Deque");
            System.out.println("5 – Chama Projeto Desistiu (Fila Prova 01)");
            System.out.print("Qual sua opção:");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                //    new ProjetoFila_v2().getClass();
                    ProjetoFila_v2.main(args);
                    break;
                case 2:
                    ProjetoPilha.main(args);
                    break;
                case 3:
                    ProjetoLista.main(args);
                    break;
                case 4:
                    ProjetoDeque.main(args);
                    break;
                case 5:
                    ProjetoFilaDesistiuProva01.main(args);
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 5");
                    break;
            }

        } while (opcao != 0);
        
        System.out.println("");
        System.out.println("|----------- MENU PRINCIPAL FINALIZADO -----------|");
        System.out.println("");

        
    }
    
}
