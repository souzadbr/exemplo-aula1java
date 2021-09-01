package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio1_Extra {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos te ajudar a descobrir se o número inserido é um número primo!");

        int primo = 0;
        int contador = 1;
        int numeroInseridoUsuario = 1;

        System.out.println("digite o numero a ser verificado se é primo:");
        numeroInseridoUsuario = leitor.nextInt();

        for (contador = 1; contador <= numeroInseridoUsuario; contador++) {
            if (numeroInseridoUsuario % contador == 0) {
                primo++;
            }
        }
        if (primo == 2) {
            System.out.println("O número " + numeroInseridoUsuario + " é PRIMO!");
        } else {
            System.out.println("Esse número não é primo!");
        }


    }
}

