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
        c1.setNome("Pedro");
        c1.setEmail("pedro.gol@hotmail.com");
        c1.setTel("21998877778");
        c1.setDtNasc(LocalDate.of(1998, 10, 27));
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.inserir(c1);
    }
}
