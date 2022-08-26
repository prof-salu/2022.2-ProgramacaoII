
package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class TesteImpressaoGenerica {
    public static void main(String[] args) {
        ImpressaoGenerica printGenerico = new ImpressaoGenerica();
        
        Double[] vet1 = new Double[4];
        
        vet1[0] = Double.valueOf(10);
        vet1[1] = Double.valueOf(20);
        vet1[2] = Double.valueOf(30);
        vet1[3] = Double.valueOf(40);
        
        printGenerico.imprimeVetor(vet1);
        
        String[] vet2 = new String[4];
        
        vet2[0] = "Azul";
        vet2[1] = "Verde";
        vet2[2] = "Vermelho";
        vet2[3] = "Preto";
        
        printGenerico.imprimeVetor(vet2);
        
        System.out.println(vet1);
        System.out.println(vet2);
    }
}
