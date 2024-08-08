package main.java.com.github.trainingcoder.oo.npram;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
