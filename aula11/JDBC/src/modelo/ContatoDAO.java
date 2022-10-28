package modelo;

import conexoes.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class ContatoDAO {

    private Connection con;

    public ContatoDAO() {
        con = new Conexao().getConnection();
    }

    public boolean inserir(Contato contato) {
        //SQL INJECTION
        String sql = "INSERT INTO contato (nome, email, tel, dt_nasc) "
                + "VALUES (?,?,?,?)";
        try {
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
        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }

    public List<Contato> buscaContatos() {
        List<Contato> lista = new ArrayList();

        String sql = "SELECT * FROM contato";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Contato contato = new Contato();

                contato.setCodigo(rs.getLong("codigo"));
                contato.setNome(rs.getString("nome"));
                contato.setTel(rs.getString("tel"));
                contato.setEmail(rs.getString("email"));
                contato.setDtNasc(rs.getObject("dt_nasc", LocalDate.class));

                lista.add(contato);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;
    }

    public Contato buscaContatoPorEmail(String email) {
        Contato contato = new Contato();
        String sql = "SELECT * FROM contato WHERE email=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                contato.setCodigo(rs.getLong("codigo"));
                contato.setNome(rs.getString("nome"));
                contato.setTel(rs.getString("tel"));
                contato.setEmail(rs.getString("email"));
                contato.setDtNasc(rs.getObject("dt_nasc", LocalDate.class));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return contato;
    }

    public boolean atualiza(Contato contato) {
        String sql = "UPDATE contato SET nome=?, tel=?, email=?, dt_nasc=?"
                + "WHERE codigo=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTel());
            stmt.setString(3, contato.getEmail());
            stmt.setObject(4, contato.getDtNasc());
            stmt.setLong(5, contato.getCodigo());
                
            stmt.execute();
            stmt.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }
    
    public boolean apaga(Contato contato){
        String sql = "DELETE FROM contato WHERE codigo=?";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setLong(1, contato.getCodigo());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            return true;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
        return false;
    }
}
