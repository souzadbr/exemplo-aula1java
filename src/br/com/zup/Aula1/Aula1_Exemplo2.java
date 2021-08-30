package br.com.zup.Aula1;

public class Aula1_Exemplo2 {
    public static void main(String[] args) {

        //Armazenar os valores da memória
       int numero1 = 100;
       int numero2 = 30;
       //Criando a operação de soma
       int resultadoDaSoma = numero1 + numero2;
       //Criando a operação de subtração
        int resultadoDaSubtração = numero1 - numero2;
        //Criando a operação de multiplicação
        int resultadoDaMultiplicacao = numero1 * numero2;
        //Criando a operação de divisão
        int resultadoDaDivisao = numero1 / numero2;

        //Exibindo a operação de divisão para o usuário
        System.out.println("O resultado da divisão é " + resultadoDaDivisao);

        //Exibindo a operação de multiplicação para o usuário
        System.out.println("O resultado da multiplicação é " + resultadoDaMultiplicacao);

       // Exibindo a operação de soma para o usuário
       System.out.println("O resultado da soma é "+ resultadoDaSoma );

        //Exibindo a operação de subtração para o usuario
        System.out.println("O resultado ´da subtração é "+ resultadoDaSubtração );
    }
}
