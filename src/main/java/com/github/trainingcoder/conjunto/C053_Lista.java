package main.java.com.github.trainingcoder.conjunto;

import java.util.ArrayList;

public class C053_Lista {
	public static void main(String[] args) {
		ArrayList<C053_Usuario> lista = new ArrayList<>();
		
		C053_Usuario e = new C053_Usuario("Ana");
		lista.add(e);
		lista.add(new C053_Usuario("Carlos"));
		lista.add(new C053_Usuario("Bia"));
		lista.add(new C053_Usuario("Lia"));
		lista.add(new C053_Usuario("Manu"));
		
		for (C053_Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		
		// Acessando pelo index
		System.out.println(lista.get(3));
		
		// Contém
		System.out.println(lista.contains(new C053_Usuario("Bia")));
	}
}
