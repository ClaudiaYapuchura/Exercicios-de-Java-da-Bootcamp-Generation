package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer2 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int ano,mes,dias,totaldias;
		
		System.out.println("Digite quantidade de dias de vida: ");
		totaldias = entrada.nextInt();
		
		ano = totaldias/365;
		mes = (totaldias%365)/30;
		dias = (totaldias%365)%30;
		
		System.out.println("Você tem: " + ano + " anos, " + mes + " meses, " + dias + " dias de vida");
	}
}
