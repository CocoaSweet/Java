package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
//		String salario1 = JOptionPane.showInputDialog("Digite o primeiro Salário");
//		String salario2 = JOptionPane.showInputDialog("Digite o segundo Salário");
//		String salario3 = JOptionPane.showInputDialog("Digite o terceiro Salário");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String salario1 = scan.nextLine().replace("," , ".");
		
		System.out.print("Informe o segundo salário: ");
		String salario2 = scan.nextLine().replace("," , ".");
		
		System.out.print("Informe o terceiro salário: ");
		String salario3 = scan.nextLine().replace("," , ".");
				
		Double valor1 = Double.parseDouble(salario1);
		Double valor2 = Double.parseDouble(salario2);
		Double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1+valor2+valor3)/3;
		
		System.out.printf("A média dos salários é %.2f", media);
		
		scan.close();
		
	}

}
