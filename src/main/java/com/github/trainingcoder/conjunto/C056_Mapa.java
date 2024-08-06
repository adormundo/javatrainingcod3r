package main.java.com.github.trainingcoder.conjunto;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C056_Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// Put adiciona e substitui 
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(20, "Rafaela");
		usuarios.put(3, "Rebeca");
		System.out.println(usuarios);
		
		// Retorna o conjunto das chaves
		System.out.println(usuarios.keySet());
		
		// Retorna o conjunto dos valores
		System.out.println(usuarios.values());
		
		// Retorna os dois chave/valor
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println(usuarios.get(1));
		
		for (Entry<Integer, String> usuario : usuarios.entrySet()) {
			System.out.printf("%02d - %s%n", usuario.getKey(), usuario.getValue());
		}
		

	}

}
