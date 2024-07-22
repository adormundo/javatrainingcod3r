package main.java.com.github.trainingcoder.fundamentos;

import java.util.Date;

/*
 * Em Java, a instrução import é utilizada para trazer classes e interfaces
 * de outros pacotes para o escopo do seu código. Isso evita a necessidade de
 * escrever o nome completo (qualificado) da classe toda vez que você a utiliza,
 * tornando o código mais conciso e legível.
 *
 * Devido à sua importância e uso frequente, o compilador Java importa automaticamente
 * todas as classes do pacote java.lang para todos os arquivos de código-fonte.
 *
 * Evite usar o wildcard (*) para importar todas as classes de um pacote, a menos que você
 * realmente precise de muitas delas. Ex.: import java.io.*;
 *
 * Mantenha seus imports organizados em ordem alfabética
 * */
public class C008_Import {

    public static void main(String[] args) {
        String s = "Bom dia!";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);
    }
}
