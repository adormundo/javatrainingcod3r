package main.java.com.github.trainingcoder.classe;

public class C044_PrimeiroTrauma {

    int a = 3;
    static int b = 4;

    public static void main(String[] args) {
        // precisa instaciar pra acessar o a em método static
        C044_PrimeiroTrauma pt = new C044_PrimeiroTrauma();
        System.out.println(pt.a);

        // static para static não precisa
        System.out.println(b);

    }
}
