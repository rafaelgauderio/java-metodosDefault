package application;

import java.util.Locale;
import java.util.Scanner;

import servicos.ServicoDeJurosNoBrazil;
import servicos.ServicoDeJurosNoUsa;

public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner (System.in);
		System.out.print("Informe o valor que vai pegar emprestado: ");
		double valor=sc.nextDouble();
		System.out.print("Informe em quantos meses vai pagar: ");
		int meses=sc.nextInt();
		
		ServicoDeJurosNoBrazil juros = new ServicoDeJurosNoBrazil(2.0);
		
		ServicoDeJurosNoUsa jurosUsa = new ServicoDeJurosNoUsa(3.5);
		
		double pagamento = juros.pagamento(valor,meses);
		double pagamentoUsa=jurosUsa.pagamento(valor, meses);
		
		System.out.println();
		System.out.println("Cálculo com taxa de juros brasileira");
		System.out.println("Pagamento após "+meses+" meses, com uma taxa de juros de "+juros.getTaxaDeJuros());
		System.out.println(String.format("R$ %.2f", pagamento));
		
		System.out.println();
		System.out.println("Cálculo com taxa de juros americada");
		System.out.println("Pagamento após "+meses+" meses, com uma taxa de juros de "+jurosUsa.getTaxaDeJuros());
		System.out.println(String.format("R$ %.2f", pagamentoUsa));
		
		sc.close();
		
		
		
		
		
	}

}
