package PacoteAula4;

import java.util.Scanner;

public class Array04 {
	public static void main(String[] args)
	{	
		Scanner entrada = new Scanner(System.in);
		float [][] m1 = new float[2][2],m2 = new float[2][2];
		float [][] soma = new float[2][2],subtracao = new float[2][2];
		int cons;
		
		System.out.printf("Matriz M1: ");
		for(int linha=0;linha<2;linha++){
			for(int coluna=0;coluna<2;coluna++){
				System.out.printf("\nDigite os elementos m[%d][%d]: ", linha+1,coluna+1);
				m1[linha][coluna] = entrada.nextFloat();
			}
		}
		System.out.printf("\nMatriz M2: ");
		for(int linha=0;linha<2;linha++){
			for(int coluna=0;coluna<2;coluna++){
				System.out.printf("\nDigite os elementos m[%d][%d]: ", linha+1,coluna+1);
				m2[linha][coluna] = entrada.nextFloat();
			}
		}
		System.out.println("\nLista de opções: ");
		System.out.println("\n(1) somar as duas matrizes.");
		System.out.println("\n(2) subtrair a primeira matriz da outra.");
		System.out.println("\n(3) adicionar uma constante as duas matrizes");
		System.out.println("\n(4) imprimir as matrizes.");
		System.out.println("\nDigite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			for(int linha=0;linha<2;linha++){
				for(int coluna=0;coluna<2;coluna++){
					soma [linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
					System.out.println("\nO valor da subtração das matrizes é: " + soma [linha][coluna]);
				}
			}
			break;
		case 2:
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0;coluna<2;coluna++) {
					subtracao [linha][coluna] = m1[linha][coluna] - m2[linha][coluna];
					System.out.println("\nO valor da subtração das matrizes é: "+ subtracao[linha][coluna]);
				}
			}
			break;
		case 3:
			System.out.println("Digite uma constante: ");
			cons = entrada.nextInt();
			
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0;coluna<2;coluna++) {
					m1[linha][coluna] = m1[linha][coluna] + cons;
					m2[linha][coluna] = m2[linha][coluna] + cons;
					
					System.out.println("\n O valor de M1 é: " + m1[linha][coluna]);
					System.out.println("\n O valor de M2 é: " + m2[linha][coluna]);
				}
			}
			break;
		case 4:
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0;coluna<2;coluna++) {
					System.out.println("Matriz M1 é: " + m1[linha][coluna]);
				}
			}
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0;coluna<2;coluna++) {
					System.out.println("Matriz M2 é: "+ m2[linha][coluna]);
				}
			}
			break;
			default:
				System.out.println("Opção inválida!");
		}
	}
}
