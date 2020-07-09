package PacoteAula3;

import java.util.Scanner;

public class RepeticaoWhile3 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int idade,idMenor=0,idMaior=0;
		
		System.out.printf("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade!=-99)
		{
			if(idade<=21)
			{
				idMenor++;
			}
			if(idade>=50)
			{
				idMaior++;
			}
			System.out.printf("Digite a sua idade: ");
			idade = entrada.nextInt();
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos é: %d",idMenor);
		System.out.printf("\nTotal de pessoas com mais de 50 anos é: %d",idMaior);
	}
}
