package PacoteAula3;

import java.util.Scanner;

public class RepeticaoDoWhile5 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num,somaNum=0;
		
		do
		{
			System.out.printf("Digite a sua idade: ");
			num = entrada.nextInt();
			somaNum = somaNum + num;
		}
		while(num!=0);
		System.out.printf("A soma dos números digitados é: %d",somaNum);
	}
}
