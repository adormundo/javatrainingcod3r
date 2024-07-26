package main.java.com.github.trainingcoder.controle;

import java.util.Random;
import java.util.Scanner;

public class C031_DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(11); // Gera um número aleatório entre 0 e 10
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número secreto (entre 0 e 10): ");

        do {
            System.out.print("Seu palpite: ");
            palpite = input.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor. Tente novamente!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número secreto (" + numeroSecreto + ")" + " em " + tentativas +
                " tentativas.");

        input.close();
    }
}
