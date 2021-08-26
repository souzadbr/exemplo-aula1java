package br.com.zup;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aula3_Exercicio5_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número que exibirá o dia da semana respectivo que deseja:");
        System.out.println("Menu:");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sabado");

        System.out.println("Digite o número aqui: ");

        int diaSemana = leitor.nextInt();

        if (diaSemana == 1){
            System.out.println("o Dia desejado é Domingo");
        }
        else if (diaSemana == 2){
            System.out.println("O Dia desejado é Segunda");
        }
        else if (diaSemana == 3){
            System.out.println("O Dia desejado é Terça");
        }
        else if (diaSemana == 4) {
            System.out.println("O dia desejado é Quarta");
        }
        else if (diaSemana == 5) {
            System.out.println("O sia desejado é Quinta");
        }
        else if (diaSemana == 6) {
            System.out.println("O dia da semana desejado é Sexta");
        }
        else if (diaSemana == 7) {
            System.out.println("O dia da semana desejado é Sabado");
        }
        else {
            System.out.println("Valor inválido. Tente novamente ");
        }
    }
}
