package main.java.com.github.trainingcoder.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachFunc {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #01");
		aprovados.forEach(nome -> System.out.println(nome));

		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> imprimir(nome));

		System.out.println("\nMethod Reference #02");
		aprovados.forEach(ForeachFunc::imprimir);
	}

	static void imprimir(String nome) {
		System.out.println("Meu nome é " + nome);
	}
}
