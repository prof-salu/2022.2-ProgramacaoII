package br.estacio.conjuntos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class ConjuntoContas {
    public static void main(String[] args) {
        Set<Conta> conjunto = new HashSet();
        
        Conta c1 = new Conta(1234,9876, 1000);
        Conta c2 = new Conta(1234,9877, 1250);
        Conta c3 = new Conta(1234,9878, 1500);
        Conta c4 = new Conta(1234,9879, 1750);
        Conta c5 = new Conta(1234,9880, 2000);
        
        conjunto.add(c1);
        conjunto.add(c2);
        conjunto.add(c3);
        conjunto.add(c4);
        conjunto.add(c5);
        
        System.out.println("Tamanho conjunto: " + conjunto.size());
        
        conjunto.add(c5);
        System.out.println("Tamanho conjunto: " + conjunto.size());
        
        //Imprimindo
        for(Conta conta : conjunto){
            System.out.println(conta);
        }
    }
}
