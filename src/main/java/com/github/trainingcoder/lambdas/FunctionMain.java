package main.java.com.github.trainingcoder.lambdas;

import java.util.function.Function;

public class FunctionMain {
	public static void main(String[] args) {
		
		// Recebe um parametro <T> e retorna um tipo <R>
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(parOuImpar.apply(33));

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal);
	}
}
