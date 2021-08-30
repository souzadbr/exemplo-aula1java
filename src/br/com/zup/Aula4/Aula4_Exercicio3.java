package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        String resposta;
        System.out.println("Bom dia, sou do FBI!");
        System.out.println("Preciso te fazer 5 perguntas");
        System.out.println("Por favor responda S para sim e N para não.");

        System.out.println("Telefonou para vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S") | resposta.equals("s")){
            contador = contador +1;
        }
        System.out.println("Esteve no local do crime?");
        resposta = leitor.nextLine();
        if (resposta.equals("S") | resposta.equals("s")){
            contador = contador +1;
        }
        System.out.println("Mora perto da vitima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S") | resposta.equals("s")){
            contador = contador +1;
        }
        System.out.println("Devia para vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S") | resposta.equals("s")){
            contador = contador +1;
        }
        System.out.println("Já trabalhou com a vítima");
        resposta = leitor.nextLine();
        if (resposta.equals("S") | resposta.equals("s")){
            contador = contador +1;
        }

        System.out.println(contador);

        if (contador == 2){
            System.out.println("Você é suspeito!");
        }
        else if (contador == 3 | contador == 4){
            System.out.println("Você é cúmplice!");
        }
        else if (contador == 5 ) {
            System.out.println("Você é o assassino e está pres@");
        }
        else {
            System.out.println("Você é inocente. Desculpe o incomodo!");
        }
    }
}
