package main.java.com.github.trainingcoder.oo.relacionamento.composicao.desafio;

public class Loja {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Maria");
		Cliente cliente2 = new Cliente("Jose");

		Compra compras1 = new Compra();
		Compra compras2 = new Compra();

		Item item1 = new Item("Lapis", 3, 3.42);
		Item item2 = new Item("Caneta", 4, 4.59);
		Item item3 = new Item("Caderno", 2, 47.93);
		Item item4 = new Item("Borracha", 5, 1.99);

		compras1.adicionarItem(item1);
		compras1.adicionarItem(item2);

		compras2.adicionarItem(item3);
		compras2.adicionarItem(item4);

		cliente1.adicionarCompra(compras1);
		cliente2.adicionarCompra(compras2);
		
		System.out.println("Total Compras da Maria: " + cliente1.obterValorTotal());
		System.out.println("Total Compras do Jose: " + cliente2.obterValorTotal());
	}
}
