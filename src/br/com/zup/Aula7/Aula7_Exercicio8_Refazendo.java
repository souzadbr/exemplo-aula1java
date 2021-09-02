package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio8_Refazendo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int totaldeNumeros = 5;
        int contador = 1;
        int valorInseridoUsuario = 0;


        while (contador <= totaldeNumeros) {
            System.out.println("Digite aqui o número deseja " + contador + ": ");
            valorInseridoUsuario = leitor.nextInt();

            if (valorInseridoUsuario >= 0) {
                numeros.add(valorInseridoUsuario);
                contador++;
            }

        }
        System.out.println(numeros);


    }
}
