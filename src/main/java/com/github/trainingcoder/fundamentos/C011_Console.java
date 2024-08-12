package main.java.com.github.trainingcoder.fundamentos;

import java.util.Scanner;

public class C011_Console {
	public static void main(String[] args) {
		// Boas-vindas com formatação mais clara
		System.out.println("Bom dia!\n");

		// Exemplo de printf com formatação de números
		System.out.printf("Megasena: %02d %02d %02d %02d %02d %02d %n", 10, 2, 33, 4, 5, 6);
		System.out.printf("Salário: R$ %.2f %n", 1234.5678);

		Scanner input = new Scanner(System.in);

		// Obtenção de dados do usuário com mensagens mais claras
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = input.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		input.nextLine(); // Limpa o buffer do scanner após nextInt()

		// Exibição dos dados com formatação usando printf
		System.out.printf("%s tem %d anos.%n", nomeCompleto, idade);

		input.close(); // Fecha o Scanner para liberar recursos
	}
}