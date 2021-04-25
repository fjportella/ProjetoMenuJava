/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomenu;

import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class ListaCalc {

    private String nome[], vetorcopia[];
    private int contador, numele, total, tamnvvetor, cont2;

    public void ListaCalc(int elem) {
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

    public void inicializavcopia() {
        int i;
        for (i = 0; i < contador; i++) {
            vetorcopia[i] = "";
        }
    }

    public boolean cheia() {
        return contador == numele;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public boolean vazia() {
        return contador == 1;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public void insere(String nome) {
        if (!this.cheia()) {
            int verif = 0, cont2 = 1;
            //        this.numarray();
            while (cont2 <= numele && verif != 1) {
                if (this.nome[cont2] == "") {
                    this.nome[cont2] = nome;

                    verif = 1;
                }
                cont2++;
            }
            contador++;
            verif = 0;
            cont2 = 0;
            this.mostra();
        } else {
            System.out.println("Lista cheia");
        }

    }

    public void remove(int posicaod) {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            contador--;
            System.out.println("Removido:" + nome[posicaod]);
            this.nome[posicaod] = "";

            this.mostra();
        }
    }

    public void mostra() {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < numele; i++) {
                System.out.printf("%10d", i);
                System.out.printf("%10s", nome[i]);
                System.out.println("");
            }
            System.out.println("----------------------");
        }
    }

    public void mostralistadefinitiva() {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            System.out.println();
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < numele; i++) {
                if (nome[i] != "") {
                    System.out.printf("%10s", nome[i]);
                    System.out.println("");
                }
            }
            System.out.println("----------------------");
        }

    }

    public void pesquisaposicao(int posicaop) {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {

            System.out.println("O nome na posição " + posicaop + " é " + nome[posicaop]);

        }
    }

    public void pesquisanome(String nome) {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            int contp = 0;
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < numele; i++) {
                if (this.nome[i].toLowerCase().equals(nome.toLowerCase())) {
                    System.out.printf("%10d", i);
                    System.out.printf("%10s", this.nome[i]);
                    System.out.println("");
                    contp++;
                }

            }
            System.out.println("----------------------");

            if (contp == 0) {
                System.out.println("Convidado não Encontrado");
            }
        }
    }

    public void pesquisapartenome(String nome) {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            int contp = 0;
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < numele; i++) {
                if (this.nome[i].toLowerCase().contains(nome.toLowerCase())) {
                    System.out.printf("%10d", i);
                    System.out.printf("%10s", this.nome[i]);
                    System.out.println("");
                    contp++;
                }

            }
            System.out.println("----------------------");

            if (contp == 0) {
                System.out.println("Convidado não Encontrado");
            }
        }
    }

    public void vetorcopia() {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            int tamnvvetor = 1;
            vetorcopia = new String[contador];
            inicializavcopia();

            for (i = 1; i < numele; i++) {
                if (nome[i] != "") {

                    this.vetorcopia[tamnvvetor] = this.nome[i];
                    tamnvvetor++;
                }

                cont2 = tamnvvetor;
            }

        }

    }

    public void mostravetornovo() {
        if (this.vetorcopia == null) {
            System.out.println("Lista do Vetor Novo vazia");
        } else {
            int i;
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < cont2; i++) {
                System.out.printf("%10d", i);
                System.out.printf("%10s", vetorcopia[i]);
                System.out.println("");
            }
            System.out.println("----------------------");
        }
    }

    public void ordenavetornovo() {
        if (this.vetorcopia == null) {
            System.out.println("Lista do Vetor Novo vazia");
        } else {
            int i;
            //Para usar o Array.sort, é preciso usar o pacote java.util.Arrays;
            Arrays.sort(vetorcopia);
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < cont2; i++) {
                System.out.printf("%10d", i);
                System.out.printf("%10s", vetorcopia[i]);
                System.out.println("");
            }
            System.out.println("----------------------");
        }

    }

    public int getNumele() {
        return numele;
    }

    public void setNumele(int numele) {
        this.numele = numele;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
