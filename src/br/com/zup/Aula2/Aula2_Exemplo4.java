package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        double valorMetro;
        double valorCentimetro;
        double metroXCentrimetro;

        //Receber valores das variáveis
        System.out.println("Vamos te ajudar a transformar metros em centimetros: ");
        System.out.println("Por favor digite o valor em metros: ");
        valorMetro = leitor.nextDouble();
       //Processar os dados

        valorCentimetro = valorMetro*100;

        System.out.println("O Valor em centimetros é: "+ valorCentimetro);

    }



}


