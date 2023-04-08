/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_01;

public class ListaEstatica {

    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimencionar() {
        int[] novoVetor = new int[info.length + 10];

        System.arraycopy(info, 0, novoVetor, 0, info.length);

        info = novoVetor;
    }

    /*public void inserir(int valor) {
        if (tamanho == info.length) {
            redimencionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }*/
    
    public void inserir(int valor) {
		if(tamanho == info.length) {
			redimensionar();
		}
		for(int i = 0; i <tamanho; i++) {
			if(info[i] < valor && info[i] > valor) {
				info[i + 1] = valor;
			}else {
				info[i] = info[i + 1];
			}
			tamanho ++;
		}
	}

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    public void retirar(int valor) {
        for (int i = 0; i < (tamanho - 1); i++) {
            if (info[i] == valor) {
                for (int j = i; j < tamanho; j++) {
                    info[j] = info[j + 1];
                }
                tamanho--;
                return;
            }
        }
    }

    public void liberar() {
        int[] novoVetor = new int[10];

        System.arraycopy(info, 0, novoVetor, 0, novoVetor.length);

        info = novoVetor;
        tamanho = 10;
    }

    public int obterElemento(int posicao) {
        if (tamanho >= posicao || posicao < 0) {
            return info[posicao];
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String lista = "";

        for (int i = 0; i < tamanho; i++) {
            if (i == (tamanho - 1)) {
                lista += info[i] + "";
            } else {
                lista += info[i] + ",";
            }
        }

        return lista;
    }
}
