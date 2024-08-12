package main.java.com.github.trainingcoder.classe;

public class C041_AreaCirc {
	double raio;
	public final static double PI = 3.141592653589793;

	C041_AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(this.raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
