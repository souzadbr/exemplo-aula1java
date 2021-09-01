package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("O objetivo desse programa e te ajudar a calcular tabuadas!");

        int contador = 0;
        int valorACalcular = 10;
        int valorTabuada = 0;

        System.out.println("Qual o numero da tabuada que deseja calcular?");
        valorTabuada = leitor.nextInt();

        while (contador <= valorACalcular) {
            System.out.println(valorTabuada + "x" + contador + "=" + (valorTabuada * contador));
            contador++;
        }
    }
}
