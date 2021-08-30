package br.com.zup.Aula5;

import java.util.Scanner;

public class aula5_Lista4_Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double quantidadeDeNumeros;
        double soma = 0;
        double media = 0;

        int contador =0;
        System.out.println("Por favor digite a quantidade números: ");
        quantidadeDeNumeros = leitor.nextDouble();

        while(contador<quantidadeDeNumeros){
            System.out.println("Digite um numero: ");
            double valorLidoPeloUsuario = leitor.nextDouble();
            //Toda vez que execultador o loop nos vamos somar o o valor lido a variavel soma
            soma = soma +valorLidoPeloUsuario;
            contador ++;

        }
        media = soma/quantidadeDeNumeros;
        System.out.println("A média dos numeros é: "+media );
    }
}
