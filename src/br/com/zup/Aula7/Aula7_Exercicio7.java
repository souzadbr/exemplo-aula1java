package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int inicioIntervalo = 0;
        int fimIntervalo = 0;
        int referencia = 0;


        System.out.println("Esse programa vai te ajudar a imprimir os valores dentro de um intervalo!");
        System.out.println("Digite o inicio do intervalo aqui:");
        inicioIntervalo = leitor.nextInt();
        System.out.println("Digite o fim do intervalo aqui:");
        fimIntervalo = leitor.nextInt();


        if (inicioIntervalo > fimIntervalo) {
            System.out.println("Intervalo inválido tente novamente. Inicio deve ser maior que o fim do intervalo");
        }


        for (referencia = inicioIntervalo; inicioIntervalo < fimIntervalo; inicioIntervalo++) {
            if (referencia == inicioIntervalo) {
                inicioIntervalo = inicioIntervalo + 1;

            }
            System.out.println(inicioIntervalo);
        }

    }

}