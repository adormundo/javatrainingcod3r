package main.java.com.github.trainingcoder.classe;

public class C045_ValorNulo {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!"));

		C040_Data d1 = Math.random() > 0.5 ? new C040_Data() : null;
		if (d1 != null) {
			d1.mes = 7;
			System.out.println(d1.obterDataFormatada());
		}

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
