package main.java.com.github.trainingcoder.oo.heranca.teste;

import main.java.com.github.trainingcoder.oo.heranca.desafio.Carro;
import main.java.com.github.trainingcoder.oo.heranca.desafio.Civic;
import main.java.com.github.trainingcoder.oo.heranca.desafio.Ferrari;

public class Pista {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(400);
		Carro civic = new Civic(212);

		ferrari.acelerar();
		civic.acelerar();

		System.out.println(ferrari);
		System.out.println(civic);

		ferrari.frear();
		System.out.println(ferrari);
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.ligarAr();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		civic.frear();
		civic.frear();

		System.out.println(ferrari);
		System.out.println(civic);
	}
}
