package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

public class Aula6_Exemplo3 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numPares = new ArrayList<>();
        List<Integer> numImpares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(20);

        for (Integer referencia : todosOsNumeros) {
            if(referencia %2 ==0){
                numPares.add (referencia);
            }else{
                numImpares.add(referencia);
            }
        }
        System.out.println("Numeros impares: ");
        System.out.println(numImpares);
        System.out.println("Quantidade numeros impares: ");
        System.out.println(numImpares.size());
        System.out.println("Numeros pares: ");
        System.out.println(numPares);
        System.out.println("Quantidade numeros pares: ");
        System.out.println(numPares.size());
    }

}
