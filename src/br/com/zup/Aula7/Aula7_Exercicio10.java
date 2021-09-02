package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Double>notas = new ArrayList<>();

        double quantidadeNotas =4;
        int contador =1;
        double notasInserida =0;
        double soma = 0;
        double média =0;

        while(contador<=quantidadeNotas){
            System.out.println("Digite a nota "+contador+":");
            notasInserida= leitor.nextDouble();

            if(notasInserida>=0){
                notas.add(notasInserida);

                contador++;
               soma = soma + notasInserida;

            }

        }
        System.out.println("A lista de notas é " + notas);
        System.out.println("A soma das 4 notas é "+soma);
        System.out.println("A média das notas inseridas é "+soma/quantidadeNotas);
    }
}
