
package br.estacio.anotacoes;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa extends Object{
    private String nome;
    private double salario;
    private String profissao;

    public Pessoa(String nome, double salario, String profissao) {
        this.nome = nome;
        this.salario = salario;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", salario=" + salario + ", profissao=" + profissao + '}';
    }
    
    public void dataDeHoje(){
        Date data = new Date();
        
        System.out.println(data.getDate());
    }
    
    
}