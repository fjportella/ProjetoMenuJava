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
public class ProjetoFila_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variáveis
        String nome;
        int opcao, posicao, elem;

        nome = "";
        opcao = posicao = elem = 0;

        Scanner teclado = new Scanner(System.in);

        FilaCalc_v2 filacalcObj;
        filacalcObj = new FilaCalc_v2();
        
        System.out.println("");
        System.out.println("|--------------- INICIALIZANDO SISTEMA FILA ---------------|");
        System.out.println("");
        
        System.out.println("Informe a quantidade de Elementos da Fila");
        elem = teclado.nextInt();
        filacalcObj.FilaCalc_v2(elem);

        do {
            System.out.println("");
            System.out.println("|-------MENU SISTEMA FILA-------|");
            System.out.println("0 – Finalizar");
            System.out.println("1 – Inicializa fila");
            System.out.println("2 – Mostra fila");
            System.out.println("3 – Insere elemento na fila");
            System.out.println("4 – Remove elemento da fila");
            System.out.println("5 – Insere elemento furão na fila");
            System.out.print("Qual sua opção:");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    filacalcObj.inicializa();
                    break;
                case 2:
                    filacalcObj.mostra();
                    break;
                case 3:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!filacalcObj.cheia()) {
                        System.out.println("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        filacalcObj.insere(nome);
                    } else {
                        System.out.println("Fila cheia");
                    }
                    break;
                case 4:
                    filacalcObj.remove();
                    break;
                case 5:
                    // Esta parte fica por conta de vocês
                    // Entrar a posição e o nome a ser inserido   - é bem semelhante ao método insere	
                    teclado.nextLine();
                    if (!filacalcObj.cheia()) {
                        System.out.println("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        System.out.println("Informe a posição onde será inserido (entre 1 e " + (filacalcObj.getContador()-1) +"):");
                        posicao = teclado.nextInt();
                        
                        //verifica se a posição digitada é maior que zero e menor que
                        //o número de posições utilizadas no array.
                        while (posicao<=0 || posicao >= filacalcObj.getContador()){
                            System.out.println("Valor incorreto");
                            System.out.println("Informe a posição onde será inserido (entre 1 e " + (filacalcObj.getContador()-1) +"):");
                            
                            posicao = teclado.nextInt();
                        }
                        
                        
                        filacalcObj.furafila(posicao, nome);

                    } else {
                        System.out.println("Fila cheia");
                    }
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 5");
                    break;
            }

        } while (opcao != 0);
        System.out.println("");
        System.out.println("|--------------- FINALIZANDO SISTEMA FILA ---------------|");
        System.out.println("|----------- RETORNANDO PARA O MENU PRINCIPAL -----------|");
        System.out.println("");
    }

}
