package br.estacio.javabank.testes;

import br.estacio.javabank.modelo.Cliente;
import br.estacio.javabank.modelo.Conta;
import java.time.LocalDate;
/**
 *
 * @author aluno
 */
public class JavaBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Bruno", "99887766", "Rua Z, 456", null);
        
        c1.setNome("Carlos");
        c1.setCpf("12345678910");
        c1.setEndereco("Rua das Margaridas, 123");
        c1.setDataNascimento(LocalDate.of(1979, 6, 17));
        
        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Endereço: " + c1.getEndereco());
        System.out.println("Nascimento: " + c1.getDataNascimento());
        
        Conta conta1 = new Conta(c1, "1234", 1000, "999");
        Conta conta2 = new Conta(c1, "5678", 500, "999");
        
        System.out.println("Total de contas: " + Conta.getTotalDeContas());
        System.out.println("Total de contas: " + Conta.getTotalDeContas());
        
        conta1.deposita(250);
        conta2.deposita(-400);
        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        
        conta2.saca(100);
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        
        conta2.saca(1000);
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        
        conta2.saca(-100);
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        
        conta1.transfere(5000, conta2);
        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2: " + conta2.getSaldo());
    }
    
}
