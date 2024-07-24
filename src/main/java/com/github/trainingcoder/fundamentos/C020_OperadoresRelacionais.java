package main.java.com.github.trainingcoder.fundamentos;

public class C020_OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        // Operador maior que (>)
        boolean resultadoMaior = numero1 > numero2;
        System.out.println("numero1 é maior que numero2: " + resultadoMaior); // true

        // Operador menor que (<)
        boolean resultadoMenor = numero1 < numero2;
        System.out.println("numero1 é menor que numero2: " + resultadoMenor); // false

        // Operador maior ou igual (>=)
        boolean resultadoMaiorIgual = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2: " + resultadoMaiorIgual); // true

        // Operador menor ou igual (<=)
        boolean resultadoMenorIgual = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual a numero2: " + resultadoMenorIgual); // false

        // Operador igual (==)
        boolean resultadoIgual = numero1 == numero2;
        System.out.println("numero1 é igual a numero2: " + resultadoIgual); // false

        // Operador diferente (!=)
        boolean resultadoDiferente = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2: " + resultadoDiferente); // true
    }
}
