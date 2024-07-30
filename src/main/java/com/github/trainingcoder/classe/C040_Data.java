package main.java.com.github.trainingcoder.classe;

public class C040_Data {
    int dia;
    int mes;
    int ano;

    public C040_Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public C040_Data() {
        this(1,1,1970);
    }

    String obterDataFormatada() {
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
