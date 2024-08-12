package main.java.com.github.trainingcoder.oo.relacionamento.umpran;

public class MercadoMain {
	public static void main(String[] args) {
		Compra compra1 = new Compra();

		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);

		System.out.println("Quantiade de Itens: " + compra1.obterTamanhoCarrinho());
		System.out.println("Valor Total dos Itens: " + compra1.obterValorTotal());
	}
}
