package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double litroGasolina = 2.5;
        double litroAlcool = 1.9;
        double litroGasolina4desconto = litroGasolina - (litroGasolina*0.04);
        double litroGasolina6desconto = litroGasolina -(litroGasolina*0.06);
        double litroAlcool3desconto = litroAlcool - (litroAlcool*0.03);
        double litroAlcool5desconto = litroAlcool - (litroAlcool*0.05);
        double descontoGasolina4 = 0.04*100;
        double descontoGasolina6 = 0.06*100;
        double descontoAlcool3 = 0.03*100;
        double descontoAlcool5 = 0.05*100;
        String escolha = null;

        System.out.println("Escolha seu combustivel usando o caracter A para Alcool ou G para gasolina");
        escolha = leitor.nextLine();
        System.out.println("Quanto do combustível escolhido será bastecido?");
        double combusteivelAAbastecer = leitor.nextDouble();
        if (escolha.equals("G") | escolha.equals("g")) {
            if (combusteivelAAbastecer > 20) {
                System.out.println("Você está abastecendo " + combusteivelAAbastecer);
                System.out.println("Portanto, terá desconto de " + descontoGasolina6 + "%");
                System.out.println("Valor a pagar sem desconto será " + combusteivelAAbastecer * litroGasolina);
                System.out.println("Valor a pagar com desconto será " + combusteivelAAbastecer * litroGasolina6desconto);

            } else if (combusteivelAAbastecer <= 20) {
                System.out.println("Você está abastecendo " + combusteivelAAbastecer);
                System.out.println("Portanto, terá desconto de " + descontoGasolina4 + "%");
                System.out.println("Valor a pagar sem desconto será " + combusteivelAAbastecer * litroGasolina);
                System.out.println("Valor a pagar com desconto será " + combusteivelAAbastecer * litroGasolina4desconto);

            }
        }
        if (escolha.equals("A") |escolha.equals("a")) {

            if (combusteivelAAbastecer >20) {
                System.out.println("Você está abastecendo "+ combusteivelAAbastecer);
                System.out.println("Portanto, terá desconto de "+ descontoAlcool5+ "%");
                System.out.println("Valor a pagar sem desconto será " + combusteivelAAbastecer*litroAlcool);
                System.out.println("Valor a pagar com desconto será "+ combusteivelAAbastecer*litroAlcool5desconto);

            }
            else if (combusteivelAAbastecer<=20) {
                System.out.println("Você está abastecendo "+ combusteivelAAbastecer);
                System.out.println("Portanto, terá desconto de "+ descontoAlcool3 + "%");
                System.out.println("Valor a pagar sem desconto será " + combusteivelAAbastecer*litroAlcool);
                System.out.println("Valor a pagar com desconto será "+ combusteivelAAbastecer* litroAlcool3desconto);


            }



}



}
}
