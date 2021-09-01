package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        List <Integer> numeros = new ArrayList<>();
        int contador = 1;
        int totalDeNumeros = 5;
       int valorDigitadoPeloUsuario = 0;

        while(contador<=totalDeNumeros){

            System.out.println("Por favor digite um numero "+contador+" : ");
            valorDigitadoPeloUsuario = leitor.nextInt();

            if(valorDigitadoPeloUsuario>=0){
                numeros.add(valorDigitadoPeloUsuario);
                contador++;
            }


        }
        System.out.println(numeros); //ou

        for (Integer referencia:numeros) {
            System.out.println(referencia);
        }

    }
}
