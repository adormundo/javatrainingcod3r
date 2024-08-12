package main.java.com.github.trainingcoder.lambdas;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
	public static void main(String[] args) {
		// NÃO: int to Double
		// SIM: double to Double
		
		BinaryOperator<Double> calc1 = (x, y) -> x + y;
		System.out.println(calc1.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> x + y;
		System.out.println(calc2.apply(1, 2));
	}
}
