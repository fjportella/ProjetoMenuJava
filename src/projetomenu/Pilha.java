/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

/**
 *
 * @author Fernando Portella
 */
public class Pilha {
    
    private String nome[];
    private int contador, numele, cont2;

    public void PilhaCalc(int elem) {
        this.numele = elem;
        numele = numele + 1;
        nome = new String[numele];
    }

    public void inicializa() {
        contador = 1;
        int i;
        for (i = 0; i < numele; i++) {
            nome[i] = "";
        }
    }

    public boolean cheia() {
        return contador == numele;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public boolean vazia() {
        return contador == 1;		//faz uma decisão e retorna o valor lógico true ou false
    }

    
    public void empilhar(String nome) {
        if (!this.cheia()) {
            this.nome[contador] = nome;
            contador++;
            this.mostrapilha();
        } else {
            System.out.println("Pilha cheia");
        }

    }

    public void desempilhar() {
        if (this.vazia()) {
            System.out.println("Pilha vazia");
        } else {
            int i;
            contador--;
            System.out.println("Removido:" + nome[contador]);
            this.nome[contador] = "";
                        nome[contador] = "";
            this.mostrapilha();
        }
    }

    
    
    
    public void mostrapilha() {
        if (this.vazia()) {
            System.out.println("Pilha vazia");
        } else {
            int i;
            System.out.println();
            System.out.printf("%10s","Posição");
            System.out.printf("%10s","Status");
            System.out.println("");
            System.out.println("----------------------");
            cont2 = contador - 1;
            for (i = cont2; i > 0; i--) {
                System.out.printf("%10d", i);
                System.out.printf("%10s", nome[i]);
                System.out.println("");    
            }
            System.out.println("----------------------");
        }
    }
                
            
    


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
}
