package main.java.com.github.trainingcoder.fundamentos;

public class C013_ConversoesPrimitivos {
	public static void main(String[] args) {
		// Conversão Implícita (Widening)
		int numeroInt = 10;
		long numeroLong = numeroInt; // int para long
		System.out.println("Conversão implícita int para long: " + numeroLong);

		float numeroFloat = numeroInt; // int para float
		System.out.println("Conversão implícita int para float: " + numeroFloat);

		double numeroDouble = numeroFloat; // float para double
		System.out.println("Conversão implícita float para double: " + numeroDouble);

		// Conversão Explícita (Narrowing) (CAST)
		double valorDouble = 3.14;
		int valorInt = (int) valorDouble; // double para int (perda de precisão)
		System.out.println("Conversão explícita double para int: " + valorInt);

		long valorLong = 9876543210L;
		int valorInt2 = (int) valorLong; // long para int (perda de dados)
		System.out.println("Conversão explícita long para int: " + valorInt2);

		float valorFloat = 123.456f;
		short valorShort = (short) valorFloat; // float para short (perda de precisão)
		System.out.println("Conversão explícita float para short: " + valorShort);

		// Conversões com char
		char letra = 'A';
		int codigoAscii = letra; // char para int (código ASCII)
		System.out.println("Conversão char para int: " + codigoAscii);

		int codigo = 66;
		char letra2 = (char) codigo; // int para char
		System.out.println("Conversão int para char: " + letra2);
	}
}
