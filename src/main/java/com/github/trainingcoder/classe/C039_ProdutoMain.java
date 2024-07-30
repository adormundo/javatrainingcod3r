package main.java.com.github.trainingcoder.classe;

public class C039_ProdutoMain {
    public static void main(String[] args) {
        C039_Produto p1 = new C039_Produto("Notebook",4356.89,0.25);

        var p2 = new C039_Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinalp1 = p1.precoComDesconto();
        double precoFinalp2 = p1.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinalp1 + precoFinalp2) / 2;
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
