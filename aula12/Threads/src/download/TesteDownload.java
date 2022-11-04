package download;

/**
 *
 * @author aluno
 */
public class TesteDownload {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        CopiadorDeArquivos download = new CopiadorDeArquivos();
        
        Thread t1 = new Thread(barra);
        Thread t2 = new Thread(download);
        
        //download.executa();
        //barra.executa();
        
        t1.start();
        t2.start();
        
        
    }
}