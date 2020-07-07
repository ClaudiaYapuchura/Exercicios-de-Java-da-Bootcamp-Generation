package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer4 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int a,b,c;
		double r,s,d;
		
		System.out.println("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextInt();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.printf("O valor da expressão d é: %2.2f", d);
		
	}
}
