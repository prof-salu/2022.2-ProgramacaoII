package testes;

import java.time.LocalDate;
import modelo.Contato;
import modelo.ContatoDAO;

/**
 *
 * @author aluno
 */
public class TesteInsert {

    public static void main(String[] args) {
        Contato c1 = new Contato();
        c1.setNome("Mariana");
        c1.setEmail("mariana@hotmail.com");
        c1.setTel("11998877665");
        c1.setDtNasc(LocalDate.of(2001, 9, 27));
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.inserir(c1);
    }
}
