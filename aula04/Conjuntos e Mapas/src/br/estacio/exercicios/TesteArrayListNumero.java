
package br.estacio.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TesteArrayListNumero {
   /*
    Crie uma classe TesteArrayListNumero que possui um método main.​
        Dentro do main crie um ArrayList de Integer.​
        Adicione 10 números informados pelo usuário.​
        Percorra a lista imprimindo o valor do número inteiro de cada objeto.​
        Ordene os objetos contidos na lista.​
        Percorra a lista imprimindo o valor de cada objeto.​
    */ 
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.println("Informe um numero: ");
            lista.add(sc.nextInt());
        }
        
        sc.close();
        
        System.out.println("Lista NÃO ORDENADA");
        
        for(Integer inteiro : lista){
            System.out.print(inteiro + " ");
        }
        System.out.println("");
        
        System.out.println("Lista ORDENADA");
        
        Collections.sort(lista);
        
        for(Integer inteiro : lista){
            System.out.print(inteiro + " ");
        }
        System.out.println("");
        
    }
}
