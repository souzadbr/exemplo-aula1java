package br.com.zup;

import java.util.Scanner;

//Trabalhando comn estrutura de decisão
public class Aula2_ComparaçãoDeDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Vamos decidir se você pode ou não comprar cerveja: ");
        System.out.println("por favor digite sua idade: ");

        int idadeUsuario = leitor.nextInt();

        if(idadeUsuario>=18) {
            System.out.println("Você tem 18 anos ou mais e PODE compras cerveja!!");
        }
        else {
            System.out.println("Você não tem mais de 18 anos, então não pode comprar cerveja!");
        }

    }
}
