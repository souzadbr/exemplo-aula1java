package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();

        alunos.add("André");
        alunos.add("Paulo");
        alunos.add("Paulo");

        for (String xablau : alunos) {
            System.out.println(alunos);
        }

        //Criando estrutura HashMap

        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("920026172", "Debora");
        contatos.put("202025020","André");
        System.out.println(contatos);
        //usa .keySet para mostrar as chaves da HashMap
        //usa .value para mostrar os valores da HashMap
        for (String referencia:contatos.keySet()) {

            System.out.println(referencia);
            System.out.println(contatos);

        }
    }

}
