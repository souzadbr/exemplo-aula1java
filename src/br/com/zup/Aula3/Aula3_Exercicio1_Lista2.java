package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exercicio1_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vou te ajudar a escolher o maior número: ");
        System.out.println("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        if (numero1> numero2){
            System.out.println("Primeiro número digitado é o maior");
        }
        else {
            System.out.println("Segundo número é o maior");
        }
    }
}
