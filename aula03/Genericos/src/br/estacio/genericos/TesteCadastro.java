package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class TesteCadastro {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        Produto p1 = new Produto("1001", "Mouse", 20);
        
        cadastro.addProduto(p1);
        //cadastro.addProduto("Notebook");
    }
}
