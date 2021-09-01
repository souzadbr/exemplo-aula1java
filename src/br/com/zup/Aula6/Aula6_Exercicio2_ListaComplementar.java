package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio2_ListaComplementar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantidade de números que deseja calcular a média: ");
        int quantidadeNumeros = leitor.nextInt();
        double media = 0;
        double soma = 0;
        int numeroInserido = 0;


        int contador = 0;

        while (contador < quantidadeNumeros) {
            System.out.println("Digite o número " + contador + ":");
            numeroInserido = leitor.nextInt();
            soma = soma + numeroInserido;
            contador++;

        }


        media = soma / quantidadeNumeros;
        System.out.println("A média dos números inseridos é: " + media);

    }
}
