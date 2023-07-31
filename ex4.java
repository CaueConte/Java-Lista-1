package exerciciosm1;
import java.util.Scanner;
import java.util.Locale;

public class ex4 {

	public static void main(String[] args) {
		System.out.println("ola");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario;
		double horaTrabalhada, valorHora, operacao;
		System.out.println("Digite o numero do funcionario: ");
		numFuncionario = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horaTrabalhada = sc.nextDouble();
		System.out.println("Digite o vlaor da hroa");
		valorHora = sc.nextDouble();
		
		operacao = horaTrabalhada * valorHora;
		
		System.out.println("Numero: " + numFuncionario);
		System.out.printf("salario = %.2f ", operacao);
		sc.close();

	}

}
