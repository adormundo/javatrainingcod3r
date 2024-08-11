package main.java.com.github.trainingcoder.oo.heranca.desafio;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " => Velocidade: " + velocidadeAtual + "Km/h.";
	}
}
