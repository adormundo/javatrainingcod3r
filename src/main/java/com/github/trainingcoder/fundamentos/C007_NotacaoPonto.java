package main.java.com.github.trainingcoder.fundamentos;

public class C007_NotacaoPonto {
    public static void main(String[] args) {
        /*
         * A notação ponto (.) em Java é um operador fundamental que permite acessar
         * membros (variáveis, métodos, classes internas, etc.) de um objeto ou classe.
         * Ela funciona como uma forma de "navegar" pela estrutura de um objeto, indicando que
         * você deseja interagir com um elemento específico dentro dele.
         * */

        // Strings
        String s = getString();
        System.out.println(s);

        String nome = "alfredo";
        System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("Nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Tamanho do nome: " + nome.length()); // Tamanho da string
        System.out.println("Primeira letra: " + nome.charAt(0)); // Caractere em posição
    }

    private static String getString() {
        String s = "Bom dia X";
        s = s.replace("X", "Senhor(a)"); // Substituição
        s = s.toUpperCase(); // Maiúsculas
        s = s.concat("!!!"); // Concatenação
        return s;
    }
}
