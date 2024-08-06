package main.java.com.github.trainingcoder.conjunto;

import java.util.LinkedList;
import java.util.Queue;

public class C054_LinkedList {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Adiciona elemento na lista, se exceder limite retorna exception
		fila.add("Ana");
		fila.add("Rebeca");
		fila.add("Isa");
		
		// Adiciona elemento na lista , se exceder limite retorna false
		fila.offer("Bruno");
		fila.offer("Carlos");
		fila.offer("Daniel");
		
		
		
		// Retorna o proximo da fila, caso vazio retorna null
		System.out.println(fila.peek());
		
		// Retorna o proximo da fila, caso vazio retorna exception
		System.out.println(fila.element());
		

		
		// Retorna o primeiro elemento já removendo, caso vazio retorna null
		System.out.println(fila.poll());
		
		// Retorna o primeiro elemento já removendo, caso vazio retorna exception
		System.out.println(fila.remove());
		
		
		fila.size(); // Tamanho da Queue
		fila.clear(); // Limpa a Queue
		fila.isEmpty(); // Verifica se está vazio
		fila.contains("Bruno"); // Verifica se tem na lista
	}

}
