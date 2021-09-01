package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Esse programa vai te ajudar a verificar qual numero dentro 5 números inseridos é o maior");

        int quantidadeDeNumeroInseridos = 5;
        int numeroInseridoUsuario = 0;
        int contador = 1;
        int maiorValor = 0;

        while (contador<=quantidadeDeNumeroInseridos){
            System.out.println("Digite o número"+ contador +":");
            numeroInseridoUsuario = leitor.nextInt();

            if (maiorValor<numeroInseridoUsuario){
                maiorValor = numeroInseridoUsuario;
            }
            System.out.println("O maior numero é "+maiorValor);
            contador ++;

        }
        System.out.println("O maior numero é "+maiorValor);
    }

}


