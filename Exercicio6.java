package com.poo.lista1;

    import java.util.Scanner;
    
    public class Exercicio6 {
        /*6) Construa um algoritmo que leia 1- a distância percorrida
             por um veículo em km 2- o total gasto em combustível em
             litros. No final deverá ser respondido o consumo médio deste
             veículo em km/l.*/
        
        public static void resolucao() {
           
            Scanner leia = new Scanner(System.in);
    
            double distancia, total_gasto, consumo_medio;
    
            System.out.println("Digite a distancia percorrida em Quilometros (Km): ");
            distancia = leia.nextDouble();
    
            System.out.println("Digite o total gasto de combustível em Litros (L): ");
            total_gasto = leia.nextDouble();
    
            consumo_medio = distancia / total_gasto;
    
            System.out.println("O consumo médio em (Km/L) foi de: "+ consumo_medio);
    
        }
    }