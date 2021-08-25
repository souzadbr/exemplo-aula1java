package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo3 {
    //Faça um programa que recebe 4 notas e mostre a média.
    public static void main(String[] args) {
       //Instaciar o Scanner

        Scanner leitor = new Scanner(System.in);
       //Declarar e receber todas as variaveis
       double nota1 ;
       double nota2 ;
       double nota3 ;
       double nota4 ;
       double soma;
       double media;

       //Receber valores das variáveis

        System.out.println("Vou calcular a média das notas para você.");
        System.out.println("Por favor digite a nota1: ");
        nota1 = leitor.nextDouble();
        System.out.println("Por favor digite a nota2: ");
        nota2 = leitor.nextDouble();
        System.out.println("Por favor digite a nota3: ");
        nota3 = leitor.nextDouble();
        System.out.println("Por favor digite a nota4: ");
        nota4 = leitor.nextDouble();

        // Processar os dados

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;
        //Exibir os dados
        System.out.println("A suá media de todas as notas é: ");
        System.out.println(media);
    }
}
