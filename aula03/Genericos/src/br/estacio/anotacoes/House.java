
package br.estacio.anotacoes;

/**
 *
 * @author aluno
 */
public interface House {
    /***
     * 
     * @deprecated
     */
    @Deprecated
    public void open();
    
    public void openFrontDoor();
    public void openBackDoor();
}