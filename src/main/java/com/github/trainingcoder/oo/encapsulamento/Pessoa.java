package main.java.com.github.trainingcoder.oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}


	// Getter
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	

	// Setter
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120)
			this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Olá eu sou o %s e tenho %d anos", getNome(), getIdade());
	}

}
