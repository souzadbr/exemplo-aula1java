package br.com.zup;

public class Exemplo1 {
    public static void main(String[] args) {

        int idadeDoUsuario = 29;
        String nomeDoUsuario = "Debora";

        System.out.println(idadeDoUsuario);
        System.out.println(nomeDoUsuario);

        System.out.print("Olá, meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.println(" e minha idade é ");
        System.out.print(idadeDoUsuario);
        System.out.println (" anos");

//Printando concatenando as variáveis

        System.out.print ( "Olá, meu nome é " + nomeDoUsuario + " e minha idade é " + idadeDoUsuario + " anos");

    }
}
