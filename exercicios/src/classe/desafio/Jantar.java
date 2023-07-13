package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Guilherme", 77.0);
		Comida c1 = new Comida("Pizza", 0.5);
		Comida c2 = new Comida("Batata", 0.7);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());	}
}
