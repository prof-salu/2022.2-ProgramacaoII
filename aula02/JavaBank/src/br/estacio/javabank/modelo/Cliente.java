package br.estacio.javabank.modelo;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;

    public Cliente(String nome, String cpf, String endereco, 
                                LocalDate dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    //ALT + INSERT ==> GENERATE MENU
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
