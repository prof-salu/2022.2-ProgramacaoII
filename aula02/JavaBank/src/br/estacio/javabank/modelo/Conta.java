package br.estacio.javabank.modelo;

/**
 *
 * @author aluno
 */
public class Conta {
    private Cliente cliente;
    private String numero;
    private double saldo;
    private String agencia;
    private static int totalDeContas = 0;

    public Conta(Cliente cliente, String numero, double saldo,
                 String agencia) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        totalDeContas = totalDeContas + 1;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public static int getTotalDeContas(){
        return totalDeContas;
    }
    
    public boolean deposita(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            System.out.println("Erro! Apenas valores positivos");
            return false;
        }
    }
    
    public boolean saca(double valor){
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        else{
            System.out.println("Erro! Operação não concluida!");
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta favorecido){
        if(saca(valor)){
            favorecido.deposita(valor);
            return true;
        }
        System.out.println("Erro!");
        return false;
    }
}