package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula7_Exercicio14_LevelUP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        Map<String, String> listaAlunos = new HashMap<String, String>();
        int escolha = 0;
        String email = null;
        String nomeTel = null;
        int n = 0;
        do {
            System.out.println("Esse é nosso sistema de cadastro de alunos:");
            System.out.println("Deseja inserir mais Alunos?");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Excluir aluno via email");
            System.out.println("3 - Listar Alunos");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção:");

            escolha = Integer.parseInt(leitor.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("Digite o email:");
                        email = leitor.nextLine();
                        if (listaAlunos.containsKey(email)) {
                            System.out.println("Já consta na lista!");
                            System.out.println("Digite outro e-mail!");
                            email = leitor.nextLine();
                        }
                        System.out.println("Digite nome e telefone separando com virgula:");
                        nomeTel = leitor.nextLine();
                        listaAlunos.put(email, nomeTel);

                    break;
                case 2:
                    System.out.println("Excluir aluno via email");
                    email = leitor.nextLine();
                    listaAlunos.remove(email);
                    System.out.println("Deletado com sucesso");
                    break;
                case 3:
                    System.out.println(listaAlunos);
                    break;
                default:
                    System.out.println("Digite uma opção do menu");

            }

            System.out.println("Digite 1 para retornar ao menu ou 0 para finalizar");

            n = Integer.parseInt(leitor.nextLine());

        } while (n != 0);
    }
}
