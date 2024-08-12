package main.java.com.github.trainingcoder.classe;

public class C042_LojaDesconto {
	static double desconto = 0.25;
	String nome;
	double preco;

	public C042_LojaDesconto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public C042_LojaDesconto() {
	}

	public double getPrecoComDesconto() {
		return preco * (1 - desconto);
	}

	public double getPrecoComDesconto(double descontoPlus) {
		return preco * (1 - (desconto + descontoPlus));
	}
}
