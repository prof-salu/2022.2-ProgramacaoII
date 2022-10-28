package modelo;

/**
 *
 * @author aluno
 */
public class TesteSelectPorEmail {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        Contato contato = dao.buscaContatoPorEmail("pedro.gol@hotmail.com");
        
        if(contato.getEmail() == null){
            System.out.println("Contato não encontrado!");
        }else{
            System.out.println(contato);
        }
        
    }
}
