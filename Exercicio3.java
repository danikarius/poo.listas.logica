package com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {


    public static void resolucao(){

        /* 3) Escreva uma calculadora que receba um valor em reais e
              converta para dólar. Considere o valor do dólar a R$5,25.*/

        double valorreal;
        double conversao;

            System.out.print("Digite o valor à ser convertido em dólar: "); 	
            Scanner leia = new Scanner(System.in); 			
            valorreal = leia.nextDouble(); 
            conversao = (valorreal * 5.25);

            System.out.print("O valor em dólar é: " + conversao);

    }

}