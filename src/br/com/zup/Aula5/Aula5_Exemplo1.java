package br.com.zup.Aula5;

import java.util.Scanner;
//Ler o tipo de combustivel que o user quer
//Ler quantidade de combustivel que ele deseja

public class Aula5_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorTotal = 0; //) resultado em, R$
        double valorDoDesconto = 0;// O valor do desconto do valor total

        System.out.println("Seja bem vindo ao Posto das Flores");
        System.out.println("Por favor digite G para Gasolina e A para Alcool");
        String tipoDeCombustivel = leitor.nextLine();
        System.out.println("digite o valor em Litros o quanto voce quer abastecer:");
        double valorEmL = leitor.nextDouble();

        if (tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("g")) {
            valorTotal = valorEmL * 2.5;//Quanto a pessoa vai ter que pagar.

            if (valorEmL <= 20 & valorEmL > 0) {
                //System.out.println("Calcular o desconto de <20L");
                valorDoDesconto = (0.04 * valorEmL);

            } else {
                //System.out.println("Calcular o desconto >20L");
                valorDoDesconto = (0.06 * valorEmL);
            }
        } else if (tipoDeCombustivel.equals("A") | tipoDeCombustivel.equals("a")) {
            valorTotal = valorEmL * 1.9;//Quanto a pessoa vai ter que pagar.
            if (valorEmL <= 20 & valorEmL > 0) {
                // System.out.println("Calcular o desconto de <20L");
                valorDoDesconto = 0.03 * valorEmL;

            } else {
                // System.out.println("Calcular o desconto >20L");
                valorDoDesconto = 0.05 * valorTotal;
            }
        }
            //Exibindo as informações

        System.out.println("Você precisará pagar: ");
        double valorTotalComDesocntos = valorTotal - valorDoDesconto;
        System.out.print("R$ "+valorTotalComDesocntos);

    }
}

