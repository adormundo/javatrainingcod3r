package main.java.com.github.trainingcoder.oo.encapsulamento;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", -30);
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		
	}
}
