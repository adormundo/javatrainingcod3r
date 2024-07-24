package main.java.com.github.trainingcoder.fundamentos;

public class C016_OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Adição
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        int divisao = a / b;
        double divisao2 = a / (double) b;
        System.out.println("Divisão Inteira: " + divisao);
        System.out.println("Divisão Comum: " + divisao2);

        // Módulo (resto da divisão)
        int modulo = a % b;
        System.out.println("Módulo: " + modulo);

        // Incremento
        int c = 7;
        c++; // Equivalente a c = c + 1;
        System.out.println("Incremento: " + c);

        // Decremento
        int d = 8;
        d--; // Equivalente a d = d - 1;
        System.out.println("Decremento: " + d);



        // Operadores de atribuição composta
        int e = 15;
        e += 3; // Equivalente a e = e + 3;
        System.out.println("Atribuição composta (+=): " + e);

        int f = 20;
        f -= 5; // Equivalente a f = f - 5;
        System.out.println("Atribuição composta (-=): " + f);

        int g = 6;
        g *= 4; // Equivalente a g = g * 4;
        System.out.println("Atribuição composta (*=): " + g);

        int h = 12;
        h /= 3; // Equivalente a h = h / 3;
        System.out.println("Atribuição composta (/=): " + h);

        int i = 10;
        i %= 3; // Equivalente a i = i % 3;
        System.out.println("Atribuição composta (%=): " + i);
    }
}
