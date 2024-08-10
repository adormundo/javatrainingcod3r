package main.java.com.github.trainingcoder.oo.heranca;

public class Heroi extends Jogador {
	
	boolean atacar(Jogador outroJogador) {
		boolean ataque1 = super.atacar(outroJogador);
		boolean ataque2 = super.atacar(outroJogador);
		boolean ataque3 = super.atacar(outroJogador);
		return ataque1 || ataque2 || ataque3;
	}

}
