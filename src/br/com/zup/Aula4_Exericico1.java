package br.com.zup;

import java.util.Scanner;

public class Aula4_Exericico1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        double horasTrabalhadas = 0;
        double valorPorHora = 0;
        double salarioBruto = 0;
        double impostoDeRenda = 0;
        double impostoFGTS = 0.11;
        double salarioLiquido = 0;
        double descontoINSS = 0.1;
        double impostoIR =0;
        double somaDescontos =0;



        System.out.println("Quantas horas foram trabalhadas nesse mês?");
        horasTrabalhadas = leitor.nextDouble();
        System.out.println("Quanto recebe por hora?");
        valorPorHora = leitor.nextDouble();
        System.out.print("Salário Bruto:  ("+ horasTrabalhadas + " * " + valorPorHora +")");
        System.out.println(": R$ "+horasTrabalhadas*valorPorHora);

        salarioBruto = horasTrabalhadas*valorPorHora;

        if (salarioBruto <=900){
           impostoDeRenda = impostoIR *salarioBruto;
        }
        else if (salarioBruto>900 & salarioBruto <=1500){
            impostoIR = 0.05;
           impostoDeRenda = salarioBruto*impostoIR;
        }
        else if (salarioBruto>1500 & salarioBruto<=2500){
            impostoIR = 0.1;
            impostoDeRenda = salarioBruto*impostoIR;
        }
        else if (salarioBruto>2500){
            impostoIR =0.2;
           impostoDeRenda = salarioBruto*impostoIR;

        }

        somaDescontos = ((salarioBruto*descontoINSS)+(salarioBruto*impostoIR));

        System.out.print("(-) IR ");
        System.out.print(impostoIR*100 +"%");
        System.out.print(" :R$ ");
        System.out.println(impostoDeRenda);
        System.out.print("(-) INSS (10%)                     :R$ ");
        System.out.println(salarioBruto*descontoINSS);
        System.out.print("FGTS (11%)                           :R$ ");
        System.out.println(salarioBruto*impostoFGTS);
        System.out.print("Total de descontos                  :R$ ");
        System.out.println(somaDescontos);



    }
}




























































