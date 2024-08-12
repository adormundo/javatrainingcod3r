package main.java.com.github.trainingcoder.fundamentos;

public class C010_Printf {
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 25;
		double altura = 1.65;
		boolean estudante = true;

		// Exemplo 1: Formatação básica
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Idade: %d anos\n", idade);
		System.out.printf("Altura: %.2f metros\n", altura);
		System.out.printf("Estudante: %b\n", estudante);

		System.out.println("\n"); // Linha em branco para separar

		// Exemplo 2: Formatação com largura e alinhamento
		System.out.printf("%-10s | %4d | %6.2f | %b\n", "Nome", idade, altura, estudante);
		System.out.printf("%-10s | %4d | %6.2f | %b\n", "João", 32, 1.80, false);

		System.out.println("\n"); // Linha em branco para separar

		// Exemplo 3: Formatação de números em diferentes bases
		int numero = 255;
		System.out.printf("Decimal: %d\n", numero);
		System.out.printf("Hexadecimal: %x\n", numero);
		System.out.printf("Octal: %o\n", numero);

		System.out.println("\n"); // Linha em branco para separar

		// Exemplo 4: Formatação de datas (usando a classe java.util.Date)
		java.util.Date dataAtual = new java.util.Date();
		System.out.printf("Data atual: %tF\n", dataAtual); // Formato yyyy-MM-dd
		System.out.printf("Hora atual: %tT\n", dataAtual); // Formato HH:mm:ss
	}
}
