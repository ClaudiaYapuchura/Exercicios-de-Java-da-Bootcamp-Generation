package PacoteAulaRevisao;

import java.util.Scanner;

public class Revisao3 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int num,quant1=0,quant2=0,quant3=0,quant4=0;
		   
		System.out.printf("Digite o número: ");
		num = entrada.nextInt();
		
		while(num>0)
		{
			if(num>0 && num<25)
			{
				quant1++;
			}
			if(num>26 && num<50)
			{
				quant2++;
			}
			if(num>51 && num<75)
			{
				quant3++; 
			}
			if(num>76 && num<100)
			{
				quant4++;
			}
			System.out.printf("Digite o número: ");
			num = entrada.nextInt();
		}
		System.out.printf("\nQuantidade de números digitados no intervalo [0-25] é: %d",quant1);
		System.out.printf("\nQuantidade de números digitados no intervalo [26-50] é: %d",quant2);
		System.out.printf("\nQuantidade de números digitados no intervalo [51-75] é: %d",quant3);
		System.out.printf("\nQuantidade de números digitados no intervalo [76-100] é: %d",quant4);
	}
}
