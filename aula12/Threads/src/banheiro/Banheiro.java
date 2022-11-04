package banheiro;

/**
 *
 * @author aluno
 */
public class Banheiro {

    public void fazNumero1() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta.");

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro.");
            System.out.println(nome + " fazendo coisa rápida.");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(nome + " dando descarga.");
            System.out.println(nome + " lavando as mãos.");
            System.out.println(nome + " saindo do banheiro.");
        }
    }

    public void fazNumero2() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta.");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro.");
            System.out.println(nome + " fazendo coisa demorada.");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(nome + " dando descarga.");
            System.out.println(nome + " lavando as mãos.");
            System.out.println(nome + " saindo do banheiro.");
             
        }
    }
}
