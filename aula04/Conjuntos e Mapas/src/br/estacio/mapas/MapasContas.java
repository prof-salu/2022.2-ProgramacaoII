package br.estacio.mapas;

import br.estacio.conjuntos.Conta;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class MapasContas {
    public static void main(String[] args) {
        //Map<KEY, VALUE>
        Map<String, Conta> mapa = new HashMap();
        
        Conta c1 = new Conta(1234,9876, 1000);
        Conta c2 = new Conta(1234,9877, 1250);
        Conta c3 = new Conta(1234,9878, 1500);
        Conta c4 = new Conta(1234,9879, 1750);
        Conta c5 = new Conta(1234,9880, 2000);
        
        mapa.put("Gabi", c1);
        mapa.put("Fernanda", c2);
        mapa.put("Maicom", c3);
        mapa.put("Rafael", c4);
        
        Conta contaGabi = mapa.get("Gabi");
        
        System.out.println(contaGabi);
        System.out.println(mapa.get("Fernanda").getSaldo());
    }
}
