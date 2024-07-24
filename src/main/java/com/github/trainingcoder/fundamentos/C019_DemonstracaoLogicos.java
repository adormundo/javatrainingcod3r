package main.java.com.github.trainingcoder.fundamentos;

public class C019_DemonstracaoLogicos {
    public static void main(String[] args) {
        boolean concluiuTrabalho1 = false;
        boolean concluiuTrabalho2 = true;

        // Compra a TV de 50 polegadas somente se concluiu os dois trabalhos
        boolean comprouTV50 = concluiuTrabalho1 && concluiuTrabalho2;

        // Compra a TV de 32 polegadas se concluiu apenas um dos trabalhos (XOR - ou exclusivo)
        boolean comprouTV32 = concluiuTrabalho1 ^ concluiuTrabalho2;

        // Compra sorvete se concluiu pelo menos um dos trabalhos
        boolean comprouSorvete = concluiuTrabalho1 || concluiuTrabalho2;

        // Está mais saudável se não comprou sorvete
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50 polegadas: " + comprouTV50);
        System.out.println("Comprou TV 32 polegadas: " + comprouTV32);
        System.out.println("Comprou sorvete: " + comprouSorvete);
        System.out.println("Está mais saudável: " + maisSaudavel);
    }
}
