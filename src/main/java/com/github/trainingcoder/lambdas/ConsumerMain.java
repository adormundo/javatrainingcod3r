package main.java.com.github.trainingcoder.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
	public static void main(String[] args) {

		// Recebe um parametro <T> e não retornada nada.
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);

		Produto produto1 = new Produto("Caneta", 12.89, 0.09);
		Produto produto2 = new Produto("Notebook", 2987.99, 0.32);
		Produto produto3 = new Produto("Caderno", 19.92, 0.23);
		Produto produto4 = new Produto("Borracha", 4.33, 0.18);
		Produto produto5 = new Produto("Livro", 19.99, 0.03);

		imprimir.accept(produto1);

		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
		produtos.forEach(imprimir);
		produtos.forEach(System.out::println);
	}
}
