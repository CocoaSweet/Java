package oo.desafio.herança;

public class Dirigir {
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Carro ferrari = new Ferrari();
		
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
