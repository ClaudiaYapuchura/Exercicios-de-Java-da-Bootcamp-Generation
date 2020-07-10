package PacoteAula4;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int [] vA = {1,0,5,-2,-5,7};
		int soma;
		
		soma = vA[0] + vA[1] + vA[5];
		
		System.out.printf("A soma das posições A[0],A[1] e A[5] é: %d", soma);
		
		vA[4] = 100;
		
		for(int i:vA)
		{
			System.out.printf("\n%d",i);
		}
	}
}
