package main.java.com.github.trainingcoder.fundamentos;

public class C014_ConversoesString {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        // Conversão implícita (widening)
        int numero = 42;
        String texto = "O número é: " + numero; // Conversão automática do int para String
        System.out.println(texto);


        // Conversão explícita (narrowing) - Tipos numéricos para String
        double valorDouble = 3.14159;
        String textoDouble = String.valueOf(valorDouble);
        System.out.println(textoDouble);

        boolean verdadeiro = true;
        String textoBoolean = String.valueOf(verdadeiro);
        System.out.println(textoBoolean);


        // Conversão explícita - String para tipos numéricos
        String numeroString = "123";
        int numeroConvertido = Integer.parseInt(numeroString);
        System.out.println(numeroConvertido + 5); // Saída: 128

        String valorDoubleString = "3.14159";
        double valorDoubleConvertido = Double.parseDouble(valorDoubleString);
        System.out.println(valorDoubleConvertido * 2); // Saída: 6.28318


        // Conversão explícita - String para boolean
        String textoBooleano = "true";
        boolean valorBooleano = Boolean.parseBoolean(textoBooleano);
        System.out.println(valorBooleano); // Saída: true


        // Exemplo de erro ao tentar converter String inválida para número
        try {
            int numeroInvalido = Integer.parseInt("abc"); // Lançará NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter String inválida para número.");
        }
    }
}
