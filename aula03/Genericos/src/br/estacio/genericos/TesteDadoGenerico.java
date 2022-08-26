
package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class TesteDadoGenerico {
    public static void main(String[] args) {
        DadoGenerico<String> d1 = new DadoGenerico("Vermelho");
        DadoGenerico<Integer> d2 = new DadoGenerico(100);
        DadoGenerico<Produto> d3 = new DadoGenerico(new Produto("1", "Mouse", 100));
    }
}
