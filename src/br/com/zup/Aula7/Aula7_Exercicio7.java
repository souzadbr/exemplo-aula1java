package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Esse programa vai te ajudar a imprimir os valores dentro de um intervalo!");
        System.out.println("Digite o inicio do intervalo aqui:");
        int inicioIntervalor = leitor.nextInt();
        System.out.println("Digite o fim do intervalo aqui:");
        int fimIntervalo = leitor.nextInt();

        if(inicioIntervalor>fimIntervalo & fimIntervalo>inicioIntervalor){
            System.out.println("Intervalo inválido tente novamente. Inicio deve ser maior que o fim do intervalo");
        }else{
            System.out.println("O intervalo é "+inicioIntervalor+"até "+fimIntervalo);
        }


      for (inicioIntervalor= 1; inicioIntervalor<fimIntervalo; inicioIntervalor++)
          System.out.println(inicioIntervalor);
        }
    }

