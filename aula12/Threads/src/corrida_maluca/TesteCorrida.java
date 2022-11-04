package corrida_maluca;

/**
 *
 * @author aluno
 */
public class TesteCorrida {
    public static void main(String[] args) {
        float tamanhoCircuito = 30;
        Piloto p1 = new Piloto("Mauro", 1.1, tamanhoCircuito);
        Piloto p2 = new Piloto("Ana", 1.2, tamanhoCircuito);
        Piloto p3 = new Piloto("Carla", 1.3, tamanhoCircuito);
        Piloto p4 = new Piloto("Pedro", 1.4, tamanhoCircuito);
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
//        p1.acelerar();
//        p2.acelerar();
//        p3.acelerar();
//        p4.acelerar();
        
    }
}
