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
public class FilaCalc_v2 {

    private String nome[];
    private int contador, numele;

    public void FilaCalc_v2(int elem) {
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

    public void mostra() {
        if (this.vazia()) {
            System.out.println("Fila vazia");
        } else {
            int i;
            System.out.println();
            for (i = 0; i < numele; i++) {
                System.out.printf("%10d", i);
            }

            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");

            for (i = 0; i < numele; i++) {
                System.out.printf("%10s", nome[i]);
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    public void insere(String nome) {
        if (!this.cheia()) {
            this.nome[contador] = nome;
            contador++;
            this.mostra();
        } else {
            System.out.println("Fila cheia");
        }

    }

    public void remove() {
        if (this.vazia()) {
            System.out.println("Fila vazia");
        } else {
            int i;
            contador--;
            System.out.println("Removido:" + nome[1]);
            this.nome[1] = "";
            // movimentando os nomes
            for (i = 1; i <= contador; i++) {
                nome[i - 1] = nome[i];
            }
            nome[contador] = "";
            this.mostra();
        }
    }

    public void furafila(int posicao, String nome) {
        // este método fica para vocês implementarem
        if (!this.cheia()) {
            int i = 1;
            int cont = 1;
            //    posicao--;
            cont = contador - 1;
            for (i = cont; i >= posicao; i--) {
                if (i > posicao) {
                    this.nome[i + 1] = this.nome[i];
                } else {
                    this.nome[i + 1] = this.nome[i];
                    this.nome[i] = nome;
                }
            }
            this.mostra();
            contador++;

        }

    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
