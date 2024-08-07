package main.java.com.github.trainingcoder.oo.UmPraN;

import java.util.ArrayList;

public class Compra {

	String cliente;
	private final ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(String nome, int quantidade, double preco) {
		Item item = new Item(nome, quantidade, preco);
		itens.add(item);
	}

	double obterValorTotal() {
		double valorTotal = 0;

		for (Item item : itens) {
			valorTotal += item.preco;
		}

		return valorTotal;
	}

	int obterTamanhoCarrinho() {
		return itens.size();
	}
}
