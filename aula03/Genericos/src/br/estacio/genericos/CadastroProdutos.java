
package br.estacio.genericos;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class CadastroProdutos {
    private ArrayList<Produto> lista = new ArrayList();
    
    public void addProduto(Produto produto){
        lista.add(produto);
        //lista.add("Notebook");
    }
}
