package main.java.com.github.trainingcoder.fundamentos;

public class C018_OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operador E lógico (AND - &&)
        boolean resultadoE = condicao1 && condicao2;
        System.out.println("E lógico (&&): " + resultadoE); // false (ambas as condições devem ser verdadeiras)

        // Operador OU lógico (OR - ||)
        boolean resultadoOU = condicao1 || condicao2;
        System.out.println("OU lógico (||): " + resultadoOU); // true (pelo menos uma condição deve ser verdadeira)

        // Operador OU Exclusivo (XOR - ^)
        boolean resultadoXOR = condicao1 ^ condicao2;
        System.out.println("OU Exclusivo (^): " + resultadoXOR); // true (pelo menos uma condição deve ser verdadeira)

        // Operador NÃO lógico (NOT - !)
        boolean resultadoNAO = !condicao1;
        System.out.println("NÃO lógico (!): " + resultadoNAO); // false (inverte o valor da condição)




        // Exemplo de uso em uma condição
        int idade = 25;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir.");
        }
    }
}
