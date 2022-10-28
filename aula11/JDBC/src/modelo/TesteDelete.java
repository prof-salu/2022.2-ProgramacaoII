
package modelo;

/**
 *
 * @author aluno
 */
public class TesteDelete {
    public static void main(String[] args) {
        Contato contato = new Contato();
        
        contato.setCodigo(2);
        
        ContatoDAO dao = new ContatoDAO();
        
        System.out.println(dao.apaga(contato));
    }
}