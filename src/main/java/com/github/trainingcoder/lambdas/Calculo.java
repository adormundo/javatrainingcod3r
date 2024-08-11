package main.java.com.github.trainingcoder.lambdas;

//Essa annotation força ter um método por arquivo
@FunctionalInterface
public interface Calculo {
	public abstract double executar(double a, double b);
	
}
