package main.java.com.github.trainingcoder.conjunto;

import java.util.Objects;

public class C051_Usuario {
	String nome;
	String email;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		C051_Usuario that = (C051_Usuario) o;
		return Objects.equals(nome, that.nome) && Objects.equals(email, that.email);
	}
}
