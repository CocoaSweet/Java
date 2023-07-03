package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto mercadoria = new Produto();
		
		mercadoria.nome = "Sapato";
		mercadoria.valor = 70.00;
		mercadoria.desconto = 0.15;
		
		System.out.printf("Produto: %s", mercadoria.nome);
		System.out.printf("\nDesconto: R$%.2f", (mercadoria.valor * mercadoria.desconto));
		System.out.printf("\nPreço final: R$%.2f", (mercadoria.valor * (1 - mercadoria.desconto)));
	}
}
