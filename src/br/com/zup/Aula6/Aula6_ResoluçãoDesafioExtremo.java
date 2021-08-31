package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_ResoluçãoDesafioExtremo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double maiorNumero = 0;
        double menorNumero = 0;
        double soma = 0;
        double valorLidoPeloUsuario;
        int contador = 1;

        System.out.println("Digite a quantidade de valores a ser informado: ");
        double qtidadeDeValores = leitor.nextDouble();

        while (contador <= qtidadeDeValores) {
            System.out.println("Digite o numero " + contador + ":");
            valorLidoPeloUsuario = leitor.nextDouble();

            if (contador == 1) {
                menorNumero = valorLidoPeloUsuario; //força a iniciar a variavel
                maiorNumero = valorLidoPeloUsuario; //força a iniciar a variavel
            } else {
                //Se o valor lido for menor que o menor valor se torna o menor valor
                if (valorLidoPeloUsuario <= menorNumero) {
                    menorNumero = valorLidoPeloUsuario;
                }
                if (valorLidoPeloUsuario >= maiorNumero) {
                    maiorNumero = valorLidoPeloUsuario;
                }
            }
            soma = soma + valorLidoPeloUsuario;
            //ou soma += valorLidoPeloUsuario;
            contador ++;
        }
        System.out.println("O menor número é: " + menorNumero);
        System.out.println("O maior número é: "+ maiorNumero);
        System.out.println("A soma dos números é: "+ soma);
    }
}
