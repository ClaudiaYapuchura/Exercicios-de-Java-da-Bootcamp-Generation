package PacoteGeneration;

import java.util.Scanner;

public class ClasseExer5 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		float nota1,nota2,nota3,mediafinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextInt();
		
		mediafinal = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.printf("O valor da média final é: %2.2f", mediafinal);
	}

}
