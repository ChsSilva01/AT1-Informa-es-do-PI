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
    private int verificacao;
    
    public void principal(){
        int navegar, i = 0;
        
        while(i < 1){
            System.out.println("O que gostaria de fazer? \n 1 - Preencher o texto \n 2 - Escolher a ODS\n 3 - Informar os integrantes\n 4 - Sair");
            navegar = read.nextInt();
            
            switch(navegar){
                case 1:
                    ap.cadastrarApresentacao();
                    ap.exibirApresentar();
                    break;
                case 2:
                    o.cadastrarODS();
                    o.exibirODS();
                    break;
                case 3:                    
                    inte.cadastrarIntegrantes();
                    inte.exibirIntegrantes();
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
