package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer>numeros = new ArrayList<>();

        int contador =1;
        int contadorExibicao = 9;
        int finalExibicao =0;
        int numeroInseridoUsuario =0;
        int totalNumeros=10;

        while(contador<=totalNumeros){
            System.out.println("Digite o numero desejado "+contador+": ");
            numeroInseridoUsuario= leitor.nextInt();
            numeros.add(numeroInseridoUsuario);
            contador++;
        }
        //System.out.println(numeros);
        while (contadorExibicao>=finalExibicao){
            System.out.println(numeros.get(contadorExibicao));
            contadorExibicao--;
        }
    }
}
