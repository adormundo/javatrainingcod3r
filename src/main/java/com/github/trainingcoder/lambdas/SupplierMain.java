package main.java.com.github.trainingcoder.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {
	public static void main(String[] args) {
		// Não recebe nenhum parametro, mais retorna <R>
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(umaLista.get());
	}
}
