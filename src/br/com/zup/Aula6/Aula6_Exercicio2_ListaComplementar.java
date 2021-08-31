package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio2_ListaComplementar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantidade de números que deseja calcular a média: ");
        double quantidadeNumeros = leitor.nextDouble();
        double media = 0;
        double soma = 0;
        double numeroInserido = 0;


        int contador = 0;

        while (contador < quantidadeNumeros) {
            System.out.println("Digite o número " + contador + ":");
            numeroInserido = leitor.nextDouble();
            soma = soma + numeroInserido;
            contador++;

        }


        media = soma / quantidadeNumeros;
        System.out.println("A média dos números inseridos é: " + media);

    }
}
