package controle;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = scan.next();
		
		dia = dia.toLowerCase();
		
		if(dia.intern() == "domingo") {
			System.out.println(1);
		}else if(dia.intern() == "segunda") {
			System.out.println(2);
		}else if(dia.intern() == "terça") {
			System.out.println(3);
		}else if(dia.intern() == "quarta") {
			System.out.println(4);
		}else if(dia.intern() == "quinta") {
			System.out.println(5);
		}else if(dia.intern() == "sexta") {
			System.out.println(6);
		}else {
			System.out.println(7);
		}
		
		scan.close();
	}
}
