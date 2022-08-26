
package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class Cliente<T, U> {
    private T codigo;
    private String nome;
    private String email;
    private U faixaSalarial;

    public Cliente(T codigo, String nome, String email, U faixaSalarial) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.faixaSalarial = faixaSalarial;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }
    
    public U getFaixaSalarial(){
        return faixaSalarial;
    }
    
    public void setFaixaSalarial(U faixaSalarial){
        this.faixaSalarial = faixaSalarial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
