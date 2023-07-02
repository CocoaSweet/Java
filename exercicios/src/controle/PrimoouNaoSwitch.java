/*
 * Criar um programa que receba 
 * um número e diga se ele é um número primo
 * utilizando a estrutura switch
 */
package controle;

import java.util.Scanner;

public class PrimoouNaoSwitch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int numero = scan.nextInt();
		
		int divide = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divide++;
			}
		}
		
		switch (divide) {
		case 2:
			System.out.println("\nO número é primo.");
			break;
		default:
			System.out.println("O número não é primo.");
		}
		
		scan.close();
	}
}
