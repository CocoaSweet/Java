package controle;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = scan.nextInt();
		String conceito = "";
		
		switch(nota) {
		case 10, 9, 8:
			conceito = "Plenamente satisfatório";
			break;
		case 7, 6:
			conceito = "Satisfatório";
			break;
		case 5, 4, 3, 2, 1, 0:
			conceito = "Não satisfatório";
			break;
		default:
			conceito = "Não informado";
		}
		
		System.out.printf("Conceito: %s", conceito);
		
		scan.close();
	}
}
