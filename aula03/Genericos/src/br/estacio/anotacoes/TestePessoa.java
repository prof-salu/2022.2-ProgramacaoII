package br.estacio.anotacoes;

/**
 *
 * @author aluno
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 4000, "Programador");
        
        
        System.out.println(p1);
        
        p1.dataDeHoje();
    }
}
