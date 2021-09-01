package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio2_Extra {
    public static void main(String[] args) {
        /*
        2. Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

         */

        int inicioIntervalo = 1;
        int finalIntervalo = 51;
        int soma = 0;
        int numeroImpares = 0;


        System.out.println("Esse programa vai calcular os 50 primeiro números impares dentro do intervalo desejado");

        while (inicioIntervalo <= finalIntervalo) {
            if (inicioIntervalo % 2 != 0) {
                numeroImpares = inicioIntervalo;
                soma = soma + numeroImpares;
                System.out.println(numeroImpares); //Mostrando os numeros para ter certeza que estão aparecendo apenas impares.
            }

            inicioIntervalo++;
        }

        System.out.println("A soma dos números Impares dos primeiros 50 números é " + soma);
    }
}
