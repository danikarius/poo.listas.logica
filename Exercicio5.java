package com.poo.lista1;

import java.util.Scanner;

    public class Exercicio5 {

    /* 5)Construa um algoritmo que calcule o valor de um terreno
         baseado na sua área e valor por m2.
         Considerando a area = largura * comprimento*/

        public static void resolucao(){

        double metro_quadrado ;

        double largura;
        
        double comprimento;

            System.out.print("Digite qual é o metro quadrado do terreno: "); 	
            Scanner leia = new Scanner(System.in);
            metro_quadrado = leia.nextDouble();


            System.out.print("Digite a largura do terreno desejado: ");

            largura = leia.nextDouble();

            System.out.print("Digite o comprimento do terreno desejado: ");

            comprimento = leia.nextDouble();

            System.out.print("O valor do terreno é de R$: "+(largura*comprimento*metro_quadrado)); 

    }
}