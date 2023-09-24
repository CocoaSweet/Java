package oo.desafio.herança;

import oo.desafio.teste.Carro;

public class Dirigir {
	public static void main(String[] args) {
		
		Carro civic = new Civic(180);
		Ferrari ferrari = new Ferrari(320);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);
		
		System.out.println(ferrari.nivelAr());
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
	}
}
