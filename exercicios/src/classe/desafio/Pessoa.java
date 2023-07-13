package classe.desafio;

public class Pessoa {

	String nome;
	Double peso;
	
	Pessoa() {
		
	}

	Pessoa(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
		this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return (nome + "\nPeso atual: " + this.peso);
	}
	
}
