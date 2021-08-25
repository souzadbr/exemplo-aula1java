package br.com.zup;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Aula2_ComparaçãoDeDados3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite a nota do Aluno: ");
        double notaDoAluno = leitor.nextDouble();

        if (notaDoAluno < 6) {
            System.out.println("Você foi reprovado com a nota:"+ notaDoAluno);
        }
         if (notaDoAluno >= 6 & notaDoAluno <10) {
            System.out.println("Você foi aprovado com a nota:"+ notaDoAluno);
        }
        if (notaDoAluno == 10) {
            System.out.println("Você foi aprovado com distinção!!");
        } else {
            System.out.println("Digite uma nota valida!");
        }
    }
}
