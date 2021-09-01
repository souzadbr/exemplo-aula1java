package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo5 {
    public static void main(String[] args) {
        //Criando estrutura HashMap

        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("@carol", "Carol");
        contatos.put("@andre","André");
        contatos.put("@marcio","Marcio");
        contatos.put("@ruth","Ruth");

        for (String referencia : contatos.keySet()) {
            System.out.println("chave: "+ referencia +" valor: "+ contatos.get(referencia));
        } //Refenrencia da chave puxa a chave e a refernecia dfentro do get pega o valor relacionado a chave da referencia.
    }
}
