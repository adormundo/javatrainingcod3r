package main.java.com.github.trainingcoder.conjunto;

import java.util.HashSet;

public class C052_Set {

	public static void main(String[] args) {
		HashSet<Double> nums = new HashSet<>();
		nums.add(1.2);
		nums.add(3.5);
		nums.add(3.5);

		System.out.println("Tamanho: " + nums.size());
		System.out.println("Contém: " + nums.contains(1.2));

		HashSet<Double> pesos = new HashSet<>();
		pesos.add(80.2);
		pesos.add(67.5);
		pesos.add(45.5);

		// União entre dois conjuntos
		HashSet<Double> uniao = new HashSet<>();
		uniao.addAll(nums);
		uniao.addAll(pesos);
		System.out.println(uniao);

		// Retorna os items que contem em nums e que está em uniao
		nums.containsAll(uniao);
		System.out.println(nums);

	}

}
