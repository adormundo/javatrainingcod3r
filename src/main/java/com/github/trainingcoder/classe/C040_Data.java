package main.java.com.github.trainingcoder.classe;

public class C040_Data {
    int dia;
    int mes;
    int ano;


    String obterDataFormatada() {
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
