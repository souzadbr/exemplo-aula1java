package br.com.zup.Aula2;

public class Aula2_Exemplo1 {
    public static void main(String[] args) {
        //Exercicio lista 1 complementar

        //Variável de entrada
        double pesoDosPeixes = 60;


        //Variáveis de processamento
        double kg_MáximoPermitido = 50;
        double valorDaMulta =4;

        //Variáveis de resposta
        double kg_excedente;
        double valorDaMultaASerPaga;

            //Processando a quantidade de Kg excedente e valor da multa
       kg_excedente = pesoDosPeixes - kg_MáximoPermitido;
       valorDaMultaASerPaga = kg_excedente* valorDaMulta;

       //Exibindo os valores para usuário
        System.out.println("Kg lido na balança: "+ pesoDosPeixes);
        System.out.println("O permitido pelo estado de SP é "+ kg_MáximoPermitido);
        System.out.println("O valor atual da multa por Kg excente é " + valorDaMulta);
        System.out.println("Você terá que pagar de multa " + valorDaMultaASerPaga);


    }
}
