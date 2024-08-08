package main.java.com.github.trainingcoder.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	String nome;
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(Item item) {
		itens.add(item);
	}
}
