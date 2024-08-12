package main.java.com.github.trainingcoder.oo.heranca;

public class Jogador {
	private int x;
	private int y;
	private int vida = 100;

	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador outroJogador) {
		int deltaX = Math.abs(obterX() - outroJogador.obterX());
		int deltaY = Math.abs(obterY() - outroJogador.obterY());

		if (deltaX == 0 && deltaY == 1) {
			outroJogador.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			outroJogador.vida -= 10;
			return true;
		}
		return false;
	}

	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y = obterY() - 1;
			break;
		case LESTE:
			x = obterX() + 1;
			break;
		case SUL:
			y = obterY() + 1;
			break;
		case OESTE:
			x = obterX() - 1;
			break;
		}
		return true;
	}

	public int getVida() {
		return vida;
	}

	public int obterX() {
		return x;
	}

	public int obterY() {
		return y;
	}
}
