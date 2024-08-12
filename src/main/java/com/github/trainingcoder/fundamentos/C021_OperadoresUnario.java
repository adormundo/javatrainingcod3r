package main.java.com.github.trainingcoder.fundamentos;

public class C021_OperadoresUnario {
	public static void main(String[] args) {
		int numero = 10;

		// Operador unário de incremento (++)
		System.out.println("Pós-incremento: " + numero++); // Imprime 10 e depois incrementa
		System.out.println("Número após pós-incremento: " + numero); // Imprime 11

		System.out.println("Pré-incremento: " + ++numero); // Incrementa e depois imprime 12
		System.out.println("Número após pré-incremento: " + numero); // Imprime 12

		// Operador unário de decremento (--)
		System.out.println("Pós-decremento: " + numero--); // Imprime 12 e depois decrementa
		System.out.println("Número após pós-decremento: " + numero); // Imprime 11

		System.out.println("Pré-decremento: " + --numero); // Decrementa e depois imprime 10
		System.out.println("Número após pré-decremento: " + numero); // Imprime 10

		// Operador unário de negação (!)
		boolean verdadeiro = true;
		System.out.println("Negação de verdadeiro: " + !verdadeiro); // Imprime false

		// Operador unário de complemento (~)
		int numeroPositivo = 5;
		System.out.println("Complemento de 5: " + ~numeroPositivo); // Imprime -6 (inverte bits e subtrai 1)

		// Operador unário de mais (+)
		int numeroNegativo = -8;
		System.out.println("Mais unário em -8: " + +numeroNegativo); // Imprime -8 (não altera o valor)

		// Operador unário de menos (-)
		System.out.println("Menos unário em 5: " + -numeroPositivo); // Imprime -5 (inverte o sinal)
	}
}
