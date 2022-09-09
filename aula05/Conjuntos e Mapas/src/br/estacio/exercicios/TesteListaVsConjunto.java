
package br.estacio.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class TesteListaVsConjunto {
    public static void main(String[] args) {
        Collection<Integer> colecao = new ArrayList();
        
        int total = 3000000;        
        long inicio = System.currentTimeMillis();
        
        //Insert
        for(int i = 0; i <= total; i++){
            colecao.add(i);
        }
        
        //Busca
        for(int i = 0; i <= total; i++){
            colecao.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo decorrido: " + tempoDecorrido);
    }
}
