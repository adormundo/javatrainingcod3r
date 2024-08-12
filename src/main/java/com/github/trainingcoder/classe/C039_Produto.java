package main.java.com.github.trainingcoder.classe;

public class C039_Produto {
	String nome;
	double preco;
	double desconto;

	C039_Produto() {
	}

	C039_Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	double precoComDesconto(double descontoPlus) {
		return preco * (1 - (desconto + descontoPlus));
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
