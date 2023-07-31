package exerciciosm1;
import java.util.Scanner;
import java.util.Locale;

public class ex5 {

	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade, codigo2, quantidade2;
		double precoUnidade, operacao, precoUnidade2, operacao2, soma;
		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		System.out.println("Digite o precod a unidade: ");
		precoUnidade = sc.nextDouble();
		operacao = precoUnidade * (int)quantidade;
		
		System.out.println("Digite o codigo do produto 2: ");
		codigo2 = sc.nextInt();
		System.out.println("Digite a quantidade do produto 2: ");
		quantidade2 = sc.nextInt();
		System.out.println("DIgite o preco da unidade 2: ");
		precoUnidade2 = sc.nextDouble();
		operacao2 = quantidade2 * precoUnidade2;
		soma = operacao + operacao2;
		
		System.out.println("Codigo do produto: " + codigo);
		System.out.println("Quantidade produto 1: " + quantidade);
		System.out.println("Preco todos produtos 1: " + operacao);
		
		System.out.println("codigo produto 2: " + codigo2);
		System.out.println("quantidad eproduto 2: " + quantidade2);
		System.out.println("preco todos produtos 2: " + operacao2);
		System.out.printf("preco total %.2f", soma);
		sc.close();
		

	}

}
