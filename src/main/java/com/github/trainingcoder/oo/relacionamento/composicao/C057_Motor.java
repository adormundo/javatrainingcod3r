package main.java.com.github.trainingcoder.oo.relacionamento.composicao;

public class C057_Motor {

	boolean ligado = false;
	double fatorInjecao = 1;

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
