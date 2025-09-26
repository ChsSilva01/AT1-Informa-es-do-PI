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
    Scanner read = new Scanner(System.in);
    apresentacao ap = new apresentacao();
    ods o = new ods();
    integrantes inte = new integrantes();
    
    public void principal(){
        int navegar, i = 0;
        
        while(i < 1){
            System.out.println("O que gostaria de fazer? \n 1 - Preencher o texto ou exibir \n 2 - Escolher a ODS ou exibir\n 3 - Informar os integrantes ou exibir\n 4 - Sair");
            navegar = read.nextInt();
            System.out.println("----------------------------------");
            
            switch(navegar){
                case 1:
                    if(ap.getVerificacao() == 0){
                        ap.cadastrarApresentacao();
                        System.out.println("----------------------------------");
                    } else if (ap.getVerificacao() != 0){
                        ap.exibirApresentar();
                        System.out.println("----------------------------------");
                    }                    
                    break;
                case 2:
                    if(o.getVerificacao() == 0){
                        o.cadastrarODS();
                        System.out.println("----------------------------------");
                    } else if (o.getVerificacao() != 0){
                        o.exibirODS();
                        System.out.println("----------------------------------");
                    }
                    break;
                case 3:
                    if(inte.getVerificacao() == 0){
                        inte.cadastrarIntegrantes();
                        System.out.println("----------------------------------");
                    } else if (o.getVerificacao() != 0){
                        inte.exibirIntegrantes();
                        System.out.println("----------------------------------");
                    }
                    break;
                case 4:
                    i++;
                    break;
                default:
                    System.out.println("Por favor digite um numero entre os listados");
                    break;
            }
            
            
        }
    }
}
