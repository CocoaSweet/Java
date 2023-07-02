/*
 * Jogo da adivinhação: Tentar adivinhar um número 
 * entre 0 - 100. Armazene um numero aleatório em uma variável. 
 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
 * Ao final de cada tentativa, imprima a quantidade 
 * de tentativas restantes, e imprima se o número inserido 
 * é maior ou menor do que o número armazenado.
 */
package controle;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int numeroAleatorio = rand.nextInt(100);
		
		for(int i = 0; i < 10; i++) {
			int tentativas = 10;
			System.out.println("Tente adivinhar o número: ");
			int numero = scan.nextInt();
			if(numero == numeroAleatorio) {
				System.out.printf("Parabéns, você acertou! O número era %d.", numeroAleatorio);
				break;
			}
			tentativas--;
			if(numero > numeroAleatorio) {
				System.out.println("O número inserido é maior que o número aleatório.");
			} else {
				System.out.println("O número inserido é menor que o número aleatório.");
			}
			System.out.printf("Você ainda tem %d tentativas.\n", tentativas);
		}
		
		scan.close();
	}
}
