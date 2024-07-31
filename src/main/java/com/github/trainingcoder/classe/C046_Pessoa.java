package main.java.com.github.trainingcoder.classe;

public class C046_Pessoa {
    String nome;
    double peso;

    C046_Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(C046_Comida comida) {
        if (comida != null) this.peso += comida.peso;
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
