package br.estacio.modelo;

/**
 *
 * @author aluno
 */
public class Produto {
    private long codigo;
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto(long codigo, String descricao, double valor, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + descricao + ", R$ "+ valor + ", QTD: " + quantidade;
    }
}
