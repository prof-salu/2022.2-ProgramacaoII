package br.estacio.gerenicos;

/**
 *
 * @author aluno
 */
public class FuncoesGenericos {
    public static <T> void trocaPosicao(T[] vetor, 
                                        int posInicial, 
                                        int posFinal){
        T temp = vetor[posFinal];
        
        vetor[posFinal] = vetor[posInicial];
        vetor[posInicial] = temp;       
    }
    
    public static <T extends Comparable> void maiorMenorElemento(T[] vetor){
        
        T maior = vetor[0];
        T menor = vetor[0];
        
        for(T elemento : vetor){
            if(maior.compareTo(elemento) < 0 ){
                maior = elemento;
            }
            
            if(menor.compareTo(elemento) > 0){
                menor = elemento;
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}