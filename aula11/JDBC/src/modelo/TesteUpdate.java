
package modelo;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class TesteUpdate {
    public static void main(String[] args) {
        Contato contato = new Contato();
        
        contato.setCodigo(3);
        contato.setNome("Roberta");
        contato.setEmail("roberta@gmail.com");
        contato.setTel("2199887766");
        contato.setDtNasc(LocalDate.of(2000, 4, 16));
        
        ContatoDAO dao = new ContatoDAO();
        System.out.println(dao.atualiza(contato));
    }
}
