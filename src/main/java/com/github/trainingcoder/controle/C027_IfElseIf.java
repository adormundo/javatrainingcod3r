package main.java.com.github.trainingcoder.controle;

import java.util.Scanner;

public class C027_IfElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma nota (0 a 10): ");
		double nota = input.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}

		input.close();
	}
}
