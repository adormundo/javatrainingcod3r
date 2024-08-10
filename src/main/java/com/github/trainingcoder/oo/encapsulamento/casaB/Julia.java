package main.java.com.github.trainingcoder.oo.encapsulamento.casaB;

import main.java.com.github.trainingcoder.oo.encapsulamento.casaA.Ana;

public class Julia {
	void testeVisibilidade() {
		Ana ana = new Ana();
		
		// System.out.println(ana.segredo);            // private  (nao-visivel)
		// System.out.println(ana.facoDentroDeCasa);   // pacote|default (nao-visivel)
		// System.out.println(ana.formaDeFalar);       // protected (nao-visivel)
		System.out.println(ana.todosSabem);            // public (visivel)
	}
}
