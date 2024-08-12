package main.java.com.github.trainingcoder.controle;

public class C033_Switch {
	public static void main(String[] args) {
		int diaDaSemana = 3;
		String nomeDia;

		switch (diaDaSemana) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda-feira";
			break;
		case 3:
			nomeDia = "Terça-feira";
			break;
		case 4:
			nomeDia = "Quarta-feira";
			break;
		case 5:
			nomeDia = "Quinta-feira";
			break;
		case 6:
			nomeDia = "Sexta-feira";
			break;
		case 7:
			nomeDia = "Sábado";
			break;
		default:
			nomeDia = "Dia inválido";
		}

		System.out.println("Hoje é " + nomeDia);
	}
}
