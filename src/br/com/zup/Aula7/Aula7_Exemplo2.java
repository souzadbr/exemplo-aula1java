package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {

        //Criando estrutura HashMap

        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("carol@carol", "Carol");
        contatos.put("marcio@marcio","André");
        contatos.put("andré@andré","Marcio");
        contatos.put("ruth@ruth","Ruth");

        System.out.println( "Esse email é do aluno :"+ contatos.get("carol@carol"));
        }
    }


