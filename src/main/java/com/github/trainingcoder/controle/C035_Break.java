package main.java.com.github.trainingcoder.controle;

public class C035_Break {
	public static void main(String[] args) {
		System.out.println("Vou contar até quatro:");
		for (int numero = 0; numero < 5; numero++) {
			System.out.println(numero);

			if (numero == 4) {
				System.out.println("Cheguei em quatro! Hora de parar.");
				break; // Termina o loop for quando chegar em 4
			}
		}
		System.out.println("Contagem finalizada.");
	}
}
