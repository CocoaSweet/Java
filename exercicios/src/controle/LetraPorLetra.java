/*
 * Criar um programa que receba uma palavra 
 * e imprime no console letra por letra.
 */
package controle;

import java.util.Scanner;

public class LetraPorLetra {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		String palavra = scan.next();
		char[] letras = palavra.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		scan.close();
	}
}
