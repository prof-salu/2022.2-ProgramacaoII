package testes;

import java.util.List;
import modelo.Contato;
import modelo.ContatoDAO;

/**
 *
 * @author aluno
 */
public class TestaSelect {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        List<Contato> lista = dao.buscaContatos();
        
        for (Contato contato: lista) {
            System.out.println(contato);
        }
    }
}
