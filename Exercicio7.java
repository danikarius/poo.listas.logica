package com.poo.lista1;

import java.util.Scanner;

public class Exercicio7 {

     /*7) Escreva um programa que receba quatro notas de um
        aluno e calcule a média aritmética dessas notas.*/
    
    public static void resolucao() {

         String aluno; 
         String disciplina;
         double nota1;
         double nota2;
         double nota3;
         double nota4;

            System.out.println("Digite o nome do aluno: "); 
            Scanner leia = new Scanner(System.in); 
            aluno = leia.nextLine(); 

            System.out.println("Digite o nome da disciplina: "); 
            disciplina = leia.nextLine(); 

            System.out.println("Digite a nota do primeiro bimestre: ");
            nota1 = leia.nextDouble();

            System.out.println("Digite a nota do segundo bimestre: ");
            nota2 = leia.nextDouble();

            System.out.println("Digite a nota do terceiro bimestre: ");
            nota3 = leia.nextDouble();

            System.out.println("Digite a nota do quarto bimestre: ");
            nota4 = leia.nextDouble();

            System.out.println("A média do(a) aluno(a) "+ aluno + " na disciplina: " + disciplina + " é "+ ((nota1+nota2+nota3+nota4)/4));

    }

}