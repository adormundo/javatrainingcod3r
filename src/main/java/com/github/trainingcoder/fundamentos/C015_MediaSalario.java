package main.java.com.github.trainingcoder.fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C015_MediaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00"); // Formatador de números

        System.out.println("Entre com os dados dos seus últimos 3 salários:");

        double primeiroSalario, segundoSalario, terceiroSalario;

        try {
            System.out.print("Primeiro salário: ");
            primeiroSalario = Double.parseDouble(input.nextLine().replace(",", "."));

            System.out.print("Segundo salário: ");
            segundoSalario = Double.parseDouble(input.nextLine().replace(",", "."));

            System.out.print("Terceiro salário: ");
            terceiroSalario = Double.parseDouble(input.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas números válidos para os salários.");
            return; // Encerra o programa em caso de erro
        } finally {
            input.close();
        }

        double mediaSalario = (primeiroSalario + segundoSalario + terceiroSalario) / 3;
        System.out.println("Sua média salarial é de: " + df.format(mediaSalario));

    }
}
