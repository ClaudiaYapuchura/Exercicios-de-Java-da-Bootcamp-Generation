package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer6 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int x1,x2,y1,y2;
		double x,y,d;
		
		System.out.println("Digite o valor de X2: ");
		x2 = entrada.nextInt();
		System.out.println("Digite o valor de X1: ");
		x1 = entrada.nextInt();
		System.out.println("Digite o valor de Y2: ");
		y2 = entrada.nextInt();
		System.out.println("Digite o valor de Y1: ");
		y1 = entrada.nextInt();
		
		x = Math.pow((x2-x1),2);
		y = Math.pow((y2-y1),2);
		d = Math.sqrt(x+y);
		
		System.out.printf("O resultado da equação é: %2.2f", d);
	}
}
