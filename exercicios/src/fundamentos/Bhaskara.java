package fundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) + 4 * a * c;
		
		System.out.printf("Delta: %.0f \n", delta);
		
		double r1 = (-b + Math.sqrt(delta))/(2 * a);
		double r2 = (-b - Math.sqrt(delta))/(2 * a);
		
		String resultado = delta < 0 ? "Não existem raízes" : "As raízes "
				+ "são " + String.format("%.2f", r1) +" e " + String.format("%.2f", r2) ;
		
		System.out.println(resultado);
		
		scan.close();
	}
}
