package main.java.com.github.trainingcoder.classe;

public class C040_DataMain {
    public static void main(String[] args) {
        C040_Data data = new C040_Data();
        data.dia = 1;
        data.mes = 1;
        data.ano = 1970;
        System.out.printf("%d/%d/%d", data.dia, data.mes, data.ano);
    }
}
