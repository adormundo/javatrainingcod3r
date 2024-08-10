package main.java.com.github.trainingcoder.oo.heranca.desafio;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " => Velocidade: " + velocidadeAtual;
	}
}
