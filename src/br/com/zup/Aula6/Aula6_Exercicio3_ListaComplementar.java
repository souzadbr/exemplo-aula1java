package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio3_ListaComplementar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos te ajudar a saber qual o maior e o menor número dentro os que digitou dentre 10 numeros!");
        int quantidadeDeNumero = 10;
        double maiorNumero = 0;
        double menorNumero = 0;

        int contador = 1;

        while (contador <= quantidadeDeNumero) {

            System.out.println("Digite o número aqui:");
            double numeroInseridoUsuario = leitor.nextDouble();

            if(contador == 1){
                maiorNumero = numeroInseridoUsuario;
                menorNumero = numeroInseridoUsuario;
            }else {
                if (numeroInseridoUsuario<=menorNumero){
                    menorNumero = numeroInseridoUsuario;
                }
                if(numeroInseridoUsuario>=maiorNumero) {
                   maiorNumero= numeroInseridoUsuario ;
                }
            }
            contador ++;
        }
        System.out.println("O maior número é: "+ maiorNumero);
        System.out.println("O menor número é: "+ menorNumero);
    }

}
