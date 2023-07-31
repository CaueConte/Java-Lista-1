package exerciciosm1;
import java.util.Scanner; 

public class ex3 {

	public static void main(String[] args) {
		System.out.println("ola");
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, operacao;
		System.out.println("Digite A: ");
		A = sc.nextInt();
		System.out.println("Digite B: ");
		B = sc.nextInt();
		System.out.println("Digite C: ");
		C = sc.nextInt();
		System.out.println("Digite D: ");
		D = sc.nextInt();
		operacao = A*B-C*D;
		
		System.out.println(operacao);
		

	}

}
