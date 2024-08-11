package main.java.com.github.trainingcoder.oo.abstrato;

public class AbstratoMain {
	public static void main(String[] args) {
		Mamifero mamifero = new Cachorro();
		System.out.println(mamifero.mover());
		System.out.println(mamifero.mamar());
		System.out.println(mamifero.respirar());
	}
}
