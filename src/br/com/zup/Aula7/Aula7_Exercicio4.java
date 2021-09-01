package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int contadorExibicao = 9;
        int finalDeExibicao = 0;
        int totalDeNumeros = 10;
        int valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros) {
            System.out.println("digite o numero " + contador + " : ");
            valorDigitadoPeloUsuario = leitor.nextInt();

            numeros.add(valorDigitadoPeloUsuario);
            contador++;
        }
        System.out.println(numeros);

        while (contadorExibicao >= finalDeExibicao) {
            System.out.println(numeros.get(contadorExibicao));

            contadorExibicao--;

        }
        System.out.println(numeros);
    }

}
