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
public class informacoesPI {
    private String apresentacao;
    private String ods;
    private String[] equipe = new String[5];
    private int qtdintegrantes;
    
    Scanner read = new Scanner(System.in);
    
    public void cadastrarInformacoesPI(){
        System.out.println("Faca uma apresentacao sobre seu PI: ");
        apresentacao = read.nextLine();
        
        System.out.println("Escreva a qual ODS seu PI esta relacionado: ");
        ods = read.nextLine();
        
        System.out.println("Digite a quantidade de integrantes do seu grupo: ");
        qtdintegrantes = read.nextInt();
        
        for(int i = 0; i < qtdintegrantes; i++){
            System.out.println("Digite o nome do integrante: ");
            equipe[i] = read.nextLine();
        }
        
        System.out.println("Salvo com sucesso!!");
    }
    
    public void exibirInformacoesPI(){
        System.out.println("**APRESENTAÇÃO:** \n"
                + apresentacao +"\n"
                + "**ODS:** \n" 
                + ods );
        for(int i = 0; i < 5; i++){
            System.out.println(equipe[i]);
        }
    }
}
