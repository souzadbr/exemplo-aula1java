package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula7_resoluçãoLeveuUPAndré {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();

        boolean chave = true;

        System.out.println("Seja bem vindo ao Debora classroom");

        int opção = 0;

        while (chave == true) {
            //menu - apresentar opções para o usuário
            System.out.println("Digite 1: Para cadastrar um aluno");
            System.out.println("Digite 2: Para exibir a lista");
            System.out.println("Digite 3: Para remover um aluno da lista usando e-amail");
            System.out.println("digite 4: Para sair do programa");
            opção = leitor.nextInt();
            leitor.nextLine();//eliminar bug do enter apos inserir numero interio e depois entrar com String

            if (opção == 1) {
                //Cadastrar um aluno
                //recebendo dados usuario
                System.out.println("Digite o nome Completo do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o seu telefone: ");
                String telefone = leitor.nextLine();
                System.out.println("Digite o seu email: ");
                String email = leitor.nextLine();

                //Fazendo cadastro
                alunos.put(email, " Nome: " + nome + " Telefone: " + telefone);
                System.out.println(alunos);

            } else if (opção == 2) {
                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + "email: " + chaveAluno);
                }

            }
            else if (opção == 3) {
                System.out.println("Por favor digite email a ser deletado");
                String emailDeletado = "";
                String emailASerDeletado = leitor.nextLine();

                for (String emailAluno : alunos.keySet()) {
                   if(emailAluno.equals(emailASerDeletado)){
                       System.out.println("email deletado com sucesso");
                       emailDeletado = emailASerDeletado;
                       //break; outra possibilidade
                   }
                   alunos.remove(emailDeletado);
            }
         else if (opção == 4) {
                //sair do menu
                chave = false;
            }

            else{
                System.out.println("Por favor digite um valor válido");
            }


        }
    }
}}



