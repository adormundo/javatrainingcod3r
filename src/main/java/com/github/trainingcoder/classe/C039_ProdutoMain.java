package main.java.com.github.trainingcoder.classe;

public class C039_ProdutoMain {
    public static void main(String[] args) {
        C039_Produto p1 = new C039_Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new C039_Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinalp1 = p1.preco * (1 - p1.desconto);
        double precoFinalp2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho = (precoFinalp1 + precoFinalp2) / 2;
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
