package main.java.com.github.trainingcoder.fundamentos;

import java.util.Scanner;

public class C024_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        input.nextLine();

        System.out.print("Qual operação realizar: ");
        String operador = input.next();

        double resultado = operador.equals("+") ? num1 + num2 : operador.equals("-") ? num1 - num2 : operador.equals("/") ? num1 / num2 : operador.equals("*") ? num1 * num2 : num1 % num2;

        System.out.printf("Resultado %.2f %s %.2f = %.2f", num1, operador, num2, resultado);

        input.close();
    }
}
