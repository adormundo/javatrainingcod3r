package main.java.com.github.trainingcoder.conjunto;

import java.util.ArrayDeque;
import java.util.Deque;

public class C055_Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();

		// Adiciona elemento na lista, se exceder limite retorna bool
		livros.add("O Pequeno Príncipe");

		// Adiciona elemento na lista, se exceder limite retorna excpetion
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
	}
}
