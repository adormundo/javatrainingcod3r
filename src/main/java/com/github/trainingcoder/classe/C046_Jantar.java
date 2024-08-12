package main.java.com.github.trainingcoder.classe;

public class C046_Jantar {
	public static void main(String[] args) {
		C046_Comida c1 = new C046_Comida("Arroz", 0.180);
		C046_Comida c2 = new C046_Comida("Feijao", 0.200);
		C046_Pessoa p = new C046_Pessoa("João", 99.8);

		System.out.println(p);

		p.comer(c1);
		System.out.println(p);

		p.comer(c2);
		System.out.println(p);

	}
}
