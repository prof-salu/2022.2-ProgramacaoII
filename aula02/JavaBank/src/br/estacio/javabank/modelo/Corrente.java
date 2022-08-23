package br.estacio.javabank.modelo;

/**
 *
 * @author aluno
 */
public class Corrente extends Conta{
    private double chequeEspecial;
    
    public Corrente(Cliente cliente, String numero, double saldo,
                    String agencia){
        super(cliente, numero, saldo, agencia);
        this.chequeEspecial = 1000;
    }
}
