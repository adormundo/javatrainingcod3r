package main.java.com.github.trainingcoder.fundamentos;

public class C004_Temperatura {

    public static final int PONTO_CONGELAMENTO_F = 32;
    public static final double FATOR_CONVERSAO = 5.0 / 9.0;

    public static void main(final String[] args) {
        final int temperaturaFahrenheit = 86;
        final double temperaturaCelsius = (temperaturaFahrenheit - PONTO_CONGELAMENTO_F) * FATOR_CONVERSAO;
        System.out.printf("%d°F equivale a %.0f°C", temperaturaFahrenheit, temperaturaCelsius);
    }
}
