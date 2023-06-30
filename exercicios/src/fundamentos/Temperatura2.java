//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

package fundamentos;

import java.util.Scanner;

public class Temperatura2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.printf("A temperatura em Fahrenheit é %.1f ", fahrenheit);
		
		scan.close();
	}
}
