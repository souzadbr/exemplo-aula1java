package br.com.zup;

import java.util.Scanner;

public class Aula2_Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorF;
        double valorCelsius;

        System.out.println("Vamos te ajudar a transformar graus Fahrenheit em graus Celsius: ");
        System.out.println("Digite o valor em Fahrenheit: ");

        valorF = leitor.nextDouble();
        valorCelsius = ( valorF - 32 )/ 1.8;

        System.out.println("O valor em Fahrenheit " + valorF + " em graus Celsius é " + valorCelsius);
    }
}
