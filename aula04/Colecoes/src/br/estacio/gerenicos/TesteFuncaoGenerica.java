
package br.estacio.gerenicos;

/**
 *
 * @author aluno
 */
public class TesteFuncaoGenerica {
    public static void main(String[] args) {
        Integer[] numeros = {5,4,3,8,10,-2,28};
        String[] nomes = {"Antonio", "Sandro", "Manuel", "Clara", "Bia", "Josefa", "Zico"};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
            
        System.out.println("");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        FuncoesGenericos.trocaPosicao(numeros, 3, 6);//8 ==> 28
        FuncoesGenericos.trocaPosicao(nomes, 0, 4);//Sandro ==> Josefa
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
            
        System.out.println("");
        
        for(String nome: nomes){
            System.out.print(nome + " ");
        }
        System.out.println("");
       FuncoesGenericos.maiorMenorElemento(nomes);
    }
}
