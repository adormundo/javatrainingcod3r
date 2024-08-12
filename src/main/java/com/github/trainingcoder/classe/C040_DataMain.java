package main.java.com.github.trainingcoder.classe;

public class C040_DataMain {
	public static void main(String[] args) {
		C040_Data d1 = new C040_Data();
		C040_Data d2 = new C040_Data(27, 12, 1967);

		System.out.println(d1.obterDataFormatada());
		d2.imprimirDataFormatada();
	}
}
