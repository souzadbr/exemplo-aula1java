package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exercicio2_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vou te ajudar a escolher o produto mais barato de 3 opções descritas por você: ");

        System.out.println("Digite valor do produto 1: ");
        double produto1 = leitor.nextDouble();
        System.out.println("digite valor do produto 2: ");
        double produto2 = leitor.nextDouble();
        System.out.println("Digite valor do produto 3: ");
        double produto3 = leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("Produto 1 é o mais barato");
        }
        else if (produto2 < produto1 & produto2 < produto3) {
            System.out.println("Produto 2 é o mais barato");
        }
        else {
            System.out.println("Produto 3 é o mais barato");
        }
    }
}
