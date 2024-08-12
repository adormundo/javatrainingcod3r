package main.java.com.github.trainingcoder.fundamentos;

public class C022_OperadoresTernario {
	public static void main(String[] args) {
		int idade = 25;
		boolean maiorDeIdade = idade >= 18;

		// Uso do operador ternário
		String mensagem = maiorDeIdade ? "Você é maior de idade" : "Você é menor de idade";
		System.out.println(mensagem); // Imprime "Você é maior de idade"

		// Exemplo com cálculo
		int numero = 7;
		String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
		System.out.println("O número é " + parOuImpar); // Imprime "O número é ímpar"

		// Exemplo com atribuição
		int resultado = (idade > 30) ? 100 : 50;
		System.out.println("Resultado: " + resultado); // Imprime "Resultado: 50"

		// Aninhamento de operadores ternários (não recomendado para legibilidade)
		int valor1 = 15;
		int valor2 = 20;
		int maiorValor = (valor1 > valor2) ? valor1 : (valor2 > 10) ? valor2 : 0;
		System.out.println("Maior valor: " + maiorValor); // Imprime "Maior valor: 20"
	}
}
