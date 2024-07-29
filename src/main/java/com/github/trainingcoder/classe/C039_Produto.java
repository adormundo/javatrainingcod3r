package main.java.com.github.trainingcoder.classe;

public class C039_Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(double descontoPlus) {
        return preco * (1 - (desconto + descontoPlus));
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
