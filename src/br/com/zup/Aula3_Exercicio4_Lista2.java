package br.com.zup;

import java.util.Scanner;

public class Aula3_Exercicio4_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vou te ajudar a organizar os aumentos de salário por faixa salarial:" );
        System.out.println("Digite o salário do funcionário que receberá aumento: ");
        double salarioFuncionario = leitor.nextDouble();
        double salarioMaisAumentos20 = (salarioFuncionario*0.2)+salarioFuncionario;
        double salarioMaisAumento15 = (salarioFuncionario*0.15)+salarioFuncionario;
        double salarioMaisAumento10 = (salarioFuncionario*0.1)+salarioFuncionario;
        double salarioMaisAumento5 = (salarioFuncionario*0.05)+salarioFuncionario;

        if (salarioFuncionario>=0 & salarioFuncionario<=280){
            System.out.println("receber 20% de aumento, portanto salario atual é "+ salarioMaisAumentos20 );
        }
        else if (salarioFuncionario > 280 & salarioFuncionario<=700){
            System.out.println("receber 15% de aumento, portanto salario atual é " + salarioMaisAumento15);
        }
        else if (salarioFuncionario>700 & salarioFuncionario<=1500){
            System.out.println("receber 10% de aumento, portanto salario atual é " + salarioMaisAumento10);
        }
        else if (salarioFuncionario >1500){
            System.out.println("receber 5% de aumento, portanto salario atual é " + salarioMaisAumento5);
        }
    }



}
