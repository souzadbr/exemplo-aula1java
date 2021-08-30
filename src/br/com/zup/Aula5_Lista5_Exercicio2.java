package br.com.zup;

import java.util.Scanner;

public class Aula5_Lista5_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtNumerosImpares = 0;
        int contador = 1;

        System.out.println("Digite quantos numeros quer inserir: ");
        double qtDeNumeros = leitor.nextDouble();

        while (contador <= qtDeNumeros) {
            System.out.println("digite o numero  " + contador + ":");
            double valorDigitadoPeloUsuario = leitor.nextDouble();

            if (valorDigitadoPeloUsuario % 2 != 0) {
                qtNumerosImpares = qtNumerosImpares + 1;

            }
            contador++;
        }

        System.out.println("A quantidade de numeros impares é:" + qtNumerosImpares);

    }}
