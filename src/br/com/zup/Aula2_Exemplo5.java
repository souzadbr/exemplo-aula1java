package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qtHorawsTrabalhadas;
        double salarioPorHora;
        double salarioBruto;

        System.out.println("Vou te ajudar a calcular seu salário Bruto: ");
        System.out.println("Por favor digite a quantidade de horas trabalhadas: ");
        qtHorawsTrabalhadas = leitor.nextDouble();
        System.out.println("Por favor digite seu salário por hora: ");
        salarioPorHora = leitor.nextDouble();

        salarioBruto = qtHorawsTrabalhadas * salarioPorHora;
        System.out.println( "Seu salário Bruto é:"+ salarioBruto );


    }
}

