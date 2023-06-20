package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		final int DIFERENCA = 32;
		final double FATOR = 5/9.0;
		
		int fahrenheit = scan.nextInt();
		double celsius = (fahrenheit - DIFERENCA) * FATOR;
		
		System.out.println(String.format("%.2f", celsius) + "ºC");
	}
}
