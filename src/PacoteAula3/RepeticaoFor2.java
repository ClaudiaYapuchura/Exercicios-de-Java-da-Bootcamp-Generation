package PacoteAula3;

import java.util.Scanner;

public class RepeticaoFor2 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num,x,pares=0,impares=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if(num%2==0)
			{
				pares++;
			}
			else
			{
				impares++;
			}	
		}
		System.out.println("\nA quantidade de números pares é: " + pares);
		System.out.println("A quantidade de números ímpares é: " + impares);
	}
}
