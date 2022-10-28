package testes;

import conexoes.Conexao;
import java.sql.Connection;

/**
 *
 * @author aluno
 */
public class TesteConexao {
    public static void main(String[] args) {
        System.out.println("Conectado.");
        Connection con = new Conexao().getConnection();
        
        //Caminho do driver
        //C:\Program Files (x86)\MySQL\Connector J 8.0
        
    }
}
