package br.com.zup;

public class Aula1_Exercico6 {
    public static void main(String[] args) {
        float ganhoPorHora = 100;
        float numeroDeHoras = 120;
        float ganhoBruto = ganhoPorHora * numeroDeHoras;
        double ganhoINSS =  ganhoBruto * 0.08;
        double ganhoSindicato = ganhoBruto *0.05;
        double salarioLquido = ganhoBruto - ganhoSindicato - ganhoINSS;

        //Exericico 6a - exibir salarrio Bruto ao usuario
        System.out.println("Seu salário bruto é "+ ganhoBruto);
        //Exercicio 6b quanto pagou de INSS
        System.out.println("Pago de INSS sobre meu salario 8% que equivale a " + ganhoINSS);
        //Exercicio 6c quanto pagou de sindicato
        System.out.println ("Pago de sindicato sobre meu salario bruto 5 % que equivale a " + ganhoSindicato);
        //Exercicio 6d quanto recebo liquido
        System.out.println( "Recebo de salario liquido sem INSS e Sindicato o valor de "+ salarioLquido);
    }
}
