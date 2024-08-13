package main.java.com.github.trainingcoder.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BiFunctionMain {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		Function<Double, String> conceito = mediaNota -> mediaNota >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(9.8, 5.7));
		
		
		// Recebe dois parametros <T>, <T> e retorna <R>
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(9.7, 4.1));
		
		
	}
}
