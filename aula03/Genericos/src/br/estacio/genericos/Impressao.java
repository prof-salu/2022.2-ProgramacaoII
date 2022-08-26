package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class Impressao {
    public void imprimeVetor(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("");
    }
    
    public void imprimeVetor(Double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("");
    }
    
    public void imprimeVetor(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("");
    }
}
