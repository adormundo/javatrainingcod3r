package main.java.com.github.trainingcoder.fundamentos;

public class C006_TiposPrimitivos {
	// 1 Byte = 8 bits

	// Tipos numéricos inteiros
	byte valorByte = 127; // 8 bits (-128 a 127)
	short valorShort = 32767; // 16 bits (-32768 a 32767)
	int valorInt = 2147483647; // 32 bits (-2147483648 a 2147483647) (padrão)
	long valorLong = 9_223_372_036_854_775_807L; // 64 bits (com 'L' no final)

	// Tipos numéricos de ponto flutuante
	float valorFloat = 3.14f; // 32 bits (com 'f' no final)
	double valorDouble = 2.71828; // 64 bits (precisão dupla) (padrão)

	// Tipo caractere
	char valorChar = 'A'; // 16 bits (Unicode)

	// Tipo booleano
	boolean valorBoolean = true; // true ou false

	public static void main(String[] args) {
		C006_TiposPrimitivos tipos = new C006_TiposPrimitivos();

		System.out.println("byte: " + tipos.valorByte);
		System.out.println("short: " + tipos.valorShort);
		System.out.println("int: " + tipos.valorInt);
		System.out.println("long: " + tipos.valorLong);
		System.out.println("float: " + tipos.valorFloat);
		System.out.println("double: " + tipos.valorDouble);
		System.out.println("char: " + tipos.valorChar);
		System.out.println("boolean: " + tipos.valorBoolean);
	}
}
