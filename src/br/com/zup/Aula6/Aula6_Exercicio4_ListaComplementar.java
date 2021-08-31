package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio4_ListaComplementar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Esse programa vai te ajudar a somar os números inseridos");
        System.out.println("Quantos números deseja inserir? ");

        double quantidadeDeNumerosInseridos = leitor.nextDouble();
        int contador = 0;
        double soma = 0;

        while(contador < quantidadeDeNumerosInseridos){

            System.out.println("Digite o número:");
            double numeroInseridoUsuario = leitor.nextDouble();
            contador ++;

            soma = soma + numeroInseridoUsuario;
        }

        System.out.println("A soma dos números inseridos é: "+soma);
    }
}
