package PacoteAulaRevisao;

import java.util.Scanner;

public class Revisao2 {
	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.println("Digite seu peso: ");
		peso = ent.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = ent.nextDouble();

		
		imc = peso/(altura*altura);
		
		if(imc<18.5)
		{
			System.out.println("Abaixo do peso!");
		}
		else if(imc>=18.5 && imc<25)
		{
			System.out.println("Peso normal!");
		}
		else if(imc>=25 && imc<30)
		{
			System.out.println("Acima do peso!");
		}
		else {
			System.out.println("Obeso!");
		}
	}
}
