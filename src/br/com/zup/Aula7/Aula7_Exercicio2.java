package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Vamos te ajudar atras de um menu a escolher o dia da semana do seu agendamento");
        System.out.println("Menu:");
        System.out.println("Escolha o numero relacionado ao dia que precisa: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sabado");

        System.out.println("Digite o numero escolhidfo aqui:");
        int diaSemana = leitor.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-feira");
                break;
            case 3:
                System.out.println("3 - Terça-feira");
                break;
            case 4:
                System.out.println("4 - Quarta-feira");
                break;
            case 5:
                System.out.println("5 - Quinta-feira");
                break;
            case 6:
                System.out.println("6 - Sexta-feira");
                break;
            case 7:
                System.out.println("7 - Sabado");
                break;
            default:
                System.out.println("número inválido.Digite um número dentro do intervalo de 1 a 7");
                break;

        }
    }
}
