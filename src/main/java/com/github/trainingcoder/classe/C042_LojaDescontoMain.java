package main.java.com.github.trainingcoder.classe;

public class C042_LojaDescontoMain {
	public static void main(String[] args) {
		C042_LojaDesconto p1 = new C042_LojaDesconto("Notebook", 4356.89);
		C042_LojaDesconto p2 = new C042_LojaDesconto("Caneta Preta", 12.53);

		C042_LojaDesconto.desconto = 0.29;

		System.out.println(p1.nome + " - " + p1.getPrecoComDesconto());
		System.out.println(p2.nome + " - " + p2.getPrecoComDesconto());
	}
}
