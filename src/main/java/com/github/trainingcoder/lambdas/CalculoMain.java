package main.java.com.github.trainingcoder.lambdas;

public class CalculoMain {
	public static void main(String[] args) {

		Calculo somar = new Somar();
		Calculo multiplicar = new Multiplicar();

		System.out.println(somar.executar(2, 3));
		System.out.println(multiplicar.executar(2, 3));
	}
}
