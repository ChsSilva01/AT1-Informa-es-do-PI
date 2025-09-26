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
public class ods {
    private String[] ods = {
        "1 - Erradicação da Pobreza",
        "2 - Fome Zero e Agricultura Sustentável",
        "3 - Saúde e Bem-Estar",
        "4 - Educação de Qualidade",
        "5 - Igualdade de Gênero",
        "6 - Água Potável e Saneamento",
        "7 - Energia Limpa e Acessível",
        "8 - Trabalho Decente e Crescimento Econômico",
        "9 - Indústria, Inovação e Infraestrutura",
        "10 - Redução das Desigualdades",
        "11 - Cidades e Comunidades Sustentáveis",
        "12 - Consumo e Produção Responsáveis",
        "13 - Ação Contra a Mudança Global do Clima",
        "14 - Vida na Água",
        "15 - Vida Terrestre",
        "16 - Paz, Justiça e Instituições Eficazes",
        "17 - Parcerias e Meios de Implementação"
    };
    private String numeroods;
    private String[] separar = new String[2];
    private int verificacao;
    Scanner read = new Scanner(System.in);
    
    public void cadastrarODS(){
        System.out.println("Selecione uma das 17 ODS (separados por espaço)");
        numeroods = read.nextLine();
        
        separar = numeroods.split(" ");
        verificacao++;
    }
    
    public int getVerificacao(){
        return verificacao;
    }
    
    public void exibirODS(){
        for(int i = 0; i < separar.length; i ++){
            int j;
            j = Integer.parseInt(separar[i]);
            System.out.println(ods[j - 1]);
        } 
    }
}
