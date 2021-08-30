package br.com.zup.Aula5;

import java.util.Scanner;

public class Aula5_Lista4_Exercicio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
//Programa para ler 5 números e mostrar resdultado soma.
        int quantidadeDeNumeros = 5;
        double soma = 0;

       int contador = 0;
        while (contador< quantidadeDeNumeros){
            System.out.println("Insira o valor: ");
            double valorInseridoPeloUsuario = leitor.nextDouble();
            contador ++;
            soma = soma+valorInseridoPeloUsuario;
        }
        System.out.println("A soma dos % valores inseridos é: " + soma);
    }
}
