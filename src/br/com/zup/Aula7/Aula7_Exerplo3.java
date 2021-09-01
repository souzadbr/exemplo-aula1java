package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exerplo3 {
    public static void main(String[] args) {
        //Criando estrutura HashMap

        Map<Integer, String> contatos = new HashMap<Integer, String>();

        contatos.put(1, "Carol");
        contatos.put(2,"André");
        contatos.put(3,"Marcio");
        contatos.put(4,"Ruth");

        System.out.println( "Esse email é do aluno :"+ contatos.get(1));
        System.out.println( "Esse email é do aluno :"+ contatos.get(2));
        System.out.println( "Esse email é do aluno :"+ contatos.get(3));
        System.out.println( "Esse email é do aluno :"+ contatos.get(4));
    }
}

