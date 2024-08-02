package main.java.com.github.trainingcoder.conjunto;

public class C051_Equals {
    public static void main(String[] args) {
        C051_Usuario u1 = new C051_Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezmail.com";

        C051_Usuario u2 = new C051_Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
