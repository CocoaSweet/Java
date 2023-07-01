package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double media = 0;
		int contador = 0;
		
		System.out.println("Digite a nota: ");
		double nota = scan.nextDouble();
		
		while(nota != -1) {
			System.out.println("Digite a nota ou -1 para sair: ");
			nota = scan.nextDouble();
			if(nota >= 0 && nota <= 10) {
				contador++;
				media += nota;
			} else if (nota != -1) {
				System.out.println("Nota inválida.");
			}
		}
		
		media /= contador;
		
		System.out.printf("A média é %.2f", media);
		
		scan.close();
	}
}
