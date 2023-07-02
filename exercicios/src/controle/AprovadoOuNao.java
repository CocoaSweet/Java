package controle;

import java.util.Scanner;

public class AprovadoOuNao {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double media = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite a nota: ");
			double nota = scan.nextDouble();
			media += nota;
		}
		media /= 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado.");
		} else if (media >= 4.0) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Reprovado.");
		}
		
		scan.close();
	}
}
