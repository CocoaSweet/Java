/*
 * Criar um programa que enquanto estiver recebendo números positivos, 
 * imprime no console a soma dos números inseridos, 
 * caso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 */
package controle;

import java.util.Scanner;

public class SoPositivos {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numero = 0;
		double soma = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um número: ");
			numero = scan.nextDouble();
			if(numero >= 0) {
				soma += numero;
				System.out.printf("Soma: %.2f \n", soma);
			}
		}
		
		scan.close();
	}
}
