package exerciciosm1;
import java.util.Scanner;
import java.util.Locale;


public class ex2 {

	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double raio, pi, operacao;
		pi = 3.14159;
		raio = sc.nextDouble();
		operacao = pi * Math.pow(raio, 2);
		
		System.out.println("area: " + operacao);
		

	}

}
