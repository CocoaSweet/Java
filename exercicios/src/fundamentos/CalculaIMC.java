//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
package fundamentos;

import java.util.Scanner;

public class CalculaIMC {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso em Kg: ");
		double peso = scan.nextDouble();
		
		System.out.println("Digite a altura em metros: ");
		double altura = scan.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		String classifica = imc >= 40.0 ? "Obesidade grau 3" : "";
		classifica = imc >= 35 && imc < 40 ? "Obesidade grau 2" : classifica;
		classifica = imc >= 30 && imc < 35 ? "Obesidade grau 1" : classifica;
		classifica = imc >= 25 && imc < 30 ? "Acima do peso" : classifica;
		classifica = imc >= 18.5 && imc < 25 ? "Peso normal" : classifica;
		classifica = imc >= 17 && imc < 18.5 ? "Abaixo do peso" : classifica;
		classifica = imc < 17 ? "Muito abaixo do peso" : classifica;
		
		System.out.printf("O IMC é %.1f. %s.", imc, classifica);
		
		scan.close();
	}
}
