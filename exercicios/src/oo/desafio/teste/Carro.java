package oo.desafio.teste;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	protected int delta = 5;
	
	public Carro(int maximo){
		VELOCIDADE_MAXIMA = maximo;
	}
	
	public void acelerar() {
		if(velocidade + delta <= VELOCIDADE_MAXIMA){
			velocidade += delta;
		} else{
			velocidade = VELOCIDADE_MAXIMA;
		}
		
	}
	
	public void frear() {
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
