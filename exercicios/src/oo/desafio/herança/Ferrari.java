package oo.desafio.herança;

import oo.desafio.teste.Carro;

public class Ferrari extends Carro implements Esportivo, Luxo {

	boolean ligarTurbo;
	boolean ligarAr;
	Ferrari(int maximo){
		super(maximo);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {		
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
//	@Override
//	void acelerar() {
//		velocidade += 15;
//	}
	
}
