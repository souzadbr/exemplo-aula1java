package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int quantidadeNumeros = 5;
        int soma = 0;
        int multiplicacao = 1;
        int numerosInseridos = 0;

        System.out.println("Programa lê 5 números inteiros e mostra soma, multiplicação e os números.");

        while (contador <= quantidadeNumeros) {
            System.out.println("Digite o número "+contador+":");
            numerosInseridos = leitor.nextInt();

            if(numerosInseridos>=0){
                numeros.add(numerosInseridos);
                System.out.println(numeros);
                soma = soma + numerosInseridos;
                multiplicacao = multiplicacao*numerosInseridos;
                contador ++;
            }
        }
        System.out.println("A lista de números inseridos é "+numeros);
        System.out.println("A soma dos números é "+soma);
        System.out.println("A multiplicação dos números é "+multiplicacao);
    }
}
