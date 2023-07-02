/*
 * Criar um programa que receba um número 
 * e verifique se ele está entre 0 e 10 e é par
 */

package controle;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = scan.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O número está no intervalo de [0, 10] e é par.");
			} else {
				System.out.println("O número está no intervalo de [0, 10] e é ímpar.");
			}
		} else {
			System.out.println("O número não está no intervalo de [0, 10].");
		}
		
	}
}
