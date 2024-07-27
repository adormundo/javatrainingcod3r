package main.java.com.github.trainingcoder.controle;

public class C034_NewSwtich {
    public static void main(String[] args) {
        int diaDaSemana = 3;

        String nomeDia = switch (diaDaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };

        System.out.println("Hoje é " + nomeDia);
    }
}
