package br.estacio.conjuntos;

/**
 *
 * @author aluno
 */
public class Conta implements Comparable<Conta>{
    private int agencia;
    private int numero;
    private double saldo;
    //ALT + INSERT ==> GENERATE
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }    

    @Override
    public int compareTo(Conta outro) {
        //Ordenando por numero de conta
        if(getSaldo()> outro.getSaldo()){
            return 1;
        }
        
        if(getSaldo() < outro.getSaldo()){
            return -1;
        }
        
        return 0;
    }    
}