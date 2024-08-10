package main.java.com.github.trainingcoder.oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Monstro();
		jogador1.x = 10;
		jogador1.y = 10;
		
		Jogador jogador2 = new Heroi();
		jogador2.x = 10;
		jogador2.y = 11;

		System.out.printf("Life %d | Posicao X:%d Y:%d %n", jogador1.vida, jogador1.x, jogador1.y);
		System.out.printf("Life %d | Posicao X:%d Y:%d %n", jogador2.vida, jogador2.x, jogador2.y);
		System.out.println();
		
		jogador1.atacar(jogador2);
		
		System.out.printf("Life %d | Posicao X:%d Y:%d %n", jogador1.vida, jogador1.x, jogador1.y);
		System.out.printf("Life %d | Posicao X:%d Y:%d %n", jogador2.vida, jogador2.x, jogador2.y);
		System.out.println();
		
		
	}

}
