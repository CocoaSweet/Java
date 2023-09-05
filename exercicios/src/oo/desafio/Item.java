package oo.desafio;

public class Item {
	
	final Integer quantidade;
	final Produto produto;

	public Item(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}


	public Double calcularValorProduto() {
		double total = quantidade * produto.valor;
		return total;
	}
	
	
}
