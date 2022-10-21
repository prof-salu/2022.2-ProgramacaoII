
package modelo;

import conexoes.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class ContatoDAO {
    private Connection con;
    
    public ContatoDAO(){
        con = new Conexao().getConnection();
    }
    
    public boolean inserir(Contato contato){
        //SQL INJECTION
        String sql = "INSERT INTO contato (nome, email, tel, dt_nasc) "
                    +"VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getTel());
            stmt.setObject(4, contato.getDtNasc());
            stmt.execute();
            System.out.println("Contanto gravado com sucesso");
            stmt.close();
            con.close();
            return true;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return false;
    }
}
