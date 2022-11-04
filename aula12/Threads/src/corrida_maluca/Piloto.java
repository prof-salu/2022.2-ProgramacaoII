package corrida_maluca;

/**
 *
 * @author aluno
 */
public class Piloto implements Runnable{
    private String nome;
    private double velocidade;
    private double distanciaPercorrida;
    private double distanciaCircuito;

    
    public Piloto(String nome, double velocidade, double distanciaCircuito) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.distanciaCircuito = distanciaCircuito;
    }
    
    public void acelerar(){
        while(distanciaPercorrida <= distanciaCircuito){
            distanciaPercorrida += velocidade;
            System.out.printf(nome + " esta no km %.2f\n", distanciaPercorrida);
        }
        
        System.out.println(nome + " terminou.");
    }
    
    @Override
    public void run(){
        acelerar();
    }
}
