package main.java.com.github.trainingcoder.oo.heranca.teste;

import main.java.com.github.trainingcoder.oo.heranca.Heroi;
import main.java.com.github.trainingcoder.oo.heranca.Jogador;
import main.java.com.github.trainingcoder.oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Jogador monstro = new Monstro(10, 10);
		Jogador heroi = new Heroi(10, 11);

		System.out.printf("[M] => Vida %d | Posicao X:%d Y:%d %n", monstro.getVida(), monstro.obterX(),
				monstro.obterY());
		System.out.printf("[H] => Vida %d | Posicao X:%d Y:%d %n", heroi.getVida(), heroi.obterX(), heroi.obterY());
		System.out.println();

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.printf("[M] => Vida %d | Posicao X:%d Y:%d %n", monstro.getVida(), monstro.obterX(),
				monstro.obterY());
		System.out.printf("[H] => vida %d | Posicao X:%d Y:%d %n", heroi.getVida(), heroi.obterX(), heroi.obterY());
		System.out.println();

	}

}
