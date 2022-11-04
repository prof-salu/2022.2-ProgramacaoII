
package download;

/**
 *
 * @author aluno
 */
public class BarraDeProgresso implements Runnable{
    
    @Override
    public void run(){
        executa();
    }
    
    public void executa(){
        for (int i = 1; i < 10000; i++) {
            System.out.println("Atualizando download: " + i);
        }
    }
}
