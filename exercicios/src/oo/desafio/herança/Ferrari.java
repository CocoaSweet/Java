package oo.desafio.herança;

import oo.desafio.teste.Carro;

public class Ferrari extends Carro {

	Ferrari(int maximo){
		super(maximo);
		delta = 15;
	}
	
//	@Override
//	void acelerar() {
//		velocidade += 15;
//	}
	
}
