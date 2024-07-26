package main.java.com.github.trainingcoder.controle;

import java.util.Scanner;

public class C029_While {
    public static void main(String[] args) {
        System.out.println("Bom dia!");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Diga a palavra Mágica: ");
            String palavraMagica = input.next();

            if (palavraMagica.equalsIgnoreCase("obrigado")) {
                System.out.println("Por nada!");
                break; // Encerra o loop quando a palavra mágica é digitada
            } else {
                System.out.println("Seja menos mal agradecido");
            }
        }

        input.close();
    }
}
