package main.java.com.github.trainingcoder.conjunto;

import java.util.Arrays;
import java.util.Scanner;

public class C050_Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantidade de alunos: ");
		int quantidaDeAlunos = entrada.nextInt();

		System.out.print("Quantidade de notas: ");
		int quantidaDeNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[quantidaDeAlunos][quantidaDeNotas];

		double total = 0;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informa a nota %d do aluno %d: ", nota + 1, aluno + 1);
				notasDaTurma[aluno][nota] = entrada.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}

		double media = total / (quantidaDeAlunos * quantidaDeNotas);
		System.out.println("Média da turma é " + media);

		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}
}
