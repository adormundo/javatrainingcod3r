package main.java.com.github.trainingcoder.oo.heranca.desafio;

public class Carro {
	int velocidadeAtual;
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " => Velocidade: " + velocidadeAtual;
	}
}
