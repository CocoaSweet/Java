package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa guilherme = new Pessoa(77.5);
		Macarrao pratoPrincipal = new Macarrao(0.6);
		Frango proteina = new Frango(0.5);
		Bolo sobremesa = new Bolo(0.12);
		
		System.out.println(guilherme.getPeso());
		guilherme.comer(pratoPrincipal);
		System.out.println(guilherme.getPeso());
		guilherme.comer(proteina);
		System.out.println(guilherme.getPeso());
		guilherme.comer(sobremesa);
		System.out.println(guilherme.getPeso());
	}
}
