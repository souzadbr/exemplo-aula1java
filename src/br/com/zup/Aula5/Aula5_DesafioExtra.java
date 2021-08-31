package br.com.zup.Aula5;

import java.util.Scanner;

public class Aula5_DesafioExtra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double menorValor =1000;
        double maiorValor =0;
        double soma =0;

        double qtNumerosUsuario = 0;
        System.out.println("Digite a quantidade de numeros que deseja inserir: ");
        qtNumerosUsuario = leitor.nextDouble();

        int contador = 0;

        while(contador< qtNumerosUsuario){
            System.out.println("Inserir numero "+contador+":");
            double inserirNumero = leitor.nextDouble();
            contador ++;
            if(inserirNumero<=menorValor){
                menorValor = inserirNumero;

            }
            if(inserirNumero>=maiorValor){
                maiorValor = inserirNumero;

            }
            soma = inserirNumero + soma;


        }

        System.out.println("O menor valor é: "+ menorValor);
        System.out.println("O maior valor é: "+maiorValor);
        System.out.println("Soma dos valores é: "+soma);
    }
}
