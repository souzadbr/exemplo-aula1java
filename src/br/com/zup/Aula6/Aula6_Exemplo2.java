package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

public class Aula6_Exemplo2 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
       // List<Integer> notas = new ArrayList<>();

        alunos.add("Débora");
        alunos.add("Paulo");
        alunos.add("Raquel");

        System.out.println( alunos);

        alunos.remove("Raquel");//removendo elemento
        alunos.add("Danilo");//adicionando elemento
        System.out.println(alunos.get(2));//printar a posição 2
        System.out.println(alunos);
        alunos.remove(1);//remover a posição 1
        System.out.println(alunos);
        System.out.println(alunos.size());//nos dá o numero de elementos na lista
        alunos.add("Elaine");
        alunos.add("Julia");
        System.out.println(alunos);

        for (String referencia : alunos) {
          //  System.out.println(referencia);
            //contains para verificar se esse elemento contem na lista
            if(referencia.contains("Elaine")){
                System.out.println("Aluno cadastrado");
            }else{
                System.out.println("Aluno não cadastrado no sistema");
            }
        }
    }
}
