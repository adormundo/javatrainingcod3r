package main.java.com.github.trainingcoder.oo.encapsulamento.casaA;

public class Paulo {
	void testeVisibilidade() {
		Ana ana = new Ana();
		
		// System.out.println(ana.segredo);         // private  (nao-visivel)
		System.out.println(ana.facoDentroDeCasa);   // pacote|default (visivel)
		System.out.println(ana.formaDeFalar);       // protected (visivel)
		System.out.println(ana.todosSabem);         // public (visivel)
	}
}
