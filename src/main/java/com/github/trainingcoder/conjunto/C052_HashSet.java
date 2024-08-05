package main.java.com.github.trainingcoder.conjunto;

import java.util.HashSet;

public class C052_HashSet {

	public static void main(String[] args) {
		HashSet<Double> nums = new HashSet<>();
		nums.add(1.2);
		nums.add(3.5);
		nums.add(3.5);

		System.out.println("Tamanho: " + nums.size());
		System.out.println("Contém: " + nums.contains(1.2));
	}

}
