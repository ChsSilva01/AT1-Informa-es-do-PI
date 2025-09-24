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
public class menu {
    public menu(){
        int navegar, i = 0;
        
        Scanner read = new Scanner(System.in);
        apresentacao ap = new Apresentacao();
        
        while(i < 1){
            System.out.println("Seja bem-vindo!!");
            System.out.println("O que gostaria de fazer? \n 1 - Cadastrar informacoes PI \n 2 - Ver informacoes do grupo\n 3 - Finalizar o programa");
            navegar = read.nextInt();

            switch(navegar){
                case 1:
                                        
                    break;
                case 2:
                    info.exibirInformacoesPI();
                    break;
                case 3:                    
                    i++;
                    break;
                default:
                    System.out.println("Por favor digite um numero entre os listados");
                    break;
            }
            
            
        }
    }
}
