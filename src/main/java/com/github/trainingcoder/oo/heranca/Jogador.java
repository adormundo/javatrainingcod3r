package main.java.com.github.trainingcoder.oo.heranca;

public class Jogador {
	int x;
	int y;
	int vida = 100;

	boolean atacar(Jogador outroJogador) {
		int deltaX = Math.abs(x - outroJogador.x);
		int deltaY = Math.abs(y - outroJogador.y);

		if (deltaX == 0 && deltaY == 1) {
			outroJogador.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			outroJogador.vida -= 10;
			return true;
		}
		return false;
	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
