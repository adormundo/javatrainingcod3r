package main.java.com.github.trainingcoder.fundamentos;

public class C023_IgualdadeStrings {
	public static void main(String[] args) {
		String string1 = "Olá, mundo!";
		String string2 = "Olá, mundo!";
		String string3 = new String("Olá, mundo!");

		// Comparação com == (compara referências)
		System.out.println("string1 == string2: " + (string1 == string2)); // true
		System.out.println("string1 == string3: " + (string1 == string3)); // false

		// Comparação com equals() (compara conteúdo)
		System.out.println("string1.equals(string2): " + string1.equals(string2)); // true
		System.out.println("string1.equals(string3): " + string1.equals(string3)); // true

		// Comparação com equalsIgnoreCase() (ignora maiúsculas/minúsculas)
		String string4 = "olá, mundo!";
		System.out.println("string1.equalsIgnoreCase(string4): " + string1.equalsIgnoreCase(string4)); // true
	}
}
