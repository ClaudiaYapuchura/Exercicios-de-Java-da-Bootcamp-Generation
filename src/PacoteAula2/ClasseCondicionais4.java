package PacoteAula2;

import java.util.Scanner;

public class ClasseCondicionais4 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num;
		double resultado;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		if(num%2==0)
		{
			resultado = Math.sqrt(num);
			System.out.println("Este número é par " + resultado);
		}
		else
		{
			resultado = Math.pow((num),2);
			System.out.println("Este número é impar "+ resultado);
		}
	}
}
