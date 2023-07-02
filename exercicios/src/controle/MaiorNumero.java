/*
 * Crie um programa que recebe 10 valores 
 * e ao final imprima o maior número.
 */
package controle;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			double numero = scan.nextDouble();
			if(i == 0) {
				maior = numero;
			}else if(numero > maior){
				maior = numero;
			}
			
		}
		
		System.out.printf("O maior número foi: %.2f.", maior);
		
		scan.close();
	}
}
