package main.java.com.github.trainingcoder.controle;

public class C037_Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue; // Interrompe a interação, mas segue para proxima
			}
			System.out.println(i);
		}

	}
}
