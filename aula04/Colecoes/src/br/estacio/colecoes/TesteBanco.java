
package br.estacio.colecoes;

import java.util.Collections;

/**
 *
 * @author aluno
 */
public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Conta c1 = new Conta(1001, 345, 800);
        Conta c2 = new Conta(1001, 346, 200);
        Conta c3 = new Conta(1001, 347, 500);
        Conta c4 = new Conta(1001, 348, 150);
        Conta c5 = new Conta(1001, 349, 750);
        
        Conta c6 = new Conta(1001, 349, 750);
        Conta c7 = c1;
        
        banco.addConta(c1);
        banco.addConta(c2);
        banco.addConta(c3);
        banco.addConta(c4);
        banco.addConta(c5);
        
        banco.imprimeContas();
        banco.totalDeContas();
        
        banco.removeContaPorPosicao(3);
        banco.totalDeContas();
        System.out.println("");
        banco.imprimeContas();
        
        banco.pesquisaContaPorInstancia(c6);//false
        banco.pesquisaContaPorInstancia(c7);//true
        
        banco.pesquisaContaPorNumeroDaConta(346);
        
        banco.ordenaContas();
        
        System.out.println("");
        banco.imprimeContas();
    }
}
