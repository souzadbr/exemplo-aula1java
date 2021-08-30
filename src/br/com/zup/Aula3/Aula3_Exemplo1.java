package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o número1:" );
        double numero1 = leitor.nextDouble();

        System.out.println("Por favor digite o numero2:");
        double numero2 = leitor.nextDouble();

        if (numero1>numero2) {
            System.out.println( "O número 1 é o maior");
        } else  {
            System.out.println("O número 2 é o maior");
        }
    }
}
