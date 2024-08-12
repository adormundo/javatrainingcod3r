package main.java.com.github.trainingcoder.oo.relacionamento.composicao;

public class C057_Carro {
	final C057_Motor motor = new C057_Motor();

	void acelerar() {
		if (motor.fatorInjecao < 2.6)
			motor.fatorInjecao += 0.4;
	}

	void frear() {
		if (motor.fatorInjecao > 0.5)
			motor.fatorInjecao -= 0.4;
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
