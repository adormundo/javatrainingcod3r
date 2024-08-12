package main.java.com.github.trainingcoder.lambdas;

public class CalculoLambdaMain {
	public static void main(String[] args) {

		Calculo somar = (x, y) -> {
			return x + y;
		};

		Calculo multiplicar = (x, y) -> x * y;

		System.out.println(somar.executar(1, 3));
		System.out.println(multiplicar.executar(1, 3));

	}
}
