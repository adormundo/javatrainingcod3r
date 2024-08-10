package main.java.com.github.trainingcoder.oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador monstro = new Monstro(10,10);
		Jogador heroi = new Heroi(10,11);

		System.out.printf("[M] => Vida %d | Posicao X:%d Y:%d %n", monstro.vida, monstro.x, monstro.y);
		System.out.printf("[H] => Vida %d | Posicao X:%d Y:%d %n", heroi.vida, heroi.x, heroi.y);
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.printf("[M] => Vida %d | Posicao X:%d Y:%d %n", monstro.vida, monstro.x, monstro.y);
		System.out.printf("[H] => vida %d | Posicao X:%d Y:%d %n", heroi.vida, heroi.x, heroi.y);
		System.out.println();
		
		
	}

}
