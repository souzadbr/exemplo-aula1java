package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qtHorawsTrabalhadas;
        double salarioPorHora;
        double salarioBruto;
        double descontoINSS = 0.08;
        double pagarINSS;
        double descontoSindicato = 0.05;
        double pagarSindicato;
        double salarioLiquido;

        System.out.println("Vou te ajudar a calcular seu salário Bruto: ");
        System.out.println("Por favor digite a quantidade de horas trabalhadas: ");
        qtHorawsTrabalhadas = leitor.nextDouble();
        System.out.println("Por favor digite seu salário por hora: ");
        salarioPorHora = leitor.nextDouble();

        salarioBruto = qtHorawsTrabalhadas * salarioPorHora;
        System.out.println( "Seu salário Bruto é:"+ salarioBruto );

        pagarINSS= salarioBruto * descontoINSS;
        System.out.println("Seu desconto de INSS de 8% é : " + pagarINSS);

        pagarSindicato = salarioBruto * descontoSindicato;
        System.out.println("Seu desconto de sindicato é: " + pagarSindicato);

        salarioLiquido = salarioBruto - pagarINSS - pagarSindicato;
        System.out.println("Seu salário líquido é: " + salarioLiquido);

}
}