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

        alunos.remove("Raquel");
        alunos.add("Danilo");
        System.out.println(alunos.get(2));
    }
}
