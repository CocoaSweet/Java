//Criar um programa que leia um valor e apresente os resultados
//ao quadrado e ao cubo do valor.
package fundamentos;

import javax.swing.JOptionPane;

public class Potencia {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o valor: ");
		
		Double numero = Double.parseDouble(valor);
		
		System.out.println("Valor ao quadrado " + Math.pow(numero, 2));
		System.out.println("Valor ao cubo " + Math.pow(numero, 3));
				

	}
}
