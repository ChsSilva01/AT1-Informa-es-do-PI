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
public class integrantes {
    private String[] integrantes = new String[5];  
    Scanner read = new Scanner(System.in);
    
    public void cadastrarIntegrantes(){
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do integrante: ");
            integrantes[i] = read.nextLine();
        }
        
        System.out.println("Salvo com sucesso!!");
    }
    
    public void exibirIntegrantes(){
         for(int i = 0; i < 5; i++){
            System.out.println(integrantes[i]);
        }
    }
}
