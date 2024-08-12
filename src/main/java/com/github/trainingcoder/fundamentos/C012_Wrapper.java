package main.java.com.github.trainingcoder.fundamentos;

public class C012_Wrapper {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Declaração e inicialização de Wrappers
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.valueOf(10_000); // Usando valueOf() para criar Integer a partir de int
		Long l = 100_000_000L;
		Double d = 100.0;
		Float f = 1000000.0F;
		Character c = 'A';
		Boolean bool = Boolean.FALSE; // Usando constante predefinida para Boolean

		// Exibindo os valores dos Wrappers
		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println("Integer: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
		System.out.println("Float: " + f);
		System.out.println("Character: " + c);
		System.out.println("Boolean: " + bool);

		// Convertendo Wrappers para tipos primitivos (unboxing)
		byte bValue = b;
		short sValue = s;
		int iValue = i;
		long lValue = l;
		double dValue = d;
		float fValue = f;
		char cValue = c;
		boolean boolValue = bool;

		System.out.println("\nValores após unboxing:");
		System.out.println("byte: " + bValue);
		System.out.println("short: " + sValue);
		System.out.println("int: " + iValue);
		System.out.println("long: " + lValue);
		System.out.println("double: " + dValue);
		System.out.println("float: " + fValue);
		System.out.println("char: " + cValue);
		System.out.println("boolean: " + boolValue);

		// Outros exemplos
		Integer x = 5; // Autoboxing (conversão automática de int para Integer)
		int y = x; // Unboxing (conversão automática de Integer para int)

		String numeroString = "12345";
		int numeroConvertido = Integer.parseInt(numeroString); // Convertendo String para int
		System.out.println("\nNúmero convertido de String para int: " + numeroConvertido);
	}
}
