package br.com.zup;

import java.util.Scanner;

public class Aula2_ComparaçãoDeDados2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Vamos te ajudar a escolher o maior número: ");

        System.out.println("por favor digite o primeiro número: ");
        double primeireNumero = leitor.nextDouble();

        System.out.println("Por favor digite o segundo numero: ");
        double segundoNumero = leitor.nextDouble();


        if(primeireNumero>segundoNumero) {
            System.out.println("O primeiro número é o maior");
        }
        else {
            System.out.println("O segundo numero é o maior!");
        }

    }}
