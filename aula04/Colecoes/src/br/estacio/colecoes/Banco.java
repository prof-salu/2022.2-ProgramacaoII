package br.estacio.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Banco {
    private List<Conta> lista = new ArrayList();
    
    public void addConta(Conta conta){
        //Adiciona uma conta a lista
        lista.add(conta);
    }
    
    public void removeConta(Conta conta){
        //Remove um elemento da lista
        lista.remove(conta);
    }
    
    public void removeContaPorPosicao(int posicao){
        //Remove um elemento da lista em determinada posição
        lista.remove(posicao);
    }
    
    public void pesquisaContaPorInstancia(Conta conta){
        System.out.println(lista.contains(conta));
    }
    
    public void pesquisaContaPorNumeroDaConta(int numero){
        Conta busca = null;
        
        for(Conta conta: lista){
            if(conta.getNumero() == numero){
                busca = conta;
                break;
            }
        }
        
        if(busca != null){
            System.out.println(busca);
        }else{
            System.out.println("Conta não encontrada!");
        }
    }
    
    public void imprimeContas(){
        //imprime todas as contas da lista
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println("");
    }
    
    public void totalDeContas(){
        System.out.println("Total de contas: " + lista.size());
    }
    
    public void ordenaContas(){
        Collections.sort(lista);
    }
}
