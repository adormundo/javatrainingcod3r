package main.java.com.github.trainingcoder.fundamentos;

import java.util.ArrayList;
import java.util.List;

public class C005_Inferencia {

    public static void main(String[] args) {
        // Demonstração com tipos primitivos e wrappers
        double a = 4.5;
        System.out.println("a (double): " + a);

        var b = 4.5; // Inferência de 'double'
        System.out.println("b (inferido como double): " + b);

        var numInteiro = 10; // Inferência de 'int'
        System.out.println("numInteiro (inferido como int): " + numInteiro);


        // Demonstração com Strings
        var c = "Texto";
        System.out.println("c (inferido como String): " + c);
        c = "Outro texto";
        System.out.println("c (após modificação): " + c);

        // Impossibilidade de reatribuição com tipo diferente
        // c = 4.5; // Erro de compilação: 'c' já foi inferido como String


        // Demonstração com tipos complexos (coleções)
        var lista = new ArrayList<String>(); // Inferência de 'ArrayList<String>'
        lista.add("Java");
        lista.add("é");
        lista.add("legal!");
        System.out.println("lista (inferida como ArrayList<String>): " + lista);


        // Var em loops (Java 10+)
        var numeros = List.of(1, 2, 3, 4, 5);
        for (var numero : numeros) { // Inferência de 'Integer' no loop
            System.out.println("Número da lista: " + numero);
        }

        // Limitações da inferência de tipos
        // var d; // Erro de compilação: 'var' precisa de inicialização
        // d = 123.65;
    }
}
