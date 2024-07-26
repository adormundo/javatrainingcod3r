package main.java.com.github.trainingcoder.controle;

import java.util.Scanner;

public class C032_MediaTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNotas = 0;
        int notasValidas = 0;

        System.out.println("Calculadora de Média da Turma");
        System.out.println("Digite 'sair' para encerrar.");

        while (true) {
            System.out.print("Informe uma nota válida (0 a 10): ");

            // Verifica se o próximo token é um número
            if (!input.hasNextDouble()) {
                String comando = input.next(); // Lê o token não numérico
                if (comando.equalsIgnoreCase("sair")) {
                    // Sai do loop se o comando for "sair"
                    break;
                } else {
                    System.out.println("Comando inválido! Digite uma nota ou 'sair'.");
                    // Volta para o início do loop
                    continue;
                }
            }

            double nota = input.nextDouble();

            // Limpa o buffer do scanner
            input.nextLine();

            if (nota >= 0 && nota <= 10) {
                totalNotas += nota;
                notasValidas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        }

        // Calcula e exibe a média apenas se houver notas válidas
        if (notasValidas > 0) {
            double media = totalNotas / notasValidas;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        input.close();
    }
}
