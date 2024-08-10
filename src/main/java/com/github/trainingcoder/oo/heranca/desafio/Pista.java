package main.java.com.github.trainingcoder.oo.heranca.desafio;

public class Pista {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		
		ferrari.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.frear();
		ferrari.frear();
		civic.frear();
		civic.frear();
		
		System.out.println(ferrari);
		System.out.println(civic);
	}
}
