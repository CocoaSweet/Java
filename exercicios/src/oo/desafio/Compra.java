package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(quantidade, produto));
	}
	
	void adicionarItem(String produto, double preco, int quantidade) {
		this.itens.add(new Item(quantidade, new Produto(produto, preco)));
	}
	
	double valorCompra() {
		double valor = 0;
		for(Item item: itens) {
			valor += item.calcularValorProduto();
		}
		return valor;
	}
}
