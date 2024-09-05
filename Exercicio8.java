package com.poo.lista1;

import java.util.Scanner;

public class Exercicio8 {
    /*8) Suponha que voce trabalhe em um laboratório e seu
         colega mediu a temperatura de um objeto em Fahrenheit.
         Escreva um programa capaz de converter em Celsius. */
    
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheint;

            System.out.println("Escreva os graus em Celsius: ");
             celsius = sc.nextDouble();

             fahrenheint = celsius * 1.8 + 32;

            System.out.printf("Graus em Farenheint: %.2f ", fahrenheint);


            sc.close();

    }
}