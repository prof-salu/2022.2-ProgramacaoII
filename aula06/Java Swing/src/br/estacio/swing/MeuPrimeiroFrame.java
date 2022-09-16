package br.estacio.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//CTRL + SHIFT + I (FIX ALL IMPORTS)
/**
 *
 * @author aluno
 */
public class MeuPrimeiroFrame extends JFrame{
    public MeuPrimeiroFrame(){
        super("Meu primeiro App Swing");
    }
    
    public void iniciar(){
        //(x, y, largura, altura)
        setBounds(200, 400, 400, 150); 
        
        //Painel para alocação de componentes SWING
        JPanel painel = new JPanel();
        JButton botao = new JButton("Sou um botão");
        JLabel texto = new JLabel("Texto estático");
        
        getContentPane().add(painel);
        painel.add(botao);
        painel.add(texto);
        //Exibe o frame
        setVisible(true);
        //Encerrar a aplicação
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
