package oo.desafio.herança;

public class Carro {
	
	int velocidade = 0;
	
	void acelerar() {
		velocidade += 5;
	}
	
	void frear() {
		if (velocidade >= 5) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}	
	}
	
	public String toString() {
		return "Velocidade atual: " + velocidade + "Km/h";
	}
}
