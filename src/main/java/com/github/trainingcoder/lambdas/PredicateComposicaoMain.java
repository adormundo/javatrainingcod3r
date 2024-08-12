package main.java.com.github.trainingcoder.lambdas;

import java.util.function.Predicate;

public class PredicateComposicaoMain {
	public static void main(String[] args) {
		// Muito bom pra fazer validações
		Predicate<Integer> isPar =  num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(122));
		System.out.println(isPar.or(isTresDigitos).test(122));
	}
}
