/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

/**
 *
 * @author Fernando
 */
public class Deque {

    private String nome[];    // apenas declara o vetor
    private int contador;
    private int n;

    public void inicializa(int n) {
        nome = new String[n];   // alocação de memória para n nomes – tamanho do deque     
        contador = 0;                  // inicializa a lista deque
        this.n = n;
        int i;
        for (i = 0; i < n; i++) {
            nome[i] = "";
        }
        System.out.println("Deque inicializado");
        this.mostra();
    }

    public boolean cheio() {
        return contador == n;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public boolean vazio() {
        return contador == 0;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public void mostra() {
        int i;
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.printf("%10d", i);
        }

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");

        for (i = 0; i < n; i++) {
            System.out.printf("%10s", nome[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");

    }

    public void inserefim(String nome) {
        if (this.cheio()) {
            System.out.println("Deque cheio");
        } else {
            this.nome[contador] = nome;
            contador++;
            this.mostra();
        }
    }

    public void removeinicio() {
        if (this.vazio()) {
            System.out.println("Deque vazio");
        } else {
            int i;
            contador--;
            System.out.println("Removido:" + nome[0]);
            this.nome[0] = "";
            // movimentando os nomes
            for (i = 0; i < contador; i++) {
                this.nome[i] = this.nome[i + 1];
            }
            this.nome[contador] = "";
            this.mostra();
        }
    }

    // implementação dos métodos novos
    public void insereinicio(String nome) {
        if (this.cheio()) {
            System.out.println("Deque cheio");
        } else {
            // movimentando os nomes
            int i;
            for (i = contador; i > 0; i--) {
                this.nome[i] = this.nome[i - 1];
            }
            this.nome[0] = nome;
            contador++;
            this.mostra();
        }
    }

    public void removefim() {
        if (this.vazio()) {
            System.out.println("Deque vazio");
        } else {
            contador--;
            System.out.println("Removido:" + nome[contador]);
            this.nome[contador] = "";
            this.mostra();
        }
    }

    public void ordenasubstituicao() {
        int i, j;
        String aux;
        for (i = 0; i < contador - 1; i++) {
            for (j = i + 1; j < contador; j++) {
                if (nome[i].compareTo(nome[j]) > 0) {
                    aux = nome[i];
                    nome[i] = nome[j];
                    nome[j] = aux;
                }
            }
        }
        this.mostra();
    }

    public void ordenabolha() {
        int i;
        String aux;
        Boolean controle = true;
        while (controle) {
            controle = false;
            for (i = 0; i < contador - 1; i++) {
                if (nome[i].compareTo(nome[i + 1]) > 0) {
                    aux = nome[i];
                    nome[i] = nome[i + 1];
                    nome[i + 1] = aux;
                    controle = true;
                }
            }
        }
        this.mostra();
    }

}
