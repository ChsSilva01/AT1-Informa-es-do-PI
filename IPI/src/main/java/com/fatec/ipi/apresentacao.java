/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.ipi;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class apresentacao {
    private String nome;
    private String introducao;
    private String objetivo;
    private String metodologia;
    private String resumo;
    
    Scanner read = new Scanner(System.in);
    
    public void cadastrarApresentacao(){
        System.out.println("Digite o nome do seu PI: ");
        nome = read.nextLine();
        
        System.out.println("Digite a introducao do seu PI: ");
        introducao = read.nextLine();
        
        System.out.println("Digite o objetivo: ");
        objetivo = read.nextLine();
        
        System.out.println("Digite a metodologia: ");
        metodologia = read.nextLine();
        
        System.out.println("Digite o resumo: ");
        resumo = read.nextLine();
    }
    
    public void exibirApresentar(){
        System.out.println(
                "**"+nome+"** \n"
                +"**INTRODUCAO** \n"
                +introducao + "\n"
                +"**OBJETIVO** \n"
                +objetivo + "\n" 
                +"**METODOLOGIA** \n"
                +metodologia + "\n"
                +"**RESUMO** \n"
                +resumo+ "\n"
                );
    }
}
