package PacoteGeneration;

import java.util.Scanner;

public class ClasseExercicios {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int ano,mes,dias,totaldias;
		
		System.out.println("Digite quantidade de anos: ");
		ano = entrada.nextInt();
		System.out.println("Digite quantidade de meses: ");
		mes = entrada.nextInt();
		System.out.println("Digite quantidade de dias: ");
		dias = entrada.nextInt();
		
		totaldias = (ano*365)+(mes*30)+dias;
		
		System.out.println("Sua idade em dias é: " + totaldias + " dias");
	}
}
