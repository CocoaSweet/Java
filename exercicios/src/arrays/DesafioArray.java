package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double media = 0;
		int contador = 1;
		
		System.out.print("Digite a quantidade de notas: ");
		int quantidade = scan.nextInt();
		
		double[] notas = new double[quantidade];
		
		for(double nota: notas) {
			System.out.printf("\nDigite a nota %d: ", contador);
			nota = scan.nextDouble();
			media += nota;
			contador++;
		}
		System.out.println("Média final: " + (media/notas.length));
		
		scan.close();
	}
}
