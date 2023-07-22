package oo.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Guilherme Ribeiro");
		
		Compra barbie = new Compra();
		barbie.adicionarItem("Ingresso meia", 22.0 , 1);
		barbie.adicionarItem("Ingresso inteira", 44.0 , 1);
		
		Compra oppenheimer = new Compra();
		oppenheimer.adicionarItem("Ingresso meia", 22.0 , 1);
		oppenheimer.adicionarItem("Ingresso inteira", 44.0 , 1);
		
		cliente.compras.add(oppenheimer);
		cliente.compras.add(barbie);
		
		System.out.println(cliente.obterValorTotal());
	}
}
