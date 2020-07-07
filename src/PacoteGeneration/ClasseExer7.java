package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer7 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();
		System.out.println("Digite o valor de D: ");
		d = entrada.nextInt();
		System.out.println("Digite o valor de E: ");
		e = entrada.nextInt();
		System.out.println("Digite o valor de F: ");
		f = entrada.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O valor de x é: %d",x);
		System.out.printf("\nO valor de y é: %d",y);
	}
}
