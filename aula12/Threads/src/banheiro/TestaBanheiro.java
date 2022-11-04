package banheiro;

/**
 *
 * @author aluno
 */
public class TestaBanheiro {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        Thread convidado1 = new Thread(new FazNumero1(banheiro), "Mauro");
        Thread convidado2 = new Thread(new FazNumero2(banheiro), "Ana");
        Thread convidado3 = new Thread(new FazNumero1(banheiro), "Paula");
        Thread convidado4 = new Thread(new FazNumero2(banheiro), "Pedro");
       
        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
    }
}
