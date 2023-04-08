/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_01;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEstatica estatica = new ListaEstatica();
        estatica.inserir(5);
        estatica.inserir(10);
        estatica.inserir(15);
        estatica.inserir(20);
        estatica.obterElemento(3);
        
    }
    
}
