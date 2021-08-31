package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio1_Extra {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos te ajudar a descobrir se o número inserido é um número primo!");
        System.out.println("Digite quantidade de numeros a serem vertificados: ");
        double quantidadeDeNumerosVerificar = leitor.nextDouble();

        int quantidadeDividores = 0;
        int contador = 1;
        double numeroInseridoUsuario = 0;

        while (contador <=numeroInseridoUsuario){

            System.out.println("Digite o número aqui: ");
            numeroInseridoUsuario = leitor.nextDouble();

            if(quantidadeDividores == numeroInseridoUsuario | quantidadeDividores == 1){
                System.out.println("Esse número é primo");
            }else {
                System.out.println("Esse numero não é primo");
            }
            contador ++;
        }



                }
    }

