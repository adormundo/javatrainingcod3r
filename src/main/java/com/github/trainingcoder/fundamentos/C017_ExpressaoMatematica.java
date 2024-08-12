package main.java.com.github.trainingcoder.fundamentos;

public class C017_ExpressaoMatematica {
	public static void main(String[] args) {
		double superiorA = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double superiorB = Math.pow((1 - 5) * (2 - 7) / 2.0, 2); // 2.0 para evitar divisão inteira

		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		int resultado = (int) (superior / inferior); // Casting apenas no resultado final

		System.out.println("O resultado dessa operação é: " + resultado);
	}
}
