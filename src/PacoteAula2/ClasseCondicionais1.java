package PacoteAula2;

import java.util.Scanner;

public class ClasseCondicionais1 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num1,num2,num3,maiorNum=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = entrada.nextInt();
		
		if(num1>num2)
		{
			maiorNum = num1;
		}
		else if(num3>num2)
		{
			maiorNum = num3;
		}
		else
		{
			maiorNum=num2;
		}
		
		System.out.println("O maior n�mero �: " + maiorNum);
	}
}
