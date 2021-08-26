package br.com.zup;

import java.util.Scanner;

public class Aula3_Exercicio3_Lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Vou te ajudar a calcular a média entre 2 notas dos alunos e compartilhar status de aprovação:" );
        System.out.println("Digite a nota1 obtida pelo Aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota2 obtida pelo Aluno: ");
        double nota2 = leitor.nextDouble();
        System.out.println("A mádia do Aluno é:");
        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println(" Média do Aluno é"+ mediaAluno);
        System.out.print("O aluno foi ");

        if (mediaAluno >= 7 &  mediaAluno < 10) {
            System.out.println("Aprovado");
        }
        else if (mediaAluno> 0 & mediaAluno< 7) {
            System.out.println("Reprovado");
        }
        else if (mediaAluno == 10 ){
            System.out.println("Aprovado com Distinção");
        }
        else {
            System.out.println("Valor inválido, Verifique as notas enviadas");
        }







    }
}
