
package br.estacio.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aluno
 */
public class TesteColecao {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(2);
        lista.add(0);
        
        Collections.sort(lista);        
        Collections.reverse(lista);
        
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }
        
        System.out.println("");
        
        System.out.println(Collections.max(lista));
        System.out.println(Collections.min(lista));
        
    }
}
