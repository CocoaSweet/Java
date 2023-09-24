package oo.desafio.teste;

public class Carro {
	

	protected final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	private int delta = 5;
	
	public Carro(int maximo){
		VELOCIDADE_MAXIMA = maximo;
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	public void acelerar() {
		if(velocidade + getDelta() <= VELOCIDADE_MAXIMA){
			velocidade += getDelta();
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
