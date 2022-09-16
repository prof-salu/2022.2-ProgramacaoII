
package br.estacio.soma;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class SomaGUI {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "App de soma");
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
        
        double soma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}