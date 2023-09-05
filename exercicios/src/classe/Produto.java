package classe;

public class Produto {

	String nome;
	double valor;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	Produto(String nomeEntrada, double valorEntrada){
		nome = nomeEntrada;
		valor = valorEntrada;
	}
	double valorFinal() {
		return valor * (1 - desconto);
	}
	
	
}
