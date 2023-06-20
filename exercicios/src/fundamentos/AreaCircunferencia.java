package fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		final double pi = Math.PI;
		int raio = scan.nextInt();
		System.out.println(pi * Math.pow(raio, 2));
	}
}
