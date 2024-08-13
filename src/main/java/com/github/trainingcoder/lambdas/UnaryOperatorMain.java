package main.java.com.github.trainingcoder.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorMain {
	
	public static void main(String[] args) {
		
		// Recebe um parametro <T> e retorna o mesmo tipo
		UnaryOperator<Integer> maisDois = numero -> numero + 2;
		UnaryOperator<Integer> vezesDois = numero -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
		
		// Comeca da frente pro fundo (apply -> maisDois -> aoQuadrado)
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);
		
		
		// Começa do fundo pra frente (apply -> aoQuadrado -> maisDois)
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);
	}
	
}
