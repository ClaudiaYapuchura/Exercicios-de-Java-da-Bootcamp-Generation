package PacoteAula3;

import java.util.Scanner;

public class RepeticaoWhile4 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int idade,sexo,x=1,caracPsi=0,numC=0,numMN=0,numHA=0,numNMaior=0,numCMenor=0;
		
		while(x<=3)
		{
			System.out.printf("Digite a sua idade: ");
			idade = entrada.nextInt();
			System.out.printf("Escolha a op��o 1-Feminino,2-Masculino: ");
			sexo = entrada.nextInt();
			System.out.printf("Escolha a op��o 1-pessoa calma, 2-pessoa nervosa,3-pessoa agressiva: ");
			caracPsi = entrada.nextInt();
			
			if(caracPsi==1)
			{
				numC++;
			}
			if(sexo==1 && caracPsi==2)
			{
				numMN++;
			}
			if(sexo==2 && caracPsi==3)
			{
				numHA++;
			}
			if(caracPsi==2 && idade>40)
			{
				numNMaior++;
			}
			if(caracPsi==1 && idade<18)
			{
				numCMenor++;
			}
			x++;
		}
		System.out.printf("\nN�mero de pessoas calmas �: %d",numC);
		System.out.printf("\nN�mero de mulheres nervosas �: %d",numMN);
		System.out.printf("\nN�mero de homens agressivos �: %d",numHA);
		System.out.printf("\nN�mero de pessoas nervosas com mais de 40 anos �: %d",numNMaior);
		System.out.printf("\nN�mero de pessoas calmas com menos de 18 anos �: %d",numCMenor);
	}
}
