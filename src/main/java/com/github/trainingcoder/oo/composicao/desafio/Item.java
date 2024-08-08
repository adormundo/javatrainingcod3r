package main.java.com.github.trainingcoder.oo.composicao.desafio;

public class Item {
	int quantidade;
	Produto produto;
	
	Item(String nome, int quantidade, double preco) {
		this.quantidade = quantidade;
		produto = new Produto(nome, preco);
	}
	
}
