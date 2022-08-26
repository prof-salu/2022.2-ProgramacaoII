/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.genericos;

/**
 *
 * @author aluno
 */
public class ImpressaoGenerica {
    public <T> void imprimeVetor(T[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("");
    }
}
