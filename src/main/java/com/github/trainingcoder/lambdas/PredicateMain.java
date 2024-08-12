package main.java.com.github.trainingcoder.lambdas;

import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		
		// Recebe um parametro <T> e retorna bool
		Predicate<Produto> isExpensive = produto -> (produto.preco * (1 - produto.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isExpensive.test(produto));
	}

}
