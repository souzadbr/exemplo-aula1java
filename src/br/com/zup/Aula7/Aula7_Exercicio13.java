package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pesoRegulamentado = 50;
        double multa = 4;
        double pesoInserido = 0;
        double excessoPeso = 0;



        System.out.println("Essa balança vai te indicar o quanto de kg passou do peso regulamentos 50kg e o valor da multa a se pagar por Kg excedente!");
        System.out.println("Coloque o peixe na balança");
        pesoInserido = leitor.nextDouble();

        if (pesoInserido > pesoRegulamentado) {
            excessoPeso = pesoInserido - pesoRegulamentado;
            System.out.println("O excesso de peso na balança foi de " + excessoPeso + " Kg, portando deve pagar multa de " + excessoPeso * multa);
        } else {
            System.out.println("Peso inserido na balança é " + pesoInserido + " Kg, está dentro do regulamentos, portando não paga multa");

        }

    }
}
