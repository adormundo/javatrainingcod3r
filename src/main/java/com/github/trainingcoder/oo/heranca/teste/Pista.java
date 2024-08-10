package main.java.com.github.trainingcoder.oo.heranca.teste;

import main.java.com.github.trainingcoder.oo.heranca.desafio.Carro;
import main.java.com.github.trainingcoder.oo.heranca.desafio.Civic;
import main.java.com.github.trainingcoder.oo.heranca.desafio.Ferrari;

public class Pista {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari(400);
		Carro civic = new Civic(212);
		
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
