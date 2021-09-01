package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_ExercicioLevelUp_ListaComplementar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite o inicio do seu intervalo:");
        double inicioIntervalo = leitor.nextDouble();
        System.out.println("Digite o Fim do seu intervalor:");
        double fimIntervalo = leitor.nextDouble();
        if (inicioIntervalo > fimIntervalo) {
            System.out.println("Intervalo de valores inválidos, digite novamente");
        }else {
            System.out.println("O internvalo é "+inicioIntervalo +" até "+fimIntervalo);
        }


        while (inicioIntervalo < fimIntervalo) {

            if (inicioIntervalo % 2 != 0) {
                System.out.println("Os números Impares são: " + inicioIntervalo);
                soma = soma + inicioIntervalo;
            }
            inicioIntervalo++;

        }
        System.out.println(" a Soma é " + soma);
    }
}
