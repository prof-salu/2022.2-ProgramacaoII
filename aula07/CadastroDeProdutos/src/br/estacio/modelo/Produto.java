package br.estacio.modelo;

/**
 *
 * @author aluno
 */
public class Produto {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public Produto(String codigo, String descricao, int quantidade, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        //[1001] Descrição: Notebook, Quantidade: 100, Preço: 5500
        return "["+ codigo+"]" + " Descrição: " + descricao + 
                ", Quantidade: " + quantidade + ", Preço: " + preco;
    }    
}
