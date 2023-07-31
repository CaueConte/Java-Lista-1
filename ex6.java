package exerciciosm1;
import java.util.Scanner;
import java.util.Locale;
public class ex6 {

	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite o valor A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		//triangulo a * c / 2
		triangulo = (A * C) / 2;
		System.out.println("Area triangulo: " +triangulo);
		
		//circulo = b=raio pi3.14159
		circulo = Math.pow(C, 2) * 3.14159;
		System.out.println("area do circulo: " + circulo);
		
		//trapezio
		trapezio = ((A + B) * C) / 2;
		System.out.println("area do trapezio: " + trapezio);
		
		quadrado = Math.pow(B, 2);
		System.out.println("area quadrado " + quadrado);
		
		//retangulo
		retangulo = A * B;
		System.out.println("area do retangulo: " + retangulo);
		sc.close();
		
		
		
		

	}

}
