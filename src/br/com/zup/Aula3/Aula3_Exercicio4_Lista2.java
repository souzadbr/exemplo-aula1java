package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exercicio4_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vou te ajudar a organizar os aumentos de salário por faixa salarial:" );
        System.out.println("Digite o salário do funcionário que receberá aumento: ");
        double salarioFuncionario = leitor.nextDouble();
        double percentual5 = salarioFuncionario*0.05;
        double percentual10 = salarioFuncionario*0.1;
        double percentual15 = salarioFuncionario*0.15;
        double percentual20 = salarioFuncionario*0.2;
        double salarioMaisAumentos20 = (percentual20)+salarioFuncionario;
        double salarioMaisAumento15 = (percentual15)+salarioFuncionario;
        double salarioMaisAumento10 = (percentual10)+salarioFuncionario;
        double salarioMaisAumento5 = (percentual5)+salarioFuncionario;



        if (salarioFuncionario> 0 & salarioFuncionario<=280){
            System.out.println("Seu salario atual é "+salarioFuncionario + " e vai receber 20% de aumento que equivale a "+ percentual20+ " reais, portanto salario atual é "+ salarioMaisAumentos20 );
        }
        else if (salarioFuncionario > 280 & salarioFuncionario<=700){
        System.out.println("Seu salario atual é "+salarioFuncionario + " e vai receber 15% de aumento que equivale a " +percentual15+ " reais,portanto salario atual é " + salarioMaisAumento15);
        }
        else if (salarioFuncionario>700 & salarioFuncionario<=1500){
            System.out.println("Seu salario atual é "+salarioFuncionario + " e vai receber 10% de aumento que equivale a " + percentual10+" reais, portanto salario atual é " + salarioMaisAumento10);
        }
        else if (salarioFuncionario >1500){
            System.out.println("Seu salario atual é "+salarioFuncionario + " e vai receber 5% de aumento que equivale a " + percentual5+ " reais, portanto salario atual é " + salarioMaisAumento5);
        }
    }



}
