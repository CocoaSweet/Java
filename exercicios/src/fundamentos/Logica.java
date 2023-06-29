package fundamentos;

import java.util.Scanner;

public class Logica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o operador (+, -, *, /, %): ");
		String operador = scan.next();
		
		double resultado = operador.intern() == "+" ? num1 + num2 : 0;
		resultado = operador.intern() == "*" ? num1 * num2 : resultado;
		resultado = operador.intern() == "-" ? num1 - num2 : resultado;
		resultado = operador.intern() == "/" ? num1/num2 : resultado;
		resultado = operador.intern() == "%" ? num1 % num2 : resultado;
		
		System.out.printf("O resultado de %.2f %s %.2f é %.2f", num1, operador, num2, resultado);
		
		scan.close();
	}
}
