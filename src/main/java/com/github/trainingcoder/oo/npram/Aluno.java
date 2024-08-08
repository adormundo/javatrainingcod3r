package main.java.com.github.trainingcoder.oo.npram;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	
	
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}

