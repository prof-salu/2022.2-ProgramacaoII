
package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    private String url = "jdbc:mysql://localhost:3306/agenda";
    private String user = "root";
    private String senha = "admin";
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(url, user, senha);
        }catch (SQLException e){
            System.out.println(e);
            throw new RuntimeException();
        } finally{
            System.out.println("Conexao encerrada.");
        }
    }
}