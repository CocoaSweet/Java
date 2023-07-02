/*
 * Criar um programa que receba
 * um número e diga se ele é um número primo
 */
package controle;

import java.util.Scanner;

public class PrimoouNao {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		int divide = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divide++;
			}
		}
		
		if(divide == 2) {
			System.out.println("O número é primo.");
		}else {
			System.out.println("O número não é primo.");
		}
		
		scan.close();
	}
}
