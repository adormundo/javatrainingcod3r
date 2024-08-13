package main.java.com.github.trainingcoder.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaDesafio {
	public static void main(String[] args) {
		/*
		 * 1. Calcular o preco real com desconto 
		 * 2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento) 
		 * 3. Frete: >= 3000 (100) | < 3000 (50) 
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */

		Produto produto = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> aplicaDesconto = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> aplicaImpostoMunicipal = preco -> preco >= 2500 ? preco + preco * 0.085 : preco;
        UnaryOperator<Double> aplicaFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondaPreco = preco -> Math.round(preco * 100.0) / 100.0;
        Function<Double, String> formataPreco = preco -> String.format("R$%.2f", preco);

        String resultado = aplicaDesconto
            .andThen(aplicaImpostoMunicipal)
            .andThen(aplicaFrete)
            .andThen(arredondaPreco)
            .andThen(formataPreco)
            .apply(produto);

        System.out.println(resultado);
	}

}
