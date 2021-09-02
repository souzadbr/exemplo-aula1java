package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List <Integer> pares = new ArrayList<>();
        List <Integer> impares =new ArrayList<>();

        int quantidadeNumeros = 20;
        int numerosInseridos = 0;
        int contador = 1;

        while(contador<=quantidadeNumeros){
            System.out.println("Insira um número a ser verificado como par ou impar - Numero "+contador+":");
            numerosInseridos = leitor.nextInt();

            if(numerosInseridos%2==0){
                pares.add(numerosInseridos);
                contador++;
            }else {
                impares.add(numerosInseridos);
               contador++;
            }
        }
        System.out.println("Lista numeros pares é "+pares);
        System.out.println("Lista numeros impares´é "+impares);
    }
}
