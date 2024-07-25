package main.java.com.github.trainingcoder.controle;

import java.util.Scanner;

public class C025_If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = input.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado");
        }

        if (media < 7 && media >= 4.5) System.out.println("Recuperação");

        boolean criterioReprovar = media < 4.5 && media >= 0;
        if (criterioReprovar) System.out.println("Reprovado");

        input.close();
    }
}
