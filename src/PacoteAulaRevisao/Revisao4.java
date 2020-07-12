package PacoteAulaRevisao;

import java.util.Scanner;

public class Revisao4 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double num1=1,num2=1,soma=0;
		
		while(num1<=99 && num2<=50)
		{
			soma+=(num1/num2);
			num1+=2;
			num2++;
		}
		System.out.println("A soma é: " + soma);
	}
}