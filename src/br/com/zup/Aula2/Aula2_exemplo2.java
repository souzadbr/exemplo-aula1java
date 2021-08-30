package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out. println( "Por favor digite o nome do usuário: ");
        String nomeDoUsuario = leitor.nextLine();
        System.out.println("Por favort digite sua idade: ");
        int idadeDoUsuario = leitor.nextInt();

        System.out.println("O seu nome é "+ nomeDoUsuario + " e sua idade é" + idadeDoUsuario);
    }
}
