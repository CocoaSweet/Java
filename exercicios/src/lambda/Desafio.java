package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("IPad", 3235.89, 0.13);
		
		Function<Produto, Double> valorProduto = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? (preco * (1 + 0.085)) : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, String> formatar = preco -> String.format("R$%.2f", preco).replace(".", ",");
		
		System.out.println("Preço final: " + valorProduto.andThen(imposto).andThen(frete).andThen(formatar).apply(p));
		
		/*
		 * 1 - A partir do produto calcular preço real (com desconto) 
		 * 2 - Imposto Municipal: >= 2500 (8,5%) // < 2500 (Isento)
		 * 3 - Frete: >= 3000 (100) // < 3000 (50)
		 * 4 - Arredondar: deixar duas casas decimais
		 * 5 - Formatar: R$xxxx,xx
		 */
	}
}
