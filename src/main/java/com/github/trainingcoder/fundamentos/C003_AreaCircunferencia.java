package main.java.com.github.trainingcoder.fundamentos;

public class C003_AreaCircunferencia {
	public static void main(final String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;

		double area = PI * raio * raio;
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.printf("Área = " + area + "m2.");
	}
}
