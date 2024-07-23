package main.java.com.github.trainingcoder.fundamentos;

public class C009_TipoString {
    public static void main(String[] args) {
        String s = "Boa tarde";

        // Concatenação
        System.out.println(s.concat("!!!"));             // Usando o método concat()
        System.out.println(s + "!!!");                   // Usando o operador + (mais eficiente)

        // Formatação
        System.out.println(s.toLowerCase());            // Converte para minúsculas
        System.out.println(s.toUpperCase());            // Converte para maiúsculas

        // Busca e Verificação
        System.out.println(s.startsWith("Boa"));        // Verifica se começa com "Boa"
        System.out.println(s.endsWith("tarde"));        // Verifica se termina com "tarde"
        System.out.println(s.contains("tar"));          // Verifica se contém "tar"

        // Substituição
        System.out.println(s.replace("tarde", "noite")); // Substitui "tarde" por "noite"

        // Extração de Substrings
        System.out.println(s.substring(4));             // A partir do índice 4 (inclusive)
        System.out.println(s.substring(0, 3));           // Do índice 0 (inclusive) ao 3 (exclusive)

        // Outras informações
        System.out.println(s.length());                 // Comprimento da string
        System.out.println(s.isEmpty());                // Verifica se está vazia
    }
}
