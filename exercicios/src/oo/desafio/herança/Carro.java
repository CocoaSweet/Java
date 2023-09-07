package oo.desafio.herança;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	int delta = 5;
	
	Carro(int maximo){
		VELOCIDADE_MAXIMA = maximo;
	}
	
	void acelerar() {
		if(velocidade + delta <= VELOCIDADE_MAXIMA){
			velocidade += delta;
		} else{
			velocidade = VELOCIDADE_MAXIMA;
		}
		
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
