package PacoteAulaRevisao;

import java.util.Scanner;

public class Revisao1 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double precoEtiqueta,precoFinal;
		
		System.out.println("\nDigite o pre�o de etiqueta: ");
		precoEtiqueta = entrada.nextInt();
		System.out.println("\nC�digo de condi��o de pagamento");
		System.out.println("\n(1) � vista em dinheiro ou em cheque, recebe 20% de desconto");
		System.out.println("\n(2) � vista no cart�o de cr�dito,recebe 15% de desconto");
		System.out.println("\n(3) Em duas vezes, pre�o normal de etiqueta sem juros");
		System.out.println("\n(4) Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%");
		System.out.println("\nDigite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			precoFinal = (precoEtiqueta * 0.20);
			precoFinal = precoEtiqueta - precoFinal;
			System.out.println("O pre�o final � R$ " + precoFinal + " reais.");
			break;
			
		case 2:
			precoFinal = (precoEtiqueta * 0.15);
			precoFinal = precoEtiqueta - precoFinal;
			System.out.println("O pre�o final � R$ " + precoFinal + " reais.");
			break;
			
		case 3:
			precoFinal = precoEtiqueta/2;
			System.out.println("O pre�o final � R$ " + precoFinal + " reais.");
			break;
		
		case 4:
			precoFinal = (precoEtiqueta * 0.10);
			precoFinal = (precoEtiqueta + precoFinal)/3;
			System.out.printf("O pre�o final � R$ %.2f",precoFinal);
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
	}
}
