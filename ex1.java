package exerciciosm1;
import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		System.out.println("ola");
		Scanner sc = new Scanner(System.in);
		int A, B, operacao;
		System.out.println("Digite o valor A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor B: ");
		B = sc.nextInt();
		operacao = A + B;
	
		System.out.println("soma = " + operacao);
		sc.close();
		 
		//System.out.println("digitou = " + A);
		

	}

}
