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
public class ProjetoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variáveis
        String nome;
        int opcao, posicao, posicaod, elem, posicaop;

        nome = "";
        opcao = posicao = elem = posicaod = posicaop = 0;

        Scanner teclado = new Scanner(System.in);

        ListaCalc listacalcObj;
        listacalcObj = new ListaCalc();
        
        System.out.println("");
        System.out.println("|--------------- INICIALIZANDO SISTEMA LISTA ---------------|");
        System.out.println("");
        
        System.out.println("Informe a quantidade de Elementos da Lista");
        elem = teclado.nextInt();
        listacalcObj.ListaCalc(elem);

        do {
            System.out.println("");
            System.out.println("|-------MENU SISTEMA LISTA-------|");
            System.out.println("0 – Finalizar");                            
            System.out.println("1 – Inicializa Lista");                      
            System.out.println("2 – Mostra Lista");
            System.out.println("3 – Insere elemento na Lista");
            System.out.println("4 – Remove elemento da Lista");
            System.out.println("5 – Mostra Apenas Posições Ocupadas na Lista");
            System.out.println("6 - Pesquisa nome por posição");
            System.out.println("7 - Pesquisa por nome");
            System.out.println("8 - Pesquisa parte do nome");
            System.out.println("9 - Copiar Vetor");
            System.out.println("10 - Mostrar Vetor Novo");
            System.out.println("11 - Ordenar Vetor Novo");
            System.out.print("Qual sua opção:");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    listacalcObj.inicializa();
                    break;
                case 2:
                    listacalcObj.mostra();
                    break;
                case 3:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!listacalcObj.cheia()) {
                        System.out.println("Informe o nome a ser inserido:");
                        nome = teclado.nextLine();
                        listacalcObj.insere(nome);
                    } else {
                        System.out.println("Lista cheia");
                    }
                    break;
                case 4:
                    listacalcObj.mostra();
                    System.out.println("Informe a posição do nome a ser deletado:");
                    posicaod = teclado.nextInt();
                    
                    while (posicaod<=0 || posicaod >= listacalcObj.getNumele()){
                            System.out.println("Valor incorreto");
                            System.out.println("Informe a posição onde será inserido (entre 1 e " + (listacalcObj.getNumele()-1) +"):");
                            
                            posicaod = teclado.nextInt();
                        }
                    
                    listacalcObj.remove(posicaod);
                    break;
                case 5:
                    listacalcObj.mostralistadefinitiva();
                    break;
                case 6:
                    
                    teclado.nextLine();
                        System.out.println("Informe a posição do nome a ser pesquisado:");
                    posicaop = teclado.nextInt();
                        
                        //verifica se a posição digitada é maior que zero e menor que
                        //o número de posições utilizadas no array.
                        while (posicaop<=0 || posicaop >= listacalcObj.getNumele()){
                            System.out.println("Valor incorreto");
                            System.out.println("Informe a posição onde será inserido (entre 1 e " + (listacalcObj.getNumele()-1) +"):");
                            
                            posicaop = teclado.nextInt();
                        }
                        
                        
                        listacalcObj.pesquisaposicao(posicaop);
                    break;
                case 7:
                    teclado.nextLine();
                    nome = "";
                        System.out.println("Informe o nome a ser pesquisado:");
                    nome = teclado.nextLine();
                        
                        listacalcObj.pesquisanome(nome);
                    break;
                    case 8:
                    teclado.nextLine();
                    nome = "";
                        System.out.println("Informe parte do nome a ser pesquisado:");
                    nome = teclado.nextLine();
                        listacalcObj.pesquisapartenome(nome);
                    break;
                    case 9:
                    listacalcObj.vetorcopia();
                    break;
                    case 10:
                    listacalcObj.mostravetornovo();
                    break;
                    case 11:
                    listacalcObj.ordenavetornovo();
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 7");
                    break;
            }

        } while (opcao != 0);
        
        System.out.println("");
        System.out.println("|--------------- FINALIZANDO SISTEMA LISTA ---------------|");
        System.out.println("|----------- RETORNANDO PARA O MENU PRINCIPAL -----------|");
        System.out.println("");

    }

}
