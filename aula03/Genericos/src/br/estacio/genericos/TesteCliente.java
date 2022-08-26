
package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class TesteCliente {
    public static void main(String[] args) {
        Cliente<Integer, Double> c1 = new Cliente(100, "Mauro", "mauro@email.com", 25000);
        Cliente<String, Integer> c2 = new Cliente("101", "Clara", "clara@email.com", 30000);
    }
}
