package main.java.com.github.trainingcoder.oo.relacionamento.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	final List<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}

	double obterValorTotal() {
		double valorTotal = 0;
		for (Compra compra : compras) {
			for (Item item : compra.itens) {
				valorTotal += item.produto.preco * item.quantidade;
			}
		}
		return valorTotal;
	}
}
