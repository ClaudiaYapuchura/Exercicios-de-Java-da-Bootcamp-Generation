package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer3 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int hora,min,seg,tempototal;
		
		System.out.println("Digite o tempo de duração do evento: ");
		tempototal = entrada.nextInt();
		
		hora = tempototal/3600;
		min = (tempototal-(hora*3600))/60;
		seg = tempototal-(hora*3600)-(min*60);
		
		System.out.println("O tempo de duração do evento na fábrica é: " + hora + " horas, " + min + " minutos, " + seg + " segundos.");
		
	}
}
