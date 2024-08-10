package main.java.com.github.trainingcoder.oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();

		jogador.x = 10;
		jogador.y = 20;

		jogador.andar(Direcao.NORTE);
		jogador.andar(Direcao.LESTE);
		jogador.andar(Direcao.NORTE);
		jogador.andar(Direcao.LESTE);

		System.out.printf("Posicao X:%d Y:%d", jogador.x, jogador.y);
	}

}
