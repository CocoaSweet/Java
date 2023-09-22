package oo.desafio.herança;

import oo.desafio.teste.Carro;

public class Dirigir {
	public static void main(String[] args) {
		
		Civic civic = new Civic(180);
		Carro ferrari = new Ferrari(320);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
	}
}
