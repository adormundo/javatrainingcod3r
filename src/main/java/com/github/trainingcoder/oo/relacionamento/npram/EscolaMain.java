package main.java.com.github.trainingcoder.oo.relacionamento.npram;

public class EscolaMain {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Developer");
		Curso curso2 = new Curso("Pythoon Developer");
		Curso curso3 = new Curso("Angular Developer");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		System.out.println("Matriculados Java Developer: ");
		for (Aluno aluno : curso1.alunos) {
			System.out.println(" - " + aluno.nome);
		}
		System.out.println();
		
		System.out.println("Matriculados Pythoon Developer: ");
		for (Aluno aluno : curso2.alunos) {
			System.out.println(" - " + aluno.nome);
		}
		System.out.println();
		
		System.out.println("Matriculados Angular Developer: ");
		for (Aluno aluno : curso3.alunos) {
			System.out.println(" - " + aluno.nome);
		}
		System.out.println();
		
		System.out.println();
		
		System.out.println("Cursos do Aluno João: ");
		for (Curso curso : aluno1.cursos) {
			System.out.println(" - " + curso.nome);
		}
		System.out.println();
		
		System.out.println("Cursos da Aluna Maria: ");
		for (Curso curso : aluno2.cursos) {
			System.out.println(" - " + curso.nome);
		}
		System.out.println();
		
		System.out.println("Cursos do Aluno Pedro: ");
		for (Curso curso : aluno3.cursos) {
			System.out.println(" - " + curso.nome);
		}
		System.out.println();
		
	}
}
