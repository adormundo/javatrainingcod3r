package main.java.com.github.trainingcoder.oo.encapsulamento.casaB;

import main.java.com.github.trainingcoder.oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	void testeVisibilidade() {

		// Como Pedro herda de Ana que está em outro pacote os atributos vem por herança

		// System.out.println(segredo); // private (nao-visivel)
		// System.out.println(facoDentroDeCasa); // pacote|default (nao-visivel)
		System.out.println(formaDeFalar); // protected (visivel)
		System.out.println(todosSabem); // public (visivel)
	}
}
