package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Esse programa vai te ajudar a escolher o produto mais barato dentre 3 opções de valores incluidas pelo usuario!");

        int contador = 1;
        double valorProduto = 0;
        double produtoMaisBarato = 0;
        double produtoMaisCaro = 0;
        int quantidadeDeProdutos = 3;


        while (contador <= quantidadeDeProdutos) {
            System.out.println("Digite o valor do produto " + contador + " :");
            valorProduto = leitor.nextDouble();
            if (contador == 1) {
                produtoMaisBarato = valorProduto;
                produtoMaisCaro = valorProduto;

            } else {

                if (valorProduto <= produtoMaisBarato) {
                    produtoMaisBarato = valorProduto;
                }
                if (valorProduto >= produtoMaisCaro) {
                    produtoMaisCaro = valorProduto;
                }
            }

            contador++;

        }

        System.out.println("Esse é o produto mais barato com valor de " + produtoMaisBarato);
        System.out.println(produtoMaisCaro);
    }
}
